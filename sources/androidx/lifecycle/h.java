package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Lifecycle.kt */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private AtomicReference<Object> f3481a = new AtomicReference<>();

    /* compiled from: Lifecycle.kt */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        public static final C0051a Companion = null;

        /* renamed from: androidx.lifecycle.h$a$a  reason: collision with other inner class name */
        /* compiled from: Lifecycle.kt */
        public static final class C0051a {

            /* renamed from: androidx.lifecycle.h$a$a$a  reason: collision with other inner class name */
            /* compiled from: Lifecycle.kt */
            public /* synthetic */ class C0052a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f3482a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        androidx.lifecycle.h$b[] r0 = androidx.lifecycle.h.b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        f3482a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.h.a.C0051a.C0052a.<clinit>():void");
                }
            }

            private C0051a() {
            }

            public /* synthetic */ C0051a(g gVar) {
                this();
            }

            public final a a(b bVar) {
                m.f(bVar, "state");
                int i10 = C0052a.f3482a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b bVar) {
                m.f(bVar, "state");
                int i10 = C0052a.f3482a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a c(b bVar) {
                m.f(bVar, "state");
                int i10 = C0052a.f3482a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        /* compiled from: Lifecycle.kt */
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f3483a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.h$a[] r0 = androidx.lifecycle.h.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f3483a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.h.a.b.<clinit>():void");
            }
        }

        static {
            Companion = new C0051a((g) null);
        }

        public static final a d(b bVar) {
            return Companion.a(bVar);
        }

        public static final a f(b bVar) {
            return Companion.c(bVar);
        }

        public final b e() {
            switch (b.f3483a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.kt */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean d(b bVar) {
            m.f(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(l lVar);

    public abstract b b();

    public abstract void c(l lVar);
}
