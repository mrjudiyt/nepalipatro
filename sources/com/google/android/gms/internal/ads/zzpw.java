package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzpw {
    /* access modifiers changed from: private */
    public zzon zza = zzon.zza;
    private boolean zzb;
    /* access modifiers changed from: private */
    public final zzpv zzc = zzpv.zza;
    /* access modifiers changed from: private */
    public zzpy zzd;
    /* access modifiers changed from: private */
    public zzpq zze;

    @Deprecated
    public final zzpw zzc(zzon zzon) {
        this.zza = zzon;
        return this;
    }

    public final zzpw zzd(zzdq[] zzdqArr) {
        this.zzd = new zzpy(zzdqArr);
        return this;
    }

    public final zzqi zze() {
        zzdx.zzf(!this.zzb);
        this.zzb = true;
        if (this.zzd == null) {
            this.zzd = new zzpy(new zzdq[0]);
        }
        if (this.zze == null) {
            this.zze = new zzpq((Context) null);
        }
        return new zzqi(this, (zzqh) null);
    }
}
