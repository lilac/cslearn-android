package org.ivyweb.android.cslearn;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TabHost;

public class HomeActivity extends TabActivity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, LearnActivity.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("learn").setIndicator("Learn",
                          null)
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, ExamActivity.class);
        spec = tabHost.newTabSpec("exam").setIndicator("Exam").setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, PerformanceActivity.class);
        spec = tabHost.newTabSpec("performance").setIndicator("Performance").setContent(intent);
        tabHost.addTab(spec);
        
        tabHost.setCurrentTab(0);
	}
}
