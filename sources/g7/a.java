package g7;

import b7.b;
import com.google.zxing.c;
import com.google.zxing.e;
import h7.d;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: PDF417Writer */
public final class a implements e {
    private static b b(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        b bVar = new b(bArr[0].length + i11, bArr.length + i11);
        bVar.b();
        int e10 = (bVar.e() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    bVar.g(i13 + i10, e10);
                }
            }
            i12++;
            e10--;
        }
        return bVar;
    }

    private static b c(h7.e eVar, String str, int i10, int i11, int i12, int i13) {
        boolean z10;
        eVar.e(str, i10);
        byte[][] b10 = eVar.f().b(1, 4);
        if ((i12 > i11) != (b10[0].length < b10.length)) {
            b10 = d(b10);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = i11 / b10[0].length;
        int length2 = i12 / b10.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(b10, i13);
        }
        byte[][] b11 = eVar.f().b(length, length << 2);
        if (z10) {
            b11 = d(b11);
        }
        return b(b11, i13);
    }

    private static byte[][] d(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length2 = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length2] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    public b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<c, ?> map) {
        int i12;
        int i13;
        if (aVar == com.google.zxing.a.PDF_417) {
            h7.e eVar = new h7.e();
            int i14 = 30;
            int i15 = 2;
            if (map != null) {
                c cVar = c.PDF417_COMPACT;
                if (map.containsKey(cVar)) {
                    eVar.h(Boolean.valueOf(map.get(cVar).toString()).booleanValue());
                }
                c cVar2 = c.PDF417_COMPACTION;
                if (map.containsKey(cVar2)) {
                    eVar.i(h7.c.valueOf(map.get(cVar2).toString()));
                }
                c cVar3 = c.PDF417_DIMENSIONS;
                if (map.containsKey(cVar3)) {
                    d dVar = (d) map.get(cVar3);
                    eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
                }
                c cVar4 = c.MARGIN;
                if (map.containsKey(cVar4)) {
                    i14 = Integer.parseInt(map.get(cVar4).toString());
                }
                c cVar5 = c.ERROR_CORRECTION;
                if (map.containsKey(cVar5)) {
                    i15 = Integer.parseInt(map.get(cVar5).toString());
                }
                c cVar6 = c.CHARACTER_SET;
                if (map.containsKey(cVar6)) {
                    eVar.k(Charset.forName(map.get(cVar6).toString()));
                }
                i12 = i14;
                i13 = i15;
            } else {
                i13 = 2;
                i12 = 30;
            }
            return c(eVar, str, i13, i10, i11, i12);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }
}
