package com.oisab.instaclone.screens.menu.account.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.account.cells.BaseAccountCell
import com.oisab.instaclone.screens.menu.account.cells.CellAccountInfo
import com.oisab.instaclone.screens.menu.account.cells.CellAccountPostsList
import java.lang.IllegalArgumentException

class AccountAdapter : RecyclerView.Adapter<AccountAdapter.BaseAccountViewHolder<*>>() {
    private val accountItems: MutableList<BaseAccountCell> = ArrayList()

    companion object {
        const val ACCOUNT_INFO = 1
        const val ACCOUNT_POSTS_LIST = 2
    }

    fun setData(newAccountItems: MutableList<BaseAccountCell>) {
        accountItems.clear()
        accountItems.addAll(newAccountItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseAccountViewHolder<*> {
        val inflater = LayoutInflater.from(parent.context)
        return when(viewType) {
            ACCOUNT_INFO -> AccountInfoViewHolder(inflater.inflate(R.layout.cell_account_info, parent, false))
            ACCOUNT_POSTS_LIST -> AccountPostListViewHolder(inflater.inflate(R.layout.cell_account_posts_list, parent, false))
            else -> throw IllegalArgumentException("Error creating viewHolder. Invalid viewHolder type.")
        }
    }

    override fun onBindViewHolder(holder: BaseAccountViewHolder<*>, position: Int) {
        val element = accountItems[position]
        when(holder) {
            is AccountInfoViewHolder -> holder.bind(element as CellAccountInfo)
            is AccountPostListViewHolder -> holder.bind(element as CellAccountPostsList)
            else -> throw IllegalArgumentException("Error binding viewHolder. Invalid viewHolder type")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(accountItems[position]) {
            is CellAccountInfo -> ACCOUNT_INFO
            is CellAccountPostsList -> ACCOUNT_POSTS_LIST
            else -> throw IllegalArgumentException("Invalid type of item $position")
        }
    }

    override fun getItemCount(): Int = accountItems.size

    abstract class BaseAccountViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
        abstract fun bind(item: T)
    }

    class AccountInfoViewHolder(itemView: View) : BaseAccountViewHolder<CellAccountInfo>(itemView) {
        override fun bind(item: CellAccountInfo) {
            val accountIcon: AppCompatImageView = itemView.findViewById(R.id.accountIcon)
            val postsQuantity: AppCompatTextView = itemView.findViewById(R.id.postsQuantity)
            val followersQuantity: AppCompatTextView = itemView.findViewById(R.id.followersQuantity)
            val followsQuantity: AppCompatTextView = itemView.findViewById(R.id.followsQuantity)

            accountIcon.setImageResource(item.accountIcon)
            postsQuantity.append(item.postsQuantity)
            followersQuantity.append(item.followersQuantity)
            followsQuantity.append(item.followsQuantity)
        }
    }

    class AccountPostListViewHolder(itemView: View): BaseAccountViewHolder<CellAccountPostsList>(itemView) {
        override fun bind(item: CellAccountPostsList) {
            val accountPostsRecyclerView: RecyclerView = itemView.findViewById(R.id.accountPostsRecyclerView)
            val accountPostsAdapter = AccountPostsListAdapter()

            accountPostsRecyclerView.adapter = accountPostsAdapter
            accountPostsRecyclerView.layoutManager = GridLayoutManager(itemView.context, 3)
            accountPostsAdapter.setData(item.accountPosts)
        }
    }
}