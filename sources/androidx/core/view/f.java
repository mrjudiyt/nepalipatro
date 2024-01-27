package androidx.core.view;

import android.os.Build;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* compiled from: LayoutInflaterCompat */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static Field f2514a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2515b;

    private static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f2515b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f2514a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(LayoutInflater.class.getName());
                sb.append("; inflation may have unexpected results.");
            }
            f2515b = true;
        }
        Field field = f2514a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append("; inflation may have unexpected results.");
            }
        }
    }

    public static void b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                a(layoutInflater, factory2);
            }
        }
    }
}
