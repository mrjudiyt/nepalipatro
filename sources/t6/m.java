package t6;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: UnsafeAllocator */
public abstract class m {

    /* compiled from: UnsafeAllocator */
    static class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f16553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f16554b;

        a(Method method, Object obj) {
            this.f16553a = method;
            this.f16554b = obj;
        }

        public <T> T c(Class<T> cls) {
            m.a(cls);
            return this.f16553a.invoke(this.f16554b, new Object[]{cls});
        }
    }

    /* compiled from: UnsafeAllocator */
    static class b extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f16555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f16556b;

        b(Method method, int i10) {
            this.f16555a = method;
            this.f16556b = i10;
        }

        public <T> T c(Class<T> cls) {
            m.a(cls);
            return this.f16555a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f16556b)});
        }
    }

    /* compiled from: UnsafeAllocator */
    static class c extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f16557a;

        c(Method method) {
            this.f16557a = method;
        }

        public <T> T c(Class<T> cls) {
            m.a(cls);
            return this.f16557a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    /* compiled from: UnsafeAllocator */
    static class d extends m {
        d() {
        }

        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static m b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                } catch (Exception unused3) {
                    return new d();
                }
            }
        }
    }

    public abstract <T> T c(Class<T> cls);
}
