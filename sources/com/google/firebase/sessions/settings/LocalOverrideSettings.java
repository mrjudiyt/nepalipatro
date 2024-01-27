package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.sessions.settings.SettingsProvider;
import h9.a;
import h9.c;
import h9.d;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: LocalOverrideSettings.kt */
public final class LocalOverrideSettings implements SettingsProvider {
    private static final Companion Companion = new Companion((g) null);
    @Deprecated
    public static final String SAMPLING_RATE = "firebase_sessions_sampling_rate";
    @Deprecated
    public static final String SESSIONS_ENABLED = "firebase_sessions_enabled";
    @Deprecated
    public static final String SESSION_RESTART_TIMEOUT = "firebase_sessions_sessions_restart_timeout";
    private final Bundle metadata;

    /* compiled from: LocalOverrideSettings.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public LocalOverrideSettings(Context context) {
        m.f(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.metadata = bundle == null ? Bundle.EMPTY : bundle;
    }

    private static /* synthetic */ void getMetadata$annotations() {
    }

    public Double getSamplingRate() {
        if (this.metadata.containsKey(SAMPLING_RATE)) {
            return Double.valueOf(this.metadata.getDouble(SAMPLING_RATE));
        }
        return null;
    }

    public Boolean getSessionEnabled() {
        if (this.metadata.containsKey(SESSIONS_ENABLED)) {
            return Boolean.valueOf(this.metadata.getBoolean(SESSIONS_ENABLED));
        }
        return null;
    }

    /* renamed from: getSessionRestartTimeout-FghU774  reason: not valid java name */
    public a m168getSessionRestartTimeoutFghU774() {
        if (this.metadata.containsKey(SESSION_RESTART_TIMEOUT)) {
            return a.d(c.h(this.metadata.getInt(SESSION_RESTART_TIMEOUT), d.SECONDS));
        }
        return null;
    }

    public boolean isSettingsStale() {
        return SettingsProvider.DefaultImpls.isSettingsStale(this);
    }

    public Object updateSettings(r8.d<? super q> dVar) {
        return SettingsProvider.DefaultImpls.updateSettings(this, dVar);
    }
}
