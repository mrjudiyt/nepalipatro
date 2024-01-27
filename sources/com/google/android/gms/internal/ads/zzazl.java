package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzazl extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzazl zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private int zzg;
    private int zzh = 1000;
    private zzbav zzi;
    /* access modifiers changed from: private */
    public zzguh zzj = zzgtz.zzaL();
    private zzazd zzk;
    private zzazg zzl;
    private zzazz zzm;
    private zzayh zzn;
    private zzbaj zzo;
    private zzbbq zzp;
    private zzayq zzq;

    static {
        zzazl zzazl = new zzazl();
        zzb = zzazl;
        zzgtz.zzaU(zzazl.class, zzazl);
    }

    private zzazl() {
    }

    public static zzazk zzd() {
        return (zzazk) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzazl zzazl, String str) {
        str.getClass();
        zzazl.zzd |= 2;
        zzazl.zzf = str;
    }

    static /* synthetic */ void zzh(zzazl zzazl, Iterable iterable) {
        zzguh zzguh = zzazl.zzj;
        if (!zzguh.zzc()) {
            zzazl.zzj = zzgtz.zzaM(zzguh);
        }
        zzgsa.zzav(iterable, zzazl.zzj);
    }

    static /* synthetic */ void zzj(zzazl zzazl, zzazd zzazd) {
        zzazd.getClass();
        zzazl.zzk = zzazd;
        zzazl.zzd |= 32;
    }

    static /* synthetic */ void zzk(zzazl zzazl, zzayh zzayh) {
        zzayh.getClass();
        zzazl.zzn = zzayh;
        zzazl.zzd |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    static /* synthetic */ void zzl(zzazl zzazl, zzbaj zzbaj) {
        zzbaj.getClass();
        zzazl.zzo = zzbaj;
        zzazl.zzd |= 512;
    }

    static /* synthetic */ void zzm(zzazl zzazl, zzbbq zzbbq) {
        zzbbq.getClass();
        zzazl.zzp = zzbbq;
        zzazl.zzd |= 1024;
    }

    static /* synthetic */ void zzn(zzazl zzazl, zzayq zzayq) {
        zzayq.getClass();
        zzazl.zzq = zzayq;
        zzazl.zzd |= 2048;
    }

    public final zzayh zza() {
        zzayh zzayh = this.zzn;
        return zzayh == null ? zzayh.zzc() : zzayh;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzazi.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        } else if (i11 == 3) {
            return new zzazl();
        } else {
            if (i11 == 4) {
                return new zzazk((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzazd zzc() {
        zzazd zzazd = this.zzk;
        return zzazd == null ? zzazd.zzc() : zzazd;
    }

    public final String zzf() {
        return this.zzf;
    }
}
