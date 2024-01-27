package i9;

import n9.j0;

/* compiled from: JobSupport.kt */
public final class b2 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f14914a = new j0("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f14915b = new j0("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final j0 f14916c = new j0("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final j0 f14917d = new j0("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final j0 f14918e = new j0("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final d1 f14919f = new d1(false);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final d1 f14920g = new d1(true);

    public static final Object g(Object obj) {
        return obj instanceof p1 ? new q1((p1) obj) : obj;
    }

    public static final Object h(Object obj) {
        p1 p1Var;
        q1 q1Var = obj instanceof q1 ? (q1) obj : null;
        return (q1Var == null || (p1Var = q1Var.f14981a) == null) ? obj : p1Var;
    }
}
