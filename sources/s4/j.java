package s4;

import a6.y;
import com.google.android.exoplayer2.ParserException;
import e4.j;
import java.util.ArrayList;
import java.util.Arrays;
import k4.d0;
import s4.i;

/* compiled from: VorbisReader */
final class j extends i {

    /* renamed from: n  reason: collision with root package name */
    private a f11474n;

    /* renamed from: o  reason: collision with root package name */
    private int f11475o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11476p;

    /* renamed from: q  reason: collision with root package name */
    private d0.d f11477q;

    /* renamed from: r  reason: collision with root package name */
    private d0.b f11478r;

    /* compiled from: VorbisReader */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d0.d f11479a;

        /* renamed from: b  reason: collision with root package name */
        public final d0.b f11480b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f11481c;

        /* renamed from: d  reason: collision with root package name */
        public final d0.c[] f11482d;

        /* renamed from: e  reason: collision with root package name */
        public final int f11483e;

        public a(d0.d dVar, d0.b bVar, byte[] bArr, d0.c[] cVarArr, int i10) {
            this.f11479a = dVar;
            this.f11480b = bVar;
            this.f11481c = bArr;
            this.f11482d = cVarArr;
            this.f11483e = i10;
        }
    }

    j() {
    }

    static void n(y yVar, long j10) {
        if (yVar.b() < yVar.f() + 4) {
            yVar.L(Arrays.copyOf(yVar.d(), yVar.f() + 4));
        } else {
            yVar.N(yVar.f() + 4);
        }
        byte[] d10 = yVar.d();
        d10[yVar.f() - 4] = (byte) ((int) (j10 & 255));
        d10[yVar.f() - 3] = (byte) ((int) ((j10 >>> 8) & 255));
        d10[yVar.f() - 2] = (byte) ((int) ((j10 >>> 16) & 255));
        d10[yVar.f() - 1] = (byte) ((int) ((j10 >>> 24) & 255));
    }

    private static int o(byte b10, a aVar) {
        if (!aVar.f11482d[p(b10, aVar.f11483e, 1)].f9557a) {
            return aVar.f11479a.f9567g;
        }
        return aVar.f11479a.f9568h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(y yVar) {
        try {
            return d0.l(1, yVar, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void e(long j10) {
        super.e(j10);
        int i10 = 0;
        this.f11476p = j10 != 0;
        d0.d dVar = this.f11477q;
        if (dVar != null) {
            i10 = dVar.f9567g;
        }
        this.f11475o = i10;
    }

    /* access modifiers changed from: protected */
    public long f(y yVar) {
        int i10 = 0;
        if ((yVar.d()[0] & 1) == 1) {
            return -1;
        }
        int o10 = o(yVar.d()[0], (a) a6.a.h(this.f11474n));
        if (this.f11476p) {
            i10 = (this.f11475o + o10) / 4;
        }
        long j10 = (long) i10;
        n(yVar, j10);
        this.f11476p = true;
        this.f11475o = o10;
        return j10;
    }

    /* access modifiers changed from: protected */
    public boolean h(y yVar, long j10, i.b bVar) {
        if (this.f11474n != null) {
            a6.a.e(bVar.f11472a);
            return false;
        }
        a q10 = q(yVar);
        this.f11474n = q10;
        if (q10 == null) {
            return true;
        }
        d0.d dVar = q10.f11479a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f9570j);
        arrayList.add(q10.f11481c);
        bVar.f11472a = new j.b().e0("audio/vorbis").G(dVar.f9565e).Z(dVar.f9564d).H(dVar.f9562b).f0(dVar.f9563c).T(arrayList).E();
        return true;
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f11474n = null;
            this.f11477q = null;
            this.f11478r = null;
        }
        this.f11475o = 0;
        this.f11476p = false;
    }

    /* access modifiers changed from: package-private */
    public a q(y yVar) {
        d0.d dVar = this.f11477q;
        if (dVar == null) {
            this.f11477q = d0.j(yVar);
            return null;
        }
        d0.b bVar = this.f11478r;
        if (bVar == null) {
            this.f11478r = d0.h(yVar);
            return null;
        }
        byte[] bArr = new byte[yVar.f()];
        System.arraycopy(yVar.d(), 0, bArr, 0, yVar.f());
        d0.c[] k10 = d0.k(yVar, dVar.f9562b);
        return new a(dVar, bVar, bArr, k10, d0.a(k10.length - 1));
    }
}
