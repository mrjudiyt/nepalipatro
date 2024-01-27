package a6;

import android.media.MediaFormat;
import b6.b;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: MediaFormatUtil */
public final class s {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, b bVar) {
        if (bVar != null) {
            d(mediaFormat, "color-transfer", bVar.f5016j);
            d(mediaFormat, "color-standard", bVar.f5014h);
            d(mediaFormat, "color-range", bVar.f5015i);
            a(mediaFormat, "hdr-static-info", bVar.f5017k);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i10);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(list.get(i10)));
        }
    }
}
