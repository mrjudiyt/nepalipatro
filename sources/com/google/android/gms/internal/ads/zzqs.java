package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzqs extends zzdr {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzfk.zzf;
    private int zzi;
    private long zzj;

    public final ByteBuffer zzb() {
        int i10;
        if (super.zzh() && (i10 = this.zzi) > 0) {
            zzj(i10).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    public final void zze(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.zzg);
            this.zzj += (long) (min / this.zzb.zze);
            this.zzg -= min;
            byteBuffer.position(position + min);
            if (this.zzg <= 0) {
                int i11 = i10 - min;
                int length = (this.zzi + i11) - this.zzh.length;
                ByteBuffer zzj2 = zzj(length);
                int max = Math.max(0, Math.min(length, this.zzi));
                zzj2.put(this.zzh, 0, max);
                int max2 = Math.max(0, Math.min(length - max, i11));
                byteBuffer.limit(byteBuffer.position() + max2);
                zzj2.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i11 - max2;
                int i13 = this.zzi - max;
                this.zzi = i13;
                byte[] bArr = this.zzh;
                System.arraycopy(bArr, max, bArr, 0, i13);
                byteBuffer.get(this.zzh, this.zzi, i12);
                this.zzi += i12;
                zzj2.flip();
            }
        }
    }

    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    public final zzdo zzi(zzdo zzdo) {
        if (zzdo.zzd == 2) {
            this.zzf = true;
            return (this.zzd == 0 && this.zze == 0) ? zzdo.zza : zzdo;
        }
        throw new zzdp("Unhandled input format:", zzdo);
    }

    /* access modifiers changed from: protected */
    public final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i10 = this.zze;
            int i11 = this.zzb.zze;
            this.zzh = new byte[(i10 * i11)];
            this.zzg = this.zzd * i11;
        }
        this.zzi = 0;
    }

    /* access modifiers changed from: protected */
    public final void zzl() {
        if (this.zzf) {
            int i10 = this.zzi;
            if (i10 > 0) {
                this.zzj += (long) (i10 / this.zzb.zze);
            }
            this.zzi = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzm() {
        this.zzh = zzfk.zzf;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0;
    }

    public final void zzq(int i10, int i11) {
        this.zzd = i10;
        this.zze = i11;
    }
}
