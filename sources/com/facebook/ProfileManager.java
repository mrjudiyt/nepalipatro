package com.facebook;

import android.content.Intent;
import com.facebook.internal.Utility;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import q0.a;

/* compiled from: ProfileManager.kt */
public final class ProfileManager {
    public static final String ACTION_CURRENT_PROFILE_CHANGED = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";
    public static final Companion Companion = new Companion((g) null);
    public static final String EXTRA_NEW_PROFILE = "com.facebook.sdk.EXTRA_NEW_PROFILE";
    public static final String EXTRA_OLD_PROFILE = "com.facebook.sdk.EXTRA_OLD_PROFILE";
    /* access modifiers changed from: private */
    public static volatile ProfileManager instance;
    private Profile currentProfileField;
    private final a localBroadcastManager;
    private final ProfileCache profileCache;

    /* compiled from: ProfileManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final synchronized ProfileManager getInstance() {
            ProfileManager access$getInstance$cp;
            if (ProfileManager.instance == null) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                a b10 = a.b(FacebookSdk.getApplicationContext());
                m.e(b10, "getInstance(applicationContext)");
                ProfileManager.instance = new ProfileManager(b10, new ProfileCache());
            }
            access$getInstance$cp = ProfileManager.instance;
            if (access$getInstance$cp == null) {
                m.x("instance");
                throw null;
            }
            return access$getInstance$cp;
        }
    }

    public ProfileManager(a aVar, ProfileCache profileCache2) {
        m.f(aVar, "localBroadcastManager");
        m.f(profileCache2, "profileCache");
        this.localBroadcastManager = aVar;
        this.profileCache = profileCache2;
    }

    public static final synchronized ProfileManager getInstance() {
        ProfileManager instance2;
        synchronized (ProfileManager.class) {
            instance2 = Companion.getInstance();
        }
        return instance2;
    }

    private final void sendCurrentProfileChangedBroadcast(Profile profile, Profile profile2) {
        Intent intent = new Intent(ACTION_CURRENT_PROFILE_CHANGED);
        intent.putExtra(EXTRA_OLD_PROFILE, profile);
        intent.putExtra(EXTRA_NEW_PROFILE, profile2);
        this.localBroadcastManager.d(intent);
    }

    public final Profile getCurrentProfile() {
        return this.currentProfileField;
    }

    public final boolean loadCurrentProfile() {
        Profile load = this.profileCache.load();
        if (load == null) {
            return false;
        }
        setCurrentProfile(load, false);
        return true;
    }

    public final void setCurrentProfile(Profile profile) {
        setCurrentProfile(profile, true);
    }

    private final void setCurrentProfile(Profile profile, boolean z10) {
        Profile profile2 = this.currentProfileField;
        this.currentProfileField = profile;
        if (z10) {
            if (profile != null) {
                this.profileCache.save(profile);
            } else {
                this.profileCache.clear();
            }
        }
        Utility utility = Utility.INSTANCE;
        if (!Utility.areObjectsEqual(profile2, profile)) {
            sendCurrentProfileChangedBroadcast(profile2, profile);
        }
    }
}
