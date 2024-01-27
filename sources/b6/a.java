package b6;

import a6.c;
import a6.u;
import a6.y;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AvcConfig */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f5008a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5009b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5010c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5011d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5012e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5013f;

    private a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f5008a = list;
        this.f5009b = i10;
        this.f5010c = i11;
        this.f5011d = i12;
        this.f5012e = f10;
        this.f5013f = str;
    }

    private static byte[] a(y yVar) {
        int I = yVar.I();
        int e10 = yVar.e();
        yVar.P(I);
        return c.d(yVar.d(), e10, I);
    }

    public static a b(y yVar) {
        String str;
        float f10;
        int i10;
        try {
            yVar.P(4);
            int C = (yVar.C() & 3) + 1;
            if (C != 3) {
                ArrayList arrayList = new ArrayList();
                int C2 = yVar.C() & 31;
                for (int i11 = 0; i11 < C2; i11++) {
                    arrayList.add(a(yVar));
                }
                int C3 = yVar.C();
                for (int i12 = 0; i12 < C3; i12++) {
                    arrayList.add(a(yVar));
                }
                int i13 = -1;
                if (C2 > 0) {
                    u.b i14 = u.i((byte[]) arrayList.get(0), C, ((byte[]) arrayList.get(0)).length);
                    int i15 = i14.f255e;
                    int i16 = i14.f256f;
                    float f11 = i14.f257g;
                    str = c.a(i14.f251a, i14.f252b, i14.f253c);
                    i13 = i15;
                    i10 = i16;
                    f10 = f11;
                } else {
                    str = null;
                    i10 = -1;
                    f10 = 1.0f;
                }
                return new a(arrayList, C, i13, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing AVC config", e10);
        }
    }
}
