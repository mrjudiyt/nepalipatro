package k4;

import a5.b;
import a6.m0;
import a6.p;
import a6.x;
import e4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x4.a;

/* compiled from: FlacStreamMetadata */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final int f9604a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9605b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9606c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9607d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9608e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9609f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9610g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9611h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9612i;

    /* renamed from: j  reason: collision with root package name */
    public final long f9613j;

    /* renamed from: k  reason: collision with root package name */
    public final a f9614k;

    /* renamed from: l  reason: collision with root package name */
    private final x4.a f9615l;

    /* compiled from: FlacStreamMetadata */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f9616a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f9617b;

        public a(long[] jArr, long[] jArr2) {
            this.f9616a = jArr;
            this.f9617b = jArr2;
        }
    }

    public s(byte[] bArr, int i10) {
        x xVar = new x(bArr);
        xVar.p(i10 * 8);
        this.f9604a = xVar.h(16);
        this.f9605b = xVar.h(16);
        this.f9606c = xVar.h(24);
        this.f9607d = xVar.h(24);
        int h10 = xVar.h(20);
        this.f9608e = h10;
        this.f9609f = k(h10);
        this.f9610g = xVar.h(3) + 1;
        int h11 = xVar.h(5) + 1;
        this.f9611h = h11;
        this.f9612i = f(h11);
        this.f9613j = xVar.j(36);
        this.f9614k = null;
        this.f9615l = null;
    }

    private static x4.a a(List<String> list, List<a5.a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] F0 = m0.F0(str, "=");
            if (F0.length != 2) {
                String valueOf = String.valueOf(str);
                p.h("FlacStreamMetadata", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new b(F0[0], F0[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x4.a((List<? extends a.b>) arrayList);
    }

    private static int f(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int k(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public s b(List<a5.a> list) {
        return new s(this.f9604a, this.f9605b, this.f9606c, this.f9607d, this.f9608e, this.f9610g, this.f9611h, this.f9613j, this.f9614k, i(a(Collections.emptyList(), list)));
    }

    public s c(a aVar) {
        return new s(this.f9604a, this.f9605b, this.f9606c, this.f9607d, this.f9608e, this.f9610g, this.f9611h, this.f9613j, aVar, this.f9615l);
    }

    public s d(List<String> list) {
        return new s(this.f9604a, this.f9605b, this.f9606c, this.f9607d, this.f9608e, this.f9610g, this.f9611h, this.f9613j, this.f9614k, i(a(list, Collections.emptyList())));
    }

    public long e() {
        long j10;
        long j11;
        int i10 = this.f9607d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f9606c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f9604a;
            j10 = ((((i11 != this.f9605b || i11 <= 0) ? 4096 : (long) i11) * ((long) this.f9610g)) * ((long) this.f9611h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long g() {
        long j10 = this.f9613j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f9608e);
    }

    public j h(byte[] bArr, x4.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f9607d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new j.b().e0("audio/flac").W(i10).H(this.f9610g).f0(this.f9608e).T(Collections.singletonList(bArr)).X(i(aVar)).E();
    }

    public x4.a i(x4.a aVar) {
        x4.a aVar2 = this.f9615l;
        return aVar2 == null ? aVar : aVar2.c(aVar);
    }

    public long j(long j10) {
        return m0.s((j10 * ((long) this.f9608e)) / 1000000, 0, this.f9613j - 1);
    }

    private s(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, x4.a aVar2) {
        this.f9604a = i10;
        this.f9605b = i11;
        this.f9606c = i12;
        this.f9607d = i13;
        this.f9608e = i14;
        this.f9609f = k(i14);
        this.f9610g = i15;
        this.f9611h = i16;
        this.f9612i = f(i16);
        this.f9613j = j10;
        this.f9614k = aVar;
        this.f9615l = aVar2;
    }
}
