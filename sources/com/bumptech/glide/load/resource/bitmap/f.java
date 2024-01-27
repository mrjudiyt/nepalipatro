package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import e2.k;
import h2.c;
import i2.e;

/* compiled from: BitmapTransformation */
public abstract class f implements k<Bitmap> {
    public final c<Bitmap> b(Context context, c<Bitmap> cVar, int i10, int i11) {
        if (a3.k.s(i10, i11)) {
            e f10 = b.c(context).f();
            Bitmap bitmap = cVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(f10, bitmap, i10, i11);
            return bitmap.equals(c10) ? cVar : e.e(c10, f10);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    public abstract Bitmap c(e eVar, Bitmap bitmap, int i10, int i11);
}
