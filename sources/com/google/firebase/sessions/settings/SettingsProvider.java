package com.google.firebase.sessions.settings;

import h9.a;
import o8.q;
import r8.d;

/* compiled from: SettingsProvider.kt */
public interface SettingsProvider {

    /* compiled from: SettingsProvider.kt */
    public static final class DefaultImpls {
        public static boolean isSettingsStale(SettingsProvider settingsProvider) {
            return false;
        }

        public static Object updateSettings(SettingsProvider settingsProvider, d<? super q> dVar) {
            return q.f16189a;
        }
    }

    Double getSamplingRate();

    Boolean getSessionEnabled();

    /* renamed from: getSessionRestartTimeout-FghU774  reason: not valid java name */
    a m172getSessionRestartTimeoutFghU774();

    boolean isSettingsStale();

    Object updateSettings(d<? super q> dVar);
}
