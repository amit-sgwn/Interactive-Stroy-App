package com.mystoryapp.sangwan.interactivestroy_app;

import android.os.Bundle;
import android.app.Activity;

public class StoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
