package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.h0;
import androidx.savedstate.a;
import com.facebook.bolts.AppLinks;
import d1.d;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.m;

/* compiled from: SavedStateViewModelFactory.kt */
public final class d0 extends h0.d implements h0.b {

    /* renamed from: b  reason: collision with root package name */
    private Application f3465b;

    /* renamed from: c  reason: collision with root package name */
    private final h0.b f3466c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f3467d;

    /* renamed from: e  reason: collision with root package name */
    private h f3468e;

    /* renamed from: f  reason: collision with root package name */
    private a f3469f;

    @SuppressLint({"LambdaLast"})
    public d0(Application application, d dVar, Bundle bundle) {
        h0.a aVar;
        m.f(dVar, "owner");
        this.f3469f = dVar.getSavedStateRegistry();
        this.f3468e = dVar.getLifecycle();
        this.f3467d = bundle;
        this.f3465b = application;
        if (application != null) {
            aVar = h0.a.f3493f.a(application);
        } else {
            aVar = new h0.a();
        }
        this.f3466c = aVar;
    }

    public <T extends g0> T a(Class<T> cls) {
        m.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends g0> T b(Class<T> cls, p0.a aVar) {
        Constructor<T> constructor;
        m.f(cls, "modelClass");
        m.f(aVar, AppLinks.KEY_NAME_EXTRAS);
        String str = (String) aVar.a(h0.c.f3502d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.a(a0.f3448a) != null && aVar.a(a0.f3449b) != null) {
            Application application = (Application) aVar.a(h0.a.f3495h);
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = e0.c(cls, e0.f3471b);
            } else {
                constructor = e0.c(cls, e0.f3470a);
            }
            if (constructor == null) {
                return this.f3466c.b(cls, aVar);
            }
            if (!isAssignableFrom || application == null) {
                return e0.d(cls, constructor, a0.b(aVar));
            }
            return e0.d(cls, constructor, application, a0.b(aVar));
        } else if (this.f3468e != null) {
            return d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public void c(g0 g0Var) {
        m.f(g0Var, "viewModel");
        if (this.f3468e != null) {
            a aVar = this.f3469f;
            m.c(aVar);
            h hVar = this.f3468e;
            m.c(hVar);
            LegacySavedStateHandleController.a(g0Var, aVar, hVar);
        }
    }

    public final <T extends g0> T d(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t10;
        Application application;
        m.f(str, Constants.KEY);
        m.f(cls, "modelClass");
        h hVar = this.f3468e;
        if (hVar != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f3465b == null) {
                constructor = e0.c(cls, e0.f3471b);
            } else {
                constructor = e0.c(cls, e0.f3470a);
            }
            if (constructor != null) {
                a aVar = this.f3469f;
                m.c(aVar);
                SavedStateHandleController b10 = LegacySavedStateHandleController.b(aVar, hVar, str, this.f3467d);
                if (!isAssignableFrom || (application = this.f3465b) == null) {
                    t10 = e0.d(cls, constructor, b10.h());
                } else {
                    m.c(application);
                    t10 = e0.d(cls, constructor, application, b10.h());
                }
                t10.e("androidx.lifecycle.savedstate.vm.tag", b10);
                return t10;
            } else if (this.f3465b != null) {
                return this.f3466c.a(cls);
            } else {
                return h0.c.f3500b.a().a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
