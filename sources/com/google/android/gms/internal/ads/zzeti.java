package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeti implements zzetv {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzeti(String str, String str2, String str3, String str4, Long l10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l10;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfdz.zzc(bundle, "gmp_app_id", this.zza);
        zzfdz.zzc(bundle, "fbs_aiid", this.zzb);
        zzfdz.zzc(bundle, "fbs_aeid", this.zzc);
        zzfdz.zzc(bundle, "apm_id_origin", this.zzd);
        Long l10 = this.zze;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
