package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgd extends zzgc {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgd(byte[] bArr) {
        super(false);
        boolean z10 = false;
        zzdx.zzd(bArr.length > 0 ? true : z10);
        this.zza = bArr;
    }

    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(this.zza, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    public final long zzb(zzgn zzgn) {
        this.zzb = zzgn.zza;
        zzi(zzgn);
        long j10 = zzgn.zzf;
        int length = this.zza.length;
        if (j10 <= ((long) length)) {
            int i10 = (int) j10;
            this.zzc = i10;
            int i11 = length - i10;
            this.zzd = i11;
            long j11 = zzgn.zzg;
            if (j11 != -1) {
                this.zzd = (int) Math.min((long) i11, j11);
            }
            this.zze = true;
            zzj(zzgn);
            long j12 = zzgn.zzg;
            return j12 != -1 ? j12 : (long) this.zzd;
        }
        throw new zzgj(AdError.REMOTE_ADS_SERVICE_ERROR);
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zzb = null;
    }
}
