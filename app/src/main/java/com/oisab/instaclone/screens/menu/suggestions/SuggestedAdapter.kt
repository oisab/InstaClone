package com.oisab.instaclone.screens.menu.suggestions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.oisab.instaclone.R
import java.lang.IllegalArgumentException

class SuggestedAdapter : RecyclerView.Adapter<SuggestedAdapter.BaseSuggestedViewHolder<*>>(){
    private val suggestedItems: MutableList<BaseSuggestedCell> = ArrayList()

    companion object {
        const val SEARCH = 1
        const val POSTS = 2
    }

    fun setData(newSuggestedCell: MutableList<BaseSuggestedCell>) {
        suggestedItems.clear()
        suggestedItems.addAll(newSuggestedCell)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): BaseSuggestedViewHolder<*> {
        val inflater = LayoutInflater.from(parent.context)
        return when(viewType) {
            SEARCH -> SearchViewViewHolder(inflater.inflate(R.layout.cell_suggested_search, parent, false))
            POSTS -> SuggestedPostsListViewHolder(inflater.inflate(R.layout.cell_suggested_search, parent, false))
            else -> throw IllegalArgumentException("Error creating viewHolder. Invalid viewHolder type")
        }
    }

    override fun onBindViewHolder(holder: BaseSuggestedViewHolder<*>, position: Int) {
        when(holder) {
            is SearchViewViewHolder -> holder.bind(suggestedItems[position] as CellSuggestedSearchView)
            is SuggestedPostsListViewHolder -> holder.bind(suggestedItems[position] as CellSuggestedPostsList)
            else -> throw IllegalArgumentException("Error binding viewHolder. Invalid viewHolder type")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(suggestedItems[position]) {
            is CellSuggestedSearchView -> SEARCH
            is CellSuggestedPostsList -> POSTS
            else -> throw IllegalArgumentException("Invalid type of item $position")
        }
    }

    override fun getItemCount(): Int = suggestedItems.size

    abstract class BaseSuggestedViewHolder<T>(itemView: View): RecyclerView.ViewHolder(itemView) {
        abstract fun bind(item: T)
    }

    class SearchViewViewHolder(itemView: View) : BaseSuggestedViewHolder<CellSuggestedSearchView>(itemView) {
        override fun bind(item: CellSuggestedSearchView) {
            val searchView = itemView.findViewById<androidx.appcompat.widget.SearchView>(R.id.suggestionsSearchView)
            searchView.setQuery(item.text, true)
        }
    }

    class SuggestedPostsListViewHolder(itemView: View) : BaseSuggestedViewHolder<CellSuggestedPostsList>(itemView) {
        override fun bind(item: CellSuggestedPostsList) {
            val suggestedListAdapter = SuggestedPostsListAdapter()
            val suggestedPostsRecyclerView : RecyclerView = itemView.findViewById(R.id.suggestedPostsRecyclerView)

            suggestedPostsRecyclerView.adapter = suggestedListAdapter
            suggestedPostsRecyclerView.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS)
            suggestedListAdapter.setData(item.suggestedPostsList)
        }
    }
}