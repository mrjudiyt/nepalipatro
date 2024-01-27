package androidx.lifecycle;

import androidx.lifecycle.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: ClassesInfoCache */
final class b {

    /* renamed from: c  reason: collision with root package name */
    static b f3452c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, a> f3453a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f3454b = new HashMap();

    @Deprecated
    /* compiled from: ClassesInfoCache */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map<h.a, List<C0050b>> f3455a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<C0050b, h.a> f3456b;

        a(Map<C0050b, h.a> map) {
            this.f3456b = map;
            for (Map.Entry next : map.entrySet()) {
                h.a aVar = (h.a) next.getValue();
                List list = this.f3455a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3455a.put(aVar, list);
                }
                list.add((C0050b) next.getKey());
            }
        }

        private static void b(List<C0050b> list, m mVar, h.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(mVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(m mVar, h.a aVar, Object obj) {
            b(this.f3455a.get(aVar), mVar, aVar, obj);
            b(this.f3455a.get(h.a.ON_ANY), mVar, aVar, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* compiled from: ClassesInfoCache */
    static final class C0050b {

        /* renamed from: a  reason: collision with root package name */
        final int f3457a;

        /* renamed from: b  reason: collision with root package name */
        final Method f3458b;

        C0050b(int i10, Method method) {
            this.f3457a = i10;
            this.f3458b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(m mVar, h.a aVar, Object obj) {
            try {
                int i10 = this.f3457a;
                if (i10 == 0) {
                    this.f3458b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f3458b.invoke(obj, new Object[]{mVar});
                } else if (i10 == 2) {
                    this.f3458b.invoke(obj, new Object[]{mVar, aVar});
                }
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to call observer method", e10.getCause());
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0050b)) {
                return false;
            }
            C0050b bVar = (C0050b) obj;
            if (this.f3457a != bVar.f3457a || !this.f3458b.getName().equals(bVar.f3458b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f3457a * 31) + this.f3458b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c10 = c(superclass)) == null)) {
            hashMap.putAll(c10.f3456b);
        }
        for (Class c11 : cls.getInterfaces()) {
            for (Map.Entry next : c(c11).f3456b.entrySet()) {
                e(hashMap, (C0050b) next.getKey(), (h.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            u uVar = (u) method.getAnnotation(u.class);
            if (uVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (m.class.isAssignableFrom(parameterTypes[0])) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                h.a value = uVar.value();
                if (parameterTypes.length > 1) {
                    if (!h.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == h.a.ON_ANY) {
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new C0050b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f3453a.put(cls, aVar);
        this.f3454b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<C0050b, h.a> map, C0050b bVar, h.a aVar, Class<?> cls) {
        h.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f3458b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.f3453a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f3454b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method annotation : b10) {
            if (((u) annotation.getAnnotation(u.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f3454b.put(cls, Boolean.FALSE);
        return false;
    }
}
