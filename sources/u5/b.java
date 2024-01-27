package u5;

import a6.m0;
import java.util.Collections;
import java.util.List;
import o5.a;
import o5.e;

/* compiled from: SubripSubtitle */
final class b implements e {

    /* renamed from: h  reason: collision with root package name */
    private final a[] f12099h;

    /* renamed from: i  reason: collision with root package name */
    private final long[] f12100i;

    public b(a[] aVarArr, long[] jArr) {
        this.f12099h = aVarArr;
        this.f12100i = jArr;
    }

    public int a(long j10) {
        int e10 = m0.e(this.f12100i, j10, false, false);
        if (e10 < this.f12100i.length) {
            return e10;
        }
        return -1;
    }

    public long d(int i10) {
        boolean z10 = true;
        a6.a.a(i10 >= 0);
        if (i10 >= this.f12100i.length) {
            z10 = false;
        }
        a6.a.a(z10);
        return this.f12100i[i10];
    }

    public List<a> e(long j10) {
        int i10 = m0.i(this.f12100i, j10, true, false);
        if (i10 != -1) {
            a[] aVarArr = this.f12099h;
            if (aVarArr[i10] != a.f10394r) {
                return Collections.singletonList(aVarArr[i10]);
            }
        }
        return Collections.emptyList();
    }

    public int f() {
        return this.f12100i.length;
    }
}
