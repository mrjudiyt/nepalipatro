package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.b;
import androidx.work.c;
import androidx.work.e;
import androidx.work.n;
import androidx.work.o;
import androidx.work.w;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcat;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public class WorkManagerUtil extends zzbs {
    private static void zzb(Context context) {
        try {
            w.g(context.getApplicationContext(), new b.C0083b().a());
        } catch (IllegalStateException unused) {
        }
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            w f10 = w.f(context);
            f10.a("offline_ping_sender_work");
            f10.b((o) ((o.a) ((o.a) new o.a(OfflinePingSender.class).e(new c.a().b(n.CONNECTED).a())).a("offline_ping_sender_work")).b());
        } catch (IllegalStateException e10) {
            zzcat.zzk("Failed to instantiate WorkManager.", e10);
        }
    }

    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        c a10 = new c.a().b(n.CONNECTED).a();
        try {
            w.f(context).b((o) ((o.a) ((o.a) ((o.a) new o.a(OfflineNotificationPoster.class).e(a10)).f(new e.a().f(ShareConstants.MEDIA_URI, str).f("gws_query_id", str2).a())).a("offline_notification_work")).b());
            return true;
        } catch (IllegalStateException e10) {
            zzcat.zzk("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
