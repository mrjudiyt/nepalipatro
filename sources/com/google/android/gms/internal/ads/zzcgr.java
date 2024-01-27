package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcgr implements zzaxu {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzcgr(boolean z10, int i10) {
        this.zza = z10;
        this.zzb = i10;
    }

    public final void zza(zzazk zzazk) {
        int i10 = zzcgu.zza;
        zzbbp zza2 = zzbbq.zza();
        boolean zzc = zza2.zzc();
        boolean z10 = this.zza;
        if (zzc != z10) {
            zza2.zza(z10);
        }
        zza2.zzb(this.zzb);
        zzazk.zzj((zzbbq) zza2.zzal());
    }
}
