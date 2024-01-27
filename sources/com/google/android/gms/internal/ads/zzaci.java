package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaci {
    public static int zza(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i10;
        byte b10 = 0;
        if ((byteBuffer.get(5) & 2) == 0) {
            i10 = 0;
        } else {
            byte b11 = byteBuffer.get(26);
            int i11 = 28;
            int i12 = 28;
            for (int i13 = 0; i13 < b11; i13++) {
                i12 += byteBuffer.get(i13 + 27);
            }
            byte b12 = byteBuffer.get(i12 + 26);
            for (int i14 = 0; i14 < b12; i14++) {
                i11 += byteBuffer.get(i12 + 27 + i14);
            }
            i10 = i12 + i11;
        }
        int i15 = byteBuffer.get(i10 + 26) + 27 + i10;
        byte b13 = byteBuffer.get(i15);
        if (byteBuffer.limit() - i15 > 1) {
            b10 = byteBuffer.get(i15 + 1);
        }
        return (int) ((zzf(b13, b10) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        byte b10 = 0;
        byte b11 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b10 = byteBuffer.get(1);
        }
        return (int) ((zzf(b11, b10) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return zzf(b11, b10);
    }

    public static List zze(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzh(zzg((long) zza(bArr))));
        arrayList.add(zzh(zzg(3840)));
        return arrayList;
    }

    private static long zzf(byte b10, byte b11) {
        byte b12 = b10 & 255;
        byte b13 = b12 & 3;
        byte b14 = 2;
        if (b13 == 0) {
            b14 = 1;
        } else if (!(b13 == 1 || b13 == 2)) {
            b14 = b11 & 63;
        }
        int i10 = b12 >> 3;
        int i11 = i10 & 3;
        return ((long) b14) * ((long) (i10 >= 16 ? 2500 << i11 : i10 >= 12 ? 10000 << (i11 & 1) : i11 == 3 ? 60000 : 10000 << i11));
    }

    private static long zzg(long j10) {
        return (j10 * 1000000000) / 48000;
    }

    private static byte[] zzh(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }
}
