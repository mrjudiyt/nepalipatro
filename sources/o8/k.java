package o8;

import java.io.Serializable;
import kotlin.jvm.internal.m;

/* compiled from: Tuples.kt */
public final class k<A, B> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    private final A f16181h;

    /* renamed from: i  reason: collision with root package name */
    private final B f16182i;

    public k(A a10, B b10) {
        this.f16181h = a10;
        this.f16182i = b10;
    }

    public final A a() {
        return this.f16181h;
    }

    public final B b() {
        return this.f16182i;
    }

    public final A c() {
        return this.f16181h;
    }

    public final B d() {
        return this.f16182i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return m.a(this.f16181h, kVar.f16181h) && m.a(this.f16182i, kVar.f16182i);
    }

    public int hashCode() {
        A a10 = this.f16181h;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f16182i;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return '(' + this.f16181h + ", " + this.f16182i + ')';
    }
}
