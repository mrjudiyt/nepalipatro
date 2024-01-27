package w6;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* compiled from: UnsafeReflectionAccessor */
final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private static Class f16983d;

    /* renamed from: b  reason: collision with root package name */
    private final Object f16984b = d();

    /* renamed from: c  reason: collision with root package name */
    private final Field f16985c = c();

    c() {
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f16983d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public void b(AccessibleObject accessibleObject) {
        if (!e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e10) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e(AccessibleObject accessibleObject) {
        if (!(this.f16984b == null || this.f16985c == null)) {
            try {
                long longValue = ((Long) f16983d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f16984b, new Object[]{this.f16985c})).longValue();
                f16983d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f16984b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
