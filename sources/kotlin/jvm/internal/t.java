package kotlin.jvm.internal;

import e9.b;
import e9.h;

/* compiled from: PropertyReference2 */
public abstract class t extends v implements h {
    public t(Class cls, String str, String str2, int i10) {
        super(c.NO_RECEIVER, cls, str, str2, i10);
    }

    public h.a b() {
        return ((h) getReflected()).b();
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return z.f(this);
    }

    public Object invoke(Object obj, Object obj2) {
        return e(obj, obj2);
    }
}
