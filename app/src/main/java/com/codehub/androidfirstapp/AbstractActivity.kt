package com.codehub.androidfirstapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

abstract class AbstractActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayoutRes())
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)

        // Init UI before enter UI thread
        initUI()
    }

    override fun onPostResume() {
        super.onPostResume()

        // Refresh UI on finish rendering app
        refreshUI()
    }


    override fun onStop() {
        // Destroy UI on leave UI thread
        destroyUI()

        super.onStop()
    }

    open fun destroyUI() {
        
    }

    abstract fun getLayoutRes(): Int

    abstract fun initUI()

    abstract fun refreshUI()

}