package com.oisab.instaclone.screens.menu.suggestions.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.suggestions.cells.CellSuggestedPost

class SuggestedPostsListAdapter : RecyclerView.Adapter<SuggestedPostsListAdapter.SuggestedPostViewHolder>() {
    private val suggestedPosts: MutableList<CellSuggestedPost> = ArrayList()

    fun setData(newSuggestedPosts: MutableList<CellSuggestedPost>) {
        suggestedPosts.clear()
        suggestedPosts.addAll(newSuggestedPosts)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestedPostViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return SuggestedPostViewHolder(inflater.inflate(R.layout.cell_suggested_item, parent, false))
    }

    override fun onBindViewHolder(holder: SuggestedPostViewHolder, position: Int) {
        holder.bind(suggestedPosts[position])
    }

    override fun getItemCount(): Int = suggestedPosts.size

    class SuggestedPostViewHolder(itemView: View) : SuggestedAdapter.BaseSuggestedViewHolder<CellSuggestedPost>(itemView) {
        override fun bind(item: CellSuggestedPost) {
            val suggestedPostImage: AppCompatImageView = itemView.findViewById(R.id.suggestedPostItem)
            suggestedPostImage.setImageResource(item.suggestedImage)
        }
    }
}