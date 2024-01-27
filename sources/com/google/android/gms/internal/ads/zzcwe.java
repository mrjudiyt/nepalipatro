package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzau;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcwe implements zzfsk {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcaz zzb;
    public final /* synthetic */ zzfdn zzc;

    public /* synthetic */ zzcwe(Context context, zzcaz zzcaz, zzfdn zzfdn) {
        this.zza = context;
        this.zzb = zzcaz;
        this.zzc = zzfdn;
    }

    public final Object apply(Object obj) {
        zzfcr zzfcr = (zzfcr) obj;
        zzau zzau = new zzau(this.zza);
        zzau.zzp(zzfcr.zzD);
        zzau.zzq(zzfcr.zzE.toString());
        zzau.zzo(this.zzb.zza);
        zzau.zzn(this.zzc.zzf);
        return zzau;
    }
}
