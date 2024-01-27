package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzepp implements zzetw {
    private final zzgad zza;
    private final Context zzb;

    zzepp(zzgad zzgad, Context context) {
        this.zza = zzgad;
        this.zzb = context;
    }

    public final int zza() {
        return 14;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final e zzb() {
        return this.zza.zzb(new zzepo(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzepq zzc() {
        Intent intent;
        double d10;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzkc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            intent = this.zzb.registerReceiver((BroadcastReceiver) null, intentFilter);
        } else {
            intent = this.zzb.registerReceiver((BroadcastReceiver) null, intentFilter, 4);
        }
        boolean z10 = false;
        if (intent != null) {
            int intExtra = intent.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1);
            double intExtra2 = (double) intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            double intExtra3 = (double) intent.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z10 = true;
            }
            d10 = intExtra2 / intExtra3;
        } else {
            d10 = -1.0d;
        }
        return new zzepq(d10, z10);
    }
}
