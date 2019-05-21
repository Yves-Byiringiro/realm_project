package com.example.project_realm;

import android.app.Application;
import android.content.Context;

import io.realm.Realm;

public class Initializer extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
