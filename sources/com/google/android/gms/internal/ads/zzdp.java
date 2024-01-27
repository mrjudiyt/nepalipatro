package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdp extends Exception {
    public final zzdo zza;

    public zzdp(String str, zzdo zzdo) {
        super("Unhandled input format: ".concat(String.valueOf(zzdo)));
        this.zza = zzdo;
    }
}
