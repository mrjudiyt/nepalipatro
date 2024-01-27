package w;

import v.a;
import v.e;
import w.f;

/* compiled from: HelperReferences */
class k extends p {
    public k(e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f12568h.f12518k.add(fVar);
        fVar.f12519l.add(this.f12568h);
    }

    public void a(d dVar) {
        a aVar = (a) this.f12562b;
        int s12 = aVar.s1();
        int i10 = 0;
        int i11 = -1;
        for (f fVar : this.f12568h.f12519l) {
            int i12 = fVar.f12514g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (s12 == 0 || s12 == 2) {
            this.f12568h.d(i11 + aVar.t1());
        } else {
            this.f12568h.d(i10 + aVar.t1());
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e eVar = this.f12562b;
        if (eVar instanceof a) {
            this.f12568h.f12509b = true;
            a aVar = (a) eVar;
            int s12 = aVar.s1();
            boolean r12 = aVar.r1();
            int i10 = 0;
            if (s12 == 0) {
                this.f12568h.f12512e = f.a.LEFT;
                while (i10 < aVar.M0) {
                    e eVar2 = aVar.L0[i10];
                    if (r12 || eVar2.T() != 8) {
                        f fVar = eVar2.f12151e.f12568h;
                        fVar.f12518k.add(this.f12568h);
                        this.f12568h.f12519l.add(fVar);
                    }
                    i10++;
                }
                q(this.f12562b.f12151e.f12568h);
                q(this.f12562b.f12151e.f12569i);
            } else if (s12 == 1) {
                this.f12568h.f12512e = f.a.RIGHT;
                while (i10 < aVar.M0) {
                    e eVar3 = aVar.L0[i10];
                    if (r12 || eVar3.T() != 8) {
                        f fVar2 = eVar3.f12151e.f12569i;
                        fVar2.f12518k.add(this.f12568h);
                        this.f12568h.f12519l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f12562b.f12151e.f12568h);
                q(this.f12562b.f12151e.f12569i);
            } else if (s12 == 2) {
                this.f12568h.f12512e = f.a.TOP;
                while (i10 < aVar.M0) {
                    e eVar4 = aVar.L0[i10];
                    if (r12 || eVar4.T() != 8) {
                        f fVar3 = eVar4.f12153f.f12568h;
                        fVar3.f12518k.add(this.f12568h);
                        this.f12568h.f12519l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f12562b.f12153f.f12568h);
                q(this.f12562b.f12153f.f12569i);
            } else if (s12 == 3) {
                this.f12568h.f12512e = f.a.BOTTOM;
                while (i10 < aVar.M0) {
                    e eVar5 = aVar.L0[i10];
                    if (r12 || eVar5.T() != 8) {
                        f fVar4 = eVar5.f12153f.f12569i;
                        fVar4.f12518k.add(this.f12568h);
                        this.f12568h.f12519l.add(fVar4);
                    }
                    i10++;
                }
                q(this.f12562b.f12153f.f12568h);
                q(this.f12562b.f12153f.f12569i);
            }
        }
    }

    public void e() {
        e eVar = this.f12562b;
        if (eVar instanceof a) {
            int s12 = ((a) eVar).s1();
            if (s12 == 0 || s12 == 1) {
                this.f12562b.j1(this.f12568h.f12514g);
            } else {
                this.f12562b.k1(this.f12568h.f12514g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f12563c = null;
        this.f12568h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
