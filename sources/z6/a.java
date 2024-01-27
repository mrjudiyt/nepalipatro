package z6;

import a7.c;
import b7.b;
import com.google.zxing.e;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: AztecWriter */
public final class a implements e {
    private static b b(String str, com.google.zxing.a aVar, int i10, int i11, Charset charset, int i12, int i13) {
        if (aVar == com.google.zxing.a.AZTEC) {
            return c(c.d(str.getBytes(charset), i12, i13), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    private static b c(a7.a aVar, int i10, int i11) {
        b a10 = aVar.a();
        if (a10 != null) {
            int f10 = a10.f();
            int e10 = a10.e();
            int max = Math.max(i10, f10);
            int max2 = Math.max(i11, e10);
            int min = Math.min(max / f10, max2 / e10);
            int i12 = (max - (f10 * min)) / 2;
            int i13 = (max2 - (e10 * min)) / 2;
            b bVar = new b(max, max2);
            int i14 = 0;
            while (i14 < e10) {
                int i15 = i12;
                int i16 = 0;
                while (i16 < f10) {
                    if (a10.d(i16, i14)) {
                        bVar.i(i15, i13, min, min);
                    }
                    i16++;
                    i15 += min;
                }
                i14++;
                i13 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    public b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.c, ?> map) {
        int i12;
        int i13;
        Charset charset;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        int i14 = 33;
        if (map != null) {
            com.google.zxing.c cVar = com.google.zxing.c.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charset2 = Charset.forName(map.get(cVar).toString());
            }
            com.google.zxing.c cVar2 = com.google.zxing.c.ERROR_CORRECTION;
            if (map.containsKey(cVar2)) {
                i14 = Integer.parseInt(map.get(cVar2).toString());
            }
            com.google.zxing.c cVar3 = com.google.zxing.c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                charset = charset2;
                i13 = i14;
                i12 = Integer.parseInt(map.get(cVar3).toString());
                return b(str, aVar, i10, i11, charset, i13, i12);
            }
            charset = charset2;
            i13 = i14;
        } else {
            charset = charset2;
            i13 = 33;
        }
        i12 = 0;
        return b(str, aVar, i10, i11, charset, i13, i12);
    }
}
