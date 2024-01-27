package androidx.lifecycle;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: ViewModelStore.kt */
public class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, g0> f3506a = new LinkedHashMap();

    public final void a() {
        for (g0 a10 : this.f3506a.values()) {
            a10.a();
        }
        this.f3506a.clear();
    }

    public final g0 b(String str) {
        m.f(str, Constants.KEY);
        return this.f3506a.get(str);
    }

    public final Set<String> c() {
        return new HashSet(this.f3506a.keySet());
    }

    public final void d(String str, g0 g0Var) {
        m.f(str, Constants.KEY);
        m.f(g0Var, "viewModel");
        g0 put = this.f3506a.put(str, g0Var);
        if (put != null) {
            put.d();
        }
    }
}
