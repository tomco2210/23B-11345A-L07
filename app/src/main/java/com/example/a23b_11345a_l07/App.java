package com.example.a23b_11345a_l07;

import android.app.Application;

import com.example.a23b_11345a_l07.Utilities.ImageLoader;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ImageLoader.initImageLoader(this);
    }
}
