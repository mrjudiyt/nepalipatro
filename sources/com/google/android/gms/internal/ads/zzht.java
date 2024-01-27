package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzht extends zzhn {
    public zzam zza;
    public final zzhq zzb = new zzhq();
    public ByteBuffer zzc;
    public boolean zzd;
    public long zze;
    public ByteBuffer zzf;
    private final int zzg;

    static {
        zzbq.zzb("media3.decoder");
    }

    public zzht(int i10, int i11) {
        this.zzg = i10;
    }

    private final ByteBuffer zzl(int i10) {
        int i11;
        int i12 = this.zzg;
        if (i12 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            i11 = 0;
        } else {
            i11 = byteBuffer.capacity();
        }
        throw new zzhs(i11, i10);
    }

    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzd = false;
    }

    public final void zzi(int i10) {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            this.zzc = zzl(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.zzc = byteBuffer;
            return;
        }
        ByteBuffer zzl = zzl(i11);
        zzl.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            zzl.put(byteBuffer);
        }
        this.zzc = zzl;
    }

    public final void zzj() {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean zzk() {
        return zzd(1073741824);
    }
}
