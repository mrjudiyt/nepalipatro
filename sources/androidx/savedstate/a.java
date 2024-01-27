package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.savedstate.Recreator;
import d1.d;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g;

@SuppressLint({"RestrictedApi"})
/* compiled from: SavedStateRegistry.kt */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final b f4455g = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final o.b<String, c> f4456a = new o.b<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f4457b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f4458c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4459d;

    /* renamed from: e  reason: collision with root package name */
    private Recreator.b f4460e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4461f = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    /* compiled from: SavedStateRegistry.kt */
    public interface C0077a {
        void a(d dVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    public interface c {
        Bundle a();
    }

    /* access modifiers changed from: private */
    public static final void d(a aVar, m mVar, h.a aVar2) {
        kotlin.jvm.internal.m.f(aVar, "this$0");
        kotlin.jvm.internal.m.f(mVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.m.f(aVar2, "event");
        if (aVar2 == h.a.ON_START) {
            aVar.f4461f = true;
        } else if (aVar2 == h.a.ON_STOP) {
            aVar.f4461f = false;
        }
    }

    public final Bundle b(String str) {
        kotlin.jvm.internal.m.f(str, Constants.KEY);
        if (this.f4459d) {
            Bundle bundle = this.f4458c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f4458c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f4458c;
            boolean z10 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            }
            if (!z10) {
                this.f4458c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c c(String str) {
        kotlin.jvm.internal.m.f(str, Constants.KEY);
        Iterator<Map.Entry<String, c>> it = this.f4456a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            kotlin.jvm.internal.m.e(next, "components");
            c cVar = (c) next.getValue();
            if (kotlin.jvm.internal.m.a((String) next.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(h hVar) {
        kotlin.jvm.internal.m.f(hVar, "lifecycle");
        if (!this.f4457b) {
            hVar.a(new d1.b(this));
            this.f4457b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void f(Bundle bundle) {
        if (!this.f4457b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f4459d) {
            this.f4458c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            this.f4459d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    public final void g(Bundle bundle) {
        kotlin.jvm.internal.m.f(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4458c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o.b<K, V>.d c10 = this.f4456a.c();
        kotlin.jvm.internal.m.e(c10, "this.components.iteratorWithAdditions()");
        while (c10.hasNext()) {
            Map.Entry entry = (Map.Entry) c10.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, c cVar) {
        kotlin.jvm.internal.m.f(str, Constants.KEY);
        kotlin.jvm.internal.m.f(cVar, "provider");
        if (!(this.f4456a.f(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class<? extends C0077a> cls) {
        kotlin.jvm.internal.m.f(cls, "clazz");
        if (this.f4461f) {
            Recreator.b bVar = this.f4460e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.f4460e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.f4460e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    kotlin.jvm.internal.m.e(name, "clazz.name");
                    bVar2.b(name);
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
