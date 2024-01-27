package v5;

import a6.m0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o5.a;
import o5.e;

/* compiled from: TtmlSubtitle */
final class h implements e {

    /* renamed from: h  reason: collision with root package name */
    private final d f12476h;

    /* renamed from: i  reason: collision with root package name */
    private final long[] f12477i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, g> f12478j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, e> f12479k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, String> f12480l;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f12476h = dVar;
        this.f12479k = map2;
        this.f12480l = map3;
        this.f12478j = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f12477i = dVar.j();
    }

    public int a(long j10) {
        int e10 = m0.e(this.f12477i, j10, false, false);
        if (e10 < this.f12477i.length) {
            return e10;
        }
        return -1;
    }

    public long d(int i10) {
        return this.f12477i[i10];
    }

    public List<a> e(long j10) {
        return this.f12476h.h(j10, this.f12478j, this.f12479k, this.f12480l);
    }

    public int f() {
        return this.f12477i.length;
    }
}
