package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgcb implements Comparable {
    private final byte[] zza;

    /* synthetic */ zzgcb(byte[] bArr, zzgca zzgca) {
        this.zza = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzgcb zzgcb = (zzgcb) obj;
        int length = this.zza.length;
        int length2 = zzgcb.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i10 >= bArr.length) {
                return 0;
            }
            byte b10 = bArr[i10];
            byte b11 = zzgcb.zza[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgcb)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzgcb) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgro.zza(this.zza);
    }
}
