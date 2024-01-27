package com.google.android.exoplayer2.upstream;

import com.facebook.ads.AdError;
import com.google.android.exoplayer2.upstream.a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l6.c;

public interface HttpDataSource extends a {

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException iOException, b bVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, bVar, 2007, 1);
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {

        /* renamed from: k  reason: collision with root package name */
        public final String f7655k;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InvalidContentTypeException(java.lang.String r4, com.google.android.exoplayer2.upstream.b r5) {
            /*
                r3 = this;
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r1 = r0.length()
                java.lang.String r2 = "Invalid content type: "
                if (r1 == 0) goto L_0x0011
                java.lang.String r0 = r2.concat(r0)
                goto L_0x0016
            L_0x0011:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r2)
            L_0x0016:
                r1 = 2003(0x7d3, float:2.807E-42)
                r2 = 1
                r3.<init>((java.lang.String) r0, (com.google.android.exoplayer2.upstream.b) r5, (int) r1, (int) r2)
                r3.f7655k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException.<init>(java.lang.String, com.google.android.exoplayer2.upstream.b):void");
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {

        /* renamed from: k  reason: collision with root package name */
        public final int f7656k;

        /* renamed from: l  reason: collision with root package name */
        public final String f7657l;

        /* renamed from: m  reason: collision with root package name */
        public final Map<String, List<String>> f7658m;

        /* renamed from: n  reason: collision with root package name */
        public final byte[] f7659n;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InvalidResponseCodeException(int r9, java.lang.String r10, java.io.IOException r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12, com.google.android.exoplayer2.upstream.b r13, byte[] r14) {
            /*
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 26
                r0.<init>(r1)
                java.lang.String r1 = "Response code: "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r3 = r0.toString()
                r6 = 2004(0x7d4, float:2.808E-42)
                r7 = 1
                r2 = r8
                r4 = r11
                r5 = r13
                r2.<init>(r3, r4, r5, r6, r7)
                r8.f7656k = r9
                r8.f7657l = r10
                r8.f7658m = r12
                r8.f7659n = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException.<init>(int, java.lang.String, java.io.IOException, java.util.Map, com.google.android.exoplayer2.upstream.b, byte[]):void");
        }
    }

    public interface a extends a.C0119a {
        HttpDataSource a();
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f7660a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f7661b;

        public synchronized Map<String, String> a() {
            if (this.f7661b == null) {
                this.f7661b = Collections.unmodifiableMap(new HashMap(this.f7660a));
            }
            return this.f7661b;
        }
    }

    public static class HttpDataSourceException extends DataSourceException {

        /* renamed from: i  reason: collision with root package name */
        public final b f7653i;

        /* renamed from: j  reason: collision with root package name */
        public final int f7654j;

        public HttpDataSourceException(b bVar, int i10, int i11) {
            super(a(i10, i11));
            this.f7653i = bVar;
            this.f7654j = i11;
        }

        private static int a(int i10, int i11) {
            return (i10 == 2000 && i11 == 1) ? AdError.INTERNAL_ERROR_CODE : i10;
        }

        public static HttpDataSourceException b(IOException iOException, b bVar, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = AdError.CACHE_ERROR_CODE;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = 1004;
            } else {
                i11 = (message == null || !c.e(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
            }
            if (i11 == 2007) {
                return new CleartextNotPermittedException(iOException, bVar);
            }
            return new HttpDataSourceException(iOException, bVar, i11, i10);
        }

        public HttpDataSourceException(String str, b bVar, int i10, int i11) {
            super(str, a(i10, i11));
            this.f7653i = bVar;
            this.f7654j = i11;
        }

        public HttpDataSourceException(IOException iOException, b bVar, int i10, int i11) {
            super((Throwable) iOException, a(i10, i11));
            this.f7653i = bVar;
            this.f7654j = i11;
        }

        public HttpDataSourceException(String str, IOException iOException, b bVar, int i10, int i11) {
            super(str, iOException, a(i10, i11));
            this.f7653i = bVar;
            this.f7654j = i11;
        }
    }
}
