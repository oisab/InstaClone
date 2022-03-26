package com.oisab.instaclone.screens.menu.account.cells

import android.text.SpannableString

data class CellAccountInfo(
    val accountIcon: Int,
    val postsQuantity: SpannableString,
    val followersQuantity: SpannableString,
    val followsQuantity: SpannableString
) : BaseAccountCell