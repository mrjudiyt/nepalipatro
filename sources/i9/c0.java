package i9;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.g;
import n9.i0;
import o8.l;
import o8.m;
import o8.q;
import r8.d;

/* compiled from: CompletionState.kt */
public final class c0 {
    public static final <T> Object a(Object obj, d<? super T> dVar) {
        if (obj instanceof z) {
            l.a aVar = l.f16183h;
            Throwable th = ((z) obj).f15006a;
            if (p0.d() && (dVar instanceof e)) {
                th = i0.i(th, (e) dVar);
            }
            return l.a(m.a(th));
        }
        l.a aVar2 = l.f16183h;
        return l.a(obj);
    }

    public static final <T> Object b(Object obj, l<?> lVar) {
        Throwable b10 = l.b(obj);
        if (b10 != null) {
            if (p0.d() && (lVar instanceof e)) {
                b10 = i0.i(b10, (e) lVar);
            }
            obj = new z(b10, false, 2, (g) null);
        }
        return obj;
    }

    public static final <T> Object c(Object obj, y8.l<? super Throwable, q> lVar) {
        Throwable b10 = l.b(obj);
        if (b10 != null) {
            return new z(b10, false, 2, (g) null);
        }
        if (lVar != null) {
            return new a0(obj, lVar);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, y8.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
