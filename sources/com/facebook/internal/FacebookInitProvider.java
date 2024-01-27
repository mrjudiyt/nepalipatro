package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.FacebookSdk;
import com.facebook.share.internal.ShareConstants;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: FacebookInitProvider.kt */
public final class FacebookInitProvider extends ContentProvider {
    public static final Companion Companion = new Companion((g) null);
    private static final String TAG = FacebookInitProvider.class.getSimpleName();

    /* compiled from: FacebookInitProvider.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        m.f(uri, ShareConstants.MEDIA_URI);
        return 0;
    }

    public String getType(Uri uri) {
        m.f(uri, ShareConstants.MEDIA_URI);
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        m.f(uri, ShareConstants.MEDIA_URI);
        return null;
    }

    public boolean onCreate() {
        try {
            Context context = getContext();
            if (context != null) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                FacebookSdk.sdkInitialize(context);
                return false;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Exception unused) {
            return false;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        m.f(uri, ShareConstants.MEDIA_URI);
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        m.f(uri, ShareConstants.MEDIA_URI);
        return 0;
    }
}
