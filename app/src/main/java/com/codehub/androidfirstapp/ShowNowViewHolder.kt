package com.codehub.androidfirstapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ShowNowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var item: String? = null

    fun bind(item: String) {
        this.item = item

        val view = itemView.findViewById<TextView?>(R.id.holder_text);
        view?.apply {
            text = item
        }
    }

    fun onClick() {
        item += "clicked"
    }

}