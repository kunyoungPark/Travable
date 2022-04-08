package com.kypark.trav_able;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MyWebView extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        Button navBtn = findViewById(R.id.button_naver);
        Button gooBtn = findViewById(R.id.button_google);
        Button vdBtn = findViewById(R.id.video);

        navBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWebView.loadUrl("https://www.naver.com/");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        gooBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWebView.loadUrl("https://www.google.com/");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });
        String frameVideo = "<html><body>Video From YouTube<br><iframe width=\"420\" height=\"315\" src=\"https://www.youtube.com/embed/47yJ2XCRLZs\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

        vdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.loadData(frameVideo, "text/html", "utf-8");

            }
        });


    }


    private class WebViewClientClass extends WebViewClient {//페이지 이동
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest wrr) {
            Log.d("check URL", String.valueOf(wrr.getUrl()));
            view.loadUrl(String.valueOf(wrr.getUrl()));
            return true;
        }
    }
}


