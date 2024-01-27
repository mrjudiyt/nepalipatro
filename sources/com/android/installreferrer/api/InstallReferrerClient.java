package com.android.installreferrer.api;

import android.content.Context;

public abstract class InstallReferrerClient {

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5541a;

        private b(Context context) {
            this.f5541a = context;
        }

        public InstallReferrerClient a() {
            Context context = this.f5541a;
            if (context != null) {
                return new a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static b c(Context context) {
        return new b(context);
    }

    public abstract void a();

    public abstract ReferrerDetails b();

    public abstract void d(InstallReferrerStateListener installReferrerStateListener);
}
