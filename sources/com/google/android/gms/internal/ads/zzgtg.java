package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzgtg extends zzgsg {
    private static final Logger zza = Logger.getLogger(zzgtg.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzb = zzgxd.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgth zze;

    private zzgtg() {
    }

    /* synthetic */ zzgtg(zzgtf zzgtf) {
    }

    public static int zzA(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int zzB(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static zzgtg zzC(byte[] bArr, int i10, int i11) {
        return new zzgtc(bArr, 0, i11);
    }

    @Deprecated
    static int zzw(int i10, zzgvj zzgvj, zzgwc zzgwc) {
        int zzat = ((zzgsa) zzgvj).zzat(zzgwc);
        int zzA = zzA(i10 << 3);
        return zzA + zzA + zzat;
    }

    public static int zzx(int i10) {
        if (i10 >= 0) {
            return zzA(i10);
        }
        return 10;
    }

    static int zzy(zzgvj zzgvj, zzgwc zzgwc) {
        int zzat = ((zzgsa) zzgvj).zzat(zzgwc);
        return zzA(zzat) + zzat;
    }

    public static int zzz(String str) {
        int i10;
        try {
            i10 = zzgxi.zze(str);
        } catch (zzgxh unused) {
            i10 = str.getBytes(zzguj.zzb).length;
        }
        return zzA(i10) + i10;
    }

    public final void zzD() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzE(String str, zzgxh zzgxh) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzgxh);
        byte[] bytes = str.getBytes(zzguj.zzb);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgtd(e10);
        }
    }

    public abstract void zzI();

    public abstract void zzJ(byte b10);

    public abstract void zzK(int i10, boolean z10);

    public abstract void zzL(int i10, zzgsr zzgsr);

    public abstract void zza(byte[] bArr, int i10, int i11);

    public abstract int zzb();

    public abstract void zzh(int i10, int i11);

    public abstract void zzi(int i10);

    public abstract void zzj(int i10, long j10);

    public abstract void zzk(long j10);

    public abstract void zzl(int i10, int i11);

    public abstract void zzm(int i10);

    /* access modifiers changed from: package-private */
    public abstract void zzn(int i10, zzgvj zzgvj, zzgwc zzgwc);

    public abstract void zzo(int i10, String str);

    public abstract void zzq(int i10, int i11);

    public abstract void zzr(int i10, int i11);

    public abstract void zzs(int i10);

    public abstract void zzt(int i10, long j10);

    public abstract void zzu(long j10);
}
