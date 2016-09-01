package net.apkode.soa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView)findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());

        WebSettings websettings = webView.getSettings();

        websettings.setJavaScriptEnabled(true);
        // websettings.setBuiltInZoomControls(true);
        websettings.setDomStorageEnabled(true);

        webView.loadUrl("https://hydrocarbure-transport.herokuapp.com");


    }
}
