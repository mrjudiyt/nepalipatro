package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzlw {
    private final zziv zza;

    @Deprecated
    public zzlw(Context context, zzcfl zzcfl) {
        this.zza = new zziv(context, zzcfl);
    }

    @Deprecated
    public final zzlw zza(zzko zzko) {
        zziv zziv = this.zza;
        zzdx.zzf(!zziv.zzq);
        Objects.requireNonNull(zzko);
        zziv.zzf = new zzin(zzko);
        return this;
    }

    @Deprecated
    public final zzlw zzb(zzxq zzxq) {
        zziv zziv = this.zza;
        zzdx.zzf(!zziv.zzq);
        Objects.requireNonNull(zzxq);
        zziv.zze = new zziu(zzxq);
        return this;
    }

    @Deprecated
    public final zzlx zzc() {
        zziv zziv = this.zza;
        zzdx.zzf(!zziv.zzq);
        zziv.zzq = true;
        return new zzlx(zziv);
    }
}
