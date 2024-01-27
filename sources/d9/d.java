package d9;

import kotlin.jvm.internal.g;
import p8.c0;
import t8.c;

/* compiled from: Progressions.kt */
public class d implements Iterable<Integer>, z8.a {

    /* renamed from: k  reason: collision with root package name */
    public static final a f14171k = new a((g) null);

    /* renamed from: h  reason: collision with root package name */
    private final int f14172h;

    /* renamed from: i  reason: collision with root package name */
    private final int f14173i;

    /* renamed from: j  reason: collision with root package name */
    private final int f14174j;

    /* compiled from: Progressions.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final d a(int i10, int i11, int i12) {
            return new d(i10, i11, i12);
        }
    }

    public d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.f14172h = i10;
            this.f14173i = c.c(i10, i11, i12);
            this.f14174j = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int a() {
        return this.f14172h;
    }

    public final int b() {
        return this.f14173i;
    }

    public final int c() {
        return this.f14174j;
    }

    /* renamed from: d */
    public c0 iterator() {
        return new e(this.f14172h, this.f14173i, this.f14174j);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (!(this.f14172h == dVar.f14172h && this.f14173i == dVar.f14173i && this.f14174j == dVar.f14174j)) {
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
        return (((this.f14172h * 31) + this.f14173i) * 31) + this.f14174j;
    }

    public boolean isEmpty() {
        if (this.f14174j > 0) {
            if (this.f14172h > this.f14173i) {
                return true;
            }
        } else if (this.f14172h < this.f14173i) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i10;
        StringBuilder sb;
        if (this.f14174j > 0) {
            sb = new StringBuilder();
            sb.append(this.f14172h);
            sb.append("..");
            sb.append(this.f14173i);
            sb.append(" step ");
            i10 = this.f14174j;
        } else {
            sb = new StringBuilder();
            sb.append(this.f14172h);
            sb.append(" downTo ");
            sb.append(this.f14173i);
            sb.append(" step ");
            i10 = -this.f14174j;
        }
        sb.append(i10);
        return sb.toString();
    }
}
