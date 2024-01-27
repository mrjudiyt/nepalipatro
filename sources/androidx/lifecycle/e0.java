package androidx.lifecycle;

import android.app.Application;
import com.facebook.internal.NativeProtocol;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: SavedStateViewModelFactory.kt */
public final class e0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f3470a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f3471b;

    static {
        Class<z> cls = z.class;
        f3470a = p.g(Application.class, cls);
        f3471b = o.b(cls);
    }

    public static final <T> Constructor<T> c(Class<T> cls, List<? extends Class<?>> list) {
        m.f(cls, "modelClass");
        m.f(list, "signature");
        Constructor<T>[] constructors = cls.getConstructors();
        m.e(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i10 = 0;
        while (i10 < length) {
            Constructor<T> constructor = constructors[i10];
            Class[] parameterTypes = constructor.getParameterTypes();
            m.e(parameterTypes, "constructor.parameterTypes");
            List y10 = k.y(parameterTypes);
            if (m.a(list, y10)) {
                m.d(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() != y10.size() || !y10.containsAll(list)) {
                i10++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends g0> T d(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        m.f(cls, "modelClass");
        m.f(constructor, "constructor");
        m.f(objArr, NativeProtocol.WEB_DIALOG_PARAMS);
        try {
            return (g0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
