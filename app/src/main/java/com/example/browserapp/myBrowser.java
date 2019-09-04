package com.example.browserapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class myBrowser extends AppCompatActivity {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_browser);

        web = findViewById(R.id.webView);
        web.getSettings().setLoadsImagesAutomatically(true);
        web.loadUrl("https://www.google.co.in");
    }

}
