package i9;

import kotlin.NoWhenBranchMatchedException;
import o9.b;
import r8.d;
import r8.f;
import y8.l;
import y8.p;

/* compiled from: CoroutineStart.kt */
public enum n0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14969a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                i9.n0[] r0 = i9.n0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                i9.n0 r1 = i9.n0.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                i9.n0 r1 = i9.n0.ATOMIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                i9.n0 r1 = i9.n0.UNDISPATCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                i9.n0 r1 = i9.n0.LAZY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f14969a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i9.n0.a.<clinit>():void");
        }
    }

    public final <R, T> void d(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        int i10 = a.f14969a[ordinal()];
        if (i10 == 1) {
            o9.a.d(pVar, r10, dVar, (l) null, 4, (Object) null);
        } else if (i10 == 2) {
            f.a(pVar, r10, dVar);
        } else if (i10 == 3) {
            b.a(pVar, r10, dVar);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean e() {
        return this == LAZY;
    }
}
