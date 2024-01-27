package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfqc extends zzfqo {
    private String zza;
    private String zzb;

    zzfqc() {
    }

    public final zzfqo zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfqo zzb(String str) {
        this.zza = str;
        return this;
    }

    public final zzfqp zzc() {
        return new zzfqe(this.zza, this.zzb, (zzfqd) null);
    }
}
