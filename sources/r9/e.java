package r9;

import n9.j0;

/* compiled from: Semaphore.kt */
public final class e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final int f16435a = m0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f16436b = new j0("PERMIT");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final j0 f16437c = new j0("TAKEN");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final j0 f16438d = new j0("BROKEN");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final j0 f16439e = new j0("CANCELLED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f16440f = m0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);

    /* access modifiers changed from: private */
    public static final f h(long j10, f fVar) {
        return new f(j10, fVar, 0);
    }
}
