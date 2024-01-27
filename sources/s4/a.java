package s4;

import a6.m0;
import java.io.EOFException;
import java.io.IOException;
import k4.j;
import k4.l;
import k4.y;
import k4.z;

/* compiled from: DefaultOggSeeker */
final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final f f11418a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f11419b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f11420c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final i f11421d;

    /* renamed from: e  reason: collision with root package name */
    private int f11422e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f11423f;

    /* renamed from: g  reason: collision with root package name */
    private long f11424g;

    /* renamed from: h  reason: collision with root package name */
    private long f11425h;

    /* renamed from: i  reason: collision with root package name */
    private long f11426i;

    /* renamed from: j  reason: collision with root package name */
    private long f11427j;

    /* renamed from: k  reason: collision with root package name */
    private long f11428k;

    /* renamed from: l  reason: collision with root package name */
    private long f11429l;

    /* compiled from: DefaultOggSeeker */
    private final class b implements y {
        private b() {
        }

        public boolean f() {
            return true;
        }

        public y.a h(long j10) {
            return new y.a(new z(j10, m0.s((a.this.f11419b + ((a.this.f11421d.c(j10) * (a.this.f11420c - a.this.f11419b)) / a.this.f11423f)) - 30000, a.this.f11419b, a.this.f11420c - 1)));
        }

        public long i() {
            return a.this.f11421d.b(a.this.f11423f);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        a6.a.a(j10 >= 0 && j11 > j10);
        this.f11421d = iVar;
        this.f11419b = j10;
        this.f11420c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f11423f = j13;
            this.f11422e = 4;
        } else {
            this.f11422e = 0;
        }
        this.f11418a = new f();
    }

    private long i(j jVar) {
        j jVar2 = jVar;
        if (this.f11426i == this.f11427j) {
            return -1;
        }
        long position = jVar.getPosition();
        if (!this.f11418a.d(jVar2, this.f11427j)) {
            long j10 = this.f11426i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f11418a.a(jVar2, false);
        jVar.k();
        long j11 = this.f11425h;
        f fVar = this.f11418a;
        long j12 = fVar.f11448c;
        long j13 = j11 - j12;
        int i10 = fVar.f11453h + fVar.f11454i;
        if (0 <= j13 && j13 < 72000) {
            return -1;
        }
        int i11 = (j13 > 0 ? 1 : (j13 == 0 ? 0 : -1));
        if (i11 < 0) {
            this.f11427j = position;
            this.f11429l = j12;
        } else {
            this.f11426i = jVar.getPosition() + ((long) i10);
            this.f11428k = this.f11418a.f11448c;
        }
        long j14 = this.f11427j;
        long j15 = this.f11426i;
        if (j14 - j15 < 100000) {
            this.f11427j = j15;
            return j15;
        }
        long j16 = ((long) i10) * (i11 <= 0 ? 2 : 1);
        long j17 = this.f11427j;
        long j18 = this.f11426i;
        return m0.s((jVar.getPosition() - j16) + ((j13 * (j17 - j18)) / (this.f11429l - this.f11428k)), j18, j17 - 1);
    }

    private void k(j jVar) {
        while (true) {
            this.f11418a.c(jVar);
            this.f11418a.a(jVar, false);
            f fVar = this.f11418a;
            if (fVar.f11448c > this.f11425h) {
                jVar.k();
                return;
            }
            jVar.l(fVar.f11453h + fVar.f11454i);
            this.f11426i = jVar.getPosition();
            this.f11428k = this.f11418a.f11448c;
        }
    }

    public long a(j jVar) {
        int i10 = this.f11422e;
        if (i10 == 0) {
            long position = jVar.getPosition();
            this.f11424g = position;
            this.f11422e = 1;
            long j10 = this.f11420c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(jVar);
                if (i11 != -1) {
                    return i11;
                }
                this.f11422e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            k(jVar);
            this.f11422e = 4;
            return -(this.f11428k + 2);
        }
        this.f11423f = j(jVar);
        this.f11422e = 4;
        return this.f11424g;
    }

    public void c(long j10) {
        this.f11425h = m0.s(j10, 0, this.f11423f - 1);
        this.f11422e = 2;
        this.f11426i = this.f11419b;
        this.f11427j = this.f11420c;
        this.f11428k = 0;
        this.f11429l = this.f11423f;
    }

    /* renamed from: h */
    public b b() {
        if (this.f11423f != 0) {
            return new b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public long j(j jVar) {
        this.f11418a.b();
        if (this.f11418a.c(jVar)) {
            this.f11418a.a(jVar, false);
            f fVar = this.f11418a;
            jVar.l(fVar.f11453h + fVar.f11454i);
            long j10 = this.f11418a.f11448c;
            while (true) {
                f fVar2 = this.f11418a;
                if ((fVar2.f11447b & 4) == 4 || !fVar2.c(jVar) || jVar.getPosition() >= this.f11420c || !this.f11418a.a(jVar, true)) {
                    break;
                }
                f fVar3 = this.f11418a;
                if (!l.e(jVar, fVar3.f11453h + fVar3.f11454i)) {
                    break;
                }
                j10 = this.f11418a.f11448c;
            }
            return j10;
        }
        throw new EOFException();
    }
}
