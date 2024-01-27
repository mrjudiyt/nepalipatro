package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzgsz {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzgta zzc;

    /* synthetic */ zzgsz(zzgsy zzgsy) {
    }

    public static int zzF(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzG(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static zzgsz zzH(InputStream inputStream, int i10) {
        return new zzgsx(inputStream, 4096, (zzgsw) null);
    }

    static zzgsz zzI(byte[] bArr, int i10, int i11, boolean z10) {
        zzgst zzgst = new zzgst(bArr, i10, i11, z10, (zzgss) null);
        try {
            zzgst.zze(i11);
            return zzgst;
        } catch (zzgul e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void zzA(int i10);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i10);

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i10);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzgsr zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i10);
}
