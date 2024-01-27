package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgzy extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgzy zzb;
    private zzgui zzA = zzgtz.zzaN();
    private zzgyj zzB;
    private String zzC = "";
    private zzgyb zzD;
    private zzgui zzE = zzgtz.zzaN();
    private zzgzc zzF;
    private int zzG;
    private zzgui zzH = zzgtz.zzaN();
    private zzgui zzI = zzgtz.zzaN();
    private byte zzJ = 2;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzgyf zzj;
    private zzgui zzk = zzgtz.zzaN();
    private zzgui zzl = zzgtz.zzaN();
    private String zzm = "";
    private zzgzl zzn;
    private boolean zzo;
    private zzgui zzp = zzgtz.zzaN();
    private String zzq = "";
    private boolean zzr;
    private boolean zzs;
    private zzgsr zzt = zzgsr.zzb;
    private zzgzt zzu;
    private boolean zzv;
    private String zzw = "";
    private zzgui zzx = zzgtz.zzaN();
    private zzgui zzy = zzgtz.zzaN();
    private zzgzx zzz;

    static {
        zzgzy zzgzy = new zzgzy();
        zzb = zzgzy;
        zzgtz.zzaU(zzgzy.class, zzgzy);
    }

    private zzgzy() {
    }

    public static zzgyd zza() {
        return (zzgyd) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzgzy zzgzy, String str) {
        str.getClass();
        zzgzy.zzd |= 4;
        zzgzy.zzg = str;
    }

    static /* synthetic */ void zzh(zzgzy zzgzy, String str) {
        str.getClass();
        zzgzy.zzd |= 8;
        zzgzy.zzh = str;
    }

    static /* synthetic */ void zzi(zzgzy zzgzy, zzgyf zzgyf) {
        zzgyf.getClass();
        zzgzy.zzj = zzgyf;
        zzgzy.zzd |= 32;
    }

    static /* synthetic */ void zzj(zzgzy zzgzy, zzgzr zzgzr) {
        zzgzr.getClass();
        zzgui zzgui = zzgzy.zzk;
        if (!zzgui.zzc()) {
            zzgzy.zzk = zzgtz.zzaO(zzgui);
        }
        zzgzy.zzk.add(zzgzr);
    }

    static /* synthetic */ void zzk(zzgzy zzgzy, String str) {
        zzgzy.zzd |= 64;
        zzgzy.zzm = str;
    }

    static /* synthetic */ void zzl(zzgzy zzgzy) {
        zzgzy.zzd &= -65;
        zzgzy.zzm = zzb.zzm;
    }

    static /* synthetic */ void zzm(zzgzy zzgzy, zzgzl zzgzl) {
        zzgzl.getClass();
        zzgzy.zzn = zzgzl;
        zzgzy.zzd |= 128;
    }

    static /* synthetic */ void zzn(zzgzy zzgzy, zzgzt zzgzt) {
        zzgzt.getClass();
        zzgzy.zzu = zzgzt;
        zzgzy.zzd |= 8192;
    }

    static /* synthetic */ void zzo(zzgzy zzgzy, Iterable iterable) {
        zzgui zzgui = zzgzy.zzx;
        if (!zzgui.zzc()) {
            zzgzy.zzx = zzgtz.zzaO(zzgui);
        }
        zzgsa.zzav(iterable, zzgzy.zzx);
    }

    static /* synthetic */ void zzp(zzgzy zzgzy, Iterable iterable) {
        zzgui zzgui = zzgzy.zzy;
        if (!zzgui.zzc()) {
            zzgzy.zzy = zzgtz.zzaO(zzgui);
        }
        zzgsa.zzav(iterable, zzgzy.zzy);
    }

    static /* synthetic */ void zzq(zzgzy zzgzy, int i10) {
        zzgzy.zze = i10 - 1;
        zzgzy.zzd |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzJ);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", zzgzr.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", zzgzm.zza, "zzf", zzgyc.zza, "zzj", "zzm", "zzn", "zzt", "zzl", zzhac.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzhai.class, "zzB", "zzC", "zzD", "zzE", zzgyn.class, "zzF", "zzG", zzgzv.zza, "zzH", zzgzf.class, "zzI", zzgzi.class});
        } else if (i11 == 3) {
            return new zzgzy();
        } else {
            if (i11 == 4) {
                return new zzgyd((zzgxt) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzJ = b10;
            return null;
        }
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzk;
    }
}
