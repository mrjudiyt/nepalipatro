package kotlin.jvm.internal;

import e9.b;
import e9.f;

/* compiled from: PropertyReference0 */
public abstract class p extends v implements f {
    public p(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return z.d(this);
    }

    public Object invoke() {
        return get();
    }
}
