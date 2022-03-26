package com.oisab.instaclone.screens.menu.suggestions

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.suggestions.cells.BaseSuggestedCell
import com.oisab.instaclone.screens.menu.suggestions.cells.CellSuggestedPost
import com.oisab.instaclone.screens.menu.suggestions.cells.CellSuggestedPostsList
import com.oisab.instaclone.screens.menu.suggestions.cells.CellSuggestedSearchView

class SuggestionsViewModel : ViewModel() {
    val suggestedItems = MutableLiveData<MutableList<BaseSuggestedCell>>()

    fun generateSuggestions() {
        suggestedItems.postValue(ArrayList<BaseSuggestedCell>().apply {
            add(CellSuggestedSearchView(""))
            add(CellSuggestedPostsList(ArrayList<CellSuggestedPost>().apply {
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.image1))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
                add(CellSuggestedPost(R.drawable.ic_launcher_background))
            }))
        })
    }
}