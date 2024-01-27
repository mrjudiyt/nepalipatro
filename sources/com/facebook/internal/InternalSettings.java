package com.facebook.internal;

import kotlin.jvm.internal.m;

/* compiled from: InternalSettings.kt */
public final class InternalSettings {
    public static final InternalSettings INSTANCE = new InternalSettings();
    private static final String UNITY_PREFIX = "Unity.";
    private static volatile String customUserAgent;

    private InternalSettings() {
    }

    public static final String getCustomUserAgent() {
        return customUserAgent;
    }

    public static final boolean isUnityApp() {
        String str = customUserAgent;
        Boolean bool = null;
        if (str != null) {
            bool = Boolean.valueOf(p.v(str, UNITY_PREFIX, false, 2, (Object) null));
        }
        return m.a(bool, Boolean.TRUE);
    }

    public static /* synthetic */ void isUnityApp$annotations() {
    }

    public static final void setCustomUserAgent(String str) {
        m.f(str, "value");
        customUserAgent = str;
    }
}
