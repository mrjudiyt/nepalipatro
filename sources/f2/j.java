package f2;

import a3.c;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.load.HttpException;
import f2.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import l2.g;

/* compiled from: HttpUrlFetcher */
public class j implements d<InputStream> {

    /* renamed from: n  reason: collision with root package name */
    static final b f8485n = new a();

    /* renamed from: h  reason: collision with root package name */
    private final g f8486h;

    /* renamed from: i  reason: collision with root package name */
    private final int f8487i;

    /* renamed from: j  reason: collision with root package name */
    private final b f8488j;

    /* renamed from: k  reason: collision with root package name */
    private HttpURLConnection f8489k;

    /* renamed from: l  reason: collision with root package name */
    private InputStream f8490l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f8491m;

    /* compiled from: HttpUrlFetcher */
    private static class a implements b {
        a() {
        }

        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* compiled from: HttpUrlFetcher */
    interface b {
        HttpURLConnection a(URL url);
    }

    public j(g gVar, int i10) {
        this(gVar, i10, f8485n);
    }

    private InputStream c(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f8490l = c.h(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got non empty content encoding: ");
                sb.append(httpURLConnection.getContentEncoding());
            }
            this.f8490l = httpURLConnection.getInputStream();
        }
        return this.f8490l;
    }

    private static boolean f(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean g(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream h(URL url, int i10, URL url2, Map<String, String> map) {
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f8489k = this.f8488j.a(url);
            for (Map.Entry next : map.entrySet()) {
                this.f8489k.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.f8489k.setConnectTimeout(this.f8487i);
            this.f8489k.setReadTimeout(this.f8487i);
            this.f8489k.setUseCaches(false);
            this.f8489k.setDoInput(true);
            this.f8489k.setInstanceFollowRedirects(false);
            this.f8489k.connect();
            this.f8490l = this.f8489k.getInputStream();
            if (this.f8491m) {
                return null;
            }
            int responseCode = this.f8489k.getResponseCode();
            if (f(responseCode)) {
                return c(this.f8489k);
            }
            if (g(responseCode)) {
                String headerField = this.f8489k.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    b();
                    return h(url3, i10 + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.f8489k.getResponseMessage(), responseCode);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!");
        }
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f8490l;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f8489k;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f8489k = null;
    }

    public void cancel() {
        this.f8491m = true;
    }

    public void d(f fVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        long b10 = a3.f.b();
        try {
            aVar.f(h(this.f8486h.h(), 0, (URL) null, this.f8486h.e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(a3.f.a(b10));
            }
        } catch (IOException e10) {
            boolean isLoggable = Log.isLoggable("HttpUrlFetcher", 3);
            aVar.c(e10);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(a3.f.a(b10));
            }
            throw th;
        }
    }

    public e2.a e() {
        return e2.a.REMOTE;
    }

    j(g gVar, int i10, b bVar) {
        this.f8486h = gVar;
        this.f8487i = i10;
        this.f8488j = bVar;
    }
}
