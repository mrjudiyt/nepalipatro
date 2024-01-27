package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.Validate;
import kotlin.jvm.internal.m;
import q0.a;

/* compiled from: ProfileTracker.kt */
public abstract class ProfileTracker {
    private final a broadcastManager;
    private boolean isTracking;
    private final BroadcastReceiver receiver = new ProfileBroadcastReceiver(this);

    /* compiled from: ProfileTracker.kt */
    private final class ProfileBroadcastReceiver extends BroadcastReceiver {
        final /* synthetic */ ProfileTracker this$0;

        public ProfileBroadcastReceiver(ProfileTracker profileTracker) {
            m.f(profileTracker, "this$0");
            this.this$0 = profileTracker;
        }

        public void onReceive(Context context, Intent intent) {
            m.f(context, "context");
            m.f(intent, "intent");
            if (m.a(ProfileManager.ACTION_CURRENT_PROFILE_CHANGED, intent.getAction())) {
                this.this$0.onCurrentProfileChanged((Profile) intent.getParcelableExtra(ProfileManager.EXTRA_OLD_PROFILE), (Profile) intent.getParcelableExtra(ProfileManager.EXTRA_NEW_PROFILE));
            }
        }
    }

    public ProfileTracker() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        a b10 = a.b(FacebookSdk.getApplicationContext());
        m.e(b10, "getInstance(FacebookSdk.getApplicationContext())");
        this.broadcastManager = b10;
        startTracking();
    }

    private final void addBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ProfileManager.ACTION_CURRENT_PROFILE_CHANGED);
        this.broadcastManager.c(this.receiver, intentFilter);
    }

    public final boolean isTracking() {
        return this.isTracking;
    }

    /* access modifiers changed from: protected */
    public abstract void onCurrentProfileChanged(Profile profile, Profile profile2);

    public final void startTracking() {
        if (!this.isTracking) {
            addBroadcastReceiver();
            this.isTracking = true;
        }
    }

    public final void stopTracking() {
        if (this.isTracking) {
            this.broadcastManager.e(this.receiver);
            this.isTracking = false;
        }
    }
}
