package sg.edu.rp.c346.id19002765.rpwebsites;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import androidx.appcompat.app.AppCompatActivity;

public class webViewActivity extends AppCompatActivity {

    WebView wvPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewpage);

        wvPage = findViewById(R.id.webView);

        //extract the URL from the intent
        Intent intentReceive = getIntent();
        String url = intentReceive.getStringExtra("url");

        //initialize the Client window
        wvPage.setWebViewClient(new WebViewClient());

        //configure the webview
        WebSettings webSettings = wvPage.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

        //Load the web page
        wvPage.loadUrl(url);

    }
}
