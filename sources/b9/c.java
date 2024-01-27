package b9;

import io.flutter.embedding.android.KeyboardMap;
import java.io.Serializable;
import kotlin.jvm.internal.g;
import t8.b;

/* compiled from: Random.kt */
public abstract class c {

    /* renamed from: h  reason: collision with root package name */
    public static final a f13332h = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final c f13333i = b.f16599a.b();

    /* compiled from: Random.kt */
    public static final class a extends c implements Serializable {

        /* renamed from: b9.c$a$a  reason: collision with other inner class name */
        /* compiled from: Random.kt */
        private static final class C0224a implements Serializable {

            /* renamed from: h  reason: collision with root package name */
            public static final C0224a f13334h = new C0224a();

            private C0224a() {
            }

            private final Object readResolve() {
                return c.f13332h;
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final Object writeReplace() {
            return C0224a.f13334h;
        }

        public int b(int i10) {
            return c.f13333i.b(i10);
        }

        public int c() {
            return c.f13333i.c();
        }

        public int d(int i10) {
            return c.f13333i.d(i10);
        }

        public int e(int i10, int i11) {
            return c.f13333i.e(i10, i11);
        }

        public long f() {
            return c.f13333i.f();
        }

        public long g(long j10, long j11) {
            return c.f13333i.g(j10, j11);
        }
    }

    public abstract int b(int i10);

    public abstract int c();

    public abstract int d(int i10);

    public int e(int i10, int i11) {
        int i12;
        int c10;
        int i13;
        int c11;
        boolean z10;
        d.b(i10, i11);
        int i14 = i11 - i10;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                i12 = b(d.d(i14));
            } else {
                do {
                    c10 = c() >>> 1;
                    i13 = c10 % i14;
                } while ((c10 - i13) + (i14 - 1) < 0);
                i12 = i13;
            }
            return i10 + i12;
        }
        do {
            c11 = c();
            z10 = false;
            if (i10 <= c11 && c11 < i11) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return c11;
    }

    public abstract long f();

    public long g(long j10, long j11) {
        long f10;
        boolean z10;
        long j12;
        long f11;
        long j13;
        int c10;
        d.c(j10, j11);
        long j14 = j11 - j10;
        if (j14 > 0) {
            if (((-j14) & j14) == j14) {
                int i10 = (int) j14;
                int i11 = (int) (j14 >>> 32);
                if (i10 != 0) {
                    c10 = b(d.d(i10));
                } else if (i11 == 1) {
                    c10 = c();
                } else {
                    j12 = (((long) b(d.d(i11))) << 32) + (((long) c()) & KeyboardMap.kValueMask);
                }
                j12 = ((long) c10) & KeyboardMap.kValueMask;
            } else {
                do {
                    f11 = f() >>> 1;
                    j13 = f11 % j14;
                } while ((f11 - j13) + (j14 - 1) < 0);
                j12 = j13;
            }
            return j10 + j12;
        }
        do {
            f10 = f();
            z10 = false;
            if (j10 <= f10 && f10 < j11) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return f10;
    }
}
