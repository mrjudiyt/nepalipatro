package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CustomTabsClient */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final b.b f1351a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f1352b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1353c;

    /* compiled from: CustomTabsClient */
    class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f1354a;

        a(Context context) {
            this.f1354a = context;
        }

        public final void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
            cVar.h(0);
            this.f1354a.unbindService(this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* compiled from: CustomTabsClient */
    class b extends a.C0089a {

        /* renamed from: h  reason: collision with root package name */
        private Handler f1355h = new Handler(Looper.getMainLooper());

        b(b bVar) {
        }

        public void U(int i10, int i11, Bundle bundle) {
        }

        public void a0(String str, Bundle bundle) {
        }

        public void i0(int i10, Bundle bundle) {
        }

        public void p0(String str, Bundle bundle) {
        }

        public void s0(Bundle bundle) {
        }

        public void t0(int i10, Uri uri, boolean z10, Bundle bundle) {
        }

        public Bundle z(String str, Bundle bundle) {
            return null;
        }
    }

    c(b.b bVar, ComponentName componentName, Context context) {
        this.f1351a = bVar;
        this.f1352b = componentName;
        this.f1353c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private a.C0089a c(b bVar) {
        return new b(bVar);
    }

    public static String d(Context context, List<String> list) {
        return e(context, list, false);
    }

    public static String e(Context context, List<String> list, boolean z10) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String next : arrayList) {
            intent2.setPackage(next);
            if (packageManager.resolveService(intent2, 0) != null) {
                return next;
            }
        }
        return null;
    }

    private f g(b bVar, PendingIntent pendingIntent) {
        boolean z10;
        a.C0089a c10 = c(bVar);
        if (pendingIntent != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                z10 = this.f1351a.f0(c10, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        } else {
            z10 = this.f1351a.M(c10);
        }
        if (!z10) {
            return null;
        }
        return new f(this.f1351a, c10, this.f1352b, pendingIntent);
    }

    public f f(b bVar) {
        return g(bVar, (PendingIntent) null);
    }

    public boolean h(long j10) {
        try {
            return this.f1351a.L(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
