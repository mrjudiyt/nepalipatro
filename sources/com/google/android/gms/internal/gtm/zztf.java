package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zztf extends zztj {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* synthetic */ zztf(byte[] bArr, int i10, int i11, boolean z10, zzte zzte) {
        super((zzti) null);
        this.zze = bArr;
        this.zzf = 0;
    }

    public final int zza() {
        throw null;
    }

    public final int zzb(int i10) {
        int i11 = this.zzh;
        this.zzh = 0;
        int i12 = this.zzf + this.zzg;
        this.zzf = i12;
        if (i12 > 0) {
            this.zzg = i12;
            this.zzf = 0;
        } else {
            this.zzg = 0;
        }
        return i11;
    }

    public final int zzc() {
        throw null;
    }

    public final zztd zzd() {
        throw null;
    }

    public final String zze() {
        throw null;
    }

    public final String zzf() {
        throw null;
    }

    public final void zzg(int i10) {
        throw null;
    }

    public final void zzh(int i10) {
        throw null;
    }

    public final boolean zzi() {
        throw null;
    }

    public final boolean zzj() {
        throw null;
    }

    public final boolean zzk(int i10) {
        throw null;
    }
}
