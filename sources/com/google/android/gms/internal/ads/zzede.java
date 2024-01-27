package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzede extends zzeea {
    private Activity zza;
    private zzl zzb;
    private String zzc;
    private String zzd;

    zzede() {
    }

    public final zzeea zza(Activity activity) {
        Objects.requireNonNull(activity, "Null activity");
        this.zza = activity;
        return this;
    }

    public final zzeea zzb(zzl zzl) {
        this.zzb = zzl;
        return this;
    }

    public final zzeea zzc(String str) {
        this.zzc = str;
        return this;
    }

    public final zzeea zzd(String str) {
        this.zzd = str;
        return this;
    }

    public final zzeeb zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzedg(activity, this.zzb, this.zzc, this.zzd, (zzedf) null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
