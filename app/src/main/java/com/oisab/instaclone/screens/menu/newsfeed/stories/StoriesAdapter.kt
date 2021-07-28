package com.oisab.instaclone.screens.menu.newsfeed.stories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R

class StoriesAdapter: RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder>() {
    private val storiesItemItems: MutableList<CellStoriesItem> = ArrayList()

    fun setData(newStoriesItemItems: MutableList<CellStoriesItem>) {
        storiesItemItems.clear()
        storiesItemItems.addAll(newStoriesItemItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return StoriesViewHolder(inflater.inflate(R.layout.cell_stories_item, parent, false))
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        holder.bind(storiesItemItems[position])
    }

    override fun getItemCount(): Int = storiesItemItems.size

    class StoriesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(cellStoriesItem: CellStoriesItem) {
            val storiesIcon = itemView.findViewById<AppCompatImageView>(R.id.storiesIconImage)
            val userAccountId = itemView.findViewById<AppCompatTextView>(R.id.userAccountId)

            storiesIcon.setImageResource(cellStoriesItem.storiesIcon)
            userAccountId.text = cellStoriesItem.userAccountId
        }
    }
}