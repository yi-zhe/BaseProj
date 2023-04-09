package com.android.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.qihoo360.replugin.RePlugin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.id1).setOnClickListener {
            RePlugin.startActivity(
                this@MainActivity,
                RePlugin.createIntent(
                    "com.android.plugin.plugin",
                    "com.android.plugin.plugin.MainActivity"
                )
            )
        }
    }
}
