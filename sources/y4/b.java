package y4;

import a6.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import l6.e;
import x4.a;
import x4.h;

/* compiled from: AppInfoTableDecoder */
public final class b extends h {
    private static a c(x xVar) {
        xVar.r(12);
        int d10 = (xVar.d() + xVar.h(12)) - 4;
        xVar.r(44);
        xVar.s(xVar.h(12));
        xVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (xVar.d() >= d10) {
                break;
            }
            xVar.r(48);
            int h10 = xVar.h(8);
            xVar.r(4);
            int d11 = xVar.d() + xVar.h(12);
            String str2 = null;
            while (xVar.d() < d11) {
                int h11 = xVar.h(8);
                int h12 = xVar.h(8);
                int d12 = xVar.d() + h12;
                if (h11 == 2) {
                    int h13 = xVar.h(16);
                    xVar.r(8);
                    if (h13 != 3) {
                    }
                    while (xVar.d() < d12) {
                        str = xVar.l(xVar.h(8), e.f15602a);
                        int h14 = xVar.h(8);
                        for (int i10 = 0; i10 < h14; i10++) {
                            xVar.s(xVar.h(8));
                        }
                    }
                } else if (h11 == 21) {
                    str2 = xVar.l(h12, e.f15602a);
                }
                xVar.p(d12 * 8);
            }
            xVar.p(d11 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new a(h10, str2.length() != 0 ? str.concat(str2) : new String(str)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new a((List<? extends a.b>) arrayList);
    }

    /* access modifiers changed from: protected */
    public a b(x4.e eVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new x(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
