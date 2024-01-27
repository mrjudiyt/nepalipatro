package d9;

import p8.d0;
import t8.c;

/* compiled from: Progressions.kt */
public class g implements Iterable<Long>, z8.a {

    /* renamed from: k  reason: collision with root package name */
    public static final a f14181k = new a((kotlin.jvm.internal.g) null);

    /* renamed from: h  reason: collision with root package name */
    private final long f14182h;

    /* renamed from: i  reason: collision with root package name */
    private final long f14183i;

    /* renamed from: j  reason: collision with root package name */
    private final long f14184j;

    /* compiled from: Progressions.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public g(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j12 != Long.MIN_VALUE) {
            this.f14182h = j10;
            this.f14183i = c.d(j10, j11, j12);
            this.f14184j = j12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final long a() {
        return this.f14182h;
    }

    public final long b() {
        return this.f14183i;
    }

    /* renamed from: c */
    public d0 iterator() {
        return new h(this.f14182h, this.f14183i, this.f14184j);
    }
}
