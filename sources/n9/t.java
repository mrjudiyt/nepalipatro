package n9;

import kotlin.jvm.internal.m;

/* compiled from: LockFreeLinkedList.kt */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f15851a = new j0("CONDITION_FALSE");

    public static final Object a() {
        return f15851a;
    }

    public static final u b(Object obj) {
        u uVar;
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var != null && (uVar = d0Var.f15796a) != null) {
            return uVar;
        }
        m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (u) obj;
    }
}
