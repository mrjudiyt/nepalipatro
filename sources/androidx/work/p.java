package androidx.work;

import android.annotation.SuppressLint;

/* compiled from: Operation */
public interface p {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f4923a = new b.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0088b f4924b = new b.C0088b();

    /* compiled from: Operation */
    public static abstract class b {

        /* compiled from: Operation */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f4925a;

            public a(Throwable th) {
                this.f4925a = th;
            }

            public Throwable a() {
                return this.f4925a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f4925a.getMessage()});
            }
        }

        /* renamed from: androidx.work.p$b$b  reason: collision with other inner class name */
        /* compiled from: Operation */
        public static final class C0088b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0088b() {
            }
        }

        /* compiled from: Operation */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }
}
