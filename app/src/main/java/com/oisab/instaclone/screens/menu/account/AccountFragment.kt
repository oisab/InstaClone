package com.oisab.instaclone.screens.menu.account

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.RelativeSizeSpan
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.account.adapters.AccountAdapter

class AccountFragment : Fragment(R.layout.fragment_account) {
    private val accountAdapter = AccountAdapter()
    private lateinit var accountViewModel: AccountViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        accountViewModel = ViewModelProvider(this).get(AccountViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val spanPostsQuantity = SpannableString("123")
        val spanFollowersQuantity = SpannableString("123")
        val spanFollowsQuantity = SpannableString("123")
        spanPostsQuantity.setSpan(RelativeSizeSpan(1.5f), 0,spanPostsQuantity.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spanFollowersQuantity.setSpan(RelativeSizeSpan(1.5f), 0,spanFollowersQuantity.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spanFollowsQuantity.setSpan(RelativeSizeSpan(1.5f), 0,spanFollowsQuantity.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        val accountRecyclerView : RecyclerView= view.findViewById(R.id.accountRecyclerView)
        accountRecyclerView.adapter = accountAdapter
        accountRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        accountViewModel.generateAccountData()
        accountViewModel.accountData.observe(viewLifecycleOwner, {
            accountAdapter.setData(it)
        })
    }
}