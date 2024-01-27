package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzvg implements zzxt {
    public long zza;
    public long zzb;
    public zzxs zzc;
    public zzvg zzd;

    public zzvg(long j10, int i10) {
        zze(j10, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
    }

    public final int zza(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzvg zzb() {
        this.zzc = null;
        zzvg zzvg = this.zzd;
        this.zzd = null;
        return zzvg;
    }

    public final zzxs zzc() {
        zzxs zzxs = this.zzc;
        Objects.requireNonNull(zzxs);
        return zzxs;
    }

    public final zzxt zzd() {
        zzvg zzvg = this.zzd;
        if (zzvg == null || zzvg.zzc == null) {
            return null;
        }
        return zzvg;
    }

    public final void zze(long j10, int i10) {
        zzdx.zzf(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }
}
