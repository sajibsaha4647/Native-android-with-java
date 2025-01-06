package com.example.webview_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView  = (WebView) findViewById(R.id.webViewId);

        WebSettings webSettings = webView.getSettings();

        webView.setWebViewClient(new WebViewClient());

        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("https://www.bdtask.com/");



    }

    @Override
    public void onBackPressed() {

        if(webView.canGoBack())
        {
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}