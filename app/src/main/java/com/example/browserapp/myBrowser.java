package com.example.browserapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class myBrowser extends AppCompatActivity {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_browser);

        web = findViewById(R.id.webView);

        web.getSettings().setLoadsImagesAutomatically(true);

        WebSettings webSettings = web.getSettings();

        webSettings.setJavaScriptEnabled(true);

        web.loadUrl("https://www.google.co.in");

        web.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {

        if (web.canGoBack()) {

            web.goBack();

        } else {

            super.onBackPressed();

        }
    }
}
