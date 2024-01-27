package ea;

import com.facebook.appevents.AppEventsConstants;
import fa.b;
import kotlin.jvm.internal.m;

/* compiled from: -Util.kt */
public final class c {
    public static final boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        m.g(bArr, "a");
        m.g(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c(int i10) {
        return ((i10 & 255) << 24) | ((-16777216 & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final short d(short s10) {
        short s11 = s10 & 65535;
        return (short) (((s11 & 255) << 8) | ((65280 & s11) >>> 8));
    }

    public static final String e(byte b10) {
        return new String(new char[]{b.d()[(b10 >> 4) & 15], b.d()[b10 & 15]});
    }

    public static final String f(int i10) {
        if (i10 == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        int i11 = 0;
        char[] cArr = {b.d()[(i10 >> 28) & 15], b.d()[(i10 >> 24) & 15], b.d()[(i10 >> 20) & 15], b.d()[(i10 >> 16) & 15], b.d()[(i10 >> 12) & 15], b.d()[(i10 >> 8) & 15], b.d()[(i10 >> 4) & 15], b.d()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return new String(cArr, i11, 8 - i11);
    }
}
