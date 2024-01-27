package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: Lifecycling.kt */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f3519a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Integer> f3520b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<?>, List<Constructor<? extends e>>> f3521c = new HashMap();

    private q() {
    }

    private final e a(Constructor<? extends e> constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            m.e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (e) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends e> b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            m.e(name, "fullPackage");
            if (!(name.length() == 0)) {
                m.e(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                m.e(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            m.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(canonicalName);
            if (!(name.length() == 0)) {
                c10 = name + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            m.d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String str) {
        m.f(str, "className");
        return p.t(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f3520b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && l.class.isAssignableFrom(cls);
    }

    public static final k f(Object obj) {
        m.f(obj, "object");
        boolean z10 = obj instanceof k;
        boolean z11 = obj instanceof c;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((c) obj, (k) obj);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((c) obj, (k) null);
        }
        if (z10) {
            return (k) obj;
        }
        Class<?> cls = obj.getClass();
        q qVar = f3519a;
        if (qVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends e>> list = f3521c.get(cls);
        m.c(list);
        List list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(qVar.a((Constructor) list2.get(0), obj));
        }
        int size = list2.size();
        e[] eVarArr = new e[size];
        for (int i10 = 0; i10 < size; i10++) {
            eVarArr[i10] = f3519a.a((Constructor) list2.get(i10), obj);
        }
        return new CompositeGeneratedAdaptersObserver(eVarArr);
    }

    private final int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends e> b10 = b(cls);
        if (b10 != null) {
            f3521c.put(cls, o.b(b10));
            return 2;
        } else if (b.f3452c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                m.e(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends e>> list = f3521c.get(superclass);
                m.c(list);
                arrayList = new ArrayList(list);
            }
            Class[] interfaces = cls.getInterfaces();
            m.e(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (e(cls2)) {
                    m.e(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends e>> list2 = f3521c.get(cls2);
                    m.c(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3521c.put(cls, arrayList);
            return 2;
        }
    }
}
