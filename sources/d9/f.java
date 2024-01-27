package d9;

import kotlin.jvm.internal.g;

/* compiled from: PrimitiveRanges.kt */
public final class f extends d {

    /* renamed from: l  reason: collision with root package name */
    public static final a f14179l = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final f f14180m = new f(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final f a() {
            return f.f14180m;
        }
    }

    public f(int i10, int i11) {
        super(i10, i11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (!(a() == fVar.a() && b() == fVar.b())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean f(int i10) {
        return a() <= i10 && i10 <= b();
    }

    public Integer g() {
        return Integer.valueOf(b());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    public Integer i() {
        return Integer.valueOf(a());
    }

    public boolean isEmpty() {
        return a() > b();
    }

    public String toString() {
        return a() + ".." + b();
    }
}
