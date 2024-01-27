package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.firebase.sessions.ApplicationInfo;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;
import org.json.JSONObject;
import r8.d;
import y8.p;

/* compiled from: RemoteSettingsFetcher.kt */
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {
    public static final Companion Companion = new Companion((g) null);
    private static final String FIREBASE_PLATFORM = "android";
    private static final String FIREBASE_SESSIONS_BASE_URL_STRING = "firebase-settings.crashlytics.com";
    private final ApplicationInfo appInfo;
    private final String baseUrl;
    private final r8.g blockingDispatcher;

    /* compiled from: RemoteSettingsFetcher.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public RemoteSettingsFetcher(ApplicationInfo applicationInfo, r8.g gVar, String str) {
        m.f(applicationInfo, "appInfo");
        m.f(gVar, "blockingDispatcher");
        m.f(str, "baseUrl");
        this.appInfo = applicationInfo;
        this.blockingDispatcher = gVar;
        this.baseUrl = str;
    }

    /* access modifiers changed from: private */
    public final URL settingsUrl() {
        return new URL(new Uri.Builder().scheme("https").authority(this.baseUrl).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    public Object doConfigFetch(Map<String, String> map, p<? super JSONObject, ? super d<? super q>, ? extends Object> pVar, p<? super String, ? super d<? super q>, ? extends Object> pVar2, d<? super q> dVar) {
        Object g10 = i9.g.g(this.blockingDispatcher, new RemoteSettingsFetcher$doConfigFetch$2(this, map, pVar, pVar2, (d<? super RemoteSettingsFetcher$doConfigFetch$2>) null), dVar);
        return g10 == d.c() ? g10 : q.f16189a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RemoteSettingsFetcher(ApplicationInfo applicationInfo, r8.g gVar, String str, int i10, g gVar2) {
        this(applicationInfo, gVar, (i10 & 4) != 0 ? FIREBASE_SESSIONS_BASE_URL_STRING : str);
    }
}
