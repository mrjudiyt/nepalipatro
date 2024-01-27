package androidx.lifecycle;

import android.app.Application;
import com.facebook.bolts.AppLinks;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import p0.a;

/* compiled from: ViewModelProvider.kt */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f3490a;

    /* renamed from: b  reason: collision with root package name */
    private final b f3491b;

    /* renamed from: c  reason: collision with root package name */
    private final p0.a f3492c;

    /* compiled from: ViewModelProvider.kt */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3498a = a.f3499a;

        /* compiled from: ViewModelProvider.kt */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f3499a = new a();

            private a() {
            }
        }

        <T extends g0> T a(Class<T> cls);

        <T extends g0> T b(Class<T> cls, p0.a aVar);
    }

    /* compiled from: ViewModelProvider.kt */
    public static class c implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f3500b = new a((g) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static c f3501c;

        /* renamed from: d  reason: collision with root package name */
        public static final a.b<String> f3502d = a.C0055a.f3503a;

        /* compiled from: ViewModelProvider.kt */
        public static final class a {

            /* renamed from: androidx.lifecycle.h0$c$a$a  reason: collision with other inner class name */
            /* compiled from: ViewModelProvider.kt */
            private static final class C0055a implements a.b<String> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0055a f3503a = new C0055a();

                private C0055a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final c a() {
                if (c.f3501c == null) {
                    c.f3501c = new c();
                }
                c c10 = c.f3501c;
                m.c(c10);
                return c10;
            }
        }

        public <T extends g0> T a(Class<T> cls) {
            m.f(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                m.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return (g0) newInstance;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }

        public /* synthetic */ g0 b(Class cls, p0.a aVar) {
            return i0.b(this, cls, aVar);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    public static class d {
        public void c(g0 g0Var) {
            m.f(g0Var, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, b bVar) {
        this(k0Var, bVar, (p0.a) null, 4, (g) null);
        m.f(k0Var, "store");
        m.f(bVar, "factory");
    }

    public h0(k0 k0Var, b bVar, p0.a aVar) {
        m.f(k0Var, "store");
        m.f(bVar, "factory");
        m.f(aVar, "defaultCreationExtras");
        this.f3490a = k0Var;
        this.f3491b = bVar;
        this.f3492c = aVar;
    }

    public <T extends g0> T a(Class<T> cls) {
        m.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends g0> T b(String str, Class<T> cls) {
        T t10;
        m.f(str, Constants.KEY);
        m.f(cls, "modelClass");
        T b10 = this.f3490a.b(str);
        if (cls.isInstance(b10)) {
            b bVar = this.f3491b;
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                m.c(b10);
                dVar.c(b10);
            }
            m.d(b10, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b10;
        }
        p0.d dVar2 = new p0.d(this.f3492c);
        dVar2.c(c.f3502d, str);
        try {
            t10 = this.f3491b.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t10 = this.f3491b.a(cls);
        }
        this.f3490a.d(str, t10);
        return t10;
    }

    /* compiled from: ViewModelProvider.kt */
    public static class a extends c {

        /* renamed from: f  reason: collision with root package name */
        public static final C0053a f3493f = new C0053a((g) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static a f3494g;

        /* renamed from: h  reason: collision with root package name */
        public static final a.b<Application> f3495h = C0053a.C0054a.f3497a;

        /* renamed from: e  reason: collision with root package name */
        private final Application f3496e;

        /* renamed from: androidx.lifecycle.h0$a$a  reason: collision with other inner class name */
        /* compiled from: ViewModelProvider.kt */
        public static final class C0053a {

            /* renamed from: androidx.lifecycle.h0$a$a$a  reason: collision with other inner class name */
            /* compiled from: ViewModelProvider.kt */
            private static final class C0054a implements a.b<Application> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0054a f3497a = new C0054a();

                private C0054a() {
                }
            }

            private C0053a() {
            }

            public /* synthetic */ C0053a(g gVar) {
                this();
            }

            public final a a(Application application) {
                m.f(application, "application");
                if (a.f3494g == null) {
                    a.f3494g = new a(application);
                }
                a e10 = a.f3494g;
                m.c(e10);
                return e10;
            }
        }

        private a(Application application, int i10) {
            this.f3496e = application;
        }

        private final <T extends g0> T g(Class<T> cls, Application application) {
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                T t10 = (g0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                m.e(t10, "{\n                try {\n…          }\n            }");
                return t10;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public <T extends g0> T a(Class<T> cls) {
            m.f(cls, "modelClass");
            Application application = this.f3496e;
            if (application != null) {
                return g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public <T extends g0> T b(Class<T> cls, p0.a aVar) {
            m.f(cls, "modelClass");
            m.f(aVar, AppLinks.KEY_NAME_EXTRAS);
            if (this.f3496e != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(f3495h);
            if (application != null) {
                return g(cls, application);
            }
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            m.f(application, "application");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(k0 k0Var, b bVar, p0.a aVar, int i10, g gVar) {
        this(k0Var, bVar, (i10 & 4) != 0 ? a.C0177a.f10444b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h0(l0 l0Var, b bVar) {
        this(l0Var.getViewModelStore(), bVar, j0.a(l0Var));
        m.f(l0Var, "owner");
        m.f(bVar, "factory");
    }
}
