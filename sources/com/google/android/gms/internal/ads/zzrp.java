package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzrp {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf = new AtomicReference();
    private final zzea zzg;
    private boolean zzh;

    public zzrp(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzea zzea = new zzea(zzdy.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzea;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzrp r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L_0x0043
            r2 = 1
            if (r0 == r2) goto L_0x0022
            r2 = 2
            if (r0 == r2) goto L_0x001c
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.zzrm.zza(r9, r1, r0)
            goto L_0x005d
        L_0x001c:
            com.google.android.gms.internal.ads.zzea r9 = r9.zzg
            r9.zze()
            goto L_0x005d
        L_0x0022:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzro r10 = (com.google.android.gms.internal.ads.zzro) r10
            int r3 = r10.zza
            android.media.MediaCodec$CryptoInfo r5 = r10.zzd
            long r6 = r10.zze
            int r8 = r10.zzf
            java.lang.Object r0 = zzb     // Catch:{ RuntimeException -> 0x003c }
            monitor-enter(r0)     // Catch:{ RuntimeException -> 0x003c }
            android.media.MediaCodec r2 = r9.zzc     // Catch:{ all -> 0x0039 }
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x005c
        L_0x0039:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r2     // Catch:{ RuntimeException -> 0x003c }
        L_0x003c:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzrm.zza(r9, r1, r0)
            goto L_0x005c
        L_0x0043:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzro r10 = (com.google.android.gms.internal.ads.zzro) r10
            int r3 = r10.zza
            int r5 = r10.zzc
            long r6 = r10.zze
            int r8 = r10.zzf
            android.media.MediaCodec r2 = r9.zzc     // Catch:{ RuntimeException -> 0x0056 }
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ RuntimeException -> 0x0056 }
            goto L_0x005c
        L_0x0056:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzrm.zza(r9, r1, r0)
        L_0x005c:
            r1 = r10
        L_0x005d:
            if (r1 == 0) goto L_0x006a
            java.util.ArrayDeque r9 = zza
            monitor-enter(r9)
            r9.add(r1)     // Catch:{ all -> 0x0067 }
            monitor-exit(r9)     // Catch:{ all -> 0x0067 }
            return
        L_0x0067:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0067 }
            throw r10
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zza(com.google.android.gms.internal.ads.zzrp, android.os.Message):void");
    }

    private static zzro zzh() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                zzro zzro = new zzro();
                return zzro;
            }
            zzro zzro2 = (zzro) arrayDeque.removeFirst();
            return zzro2;
        }
    }

    private static byte[] zzi(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages((Object) null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void zzd(int i10, int i11, int i12, long j10, int i13) {
        zzc();
        zzro zzh2 = zzh();
        zzh2.zza(i10, 0, i12, j10, i13);
        Handler handler = this.zze;
        int i14 = zzfk.zza;
        handler.obtainMessage(0, zzh2).sendToTarget();
    }

    public final void zze(int i10, int i11, zzhq zzhq, long j10, int i12) {
        zzc();
        zzro zzh2 = zzh();
        zzh2.zza(i10, 0, 0, j10, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzh2.zzd;
        cryptoInfo.numSubSamples = zzhq.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzhq.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzhq.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzi = zzi(zzhq.zzb, cryptoInfo.key);
        Objects.requireNonNull(zzi);
        cryptoInfo.key = zzi;
        byte[] zzi2 = zzi(zzhq.zza, cryptoInfo.iv);
        Objects.requireNonNull(zzi2);
        cryptoInfo.iv = zzi2;
        cryptoInfo.mode = zzhq.zzc;
        if (zzfk.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhq.zzg, zzhq.zzh));
        }
        this.zze.obtainMessage(1, zzh2).sendToTarget();
    }

    public final void zzf() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzg() {
        if (!this.zzh) {
            this.zzd.start();
            this.zze = new zzrn(this, this.zzd.getLooper());
            this.zzh = true;
        }
    }
}
