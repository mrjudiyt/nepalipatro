package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfqi extends zzfrb {
    private int zza;
    private String zzb;
    private byte zzc;

    zzfqi() {
    }

    public final zzfrb zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfrb zzb(int i10) {
        this.zza = i10;
        this.zzc = 1;
        return this;
    }

    public final zzfrc zzc() {
        if (this.zzc == 1) {
            return new zzfqk(this.zza, this.zzb, (zzfqj) null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
