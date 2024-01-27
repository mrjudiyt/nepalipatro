package p0;

import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import com.facebook.bolts.AppLinks;
import kotlin.jvm.internal.m;

/* compiled from: InitializerViewModelFactory.kt */
public final class b implements h0.b {

    /* renamed from: b  reason: collision with root package name */
    private final f<?>[] f10445b;

    public b(f<?>... fVarArr) {
        m.f(fVarArr, "initializers");
        this.f10445b = fVarArr;
    }

    public /* synthetic */ g0 a(Class cls) {
        return i0.a(this, cls);
    }

    public <T extends g0> T b(Class<T> cls, a aVar) {
        m.f(cls, "modelClass");
        m.f(aVar, AppLinks.KEY_NAME_EXTRAS);
        T t10 = null;
        for (f<?> fVar : this.f10445b) {
            if (m.a(fVar.a(), cls)) {
                T invoke = fVar.b().invoke(aVar);
                t10 = invoke instanceof g0 ? (g0) invoke : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
