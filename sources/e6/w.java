package e6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.install.InstallException;
import f6.c;
import f6.d0;
import f6.e0;
import f6.o;
import f6.s;
import f6.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class w {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final s f14283e = new s("AppUpdateService");

    /* renamed from: f  reason: collision with root package name */
    private static final Intent f14284f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    d0 f14285a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f14286b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f14287c;

    /* renamed from: d  reason: collision with root package name */
    private final y f14288d;

    w(Context context, y yVar) {
        this.f14286b = context.getPackageName();
        this.f14287c = context;
        this.f14288d = yVar;
        if (c.a(context)) {
            this.f14285a = new d0(e0.a(context), f14283e, "AppUpdateService", f14284f, q.f14271a, (y) null);
        }
    }

    static /* bridge */ /* synthetic */ Bundle b(w wVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(i());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(wVar.f14287c.getPackageManager().getPackageInfo(wVar.f14287c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f14283e.b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    static /* bridge */ /* synthetic */ a f(w wVar, Bundle bundle, String str) {
        Integer num;
        Bundle bundle2 = bundle;
        int i10 = bundle2.getInt("version.code", -1);
        int i11 = bundle2.getInt("update.availability");
        int i12 = bundle2.getInt("install.status", 0);
        if (bundle2.getInt("client.version.staleness", -1) == -1) {
            num = null;
        } else {
            num = Integer.valueOf(bundle2.getInt("client.version.staleness"));
        }
        int i13 = bundle2.getInt("in.app.update.priority", 0);
        long j10 = bundle2.getLong("bytes.downloaded");
        HashMap hashMap = r9;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("blocking.destructive.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        hashMap2.put("nonblocking.destructive.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        hashMap2.put("blocking.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        hashMap2.put("nonblocking.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return a.k(str, i10, i11, i12, num, i13, j10, bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), wVar.f14288d.a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"), hashMap);
    }

    /* access modifiers changed from: private */
    public static Bundle i() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map a10 = o.a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) a10.get("java")).intValue());
        if (a10.containsKey(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE)) {
            bundle2.putInt("playcore_native_version", ((Integer) a10.get(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE)).intValue());
        }
        if (a10.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) a10.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    private static Task j() {
        f14283e.b("onError(%d)", -9);
        return Tasks.forException(new InstallException(-9));
    }

    private static HashSet k(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public final Task d(String str) {
        if (this.f14285a == null) {
            return j();
        }
        f14283e.d("completeUpdate(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f14285a.s(new s(this, taskCompletionSource, taskCompletionSource, str), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(String str) {
        if (this.f14285a == null) {
            return j();
        }
        f14283e.d("requestUpdateInfo(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f14285a.s(new r(this, taskCompletionSource, str, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
