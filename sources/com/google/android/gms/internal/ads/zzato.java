package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzato extends zzaud {
    private final zzars zzi;
    private final long zzj;
    private final long zzk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzato(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11, zzars zzars, long j10, long j11) {
        super(zzasp, "KHu8Xbxzr2mu9S25CNgKE5zXBf18Zj2waiAPYoFRjyhOXCyg+mYLv2x/JjCH7GjX", "NOrE2caDXO4nkFR2Fjy7NgGPKtPlIg1WAorknI/US68=", zzaom, i10, 11);
        this.zzi = zzars;
        this.zzj = j10;
        this.zzk = j11;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        zzars zzars = this.zzi;
        if (zzars != null) {
            zzarq zzarq = new zzarq((String) this.zzf.invoke((Object) null, new Object[]{zzars.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)}));
            synchronized (this.zze) {
                this.zze.zzz(zzarq.zza.longValue());
                if (zzarq.zzb.longValue() >= 0) {
                    this.zze.zzQ(zzarq.zzb.longValue());
                }
                if (zzarq.zzc.longValue() >= 0) {
                    this.zze.zzf(zzarq.zzc.longValue());
                }
            }
        }
    }
}
