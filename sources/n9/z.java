package n9;

import i9.e2;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* compiled from: MainDispatchers.kt */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f15870a = true;

    private static final a0 a(Throwable th, String str) {
        if (f15870a) {
            return new a0(th, str);
        }
        if (th != null) {
            throw th;
        }
        d();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ a0 b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(e2 e2Var) {
        return e2Var.N0() instanceof a0;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final e2 e(x xVar, List<? extends x> list) {
        try {
            return xVar.b(list);
        } catch (Throwable th) {
            return a(th, xVar.a());
        }
    }
}
