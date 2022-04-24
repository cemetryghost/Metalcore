package com.example.metalllcore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.text.method.ScrollingMovementMethod;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle arguments = getIntent().getExtras();

        WebView webView = findViewById(R.id.webView);

        WebSettings settings = webView.getSettings();
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);

        webView.loadUrl("file:///android_asset/"+arguments.getString("track")+".html");
    }
}