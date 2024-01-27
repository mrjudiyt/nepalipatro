package i9;

import p8.f;

/* compiled from: EventLoop.common.kt */
public abstract class e1 extends g0 {

    /* renamed from: j  reason: collision with root package name */
    private long f14929j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14930k;

    /* renamed from: l  reason: collision with root package name */
    private f<x0<?>> f14931l;

    public static /* synthetic */ void O0(e1 e1Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            e1Var.N0(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long P0(boolean z10) {
        return z10 ? 4294967296L : 1;
    }

    public static /* synthetic */ void T0(e1 e1Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            e1Var.S0(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void N0(boolean z10) {
        long P0 = this.f14929j - P0(z10);
        this.f14929j = P0;
        if (P0 <= 0) {
            if (p0.a()) {
                if (!(this.f14929j == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f14930k) {
                shutdown();
            }
        }
    }

    public final void Q0(x0<?> x0Var) {
        f<x0<?>> fVar = this.f14931l;
        if (fVar == null) {
            fVar = new f<>();
            this.f14931l = fVar;
        }
        fVar.d(x0Var);
    }

    /* access modifiers changed from: protected */
    public long R0() {
        f<x0<?>> fVar = this.f14931l;
        if (fVar != null && !fVar.isEmpty()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    public final void S0(boolean z10) {
        this.f14929j += P0(z10);
        if (!z10) {
            this.f14930k = true;
        }
    }

    public final boolean U0() {
        return this.f14929j >= P0(true);
    }

    public final boolean V0() {
        f<x0<?>> fVar = this.f14931l;
        if (fVar != null) {
            return fVar.isEmpty();
        }
        return true;
    }

    public long W0() {
        return !X0() ? Long.MAX_VALUE : 0;
    }

    public final boolean X0() {
        x0 o10;
        f<x0<?>> fVar = this.f14931l;
        if (fVar == null || (o10 = fVar.o()) == null) {
            return false;
        }
        o10.run();
        return true;
    }

    public boolean Y0() {
        return false;
    }

    public void shutdown() {
    }
}
