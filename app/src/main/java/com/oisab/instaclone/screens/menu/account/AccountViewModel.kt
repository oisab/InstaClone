package com.oisab.instaclone.screens.menu.account

import android.text.Spannable
import android.text.SpannableString
import android.text.style.RelativeSizeSpan
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.account.cells.BaseAccountCell
import com.oisab.instaclone.screens.menu.account.cells.CellAccountInfo
import com.oisab.instaclone.screens.menu.account.cells.CellAccountPost
import com.oisab.instaclone.screens.menu.account.cells.CellAccountPostsList

class AccountViewModel : ViewModel() {
    val accountData = MutableLiveData<MutableList<BaseAccountCell>>()

    fun generateAccountData() {
        val spanPostsQuantity = SpannableString("123")
        val spanFollowersQuantity = SpannableString("123")
        val spanFollowsQuantity = SpannableString("123")
        spanPostsQuantity.setSpan(RelativeSizeSpan(1.5f), 0,spanPostsQuantity.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spanFollowersQuantity.setSpan(RelativeSizeSpan(1.5f), 0,spanFollowersQuantity.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spanFollowsQuantity.setSpan(RelativeSizeSpan(1.5f), 0,spanFollowsQuantity.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        accountData.postValue(ArrayList<BaseAccountCell>().apply {
            add(
                CellAccountInfo(
                    R.drawable.image2,
                    spanPostsQuantity,
                    spanFollowersQuantity,
                    spanFollowsQuantity
                )
            )
            add(
                CellAccountPostsList(
                    ArrayList<CellAccountPost>().apply {
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                        add(CellAccountPost(R.drawable.ic_launcher_background))
                    }
                )
            )
        }
        )
    }
}