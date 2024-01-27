package i9;

/* compiled from: MainCoroutineDispatcher.kt */
public abstract class e2 extends g0 {
    public abstract e2 N0();

    /* access modifiers changed from: protected */
    public final String O0() {
        e2 e2Var;
        e2 c10 = a1.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            e2Var = c10.N0();
        } catch (UnsupportedOperationException unused) {
            e2Var = null;
        }
        if (this == e2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String O0 = O0();
        if (O0 != null) {
            return O0;
        }
        return q0.a(this) + '@' + q0.b(this);
    }
}
