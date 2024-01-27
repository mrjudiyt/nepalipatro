package com.google.firebase.sessions.settings;

import a9.a;
import android.content.Context;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import e9.i;
import g0.e;
import h0.b;
import h9.a;
import h9.c;
import i9.l0;
import j0.d;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.z;
import y8.l;

/* compiled from: SessionsSettings.kt */
public final class SessionsSettings {
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public static final a<Context, e<d>> dataStore$delegate = i0.a.b(SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME(), (b) null, (l) null, (l0) null, 14, (Object) null);
    private final SettingsProvider localOverrideSettings;
    private final SettingsProvider remoteSettings;

    /* compiled from: SessionsSettings.kt */
    public static final class Companion {
        static final /* synthetic */ i<Object>[] $$delegatedProperties = {z.f(new u(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final e<d> getDataStore(Context context) {
            return (e) SessionsSettings.dataStore$delegate.a(context, $$delegatedProperties[0]);
        }

        public final SessionsSettings getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionsSettings.class);
            m.e(obj, "Firebase.app[SessionsSettings::class.java]");
            return (SessionsSettings) obj;
        }
    }

    public SessionsSettings(SettingsProvider settingsProvider, SettingsProvider settingsProvider2) {
        m.f(settingsProvider, "localOverrideSettings");
        m.f(settingsProvider2, "remoteSettings");
        this.localOverrideSettings = settingsProvider;
        this.remoteSettings = settingsProvider2;
    }

    private final boolean isValidSamplingRate(double d10) {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE <= d10 && d10 <= 1.0d;
    }

    /* renamed from: isValidSessionRestartTimeout-LRDsOJo  reason: not valid java name */
    private final boolean m170isValidSessionRestartTimeoutLRDsOJo(long j10) {
        return h9.a.D(j10) && h9.a.y(j10);
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double doubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(doubleValue)) {
                return doubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double doubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    /* renamed from: getSessionRestartTimeout-UwyO8pc  reason: not valid java name */
    public final long m171getSessionRestartTimeoutUwyO8pc() {
        h9.a r02 = this.localOverrideSettings.m172getSessionRestartTimeoutFghU774();
        if (r02 != null) {
            long H = r02.H();
            if (m170isValidSessionRestartTimeoutLRDsOJo(H)) {
                return H;
            }
        }
        h9.a r03 = this.remoteSettings.m172getSessionRestartTimeoutFghU774();
        if (r03 != null) {
            long H2 = r03.H();
            if (m170isValidSessionRestartTimeoutLRDsOJo(H2)) {
                return H2;
            }
        }
        a.C0251a aVar = h9.a.f14840i;
        return c.h(30, h9.d.MINUTES);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object updateSettings(r8.d<? super o8.q> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            o8.m.b(r6)
            goto L_0x005b
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            com.google.firebase.sessions.settings.SessionsSettings r2 = (com.google.firebase.sessions.settings.SessionsSettings) r2
            o8.m.b(r6)
            goto L_0x004d
        L_0x003c:
            o8.m.b(r6)
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.localOverrideSettings
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            com.google.firebase.sessions.settings.SettingsProvider r6 = r2.remoteSettings
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L_0x005b
            return r1
        L_0x005b:
            o8.q r6 = o8.q.f16189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.updateSettings(r8.d):java.lang.Object");
    }

    private SessionsSettings(Context context, r8.g gVar, r8.g gVar2, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo) {
        this(new LocalOverrideSettings(context), new RemoteSettings(gVar2, firebaseInstallationsApi, applicationInfo, new RemoteSettingsFetcher(applicationInfo, gVar, (String) null, 4, (g) null), Companion.getDataStore(context)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SessionsSettings(com.google.firebase.FirebaseApp r8, r8.g r9, r8.g r10, com.google.firebase.installations.FirebaseInstallationsApi r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.m.f(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            kotlin.jvm.internal.m.f(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.m.f(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            kotlin.jvm.internal.m.f(r11, r0)
            android.content.Context r2 = r8.getApplicationContext()
            java.lang.String r0 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.m.e(r2, r0)
            com.google.firebase.sessions.SessionEvents r0 = com.google.firebase.sessions.SessionEvents.INSTANCE
            com.google.firebase.sessions.ApplicationInfo r6 = r0.getApplicationInfo(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.<init>(com.google.firebase.FirebaseApp, r8.g, r8.g, com.google.firebase.installations.FirebaseInstallationsApi):void");
    }
}
