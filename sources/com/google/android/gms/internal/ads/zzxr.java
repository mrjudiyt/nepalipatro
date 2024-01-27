package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzxr {
    public final int zza;
    public final zzlu[] zzb;
    public final zzxk[] zzc;
    public final zzdg zzd;
    public final Object zze;

    public zzxr(zzlu[] zzluArr, zzxk[] zzxkArr, zzdg zzdg, Object obj) {
        this.zzb = zzluArr;
        this.zzc = (zzxk[]) zzxkArr.clone();
        this.zzd = zzdg;
        this.zze = obj;
        this.zza = zzluArr.length;
    }

    public final boolean zza(zzxr zzxr, int i10) {
        if (zzxr != null && zzfk.zzE(this.zzb[i10], zzxr.zzb[i10]) && zzfk.zzE(this.zzc[i10], zzxr.zzc[i10])) {
            return true;
        }
        return false;
    }

    public final boolean zzb(int i10) {
        return this.zzb[i10] != null;
    }
}
