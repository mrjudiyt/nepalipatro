package n9;

import kotlin.jvm.internal.m;
import n9.g0;

/* compiled from: ConcurrentLinkedList.kt */
public final class h0<S extends g0<S>> {
    public static <S extends g0<S>> Object a(Object obj) {
        return obj;
    }

    public static final S b(Object obj) {
        if (obj != e.f15797a) {
            m.d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (g0) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        return obj == e.f15797a;
    }
}
