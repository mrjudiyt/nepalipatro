package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzar {
    private String zza;
    private Uri zzb;
    private final zzat zzc = new zzat();
    private final zzba zzd = new zzba((zzaz) null);
    private final List zze = Collections.emptyList();
    private final zzfvs zzf = zzfvs.zzl();
    private final zzbd zzg = new zzbd();
    private final zzbl zzh = zzbl.zza;

    public final zzar zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzar zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzbp zzc() {
        Uri uri = this.zzb;
        zzbi zzbi = uri != null ? new zzbi(uri, (String) null, (zzbb) null, (zzaq) null, this.zze, (String) null, this.zzf, (Object) null, -9223372036854775807L, (zzbh) null) : null;
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzbp(str, new zzax(this.zzc, (zzaw) null), zzbi, new zzbf(this.zzg), zzbv.zza, this.zzh, (zzbo) null);
    }
}
