package d2;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* compiled from: GifDecoder */
public interface a {

    /* renamed from: d2.a$a  reason: collision with other inner class name */
    /* compiled from: GifDecoder */
    public interface C0122a {
        Bitmap a(int i10, int i11, Bitmap.Config config);

        int[] b(int i10);

        void c(Bitmap bitmap);

        void d(byte[] bArr);

        byte[] e(int i10);

        void f(int[] iArr);
    }

    Bitmap a();

    void b();

    int c();

    void clear();

    int d();

    void e(Bitmap.Config config);

    void f();

    int g();

    ByteBuffer getData();

    int h();
}
