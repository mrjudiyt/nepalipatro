package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcdx implements zzhao {
    private final ByteBuffer zza;

    zzcdx(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    public final void close() {
    }

    public final int zza(ByteBuffer byteBuffer) {
        if (this.zza.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.zza.remaining());
        byte[] bArr = new byte[min];
        this.zza.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    public final long zzb() {
        return (long) this.zza.position();
    }

    public final long zzc() {
        return (long) this.zza.limit();
    }

    public final ByteBuffer zzd(long j10, long j11) {
        ByteBuffer byteBuffer = this.zza;
        int i10 = (int) j10;
        int position = byteBuffer.position();
        byteBuffer.position(i10);
        ByteBuffer slice = this.zza.slice();
        slice.limit((int) j11);
        this.zza.position(position);
        return slice;
    }

    public final void zze(long j10) {
        this.zza.position((int) j10);
    }
}
