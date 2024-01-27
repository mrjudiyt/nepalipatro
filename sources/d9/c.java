package d9;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: PrimitiveRanges.kt */
public final class c extends a {

    /* renamed from: l  reason: collision with root package name */
    public static final a f14169l = new a((g) null);

    /* renamed from: m  reason: collision with root package name */
    private static final c f14170m = new c(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(a() == cVar.a() && b() == cVar.b())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    public boolean isEmpty() {
        return m.h(a(), b()) > 0;
    }

    public String toString() {
        return a() + ".." + b();
    }
}
