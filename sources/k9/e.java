package k9;

import i9.a;
import i9.a2;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import o8.q;
import r8.d;
import r8.g;
import y8.l;

/* compiled from: ChannelCoroutine.kt */
public class e<E> extends a<q> implements d<E> {

    /* renamed from: k  reason: collision with root package name */
    private final d<E> f15527k;

    public e(g gVar, d<E> dVar, boolean z10, boolean z11) {
        super(gVar, z10, z11);
        this.f15527k = dVar;
    }

    public void C(Throwable th) {
        CancellationException H0 = a2.H0(this, th, (String) null, 1, (Object) null);
        this.f15527k.j(H0);
        A(H0);
    }

    /* access modifiers changed from: protected */
    public final d<E> T0() {
        return this.f15527k;
    }

    public Object b() {
        return this.f15527k.b();
    }

    public Object c(E e10, d<? super q> dVar) {
        return this.f15527k.c(e10, dVar);
    }

    public Object e(d<? super E> dVar) {
        return this.f15527k.e(dVar);
    }

    public void f(l<? super Throwable, q> lVar) {
        this.f15527k.f(lVar);
    }

    public boolean g(Throwable th) {
        return this.f15527k.g(th);
    }

    public f<E> iterator() {
        return this.f15527k.iterator();
    }

    public final void j(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(G(), (Throwable) null, this);
            }
            C(cancellationException);
        }
    }

    public Object n(E e10) {
        return this.f15527k.n(e10);
    }

    public boolean o() {
        return this.f15527k.o();
    }
}
