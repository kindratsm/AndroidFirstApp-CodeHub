package com.codehub.androidfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AbstractActivity() {

    override fun getLayoutRes(): Int {
        return R.layout.activity_main
    }

    override fun initUI() {
        val toolbar: Toolbar? = findViewById(R.id.toolbar)
        toolbar?.apply {
            var dateTime: String = SimpleDateFormat("EEEE dd, MMMM yyyy", Locale.getDefault()).format(Date())

            setTitle(dateTime)
            setSubtitle(R.string.app_name)
            setBackgroundColor(ContextCompat.getColor(this@MainActivity, R.color.textColor))
        }

        val adapter = ShowNowAdapter(this)
        adapter.updateData(
            listOf(
                "First",
                "Second",
                "Third"
            )
        )

        val recyclerView: RecyclerView? = findViewById(R.id.recyclerView)
        recyclerView?.adapter = adapter
    }

    override fun refreshUI() {

    }

    override fun destroyUI() {

    }

}
