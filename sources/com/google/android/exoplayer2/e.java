package com.google.android.exoplayer2;

import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.t0;

/* compiled from: BasePlayer */
public abstract class e implements t0 {

    /* renamed from: a  reason: collision with root package name */
    protected final a1.c f6596a = new a1.c();

    protected e() {
    }

    private int s() {
        int g10 = g();
        if (g10 == 1) {
            return 0;
        }
        return g10;
    }

    public final void A() {
        d(false);
    }

    /* access modifiers changed from: protected */
    public t0.b n(t0.b bVar) {
        boolean z10 = true;
        t0.b.a d10 = new t0.b.a().b(bVar).d(3, !a()).d(4, x() && !a()).d(5, u() && !a()).d(6, !k().q() && (u() || !w() || x()) && !a()).d(7, t() && !a()).d(8, !k().q() && (t() || (w() && v())) && !a()).d(9, !a()).d(10, x() && !a());
        if (!x() || a()) {
            z10 = false;
        }
        return d10.d(11, z10).e();
    }

    public final long o() {
        a1 k10 = k();
        if (k10.q()) {
            return -9223372036854775807L;
        }
        return k10.n(h(), this.f6596a).d();
    }

    public final int p() {
        return k().p();
    }

    public final int q() {
        a1 k10 = k();
        if (k10.q()) {
            return -1;
        }
        return k10.e(h(), s(), l());
    }

    public final int r() {
        a1 k10 = k();
        if (k10.q()) {
            return -1;
        }
        return k10.l(h(), s(), l());
    }

    public final boolean t() {
        return q() != -1;
    }

    public final boolean u() {
        return r() != -1;
    }

    public final boolean v() {
        a1 k10 = k();
        return !k10.q() && k10.n(h(), this.f6596a).f6253i;
    }

    public final boolean w() {
        a1 k10 = k();
        return !k10.q() && k10.n(h(), this.f6596a).f();
    }

    public final boolean x() {
        a1 k10 = k();
        return !k10.q() && k10.n(h(), this.f6596a).f6252h;
    }

    public final void y(int i10) {
        c(i10, -9223372036854775807L);
    }

    public final void z() {
        int q10 = q();
        if (q10 != -1) {
            y(q10);
        }
    }
}
