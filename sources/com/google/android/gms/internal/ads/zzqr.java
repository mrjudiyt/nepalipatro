package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzqr extends zzdr {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    zzqr() {
    }

    private static void zzo(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.zzb.zzd;
        if (i11 == 536870912) {
            byteBuffer2 = zzj((i10 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 805306368) {
            byteBuffer2 = zzj(i10);
            while (position < limit) {
                zzo((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else if (i11 == 1342177280) {
            byteBuffer2 = zzj((i10 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 1610612736) {
            byteBuffer2 = zzj(i10);
            while (position < limit) {
                zzo((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public final zzdo zzi(zzdo zzdo) {
        int i10 = zzdo.zzd;
        int i11 = zzfk.zza;
        if (i10 == 536870912 || i10 == 1342177280 || i10 == 805306368 || i10 == 1610612736) {
            return new zzdo(zzdo.zzb, zzdo.zzc, 4);
        }
        if (i10 == 4) {
            return zzdo.zza;
        }
        throw new zzdp("Unhandled input format:", zzdo);
    }
}
