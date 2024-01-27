package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgro {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b10 : bArr) {
            byte b11 = b10 & 255;
            sb.append("0123456789abcdef".charAt(b11 >> 4));
            sb.append("0123456789abcdef".charAt(b11 & 15));
        }
        return sb.toString();
    }
}
