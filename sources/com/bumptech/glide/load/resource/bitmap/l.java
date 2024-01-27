package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import h2.c;
import i2.e;
import i2.f;
import java.util.concurrent.locks.Lock;

/* compiled from: DrawableToBitmapConverter */
final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final e f5896a = new a();

    /* compiled from: DrawableToBitmapConverter */
    class a extends f {
        a() {
        }

        public void c(Bitmap bitmap) {
        }
    }

    static c<Bitmap> a(e eVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = b(eVar, current, i10, i11);
            z10 = true;
        } else {
            bitmap = null;
        }
        if (!z10) {
            eVar = f5896a;
        }
        return e.e(bitmap, eVar);
    }

    private static Bitmap b(e eVar, Drawable drawable, int i10, int i11) {
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to draw ");
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i11 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i10 = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i11 = drawable.getIntrinsicHeight();
            }
            Lock d10 = w.d();
            d10.lock();
            Bitmap d11 = eVar.d(i10, i11, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(d11);
                drawable.setBounds(0, 0, i10, i11);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return d11;
            } finally {
                d10.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to draw ");
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
