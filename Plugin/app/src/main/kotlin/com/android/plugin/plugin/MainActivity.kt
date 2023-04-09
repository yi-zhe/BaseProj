package com.android.plugin.plugin

import android.app.Activity
import android.os.Bundle
import android.widget.Toast


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        Toast.makeText(this, "Hello Kotlin ! Hello RePlugin !", Toast.LENGTH_SHORT).show()
    }
}
