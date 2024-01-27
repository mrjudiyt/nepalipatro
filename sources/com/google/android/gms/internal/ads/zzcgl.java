package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcgl implements zzfyz {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzaro zzb;
    public final /* synthetic */ zzcaz zzc;
    public final /* synthetic */ zza zzd;
    public final /* synthetic */ zzedz zze;
    public final /* synthetic */ String zzf;

    public /* synthetic */ zzcgl(Context context, zzaro zzaro, zzcaz zzcaz, zza zza2, zzedz zzedz, String str) {
        this.zza = context;
        this.zzb = zzaro;
        this.zzc = zzcaz;
        this.zzd = zza2;
        this.zze = zzedz;
        this.zzf = str;
    }

    public final e zza() {
        zzt.zzz();
        Context context = this.zza;
        zzchq zza2 = zzchq.zza();
        zzaro zzaro = this.zzb;
        zza zza3 = this.zzd;
        zzcgb zza4 = zzcgn.zza(context, zza2, "", false, false, zzaro, (zzbdk) null, this.zzc, (zzbda) null, (zzl) null, zza3, zzaxv.zza(), (zzfcr) null, (zzfcv) null, this.zze);
        zzcbk zza5 = zzcbk.zza(zza4);
        zza4.zzN().zzA(new zzcgj(zza5));
        zza4.loadUrl(this.zzf);
        return zza5;
    }
}
