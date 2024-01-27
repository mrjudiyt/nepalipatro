package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: ActivityCompat */
public class b extends androidx.core.content.a {

    /* renamed from: d  reason: collision with root package name */
    private static h f2085d;

    /* compiled from: ActivityCompat */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String[] f2086h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Activity f2087i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f2088j;

        a(String[] strArr, Activity activity, int i10) {
            this.f2086h = strArr;
            this.f2087i = activity;
            this.f2088j = i10;
        }

        public void run() {
            int[] iArr = new int[this.f2086h.length];
            PackageManager packageManager = this.f2087i.getPackageManager();
            String packageName = this.f2087i.getPackageName();
            int length = this.f2086h.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f2086h[i10], packageName);
            }
            ((g) this.f2087i).onRequestPermissionsResult(this.f2088j, this.f2086h, iArr);
        }
    }

    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    /* compiled from: ActivityCompat */
    static class C0023b {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* compiled from: ActivityCompat */
    static class c {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* compiled from: ActivityCompat */
    static class d {
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat */
    static class e {
        static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        static boolean b(Activity activity, String str) {
            try {
                PackageManager packageManager = activity.getApplication().getPackageManager();
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(packageManager, new Object[]{str})).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* compiled from: ActivityCompat */
    static class f {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat */
    public interface g {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat */
    public interface h {
        boolean a(Activity activity, String[] strArr, int i10);
    }

    /* compiled from: ActivityCompat */
    public interface i {
        void validateRequestPermissionsRequestCode(int i10);
    }

    public static void A(Activity activity, Intent intent, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0023b.b(activity, intent, i10, bundle);
        } else {
            activity.startActivityForResult(intent, i10);
        }
    }

    public static void B(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0023b.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
        }
    }

    public static void C(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.e(activity);
        }
    }

    public static void r(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0023b.a(activity);
        } else {
            activity.finish();
        }
    }

    public static void s(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.a(activity);
        } else {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(Activity activity) {
        if (!activity.isFinishing() && !d.i(activity)) {
            activity.recreate();
        }
    }

    public static void u(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.b(activity);
        }
    }

    public static void v(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new a(activity));
        }
    }

    public static void w(Activity activity, String[] strArr, int i10) {
        h hVar = f2085d;
        if (hVar == null || !hVar.a(activity, strArr, i10)) {
            HashSet hashSet = new HashSet();
            int i11 = 0;
            while (i11 < strArr.length) {
                if (!TextUtils.isEmpty(strArr[i11])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i11));
                    }
                    i11++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[(strArr.length - size)] : strArr;
            if (size > 0) {
                if (size != strArr.length) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < strArr.length; i13++) {
                        if (!hashSet.contains(Integer.valueOf(i13))) {
                            strArr2[i12] = strArr[i13];
                            i12++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof i) {
                    ((i) activity).validateRequestPermissionsRequestCode(i10);
                }
                d.b(activity, strArr, i10);
            } else if (activity instanceof g) {
                new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i10));
            }
        }
    }

    public static void x(Activity activity, t tVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.c(activity, (SharedElementCallback) null);
        }
    }

    public static void y(Activity activity, t tVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.d(activity, (SharedElementCallback) null);
        }
    }

    public static boolean z(Activity activity, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i10 >= 32) {
            return f.a(activity, str);
        }
        if (i10 == 31) {
            return e.b(activity, str);
        }
        if (i10 >= 23) {
            return d.c(activity, str);
        }
        return false;
    }
}
