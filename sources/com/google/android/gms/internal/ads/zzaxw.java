package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final /* synthetic */ class zzaxw implements Runnable {
    public final /* synthetic */ zzayb zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzaxw(zzayb zzayb, Context context) {
        this.zza = zzayb;
        this.zzb = context;
    }

    public final void run() {
        boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbci.zzeM)).booleanValue();
        zzayb zzayb = this.zza;
        Context context = this.zzb;
        if (booleanValue) {
            try {
                zzayb.zza = (zzaur) zzcax.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzaxx.zza);
                zzayb.zza.zze(ObjectWrapper.wrap(context), "GMA_SDK");
                zzayb.zzb = true;
            } catch (RemoteException | zzcaw | NullPointerException unused) {
                zzcat.zze("Cannot dynamite load clearcut");
            }
        }
    }
}
