package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzih implements zzko {
    private final zzxz zzb;
    private final long zzc = zzfk.zzq(50000);
    private final long zzd = zzfk.zzq(50000);
    private final long zze = zzfk.zzq(2500);
    private final long zzf = zzfk.zzq(5000);
    private final long zzg = zzfk.zzq(0);
    private int zzh = 13107200;
    private boolean zzi;

    public zzih() {
        zzxz zzxz = new zzxz(true, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        zzj(2500, 0, "bufferForPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        zzj(5000, 0, "bufferForPlaybackAfterRebufferMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.zzb = zzxz;
    }

    private static void zzj(int i10, int i11, String str, String str2) {
        zzdx.zze(i10 >= i11, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z10) {
        this.zzh = 13107200;
        this.zzi = false;
        if (z10) {
            this.zzb.zze();
        }
    }

    public final long zza() {
        return this.zzg;
    }

    public final void zzb() {
        zzk(false);
    }

    public final void zzc() {
        zzk(true);
    }

    public final void zzd() {
        zzk(true);
    }

    public final void zze(zzcv zzcv, zztw zztw, zzlr[] zzlrArr, zzvx zzvx, zzxk[] zzxkArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = zzlrArr.length;
            int i12 = 13107200;
            if (i10 < 2) {
                if (zzxkArr[i10] != null) {
                    if (zzlrArr[i10].zzb() != 1) {
                        i12 = 131072000;
                    }
                    i11 += i12;
                }
                i10++;
            } else {
                int max = Math.max(13107200, i11);
                this.zzh = max;
                this.zzb.zzf(max);
                return;
            }
        }
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg(long j10, long j11, float f10) {
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        int zza = this.zzb.zza();
        int i11 = this.zzh;
        long j12 = this.zzc;
        if (i10 > 0) {
            j12 = Math.min(zzfk.zzo(j12, f10), this.zzd);
        }
        boolean z10 = false;
        if (j11 < Math.max(j12, 500000)) {
            if (zza < i11) {
                z10 = true;
            }
            this.zzi = z10;
            if (!z10 && j11 < 500000) {
                zzer.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.zzd || zza >= i11) {
            this.zzi = false;
        }
        return this.zzi;
    }

    public final boolean zzh(zzcv zzcv, zztw zztw, long j10, float f10, boolean z10, long j11) {
        long j12;
        long zzp = zzfk.zzp(j10, f10);
        if (z10) {
            j12 = this.zzf;
        } else {
            j12 = this.zze;
        }
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || zzp >= j12 || this.zzb.zza() >= this.zzh;
    }

    public final zzxz zzi() {
        return this.zzb;
    }
}
