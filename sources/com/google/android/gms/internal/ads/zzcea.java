package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcea extends zzano {
    static final zzcea zzb = new zzcea();

    zzcea() {
    }

    public final zzans zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzanu();
        }
        if ("mvhd".equals(str)) {
            return new zzanv();
        }
        return new zzanw(str);
    }
}
