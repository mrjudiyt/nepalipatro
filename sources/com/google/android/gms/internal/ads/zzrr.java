package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.c;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzrr extends MediaCodec.Callback {
    private final Object zza = new Object();
    private final HandlerThread zzb;
    private Handler zzc;
    private final c zzd;
    private final c zze;
    private final ArrayDeque zzf;
    private final ArrayDeque zzg;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private long zzk;
    private boolean zzl;
    private IllegalStateException zzm;

    zzrr(HandlerThread handlerThread) {
        this.zzb = handlerThread;
        this.zzd = new c();
        this.zze = new c();
        this.zzf = new ArrayDeque();
        this.zzg = new ArrayDeque();
    }

    public static /* synthetic */ void zzd(zzrr zzrr) {
        synchronized (zzrr.zza) {
            if (!zzrr.zzl) {
                long j10 = zzrr.zzk - 1;
                zzrr.zzk = j10;
                int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
                if (i10 <= 0) {
                    if (i10 < 0) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (zzrr.zza) {
                            zzrr.zzm = illegalStateException;
                        }
                        return;
                    }
                    zzrr.zzi();
                }
            }
        }
    }

    private final void zzh(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzi() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        this.zzd.b();
        this.zze.b();
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzj() {
        IllegalStateException illegalStateException = this.zzm;
        if (illegalStateException != null) {
            this.zzm = null;
            throw illegalStateException;
        }
    }

    private final void zzk() {
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
    }

    private final boolean zzl() {
        return this.zzk > 0 || this.zzl;
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.zza) {
            this.zzd.a(i10);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzh(mediaFormat);
                this.zzi = null;
            }
            this.zze.a(i10);
            this.zzf.add(bufferInfo);
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzh(mediaFormat);
            this.zzi = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            r3.zzj()     // Catch:{ all -> 0x0023 }
            r3.zzk()     // Catch:{ all -> 0x0023 }
            boolean r1 = r3.zzl()     // Catch:{ all -> 0x0023 }
            r2 = -1
            if (r1 == 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x0012:
            androidx.collection.c r1 = r3.zzd     // Catch:{ all -> 0x0023 }
            boolean r1 = r1.d()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            androidx.collection.c r1 = r3.zzd     // Catch:{ all -> 0x0023 }
            int r2 = r1.e()     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrr.zza():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.zza
            monitor-enter(r0)
            r9.zzj()     // Catch:{ all -> 0x004e }
            r9.zzk()     // Catch:{ all -> 0x004e }
            boolean r1 = r9.zzl()     // Catch:{ all -> 0x004e }
            r2 = -1
            if (r1 == 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x0012:
            androidx.collection.c r1 = r9.zze     // Catch:{ all -> 0x004e }
            boolean r1 = r1.d()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x001c:
            androidx.collection.c r1 = r9.zze     // Catch:{ all -> 0x004e }
            int r1 = r1.e()     // Catch:{ all -> 0x004e }
            r2 = -2
            if (r1 < 0) goto L_0x003f
            android.media.MediaFormat r2 = r9.zzh     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.zzdx.zzb(r2)     // Catch:{ all -> 0x004e }
            java.util.ArrayDeque r2 = r9.zzf     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004e }
            int r4 = r2.offset     // Catch:{ all -> 0x004e }
            int r5 = r2.size     // Catch:{ all -> 0x004e }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004e }
            int r8 = r2.flags     // Catch:{ all -> 0x004e }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004e }
            goto L_0x004c
        L_0x003f:
            if (r1 != r2) goto L_0x004c
            java.util.ArrayDeque r10 = r9.zzg     // Catch:{ all -> 0x004e }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004e }
            r9.zzh = r10     // Catch:{ all -> 0x004e }
            r1 = -2
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrr.zzb(android.media.MediaCodec$BufferInfo):int");
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzk++;
            Handler handler = this.zzc;
            int i10 = zzfk.zza;
            handler.post(new zzrq(this));
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        zzdx.zzf(this.zzc == null);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl = true;
            this.zzb.quit();
            zzi();
        }
    }
}
