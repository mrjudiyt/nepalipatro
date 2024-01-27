package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.core.app.o;
import androidx.core.os.i;
import java.io.File;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* compiled from: ContextCompat */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2248a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2249b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static TypedValue f2250c;

    /* renamed from: androidx.core.content.a$a  reason: collision with other inner class name */
    /* compiled from: ContextCompat */
    static class C0028a {
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat */
    static class b {
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat */
    static class c {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat */
    static class d {
        static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        static <T> T b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat */
    static class e {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat */
    static class f {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            if ((i10 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, a.k(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* compiled from: ContextCompat */
    static class g {
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* compiled from: ContextCompat */
    static class h {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
        }
    }

    public static int a(Context context, String str) {
        androidx.core.util.c.e(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return o.b(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File c(java.io.File r3) {
        /*
            java.lang.Object r0 = f2249b
            monitor-enter(r0)
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r3.mkdirs()     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0011:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "Unable to create files subdir "
            r1.append(r2)     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = r3.getPath()     // Catch:{ all -> 0x0024 }
            r1.append(r2)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0024:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.a.c(java.io.File):java.io.File");
    }

    public static int d(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.a(context, i10);
        }
        return context.getResources().getColor(i10);
    }

    public static ColorStateList e(Context context, int i10) {
        return androidx.core.content.res.h.c(context.getResources(), i10, context.getTheme());
    }

    public static Drawable f(Context context, int i10) {
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            return c.b(context, i10);
        }
        if (i12 >= 16) {
            return context.getResources().getDrawable(i10);
        }
        synchronized (f2248a) {
            if (f2250c == null) {
                f2250c = new TypedValue();
            }
            context.getResources().getValue(i10, f2250c, true);
            i11 = f2250c.resourceId;
        }
        return context.getResources().getDrawable(i11);
    }

    public static File[] g(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return b.a(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static File[] h(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return b.b(context, str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    public static Executor i(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return g.a(context);
        }
        return i.a(new Handler(context.getMainLooper()));
    }

    public static File j(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return c.c(context);
        }
        return c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    static String k(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (c.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return m(context, broadcastReceiver, intentFilter, (String) null, (Handler) null, i10);
    }

    public static Intent m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 == 0 || (i10 & 4) == 0) {
            if (i11 != 0) {
                i10 |= 2;
            }
            int i12 = i10;
            int i13 = i12 & 2;
            if (i13 == 0 && (i12 & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            } else if (i13 == 0 || (i12 & 4) == 0) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 33) {
                    return h.a(context, broadcastReceiver, intentFilter, str, handler, i12);
                }
                if (i14 >= 26) {
                    return f.a(context, broadcastReceiver, intentFilter, str, handler, i12);
                }
                if ((i12 & 4) == 0 || str != null) {
                    return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
                }
                return context.registerReceiver(broadcastReceiver, intentFilter, k(context), handler);
            } else {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            }
        } else {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
    }

    public static boolean n(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0028a.a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void o(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0028a.b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static void p(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
