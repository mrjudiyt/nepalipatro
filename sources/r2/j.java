package r2;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import e2.g;
import e2.i;
import h2.c;
import i2.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: StreamGifDecoder */
public class j implements i<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    private final List<ImageHeaderParser> f10864a;

    /* renamed from: b  reason: collision with root package name */
    private final i<ByteBuffer, c> f10865b;

    /* renamed from: c  reason: collision with root package name */
    private final b f10866c;

    public j(List<ImageHeaderParser> list, i<ByteBuffer, c> iVar, b bVar) {
        this.f10864a = list;
        this.f10865b = iVar;
        this.f10866c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public c<c> a(InputStream inputStream, int i10, int i11, g gVar) {
        byte[] e10 = e(inputStream);
        if (e10 == null) {
            return null;
        }
        return this.f10865b.a(ByteBuffer.wrap(e10), i10, i11, gVar);
    }

    /* renamed from: d */
    public boolean b(InputStream inputStream, g gVar) {
        return !((Boolean) gVar.c(i.f10863b)).booleanValue() && a.e(this.f10864a, inputStream, this.f10866c) == ImageHeaderParser.ImageType.GIF;
    }
}
