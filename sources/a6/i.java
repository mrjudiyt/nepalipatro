package a6;

import android.util.SparseBooleanArray;

/* compiled from: FlagSet */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final SparseBooleanArray f191a;

    /* compiled from: FlagSet */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final SparseBooleanArray f192a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f193b;

        public b a(int i10) {
            a.f(!this.f193b);
            this.f192a.append(i10, true);
            return this;
        }

        public b b(i iVar) {
            for (int i10 = 0; i10 < iVar.b(); i10++) {
                a(iVar.a(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int a10 : iArr) {
                a(a10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public i e() {
            a.f(!this.f193b);
            this.f193b = true;
            return new i(this.f192a);
        }
    }

    public int a(int i10) {
        a.c(i10, 0, b());
        return this.f191a.keyAt(i10);
    }

    public int b() {
        return this.f191a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f191a.equals(((i) obj).f191a);
    }

    public int hashCode() {
        return this.f191a.hashCode();
    }

    private i(SparseBooleanArray sparseBooleanArray) {
        this.f191a = sparseBooleanArray;
    }
}
