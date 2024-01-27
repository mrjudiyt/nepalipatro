package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public enum zzbai implements zzgub {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    
    private static final zzguc zzg = null;
    private final int zzi;

    static {
        zzg = new zzbag();
    }

    private zzbai(int i10) {
        this.zzi = i10;
    }

    public static zzbai zzb(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED;
        }
        if (i10 == 1) {
            return CONNECTING;
        }
        if (i10 == 2) {
            return CONNECTED;
        }
        if (i10 == 3) {
            return DISCONNECTING;
        }
        if (i10 == 4) {
            return DISCONNECTED;
        }
        if (i10 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}
