package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import b.a;
import b.b;
import java.util.List;

/* compiled from: CustomTabsSession */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1369a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final b f1370b;

    /* renamed from: c  reason: collision with root package name */
    private final a f1371c;

    /* renamed from: d  reason: collision with root package name */
    private final ComponentName f1372d;

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f1373e;

    f(b bVar, a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1370b = bVar;
        this.f1371c = aVar;
        this.f1372d = componentName;
        this.f1373e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f1373e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public IBinder c() {
        return this.f1371c.asBinder();
    }

    /* access modifiers changed from: package-private */
    public ComponentName d() {
        return this.f1372d;
    }

    /* access modifiers changed from: package-private */
    public PendingIntent e() {
        return this.f1373e;
    }

    public boolean f(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f1370b.D(this.f1371c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
