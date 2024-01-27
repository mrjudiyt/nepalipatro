package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdmg implements zzchm {
    public final /* synthetic */ zzcbk zza;

    public /* synthetic */ zzdmg(zzcbk zzcbk) {
        this.zza = zzcbk;
    }

    public final void zza(boolean z10, int i10, String str, String str2) {
        zzcbk zzcbk = this.zza;
        if (z10) {
            zzcbk.zzb();
            return;
        }
        zzcbk.zzd(new zzeir(1, "Image Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
