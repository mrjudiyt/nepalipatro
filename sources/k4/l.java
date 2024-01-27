package k4;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* compiled from: ExtractorUtil */
public final class l {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw ParserException.a(str, (Throwable) null);
        }
    }

    public static boolean b(j jVar, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return jVar.d(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(j jVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = jVar.i(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }

    public static boolean d(j jVar, byte[] bArr, int i10, int i11) {
        try {
            jVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(j jVar, int i10) {
        try {
            jVar.l(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
