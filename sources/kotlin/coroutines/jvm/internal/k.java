package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import r8.d;

/* compiled from: ContinuationImpl.kt */
public abstract class k extends d implements h<Object> {
    private final int arity;

    public k(int i10, d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String g10 = z.g(this);
        m.e(g10, "renderLambdaToString(this)");
        return g10;
    }

    public k(int i10) {
        this(i10, (d<Object>) null);
    }
}
