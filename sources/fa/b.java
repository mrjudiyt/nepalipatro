package fa;

import ea.e;
import ea.h;
import kotlin.jvm.internal.m;

/* compiled from: ByteString.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f14674a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0068, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int b(byte[] r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            int r2 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            if (r4 >= r2) goto L_0x01d7
            byte r7 = r0[r4]
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 159(0x9f, float:2.23E-43)
            r10 = 31
            r11 = 13
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 10
            r14 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            r17 = 1
            if (r7 < 0) goto L_0x0071
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0026
            return r5
        L_0x0026:
            if (r7 == r13) goto L_0x0038
            if (r7 == r11) goto L_0x0038
            if (r7 < 0) goto L_0x002e
            if (r10 >= r7) goto L_0x0033
        L_0x002e:
            if (r8 <= r7) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            if (r9 < r7) goto L_0x0035
        L_0x0033:
            r6 = 1
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            if (r6 != 0) goto L_0x003a
        L_0x0038:
            if (r7 != r12) goto L_0x003b
        L_0x003a:
            return r16
        L_0x003b:
            if (r7 >= r14) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = 2
        L_0x0040:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L_0x0043:
            r6 = r18
            if (r4 >= r2) goto L_0x0008
            byte r7 = r0[r4]
            if (r7 < 0) goto L_0x0008
            int r7 = r4 + 1
            byte r4 = r0[r4]
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0054
            return r5
        L_0x0054:
            if (r4 == r13) goto L_0x0066
            if (r4 == r11) goto L_0x0066
            if (r4 < 0) goto L_0x005c
            if (r10 >= r4) goto L_0x0061
        L_0x005c:
            if (r8 <= r4) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            if (r9 < r4) goto L_0x0063
        L_0x0061:
            r6 = 1
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            if (r6 != 0) goto L_0x0068
        L_0x0066:
            if (r4 != r12) goto L_0x0069
        L_0x0068:
            return r16
        L_0x0069:
            if (r4 >= r14) goto L_0x006d
            r4 = 1
            goto L_0x006e
        L_0x006d:
            r4 = 2
        L_0x006e:
            int r5 = r5 + r4
            r4 = r7
            goto L_0x0043
        L_0x0071:
            int r3 = r7 >> 5
            r15 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r3 != r15) goto L_0x00c3
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x0080
            if (r6 != r1) goto L_0x007f
            return r5
        L_0x007f:
            return r16
        L_0x0080:
            byte r7 = r0[r4]
            byte r3 = r0[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x008a
            r15 = 1
            goto L_0x008b
        L_0x008a:
            r15 = 0
        L_0x008b:
            if (r15 != 0) goto L_0x0091
            if (r6 != r1) goto L_0x0090
            return r5
        L_0x0090:
            return r16
        L_0x0091:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r3 = r3 ^ r7
            if (r3 >= r14) goto L_0x009c
            if (r6 != r1) goto L_0x009b
            return r5
        L_0x009b:
            return r16
        L_0x009c:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x00a1
            return r5
        L_0x00a1:
            if (r3 == r13) goto L_0x00b3
            if (r3 == r11) goto L_0x00b3
            if (r3 < 0) goto L_0x00a9
            if (r10 >= r3) goto L_0x00ae
        L_0x00a9:
            if (r8 <= r3) goto L_0x00ac
            goto L_0x00b0
        L_0x00ac:
            if (r9 < r3) goto L_0x00b0
        L_0x00ae:
            r6 = 1
            goto L_0x00b1
        L_0x00b0:
            r6 = 0
        L_0x00b1:
            if (r6 != 0) goto L_0x00b5
        L_0x00b3:
            if (r3 != r12) goto L_0x00b6
        L_0x00b5:
            return r16
        L_0x00b6:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00bc
            r15 = 1
            goto L_0x00bd
        L_0x00bc:
            r15 = 2
        L_0x00bd:
            int r5 = r5 + r15
            int r4 = r4 + 2
        L_0x00c0:
            r6 = r7
            goto L_0x0008
        L_0x00c3:
            int r3 = r7 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r3 != r15) goto L_0x013e
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00d5
            if (r6 != r1) goto L_0x00d4
            return r5
        L_0x00d4:
            return r16
        L_0x00d5:
            byte r7 = r0[r4]
            int r15 = r4 + 1
            byte r15 = r0[r15]
            r8 = r15 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto L_0x00e1
            r8 = 1
            goto L_0x00e2
        L_0x00e1:
            r8 = 0
        L_0x00e2:
            if (r8 != 0) goto L_0x00e8
            if (r6 != r1) goto L_0x00e7
            return r5
        L_0x00e7:
            return r16
        L_0x00e8:
            byte r3 = r0[r3]
            r8 = r3 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto L_0x00f0
            r8 = 1
            goto L_0x00f1
        L_0x00f0:
            r8 = 0
        L_0x00f1:
            if (r8 != 0) goto L_0x00f7
            if (r6 != r1) goto L_0x00f6
            return r5
        L_0x00f6:
            return r16
        L_0x00f7:
            r8 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r8
            int r8 = r15 << 6
            r3 = r3 ^ r8
            int r7 = r7 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x0109
            if (r6 != r1) goto L_0x0108
            return r5
        L_0x0108:
            return r16
        L_0x0109:
            if (r12 <= r3) goto L_0x010c
            goto L_0x0112
        L_0x010c:
            if (r9 < r3) goto L_0x0112
            if (r6 != r1) goto L_0x0111
            return r5
        L_0x0111:
            return r16
        L_0x0112:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x0117
            return r5
        L_0x0117:
            if (r3 == r13) goto L_0x012d
            if (r3 == r11) goto L_0x012d
            if (r3 < 0) goto L_0x011f
            if (r10 >= r3) goto L_0x0128
        L_0x011f:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x0124
            goto L_0x012a
        L_0x0124:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x012a
        L_0x0128:
            r6 = 1
            goto L_0x012b
        L_0x012a:
            r6 = 0
        L_0x012b:
            if (r6 != 0) goto L_0x0132
        L_0x012d:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0133
        L_0x0132:
            return r16
        L_0x0133:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x0139
            r15 = 1
            goto L_0x013a
        L_0x0139:
            r15 = 2
        L_0x013a:
            int r5 = r5 + r15
            int r4 = r4 + 3
            goto L_0x00c0
        L_0x013e:
            int r3 = r7 >> 3
            if (r3 != r15) goto L_0x01d3
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x014a
            if (r6 != r1) goto L_0x0149
            return r5
        L_0x0149:
            return r16
        L_0x014a:
            byte r7 = r0[r4]
            int r8 = r4 + 1
            byte r8 = r0[r8]
            r15 = r8 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x0156
            r15 = 1
            goto L_0x0157
        L_0x0156:
            r15 = 0
        L_0x0157:
            if (r15 != 0) goto L_0x015d
            if (r6 != r1) goto L_0x015c
            return r5
        L_0x015c:
            return r16
        L_0x015d:
            int r15 = r4 + 2
            byte r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x0167
            r10 = 1
            goto L_0x0168
        L_0x0167:
            r10 = 0
        L_0x0168:
            if (r10 != 0) goto L_0x016e
            if (r6 != r1) goto L_0x016d
            return r5
        L_0x016d:
            return r16
        L_0x016e:
            byte r3 = r0[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x0176
            r10 = 1
            goto L_0x0177
        L_0x0176:
            r10 = 0
        L_0x0177:
            if (r10 != 0) goto L_0x017d
            if (r6 != r1) goto L_0x017c
            return r5
        L_0x017c:
            return r16
        L_0x017d:
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r15 << 6
            r3 = r3 ^ r10
            int r8 = r8 << 12
            r3 = r3 ^ r8
            int r7 = r7 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x0193
            if (r6 != r1) goto L_0x0192
            return r5
        L_0x0192:
            return r16
        L_0x0193:
            if (r12 <= r3) goto L_0x0196
            goto L_0x019c
        L_0x0196:
            if (r9 < r3) goto L_0x019c
            if (r6 != r1) goto L_0x019b
            return r5
        L_0x019b:
            return r16
        L_0x019c:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r7) goto L_0x01a4
            if (r6 != r1) goto L_0x01a3
            return r5
        L_0x01a3:
            return r16
        L_0x01a4:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x01a9
            return r5
        L_0x01a9:
            if (r3 == r13) goto L_0x01c1
            if (r3 == r11) goto L_0x01c1
            if (r3 < 0) goto L_0x01b3
            r6 = 31
            if (r6 >= r3) goto L_0x01bc
        L_0x01b3:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x01b8
            goto L_0x01be
        L_0x01b8:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x01be
        L_0x01bc:
            r6 = 1
            goto L_0x01bf
        L_0x01be:
            r6 = 0
        L_0x01bf:
            if (r6 != 0) goto L_0x01c6
        L_0x01c1:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x01c7
        L_0x01c6:
            return r16
        L_0x01c7:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x01cd
            r15 = 1
            goto L_0x01ce
        L_0x01cd:
            r15 = 2
        L_0x01ce:
            int r5 = r5 + r15
            int r4 = r4 + 4
            goto L_0x00c0
        L_0x01d3:
            if (r6 != r1) goto L_0x01d6
            return r5
        L_0x01d6:
            return r16
        L_0x01d7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.b.b(byte[], int):int");
    }

    public static final void c(h hVar, e eVar, int i10, int i11) {
        m.g(hVar, "$this$commonWrite");
        m.g(eVar, "buffer");
        eVar.Z(hVar.g(), i10, i11);
    }

    public static final char[] d() {
        return f14674a;
    }
}
