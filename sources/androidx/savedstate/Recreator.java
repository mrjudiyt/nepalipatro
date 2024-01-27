package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.savedstate.a;
import d1.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Recreator.kt */
public final class Recreator implements k {

    /* renamed from: i  reason: collision with root package name */
    public static final a f4452i = new a((g) null);

    /* renamed from: h  reason: collision with root package name */
    private final d f4453h;

    /* compiled from: Recreator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* compiled from: Recreator.kt */
    public static final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<String> f4454a = new LinkedHashSet();

        public b(a aVar) {
            m.f(aVar, "registry");
            aVar.h("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f4454a));
            return bundle;
        }

        public final void b(String str) {
            m.f(str, "className");
            this.f4454a.add(str);
        }
    }

    public Recreator(d dVar) {
        m.f(dVar, "owner");
        this.f4453h = dVar;
    }

    private final void g(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.C0077a.class);
            m.e(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    m.e(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.C0077a) newInstance).a(this.f4453h);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    public void onStateChanged(androidx.lifecycle.m mVar, h.a aVar) {
        m.f(mVar, "source");
        m.f(aVar, "event");
        if (aVar == h.a.ON_CREATE) {
            mVar.getLifecycle().c(this);
            Bundle b10 = this.f4453h.getSavedStateRegistry().b("androidx.savedstate.Restarter");
            if (b10 != null) {
                ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String g10 : stringArrayList) {
                        g(g10);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
