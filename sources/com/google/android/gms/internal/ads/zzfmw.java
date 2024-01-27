package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfmw extends zzfms {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* synthetic */ zzfmw(String str, boolean z10, boolean z11, zzfmv zzfmv) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfms) {
            zzfms zzfms = (zzfms) obj;
            return this.zza.equals(zzfms.zzb()) && this.zzb == zzfms.zzd() && this.zzc == zzfms.zzc();
        }
    }

    public final int hashCode() {
        int i10 = 1237;
        int hashCode = (((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003;
        if (true == this.zzc) {
            i10 = 1231;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzb;
    }
}
