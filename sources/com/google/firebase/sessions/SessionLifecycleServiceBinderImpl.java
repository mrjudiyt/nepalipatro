package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import com.google.firebase.FirebaseApp;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: SessionLifecycleServiceBinder.kt */
public final class SessionLifecycleServiceBinderImpl implements SessionLifecycleServiceBinder {
    public static final Companion Companion = new Companion((g) null);
    public static final String TAG = "LifecycleServiceBinder";
    private final FirebaseApp firebaseApp;

    /* compiled from: SessionLifecycleServiceBinder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public SessionLifecycleServiceBinderImpl(FirebaseApp firebaseApp2) {
        m.f(firebaseApp2, "firebaseApp");
        this.firebaseApp = firebaseApp2;
    }

    public void bindToService(Messenger messenger, ServiceConnection serviceConnection) {
        m.f(messenger, "callback");
        m.f(serviceConnection, "serviceConnection");
        Context applicationContext = this.firebaseApp.getApplicationContext().getApplicationContext();
        Intent intent = new Intent(applicationContext, SessionLifecycleService.class);
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra(SessionLifecycleService.CLIENT_CALLBACK_MESSENGER, messenger);
        applicationContext.bindService(intent, serviceConnection, 65);
    }
}
