package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n;
import d1.c;
import d1.d;
import p0.a;

/* compiled from: FragmentViewLifecycleOwner */
class a0 implements g, d, l0 {

    /* renamed from: h  reason: collision with root package name */
    private final Fragment f3082h;

    /* renamed from: i  reason: collision with root package name */
    private final k0 f3083i;

    /* renamed from: j  reason: collision with root package name */
    private n f3084j = null;

    /* renamed from: k  reason: collision with root package name */
    private c f3085k = null;

    a0(Fragment fragment, k0 k0Var) {
        this.f3082h = fragment;
        this.f3083i = k0Var;
    }

    /* access modifiers changed from: package-private */
    public void a(h.a aVar) {
        this.f3084j.h(aVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f3084j == null) {
            this.f3084j = new n(this);
            this.f3085k = c.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f3084j != null;
    }

    /* access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f3085k.d(bundle);
    }

    /* access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f3085k.e(bundle);
    }

    /* access modifiers changed from: package-private */
    public void f(h.b bVar) {
        this.f3084j.n(bVar);
    }

    public /* synthetic */ a getDefaultViewModelCreationExtras() {
        return f.a(this);
    }

    public h getLifecycle() {
        b();
        return this.f3084j;
    }

    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f3085k.b();
    }

    public k0 getViewModelStore() {
        b();
        return this.f3083i;
    }
}
