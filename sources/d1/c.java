package d1;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: SavedStateRegistryController.kt */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f7891d = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f7892a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.savedstate.a f7893b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7894c;

    /* compiled from: SavedStateRegistryController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a(d dVar) {
            m.f(dVar, "owner");
            return new c(dVar, (g) null);
        }
    }

    private c(d dVar) {
        this.f7892a = dVar;
        this.f7893b = new androidx.savedstate.a();
    }

    public /* synthetic */ c(d dVar, g gVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f7891d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f7893b;
    }

    public final void c() {
        h lifecycle = this.f7892a.getLifecycle();
        if (lifecycle.b() == h.b.INITIALIZED) {
            lifecycle.a(new Recreator(this.f7892a));
            this.f7893b.e(lifecycle);
            this.f7894c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void d(Bundle bundle) {
        if (!this.f7894c) {
            c();
        }
        h lifecycle = this.f7892a.getLifecycle();
        if (!lifecycle.b().d(h.b.STARTED)) {
            this.f7893b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        m.f(bundle, "outBundle");
        this.f7893b.g(bundle);
    }
}
