package io.flutter.plugins.firebase.messaging;

import android.content.Context;

public class ContextHolder {
    private static Context applicationContext;

    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(Context context) {
        applicationContext = context;
    }
}
