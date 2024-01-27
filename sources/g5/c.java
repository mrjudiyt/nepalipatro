package g5;

import com.google.android.exoplayer2.source.v;

/* compiled from: CompositeSequenceableLoader */
public class c implements v {

    /* renamed from: h  reason: collision with root package name */
    protected final v[] f8884h;

    public c(v[] vVarArr) {
        this.f8884h = vVarArr;
    }

    public final long b() {
        long j10 = Long.MAX_VALUE;
        for (v b10 : this.f8884h) {
            long b11 = b10.b();
            if (b11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, b11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public boolean d(long j10) {
        long j11 = j10;
        boolean z10 = false;
        while (true) {
            long b10 = b();
            if (b10 != Long.MIN_VALUE) {
                boolean z11 = false;
                for (v vVar : this.f8884h) {
                    long b11 = vVar.b();
                    boolean z12 = b11 != Long.MIN_VALUE && b11 <= j11;
                    if (b11 == b10 || z12) {
                        z11 |= vVar.d(j11);
                    }
                }
                z10 |= z11;
                if (!z11) {
                    break;
                }
            } else {
                break;
            }
        }
        return z10;
    }

    public boolean f() {
        for (v f10 : this.f8884h) {
            if (f10.f()) {
                return true;
            }
        }
        return false;
    }

    public final long g() {
        long j10 = Long.MAX_VALUE;
        for (v g10 : this.f8884h) {
            long g11 = g10.g();
            if (g11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, g11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public final void h(long j10) {
        for (v h10 : this.f8884h) {
            h10.h(j10);
        }
    }
}
