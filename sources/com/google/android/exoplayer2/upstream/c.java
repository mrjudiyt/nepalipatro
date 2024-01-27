package com.google.android.exoplayer2.upstream;

import a6.a;
import a6.m0;
import a6.p;
import android.content.Context;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import z5.h;
import z5.r;

/* compiled from: DefaultDataSource */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7720a;

    /* renamed from: b  reason: collision with root package name */
    private final List<r> f7721b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final a f7722c;

    /* renamed from: d  reason: collision with root package name */
    private a f7723d;

    /* renamed from: e  reason: collision with root package name */
    private a f7724e;

    /* renamed from: f  reason: collision with root package name */
    private a f7725f;

    /* renamed from: g  reason: collision with root package name */
    private a f7726g;

    /* renamed from: h  reason: collision with root package name */
    private a f7727h;

    /* renamed from: i  reason: collision with root package name */
    private a f7728i;

    /* renamed from: j  reason: collision with root package name */
    private a f7729j;

    /* renamed from: k  reason: collision with root package name */
    private a f7730k;

    public c(Context context, a aVar) {
        this.f7720a = context.getApplicationContext();
        this.f7722c = (a) a.e(aVar);
    }

    private void p(a aVar) {
        for (int i10 = 0; i10 < this.f7721b.size(); i10++) {
            aVar.c(this.f7721b.get(i10));
        }
    }

    private a q() {
        if (this.f7724e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f7720a);
            this.f7724e = assetDataSource;
            p(assetDataSource);
        }
        return this.f7724e;
    }

    private a r() {
        if (this.f7725f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f7720a);
            this.f7725f = contentDataSource;
            p(contentDataSource);
        }
        return this.f7725f;
    }

    private a s() {
        if (this.f7728i == null) {
            h hVar = new h();
            this.f7728i = hVar;
            p(hVar);
        }
        return this.f7728i;
    }

    private a t() {
        if (this.f7723d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f7723d = fileDataSource;
            p(fileDataSource);
        }
        return this.f7723d;
    }

    private a u() {
        if (this.f7729j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f7720a);
            this.f7729j = rawResourceDataSource;
            p(rawResourceDataSource);
        }
        return this.f7729j;
    }

    private a v() {
        if (this.f7726g == null) {
            try {
                a aVar = (a) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f7726g = aVar;
                p(aVar);
            } catch (ClassNotFoundException unused) {
                p.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f7726g == null) {
                this.f7726g = this.f7722c;
            }
        }
        return this.f7726g;
    }

    private a w() {
        if (this.f7727h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f7727h = udpDataSource;
            p(udpDataSource);
        }
        return this.f7727h;
    }

    private void x(a aVar, r rVar) {
        if (aVar != null) {
            aVar.c(rVar);
        }
    }

    public void c(r rVar) {
        a.e(rVar);
        this.f7722c.c(rVar);
        this.f7721b.add(rVar);
        x(this.f7723d, rVar);
        x(this.f7724e, rVar);
        x(this.f7725f, rVar);
        x(this.f7726g, rVar);
        x(this.f7727h, rVar);
        x(this.f7728i, rVar);
        x(this.f7729j, rVar);
    }

    public void close() {
        a aVar = this.f7730k;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.f7730k = null;
            }
        }
    }

    public long h(b bVar) {
        a.f(this.f7730k == null);
        String scheme = bVar.f7699a.getScheme();
        if (m0.l0(bVar.f7699a)) {
            String path = bVar.f7699a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f7730k = t();
            } else {
                this.f7730k = q();
            }
        } else if ("asset".equals(scheme)) {
            this.f7730k = q();
        } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            this.f7730k = r();
        } else if ("rtmp".equals(scheme)) {
            this.f7730k = v();
        } else if ("udp".equals(scheme)) {
            this.f7730k = w();
        } else if ("data".equals(scheme)) {
            this.f7730k = s();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f7730k = u();
        } else {
            this.f7730k = this.f7722c;
        }
        return this.f7730k.h(bVar);
    }

    public Map<String, List<String>> j() {
        a aVar = this.f7730k;
        return aVar == null ? Collections.emptyMap() : aVar.j();
    }

    public Uri n() {
        a aVar = this.f7730k;
        if (aVar == null) {
            return null;
        }
        return aVar.n();
    }

    public int read(byte[] bArr, int i10, int i11) {
        return ((a) a.e(this.f7730k)).read(bArr, i10, i11);
    }
}
