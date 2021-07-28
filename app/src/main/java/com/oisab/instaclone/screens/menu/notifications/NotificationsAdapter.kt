package com.oisab.instaclone.screens.menu.notifications

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.oisab.instaclone.R

class NotificationsAdapter: RecyclerView.Adapter<NotificationsAdapter.NotificationViewHolder>() {
    private val notificationItems: MutableList<CellNotification> = ArrayList()

    fun setData(newNotifications: MutableList<CellNotification>) {
        notificationItems.clear()
        notificationItems.addAll(newNotifications)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return NotificationViewHolder(inflater.inflate(R.layout.cell_notifications, parent, false))
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        holder.bind(notificationItems[position])
    }

    override fun getItemCount(): Int = notificationItems.size

    class NotificationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: CellNotification) {
            val notificationImage: AppCompatImageView = itemView.findViewById(R.id.notificationImage)
            val notificationText: AppCompatTextView = itemView.findViewById(R.id.notificationText)

            notificationImage.setImageResource(item.notificationImage)
            notificationText.text = item.notificationText
        }
    }
}