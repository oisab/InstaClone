package com.oisab.instaclone.screens.menu.account.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.account.cells.CellAccountPost

class AccountPostsListAdapter: RecyclerView.Adapter<AccountPostsListAdapter.AccountPostViewHolder>() {
    private val accountPosts: MutableList<CellAccountPost> = ArrayList()

    fun setData(newAccountPosts: MutableList<CellAccountPost>) {
        accountPosts.clear()
        accountPosts.addAll(newAccountPosts)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountPostViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return AccountPostViewHolder(inflater.inflate(R.layout.cell_account_post_item, parent, false))
    }

    override fun onBindViewHolder(holder: AccountPostViewHolder, position: Int) {
        holder.bind(accountPosts[position])
    }

    override fun getItemCount(): Int = accountPosts.size

    class AccountPostViewHolder(itemView: View) : AccountAdapter.BaseAccountViewHolder<CellAccountPost>(itemView) {
        override fun bind(item: CellAccountPost) {
            val postImage: AppCompatImageView = itemView.findViewById(R.id.accountPostImage)
            postImage.setImageResource(item.postImages)
        }
    }
}