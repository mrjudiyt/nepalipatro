package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import androidx.core.app.c;
import androidx.core.app.f;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f1357a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f1358b;

    /* compiled from: CustomTabsIntent */
    private static class a {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f1357a = intent;
        this.f1358b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1357a.setData(uri);
        androidx.core.content.a.o(context, this.f1357a, this.f1358b);
    }

    /* compiled from: CustomTabsIntent */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f1359a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        private final a.C0014a f1360b = new a.C0014a();

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<Bundle> f1361c;

        /* renamed from: d  reason: collision with root package name */
        private Bundle f1362d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<Bundle> f1363e;

        /* renamed from: f  reason: collision with root package name */
        private SparseArray<Bundle> f1364f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f1365g;

        /* renamed from: h  reason: collision with root package name */
        private int f1366h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1367i = true;

        public b() {
        }

        private void d() {
            String a10 = a.a();
            if (!TextUtils.isEmpty(a10)) {
                Bundle bundleExtra = this.f1359a.hasExtra("com.android.browser.headers") ? this.f1359a.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", a10);
                    this.f1359a.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }

        private void h(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            f.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1359a.putExtras(bundle);
        }

        @Deprecated
        public b a() {
            i(1);
            return this;
        }

        public d b() {
            if (!this.f1359a.hasExtra("android.support.customtabs.extra.SESSION")) {
                h((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.f1361c;
            if (arrayList != null) {
                this.f1359a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1363e;
            if (arrayList2 != null) {
                this.f1359a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1359a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1367i);
            this.f1359a.putExtras(this.f1360b.a().a());
            Bundle bundle = this.f1365g;
            if (bundle != null) {
                this.f1359a.putExtras(bundle);
            }
            if (this.f1364f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1364f);
                this.f1359a.putExtras(bundle2);
            }
            this.f1359a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1366h);
            if (Build.VERSION.SDK_INT >= 24) {
                d();
            }
            return new d(this.f1359a, this.f1362d);
        }

        @Deprecated
        public b c() {
            this.f1359a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            return this;
        }

        public b e(Context context, int i10, int i11) {
            this.f1359a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", c.a(context, i10, i11).b());
            return this;
        }

        public b f(boolean z10) {
            this.f1367i = z10;
            return this;
        }

        public b g(f fVar) {
            this.f1359a.setPackage(fVar.d().getPackageName());
            h(fVar.c(), fVar.e());
            return this;
        }

        public b i(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f1366h = i10;
            if (i10 == 1) {
                this.f1359a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i10 == 2) {
                this.f1359a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f1359a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        public b j(boolean z10) {
            this.f1359a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public b k(Context context, int i10, int i11) {
            this.f1362d = c.a(context, i10, i11).b();
            return this;
        }

        @Deprecated
        public b l(int i10) {
            this.f1360b.b(i10);
            return this;
        }

        public b(f fVar) {
            if (fVar != null) {
                g(fVar);
            }
        }
    }
}
