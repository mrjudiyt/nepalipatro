package com.google.android.gms.internal.gtm;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzvi {
    static final Charset zza = Charset.forName("UTF-8");
    static final Charset zzb = Charset.forName("ISO-8859-1");
    public static final byte[] zzc;
    public static final ByteBuffer zzd;
    public static final zztj zze;

    static {
        byte[] bArr = new byte[0];
        zzc = bArr;
        zzd = ByteBuffer.wrap(bArr);
        int i10 = zztj.zzd;
        zztf zztf = new zztf(bArr, 0, 0, false, (zzte) null);
        try {
            zztf.zzb(0);
            zze = zztf;
        } catch (zzvk e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int zzd2 = zzd(length, bArr, 0, length);
        if (zzd2 == 0) {
            return 1;
        }
        return zzd2;
    }

    public static int zzc(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    static int zzd(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static <T> T zze(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    static <T> T zzf(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    static Object zzg(Object obj, Object obj2) {
        return ((zzwk) obj).zzap().zzx((zzwk) obj2).zzD();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zza);
    }

    static boolean zzi(zzwk zzwk) {
        if (!(zzwk instanceof zzsi)) {
            return false;
        }
        zzsi zzsi = (zzsi) zzwk;
        throw null;
    }

    public static boolean zzj(byte[] bArr) {
        return zzyd.zze(bArr);
    }
}
