package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzelo extends zzbm {
    private final zzemv zza;

    public zzelo(Context context, zzchw zzchw, zzfdl zzfdl, zzdju zzdju, zzbh zzbh) {
        zzemx zzemx = new zzemx(zzdju, zzchw.zzy());
        zzemx.zze(zzbh);
        this.zza = new zzemv(new zzenh(zzchw, context, zzemx, zzfdl), zzfdl.zzI());
    }

    public final synchronized String zze() {
        return this.zza.zza();
    }

    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    public final void zzg(zzl zzl) {
        this.zza.zzd(zzl, 1);
    }

    public final synchronized void zzh(zzl zzl, int i10) {
        this.zza.zzd(zzl, i10);
    }

    public final synchronized boolean zzi() {
        return this.zza.zze();
    }
}
