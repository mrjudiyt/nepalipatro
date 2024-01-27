package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.k;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements k {

    /* renamed from: i  reason: collision with root package name */
    private static int f506i;

    /* renamed from: j  reason: collision with root package name */
    private static Field f507j;

    /* renamed from: k  reason: collision with root package name */
    private static Field f508k;

    /* renamed from: l  reason: collision with root package name */
    private static Field f509l;

    /* renamed from: h  reason: collision with root package name */
    private Activity f510h;

    ImmLeaksCleaner(Activity activity) {
        this.f510h = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static void g() {
        try {
            f506i = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f508k = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f509l = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f507j = declaredField3;
            declaredField3.setAccessible(true);
            f506i = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStateChanged(androidx.lifecycle.m r3, androidx.lifecycle.h.a r4) {
        /*
            r2 = this;
            androidx.lifecycle.h$a r3 = androidx.lifecycle.h.a.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f506i
            if (r3 != 0) goto L_0x000c
            g()
        L_0x000c:
            int r3 = f506i
            r4 = 1
            if (r3 != r4) goto L_0x004e
            android.app.Activity r3 = r2.f510h
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f507j     // Catch:{ IllegalAccessException -> 0x004e }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x004e }
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f508k     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            if (r0 != 0) goto L_0x0031
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0031:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0039
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0039:
            java.lang.reflect.Field r0 = f509l     // Catch:{ IllegalAccessException -> 0x0044 }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x0044 }
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            r3.isActive()
            goto L_0x004e
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r3 = move-exception
            goto L_0x004c
        L_0x0048:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004c:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.onStateChanged(androidx.lifecycle.m, androidx.lifecycle.h$a):void");
    }
}
