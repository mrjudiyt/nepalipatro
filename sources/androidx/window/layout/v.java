package androidx.window.layout;

import android.graphics.Rect;
import kotlin.jvm.internal.m;
import m1.b;

/* compiled from: WindowMetrics.kt */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final b f4669a;

    public v(b bVar) {
        m.f(bVar, "_bounds");
        this.f4669a = bVar;
    }

    public final Rect a() {
        return this.f4669a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m.a(v.class, obj.getClass())) {
            return false;
        }
        return m.a(this.f4669a, ((v) obj).f4669a);
    }

    public int hashCode() {
        return this.f4669a.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + a() + " }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public v(Rect rect) {
        this(new b(rect));
        m.f(rect, "bounds");
    }
}
