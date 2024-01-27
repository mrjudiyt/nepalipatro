package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzrl implements zzrw {
    private final MediaCodec zza;
    private final zzrr zzb;
    private final zzrp zzc;
    private boolean zzd;
    private int zze = 0;

    /* synthetic */ zzrl(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, zzrk zzrk) {
        this.zza = mediaCodec;
        this.zzb = new zzrr(handlerThread);
        this.zzc = new zzrp(mediaCodec, handlerThread2);
    }

    static /* synthetic */ void zzh(zzrl zzrl, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        zzrl.zzb.zzf(zzrl.zza);
        int i11 = zzfk.zza;
        Trace.beginSection("configureCodec");
        zzrl.zza.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        zzrl.zzc.zzg();
        Trace.beginSection("startCodec");
        zzrl.zza.start();
        Trace.endSection();
        zzrl.zze = 1;
    }

    /* access modifiers changed from: private */
    public static String zzs(int i10, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            sb.append("Audio");
        } else if (i10 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            sb.append(")");
        }
        return sb.toString();
    }

    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    public final ByteBuffer zzf(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    public final ByteBuffer zzg(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    public final void zzj(int i10, int i11, int i12, long j10, int i13) {
        this.zzc.zzd(i10, 0, i12, j10, i13);
    }

    public final void zzk(int i10, int i11, zzhq zzhq, long j10, int i12) {
        this.zzc.zze(i10, 0, zzhq, j10, 0);
    }

    public final void zzl() {
        try {
            if (this.zze == 1) {
                this.zzc.zzf();
                this.zzb.zzg();
            }
            this.zze = 2;
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
        } catch (Throwable th) {
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
            throw th;
        }
    }

    public final void zzm(int i10, long j10) {
        this.zza.releaseOutputBuffer(i10, j10);
    }

    public final void zzn(int i10, boolean z10) {
        this.zza.releaseOutputBuffer(i10, z10);
    }

    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    public final void zzq(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    public final boolean zzr() {
        return false;
    }
}
