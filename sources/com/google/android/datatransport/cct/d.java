package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import r3.j;
import r3.k;
import r3.l;
import r3.m;
import r3.n;
import r3.o;
import r3.p;
import s3.h;
import s3.i;
import t3.f;
import t3.g;
import t3.m;

/* compiled from: CctTransportBackend */
final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    private final DataEncoder f6197a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f6198b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f6199c;

    /* renamed from: d  reason: collision with root package name */
    final URL f6200d;

    /* renamed from: e  reason: collision with root package name */
    private final c4.a f6201e;

    /* renamed from: f  reason: collision with root package name */
    private final c4.a f6202f;

    /* renamed from: g  reason: collision with root package name */
    private final int f6203g;

    /* compiled from: CctTransportBackend */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f6204a;

        /* renamed from: b  reason: collision with root package name */
        final j f6205b;

        /* renamed from: c  reason: collision with root package name */
        final String f6206c;

        a(URL url, j jVar, String str) {
            this.f6204a = url;
            this.f6205b = jVar;
            this.f6206c = str;
        }

        /* access modifiers changed from: package-private */
        public a a(URL url) {
            return new a(url, this.f6205b, this.f6206c);
        }
    }

    /* compiled from: CctTransportBackend */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f6207a;

        /* renamed from: b  reason: collision with root package name */
        final URL f6208b;

        /* renamed from: c  reason: collision with root package name */
        final long f6209c;

        b(int i10, URL url, long j10) {
            this.f6207a = i10;
            this.f6208b = url;
            this.f6209c = j10;
        }
    }

    d(Context context, c4.a aVar, c4.a aVar2, int i10) {
        this.f6197a = j.b();
        this.f6199c = context;
        this.f6198b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f6200d = n(a.f6187c);
        this.f6201e = aVar2;
        this.f6202f = aVar;
        this.f6203g = i10;
    }

    /* access modifiers changed from: private */
    public b e(a aVar) {
        GZIPOutputStream gZIPOutputStream;
        InputStream m10;
        w3.a.f("CctTransportBackend", "Making request to: %s", aVar.f6204a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f6204a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f6203g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.9"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f6206c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f6197a.encode(aVar.f6205b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                w3.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                w3.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                w3.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    m10 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, (URL) null, n.b(new BufferedReader(new InputStreamReader(m10))).c());
                    if (m10 != null) {
                        m10.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e10) {
            w3.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new b(500, (URL) null, 0);
        } catch (EncodingException | IOException e11) {
            w3.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new b(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.d();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.d();
        }
        if (o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.NONE.d();
        }
        return networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            w3.a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a aVar;
        HashMap hashMap = new HashMap();
        for (i next : fVar.b()) {
            String j10 = next.j();
            if (!hashMap.containsKey(j10)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j10, arrayList);
            } else {
                ((List) hashMap.get(j10)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar = (i) ((List) entry.getValue()).get(0);
            m.a b10 = r3.m.a().f(p.DEFAULT).g(this.f6202f.a()).h(this.f6201e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(r3.a.a().m(Integer.valueOf(iVar.g("sdk-version"))).j(iVar.b(DeviceRequestsHelper.DEVICE_INFO_MODEL)).f(iVar.b("hardware")).d(iVar.b(DeviceRequestsHelper.DEVICE_INFO_DEVICE)).l(iVar.b("product")).k(iVar.b("os-uild")).h(iVar.b("manufacturer")).e(iVar.b("fingerprint")).c(iVar.b(UserDataStore.COUNTRY)).g(iVar.b("locale")).i(iVar.b("mcc_mnc")).b(iVar.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar2 : (List) entry.getValue()) {
                h e10 = iVar2.e();
                q3.b b11 = e10.b();
                if (b11.equals(q3.b.b("proto"))) {
                    aVar = l.j(e10.a());
                } else if (b11.equals(q3.b.b("json"))) {
                    aVar = l.i(new String(e10.a(), Charset.forName("UTF-8")));
                } else {
                    w3.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                aVar.c(iVar2.f()).d(iVar2.k()).h(iVar2.h("tz-offset")).e(o.a().c(o.c.a(iVar2.g("net-type"))).b(o.b.a(iVar2.g("mobile-subtype"))).a());
                if (iVar2.d() != null) {
                    aVar.b(iVar2.d());
                }
                arrayList3.add(aVar.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f6208b;
        if (url == null) {
            return null;
        }
        w3.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f6208b);
    }

    private static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    public g a(f fVar) {
        j i10 = i(fVar);
        URL url = this.f6200d;
        String str = null;
        if (fVar.c() != null) {
            try {
                a d10 = a.d(fVar.c());
                if (d10.e() != null) {
                    str = d10.e();
                }
                if (d10.f() != null) {
                    url = n(d10.f());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) x3.b.a(5, new a(url, i10, str), new b(this), c.f6196a);
            int i11 = bVar.f6207a;
            if (i11 == 200) {
                return g.e(bVar.f6209c);
            }
            if (i11 < 500) {
                if (i11 != 404) {
                    if (i11 == 400) {
                        return g.d();
                    }
                    return g.a();
                }
            }
            return g.f();
        } catch (IOException e10) {
            w3.a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f6198b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL).c("hardware", Build.HARDWARE).c(DeviceRequestsHelper.DEVICE_INFO_DEVICE, Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c(UserDataStore.COUNTRY, Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f6199c).getSimOperator()).c("application_build", Integer.toString(h(this.f6199c))).d();
    }

    d(Context context, c4.a aVar, c4.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
