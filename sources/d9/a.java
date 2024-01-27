package d9;

import kotlin.jvm.internal.g;
import p8.m;
import t8.c;

/* compiled from: Progressions.kt */
public class a implements Iterable<Character>, z8.a {

    /* renamed from: k  reason: collision with root package name */
    public static final C0246a f14161k = new C0246a((g) null);

    /* renamed from: h  reason: collision with root package name */
    private final char f14162h;

    /* renamed from: i  reason: collision with root package name */
    private final char f14163i;

    /* renamed from: j  reason: collision with root package name */
    private final int f14164j;

    /* renamed from: d9.a$a  reason: collision with other inner class name */
    /* compiled from: Progressions.kt */
    public static final class C0246a {
        private C0246a() {
        }

        public /* synthetic */ C0246a(g gVar) {
            this();
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i10 != Integer.MIN_VALUE) {
            this.f14162h = c10;
            this.f14163i = (char) c.c(c10, c11, i10);
            this.f14164j = i10;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final char a() {
        return this.f14162h;
    }

    public final char b() {
        return this.f14163i;
    }

    /* renamed from: c */
    public m iterator() {
        return new b(this.f14162h, this.f14163i, this.f14164j);
    }
}
