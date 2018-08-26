package com.johnquimbaya.testreigndesign.detailPost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.johnquimbaya.testreigndesign.R;

public class activity_webview extends AppCompatActivity {

    public static String urlPost;
    private WebView webView;
    private String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        url=getIntent().getStringExtra(urlPost);


        webView.loadUrl(url);
    }
}
