package b6;

import a6.c;
import a6.u;
import a6.y;
import a6.z;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* compiled from: HevcConfig */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f5046a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5047b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5048c;

    private f(List<byte[]> list, int i10, String str) {
        this.f5046a = list;
        this.f5047b = i10;
        this.f5048c = str;
    }

    public static f a(y yVar) {
        List list;
        y yVar2 = yVar;
        try {
            yVar2.P(21);
            int C = yVar.C() & 3;
            int C2 = yVar.C();
            int e10 = yVar.e();
            int i10 = 0;
            for (int i11 = 0; i11 < C2; i11++) {
                yVar2.P(1);
                int I = yVar.I();
                for (int i12 = 0; i12 < I; i12++) {
                    int I2 = yVar.I();
                    i10 += I2 + 4;
                    yVar2.P(I2);
                }
            }
            yVar2.O(e10);
            byte[] bArr = new byte[i10];
            String str = null;
            int i13 = 0;
            for (int i14 = 0; i14 < C2; i14++) {
                int C3 = yVar.C() & 127;
                int I3 = yVar.I();
                for (int i15 = 0; i15 < I3; i15++) {
                    int I4 = yVar.I();
                    byte[] bArr2 = u.f244a;
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(yVar.d(), yVar.e(), bArr, length, I4);
                    if (C3 == 33 && i15 == 0) {
                        str = c.c(new z(bArr, length, length + I4));
                    }
                    i13 = length + I4;
                    yVar2.P(I4);
                }
            }
            if (i10 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new f(list, C + 1, str);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw ParserException.a("Error parsing HEVC config", e11);
        }
    }
}
