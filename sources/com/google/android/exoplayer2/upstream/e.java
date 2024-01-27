package com.google.android.exoplayer2.upstream;

import a6.m0;
import a6.p;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import l6.q;
import z5.f;
import z5.n;
import z5.r;

/* compiled from: DefaultHttpDataSource */
public class e extends f implements HttpDataSource {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7734e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7735f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7736g;

    /* renamed from: h  reason: collision with root package name */
    private final String f7737h;

    /* renamed from: i  reason: collision with root package name */
    private final HttpDataSource.b f7738i;

    /* renamed from: j  reason: collision with root package name */
    private final HttpDataSource.b f7739j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f7740k;

    /* renamed from: l  reason: collision with root package name */
    private q<String> f7741l;

    /* renamed from: m  reason: collision with root package name */
    private b f7742m;

    /* renamed from: n  reason: collision with root package name */
    private HttpURLConnection f7743n;

    /* renamed from: o  reason: collision with root package name */
    private InputStream f7744o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7745p;

    /* renamed from: q  reason: collision with root package name */
    private int f7746q;

    /* renamed from: r  reason: collision with root package name */
    private long f7747r;

    /* renamed from: s  reason: collision with root package name */
    private long f7748s;

    /* compiled from: DefaultHttpDataSource */
    public static final class b implements HttpDataSource.a {

        /* renamed from: a  reason: collision with root package name */
        private final HttpDataSource.b f7749a = new HttpDataSource.b();

        /* renamed from: b  reason: collision with root package name */
        private r f7750b;

        /* renamed from: c  reason: collision with root package name */
        private q<String> f7751c;

        /* renamed from: d  reason: collision with root package name */
        private String f7752d;

        /* renamed from: e  reason: collision with root package name */
        private int f7753e = 8000;

        /* renamed from: f  reason: collision with root package name */
        private int f7754f = 8000;

        /* renamed from: g  reason: collision with root package name */
        private boolean f7755g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f7756h;

        /* renamed from: b */
        public e a() {
            e eVar = new e(this.f7752d, this.f7753e, this.f7754f, this.f7755g, this.f7749a, this.f7751c, this.f7756h);
            r rVar = this.f7750b;
            if (rVar != null) {
                eVar.c(rVar);
            }
            return eVar;
        }

        public b c(boolean z10) {
            this.f7755g = z10;
            return this;
        }

        public b d(String str) {
            this.f7752d = str;
            return this;
        }
    }

    private int A(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f7747r;
        if (j10 != -1) {
            long j11 = j10 - this.f7748s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min((long) i11, j11);
        }
        int read = ((InputStream) m0.j(this.f7744o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f7748s += (long) read;
        p(read);
        return read;
    }

    private void B(long j10, b bVar) {
        if (j10 != 0) {
            byte[] bArr = new byte[4096];
            while (j10 > 0) {
                int read = ((InputStream) m0.j(this.f7744o)).read(bArr, 0, (int) Math.min(j10, (long) 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new HttpDataSource.HttpDataSourceException((IOException) new InterruptedIOException(), bVar, 2000, 1);
                } else if (read != -1) {
                    j10 -= (long) read;
                    p(read);
                } else {
                    throw new HttpDataSource.HttpDataSourceException(bVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                }
            }
        }
    }

    private void t() {
        HttpURLConnection httpURLConnection = this.f7743n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                p.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f7743n = null;
        }
    }

    private URL u(URL url, String str, b bVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    throw new HttpDataSource.HttpDataSourceException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), bVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
                } else if (this.f7734e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
                    sb.append("Disallowed cross-protocol redirect (");
                    sb.append(protocol2);
                    sb.append(" to ");
                    sb.append(protocol);
                    sb.append(")");
                    throw new HttpDataSource.HttpDataSourceException(sb.toString(), bVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
                }
            } catch (MalformedURLException e10) {
                throw new HttpDataSource.HttpDataSourceException((IOException) e10, bVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        } else {
            throw new HttpDataSource.HttpDataSourceException("Null location redirect", bVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    private static boolean v(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection w(b bVar) {
        HttpURLConnection x10;
        b bVar2 = bVar;
        URL url = new URL(bVar2.f7699a.toString());
        int i10 = bVar2.f7701c;
        byte[] bArr = bVar2.f7702d;
        long j10 = bVar2.f7705g;
        long j11 = bVar2.f7706h;
        boolean d10 = bVar2.d(1);
        if (!this.f7734e && !this.f7740k) {
            return x(url, i10, bArr, j10, j11, d10, true, bVar2.f7703e);
        }
        URL url2 = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                long j12 = j10;
                int i14 = i11;
                long j13 = j10;
                int i15 = i13;
                URL url3 = url2;
                long j14 = j11;
                x10 = x(url2, i11, bArr2, j12, j11, d10, false, bVar2.f7703e);
                int responseCode = x10.getResponseCode();
                String headerField = x10.getHeaderField("Location");
                if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    x10.disconnect();
                    url2 = u(url3, headerField, bVar2);
                    i11 = i14;
                } else if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return x10;
                } else {
                    x10.disconnect();
                    if (!(this.f7740k && responseCode == 302)) {
                        bArr2 = null;
                        i11 = 1;
                    } else {
                        i11 = i14;
                    }
                    url2 = u(url3, headerField, bVar2);
                }
                i12 = i15;
                j10 = j13;
                j11 = j14;
            } else {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Too many redirects: ");
                sb.append(i13);
                throw new HttpDataSource.HttpDataSourceException((IOException) new NoRouteToHostException(sb.toString()), bVar2, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        }
        return x10;
    }

    private HttpURLConnection x(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        HttpURLConnection z12 = z(url);
        z12.setConnectTimeout(this.f7735f);
        z12.setReadTimeout(this.f7736g);
        HashMap hashMap = new HashMap();
        HttpDataSource.b bVar = this.f7738i;
        if (bVar != null) {
            hashMap.putAll(bVar.a());
        }
        hashMap.putAll(this.f7739j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            z12.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = n.a(j10, j11);
        if (a10 != null) {
            z12.setRequestProperty("Range", a10);
        }
        String str = this.f7737h;
        if (str != null) {
            z12.setRequestProperty("User-Agent", str);
        }
        z12.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        z12.setInstanceFollowRedirects(z11);
        z12.setDoOutput(bArr != null);
        z12.setRequestMethod(b.c(i10));
        if (bArr != null) {
            z12.setFixedLengthStreamingMode(bArr.length);
            z12.connect();
            OutputStream outputStream = z12.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            z12.connect();
        }
        return z12;
    }

    private static void y(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = m0.f205a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) a6.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void close() {
        try {
            InputStream inputStream = this.f7744o;
            if (inputStream != null) {
                long j10 = this.f7747r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f7748s;
                }
                y(this.f7743n, j11);
                inputStream.close();
            }
            this.f7744o = null;
            t();
            if (this.f7745p) {
                this.f7745p = false;
                q();
            }
        } catch (IOException e10) {
            throw new HttpDataSource.HttpDataSourceException(e10, (b) m0.j(this.f7742m), 2000, 3);
        } catch (Throwable th) {
            this.f7744o = null;
            t();
            if (this.f7745p) {
                this.f7745p = false;
                q();
            }
            throw th;
        }
    }

    public long h(b bVar) {
        byte[] bArr;
        this.f7742m = bVar;
        long j10 = 0;
        this.f7748s = 0;
        this.f7747r = 0;
        r(bVar);
        try {
            HttpURLConnection w10 = w(bVar);
            this.f7743n = w10;
            this.f7746q = w10.getResponseCode();
            String responseMessage = w10.getResponseMessage();
            int i10 = this.f7746q;
            long j11 = -1;
            if (i10 < 200 || i10 > 299) {
                Map headerFields = w10.getHeaderFields();
                if (this.f7746q == 416) {
                    if (bVar.f7705g == n.c(w10.getHeaderField("Content-Range"))) {
                        this.f7745p = true;
                        s(bVar);
                        long j12 = bVar.f7706h;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0;
                    }
                }
                InputStream errorStream = w10.getErrorStream();
                if (errorStream != null) {
                    try {
                        bArr = m0.I0(errorStream);
                    } catch (IOException unused) {
                        bArr = m0.f210f;
                    }
                } else {
                    bArr = m0.f210f;
                }
                byte[] bArr2 = bArr;
                t();
                throw new HttpDataSource.InvalidResponseCodeException(this.f7746q, responseMessage, this.f7746q == 416 ? new DataSourceException(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, bVar, bArr2);
            }
            String contentType = w10.getContentType();
            q<String> qVar = this.f7741l;
            if (qVar == null || qVar.apply(contentType)) {
                if (this.f7746q == 200) {
                    long j13 = bVar.f7705g;
                    if (j13 != 0) {
                        j10 = j13;
                    }
                }
                boolean v10 = v(w10);
                if (!v10) {
                    long j14 = bVar.f7706h;
                    if (j14 != -1) {
                        this.f7747r = j14;
                    } else {
                        long b10 = n.b(w10.getHeaderField("Content-Length"), w10.getHeaderField("Content-Range"));
                        if (b10 != -1) {
                            j11 = b10 - j10;
                        }
                        this.f7747r = j11;
                    }
                } else {
                    this.f7747r = bVar.f7706h;
                }
                try {
                    this.f7744o = w10.getInputStream();
                    if (v10) {
                        this.f7744o = new GZIPInputStream(this.f7744o);
                    }
                    this.f7745p = true;
                    s(bVar);
                    try {
                        B(j10, bVar);
                        return this.f7747r;
                    } catch (IOException e10) {
                        t();
                        if (e10 instanceof HttpDataSource.HttpDataSourceException) {
                            throw ((HttpDataSource.HttpDataSourceException) e10);
                        }
                        throw new HttpDataSource.HttpDataSourceException(e10, bVar, 2000, 1);
                    }
                } catch (IOException e11) {
                    t();
                    throw new HttpDataSource.HttpDataSourceException(e11, bVar, 2000, 1);
                }
            } else {
                t();
                throw new HttpDataSource.InvalidContentTypeException(contentType, bVar);
            }
        } catch (IOException e12) {
            t();
            throw HttpDataSource.HttpDataSourceException.b(e12, bVar, 1);
        }
    }

    public Map<String, List<String>> j() {
        HttpURLConnection httpURLConnection = this.f7743n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public Uri n() {
        HttpURLConnection httpURLConnection = this.f7743n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public int read(byte[] bArr, int i10, int i11) {
        try {
            return A(bArr, i10, i11);
        } catch (IOException e10) {
            throw HttpDataSource.HttpDataSourceException.b(e10, (b) m0.j(this.f7742m), 2);
        }
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection z(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    private e(String str, int i10, int i11, boolean z10, HttpDataSource.b bVar, q<String> qVar, boolean z11) {
        super(true);
        this.f7737h = str;
        this.f7735f = i10;
        this.f7736g = i11;
        this.f7734e = z10;
        this.f7738i = bVar;
        this.f7741l = qVar;
        this.f7739j = new HttpDataSource.b();
        this.f7740k = z11;
    }
}
