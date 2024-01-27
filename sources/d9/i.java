package d9;

import kotlin.jvm.internal.g;

/* compiled from: PrimitiveRanges.kt */
public final class i extends g {

    /* renamed from: l  reason: collision with root package name */
    public static final a f14189l = new a((g) null);

    /* renamed from: m  reason: collision with root package name */
    private static final i f14190m = new i(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public i(long j10, long j11) {
        super(j10, j11, 1);
    }

    public boolean d(long j10) {
        return a() <= j10 && j10 <= b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (!(a() == iVar.a() && b() == iVar.b())) {
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
        return (int) ((((long) 31) * (a() ^ (a() >>> 32))) + (b() ^ (b() >>> 32)));
    }

    public boolean isEmpty() {
        return a() > b();
    }

    public String toString() {
        return a() + ".." + b();
    }
}
