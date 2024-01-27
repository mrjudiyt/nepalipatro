package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import e2.k;
import h2.c;
import i2.e;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation */
public class m implements k<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    private final k<Bitmap> f5897b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5898c;

    public m(k<Bitmap> kVar, boolean z10) {
        this.f5897b = kVar;
        this.f5898c = z10;
    }

    private c<Drawable> d(Context context, c<Bitmap> cVar) {
        return r.e(context.getResources(), cVar);
    }

    public void a(MessageDigest messageDigest) {
        this.f5897b.a(messageDigest);
    }

    public c<Drawable> b(Context context, c<Drawable> cVar, int i10, int i11) {
        e f10 = b.c(context).f();
        Drawable drawable = cVar.get();
        c<Bitmap> a10 = l.a(f10, drawable, i10, i11);
        if (a10 != null) {
            c<Bitmap> b10 = this.f5897b.b(context, a10, i10, i11);
            if (!b10.equals(a10)) {
                return d(context, b10);
            }
            b10.a();
            return cVar;
        } else if (!this.f5898c) {
            return cVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public k<BitmapDrawable> c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f5897b.equals(((m) obj).f5897b);
        }
        return false;
    }

    public int hashCode() {
        return this.f5897b.hashCode();
    }
}
