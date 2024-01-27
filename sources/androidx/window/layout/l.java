package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.z;
import o8.g;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f4628a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final g f4629b = i.a(e.f4634h);

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    static final class a extends n implements y8.a<Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ClassLoader f4630h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ClassLoader classLoader) {
            super(0);
            this.f4630h = classLoader;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            l lVar = l.f4628a;
            Class d10 = lVar.l(this.f4630h);
            boolean z10 = false;
            Method method = d10.getMethod("getBounds", new Class[0]);
            Method method2 = d10.getMethod("getType", new Class[0]);
            Method method3 = d10.getMethod("getState", new Class[0]);
            m.e(method, "getBoundsMethod");
            if (lVar.j(method, z.b(Rect.class)) && lVar.o(method)) {
                m.e(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (lVar.j(method2, z.b(cls)) && lVar.o(method2)) {
                    m.e(method3, "getStateMethod");
                    if (lVar.j(method3, z.b(cls)) && lVar.o(method3)) {
                        z10 = true;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    static final class b extends n implements y8.a<Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ClassLoader f4631h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f4631h = classLoader;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            l lVar = l.f4628a;
            boolean z10 = false;
            Method method = lVar.t(this.f4631h).getMethod("getWindowLayoutComponent", new Class[0]);
            Class h10 = lVar.v(this.f4631h);
            m.e(method, "getWindowLayoutComponentMethod");
            if (lVar.o(method)) {
                m.e(h10, "windowLayoutComponentClass");
                if (lVar.k(method, h10)) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    static final class c extends n implements y8.a<Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ClassLoader f4632h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ClassLoader classLoader) {
            super(0);
            this.f4632h = classLoader;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            l lVar = l.f4628a;
            Class h10 = lVar.v(this.f4632h);
            boolean z10 = false;
            Method method = h10.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, Consumer.class});
            Method method2 = h10.getMethod("removeWindowLayoutInfoListener", new Class[]{Consumer.class});
            m.e(method, "addListenerMethod");
            if (lVar.o(method)) {
                m.e(method2, "removeListenerMethod");
                if (lVar.o(method2)) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    static final class d extends n implements y8.a<Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ClassLoader f4633h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ClassLoader classLoader) {
            super(0);
            this.f4633h = classLoader;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            l lVar = l.f4628a;
            boolean z10 = false;
            Method declaredMethod = lVar.u(this.f4633h).getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class f10 = lVar.t(this.f4633h);
            m.e(declaredMethod, "getWindowExtensionsMethod");
            m.e(f10, "windowExtensionsClass");
            if (lVar.k(declaredMethod, f10) && lVar.o(declaredMethod)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    static final class e extends n implements y8.a<WindowLayoutComponent> {

        /* renamed from: h  reason: collision with root package name */
        public static final e f4634h = new e();

        e() {
            super(0);
        }

        /* renamed from: a */
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = l.class.getClassLoader();
            if (classLoader == null || !l.f4628a.i(classLoader)) {
                WindowLayoutComponent windowLayoutComponent = null;
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                WindowLayoutComponent windowLayoutComponent2 = null;
                return null;
            }
        }
    }

    private l() {
    }

    /* access modifiers changed from: private */
    public final boolean i(ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT < 24 || !r(classLoader) || !p(classLoader) || !q(classLoader) || !n(classLoader)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final boolean j(Method method, e9.c<?> cVar) {
        return k(method, x8.a.a(cVar));
    }

    /* access modifiers changed from: private */
    public final boolean k(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* access modifiers changed from: private */
    public final Class<?> l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final boolean n(ClassLoader classLoader) {
        return s(new a(classLoader));
    }

    /* access modifiers changed from: private */
    public final boolean o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean p(ClassLoader classLoader) {
        return s(new b(classLoader));
    }

    private final boolean q(ClassLoader classLoader) {
        return s(new c(classLoader));
    }

    private final boolean r(ClassLoader classLoader) {
        return s(new d(classLoader));
    }

    private final boolean s(y8.a<Boolean> aVar) {
        try {
            return aVar.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final Class<?> t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* access modifiers changed from: private */
    public final Class<?> u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* access modifiers changed from: private */
    public final Class<?> v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public final WindowLayoutComponent m() {
        return (WindowLayoutComponent) f4629b.getValue();
    }
}
