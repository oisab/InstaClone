package com.oisab.instaclone.screens.menu.newsfeed

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oisab.instaclone.R
import com.oisab.instaclone.screens.menu.newsfeed.posts.NewsFeedCellPost
import com.oisab.instaclone.screens.menu.newsfeed.posts.NewsFeedCellStories
import com.oisab.instaclone.screens.menu.newsfeed.stories.CellStoriesItem

class NewsFeedViewModel : ViewModel() {
    val posts = MutableLiveData<MutableList<BaseNewsFeedCell>>()
    lateinit var stories: NewsFeedCellStories

    private val postImages = arrayListOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground
    )

    fun generatePosts() {
        posts.postValue(
            ArrayList<BaseNewsFeedCell>().apply {
                add(stories)
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29eefvsebvsebtsedbtedstrbuxh"))
                add(NewsFeedCellPost(postImages, "tweioghbsdb sdrtb srdtb rtb sdr bsdrftg " +
                        "bfgbetgveargveqtbwrgvqervae ebv eebtvbevbea betb ebtvetvgetbt" +
                        "vbvrdgwgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
                add(NewsFeedCellPost(postImages, "tweiogh wgouwhnbiq29uxh"))
            }
        )
    }

    fun generateStories() {
        stories =
            NewsFeedCellStories(
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