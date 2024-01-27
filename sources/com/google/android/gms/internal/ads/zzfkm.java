package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfkm {
    private final String zza;
    private final String zzb;

    private zzfkm(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfkm zza(String str, String str2) {
        zzfls.zza(str, "Name is null or empty");
        zzfls.zza(str2, "Version is null or empty");
        return new zzfkm(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
