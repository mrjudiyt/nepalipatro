package r2;

import android.graphics.Bitmap;
import d2.a;
import i2.e;

/* compiled from: GifBitmapProvider */
public final class b implements a.C0122a {

    /* renamed from: a  reason: collision with root package name */
    private final e f10822a;

    /* renamed from: b  reason: collision with root package name */
    private final i2.b f10823b;

    public b(e eVar, i2.b bVar) {
        this.f10822a = eVar;
        this.f10823b = bVar;
    }

    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        return this.f10822a.e(i10, i11, config);
    }

    public int[] b(int i10) {
        i2.b bVar = this.f10823b;
        if (bVar == null) {
            return new int[i10];
        }
        return (int[]) bVar.e(i10, int[].class);
    }

    public void c(Bitmap bitmap) {
        this.f10822a.c(bitmap);
    }

    public void d(byte[] bArr) {
        i2.b bVar = this.f10823b;
        if (bVar != null) {
            bVar.d(bArr);
        }
    }

    public byte[] e(int i10) {
        i2.b bVar = this.f10823b;
        if (bVar == null) {
            return new byte[i10];
        }
        return (byte[]) bVar.e(i10, byte[].class);
    }

    public void f(int[] iArr) {
        i2.b bVar = this.f10823b;
        if (bVar != null) {
            bVar.d(iArr);
        }
    }
}
