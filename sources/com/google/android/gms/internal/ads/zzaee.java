package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaee extends zzacb {
    final /* synthetic */ zzacm zza;
    final /* synthetic */ zzaef zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaee(zzaef zzaef, zzacm zzacm, zzacm zzacm2) {
        super(zzacm);
        this.zzb = zzaef;
        this.zza = zzacm2;
    }

    public final zzack zzg(long j10) {
        zzack zzg = this.zza.zzg(j10);
        zzacn zzacn = zzg.zza;
        zzacn zzacn2 = new zzacn(zzacn.zzb, zzacn.zzc + this.zzb.zzb);
        zzacn zzacn3 = zzg.zzb;
        return new zzack(zzacn2, new zzacn(zzacn3.zzb, zzacn3.zzc + this.zzb.zzb));
    }
}
