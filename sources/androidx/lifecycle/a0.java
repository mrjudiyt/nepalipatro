package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import androidx.savedstate.a;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.z;
import p0.a;
import y8.l;

/* compiled from: SavedStateHandleSupport.kt */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b<d1.d> f3448a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b<l0> f3449b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<Bundle> f3450c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class b implements a.b<d1.d> {
        b() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class c implements a.b<l0> {
        c() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    static final class d extends n implements l<p0.a, c0> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f3451h = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final c0 invoke(p0.a aVar) {
            m.f(aVar, "$this$initializer");
            return new c0();
        }
    }

    private static final z a(d1.d dVar, l0 l0Var, String str, Bundle bundle) {
        b0 d10 = d(dVar);
        c0 e10 = e(l0Var);
        z zVar = e10.f().get(str);
        if (zVar != null) {
            return zVar;
        }
        z a10 = z.f3539f.a(d10.b(str), bundle);
        e10.f().put(str, a10);
        return a10;
    }

    public static final z b(p0.a aVar) {
        m.f(aVar, "<this>");
        d1.d dVar = (d1.d) aVar.a(f3448a);
        if (dVar != null) {
            l0 l0Var = (l0) aVar.a(f3449b);
            if (l0Var != null) {
                Bundle bundle = (Bundle) aVar.a(f3450c);
                String str = (String) aVar.a(h0.c.f3502d);
                if (str != null) {
                    return a(dVar, l0Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final <T extends d1.d & l0> void c(T t10) {
        m.f(t10, "<this>");
        h.b b10 = t10.getLifecycle().b();
        if (!(b10 == h.b.INITIALIZED || b10 == h.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t10.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            b0 b0Var = new b0(t10.getSavedStateRegistry(), (l0) t10);
            t10.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", b0Var);
            t10.getLifecycle().a(new SavedStateHandleAttacher(b0Var));
        }
    }

    public static final b0 d(d1.d dVar) {
        m.f(dVar, "<this>");
        a.c c10 = dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        b0 b0Var = c10 instanceof b0 ? (b0) c10 : null;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final c0 e(l0 l0Var) {
        Class cls = c0.class;
        m.f(l0Var, "<this>");
        p0.c cVar = new p0.c();
        cVar.a(z.b(cls), d.f3451h);
        return (c0) new h0(l0Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
    }
}
