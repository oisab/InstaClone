package com.oisab.instaclone.screens.menu.account

import android.text.SpannableString
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
        accountData.postValue(ArrayList<BaseAccountCell>().apply {
            add(
                CellAccountInfo(
                    R.drawable.ic_launcher_foreground,
                    SpannableString("123"),
                    SpannableString("123"),
                    SpannableString("123"))
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