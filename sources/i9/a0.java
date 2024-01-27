package i9;

import kotlin.jvm.internal.m;
import o8.q;
import y8.l;

/* compiled from: CompletionState.kt */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14895a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, q> f14896b;

    public a0(Object obj, l<? super Throwable, q> lVar) {
        this.f14895a = obj;
        this.f14896b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return m.a(this.f14895a, a0Var.f14895a) && m.a(this.f14896b, a0Var.f14896b);
    }

    public int hashCode() {
        Object obj = this.f14895a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f14896b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f14895a + ", onCancellation=" + this.f14896b + ')';
    }
}
