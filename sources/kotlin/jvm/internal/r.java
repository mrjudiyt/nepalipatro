package kotlin.jvm.internal;

import e9.b;
import e9.g;

/* compiled from: PropertyReference1 */
public abstract class r extends v implements g {
    public r(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    public g.a b() {
        return ((g) getReflected()).b();
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return z.e(this);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }
}
