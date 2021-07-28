package com.oisab.instaclone.screens.menu.newsfeed.posts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.newsfeed.BaseNewsFeedCell
import com.oisab.instaclone.screens.menu.newsfeed.stories.StoriesAdapter
import java.lang.IllegalArgumentException

class PostsAdapter : RecyclerView.Adapter<PostsAdapter.BaseViewHolder<*>>() {
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
            is PostViewHolder -> holder.bind(element as NewsFeedCellPost)
            is StoriesViewHolder -> holder.bind(element as NewsFeedCellStories)
            else -> throw IllegalArgumentException("Error binding viewHolder. Invalid viewHolder type")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(postItems[position]) {
            is NewsFeedCellStories -> STORIES
            is NewsFeedCellPost -> POSTS
            else -> throw IllegalArgumentException("Invalid type of item $position")
        }
    }

    override fun getItemCount(): Int = postItems.size

    abstract class BaseViewHolder<T>(itemView: View): RecyclerView.ViewHolder(itemView) {
        abstract fun bind(item: T)
    }

    class PostViewHolder(itemView: View) : BaseViewHolder<NewsFeedCellPost>(itemView) {
        override fun bind(item: NewsFeedCellPost) {
            val postImagesAdapter = PostImagesAdapter()
            val postText: AppCompatTextView = itemView.findViewById(R.id.postText)
            val imagesRecyclerView = itemView.findViewById<RecyclerView>(R.id.postImagesRecyclerView)
            imagesRecyclerView.adapter = postImagesAdapter
            imagesRecyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)

            postImagesAdapter.setData(item.postImages)
            postText.text = item.postText
        }
    }

    class StoriesViewHolder(itemView: View): BaseViewHolder<NewsFeedCellStories>(itemView) {
        override fun bind(item: NewsFeedCellStories) {
            val storiesAdapter = StoriesAdapter()
            val storiesRecyclerView = itemView.findViewById<RecyclerView>(R.id.storiesRecyclerView)

            storiesRecyclerView.adapter = storiesAdapter
            storiesRecyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            storiesAdapter.setData(item.storiesItems)
        }
    }
}