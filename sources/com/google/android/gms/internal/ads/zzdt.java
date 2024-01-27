package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdt implements zzdq {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdo zze;
    private zzdo zzf;
    private zzdo zzg;
    private zzdo zzh;
    private boolean zzi;
    private zzds zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzdt() {
        zzdo zzdo = zzdo.zza;
        this.zze = zzdo;
        this.zzf = zzdo;
        this.zzg = zzdo;
        this.zzh = zzdo;
        ByteBuffer byteBuffer = zzdq.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    public final zzdo zza(zzdo zzdo) {
        if (zzdo.zzd == 2) {
            int i10 = this.zzb;
            if (i10 == -1) {
                i10 = zzdo.zzb;
            }
            this.zze = zzdo;
            zzdo zzdo2 = new zzdo(i10, zzdo.zzc, 2);
            this.zzf = zzdo2;
            this.zzi = true;
            return zzdo2;
        }
        throw new zzdp("Unhandled input format:", zzdo);
    }

    public final ByteBuffer zzb() {
        int zza;
        zzds zzds = this.zzj;
        if (zzds != null && (zza = zzds.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzds.zzd(this.zzl);
            this.zzo += (long) zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzdq.zza;
        return byteBuffer;
    }

    public final void zzc() {
        if (zzg()) {
            zzdo zzdo = this.zze;
            this.zzg = zzdo;
            zzdo zzdo2 = this.zzf;
            this.zzh = zzdo2;
            if (this.zzi) {
                this.zzj = new zzds(zzdo.zzb, zzdo.zzc, this.zzc, this.zzd, zzdo2.zzb);
            } else {
                zzds zzds = this.zzj;
                if (zzds != null) {
                    zzds.zzc();
                }
            }
        }
        this.zzm = zzdq.zza;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final void zzd() {
        zzds zzds = this.zzj;
        if (zzds != null) {
            zzds.zze();
        }
        this.zzp = true;
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzds zzds = this.zzj;
            Objects.requireNonNull(zzds);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += (long) remaining;
            zzds.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzdo zzdo = zzdo.zza;
        this.zze = zzdo;
        this.zzf = zzdo;
        this.zzg = zzdo;
        this.zzh = zzdo;
        ByteBuffer byteBuffer = zzdq.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + -1.0f) >= 1.0E-4f || Math.abs(this.zzd + -1.0f) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.zzj;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzh() {
        /*
            r3 = this;
            boolean r0 = r3.zzp
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.zzds r0 = r3.zzj
            if (r0 == 0) goto L_0x0013
            int r0 = r0.zza()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdt.zzh():boolean");
    }

    public final long zzi(long j10) {
        long j11 = this.zzo;
        if (j11 < 1024) {
            return (long) (((double) this.zzc) * ((double) j10));
        }
        long j12 = this.zzn;
        zzds zzds = this.zzj;
        Objects.requireNonNull(zzds);
        long zzb2 = j12 - ((long) zzds.zzb());
        int i10 = this.zzh.zzb;
        int i11 = this.zzg.zzb;
        if (i10 == i11) {
            return zzfk.zzr(j10, zzb2, j11);
        }
        return zzfk.zzr(j10, zzb2 * ((long) i10), j11 * ((long) i11));
    }

    public final void zzj(float f10) {
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final void zzk(float f10) {
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }
}
