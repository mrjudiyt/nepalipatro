package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzxc extends zzxe implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzxc(int i10, zzcx zzcx, int i11, zzww zzww, int i12, String str) {
        super(i10, zzcx, i11);
        zzfvs zzfvs;
        int i13;
        int i14 = 0;
        this.zzf = zzxi.zzn(i12, false);
        int i15 = this.zzd.zze;
        int i16 = zzww.zzy;
        this.zzg = 1 == (i15 & 1);
        this.zzh = (i15 & 2) != 0;
        if (zzww.zzw.isEmpty()) {
            zzfvs = zzfvs.zzm("");
        } else {
            zzfvs = zzww.zzw;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= zzfvs.size()) {
                i17 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i13 = 0;
                break;
            }
            i13 = zzxi.zza(this.zzd, (String) zzfvs.get(i17), false);
            if (i13 > 0) {
                break;
            }
            i17++;
        }
        this.zzi = i17;
        this.zzj = i13;
        int i18 = this.zzd.zzf;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i19 = this.zzd.zzf;
        this.zzm = false;
        int zza = zzxi.zza(this.zzd, str, zzxi.zzg(str) == null);
        this.zzl = zza;
        boolean z10 = i13 > 0 || (zzww.zzw.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0);
        if (zzxi.zzn(i12, zzww.zzR) && z10) {
            i14 = 1;
        }
        this.zze = i14;
    }

    /* renamed from: zza */
    public final int compareTo(zzxc zzxc) {
        zzfxb zzfxb;
        zzfvh zzd = zzfvh.zzj().zzd(this.zzf, zzxc.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxc.zzi), zzfxb.zzc().zza()).zzb(this.zzj, zzxc.zzj).zzb(this.zzk, zzxc.zzk).zzd(this.zzg, zzxc.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzxc.zzh);
        if (this.zzj == 0) {
            zzfxb = zzfxb.zzc();
        } else {
            zzfxb = zzfxb.zzc().zza();
        }
        zzfvh zzb = zzd.zzc(valueOf, valueOf2, zzfxb).zzb(this.zzl, zzxc.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzxe zzxe) {
        zzxc zzxc = (zzxc) zzxe;
        return false;
    }
}
