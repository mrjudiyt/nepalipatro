package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final /* synthetic */ class zzbop implements Runnable {
    public final /* synthetic */ zzboq zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzbop(zzboq zzboq, Context context, String str) {
        this.zza = zzboq;
        this.zzb = context;
        this.zzc = str;
    }

    public final void run() {
        Context context = this.zzb;
        zzbci.zza(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) zzba.zzc().zzb(zzbci.zzah)).booleanValue());
        if (((Boolean) zzba.zzc().zzb(zzbci.zzao)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        try {
            ((zzchv) zzcax.zzb(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzboo.zza)).zze(ObjectWrapper.wrap(context), new zzbon(AppMeasurementSdk.getInstance(context, "FA-Ads", "am", this.zzc, bundle)));
        } catch (RemoteException | zzcaw | NullPointerException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }
}
