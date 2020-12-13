package com.leboncoin.android.albums.ui.albums.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.cardview.widget.CardView
import com.leboncoin.android.albums.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layout_album.view.*

class AlbumView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    init {
        View.inflate(context, R.layout.layout_album, this)
        layoutParams = LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        )
    }

    fun setData(
        title: String,
        urlImage: String
    ) {
        album_title.text = title

        Picasso.get()
            .load(urlImage)
            .fit()
            .centerCrop()
            .into(album_image)
    }
}