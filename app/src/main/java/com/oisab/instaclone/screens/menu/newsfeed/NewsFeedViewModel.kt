package com.oisab.instaclone.screens.menu.newsfeed

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.newsfeed.posts.CellNewsFeedPost
import com.oisab.instaclone.screens.menu.newsfeed.posts.CellNewsFeedStories
import com.oisab.instaclone.screens.menu.newsfeed.stories.CellStoriesItem

class NewsFeedViewModel : ViewModel() {
    val posts = MutableLiveData<MutableList<BaseNewsFeedCell>>()
    private lateinit var newsFeedStories: CellNewsFeedStories

    private val postImages = arrayListOf(
        R.drawable.image2,
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.ic_launcher_foreground
    )

    fun generatePosts() {
        posts.postValue(
            ArrayList<BaseNewsFeedCell>().apply {
                add(newsFeedStories)
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29eefvsebvsebtsedbtedstrbuxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweioghbsdb sdrtb srdtb rtb sdr bsdrftg " +
                        "bfgbetgveargveqtbwrgvqervae ebv eebtvbevbea betb ebtvetvgetbt" +
                        "vbvrdgwgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
                add(CellNewsFeedPost(R.drawable.ic_launcher_foreground, "oz_999", postImages, "tweiogh wgouwhnbiq29uxh", likesCount = 123))
            }
        )
    }

    fun generateStories() {
        newsFeedStories =
            CellNewsFeedStories(
                arrayListOf(
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "nplau"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "dev_avis"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "omz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "avlv_z"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                    CellStoriesItem(R.drawable.ic_launcher_foreground, "oz_999"),
                )
            )
    }
}