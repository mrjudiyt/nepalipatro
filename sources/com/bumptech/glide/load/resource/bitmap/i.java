package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import e2.e;
import java.security.MessageDigest;

/* compiled from: CenterCrop */
public class i extends f {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f5869b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(e.f7997a);

    public void a(MessageDigest messageDigest) {
        messageDigest.update(f5869b);
    }

    /* access modifiers changed from: protected */
    public Bitmap c(i2.e eVar, Bitmap bitmap, int i10, int i11) {
        return w.b(eVar, bitmap, i10, i11);
    }

    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    public int hashCode() {
        return -599754482;
    }
}
