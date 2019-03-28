package com.example.foodhealthapp;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseACL;

public class ParseServer extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("5eeaab6d5610a50f137edb87aa9e0adf3f7e5a2f")
                // if defined
                .clientKey("61350589972f1fbef4a952b89db513024c3210d4")
                .server("http://34.242.186.59:80/parse/")
                .build()
        );

        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
