package androidx.lifecycle;

import kotlin.jvm.internal.m;
import p0.a;

/* compiled from: ViewModelProvider.kt */
public final class j0 {
    public static final a a(l0 l0Var) {
        m.f(l0Var, "owner");
        if (l0Var instanceof g) {
            return ((g) l0Var).getDefaultViewModelCreationExtras();
        }
        return a.C0177a.f10444b;
    }
}
