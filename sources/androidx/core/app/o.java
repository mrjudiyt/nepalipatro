package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: NotificationManagerCompat */
public final class o {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2220c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static Set<String> f2221d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2222e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f2223a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f2224b;

    /* compiled from: NotificationManagerCompat */
    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private o(Context context) {
        this.f2223a = context;
        this.f2224b = (NotificationManager) context.getSystemService("notification");
    }

    public static o b(Context context) {
        return new o(context);
    }

    public boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return a.a(this.f2224b);
        }
        if (i10 < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f2223a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f2223a.getApplicationInfo();
        String packageName = this.f2223a.getApplicationContext().getPackageName();
        int i11 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i11), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
