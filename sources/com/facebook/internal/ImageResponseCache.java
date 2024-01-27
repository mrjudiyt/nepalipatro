package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Logger;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.m;

/* compiled from: ImageResponseCache.kt */
public final class ImageResponseCache {
    public static final ImageResponseCache INSTANCE = new ImageResponseCache();
    private static final String TAG = ImageResponseCache.class.getSimpleName();
    private static FileLruCache imageCache;

    /* compiled from: ImageResponseCache.kt */
    private static final class BufferedHttpInputStream extends BufferedInputStream {
        private HttpURLConnection connection;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BufferedHttpInputStream(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            m.f(httpURLConnection, "connection");
            this.connection = httpURLConnection;
        }

        public void close() {
            super.close();
            Utility utility = Utility.INSTANCE;
            Utility.disconnectQuietly(this.connection);
        }

        public final HttpURLConnection getConnection() {
            return this.connection;
        }

        public final void setConnection(HttpURLConnection httpURLConnection) {
            m.f(httpURLConnection, "<set-?>");
            this.connection = httpURLConnection;
        }
    }

    private ImageResponseCache() {
    }

    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e10) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
            String str = TAG;
            m.e(str, "TAG");
            companion.log(loggingBehavior, 5, str, m.o("clearCache failed ", e10.getMessage()));
        }
    }

    public static final synchronized FileLruCache getCache() {
        FileLruCache fileLruCache;
        synchronized (ImageResponseCache.class) {
            if (imageCache == null) {
                String str = TAG;
                m.e(str, "TAG");
                imageCache = new FileLruCache(str, new FileLruCache.Limits());
            }
            fileLruCache = imageCache;
            if (fileLruCache == null) {
                m.x("imageCache");
                throw null;
            }
        }
        return fileLruCache;
    }

    public static final InputStream getCachedImageStream(Uri uri) {
        if (uri == null || !INSTANCE.isCDNURL(uri)) {
            return null;
        }
        try {
            FileLruCache cache = getCache();
            String uri2 = uri.toString();
            m.e(uri2, "uri.toString()");
            return FileLruCache.get$default(cache, uri2, (String) null, 2, (Object) null);
        } catch (IOException e10) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
            String str = TAG;
            m.e(str, "TAG");
            companion.log(loggingBehavior, 5, str, e10.toString());
            return null;
        }
    }

    public static final InputStream interceptAndCacheImageStream(HttpURLConnection httpURLConnection) {
        m.f(httpURLConnection, "connection");
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            if (!INSTANCE.isCDNURL(parse)) {
                return inputStream;
            }
            FileLruCache cache = getCache();
            String uri = parse.toString();
            m.e(uri, "uri.toString()");
            return cache.interceptAndPut(uri, new BufferedHttpInputStream(inputStream, httpURLConnection));
        } catch (IOException unused) {
            return inputStream;
        }
    }

    private final boolean isCDNURL(Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null || (!m.a(host, "fbcdn.net") && !p.l(host, ".fbcdn.net", false, 2, (Object) null) && (!p.v(host, "fbcdn", false, 2, (Object) null) || !p.l(host, ".akamaihd.net", false, 2, (Object) null)))) {
            return false;
        }
        return true;
    }

    public final String getTAG() {
        return TAG;
    }
}
