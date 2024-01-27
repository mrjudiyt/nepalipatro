package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FileLruCache;
import g9.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashSet;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;

/* compiled from: UrlRedirectCache.kt */
public final class UrlRedirectCache {
    public static final UrlRedirectCache INSTANCE = new UrlRedirectCache();
    private static final String redirectContentTag;
    private static final String tag;
    private static FileLruCache urlRedirectFileLruCache;

    static {
        String a10 = z.b(UrlRedirectCache.class).a();
        if (a10 == null) {
            a10 = "UrlRedirectCache";
        }
        tag = a10;
        redirectContentTag = m.o(a10, "_Redirect");
    }

    private UrlRedirectCache() {
    }

    public static final void cacheUriRedirect(Uri uri, Uri uri2) {
        if (uri != null && uri2 != null) {
            OutputStream outputStream = null;
            try {
                FileLruCache cache = getCache();
                String uri3 = uri.toString();
                m.e(uri3, "fromUri.toString()");
                outputStream = cache.openPutStream(uri3, redirectContentTag);
                String uri4 = uri2.toString();
                m.e(uri4, "toUri.toString()");
                byte[] bytes = uri4.getBytes(d.f14759b);
                m.e(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
            } catch (IOException e10) {
                Logger.Companion.log(LoggingBehavior.CACHE, 4, tag, m.o("IOException when accessing cache: ", e10.getMessage()));
            } catch (Throwable th) {
                Utility utility = Utility.INSTANCE;
                Utility.closeQuietly(outputStream);
                throw th;
            }
            Utility utility2 = Utility.INSTANCE;
            Utility.closeQuietly(outputStream);
        }
    }

    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e10) {
            Logger.Companion.log(LoggingBehavior.CACHE, 5, tag, m.o("clearCache failed ", e10.getMessage()));
        }
    }

    public static final synchronized FileLruCache getCache() {
        FileLruCache fileLruCache;
        synchronized (UrlRedirectCache.class) {
            fileLruCache = urlRedirectFileLruCache;
            if (fileLruCache == null) {
                fileLruCache = new FileLruCache(tag, new FileLruCache.Limits());
            }
            urlRedirectFileLruCache = fileLruCache;
        }
        return fileLruCache;
    }

    public static final Uri getRedirectedUri(Uri uri) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        InputStreamReader inputStreamReader3 = null;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        m.e(uri2, "uri.toString()");
        HashSet hashSet = new HashSet();
        hashSet.add(uri2);
        try {
            FileLruCache cache = getCache();
            InputStream inputStream = cache.get(uri2, redirectContentTag);
            inputStreamReader = null;
            boolean z10 = false;
            while (true) {
                if (inputStream == null) {
                    break;
                }
                z10 = true;
                try {
                    inputStreamReader2 = new InputStreamReader(inputStream);
                } catch (IOException e10) {
                    e = e10;
                    try {
                        Logger.Companion.log(LoggingBehavior.CACHE, 4, tag, m.o("IOException when accessing cache: ", e.getMessage()));
                        Utility utility = Utility.INSTANCE;
                        Utility.closeQuietly(inputStreamReader);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader3 = inputStreamReader;
                    }
                }
                try {
                    char[] cArr = new char[128];
                    StringBuilder sb = new StringBuilder();
                    for (int read = inputStreamReader2.read(cArr, 0, 128); read > 0; read = inputStreamReader2.read(cArr, 0, 128)) {
                        sb.append(cArr, 0, read);
                    }
                    Utility utility2 = Utility.INSTANCE;
                    Utility.closeQuietly(inputStreamReader2);
                    String sb2 = sb.toString();
                    m.e(sb2, "urlBuilder.toString()");
                    if (!hashSet.contains(sb2)) {
                        hashSet.add(sb2);
                        inputStreamReader = inputStreamReader2;
                        String str = sb2;
                        inputStream = cache.get(sb2, redirectContentTag);
                        uri2 = str;
                    } else if (m.a(sb2, uri2)) {
                        inputStreamReader = inputStreamReader2;
                    } else {
                        Logger.Companion.log(LoggingBehavior.CACHE, 6, tag, "A loop detected in UrlRedirectCache");
                        Utility.closeQuietly(inputStreamReader2);
                        return null;
                    }
                } catch (IOException e11) {
                    e = e11;
                    inputStreamReader = inputStreamReader2;
                    Logger.Companion.log(LoggingBehavior.CACHE, 4, tag, m.o("IOException when accessing cache: ", e.getMessage()));
                    Utility utility3 = Utility.INSTANCE;
                    Utility.closeQuietly(inputStreamReader);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader3 = inputStreamReader2;
                    Utility utility4 = Utility.INSTANCE;
                    Utility.closeQuietly(inputStreamReader3);
                    throw th;
                }
            }
            if (z10) {
                Uri parse = Uri.parse(uri2);
                Utility utility5 = Utility.INSTANCE;
                Utility.closeQuietly(inputStreamReader);
                return parse;
            }
        } catch (IOException e12) {
            e = e12;
            inputStreamReader = null;
            Logger.Companion.log(LoggingBehavior.CACHE, 4, tag, m.o("IOException when accessing cache: ", e.getMessage()));
            Utility utility32 = Utility.INSTANCE;
            Utility.closeQuietly(inputStreamReader);
            return null;
        } catch (Throwable th3) {
            th = th3;
            Utility utility42 = Utility.INSTANCE;
            Utility.closeQuietly(inputStreamReader3);
            throw th;
        }
        Utility utility322 = Utility.INSTANCE;
        Utility.closeQuietly(inputStreamReader);
        return null;
    }
}
