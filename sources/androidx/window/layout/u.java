package androidx.window.layout;

import java.util.List;
import kotlin.jvm.internal.m;
import y8.l;

/* compiled from: WindowLayoutInfo.kt */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f4668a;

    public u(List<? extends e> list) {
        m.f(list, "displayFeatures");
        this.f4668a = list;
    }

    public final List<e> a() {
        return this.f4668a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m.a(u.class, obj.getClass())) {
            return false;
        }
        return m.a(this.f4668a, ((u) obj).f4668a);
    }

    public int hashCode() {
        return this.f4668a.hashCode();
    }

    public String toString() {
        return x.D(this.f4668a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (l) null, 56, (Object) null);
    }
}
