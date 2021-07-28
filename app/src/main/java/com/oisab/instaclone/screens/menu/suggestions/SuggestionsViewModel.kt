package com.oisab.instaclone.screens.menu.suggestions

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oisab.instaclone.R

class SuggestionsViewModel : ViewModel() {
    val suggestedItems = MutableLiveData<MutableList<BaseSuggestedCell>>()

    fun generateSuggestions() {
        suggestedItems.postValue(ArrayList<BaseSuggestedCell>().apply {
            add(CellSuggestedSearchView(""))
            add(CellSuggestedPostsList(ArrayList<CellSuggestedPostItem>().apply {
                CellSuggestedPostItem(R.drawable.ic_launcher_foreground)
                CellSuggestedPostItem(R.drawable.ic_launcher_foreground)
                CellSuggestedPostItem(R.drawable.ic_launcher_foreground)
                CellSuggestedPostItem(R.drawable.ic_launcher_foreground)
                CellSuggestedPostItem(R.drawable.suggested_item)
                CellSuggestedPostItem(R.drawable.ic_launcher_foreground)
                CellSuggestedPostItem(R.drawable.ic_launcher_foreground)
                CellSuggestedPostItem(R.drawable.ic_launcher_foreground)
                CellSuggestedPostItem(R.drawable.ic_launcher_foreground)
            }))
        })
    }
}