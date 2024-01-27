package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzet {
    private long[] zza;

    public zzet() {
        this(16);
    }

    public zzet(int i10) {
        int i11 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i11 = highestOneBit + highestOneBit;
        }
        this.zza = new long[i11];
    }
}
