package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzerf implements zzetw {
    private final zzgad zza;
    private final zzdvm zzb;

    zzerf(zzgad zzgad, zzdvm zzdvm) {
        this.zza = zzgad;
        this.zzb = zzdvm;
    }

    public final int zza() {
        return 23;
    }

    public final e zzb() {
        return this.zza.zzb(new zzere(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzerg zzc() {
        zzdvm zzdvm = this.zzb;
        String zzc = zzdvm.zzc();
        boolean zzq = zzdvm.zzq();
        boolean zzl = zzt.zzs().zzl();
        zzdvm zzdvm2 = this.zzb;
        return new zzerg(zzc, zzq, zzl, zzdvm2.zzo(), zzdvm2.zzr());
    }
}
