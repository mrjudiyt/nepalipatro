package w;

import java.util.ArrayList;
import v.f;

/* compiled from: RunGroup */
class m {

    /* renamed from: h  reason: collision with root package name */
    public static int f12535h;

    /* renamed from: a  reason: collision with root package name */
    public int f12536a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12537b = false;

    /* renamed from: c  reason: collision with root package name */
    p f12538c = null;

    /* renamed from: d  reason: collision with root package name */
    p f12539d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<p> f12540e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    int f12541f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f12542g;

    public m(p pVar, int i10) {
        int i11 = f12535h;
        this.f12541f = i11;
        f12535h = i11 + 1;
        this.f12538c = pVar;
        this.f12539d = pVar;
        this.f12542g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f12511d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f12518k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f12518k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f12511d != pVar) {
                    j11 = Math.min(j11, c(fVar2, ((long) fVar2.f12513f) + j10));
                }
            }
        }
        if (fVar != pVar.f12569i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, c(pVar.f12568h, j12)), j12 - ((long) pVar.f12568h.f12513f));
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f12511d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f12518k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f12518k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f12511d != pVar) {
                    j11 = Math.max(j11, d(fVar2, ((long) fVar2.f12513f) + j10));
                }
            }
        }
        if (fVar != pVar.f12568h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, d(pVar.f12569i, j12)), j12 - ((long) pVar.f12569i.f12513f));
    }

    public void a(p pVar) {
        this.f12540e.add(pVar);
        this.f12539d = pVar;
    }

    public long b(f fVar, int i10) {
        int i11;
        long j10;
        p pVar = this.f12538c;
        long j11 = 0;
        if (pVar instanceof c) {
            if (((c) pVar).f12566f != i10) {
                return 0;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0;
            }
        } else if (!(pVar instanceof n)) {
            return 0;
        }
        f fVar2 = (i10 == 0 ? fVar.f12151e : fVar.f12153f).f12568h;
        f fVar3 = (i10 == 0 ? fVar.f12151e : fVar.f12153f).f12569i;
        boolean contains = pVar.f12568h.f12519l.contains(fVar2);
        boolean contains2 = this.f12538c.f12569i.f12519l.contains(fVar3);
        long j12 = this.f12538c.j();
        if (contains && contains2) {
            long d10 = d(this.f12538c.f12568h, 0);
            long c10 = c(this.f12538c.f12569i, 0);
            long j13 = d10 - j12;
            p pVar2 = this.f12538c;
            int i12 = pVar2.f12569i.f12513f;
            if (j13 >= ((long) (-i12))) {
                j13 += (long) i12;
            }
            int i13 = pVar2.f12568h.f12513f;
            long j14 = ((-c10) - j12) - ((long) i13);
            if (j14 >= ((long) i13)) {
                j14 -= (long) i13;
            }
            float o10 = pVar2.f12562b.o(i10);
            if (o10 > 0.0f) {
                j11 = (long) ((((float) j14) / o10) + (((float) j13) / (1.0f - o10)));
            }
            float f10 = (float) j11;
            long j15 = ((long) ((f10 * o10) + 0.5f)) + j12 + ((long) ((f10 * (1.0f - o10)) + 0.5f));
            p pVar3 = this.f12538c;
            j10 = ((long) pVar3.f12568h.f12513f) + j15;
            i11 = pVar3.f12569i.f12513f;
        } else if (contains) {
            f fVar4 = this.f12538c.f12568h;
            return Math.max(d(fVar4, (long) fVar4.f12513f), ((long) this.f12538c.f12568h.f12513f) + j12);
        } else if (contains2) {
            f fVar5 = this.f12538c.f12569i;
            return Math.max(-c(fVar5, (long) fVar5.f12513f), ((long) (-this.f12538c.f12569i.f12513f)) + j12);
        } else {
            p pVar4 = this.f12538c;
            j10 = ((long) pVar4.f12568h.f12513f) + pVar4.j();
            i11 = this.f12538c.f12569i.f12513f;
        }
        return j10 - ((long) i11);
    }
}
