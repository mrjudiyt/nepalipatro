package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdpj implements zzchm {
    public final /* synthetic */ zzcbl zza;

    public /* synthetic */ zzdpj(zzcbl zzcbl) {
        this.zza = zzcbl;
    }

    public final void zza(boolean z10, int i10, String str, String str2) {
        zzcbl zzcbl = this.zza;
        if (z10) {
            zzcbl.zzc((Object) null);
            return;
        }
        zzcbl.zzd(new Exception("Ad Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
