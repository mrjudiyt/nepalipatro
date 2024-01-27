package com.google.common.collect;

import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* compiled from: Serialization */
final class d1 {

    /* compiled from: Serialization */
    static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Field f13557a;

        /* access modifiers changed from: package-private */
        public void a(T t10, int i10) {
            try {
                this.f13557a.set(t10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(T t10, Object obj) {
            try {
                this.f13557a.set(t10, obj);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        private b(Field field) {
            this.f13557a = field;
            field.setAccessible(true);
        }
    }

    static <T> b<T> a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    static <K, V> void b(n0<K, V> n0Var, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(n0Var.a().size());
        for (Map.Entry next : n0Var.a().entrySet()) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeInt(((Collection) next.getValue()).size());
            for (Object writeObject : (Collection) next.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }
}
