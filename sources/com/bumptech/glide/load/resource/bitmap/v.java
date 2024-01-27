package com.bumptech.glide.load.resource.bitmap;

import a3.d;
import a3.h;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.k;
import e2.g;
import e2.i;
import h2.c;
import i2.b;
import i2.e;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamBitmapDecoder */
public class v implements i<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final k f5924a;

    /* renamed from: b  reason: collision with root package name */
    private final b f5925b;

    /* compiled from: StreamBitmapDecoder */
    static class a implements k.b {

        /* renamed from: a  reason: collision with root package name */
        private final t f5926a;

        /* renamed from: b  reason: collision with root package name */
        private final d f5927b;

        a(t tVar, d dVar) {
            this.f5926a = tVar;
            this.f5927b = dVar;
        }

        public void a(e eVar, Bitmap bitmap) {
            IOException a10 = this.f5927b.a();
            if (a10 != null) {
                if (bitmap != null) {
                    eVar.c(bitmap);
                }
                throw a10;
            }
        }

        public void b() {
            this.f5926a.h();
        }
    }

    public v(k kVar, b bVar) {
        this.f5924a = kVar;
        this.f5925b = bVar;
    }

    /* renamed from: c */
    public c<Bitmap> a(InputStream inputStream, int i10, int i11, g gVar) {
        t tVar;
        boolean z10;
        if (inputStream instanceof t) {
            tVar = (t) inputStream;
            z10 = false;
        } else {
            tVar = new t(inputStream, this.f5925b);
            z10 = true;
        }
        d h10 = d.h(tVar);
        try {
            return this.f5924a.g(new h(h10), i10, i11, gVar, new a(tVar, h10));
        } finally {
            h10.release();
            if (z10) {
                tVar.release();
            }
        }
    }

    /* renamed from: d */
    public boolean b(InputStream inputStream, g gVar) {
        return this.f5924a.p(inputStream);
    }
}
