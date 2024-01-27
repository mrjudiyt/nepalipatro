package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdua implements zzdto {
    /* access modifiers changed from: private */
    public final long zza;
    private final zzems zzb;

    zzdua(long j10, Context context, zzdtt zzdtt, zzchw zzchw, String str) {
        this.zza = j10;
        zzfaw zzu = zzchw.zzu();
        zzu.zzc(context);
        zzu.zza(new zzq());
        zzu.zzb(str);
        zzems zza2 = zzu.zzd().zza();
        this.zzb = zza2;
        zza2.zzD(new zzdtz(this, zzdtt));
    }

    public final void zza() {
        this.zzb.zzx();
    }

    public final void zzb(zzl zzl) {
        this.zzb.zzaa(zzl);
    }

    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
