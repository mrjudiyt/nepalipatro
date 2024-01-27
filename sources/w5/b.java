package w5;

import java.util.Collections;
import java.util.List;
import o5.a;
import o5.e;

/* compiled from: Tx3gSubtitle */
final class b implements e {

    /* renamed from: i  reason: collision with root package name */
    public static final b f12754i = new b();

    /* renamed from: h  reason: collision with root package name */
    private final List<a> f12755h;

    public b(a aVar) {
        this.f12755h = Collections.singletonList(aVar);
    }

    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public long d(int i10) {
        a6.a.a(i10 == 0);
        return 0;
    }

    public List<a> e(long j10) {
        return j10 >= 0 ? this.f12755h : Collections.emptyList();
    }

    public int f() {
        return 1;
    }

    private b() {
        this.f12755h = Collections.emptyList();
    }
}
