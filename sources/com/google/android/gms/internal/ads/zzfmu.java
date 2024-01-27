package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfmu extends zzfmr {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private byte zzd;

    zzfmu() {
    }

    public final zzfmr zza(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.zza = str;
        return this;
    }

    public final zzfmr zzb(boolean z10) {
        this.zzc = true;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zzfmr zzc(boolean z10) {
        this.zzb = z10;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    public final zzfms zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzfmw(str, this.zzb, this.zzc, (zzfmv) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" clientVersion");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
