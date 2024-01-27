package s2;

import a3.j;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.resource.bitmap.r;
import e2.g;
import h2.c;

/* compiled from: BitmapDrawableTranscoder */
public class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f11321a;

    public b(Resources resources) {
        this.f11321a = (Resources) j.d(resources);
    }

    public c<BitmapDrawable> a(c<Bitmap> cVar, g gVar) {
        return r.e(this.f11321a, cVar);
    }
}
