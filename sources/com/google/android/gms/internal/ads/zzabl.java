package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzabl implements zzacs {
    private final byte[] zza = new byte[4096];

    public final /* synthetic */ int zzf(zzt zzt, int i10, boolean z10) {
        return zzacq.zza(this, zzt, i10, z10);
    }

    public final int zzg(zzt zzt, int i10, boolean z10, int i11) {
        int zza2 = zzt.zza(this.zza, 0, Math.min(4096, i10));
        if (zza2 != -1) {
            return zza2;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzl(zzam zzam) {
    }

    public final /* synthetic */ void zzr(zzfb zzfb, int i10) {
        zzacq.zzb(this, zzfb, i10);
    }

    public final void zzs(zzfb zzfb, int i10, int i11) {
        zzfb.zzH(i10);
    }

    public final void zzt(long j10, int i10, int i11, int i12, zzacr zzacr) {
    }
}
