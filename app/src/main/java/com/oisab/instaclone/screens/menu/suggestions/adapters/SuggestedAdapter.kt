package com.oisab.instaclone.screens.menu.suggestions.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.suggestions.cells.CellSuggestedSearchView
import com.oisab.instaclone.screens.menu.suggestions.cells.BaseSuggestedCell
import com.oisab.instaclone.screens.menu.suggestions.cells.CellSuggestedPostsList
import java.lang.IllegalArgumentException

class SuggestedAdapter : RecyclerView.Adapter<SuggestedAdapter.BaseSuggestedViewHolder<*>>(){
    private val suggestedItems: MutableList<BaseSuggestedCell> = ArrayList()

    companion object {
        const val SEARCH = 1
        const val POSTS = 2
    }

    fun setData(newSuggestedItems: MutableList<BaseSuggestedCell>) {
        suggestedItems.clear()
        suggestedItems.addAll(newSuggestedItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseSuggestedViewHolder<*> {
        val inflater = LayoutInflater.from(parent.context)
        return when(viewType) {
            SEARCH -> SearchViewViewHolder(inflater.inflate(R.layout.cell_suggested_search, parent, false))
            POSTS -> SuggestedPostsListViewHolder(inflater.inflate(R.layout.cell_suggested_posts_list, parent, false))
            else -> throw IllegalArgumentException("Error creating viewHolder. Invalid viewHolder type")
        }
    }

    override fun onBindViewHolder(holder: BaseSuggestedViewHolder<*>, position: Int) {
        val element = suggestedItems[position]
        when(holder) {
            is SearchViewViewHolder -> holder.bind(element as CellSuggestedSearchView)
            is SuggestedPostsListViewHolder -> holder.bind(element as CellSuggestedPostsList)
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
            val suggestedPostsRecyclerView: RecyclerView = itemView.findViewById(R.id.suggestedPostsRecyclerView)
            val suggestedPostsAdapter = SuggestedPostsListAdapter()

            suggestedPostsRecyclerView.adapter = suggestedPostsAdapter
            suggestedPostsRecyclerView.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
            suggestedPostsAdapter.setData(item.suggestedPostsList)
        }
    }
}