package com.eldenring.fa

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            val webView = WebView(this)
            webView.webViewClient = WebViewClient()
            webView.settings.javaScriptEnabled = true
            webView.loadUrl("file:///android_asset/index.html")
            setContentView(webView)
        } catch (e: Exception) {
            val errorView = TextView(this)
            errorView.text = "Error: ${e.message}"
            setContentView(errorView)
        }
    }
}
