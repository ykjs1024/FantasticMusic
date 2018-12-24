package com.ykjs.fantasticmusic;

import android.app.Application;
import android.content.Intent;

import com.ykjs.fantasticmusic.activities.SplashActivity;

public class MusicApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        startActivity(new Intent(this, SplashActivity.class));
    }
}
