package p0;

import androidx.lifecycle.g0;
import kotlin.jvm.internal.m;
import y8.l;

/* compiled from: InitializerViewModelFactory.kt */
public final class f<T extends g0> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f10448a;

    /* renamed from: b  reason: collision with root package name */
    private final l<a, T> f10449b;

    public f(Class<T> cls, l<? super a, ? extends T> lVar) {
        m.f(cls, "clazz");
        m.f(lVar, "initializer");
        this.f10448a = cls;
        this.f10449b = lVar;
    }

    public final Class<T> a() {
        return this.f10448a;
    }

    public final l<a, T> b() {
        return this.f10449b;
    }
}
