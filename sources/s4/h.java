package s4;

import a6.a;
import a6.y;
import e4.j;
import g4.v;
import java.util.Arrays;
import s4.i;

/* compiled from: OpusReader */
final class h extends i {

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f11457o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n  reason: collision with root package name */
    private boolean f11458n;

    h() {
    }

    private long n(byte[] bArr) {
        byte b10 = bArr[0] & 255;
        byte b11 = b10 & 3;
        byte b12 = 2;
        if (b11 == 0) {
            b12 = 1;
        } else if (!(b11 == 1 || b11 == 2)) {
            b12 = bArr[1] & 63;
        }
        int i10 = b10 >> 3;
        int i11 = i10 & 3;
        return ((long) b12) * ((long) (i10 >= 16 ? 2500 << i11 : i10 >= 12 ? 10000 << (i11 & 1) : i11 == 3 ? 60000 : 10000 << i11));
    }

    public static boolean o(y yVar) {
        int a10 = yVar.a();
        byte[] bArr = f11457o;
        if (a10 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        yVar.j(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    public long f(y yVar) {
        return c(n(yVar.d()));
    }

    /* access modifiers changed from: protected */
    public boolean h(y yVar, long j10, i.b bVar) {
        boolean z10 = true;
        if (!this.f11458n) {
            byte[] copyOf = Arrays.copyOf(yVar.d(), yVar.f());
            int c10 = v.c(copyOf);
            bVar.f11472a = new j.b().e0("audio/opus").H(c10).f0(48000).T(v.a(copyOf)).E();
            this.f11458n = true;
            return true;
        }
        a.e(bVar.f11472a);
        if (yVar.m() != 1332770163) {
            z10 = false;
        }
        yVar.O(0);
        return z10;
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f11458n = false;
        }
    }
}
