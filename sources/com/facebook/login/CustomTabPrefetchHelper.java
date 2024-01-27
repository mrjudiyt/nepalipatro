package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: CustomTabPrefetchHelper.kt */
public final class CustomTabPrefetchHelper extends e {
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public static c client;
    /* access modifiers changed from: private */
    public static final ReentrantLock lock = new ReentrantLock();
    /* access modifiers changed from: private */
    public static f session;

    /* compiled from: CustomTabPrefetchHelper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final void prepareSession() {
            c access$getClient$cp;
            CustomTabPrefetchHelper.lock.lock();
            if (CustomTabPrefetchHelper.session == null && (access$getClient$cp = CustomTabPrefetchHelper.client) != null) {
                Companion companion = CustomTabPrefetchHelper.Companion;
                CustomTabPrefetchHelper.session = access$getClient$cp.f((b) null);
            }
            CustomTabPrefetchHelper.lock.unlock();
        }

        public final f getPreparedSessionOnce() {
            CustomTabPrefetchHelper.lock.lock();
            f access$getSession$cp = CustomTabPrefetchHelper.session;
            CustomTabPrefetchHelper.session = null;
            CustomTabPrefetchHelper.lock.unlock();
            return access$getSession$cp;
        }

        public final void mayLaunchUrl(Uri uri) {
            m.f(uri, "url");
            prepareSession();
            CustomTabPrefetchHelper.lock.lock();
            f access$getSession$cp = CustomTabPrefetchHelper.session;
            if (access$getSession$cp != null) {
                access$getSession$cp.f(uri, (Bundle) null, (List<Bundle>) null);
            }
            CustomTabPrefetchHelper.lock.unlock();
        }
    }

    public static final f getPreparedSessionOnce() {
        return Companion.getPreparedSessionOnce();
    }

    public static final void mayLaunchUrl(Uri uri) {
        Companion.mayLaunchUrl(uri);
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
        m.f(componentName, "name");
        m.f(cVar, "newClient");
        cVar.h(0);
        Companion companion = Companion;
        client = cVar;
        companion.prepareSession();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        m.f(componentName, "componentName");
    }
}
