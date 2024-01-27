package r9;

import n9.j0;

/* compiled from: Mutex.kt */
public final class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f16423a = new j0("NO_OWNER");

    /* renamed from: b  reason: collision with root package name */
    private static final j0 f16424b = new j0("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z10) {
        return new b(z10);
    }

    public static /* synthetic */ a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
