package w;

import v.e;
import v.g;

/* compiled from: GuidelineReference */
class j extends p {
    public j(e eVar) {
        super(eVar);
        eVar.f12151e.f();
        eVar.f12153f.f();
        this.f12566f = ((g) eVar).p1();
    }

    private void q(f fVar) {
        this.f12568h.f12518k.add(fVar);
        fVar.f12519l.add(this.f12568h);
    }

    public void a(d dVar) {
        f fVar = this.f12568h;
        if (fVar.f12510c && !fVar.f12517j) {
            this.f12568h.d((int) ((((float) fVar.f12519l.get(0).f12514g) * ((g) this.f12562b).s1()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        g gVar = (g) this.f12562b;
        int q12 = gVar.q1();
        int r12 = gVar.r1();
        gVar.s1();
        if (gVar.p1() == 1) {
            if (q12 != -1) {
                this.f12568h.f12519l.add(this.f12562b.f12144a0.f12151e.f12568h);
                this.f12562b.f12144a0.f12151e.f12568h.f12518k.add(this.f12568h);
                this.f12568h.f12513f = q12;
            } else if (r12 != -1) {
                this.f12568h.f12519l.add(this.f12562b.f12144a0.f12151e.f12569i);
                this.f12562b.f12144a0.f12151e.f12569i.f12518k.add(this.f12568h);
                this.f12568h.f12513f = -r12;
            } else {
                f fVar = this.f12568h;
                fVar.f12509b = true;
                fVar.f12519l.add(this.f12562b.f12144a0.f12151e.f12569i);
                this.f12562b.f12144a0.f12151e.f12569i.f12518k.add(this.f12568h);
            }
            q(this.f12562b.f12151e.f12568h);
            q(this.f12562b.f12151e.f12569i);
            return;
        }
        if (q12 != -1) {
            this.f12568h.f12519l.add(this.f12562b.f12144a0.f12153f.f12568h);
            this.f12562b.f12144a0.f12153f.f12568h.f12518k.add(this.f12568h);
            this.f12568h.f12513f = q12;
        } else if (r12 != -1) {
            this.f12568h.f12519l.add(this.f12562b.f12144a0.f12153f.f12569i);
            this.f12562b.f12144a0.f12153f.f12569i.f12518k.add(this.f12568h);
            this.f12568h.f12513f = -r12;
        } else {
            f fVar2 = this.f12568h;
            fVar2.f12509b = true;
            fVar2.f12519l.add(this.f12562b.f12144a0.f12153f.f12569i);
            this.f12562b.f12144a0.f12153f.f12569i.f12518k.add(this.f12568h);
        }
        q(this.f12562b.f12153f.f12568h);
        q(this.f12562b.f12153f.f12569i);
    }

    public void e() {
        if (((g) this.f12562b).p1() == 1) {
            this.f12562b.j1(this.f12568h.f12514g);
        } else {
            this.f12562b.k1(this.f12568h.f12514g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f12568h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
