package i5;

import a6.m0;
import android.os.Looper;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g;
import e4.k;
import g5.h;
import g5.t;
import i5.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ChunkSampleStream */
public class i<T extends j> implements t, v, Loader.b<f>, Loader.f {
    /* access modifiers changed from: private */
    public long A;
    private int B;
    /* access modifiers changed from: private */
    public a C;
    boolean D;

    /* renamed from: h  reason: collision with root package name */
    public final int f9318h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final int[] f9319i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final e4.j[] f9320j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final boolean[] f9321k;

    /* renamed from: l  reason: collision with root package name */
    private final T f9322l;

    /* renamed from: m  reason: collision with root package name */
    private final v.a<i<T>> f9323m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final l.a f9324n;

    /* renamed from: o  reason: collision with root package name */
    private final g f9325o;

    /* renamed from: p  reason: collision with root package name */
    private final Loader f9326p;

    /* renamed from: q  reason: collision with root package name */
    private final h f9327q;

    /* renamed from: r  reason: collision with root package name */
    private final ArrayList<a> f9328r;

    /* renamed from: s  reason: collision with root package name */
    private final List<a> f9329s;

    /* renamed from: t  reason: collision with root package name */
    private final u f9330t;

    /* renamed from: u  reason: collision with root package name */
    private final u[] f9331u;

    /* renamed from: v  reason: collision with root package name */
    private final c f9332v;

    /* renamed from: w  reason: collision with root package name */
    private f f9333w;

    /* renamed from: x  reason: collision with root package name */
    private e4.j f9334x;

    /* renamed from: y  reason: collision with root package name */
    private b<T> f9335y;

    /* renamed from: z  reason: collision with root package name */
    private long f9336z;

    /* compiled from: ChunkSampleStream */
    public final class a implements t {

        /* renamed from: h  reason: collision with root package name */
        public final i<T> f9337h;

        /* renamed from: i  reason: collision with root package name */
        private final u f9338i;

        /* renamed from: j  reason: collision with root package name */
        private final int f9339j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f9340k;

        public a(i<T> iVar, u uVar, int i10) {
            this.f9337h = iVar;
            this.f9338i = uVar;
            this.f9339j = i10;
        }

        private void b() {
            if (!this.f9340k) {
                i.this.f9324n.i(i.this.f9319i[this.f9339j], i.this.f9320j[this.f9339j], 0, (Object) null, i.this.A);
                this.f9340k = true;
            }
        }

        public void a() {
        }

        public void c() {
            a6.a.f(i.this.f9321k[this.f9339j]);
            i.this.f9321k[this.f9339j] = false;
        }

        public boolean e() {
            return !i.this.I() && this.f9338i.K(i.this.D);
        }

        public int i(k kVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (i.this.I()) {
                return -3;
            }
            if (i.this.C != null && i.this.C.i(this.f9339j + 1) <= this.f9338i.C()) {
                return -3;
            }
            b();
            return this.f9338i.S(kVar, decoderInputBuffer, i10, i.this.D);
        }

        public int o(long j10) {
            if (i.this.I()) {
                return 0;
            }
            int E = this.f9338i.E(j10, i.this.D);
            if (i.this.C != null) {
                E = Math.min(E, i.this.C.i(this.f9339j + 1) - this.f9338i.C());
            }
            this.f9338i.e0(E);
            if (E > 0) {
                b();
            }
            return E;
        }
    }

    /* compiled from: ChunkSampleStream */
    public interface b<T extends j> {
        void a(i<T> iVar);
    }

    public i(int i10, int[] iArr, e4.j[] jVarArr, T t10, v.a<i<T>> aVar, z5.b bVar, long j10, com.google.android.exoplayer2.drm.j jVar, i.a aVar2, g gVar, l.a aVar3) {
        this.f9318h = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f9319i = iArr;
        this.f9320j = jVarArr == null ? new e4.j[0] : jVarArr;
        this.f9322l = t10;
        this.f9323m = aVar;
        this.f9324n = aVar3;
        this.f9325o = gVar;
        this.f9326p = new Loader("ChunkSampleStream");
        this.f9327q = new h();
        ArrayList<a> arrayList = new ArrayList<>();
        this.f9328r = arrayList;
        this.f9329s = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f9331u = new u[length];
        this.f9321k = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        u[] uVarArr = new u[i12];
        u k10 = u.k(bVar, (Looper) a6.a.e(Looper.myLooper()), jVar, aVar2);
        this.f9330t = k10;
        iArr2[0] = i10;
        uVarArr[0] = k10;
        while (i11 < length) {
            u l10 = u.l(bVar);
            this.f9331u[i11] = l10;
            int i13 = i11 + 1;
            uVarArr[i13] = l10;
            iArr2[i13] = this.f9319i[i11];
            i11 = i13;
        }
        this.f9332v = new c(iArr2, uVarArr);
        this.f9336z = j10;
        this.A = j10;
    }

    private void B(int i10) {
        int min = Math.min(O(i10, 0), this.B);
        if (min > 0) {
            m0.B0(this.f9328r, 0, min);
            this.B -= min;
        }
    }

    private void C(int i10) {
        a6.a.f(!this.f9326p.j());
        int size = this.f9328r.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!G(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            long j10 = F().f9314h;
            a D2 = D(i10);
            if (this.f9328r.isEmpty()) {
                this.f9336z = this.A;
            }
            this.D = false;
            this.f9324n.D(this.f9318h, D2.f9313g, j10);
        }
    }

    private a D(int i10) {
        a aVar = this.f9328r.get(i10);
        ArrayList<a> arrayList = this.f9328r;
        m0.B0(arrayList, i10, arrayList.size());
        this.B = Math.max(this.B, this.f9328r.size());
        int i11 = 0;
        this.f9330t.u(aVar.i(0));
        while (true) {
            u[] uVarArr = this.f9331u;
            if (i11 >= uVarArr.length) {
                return aVar;
            }
            u uVar = uVarArr[i11];
            i11++;
            uVar.u(aVar.i(i11));
        }
    }

    private a F() {
        ArrayList<a> arrayList = this.f9328r;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean G(int i10) {
        int C2;
        a aVar = this.f9328r.get(i10);
        if (this.f9330t.C() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            u[] uVarArr = this.f9331u;
            if (i11 >= uVarArr.length) {
                return false;
            }
            C2 = uVarArr[i11].C();
            i11++;
        } while (C2 <= aVar.i(i11));
        return true;
    }

    private boolean H(f fVar) {
        return fVar instanceof a;
    }

    private void J() {
        int O = O(this.f9330t.C(), this.B - 1);
        while (true) {
            int i10 = this.B;
            if (i10 <= O) {
                this.B = i10 + 1;
                K(i10);
            } else {
                return;
            }
        }
    }

    private void K(int i10) {
        a aVar = this.f9328r.get(i10);
        e4.j jVar = aVar.f9310d;
        if (!jVar.equals(this.f9334x)) {
            this.f9324n.i(this.f9318h, jVar, aVar.f9311e, aVar.f9312f, aVar.f9313g);
        }
        this.f9334x = jVar;
    }

    private int O(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f9328r.size()) {
                return this.f9328r.size() - 1;
            }
        } while (this.f9328r.get(i11).i(0) <= i10);
        return i11 - 1;
    }

    private void Q() {
        this.f9330t.V();
        for (u V : this.f9331u) {
            V.V();
        }
    }

    public T E() {
        return this.f9322l;
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        return this.f9336z != -9223372036854775807L;
    }

    /* renamed from: L */
    public void k(f fVar, long j10, long j11, boolean z10) {
        f fVar2 = fVar;
        this.f9333w = null;
        this.C = null;
        h hVar = new h(fVar2.f9307a, fVar2.f9308b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f9325o.c(fVar2.f9307a);
        this.f9324n.r(hVar, fVar2.f9309c, this.f9318h, fVar2.f9310d, fVar2.f9311e, fVar2.f9312f, fVar2.f9313g, fVar2.f9314h);
        if (!z10) {
            if (I()) {
                Q();
            } else if (H(fVar)) {
                D(this.f9328r.size() - 1);
                if (this.f9328r.isEmpty()) {
                    this.f9336z = this.A;
                }
            }
            this.f9323m.i(this);
        }
    }

    /* renamed from: M */
    public void l(f fVar, long j10, long j11) {
        f fVar2 = fVar;
        this.f9333w = null;
        this.f9322l.g(fVar2);
        h hVar = new h(fVar2.f9307a, fVar2.f9308b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f9325o.c(fVar2.f9307a);
        this.f9324n.u(hVar, fVar2.f9309c, this.f9318h, fVar2.f9310d, fVar2.f9311e, fVar2.f9312f, fVar2.f9313g, fVar2.f9314h);
        this.f9323m.i(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f1  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.upstream.Loader.c s(i5.f r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            long r12 = r31.a()
            boolean r14 = r30.H(r31)
            java.util.ArrayList<i5.a> r2 = r0.f9328r
            int r2 = r2.size()
            r15 = 1
            int r10 = r2 + -1
            r11 = 0
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0027
            if (r14 == 0) goto L_0x0027
            boolean r2 = r0.G(r10)
            if (r2 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r8 = 0
            goto L_0x0028
        L_0x0027:
            r8 = 1
        L_0x0028:
            g5.h r9 = new g5.h
            long r3 = r1.f9307a
            com.google.android.exoplayer2.upstream.b r5 = r1.f9308b
            android.net.Uri r6 = r31.f()
            java.util.Map r7 = r31.e()
            r2 = r9
            r15 = r8
            r17 = r14
            r14 = r9
            r8 = r32
            r29 = r10
            r10 = r34
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            g5.i r2 = new g5.i
            int r3 = r1.f9309c
            int r4 = r0.f9318h
            e4.j r5 = r1.f9310d
            int r6 = r1.f9311e
            java.lang.Object r7 = r1.f9312f
            long r8 = r1.f9313g
            long r24 = e4.c.e(r8)
            long r8 = r1.f9314h
            long r26 = e4.c.e(r8)
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r26)
            com.google.android.exoplayer2.upstream.g$c r3 = new com.google.android.exoplayer2.upstream.g$c
            r4 = r36
            r5 = r37
            r3.<init>(r14, r2, r4, r5)
            T r2 = r0.f9322l
            com.google.android.exoplayer2.upstream.g r5 = r0.f9325o
            boolean r2 = r2.b(r1, r15, r3, r5)
            if (r2 == 0) goto L_0x00a6
            if (r15 == 0) goto L_0x009f
            com.google.android.exoplayer2.upstream.Loader$c r2 = com.google.android.exoplayer2.upstream.Loader.f7664f
            if (r17 == 0) goto L_0x00a7
            r6 = r29
            i5.a r6 = r0.D(r6)
            if (r6 != r1) goto L_0x008e
            r11 = 1
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            a6.a.f(r11)
            java.util.ArrayList<i5.a> r6 = r0.f9328r
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00a7
            long r6 = r0.A
            r0.f9336z = r6
            goto L_0x00a7
        L_0x009f:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r6 = "Ignoring attempt to cancel non-cancelable load."
            a6.p.h(r2, r6)
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            if (r2 != 0) goto L_0x00c0
            com.google.android.exoplayer2.upstream.g r2 = r0.f9325o
            long r2 = r2.a(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x00be
            r6 = 0
            com.google.android.exoplayer2.upstream.Loader$c r2 = com.google.android.exoplayer2.upstream.Loader.h(r6, r2)
            goto L_0x00c0
        L_0x00be:
            com.google.android.exoplayer2.upstream.Loader$c r2 = com.google.android.exoplayer2.upstream.Loader.f7665g
        L_0x00c0:
            boolean r3 = r2.c()
            r6 = 1
            r3 = r3 ^ r6
            com.google.android.exoplayer2.source.l$a r6 = r0.f9324n
            int r7 = r1.f9309c
            int r8 = r0.f9318h
            e4.j r9 = r1.f9310d
            int r10 = r1.f9311e
            java.lang.Object r11 = r1.f9312f
            long r12 = r1.f9313g
            long r4 = r1.f9314h
            r16 = r6
            r17 = r14
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r12
            r25 = r4
            r27 = r36
            r28 = r3
            r16.w(r17, r18, r19, r20, r21, r22, r23, r25, r27, r28)
            if (r3 == 0) goto L_0x0100
            r3 = 0
            r0.f9333w = r3
            com.google.android.exoplayer2.upstream.g r3 = r0.f9325o
            long r4 = r1.f9307a
            r3.c(r4)
            com.google.android.exoplayer2.source.v$a<i5.i<T>> r1 = r0.f9323m
            r1.i(r0)
        L_0x0100:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.i.s(i5.f, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$c");
    }

    public void P(b<T> bVar) {
        this.f9335y = bVar;
        this.f9330t.R();
        for (u R : this.f9331u) {
            R.R();
        }
        this.f9326p.m(this);
    }

    public void R(long j10) {
        boolean z10;
        this.A = j10;
        if (I()) {
            this.f9336z = j10;
            return;
        }
        a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f9328r.size()) {
                break;
            }
            a aVar2 = this.f9328r.get(i11);
            int i12 = (aVar2.f9313g > j10 ? 1 : (aVar2.f9313g == j10 ? 0 : -1));
            if (i12 == 0 && aVar2.f9280k == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (i12 > 0) {
                break;
            } else {
                i11++;
            }
        }
        if (aVar != null) {
            z10 = this.f9330t.Y(aVar.i(0));
        } else {
            z10 = this.f9330t.Z(j10, j10 < b());
        }
        if (z10) {
            this.B = O(this.f9330t.C(), 0);
            u[] uVarArr = this.f9331u;
            int length = uVarArr.length;
            while (i10 < length) {
                uVarArr[i10].Z(j10, true);
                i10++;
            }
            return;
        }
        this.f9336z = j10;
        this.D = false;
        this.f9328r.clear();
        this.B = 0;
        if (this.f9326p.j()) {
            this.f9330t.r();
            u[] uVarArr2 = this.f9331u;
            int length2 = uVarArr2.length;
            while (i10 < length2) {
                uVarArr2[i10].r();
                i10++;
            }
            this.f9326p.f();
            return;
        }
        this.f9326p.g();
        Q();
    }

    public i<T>.a S(long j10, int i10) {
        for (int i11 = 0; i11 < this.f9331u.length; i11++) {
            if (this.f9319i[i11] == i10) {
                a6.a.f(!this.f9321k[i11]);
                this.f9321k[i11] = true;
                this.f9331u[i11].Z(j10, true);
                return new a(this, this.f9331u[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    public void a() {
        this.f9326p.a();
        this.f9330t.N();
        if (!this.f9326p.j()) {
            this.f9322l.a();
        }
    }

    public long b() {
        if (I()) {
            return this.f9336z;
        }
        if (this.D) {
            return Long.MIN_VALUE;
        }
        return F().f9314h;
    }

    public long c(long j10, e4.v vVar) {
        return this.f9322l.c(j10, vVar);
    }

    public boolean d(long j10) {
        long j11;
        List<a> list;
        if (this.D || this.f9326p.j() || this.f9326p.i()) {
            return false;
        }
        boolean I = I();
        if (I) {
            list = Collections.emptyList();
            j11 = this.f9336z;
        } else {
            list = this.f9329s;
            j11 = F().f9314h;
        }
        this.f9322l.i(j10, j11, list, this.f9327q);
        h hVar = this.f9327q;
        boolean z10 = hVar.f9317b;
        f fVar = hVar.f9316a;
        hVar.a();
        if (z10) {
            this.f9336z = -9223372036854775807L;
            this.D = true;
            return true;
        } else if (fVar == null) {
            return false;
        } else {
            this.f9333w = fVar;
            if (H(fVar)) {
                a aVar = (a) fVar;
                if (I) {
                    long j12 = aVar.f9313g;
                    long j13 = this.f9336z;
                    if (j12 != j13) {
                        this.f9330t.b0(j13);
                        for (u b02 : this.f9331u) {
                            b02.b0(this.f9336z);
                        }
                    }
                    this.f9336z = -9223372036854775807L;
                }
                aVar.k(this.f9332v);
                this.f9328r.add(aVar);
            } else if (fVar instanceof m) {
                ((m) fVar).g(this.f9332v);
            }
            this.f9324n.A(new h(fVar.f9307a, fVar.f9308b, this.f9326p.n(fVar, this, this.f9325o.d(fVar.f9309c))), fVar.f9309c, this.f9318h, fVar.f9310d, fVar.f9311e, fVar.f9312f, fVar.f9313g, fVar.f9314h);
            return true;
        }
    }

    public boolean e() {
        return !I() && this.f9330t.K(this.D);
    }

    public boolean f() {
        return this.f9326p.j();
    }

    public long g() {
        if (this.D) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.f9336z;
        }
        long j10 = this.A;
        a F = F();
        if (!F.h()) {
            if (this.f9328r.size() > 1) {
                ArrayList<a> arrayList = this.f9328r;
                F = arrayList.get(arrayList.size() - 2);
            } else {
                F = null;
            }
        }
        if (F != null) {
            j10 = Math.max(j10, F.f9314h);
        }
        return Math.max(j10, this.f9330t.z());
    }

    public void h(long j10) {
        if (!this.f9326p.i() && !I()) {
            if (this.f9326p.j()) {
                f fVar = (f) a6.a.e(this.f9333w);
                if ((!H(fVar) || !G(this.f9328r.size() - 1)) && this.f9322l.d(j10, fVar, this.f9329s)) {
                    this.f9326p.f();
                    if (H(fVar)) {
                        this.C = (a) fVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int f10 = this.f9322l.f(j10, this.f9329s);
            if (f10 < this.f9328r.size()) {
                C(f10);
            }
        }
    }

    public int i(k kVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        if (I()) {
            return -3;
        }
        a aVar = this.C;
        if (aVar != null && aVar.i(0) <= this.f9330t.C()) {
            return -3;
        }
        J();
        return this.f9330t.S(kVar, decoderInputBuffer, i10, this.D);
    }

    public void j() {
        this.f9330t.T();
        for (u T : this.f9331u) {
            T.T();
        }
        this.f9322l.release();
        b<T> bVar = this.f9335y;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public int o(long j10) {
        if (I()) {
            return 0;
        }
        int E = this.f9330t.E(j10, this.D);
        a aVar = this.C;
        if (aVar != null) {
            E = Math.min(E, aVar.i(0) - this.f9330t.C());
        }
        this.f9330t.e0(E);
        J();
        return E;
    }

    public void t(long j10, boolean z10) {
        if (!I()) {
            int x10 = this.f9330t.x();
            this.f9330t.q(j10, z10, true);
            int x11 = this.f9330t.x();
            if (x11 > x10) {
                long y10 = this.f9330t.y();
                int i10 = 0;
                while (true) {
                    u[] uVarArr = this.f9331u;
                    if (i10 >= uVarArr.length) {
                        break;
                    }
                    uVarArr[i10].q(y10, z10, this.f9321k[i10]);
                    i10++;
                }
            }
            B(x11);
        }
    }
}
