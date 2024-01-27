package s0;

import io.flutter.embedding.android.KeyboardMap;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* compiled from: ZipUtil */
final class c {

    /* compiled from: ZipUtil */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f11311a;

        /* renamed from: b  reason: collision with root package name */
        long f11312b;

        a() {
        }
    }

    static long a(RandomAccessFile randomAccessFile, a aVar) {
        CRC32 crc32 = new CRC32();
        long j10 = aVar.f11312b;
        randomAccessFile.seek(aVar.f11311a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j10));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j10 -= (long) read;
            if (j10 == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j10));
        }
        return crc32.getValue();
    }

    static a b(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j10 = 0;
        if (length >= 0) {
            long j11 = length - 65536;
            if (j11 >= 0) {
                j10 = j11;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    a aVar = new a();
                    aVar.f11312b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & KeyboardMap.kValueMask;
                    aVar.f11311a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & KeyboardMap.kValueMask;
                    return aVar;
                }
                length--;
            } while (length >= j10);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    static long c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
