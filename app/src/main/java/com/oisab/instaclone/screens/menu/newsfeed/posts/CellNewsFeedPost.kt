package com.oisab.instaclone.screens.menu.newsfeed.posts

import com.oisab.instaclone.screens.menu.newsfeed.BaseNewsFeedCell

data class CellNewsFeedPost(
    val postOwnerIcon: Int,
    val postOwnerName: String,
    val postImages: MutableList<Int>,
    val postText: String,
    val likesCount: Int,
    var isLiked: Boolean = false
) : BaseNewsFeedCell