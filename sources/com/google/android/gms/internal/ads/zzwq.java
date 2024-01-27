package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzwq extends zzxe implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg = zzxi.zzg(this.zzd.zzd);
    private final zzww zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzwq(int i10, zzcx zzcx, int i11, zzww zzww, int i12, boolean z10, zzfsx zzfsx) {
        super(i10, zzcx, i11);
        int i13;
        int i14;
        int i15;
        boolean z11;
        this.zzh = zzww;
        int i16 = 0;
        this.zzi = zzxi.zzn(i12, false);
        int i17 = 0;
        while (true) {
            int size = zzww.zzq.size();
            i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i17 >= size) {
                i17 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i14 = 0;
                break;
            }
            i14 = zzxi.zza(this.zzd, (String) zzww.zzq.get(i17), false);
            if (i14 > 0) {
                break;
            }
            i17++;
        }
        this.zzk = i17;
        this.zzj = i14;
        int i18 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        zzam zzam = this.zzd;
        int i19 = zzam.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzam.zze & 1);
        this.zzq = zzam.zzz;
        this.zzr = zzam.zzA;
        this.zzs = zzam.zzi;
        this.zzf = zzfsx.zza(zzam);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = zzfk.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{zzfk.zzz(configuration.locale)};
        for (int i20 = 0; i20 < split.length; i20++) {
            split[i20] = zzfk.zzB(split[i20]);
        }
        int i21 = 0;
        while (true) {
            if (i21 >= split.length) {
                i21 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i15 = 0;
                break;
            }
            i15 = zzxi.zza(this.zzd, split[i21], false);
            if (i15 > 0) {
                break;
            }
            i21++;
        }
        this.zzn = i21;
        this.zzo = i15;
        int i22 = 0;
        while (true) {
            if (i22 < zzww.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzww.zzu.get(i22))) {
                    i13 = i22;
                    break;
                }
                i22++;
            } else {
                break;
            }
        }
        this.zzt = i13;
        this.zzu = (i12 & 384) == 128;
        this.zzv = (i12 & 64) == 64;
        zzww zzww2 = this.zzh;
        if (zzxi.zzn(i12, zzww2.zzR) && ((z11 = this.zzf) || zzww2.zzL)) {
            i16 = (!zzxi.zzn(i12, false) || !z11 || this.zzd.zzi == -1 || (!zzww2.zzT && z10)) ? 1 : 2;
        }
        this.zze = i16;
    }

    /* renamed from: zza */
    public final int compareTo(zzwq zzwq) {
        zzfxb zzfxb;
        if (!this.zzf || !this.zzi) {
            zzfxb = zzxi.zzc.zza();
        } else {
            zzfxb = zzxi.zzc;
        }
        zzfvh zzc = zzfvh.zzj().zzd(this.zzi, zzwq.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzwq.zzk), zzfxb.zzc().zza()).zzb(this.zzj, zzwq.zzj).zzb(this.zzl, zzwq.zzl).zzd(this.zzp, zzwq.zzp).zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzwq.zzn), zzfxb.zzc().zza()).zzb(this.zzo, zzwq.zzo).zzd(this.zzf, zzwq.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzwq.zzt), zzfxb.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzwq.zzs);
        boolean z10 = this.zzh.zzA;
        zzfvh zzc2 = zzc.zzc(valueOf, valueOf2, zzxi.zzd).zzd(this.zzu, zzwq.zzu).zzd(this.zzv, zzwq.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzwq.zzq), zzfxb).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzwq.zzr), zzfxb);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzwq.zzs);
        if (!zzfk.zzE(this.zzg, zzwq.zzg)) {
            zzfxb = zzxi.zzd;
        }
        return zzc2.zzc(valueOf3, valueOf4, zzfxb).zza();
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzxe zzxe) {
        String str;
        zzwq zzwq = (zzwq) zzxe;
        boolean z10 = this.zzh.zzO;
        zzam zzam = this.zzd;
        int i10 = zzam.zzz;
        if (i10 == -1) {
            return false;
        }
        zzam zzam2 = zzwq.zzd;
        if (i10 != zzam2.zzz || (str = zzam.zzm) == null || !TextUtils.equals(str, zzam2.zzm)) {
            return false;
        }
        boolean z11 = this.zzh.zzN;
        int i11 = this.zzd.zzA;
        return i11 != -1 && i11 == zzwq.zzd.zzA && this.zzu == zzwq.zzu && this.zzv == zzwq.zzv;
    }
}
