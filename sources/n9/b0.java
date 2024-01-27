package n9;

import i9.i0;
import kotlin.jvm.internal.n;
import kotlinx.coroutines.internal.UndeliveredElementException;
import o8.q;
import r8.g;
import y8.l;

/* compiled from: OnUndeliveredElement.kt */
public final class b0 {

    /* compiled from: OnUndeliveredElement.kt */
    static final class a extends n implements l<Throwable, q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l<E, q> f15790h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ E f15791i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g f15792j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l<? super E, q> lVar, E e10, g gVar) {
            super(1);
            this.f15790h = lVar;
            this.f15791i = e10;
            this.f15792j = gVar;
        }

        public final void a(Throwable th) {
            b0.b(this.f15790h, this.f15791i, this.f15792j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return q.f16189a;
        }
    }

    public static final <E> l<Throwable, q> a(l<? super E, q> lVar, E e10, g gVar) {
        return new a(lVar, e10, gVar);
    }

    public static final <E> void b(l<? super E, q> lVar, E e10, g gVar) {
        UndeliveredElementException c10 = c(lVar, e10, (UndeliveredElementException) null);
        if (c10 != null) {
            i0.a(gVar, c10);
        }
    }

    public static final <E> UndeliveredElementException c(l<? super E, q> lVar, E e10, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e10, th);
            }
            b.a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}
