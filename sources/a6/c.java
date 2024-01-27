package a6;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* compiled from: CodecSpecificDataUtil */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f148a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f149b = {"", "A", "B", "C"};

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public static List<byte[]> b(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(z zVar) {
        zVar.l(24);
        int e10 = zVar.e(2);
        boolean d10 = zVar.d();
        int e11 = zVar.e(5);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (zVar.d()) {
                i10 |= 1 << i11;
            }
        }
        int i12 = 6;
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = zVar.e(8);
        }
        int e12 = zVar.e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f149b[e10];
        objArr[1] = Integer.valueOf(e11);
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = Character.valueOf(d10 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(e12);
        StringBuilder sb = new StringBuilder(m0.C("hvc1.%s%d.%X.%c%d", objArr));
        while (i12 > 0 && iArr[i12 - 1] == 0) {
            i12--;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i14])}));
        }
        return sb.toString();
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f148a;
        byte[] bArr3 = new byte[(bArr2.length + i11)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static Pair<Integer, Integer> e(byte[] bArr) {
        y yVar = new y(bArr);
        yVar.O(9);
        int C = yVar.C();
        yVar.O(20);
        return Pair.create(Integer.valueOf(yVar.G()), Integer.valueOf(C));
    }

    public static boolean f(List<byte[]> list) {
        if (list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1) {
            return true;
        }
        return false;
    }
}
