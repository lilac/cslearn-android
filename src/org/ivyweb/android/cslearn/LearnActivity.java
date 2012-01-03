package org.ivyweb.android.cslearn;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class LearnActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webview = new WebView(this);
        setContentView(webview);
        //setContentView(R.layout.learn);
        webview.loadUrl("file:///android_asset/guide/index.html");
	}
}
