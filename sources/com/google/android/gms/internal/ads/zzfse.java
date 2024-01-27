package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzfse extends zzfsd {
    private final char zza;

    zzfse(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i10 = this.zza;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return "CharMatcher.is('" + copyValueOf + "')";
    }

    public final boolean zzb(char c10) {
        return c10 == this.zza;
    }
}
