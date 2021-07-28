package com.oisab.instaclone.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.oisab.instaclone.R

class MenuContainerFragment: Fragment(R.layout.fragment_menu_container) {
    private lateinit var bottomNavigation: BottomNavigationView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        bottomNavigation = requireView().findViewById(R.id.navigationMenu)
        bottomNavigation.setOnItemSelectedListener { item ->
            val result = when (item.itemId) {
                R.id.newsFeedMenuItem -> R.navigation.news_feed_navigation_grph
                R.id.suggestionsMenuItem -> R.navigation.suggestions_navigation_graph
                R.id.newPostMenuItem -> R.navigation.new_post_navigation_graph
                R.id.notificationsMenuItem -> R.navigation.notifications_navigation_graph
                R.id.accountMenuItem -> R.navigation.account_navigation_graph
                else -> R.navigation.menu_navigation_graph
            }
            val navHostFragment = NavHostFragment.create(result)
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.menuFragmentNavHost, navHostFragment)
                ?.commitNow()
            true
        }
        bottomNavigation.selectedItemId = R.id.newsFeedMenuItem
    }
}