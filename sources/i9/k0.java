package i9;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import r8.g;

/* compiled from: CoroutineName.kt */
public final class k0 extends r8.a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f14953j = new a((g) null);

    /* renamed from: i  reason: collision with root package name */
    private final String f14954i;

    /* compiled from: CoroutineName.kt */
    public static final class a implements g.c<k0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public final String K0() {
        return this.f14954i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && m.a(this.f14954i, ((k0) obj).f14954i);
    }

    public int hashCode() {
        return this.f14954i.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f14954i + ')';
    }
}
