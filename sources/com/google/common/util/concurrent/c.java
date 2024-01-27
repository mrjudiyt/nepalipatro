package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import l6.j;
import l6.p;
import o6.b;

/* compiled from: Futures */
public final class c extends d {

    /* compiled from: Futures */
    private static final class a<V> implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final Future<V> f13783h;

        /* renamed from: i  reason: collision with root package name */
        final b<? super V> f13784i;

        a(Future<V> future, b<? super V> bVar) {
            this.f13783h = future;
            this.f13784i = bVar;
        }

        public void run() {
            Throwable a10;
            Future<V> future = this.f13783h;
            if (!(future instanceof o6.a) || (a10 = b.a((o6.a) future)) == null) {
                try {
                    this.f13784i.onSuccess(c.b(this.f13783h));
                } catch (ExecutionException e10) {
                    this.f13784i.onFailure(e10.getCause());
                } catch (Error | RuntimeException e11) {
                    this.f13784i.onFailure(e11);
                }
            } else {
                this.f13784i.onFailure(a10);
            }
        }

        public String toString() {
            return j.b(this).h(this.f13784i).toString();
        }
    }

    public static <V> void a(e<V> eVar, b<? super V> bVar, Executor executor) {
        p.j(bVar);
        eVar.addListener(new a(eVar, bVar), executor);
    }

    public static <V> V b(Future<V> future) {
        p.r(future.isDone(), "Future was expected to be done: %s", future);
        return i.a(future);
    }
}
