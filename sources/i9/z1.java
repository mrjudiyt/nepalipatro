package i9;

import kotlin.jvm.internal.m;

/* compiled from: JobSupport.kt */
public abstract class z1 extends b0 implements b1, p1 {

    /* renamed from: k  reason: collision with root package name */
    public a2 f15008k;

    public boolean a() {
        return true;
    }

    public f2 c() {
        return null;
    }

    public void dispose() {
        u().C0(this);
    }

    public String toString() {
        return q0.a(this) + '@' + q0.b(this) + "[job@" + q0.b(u()) + ']';
    }

    public final a2 u() {
        a2 a2Var = this.f15008k;
        if (a2Var != null) {
            return a2Var;
        }
        m.x("job");
        return null;
    }

    public final void v(a2 a2Var) {
        this.f15008k = a2Var;
    }
}
