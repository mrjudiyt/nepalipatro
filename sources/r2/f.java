package r2;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import com.bumptech.glide.load.resource.bitmap.e;
import e2.k;
import h2.c;
import java.security.MessageDigest;

/* compiled from: GifDrawableTransformation */
public class f implements k<c> {

    /* renamed from: b  reason: collision with root package name */
    private final k<Bitmap> f10836b;

    /* JADX WARNING: type inference failed for: r1v0, types: [e2.k<android.graphics.Bitmap>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(e2.k<android.graphics.Bitmap> r1) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = a3.j.d(r1)
            e2.k r1 = (e2.k) r1
            r0.f10836b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.f.<init>(e2.k):void");
    }

    public void a(MessageDigest messageDigest) {
        this.f10836b.a(messageDigest);
    }

    public c<c> b(Context context, c<c> cVar, int i10, int i11) {
        c cVar2 = cVar.get();
        e eVar = new e(cVar2.e(), b.c(context).f());
        c<Bitmap> b10 = this.f10836b.b(context, eVar, i10, i11);
        if (!eVar.equals(b10)) {
            eVar.a();
        }
        cVar2.m(this.f10836b, b10.get());
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f10836b.equals(((f) obj).f10836b);
        }
        return false;
    }

    public int hashCode() {
        return this.f10836b.hashCode();
    }
}
