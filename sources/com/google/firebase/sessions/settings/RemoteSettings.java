package com.google.firebase.sessions.settings;

import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import g0.e;
import g9.f;
import h9.a;
import i9.m0;
import i9.n0;
import i9.u1;
import j0.d;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import r9.a;
import r9.c;

/* compiled from: RemoteSettings.kt */
public final class RemoteSettings implements SettingsProvider {
    private static final Companion Companion = new Companion((g) null);
    @Deprecated
    public static final String FORWARD_SLASH_STRING = "/";
    @Deprecated
    public static final String TAG = "SessionConfigFetcher";
    private final ApplicationInfo appInfo;
    private final r8.g backgroundDispatcher;
    private final CrashlyticsSettingsFetcher configsFetcher;
    private final a fetchInProgress = c.b(false, 1, (Object) null);
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    /* access modifiers changed from: private */
    public final SettingsCache settingsCache;

    /* compiled from: RemoteSettings.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public RemoteSettings(r8.g gVar, FirebaseInstallationsApi firebaseInstallationsApi2, ApplicationInfo applicationInfo, CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, e<d> eVar) {
        m.f(gVar, "backgroundDispatcher");
        m.f(firebaseInstallationsApi2, "firebaseInstallationsApi");
        m.f(applicationInfo, "appInfo");
        m.f(crashlyticsSettingsFetcher, "configsFetcher");
        m.f(eVar, "dataStore");
        this.backgroundDispatcher = gVar;
        this.firebaseInstallationsApi = firebaseInstallationsApi2;
        this.appInfo = applicationInfo;
        this.configsFetcher = crashlyticsSettingsFetcher;
        this.settingsCache = new SettingsCache(eVar);
    }

    private final String removeForwardSlashesIn(String str) {
        return new f(FORWARD_SLASH_STRING).b(str, "");
    }

    public final void clearCachedSettings$com_google_firebase_firebase_sessions() {
        u1 unused = i.d(m0.a(this.backgroundDispatcher), (r8.g) null, (n0) null, new RemoteSettings$clearCachedSettings$1(this, (r8.d<? super RemoteSettings$clearCachedSettings$1>) null), 3, (Object) null);
    }

    public Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
    }

    public Boolean getSessionEnabled() {
        return this.settingsCache.sessionsEnabled();
    }

    /* renamed from: getSessionRestartTimeout-FghU774  reason: not valid java name */
    public h9.a m169getSessionRestartTimeoutFghU774() {
        Integer sessionRestartTimeout = this.settingsCache.sessionRestartTimeout();
        if (sessionRestartTimeout == null) {
            return null;
        }
        a.C0251a aVar = h9.a.f14840i;
        return h9.a.d(h9.c.h(sessionRestartTimeout.intValue(), h9.d.SECONDS));
    }

    public boolean isSettingsStale() {
        return this.settingsCache.hasCacheExpired$com_google_firebase_firebase_sessions();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b A[Catch:{ all -> 0x0142 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091 A[SYNTHETIC, Splitter:B:39:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0 A[Catch:{ all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updateSettings(r8.d<? super o8.q> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x005d
            if (r2 == r5) goto L_0x0050
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r0 = r0.L$0
            r9.a r0 = (r9.a) r0
            o8.m.b(r15)     // Catch:{ all -> 0x0035 }
            goto L_0x013c
        L_0x0035:
            r15 = move-exception
            goto L_0x0146
        L_0x0038:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0040:
            java.lang.Object r2 = r0.L$1
            r9.a r2 = (r9.a) r2
            java.lang.Object r7 = r0.L$0
            com.google.firebase.sessions.settings.RemoteSettings r7 = (com.google.firebase.sessions.settings.RemoteSettings) r7
            o8.m.b(r15)     // Catch:{ all -> 0x004c }
            goto L_0x00ac
        L_0x004c:
            r15 = move-exception
            r0 = r2
            goto L_0x0146
        L_0x0050:
            java.lang.Object r2 = r0.L$1
            r9.a r2 = (r9.a) r2
            java.lang.Object r7 = r0.L$0
            com.google.firebase.sessions.settings.RemoteSettings r7 = (com.google.firebase.sessions.settings.RemoteSettings) r7
            o8.m.b(r15)
            r15 = r2
            goto L_0x0083
        L_0x005d:
            o8.m.b(r15)
            r9.a r15 = r14.fetchInProgress
            boolean r15 = r15.a()
            if (r15 != 0) goto L_0x0073
            com.google.firebase.sessions.settings.SettingsCache r15 = r14.settingsCache
            boolean r15 = r15.hasCacheExpired$com_google_firebase_firebase_sessions()
            if (r15 != 0) goto L_0x0073
            o8.q r15 = o8.q.f16189a
            return r15
        L_0x0073:
            r9.a r15 = r14.fetchInProgress
            r0.L$0 = r14
            r0.L$1 = r15
            r0.label = r5
            java.lang.Object r2 = r15.b(r6, r0)
            if (r2 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r7 = r14
        L_0x0083:
            com.google.firebase.sessions.settings.SettingsCache r2 = r7.settingsCache     // Catch:{ all -> 0x0142 }
            boolean r2 = r2.hasCacheExpired$com_google_firebase_firebase_sessions()     // Catch:{ all -> 0x0142 }
            if (r2 != 0) goto L_0x0091
            o8.q r0 = o8.q.f16189a     // Catch:{ all -> 0x0142 }
            r15.c(r6)
            return r0
        L_0x0091:
            com.google.firebase.installations.FirebaseInstallationsApi r2 = r7.firebaseInstallationsApi     // Catch:{ all -> 0x0142 }
            com.google.android.gms.tasks.Task r2 = r2.getId()     // Catch:{ all -> 0x0142 }
            java.lang.String r8 = "firebaseInstallationsApi.id"
            kotlin.jvm.internal.m.e(r2, r8)     // Catch:{ all -> 0x0142 }
            r0.L$0 = r7     // Catch:{ all -> 0x0142 }
            r0.L$1 = r15     // Catch:{ all -> 0x0142 }
            r0.label = r4     // Catch:{ all -> 0x0142 }
            java.lang.Object r2 = s9.b.a(r2, r0)     // Catch:{ all -> 0x0142 }
            if (r2 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            r13 = r2
            r2 = r15
            r15 = r13
        L_0x00ac:
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x004c }
            if (r15 != 0) goto L_0x00b6
            o8.q r15 = o8.q.f16189a     // Catch:{ all -> 0x004c }
            r2.c(r6)
            return r15
        L_0x00b6:
            r8 = 5
            o8.k[] r8 = new o8.k[r8]     // Catch:{ all -> 0x004c }
            java.lang.String r9 = "X-Crashlytics-Installation-ID"
            o8.k r15 = o8.o.a(r9, r15)     // Catch:{ all -> 0x004c }
            r9 = 0
            r8[r9] = r15     // Catch:{ all -> 0x004c }
            java.lang.String r15 = "X-Crashlytics-Device-Model"
            kotlin.jvm.internal.b0 r10 = kotlin.jvm.internal.b0.f15559a     // Catch:{ all -> 0x004c }
            java.lang.String r10 = "%s/%s"
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x004c }
            java.lang.String r12 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x004c }
            r11[r9] = r12     // Catch:{ all -> 0x004c }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x004c }
            r11[r5] = r9     // Catch:{ all -> 0x004c }
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r11, r4)     // Catch:{ all -> 0x004c }
            java.lang.String r9 = java.lang.String.format(r10, r9)     // Catch:{ all -> 0x004c }
            java.lang.String r10 = "format(format, *args)"
            kotlin.jvm.internal.m.e(r9, r10)     // Catch:{ all -> 0x004c }
            java.lang.String r9 = r7.removeForwardSlashesIn(r9)     // Catch:{ all -> 0x004c }
            o8.k r15 = o8.o.a(r15, r9)     // Catch:{ all -> 0x004c }
            r8[r5] = r15     // Catch:{ all -> 0x004c }
            java.lang.String r15 = "X-Crashlytics-OS-Build-Version"
            java.lang.String r5 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ all -> 0x004c }
            java.lang.String r9 = "INCREMENTAL"
            kotlin.jvm.internal.m.e(r5, r9)     // Catch:{ all -> 0x004c }
            java.lang.String r5 = r7.removeForwardSlashesIn(r5)     // Catch:{ all -> 0x004c }
            o8.k r15 = o8.o.a(r15, r5)     // Catch:{ all -> 0x004c }
            r8[r4] = r15     // Catch:{ all -> 0x004c }
            java.lang.String r15 = "X-Crashlytics-OS-Display-Version"
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "RELEASE"
            kotlin.jvm.internal.m.e(r4, r5)     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r7.removeForwardSlashesIn(r4)     // Catch:{ all -> 0x004c }
            o8.k r15 = o8.o.a(r15, r4)     // Catch:{ all -> 0x004c }
            r8[r3] = r15     // Catch:{ all -> 0x004c }
            r15 = 4
            java.lang.String r4 = "X-Crashlytics-API-Client-Version"
            com.google.firebase.sessions.ApplicationInfo r5 = r7.appInfo     // Catch:{ all -> 0x004c }
            java.lang.String r5 = r5.getSessionSdkVersion()     // Catch:{ all -> 0x004c }
            o8.k r4 = o8.o.a(r4, r5)     // Catch:{ all -> 0x004c }
            r8[r15] = r4     // Catch:{ all -> 0x004c }
            java.util.Map r15 = p8.h0.f(r8)     // Catch:{ all -> 0x004c }
            com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher r4 = r7.configsFetcher     // Catch:{ all -> 0x004c }
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1 r5 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1     // Catch:{ all -> 0x004c }
            r5.<init>(r7, r6)     // Catch:{ all -> 0x004c }
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2 r7 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2     // Catch:{ all -> 0x004c }
            r7.<init>(r6)     // Catch:{ all -> 0x004c }
            r0.L$0 = r2     // Catch:{ all -> 0x004c }
            r0.L$1 = r6     // Catch:{ all -> 0x004c }
            r0.label = r3     // Catch:{ all -> 0x004c }
            java.lang.Object r15 = r4.doConfigFetch(r15, r5, r7, r0)     // Catch:{ all -> 0x004c }
            if (r15 != r1) goto L_0x013b
            return r1
        L_0x013b:
            r0 = r2
        L_0x013c:
            o8.q r15 = o8.q.f16189a     // Catch:{ all -> 0x0035 }
            r0.c(r6)
            return r15
        L_0x0142:
            r0 = move-exception
            r13 = r0
            r0 = r15
            r15 = r13
        L_0x0146:
            r0.c(r6)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings.updateSettings(r8.d):java.lang.Object");
    }
}
