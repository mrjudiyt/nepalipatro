package d3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.facebook.internal.NativeProtocol;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import y8.l;

/* compiled from: CustomTabsPackage.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f7944a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f7945b = p.g("com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome");

    /* compiled from: CustomTabsPackage.kt */
    static final class a extends n implements l<ResolveInfo, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f7946h = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(ResolveInfo resolveInfo) {
            return resolveInfo.activityInfo.packageName;
        }
    }

    /* renamed from: d3.b$b  reason: collision with other inner class name */
    /* compiled from: CustomTabsPackage.kt */
    static final class C0123b extends n implements l<String, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0123b f7947h = new C0123b();

        C0123b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(!b.f7944a.a().contains(str));
        }
    }

    /* compiled from: CustomTabsPackage.kt */
    static final class c extends n implements l<String, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ PackageManager f7948h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PackageManager packageManager) {
            super(1);
            this.f7948h = packageManager;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService").setPackage(str);
            m.e(intent, "Intent(CustomTabsService…          .setPackage(it)");
            boolean z10 = false;
            if (this.f7948h.resolveService(intent, 0) != null) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    private b() {
    }

    public final List<String> a() {
        return f7945b;
    }

    public final List<String> b(Context context) {
        m.f(context, "context");
        Intent addCategory = new Intent("android.intent.action.VIEW", Uri.parse("http://")).addCategory("android.intent.category.BROWSABLE");
        m.e(addCategory, "Intent(ACTION_VIEW, Uri.…ntent.CATEGORY_BROWSABLE)");
        int i10 = Build.VERSION.SDK_INT >= 23 ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(addCategory, i10);
        m.e(queryIntentActivities, "pm.queryIntentActivities(activityIntent, flag)");
        return i.g(i.d(i.d(i.e(x.p(queryIntentActivities), a.f7946h), C0123b.f7947h), new c(packageManager)));
    }
}
