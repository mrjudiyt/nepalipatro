package com.facebook.bolts;

import android.net.Uri;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.flutter.plugins.firebase.dynamiclinks.Constants;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: AppLink.kt */
public final class AppLink {
    private final Uri sourceUrl;
    private final List<Target> targets;
    private final Uri webUrl;

    /* compiled from: AppLink.kt */
    public static final class Target {
        private final String appName;
        private final String className;
        private final String packageName;
        private final Uri url;

        public Target(String str, String str2, Uri uri, String str3) {
            m.f(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            m.f(str2, "className");
            m.f(uri, "url");
            m.f(str3, Constants.APP_NAME);
            this.packageName = str;
            this.className = str2;
            this.url = uri;
            this.appName = str3;
        }

        public final String getAppName() {
            return this.appName;
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getPackageName() {
            return this.packageName;
        }

        public final Uri getUrl() {
            return this.url;
        }
    }

    public AppLink(Uri uri, List<Target> list, Uri uri2) {
        m.f(uri, "sourceUrl");
        m.f(uri2, "webUrl");
        this.sourceUrl = uri;
        this.webUrl = uri2;
        this.targets = list == null ? p.e() : list;
    }

    public final Uri getSourceUrl() {
        return this.sourceUrl;
    }

    public final List<Target> getTargets() {
        List<Target> unmodifiableList = Collections.unmodifiableList(this.targets);
        m.e(unmodifiableList, "unmodifiableList(field)");
        return unmodifiableList;
    }

    public final Uri getWebUrl() {
        return this.webUrl;
    }
}
