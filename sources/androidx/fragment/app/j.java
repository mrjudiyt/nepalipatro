package androidx.fragment.app;

import androidx.collection.h;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentFactory */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final h<ClassLoader, h<String, Class<?>>> f3205a = new h<>();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) {
        h<ClassLoader, h<String, Class<?>>> hVar = f3205a;
        h hVar2 = hVar.get(classLoader);
        if (hVar2 == null) {
            hVar2 = new h();
            hVar.put(classLoader, hVar2);
        }
        Class<?> cls = (Class) hVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        hVar2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e10) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e10);
        } catch (ClassCastException e11) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e11);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
