package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbae extends zzgtz implements zzgvk {
    private static final zzguf zzb = new zzbac();
    /* access modifiers changed from: private */
    public static final zzbae zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgue zzj = zzgtz.zzaJ();
    private zzazz zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzbae zzbae = new zzbae();
        zzd = zzbae;
        zzgtz.zzaU(zzbae.class, zzbae);
    }

    private zzbae() {
    }

    static /* synthetic */ void zzA(zzbae zzbae, int i10) {
        zzbae.zzm = i10 - 1;
        zzbae.zze |= 64;
    }

    static /* synthetic */ void zzB(zzbae zzbae, int i10) {
        zzbae.zzn = i10 - 1;
        zzbae.zze |= 128;
    }

    static /* synthetic */ void zzC(zzbae zzbae, int i10) {
        zzbae.zzp = i10 - 1;
        zzbae.zze |= 512;
    }

    public static zzbad zzg() {
        return (zzbad) zzd.zzaA();
    }

    public static zzbae zzi(byte[] bArr) {
        return (zzbae) zzgtz.zzaF(zzd, bArr);
    }

    static /* synthetic */ void zzl(zzbae zzbae, long j10) {
        zzbae.zze |= 1;
        zzbae.zzf = j10;
    }

    static /* synthetic */ void zzm(zzbae zzbae, long j10) {
        zzbae.zze |= 4;
        zzbae.zzh = j10;
    }

    static /* synthetic */ void zzn(zzbae zzbae, long j10) {
        zzbae.zze |= 8;
        zzbae.zzi = j10;
    }

    static /* synthetic */ void zzo(zzbae zzbae, Iterable iterable) {
        zzgue zzgue = zzbae.zzj;
        if (!zzgue.zzc()) {
            zzbae.zzj = zzgtz.zzaK(zzgue);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbae.zzj.zzh(((zzayt) it.next()).zza());
        }
    }

    static /* synthetic */ void zzp(zzbae zzbae, zzazz zzazz) {
        zzazz.getClass();
        zzbae.zzk = zzazz;
        zzbae.zze |= 16;
    }

    static /* synthetic */ void zzq(zzbae zzbae, int i10) {
        zzbae.zze |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        zzbae.zzo = i10;
    }

    static /* synthetic */ void zzr(zzbae zzbae, zzbai zzbai) {
        zzbae.zzq = zzbai.zza();
        zzbae.zze |= 1024;
    }

    static /* synthetic */ void zzs(zzbae zzbae, long j10) {
        zzbae.zze |= 2048;
        zzbae.zzr = j10;
    }

    static /* synthetic */ void zzy(zzbae zzbae, int i10) {
        zzbae.zzg = i10 - 1;
        zzbae.zze |= 2;
    }

    static /* synthetic */ void zzz(zzbae zzbae, int i10) {
        zzbae.zzl = i10 - 1;
        zzbae.zze |= 32;
    }

    public final int zza() {
        return this.zzo;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgud zzgud = zzazi.zza;
            return zzgtz.zzaR(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zzgud, "zzh", "zzi", "zzj", zzays.zza, "zzk", "zzl", zzgud, "zzm", zzgud, "zzn", zzgud, "zzo", "zzp", zzgud, "zzq", zzbah.zza, "zzr"});
        } else if (i11 == 3) {
            return new zzbae();
        } else {
            if (i11 == 4) {
                return new zzbad((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzd;
        }
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzazz zzf() {
        zzazz zzazz = this.zzk;
        return zzazz == null ? zzazz.zzd() : zzazz;
    }

    public final zzbai zzj() {
        zzbai zzb2 = zzbai.zzb(this.zzq);
        return zzb2 == null ? zzbai.UNSPECIFIED : zzb2;
    }

    public final List zzk() {
        return new zzgug(this.zzj, zzb);
    }

    public final int zzt() {
        int zza = zzazj.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzazj.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzazj.zza(this.zzp);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzazj.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzx() {
        int zza = zzazj.zza(this.zzl);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
