package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzduh implements Runnable {
    public final /* synthetic */ zzdur zza;
    public final /* synthetic */ zzcbl zzb;

    public /* synthetic */ zzduh(zzdur zzdur, zzcbl zzcbl) {
        this.zza = zzdur;
        this.zzb = zzcbl;
    }

    public final void run() {
        String zzc = zzt.zzo().zzh().zzh().zzc();
        boolean isEmpty = TextUtils.isEmpty(zzc);
        zzcbl zzcbl = this.zzb;
        if (!isEmpty) {
            zzcbl.zzc(zzc);
        } else {
            zzcbl.zzd(new Exception());
        }
    }
}
