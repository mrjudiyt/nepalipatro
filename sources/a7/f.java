package a7;

import b7.a;
import java.util.LinkedList;

/* compiled from: State */
final class f {

    /* renamed from: e  reason: collision with root package name */
    static final f f13281e = new f(g.f13286b, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f13282a;

    /* renamed from: b  reason: collision with root package name */
    private final g f13283b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13284c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13285d;

    private f(g gVar, int i10, int i11, int i12) {
        this.f13283b = gVar;
        this.f13282a = i10;
        this.f13284c = i11;
        this.f13285d = i12;
    }

    /* access modifiers changed from: package-private */
    public f a(int i10) {
        g gVar = this.f13283b;
        int i11 = this.f13282a;
        int i12 = this.f13285d;
        if (i11 == 4 || i11 == 2) {
            int i13 = d.f13274c[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            gVar = gVar.a(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.f13284c;
        f fVar = new f(gVar, i11, i16 + 1, i12 + ((i16 == 0 || i16 == 31) ? 18 : i16 == 62 ? 9 : 8));
        return fVar.f13284c == 2078 ? fVar.b(i10 + 1) : fVar;
    }

    /* access modifiers changed from: package-private */
    public f b(int i10) {
        int i11 = this.f13284c;
        if (i11 == 0) {
            return this;
        }
        return new f(this.f13283b.b(i10 - i11, i11), this.f13282a, 0, this.f13285d);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f13284c;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f13285d;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f13282a;
    }

    /* access modifiers changed from: package-private */
    public boolean f(f fVar) {
        int i10;
        int i11 = this.f13285d + (d.f13274c[this.f13282a][fVar.f13282a] >> 16);
        int i12 = fVar.f13284c;
        if (i12 > 0 && ((i10 = this.f13284c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= fVar.f13285d;
    }

    /* access modifiers changed from: package-private */
    public f g(int i10, int i11) {
        int i12 = this.f13285d;
        g gVar = this.f13283b;
        int i13 = this.f13282a;
        if (i10 != i13) {
            int i14 = d.f13274c[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar = gVar.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVar.a(i11, i17), i10, 0, i12 + i17);
    }

    /* access modifiers changed from: package-private */
    public f h(int i10, int i11) {
        g gVar = this.f13283b;
        int i12 = this.f13282a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f13276e[i12][i10], i13).a(i11, 5), this.f13282a, 0, this.f13285d + i13 + 5);
    }

    /* access modifiers changed from: package-private */
    public a i(byte[] bArr) {
        LinkedList<g> linkedList = new LinkedList<>();
        for (g gVar = b(bArr.length).f13283b; gVar != null; gVar = gVar.d()) {
            linkedList.addFirst(gVar);
        }
        a aVar = new a();
        for (g c10 : linkedList) {
            c10.c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{d.f13273b[this.f13282a], Integer.valueOf(this.f13285d), Integer.valueOf(this.f13284c)});
    }
}
