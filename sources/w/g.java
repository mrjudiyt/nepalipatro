package w;

import w.f;

/* compiled from: DimensionDependency */
class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f12529m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f12512e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f12512e = f.a.VERTICAL_DIMENSION;
        }
    }

    public void d(int i10) {
        if (!this.f12517j) {
            this.f12517j = true;
            this.f12514g = i10;
            for (d next : this.f12518k) {
                next.a(next);
            }
        }
    }
}
