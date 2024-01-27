package x5;

import java.util.Collections;
import java.util.List;
import o5.a;
import o5.e;

/* compiled from: Mp4WebvttSubtitle */
final class b implements e {

    /* renamed from: h  reason: collision with root package name */
    private final List<a> f12780h;

    public b(List<a> list) {
        this.f12780h = Collections.unmodifiableList(list);
    }

    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public long d(int i10) {
        a6.a.a(i10 == 0);
        return 0;
    }

    public List<a> e(long j10) {
        return j10 >= 0 ? this.f12780h : Collections.emptyList();
    }

    public int f() {
        return 1;
    }
}
