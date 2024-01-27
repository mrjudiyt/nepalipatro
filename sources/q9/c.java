package q9;

import i9.l;
import kotlin.jvm.internal.n;
import n9.j0;
import y8.q;

/* compiled from: Select.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final q<Object, Object, Object, Object> f16299a = a.f16305h;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f16300b = new j0("STATE_REG");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final j0 f16301c = new j0("STATE_COMPLETED");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final j0 f16302d = new j0("STATE_CANCELLED");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final j0 f16303e = new j0("NO_RESULT");

    /* renamed from: f  reason: collision with root package name */
    private static final j0 f16304f = new j0("PARAM_CLAUSE_0");

    /* compiled from: Select.kt */
    static final class a extends n implements q {

        /* renamed from: h  reason: collision with root package name */
        public static final a f16305h = new a();

        a() {
            super(3);
        }

        /* renamed from: a */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final d a(int i10) {
        if (i10 == 0) {
            return d.SUCCESSFUL;
        }
        if (i10 == 1) {
            return d.REREGISTER;
        }
        if (i10 == 2) {
            return d.CANCELLED;
        }
        if (i10 == 3) {
            return d.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    /* access modifiers changed from: private */
    public static final boolean h(l<? super o8.q> lVar, y8.l<? super Throwable, o8.q> lVar2) {
        Object m10 = lVar.m(o8.q.f16189a, (Object) null, lVar2);
        if (m10 == null) {
            return false;
        }
        lVar.p(m10);
        return true;
    }
}
