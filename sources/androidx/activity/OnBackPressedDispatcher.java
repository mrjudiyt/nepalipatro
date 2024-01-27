package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f511a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<e> f512b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements k, a {

        /* renamed from: h  reason: collision with root package name */
        private final h f513h;

        /* renamed from: i  reason: collision with root package name */
        private final e f514i;

        /* renamed from: j  reason: collision with root package name */
        private a f515j;

        LifecycleOnBackPressedCancellable(h hVar, e eVar) {
            this.f513h = hVar;
            this.f514i = eVar;
            hVar.a(this);
        }

        public void cancel() {
            this.f513h.c(this);
            this.f514i.removeCancellable(this);
            a aVar = this.f515j;
            if (aVar != null) {
                aVar.cancel();
                this.f515j = null;
            }
        }

        public void onStateChanged(m mVar, h.a aVar) {
            if (aVar == h.a.ON_START) {
                this.f515j = OnBackPressedDispatcher.this.b(this.f514i);
            } else if (aVar == h.a.ON_STOP) {
                a aVar2 = this.f515j;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == h.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    private class a implements a {

        /* renamed from: h  reason: collision with root package name */
        private final e f517h;

        a(e eVar) {
            this.f517h = eVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f512b.remove(this.f517h);
            this.f517h.removeCancellable(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f511a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(m mVar, e eVar) {
        h lifecycle = mVar.getLifecycle();
        if (lifecycle.b() != h.b.DESTROYED) {
            eVar.addCancellable(new LifecycleOnBackPressedCancellable(lifecycle, eVar));
        }
    }

    /* access modifiers changed from: package-private */
    public a b(e eVar) {
        this.f512b.add(eVar);
        a aVar = new a(eVar);
        eVar.addCancellable(aVar);
        return aVar;
    }

    public void c() {
        Iterator<e> descendingIterator = this.f512b.descendingIterator();
        while (descendingIterator.hasNext()) {
            e next = descendingIterator.next();
            if (next.isEnabled()) {
                next.handleOnBackPressed();
                return;
            }
        }
        Runnable runnable = this.f511a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
