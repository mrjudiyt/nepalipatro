package p0;

import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.m;
import x8.a;
import y8.l;

/* compiled from: InitializerViewModelFactory.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<f<?>> f10446a = new ArrayList();

    public final <T extends g0> void a(e9.c<T> cVar, l<? super a, ? extends T> lVar) {
        m.f(cVar, "clazz");
        m.f(lVar, "initializer");
        this.f10446a.add(new f(a.a(cVar), lVar));
    }

    public final h0.b b() {
        f[] fVarArr = (f[]) this.f10446a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
