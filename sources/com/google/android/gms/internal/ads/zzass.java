package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzass {
    public static final /* synthetic */ int zza = 0;
    private static final char[] zzb = "0123456789abcdef".toCharArray();

    public static long zza(double d10, int i10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / ((double) displayMetrics.density));
    }

    public static String zzb(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10] & 255;
            char[] cArr2 = zzb;
            int i11 = i10 + i10;
            cArr[i11] = cArr2[b10 >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean zzc() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zzd(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean zze(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] zzf(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            for (int i10 = 0; i10 < length; i10 += 2) {
                bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
            }
            return bArr;
        }
        throw new IllegalArgumentException("String must be of even-length");
    }
}
