package s2;

import android.graphics.Bitmap;
import e2.g;
import h2.c;
import java.io.ByteArrayOutputStream;
import o2.b;

/* compiled from: BitmapBytesTranscoder */
public class a implements e<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap.CompressFormat f11319a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11320b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public c<byte[]> a(c<Bitmap> cVar, g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cVar.get().compress(this.f11319a, this.f11320b, byteArrayOutputStream);
        cVar.a();
        return new b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f11319a = compressFormat;
        this.f11320b = i10;
    }
}
