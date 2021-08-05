package com.oisab.instaclone.screens.menu.newsfeed.posts

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.newsfeed.BaseNewsFeedCell
import com.oisab.instaclone.screens.menu.newsfeed.stories.StoriesAdapter
import de.hdodenhof.circleimageview.CircleImageView
import java.lang.IllegalArgumentException

class NewsPostsAdapter(private val listener: OnItemClickListener) : RecyclerView.Adapter<NewsPostsAdapter.BaseViewHolder<*>>() {
    private val postItems: MutableList<BaseNewsFeedCell> = ArrayList()

    companion object {
        private const val STORIES = 1
        private const val POSTS = 2
    }

    fun setData(newItems: MutableList<BaseNewsFeedCell>) {
        postItems.clear()
        postItems.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val inflater = LayoutInflater.from(parent.context)
        return when(viewType) {
            STORIES -> StoriesViewHolder(inflater.inflate(R.layout.cell_stories_holder, parent, false))
            POSTS -> PostViewHolder(inflater.inflate(R.layout.cell_news_posts_list, parent, false))
            else -> throw IllegalArgumentException("Error creating viewHolder. Invalid viewHolder type")
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        val element = postItems[position]
        when(holder) {
            is PostViewHolder -> holder.bind(element as CellNewsFeedPost)
            is StoriesViewHolder -> holder.bind(element as CellNewsFeedStories)
            else -> throw IllegalArgumentException("Error binding viewHolder. Invalid viewHolder type")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(postItems[position]) {
            is CellNewsFeedStories -> STORIES
            is CellNewsFeedPost -> POSTS
            else -> throw IllegalArgumentException("Invalid type of item $position")
        }
    }

    override fun getItemCount(): Int = postItems.size

    abstract class BaseViewHolder<T>(itemView: View): RecyclerView.ViewHolder(itemView) {
        abstract fun bind(item: T)
    }

    inner class PostViewHolder(itemView: View) : BaseViewHolder<CellNewsFeedPost>(itemView), View.OnClickListener {

        override fun bind(item: CellNewsFeedPost) {
            val postText: AppCompatTextView = itemView.findViewById(R.id.postText)
            val postOwnerIcon: CircleImageView = itemView.findViewById(R.id.newsPostOwnerIcon)
            val postOwnerName: AppCompatTextView = itemView.findViewById(R.id.newsPostOwnerName)
            val postLikesCount: AppCompatTextView = itemView.findViewById(R.id.postLikesCount)
            val postLikeIcon: AppCompatImageView = itemView.findViewById(R.id.postLikeIcon)
            postLikeIcon.setOnClickListener(this)

            if(item.isLiked) {
                postLikeIcon.setBackgroundColor(Color.rgb(255, 0, 0))
            }

            val imagesRecyclerView: RecyclerView = itemView.findViewById(R.id.postImagesRecyclerView)
            val postImagesAdapter = NewsPostImagesAdapter()
            imagesRecyclerView.adapter = postImagesAdapter
            imagesRecyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)

            postImagesAdapter.setData(item.postImages)
            postText.text = item.postText
            postOwnerIcon.setImageResource(item.postOwnerIcon)
            postOwnerName.text = item.postOwnerName
            postLikesCount.append(item.likesCount.toString())
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if(position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    class StoriesViewHolder(itemView: View): BaseViewHolder<CellNewsFeedStories>(itemView) {
        override fun bind(item: CellNewsFeedStories) {
            val storiesAdapter = StoriesAdapter()
            val storiesRecyclerView = itemView.findViewById<RecyclerView>(R.id.storiesRecyclerView)

            storiesRecyclerView.adapter = storiesAdapter
            storiesRecyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            storiesAdapter.setData(item.storiesItems)
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}