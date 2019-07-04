package com.codehub.androidfirstapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ShowNowAdapter(activity: MainActivity) : RecyclerView.Adapter<ShowNowViewHolder>() {

    var data: List<String> = emptyList()

    private fun getItem(position: Int): String {
        return this.data[position]
    }

    fun updateData(data: List<String>) {
        this.data = data;
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowNowViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_show_now, parent, false)
        val holder = ShowNowViewHolder(view)

        view.setOnClickListener {
            holder.onClick()
        }

        return holder
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ShowNowViewHolder, position: Int) {
        val item = getItem(position)

        holder.bind(item)
    }

}