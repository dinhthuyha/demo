package com.example.adapter.kotlin

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_photo.view.*

class PhotoViewHolder(itemView: View,
                      onItemClick: (Photo, Int) -> Unit
): RecyclerView.ViewHolder(itemView) {
    private var itemData:Photo?=null
    init {
        /**
         * gan su kien onclick trong ham khoi tao view
         */
        itemView.setOnClickListener {
            itemData?.let {
                onItemClick(it, adapterPosition)
            }
        }

        fun bindData( photo:Photo){
            itemData= photo;
            itemView.run{
                textTitle.text= photo.title
                Glide.with(context).load(photo.url).into(imagePhoto)
            }
        }
    }
}