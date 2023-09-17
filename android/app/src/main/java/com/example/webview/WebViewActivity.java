package com.example.webview;

import android.os.Bundle;
import io.flutter.embedding.android.FlutterActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends FlutterActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a WebView instance
        webView = new WebView(this);
        setContentView(webView);

        // Configure WebView settings
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript
        webSettings.setDomStorageEnabled(true); // Enable DOM storage
        webSettings.setBuiltInZoomControls(true); // Enable zoom controls
        webSettings.setDisplayZoomControls(false); // Disable display of zoom controls

        // Set a WebViewClient to handle page navigation and loading
        webView.setWebViewClient(new WebViewClient());

        // Load a web page
        webView.loadUrl("https://stemjuander.online");

        // Optionally, you can handle other WebView interactions or events here
    }
}