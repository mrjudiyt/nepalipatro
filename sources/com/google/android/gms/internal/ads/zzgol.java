package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public enum zzgol implements zzgub {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    
    private static final zzguc zzh = null;
    private final int zzj;

    static {
        zzh = new zzgok();
    }

    private zzgol(int i10) {
        this.zzj = i10;
    }

    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzj;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
