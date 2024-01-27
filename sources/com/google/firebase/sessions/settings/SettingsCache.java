package com.google.firebase.sessions.settings;

import g0.e;
import i9.l0;
import j0.d;
import j0.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;
import y8.p;

/* compiled from: SettingsCache.kt */
public final class SettingsCache {
    /* access modifiers changed from: private */
    @Deprecated
    public static final d.a<Integer> CACHE_DURATION_SECONDS = f.d("firebase_sessions_cache_duration");
    /* access modifiers changed from: private */
    @Deprecated
    public static final d.a<Long> CACHE_UPDATED_TIME = f.e("firebase_sessions_cache_updated_time");
    private static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    @Deprecated
    public static final d.a<Integer> RESTART_TIMEOUT_SECONDS = f.d("firebase_sessions_restart_timeout");
    /* access modifiers changed from: private */
    @Deprecated
    public static final d.a<Double> SAMPLING_RATE = f.b(LocalOverrideSettings.SAMPLING_RATE);
    /* access modifiers changed from: private */
    @Deprecated
    public static final d.a<Boolean> SESSIONS_ENABLED = f.a(LocalOverrideSettings.SESSIONS_ENABLED);
    @Deprecated
    public static final String TAG = "SettingsCache";
    /* access modifiers changed from: private */
    public final e<d> dataStore;
    private SessionConfigs sessionConfigs;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$1  reason: invalid class name */
    /* compiled from: SettingsCache.kt */
    static final class AnonymousClass1 extends k implements p<l0, r8.d<? super q>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ SettingsCache this$0;

        {
            this.this$0 = r1;
        }

        public final r8.d<q> create(Object obj, r8.d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        public final Object invoke(l0 l0Var, r8.d<? super q> dVar) {
            return ((AnonymousClass1) create(l0Var, dVar)).invokeSuspend(q.f16189a);
        }

        public final Object invokeSuspend(Object obj) {
            SettingsCache settingsCache;
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o8.m.b(obj);
                SettingsCache settingsCache2 = this.this$0;
                l9.d data = settingsCache2.dataStore.getData();
                this.L$0 = settingsCache2;
                this.label = 1;
                Object h10 = l9.f.h(data, this);
                if (h10 == c10) {
                    return c10;
                }
                settingsCache = settingsCache2;
                obj = h10;
            } else if (i10 == 1) {
                settingsCache = (SettingsCache) this.L$0;
                o8.m.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            settingsCache.updateSessionConfigs(((d) obj).d());
            return q.f16189a;
        }
    }

    /* compiled from: SettingsCache.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final d.a<Integer> getCACHE_DURATION_SECONDS() {
            return SettingsCache.CACHE_DURATION_SECONDS;
        }

        public final d.a<Long> getCACHE_UPDATED_TIME() {
            return SettingsCache.CACHE_UPDATED_TIME;
        }

        public final d.a<Integer> getRESTART_TIMEOUT_SECONDS() {
            return SettingsCache.RESTART_TIMEOUT_SECONDS;
        }

        public final d.a<Double> getSAMPLING_RATE() {
            return SettingsCache.SAMPLING_RATE;
        }

        public final d.a<Boolean> getSESSIONS_ENABLED() {
            return SettingsCache.SESSIONS_ENABLED;
        }
    }

    public SettingsCache(e<d> eVar) {
        m.f(eVar, "dataStore");
        this.dataStore = eVar;
        Object unused = h.b((r8.g) null, new AnonymousClass1(this, (r8.d<? super AnonymousClass1>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object updateConfigValue(j0.d.a<T> r6, T r7, r8.d<? super o8.q> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = (com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            o8.m.b(r8)     // Catch:{ IOException -> 0x0029 }
            goto L_0x0054
        L_0x0029:
            r6 = move-exception
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            o8.m.b(r8)
            g0.e<j0.d> r8 = r5.dataStore     // Catch:{ IOException -> 0x0029 }
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 r2 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2     // Catch:{ IOException -> 0x0029 }
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch:{ IOException -> 0x0029 }
            r0.label = r3     // Catch:{ IOException -> 0x0029 }
            java.lang.Object r6 = j0.g.a(r8, r2, r0)     // Catch:{ IOException -> 0x0029 }
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0047:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
        L_0x0054:
            o8.q r6 = o8.q.f16189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.updateConfigValue(j0.d$a, java.lang.Object, r8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void updateSessionConfigs(d dVar) {
        this.sessionConfigs = new SessionConfigs((Boolean) dVar.b(SESSIONS_ENABLED), (Double) dVar.b(SAMPLING_RATE), (Integer) dVar.b(RESTART_TIMEOUT_SECONDS), (Integer) dVar.b(CACHE_DURATION_SECONDS), (Long) dVar.b(CACHE_UPDATED_TIME));
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        SessionConfigs sessionConfigs2 = this.sessionConfigs;
        SessionConfigs sessionConfigs3 = null;
        if (sessionConfigs2 == null) {
            m.x("sessionConfigs");
            sessionConfigs2 = null;
        }
        Long cacheUpdatedTime = sessionConfigs2.getCacheUpdatedTime();
        SessionConfigs sessionConfigs4 = this.sessionConfigs;
        if (sessionConfigs4 == null) {
            m.x("sessionConfigs");
        } else {
            sessionConfigs3 = sessionConfigs4;
        }
        Integer cacheDuration = sessionConfigs3.getCacheDuration();
        return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / ((long) 1000) >= ((long) cacheDuration.intValue());
    }

    public final Object removeConfigs$com_google_firebase_firebase_sessions(r8.d<? super q> dVar) {
        Object a10 = j0.g.a(this.dataStore, new SettingsCache$removeConfigs$2(this, (r8.d<? super SettingsCache$removeConfigs$2>) null), dVar);
        return a10 == d.c() ? a10 : q.f16189a;
    }

    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs2 = this.sessionConfigs;
        if (sessionConfigs2 == null) {
            m.x("sessionConfigs");
            sessionConfigs2 = null;
        }
        return sessionConfigs2.getSessionRestartTimeout();
    }

    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs2 = this.sessionConfigs;
        if (sessionConfigs2 == null) {
            m.x("sessionConfigs");
            sessionConfigs2 = null;
        }
        return sessionConfigs2.getSessionSamplingRate();
    }

    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs2 = this.sessionConfigs;
        if (sessionConfigs2 == null) {
            m.x("sessionConfigs");
            sessionConfigs2 = null;
        }
        return sessionConfigs2.getSessionEnabled();
    }

    public final Object updateSamplingRate(Double d10, r8.d<? super q> dVar) {
        Object updateConfigValue = updateConfigValue(SAMPLING_RATE, d10, dVar);
        return updateConfigValue == d.c() ? updateConfigValue : q.f16189a;
    }

    public final Object updateSessionCacheDuration(Integer num, r8.d<? super q> dVar) {
        Object updateConfigValue = updateConfigValue(CACHE_DURATION_SECONDS, num, dVar);
        return updateConfigValue == d.c() ? updateConfigValue : q.f16189a;
    }

    public final Object updateSessionCacheUpdatedTime(Long l10, r8.d<? super q> dVar) {
        Object updateConfigValue = updateConfigValue(CACHE_UPDATED_TIME, l10, dVar);
        return updateConfigValue == d.c() ? updateConfigValue : q.f16189a;
    }

    public final Object updateSessionRestartTimeout(Integer num, r8.d<? super q> dVar) {
        Object updateConfigValue = updateConfigValue(RESTART_TIMEOUT_SECONDS, num, dVar);
        return updateConfigValue == d.c() ? updateConfigValue : q.f16189a;
    }

    public final Object updateSettingsEnabled(Boolean bool, r8.d<? super q> dVar) {
        Object updateConfigValue = updateConfigValue(SESSIONS_ENABLED, bool, dVar);
        return updateConfigValue == d.c() ? updateConfigValue : q.f16189a;
    }
}
