package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: Lambda.kt */
public abstract class n<R> implements h<R>, Serializable {
    private final int arity;

    public n(int i10) {
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String h10 = z.h(this);
        m.e(h10, "renderLambdaToString(this)");
        return h10;
    }
}
