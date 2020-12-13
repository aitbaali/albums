package com.leboncoin.android.albums.ui.albums.view.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.leboncoin.android.albums.ui.albums.model.AlbumUi
import com.leboncoin.android.albums.ui.albums.view.AlbumView

class AlbumsAdapter : ListAdapter<AlbumUi, AlbumsAdapter.ViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            AlbumView(
                parent.context
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val albumUi = getItem(position)
        (holder.itemView as AlbumView).setData(
            title = albumUi.title,
            urlImage = albumUi.url
        )
    }

    class ViewHolder(view: AlbumView) : RecyclerView.ViewHolder(view)

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<AlbumUi>() {
            override fun areItemsTheSame(
                oldItem: AlbumUi,
                newItem: AlbumUi
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: AlbumUi,
                newItem: AlbumUi
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}