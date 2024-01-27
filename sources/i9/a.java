package i9;

import r8.d;
import r8.g;
import y8.l;
import y8.p;

/* compiled from: AbstractCoroutine.kt */
public abstract class a<T> extends a2 implements d<T>, l0 {

    /* renamed from: j  reason: collision with root package name */
    private final g f14894j;

    public a(g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            b0((u1) gVar.h(u1.f14995d));
        }
        this.f14894j = gVar.Y(this);
    }

    /* access modifiers changed from: protected */
    public String G() {
        return q0.a(this) + " was cancelled";
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        x(obj);
    }

    /* access modifiers changed from: protected */
    public void Q0(Throwable th, boolean z10) {
    }

    /* access modifiers changed from: protected */
    public void R0(T t10) {
    }

    public final <R> void S0(n0 n0Var, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        n0Var.d(pVar, r10, this);
    }

    public boolean a() {
        return super.a();
    }

    public final void a0(Throwable th) {
        i0.a(this.f14894j, th);
    }

    public final g getContext() {
        return this.f14894j;
    }

    public g i() {
        return this.f14894j;
    }

    public String n0() {
        String b10 = f0.b(this.f14894j);
        if (b10 == null) {
            return super.n0();
        }
        return '\"' + b10 + "\":" + super.n0();
    }

    public final void resumeWith(Object obj) {
        Object j02 = j0(c0.d(obj, (l) null, 1, (Object) null));
        if (j02 != b2.f14915b) {
            P0(j02);
        }
    }

    /* access modifiers changed from: protected */
    public final void x0(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            Q0(zVar.f15006a, zVar.a());
            return;
        }
        R0(obj);
    }
}
