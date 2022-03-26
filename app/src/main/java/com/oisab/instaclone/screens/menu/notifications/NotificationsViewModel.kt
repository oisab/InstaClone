package com.oisab.instaclone.screens.menu.notifications

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oisab.instaclone.R

class NotificationsViewModel: ViewModel() {
    val notificationsData = MutableLiveData<ArrayList<CellNotification>>()

    fun generateNotifications() {
        notificationsData.postValue(
            ArrayList<CellNotification>().apply {
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
                add(CellNotification(R.drawable.ic_launcher_foreground, "nplau want's to subscribe you"))
            }
        )
    }
}