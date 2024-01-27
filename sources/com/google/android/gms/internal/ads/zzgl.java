package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgl {
    private Uri zza;
    private Map zzb = Collections.emptyMap();
    private long zzc;
    private int zzd;

    public final zzgl zza(int i10) {
        this.zzd = 6;
        return this;
    }

    public final zzgl zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgl zzc(long j10) {
        this.zzc = j10;
        return this;
    }

    public final zzgl zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgn zze() {
        if (this.zza != null) {
            return new zzgn(this.zza, 0, 1, (byte[]) null, this.zzb, this.zzc, -1, (String) null, this.zzd, (Object) null, (zzgm) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
