package com.ykjs.fantasticmusic.activities;

import android.app.Activity;
import android.os.Bundle;

import com.ykjs.fantasticmusic.util.ActivityCollector;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        ActivityCollector.removeActivity(this);
        super.onDestroy();
    }
}
