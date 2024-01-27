package com.google.android.exoplayer2.drm;

import a6.a;
import a6.m0;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.b;
import com.google.common.collect.z;
import e4.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import z5.j;
import z5.q;

/* compiled from: HttpMediaDrmCallback */
public final class p implements q {

    /* renamed from: a  reason: collision with root package name */
    private final HttpDataSource.a f6592a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6593b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6594c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f6595d;

    public p(String str, boolean z10, HttpDataSource.a aVar) {
        a.a(!z10 || !TextUtils.isEmpty(str));
        this.f6592a = aVar;
        this.f6593b = str;
        this.f6594c = z10;
        this.f6595d = new HashMap();
    }

    private static byte[] c(HttpDataSource.a aVar, String str, byte[] bArr, Map<String, String> map) {
        j jVar;
        q qVar = new q(aVar.a());
        b a10 = new b.C0120b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        b bVar = a10;
        while (true) {
            try {
                jVar = new j(qVar, bVar);
                byte[] I0 = m0.I0(jVar);
                m0.o(jVar);
                return I0;
            } catch (HttpDataSource.InvalidResponseCodeException e10) {
                String d10 = d(e10, i10);
                if (d10 != null) {
                    i10++;
                    bVar = bVar.a().j(d10).a();
                    m0.o(jVar);
                } else {
                    throw e10;
                }
            } catch (Exception e11) {
                throw new MediaDrmCallbackException(a10, (Uri) a.e(qVar.q()), qVar.j(), qVar.p(), e11);
            } catch (Throwable th) {
                m0.o(jVar);
                throw th;
            }
        }
    }

    private static String d(HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i10) {
        Map<String, List<String>> map;
        List list;
        int i11 = invalidResponseCodeException.f7656k;
        if (((i11 == 307 || i11 == 308) && i10 < 5) && (map = invalidResponseCodeException.f7658m) != null && (list = map.get("Location")) != null && !list.isEmpty()) {
            return (String) list.get(0);
        }
        return null;
    }

    public byte[] a(UUID uuid, n.a aVar) {
        String str;
        String b10 = aVar.b();
        if (this.f6594c || TextUtils.isEmpty(b10)) {
            b10 = this.f6593b;
        }
        if (!TextUtils.isEmpty(b10)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = c.f8049e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = c.f8047c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f6595d) {
                hashMap.putAll(this.f6595d);
            }
            return c(this.f6592a, b10, aVar.a(), hashMap);
        }
        throw new MediaDrmCallbackException(new b.C0120b().i(Uri.EMPTY).a(), Uri.EMPTY, z.j(), 0, new IllegalStateException("No license URL"));
    }

    public byte[] b(UUID uuid, n.d dVar) {
        String b10 = dVar.b();
        String D = m0.D(dVar.a());
        StringBuilder sb = new StringBuilder(String.valueOf(b10).length() + 15 + String.valueOf(D).length());
        sb.append(b10);
        sb.append("&signedRequest=");
        sb.append(D);
        return c(this.f6592a, sb.toString(), (byte[]) null, Collections.emptyMap());
    }

    public void e(String str, String str2) {
        a.e(str);
        a.e(str2);
        synchronized (this.f6595d) {
            this.f6595d.put(str, str2);
        }
    }
}
