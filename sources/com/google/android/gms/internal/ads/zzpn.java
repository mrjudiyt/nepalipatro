package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzpn extends zzdr {
    private int[] zzd;
    private int[] zze;

    zzpn() {
    }

    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i10 : iArr) {
                zzj.putShort(byteBuffer.getShort(i10 + i10 + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    public final zzdo zzi(zzdo zzdo) {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzdo.zza;
        }
        if (zzdo.zzd == 2) {
            boolean z10 = zzdo.zzc != iArr.length;
            int i10 = 0;
            while (true) {
                int length = iArr.length;
                if (i10 >= length) {
                    return z10 ? new zzdo(zzdo.zzb, length, 2) : zzdo.zza;
                }
                int i11 = iArr[i10];
                if (i11 < zzdo.zzc) {
                    z10 |= i11 != i10;
                    i10++;
                } else {
                    throw new zzdp("Unhandled input format:", zzdo);
                }
            }
        } else {
            throw new zzdp("Unhandled input format:", zzdo);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzk() {
        this.zze = this.zzd;
    }

    /* access modifiers changed from: protected */
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
