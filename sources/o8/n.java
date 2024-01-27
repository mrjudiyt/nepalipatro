package o8;

import java.io.Serializable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import y8.a;

/* compiled from: LazyJVM.kt */
final class n<T> implements g<T>, Serializable {

    /* renamed from: h  reason: collision with root package name */
    private a<? extends T> f16185h;

    /* renamed from: i  reason: collision with root package name */
    private volatile Object f16186i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f16187j;

    public n(a<? extends T> aVar, Object obj) {
        m.f(aVar, "initializer");
        this.f16185h = aVar;
        this.f16186i = p.f16188a;
        this.f16187j = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new d(getValue());
    }

    public boolean a() {
        return this.f16186i != p.f16188a;
    }

    public T getValue() {
        T t10;
        T t11 = this.f16186i;
        T t12 = p.f16188a;
        if (t11 != t12) {
            return t11;
        }
        synchronized (this.f16187j) {
            t10 = this.f16186i;
            if (t10 == t12) {
                a aVar = this.f16185h;
                m.c(aVar);
                t10 = aVar.invoke();
                this.f16186i = t10;
                this.f16185h = null;
            }
        }
        return t10;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(a aVar, Object obj, int i10, g gVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
