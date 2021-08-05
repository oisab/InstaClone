package com.oisab.instaclone.screens.menu.suggestions

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.suggestions.adapters.SuggestedAdapter

class SuggestionsFragment: Fragment(R.layout.fragment_suggestions) {
    private val suggestedAdapter = SuggestedAdapter()
    private lateinit var suggestedViewModel: SuggestionsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        suggestedViewModel = ViewModelProvider(this).get(SuggestionsViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val suggestionsRecyclerView: RecyclerView = view.findViewById(R.id.suggestionsRecyclerView)
        suggestionsRecyclerView.adapter = suggestedAdapter
        suggestionsRecyclerView.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)

        suggestedViewModel.generateSuggestions()
        suggestedViewModel.suggestedItems.observe(viewLifecycleOwner, {
            suggestedAdapter.setData(it)
        })
    }
}