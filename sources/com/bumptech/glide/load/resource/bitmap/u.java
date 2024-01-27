package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import e2.g;
import e2.i;
import h2.c;
import i2.e;
import p2.d;

/* compiled from: ResourceBitmapDecoder */
public class u implements i<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final d f5922a;

    /* renamed from: b  reason: collision with root package name */
    private final e f5923b;

    public u(d dVar, e eVar) {
        this.f5922a = dVar;
        this.f5923b = eVar;
    }

    /* renamed from: c */
    public c<Bitmap> a(Uri uri, int i10, int i11, g gVar) {
        c<Drawable> c10 = this.f5922a.a(uri, i10, i11, gVar);
        if (c10 == null) {
            return null;
        }
        return l.a(this.f5923b, c10.get(), i10, i11);
    }

    /* renamed from: d */
    public boolean b(Uri uri, g gVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
