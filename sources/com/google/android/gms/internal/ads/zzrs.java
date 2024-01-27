package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzrs extends zzht {
    private long zzg;
    private int zzh;
    private int zzi = 32;

    public zzrs() {
        super(2, 0);
    }

    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzl() {
        return this.zzh;
    }

    public final long zzm() {
        return this.zzg;
    }

    public final void zzn(int i10) {
        this.zzi = i10;
    }

    public final boolean zzo(zzht zzht) {
        ByteBuffer byteBuffer;
        zzdx.zzd(!zzht.zzd(1073741824));
        zzdx.zzd(!zzht.zzd(268435456));
        zzdx.zzd(!zzht.zzd(4));
        if (zzp()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzht.zzc;
            if (!(byteBuffer2 == null || (byteBuffer = this.zzc) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i10 = this.zzh;
        this.zzh = i10 + 1;
        if (i10 == 0) {
            this.zze = zzht.zze;
            if (zzht.zzd(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = zzht.zzc;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzht.zze;
        return true;
    }

    public final boolean zzp() {
        return this.zzh > 0;
    }
}
