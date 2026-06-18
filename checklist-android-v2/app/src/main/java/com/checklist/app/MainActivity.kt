package com.checklist.app

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent

class MainActivity : AppCompatActivity() {
    private val appUrl =
        "https://wagnerliborioporto.github.io/checklist-wagner/checklist-portatil.html"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val customTab = CustomTabsIntent.Builder()
            .setShowTitle(false)
            .build()

        customTab.launchUrl(this, Uri.parse(appUrl))
        finish()
    }
}
