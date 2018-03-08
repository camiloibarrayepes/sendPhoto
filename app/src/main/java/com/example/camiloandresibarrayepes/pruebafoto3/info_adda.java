package com.example.camiloandresibarrayepes.pruebafoto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class info_adda extends AppCompatActivity {


    String url = "http:www.yamgo.com.co/adda/ver.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_adda);

        WebView web = (WebView)findViewById(R.id.wiew);
        web.setWebViewClient(new MyWebViewClient());
        WebSettings setting = web.getSettings();
        setting.setJavaScriptEnabled(true);
        web.loadUrl(url);

    }

    private class MyWebViewClient extends WebViewClient{
        public  boolean shouldOverrideUrlLoading(WebView view, String url){
           view.loadUrl(url);
           return true;
        }
    }
}
