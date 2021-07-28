package com.oisab.instaclone.screens.menu.newsfeed.posts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R

class PostImagesAdapter : RecyclerView.Adapter<PostImagesAdapter.PostImageViewHolder>() {
    private val postImages: MutableList<Int> = ArrayList()

    fun setData(newPostImages: MutableList<Int>) {
        postImages.clear()
        postImages.addAll(newPostImages)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostImageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PostImageViewHolder(inflater.inflate(R.layout.cell_news_post_image, parent, false))
    }

    override fun onBindViewHolder(holder: PostImageViewHolder, position: Int) {
        holder.bind(postImages[position])
    }

    override fun getItemCount(): Int = postImages.size

    class PostImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(cellPostImage: Int) {
            val postImage = itemView.findViewById<AppCompatImageView>(R.id.newsPostImage)
            postImage.setImageResource(cellPostImage)
        }
    }
}