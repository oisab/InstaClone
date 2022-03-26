package com.oisab.instaclone.screens.menu.newsfeed

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.newsfeed.posts.CellNewsFeedPost
import com.oisab.instaclone.screens.menu.newsfeed.posts.NewsPostsAdapter

class NewsFeedFragment: Fragment(R.layout.fragment_news_feed), NewsPostsAdapter.OnItemClickListener {
    private val postAdapter = NewsPostsAdapter(this)
    private lateinit var newsFeedViewModel: NewsFeedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        newsFeedViewModel = ViewModelProvider(this).get(NewsFeedViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val postsRecyclerView: RecyclerView = view.findViewById(R.id.postsRecyclerView)
        postsRecyclerView.adapter = postAdapter
        postsRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        newsFeedViewModel.generateStories()
        newsFeedViewModel.generatePosts()

        newsFeedViewModel.posts.observe(viewLifecycleOwner, {
            postAdapter.setData(it)
        })
    }

    override fun onItemClick(position: Int) {
        val clickedItem = newsFeedViewModel.posts.value?.get(position) as CellNewsFeedPost
        clickedItem.isLiked = true
    }
}