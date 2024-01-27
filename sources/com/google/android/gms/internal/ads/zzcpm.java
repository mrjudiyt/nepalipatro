package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcpm {
    private final String zza;
    private final zzboj zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public zzcpr zzd;
    private final zzbjj zze = new zzcpj(this);
    private final zzbjj zzf = new zzcpl(this);

    public zzcpm(String str, zzboj zzboj, Executor executor) {
        this.zza = str;
        this.zzb = zzboj;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(zzcpm zzcpm, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcpm.zza);
    }

    public final void zzc(zzcpr zzcpr) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcpr;
    }

    public final void zzd(zzcgb zzcgb) {
        zzcgb.zzad("/updateActiveView", this.zze);
        zzcgb.zzad("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcgb zzcgb) {
        zzcgb.zzau("/updateActiveView", this.zze);
        zzcgb.zzau("/untrackActiveViewUnit", this.zzf);
    }
}
