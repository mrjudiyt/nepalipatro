package b2;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.core.app.o;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PermissionManager */
final class n implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: h  reason: collision with root package name */
    private b f4987h;

    /* renamed from: i  reason: collision with root package name */
    private Activity f4988i;

    /* renamed from: j  reason: collision with root package name */
    private Map<Integer, Integer> f4989j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4990k = false;

    @FunctionalInterface
    /* compiled from: PermissionManager */
    interface a {
        void onSuccess(int i10);
    }

    @FunctionalInterface
    /* compiled from: PermissionManager */
    interface b {
        void a(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    /* compiled from: PermissionManager */
    interface c {
        void a(boolean z10);
    }

    n() {
    }

    private int a(Context context) {
        List<String> b10 = o.b(context, 21);
        return b10 == null || b10.isEmpty() ? 0 : 1;
    }

    private int b(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return o.b(context).a() ? 1 : 0;
        }
        if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return 1;
        }
        return 0;
    }

    private int d(int i10, Context context) {
        if (i10 == 17) {
            return b(context);
        }
        if (i10 == 21) {
            return a(context);
        }
        if ((i10 == 30 || i10 == 28 || i10 == 29) && Build.VERSION.SDK_INT < 31) {
            return a(context);
        }
        List<String> b10 = o.b(context, i10);
        if (b10 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No android specific permissions needed for: ");
            sb.append(i10);
            return 1;
        } else if (b10.size() == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No permissions found in manifest for: ");
            sb2.append(b10);
            sb2.append(i10);
            if (i10 == 16 && Build.VERSION.SDK_INT < 23) {
                return 2;
            }
            if (i10 == 22 && Build.VERSION.SDK_INT < 30) {
                return 2;
            }
            if (Build.VERSION.SDK_INT < 23) {
                return 1;
            }
            return 0;
        } else {
            boolean z10 = context.getApplicationInfo().targetSdkVersion >= 23;
            for (String next : b10) {
                if (z10) {
                    if (i10 == 16) {
                        String packageName = context.getPackageName();
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (Build.VERSION.SDK_INT < 23) {
                            return 2;
                        }
                        if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                            return 0;
                        }
                        return 1;
                    } else if (i10 == 22) {
                        if (Build.VERSION.SDK_INT < 30) {
                            return 2;
                        }
                        return Environment.isExternalStorageManager() ? 1 : 0;
                    } else if (i10 == 23 && Build.VERSION.SDK_INT >= 23) {
                        return Settings.canDrawOverlays(context) ? 1 : 0;
                    } else {
                        if (i10 == 24 && Build.VERSION.SDK_INT >= 26) {
                            return context.getPackageManager().canRequestPackageInstalls() ? 1 : 0;
                        }
                        if (i10 == 27 && Build.VERSION.SDK_INT >= 23) {
                            return ((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0;
                        }
                        if (i10 == 34) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                return ((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms() ? 1 : 0;
                            }
                            return 1;
                        } else if (androidx.core.content.a.a(context, next) != 0) {
                            return 0;
                        }
                    }
                }
            }
            return 1;
        }
    }

    private void e(String str, int i10) {
        String packageName = this.f4988i.getPackageName();
        Intent intent = new Intent();
        intent.setAction(str);
        intent.setData(Uri.parse("package:" + packageName));
        this.f4988i.startActivityForResult(intent, i10);
    }

    private void f(String str, int i10) {
        this.f4988i.startActivityForResult(new Intent(str), i10);
    }

    /* access modifiers changed from: package-private */
    public void c(int i10, Context context, a aVar) {
        aVar.onSuccess(d(i10, context));
    }

    /* access modifiers changed from: package-private */
    public void g(List<Integer> list, Activity activity, b bVar, b bVar2) {
        if (this.f4990k) {
            bVar2.a("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).");
        } else if (activity == null) {
            bVar2.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
        } else {
            this.f4987h = bVar;
            this.f4988i = activity;
            this.f4989j = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Integer next : list) {
                if (d(next.intValue(), activity) != 1) {
                    List<String> b10 = o.b(activity, next.intValue());
                    if (b10 != null && !b10.isEmpty()) {
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 23 && next.intValue() == 16) {
                            e("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", 209);
                        } else if (i10 >= 30 && next.intValue() == 22) {
                            e("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", 210);
                        } else if (i10 >= 23 && next.intValue() == 23) {
                            e("android.settings.action.MANAGE_OVERLAY_PERMISSION", 211);
                        } else if (i10 >= 26 && next.intValue() == 24) {
                            e("android.settings.MANAGE_UNKNOWN_APP_SOURCES", 212);
                        } else if (i10 < 23 || next.intValue() != 27) {
                            arrayList.addAll(b10);
                        } else {
                            f("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                        }
                    } else if (!this.f4989j.containsKey(next)) {
                        if (next.intValue() != 16 || Build.VERSION.SDK_INT >= 23) {
                            this.f4989j.put(next, 0);
                        } else {
                            this.f4989j.put(next, 2);
                        }
                        if (next.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                            this.f4989j.put(next, 0);
                        } else {
                            this.f4989j.put(next, 2);
                        }
                    }
                } else if (!this.f4989j.containsKey(next)) {
                    this.f4989j.put(next, 1);
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (arrayList.size() > 0) {
                this.f4990k = true;
                androidx.core.app.b.w(activity, strArr, 24);
                return;
            }
            this.f4990k = false;
            if (this.f4989j.size() > 0) {
                bVar.a(this.f4989j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(int i10, Activity activity, c cVar, b bVar) {
        if (activity == null) {
            bVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> b10 = o.b(activity, i10);
        if (b10 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No android specific permissions needed for: ");
            sb.append(i10);
            cVar.a(false);
        } else if (b10.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No permissions found in manifest for: ");
            sb2.append(i10);
            sb2.append(" no need to show request rationale");
            cVar.a(false);
        } else {
            cVar.a(androidx.core.app.b.z(activity, b10.get(0)));
        }
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 209 && i10 != 210 && i10 != 211 && i10 != 212 && i10 != 213) {
            return false;
        }
        boolean z10 = i11 == -1;
        int i12 = 23;
        if (i10 == 209) {
            i12 = 16;
        } else if (i10 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            z10 = Environment.isExternalStorageManager();
            i12 = 22;
        } else if (i10 == 211) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            z10 = Settings.canDrawOverlays(this.f4988i);
        } else if (i10 == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            z10 = this.f4988i.getPackageManager().canRequestPackageInstalls();
            i12 = 24;
        } else if (i10 != 213 || Build.VERSION.SDK_INT < 23) {
            return false;
        } else {
            z10 = ((NotificationManager) this.f4988i.getSystemService("notification")).isNotificationPolicyAccessGranted();
            i12 = 27;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(i12), Integer.valueOf(z10 ? 1 : 0));
        this.f4987h.a(hashMap);
        return true;
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 24) {
            this.f4990k = false;
            return false;
        } else if (this.f4989j == null) {
            return false;
        } else {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str = strArr[i11];
                int f10 = o.f(str);
                if (f10 != 20) {
                    int i12 = iArr[i11];
                    if (f10 == 7) {
                        if (!this.f4989j.containsKey(7)) {
                            this.f4989j.put(7, Integer.valueOf(o.g(this.f4988i, str, i12)));
                        }
                        if (!this.f4989j.containsKey(14)) {
                            this.f4989j.put(14, Integer.valueOf(o.g(this.f4988i, str, i12)));
                        }
                    } else if (f10 == 4) {
                        int g10 = o.g(this.f4988i, str, i12);
                        if (!this.f4989j.containsKey(4)) {
                            this.f4989j.put(4, Integer.valueOf(g10));
                        }
                    } else if (f10 == 3) {
                        int g11 = o.g(this.f4988i, str, i12);
                        if (Build.VERSION.SDK_INT < 29 && !this.f4989j.containsKey(4)) {
                            this.f4989j.put(4, Integer.valueOf(g11));
                        }
                        if (!this.f4989j.containsKey(5)) {
                            this.f4989j.put(5, Integer.valueOf(g11));
                        }
                        this.f4989j.put(Integer.valueOf(f10), Integer.valueOf(g11));
                    } else if (!this.f4989j.containsKey(Integer.valueOf(f10))) {
                        this.f4989j.put(Integer.valueOf(f10), Integer.valueOf(o.g(this.f4988i, str, i12)));
                    }
                    o.h(this.f4988i, f10);
                }
            }
            this.f4987h.a(this.f4989j);
            this.f4990k = false;
            return true;
        }
    }
}
