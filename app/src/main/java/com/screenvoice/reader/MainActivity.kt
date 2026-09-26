package com.screenvoice.reader

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.speechifyStatus).text =
            if (BuildConfig.SPEECHIFY_API_KEY.isBlank()) {
                "Speechify test key: not configured"
            } else {
                "Speechify test key: configured"
            }

        findViewById<TextView>(R.id.subdlStatus).text =
            if (BuildConfig.SUBDL_API_KEY.isBlank()) {
                "SubDL test key: not configured"
            } else {
                "SubDL test key: configured"
            }
    }
}
