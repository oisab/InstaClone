package com.oisab.instaclone.screens.menu.notifications

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R

class NotificationsFragment: Fragment(R.layout.fragment_notifications) {
    private lateinit var notificationsViewModel: NotificationsViewModel
    private val notificationsAdapter = NotificationsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        notificationsViewModel = ViewModelProvider(this).get(NotificationsViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val notificationsRecyclerView: RecyclerView = view.findViewById(R.id.notificationsRecyclerView)
        notificationsRecyclerView.adapter = notificationsAdapter
        notificationsRecyclerView.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)

        notificationsViewModel.generateNotifications()
        notificationsViewModel.notificationsData.observe(viewLifecycleOwner, {
            notificationsAdapter.setData(it)
        })
    }
}