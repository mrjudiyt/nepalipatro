package h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.k0;
import androidx.core.content.res.c;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* compiled from: AppCompatResources */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f8927a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C0142a>> f8928b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f8929c = new Object();

    /* renamed from: h.a$a  reason: collision with other inner class name */
    /* compiled from: AppCompatResources */
    private static class C0142a {

        /* renamed from: a  reason: collision with root package name */
        final ColorStateList f8930a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f8931b;

        C0142a(ColorStateList colorStateList, Configuration configuration) {
            this.f8930a = colorStateList;
            this.f8931b = configuration;
        }
    }

    private static void a(Context context, int i10, ColorStateList colorStateList) {
        synchronized (f8929c) {
            WeakHashMap<Context, SparseArray<C0142a>> weakHashMap = f8928b;
            SparseArray sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i10, new C0142a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList b(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f8929c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<h.a$a>> r1 = f8928b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            h.a$a r2 = (h.a.C0142a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f8931b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f8930a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.b(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static ColorStateList c(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i10);
        }
        ColorStateList b10 = b(context, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList f10 = f(context, i10);
        if (f10 == null) {
            return androidx.core.content.a.e(context, i10);
        }
        a(context, i10, f10);
        return f10;
    }

    public static Drawable d(Context context, int i10) {
        return k0.h().j(context, i10);
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f8927a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList f(Context context, int i10) {
        if (g(context, i10)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return c.a(resources, resources.getXml(i10), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean g(Context context, int i10) {
        Resources resources = context.getResources();
        TypedValue e10 = e();
        resources.getValue(i10, e10, true);
        int i11 = e10.type;
        if (i11 < 28 || i11 > 31) {
            return false;
        }
        return true;
    }
}
