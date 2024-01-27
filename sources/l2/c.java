package l2;

import a3.a;
import e2.d;
import e2.g;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferEncoder */
public class c implements d<ByteBuffer> {
    /* renamed from: c */
    public boolean a(ByteBuffer byteBuffer, File file, g gVar) {
        try {
            a.e(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
