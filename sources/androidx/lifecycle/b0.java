package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import o8.g;

/* compiled from: SavedStateHandleSupport.kt */
public final class b0 implements a.c {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.savedstate.a f3459a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3460b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f3461c;

    /* renamed from: d  reason: collision with root package name */
    private final g f3462d;

    /* compiled from: SavedStateHandleSupport.kt */
    static final class a extends n implements y8.a<c0> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l0 f3463h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l0 l0Var) {
            super(0);
            this.f3463h = l0Var;
        }

        /* renamed from: a */
        public final c0 invoke() {
            return a0.e(this.f3463h);
        }
    }

    public b0(androidx.savedstate.a aVar, l0 l0Var) {
        m.f(aVar, "savedStateRegistry");
        m.f(l0Var, "viewModelStoreOwner");
        this.f3459a = aVar;
        this.f3462d = i.a(new a(l0Var));
    }

    private final c0 c() {
        return (c0) this.f3462d.getValue();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3461c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : c().f().entrySet()) {
            String str = (String) next.getKey();
            Bundle a10 = ((z) next.getValue()).c().a();
            if (!m.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f3460b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        m.f(str, Constants.KEY);
        d();
        Bundle bundle = this.f3461c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f3461c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3461c;
        boolean z10 = true;
        if (bundle4 == null || !bundle4.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            this.f3461c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (!this.f3460b) {
            Bundle b10 = this.f3459a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f3461c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (b10 != null) {
                bundle.putAll(b10);
            }
            this.f3461c = bundle;
            this.f3460b = true;
            c();
        }
    }
}
