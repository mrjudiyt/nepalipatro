package t6;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Type, r6.h<?>> f16483a;

    /* renamed from: b  reason: collision with root package name */
    private final w6.b f16484b = w6.b.a();

    /* compiled from: ConstructorConstructor */
    class a implements i<T> {
        a() {
        }

        public T a() {
            return new ConcurrentHashMap();
        }
    }

    /* compiled from: ConstructorConstructor */
    class b implements i<T> {
        b() {
        }

        public T a() {
            return new TreeMap();
        }
    }

    /* renamed from: t6.c$c  reason: collision with other inner class name */
    /* compiled from: ConstructorConstructor */
    class C0283c implements i<T> {
        C0283c() {
        }

        public T a() {
            return new LinkedHashMap();
        }
    }

    /* compiled from: ConstructorConstructor */
    class d implements i<T> {
        d() {
        }

        public T a() {
            return new h();
        }
    }

    /* compiled from: ConstructorConstructor */
    class e implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        private final m f16489a = m.b();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f16490b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Type f16491c;

        e(Class cls, Type type) {
            this.f16490b = cls;
            this.f16491c = type;
        }

        public T a() {
            try {
                return this.f16489a.c(this.f16490b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f16491c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    /* compiled from: ConstructorConstructor */
    class f implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r6.h f16493a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f16494b;

        f(r6.h hVar, Type type) {
            this.f16493a = hVar;
            this.f16494b = type;
        }

        public T a() {
            return this.f16493a.a(this.f16494b);
        }
    }

    /* compiled from: ConstructorConstructor */
    class g implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r6.h f16496a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f16497b;

        g(r6.h hVar, Type type) {
            this.f16496a = hVar;
            this.f16497b = type;
        }

        public T a() {
            return this.f16496a.a(this.f16497b);
        }
    }

    /* compiled from: ConstructorConstructor */
    class h implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f16499a;

        h(Constructor constructor) {
            this.f16499a = constructor;
        }

        public T a() {
            try {
                return this.f16499a.newInstance((Object[]) null);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Failed to invoke " + this.f16499a + " with no args", e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to invoke " + this.f16499a + " with no args", e11.getTargetException());
            } catch (IllegalAccessException e12) {
                throw new AssertionError(e12);
            }
        }
    }

    /* compiled from: ConstructorConstructor */
    class i implements i<T> {
        i() {
        }

        public T a() {
            return new TreeSet();
        }
    }

    /* compiled from: ConstructorConstructor */
    class j implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f16502a;

        j(Type type) {
            this.f16502a = type;
        }

        public T a() {
            Type type = this.f16502a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f16502a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f16502a.toString());
        }
    }

    /* compiled from: ConstructorConstructor */
    class k implements i<T> {
        k() {
        }

        public T a() {
            return new LinkedHashSet();
        }
    }

    /* compiled from: ConstructorConstructor */
    class l implements i<T> {
        l() {
        }

        public T a() {
            return new ArrayDeque();
        }
    }

    /* compiled from: ConstructorConstructor */
    class m implements i<T> {
        m() {
        }

        public T a() {
            return new ArrayList();
        }
    }

    /* compiled from: ConstructorConstructor */
    class n implements i<T> {
        n() {
        }

        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, r6.h<?>> map) {
        this.f16483a = map;
    }

    private <T> i<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f16484b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i();
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new l();
            }
            return new m();
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new n();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new a();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new b();
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(x6.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) {
                return new d();
            }
            return new C0283c();
        }
    }

    private <T> i<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> i<T> a(x6.a<T> aVar) {
        Type e10 = aVar.e();
        Class<? super T> c10 = aVar.c();
        r6.h hVar = this.f16483a.get(e10);
        if (hVar != null) {
            return new f(hVar, e10);
        }
        r6.h hVar2 = this.f16483a.get(c10);
        if (hVar2 != null) {
            return new g(hVar2, e10);
        }
        i<T> b10 = b(c10);
        if (b10 != null) {
            return b10;
        }
        i<T> c11 = c(e10, c10);
        if (c11 != null) {
            return c11;
        }
        return d(e10, c10);
    }

    public String toString() {
        return this.f16483a.toString();
    }
}
