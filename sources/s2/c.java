package s2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e2.g;
import i2.e;

/* compiled from: DrawableBytesTranscoder */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final e f11322a;

    /* renamed from: b  reason: collision with root package name */
    private final e<Bitmap, byte[]> f11323b;

    /* renamed from: c  reason: collision with root package name */
    private final e<r2.c, byte[]> f11324c;

    public c(e eVar, e<Bitmap, byte[]> eVar2, e<r2.c, byte[]> eVar3) {
        this.f11322a = eVar;
        this.f11323b = eVar2;
        this.f11324c = eVar3;
    }

    private static h2.c<r2.c> b(h2.c<Drawable> cVar) {
        return cVar;
    }

    public h2.c<byte[]> a(h2.c<Drawable> cVar, g gVar) {
        Drawable drawable = cVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f11323b.a(com.bumptech.glide.load.resource.bitmap.e.e(((BitmapDrawable) drawable).getBitmap(), this.f11322a), gVar);
        }
        if (drawable instanceof r2.c) {
            return this.f11324c.a(b(cVar), gVar);
        }
        return null;
    }
}
