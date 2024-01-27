package t5;

import a6.m0;
import java.util.Collections;
import java.util.List;
import o5.a;
import o5.e;

/* compiled from: SsaSubtitle */
final class d implements e {

    /* renamed from: h  reason: collision with root package name */
    private final List<List<a>> f11703h;

    /* renamed from: i  reason: collision with root package name */
    private final List<Long> f11704i;

    public d(List<List<a>> list, List<Long> list2) {
        this.f11703h = list;
        this.f11704i = list2;
    }

    public int a(long j10) {
        int d10 = m0.d(this.f11704i, Long.valueOf(j10), false, false);
        if (d10 < this.f11704i.size()) {
            return d10;
        }
        return -1;
    }

    public long d(int i10) {
        boolean z10 = true;
        a6.a.a(i10 >= 0);
        if (i10 >= this.f11704i.size()) {
            z10 = false;
        }
        a6.a.a(z10);
        return this.f11704i.get(i10).longValue();
    }

    public List<a> e(long j10) {
        int g10 = m0.g(this.f11704i, Long.valueOf(j10), true, false);
        if (g10 == -1) {
            return Collections.emptyList();
        }
        return this.f11703h.get(g10);
    }

    public int f() {
        return this.f11704i.size();
    }
}
