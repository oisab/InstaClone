package com.oisab.instaclone.screens.menu.suggestions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R

class SuggestedPostsListAdapter : RecyclerView.Adapter<SuggestedPostsListAdapter.SuggestedPostItemViewHolder>() {
    private val suggestedPostsItems: MutableList<CellSuggestedPostItem> = ArrayList()

    fun setData(newSuggestedPostsItems: MutableList<CellSuggestedPostItem>) {
        suggestedPostsItems.clear()
        suggestedPostsItems.addAll(newSuggestedPostsItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestedPostItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return SuggestedPostItemViewHolder(inflater.inflate(R.layout.cell_suggested_item, parent, false))
    }

    override fun onBindViewHolder(holder: SuggestedPostItemViewHolder, position: Int) {
        holder.bind(suggestedPostsItems[position])
    }

    override fun getItemCount(): Int = suggestedPostsItems.size

    class SuggestedPostItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: CellSuggestedPostItem) {
            val suggestedPostItem: AppCompatImageView = itemView.findViewById(R.id.suggestedPostItem)
            suggestedPostItem.setImageResource(item.suggestionImage)
        }
    }
}