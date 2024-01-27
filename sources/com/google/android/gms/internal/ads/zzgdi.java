package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgdi extends zzghu {
    final /* synthetic */ zzgdj zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgdi(zzgdj zzgdj, Class cls) {
        super(cls);
        this.zza = zzgdj;
    }

    public static final zzgnc zzf(zzgnf zzgnf) {
        zzgnb zzc = zzgnc.zzc();
        zzc.zzb(zzgnf.zzg());
        byte[] zzb = zzgjf.zzb(zzgnf.zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        zzc.zzc(0);
        return (zzgnc) zzc.zzal();
    }

    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvj) {
        return zzf((zzgnf) zzgvj);
    }

    public final /* synthetic */ zzgvj zzb(zzgsr zzgsr) {
        return zzgnf.zzf(zzgsr, zzgtl.zza());
    }

    /* renamed from: zze */
    public final void zzd(zzgnf zzgnf) {
        zzgrv.zza(zzgnf.zza());
        zzgdj.zzm(zzgnf.zzg());
    }
}
