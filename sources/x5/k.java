package x5;

import a6.a;
import a6.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o5.e;

/* compiled from: WebvttSubtitle */
final class k implements e {

    /* renamed from: h  reason: collision with root package name */
    private final List<e> f12832h;

    /* renamed from: i  reason: collision with root package name */
    private final long[] f12833i;

    /* renamed from: j  reason: collision with root package name */
    private final long[] f12834j;

    public k(List<e> list) {
        this.f12832h = Collections.unmodifiableList(new ArrayList(list));
        this.f12833i = new long[(list.size() * 2)];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f12833i;
            jArr[i11] = eVar.f12803b;
            jArr[i11 + 1] = eVar.f12804c;
        }
        long[] jArr2 = this.f12833i;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f12834j = copyOf;
        Arrays.sort(copyOf);
    }

    public int a(long j10) {
        int e10 = m0.e(this.f12834j, j10, false, false);
        if (e10 < this.f12834j.length) {
            return e10;
        }
        return -1;
    }

    public long d(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.f12834j.length) {
            z10 = false;
        }
        a.a(z10);
        return this.f12834j[i10];
    }

    public List<o5.a> e(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f12832h.size(); i10++) {
            long[] jArr = this.f12833i;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f12832h.get(i10);
                o5.a aVar = eVar.f12802a;
                if (aVar.f10400e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, j.f17102h);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f12802a.a().g((float) (-1 - i12), 1).a());
        }
        return arrayList;
    }

    public int f() {
        return this.f12834j.length;
    }
}
