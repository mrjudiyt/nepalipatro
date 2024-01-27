package com.google.android.gms.internal.ads;

import android.util.Pair;
import io.flutter.embedding.android.KeyboardMap;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaln {
    public static long zza(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 16);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 12);
    }

    static Pair zzc(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair zzf = zzf(randomAccessFile, 0);
        if (zzf != null) {
            return zzf;
        }
        return zzf(randomAccessFile, 65535);
    }

    public static void zzd(ByteBuffer byteBuffer, long j10) {
        zzg(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j10 < 0 || j10 > KeyboardMap.kValueMask) {
            throw new IllegalArgumentException("uint32 value of out range: " + j10);
        }
        byteBuffer.putInt(byteBuffer.position() + position, (int) j10);
    }

    private static long zze(ByteBuffer byteBuffer, int i10) {
        return ((long) byteBuffer.getInt(i10)) & KeyboardMap.kValueMask;
    }

    private static Pair zzf(RandomAccessFile randomAccessFile, int i10) {
        int i11;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i10, -22 + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        zzg(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i12 = capacity2 - 22;
            int min = Math.min(i12, 65535);
            int i13 = 0;
            while (true) {
                if (i13 >= min) {
                    break;
                }
                i11 = i12 - i13;
                if (allocate.getInt(i11) == 101010256 && ((char) allocate.getShort(i11 + 20)) == i13) {
                    break;
                }
                i13++;
            }
        }
        i11 = -1;
        if (i11 == -1) {
            return null;
        }
        allocate.position(i11);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + ((long) i11)));
    }

    private static void zzg(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
