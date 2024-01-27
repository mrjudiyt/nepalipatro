package k5;

import android.net.Uri;
import com.google.common.collect.x;
import j5.e;
import java.util.Collections;
import java.util.List;
import k5.k;

/* compiled from: Representation */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f9692a;

    /* renamed from: b  reason: collision with root package name */
    public final e4.j f9693b;

    /* renamed from: c  reason: collision with root package name */
    public final x<b> f9694c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9695d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e> f9696e;

    /* renamed from: f  reason: collision with root package name */
    private final i f9697f;

    /* compiled from: Representation */
    public static class b extends j implements e {

        /* renamed from: g  reason: collision with root package name */
        final k.a f9698g;

        public b(long j10, e4.j jVar, List<b> list, k.a aVar, List<e> list2) {
            super(j10, jVar, list, aVar, list2);
            this.f9698g = aVar;
        }

        public long a(long j10) {
            return this.f9698g.j(j10);
        }

        public long b(long j10, long j11) {
            return this.f9698g.h(j10, j11);
        }

        public long c(long j10, long j11) {
            return this.f9698g.d(j10, j11);
        }

        public long d(long j10, long j11) {
            return this.f9698g.f(j10, j11);
        }

        public i e(long j10) {
            return this.f9698g.k(this, j10);
        }

        public long f(long j10, long j11) {
            return this.f9698g.i(j10, j11);
        }

        public boolean g() {
            return this.f9698g.l();
        }

        public long h() {
            return this.f9698g.e();
        }

        public long i(long j10) {
            return this.f9698g.g(j10);
        }

        public long j(long j10, long j11) {
            return this.f9698g.c(j10, j11);
        }

        public String k() {
            return null;
        }

        public e l() {
            return this;
        }

        public i m() {
            return null;
        }
    }

    /* compiled from: Representation */
    public static class c extends j {

        /* renamed from: g  reason: collision with root package name */
        public final Uri f9699g;

        /* renamed from: h  reason: collision with root package name */
        public final long f9700h;

        /* renamed from: i  reason: collision with root package name */
        private final String f9701i;

        /* renamed from: j  reason: collision with root package name */
        private final i f9702j;

        /* renamed from: k  reason: collision with root package name */
        private final m f9703k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(long j10, e4.j jVar, List<b> list, k.e eVar, List<e> list2, String str, long j11) {
            super(j10, jVar, list, eVar, list2);
            m mVar;
            List<b> list3 = list;
            this.f9699g = Uri.parse(list.get(0).f9641a);
            i c10 = eVar.c();
            this.f9702j = c10;
            this.f9701i = str;
            this.f9700h = j11;
            if (c10 != null) {
                mVar = null;
            } else {
                mVar = new m(new i((String) null, 0, j11));
            }
            this.f9703k = mVar;
        }

        public String k() {
            return this.f9701i;
        }

        public e l() {
            return this.f9703k;
        }

        public i m() {
            return this.f9702j;
        }
    }

    public static j o(long j10, e4.j jVar, List<b> list, k kVar, List<e> list2) {
        return p(j10, jVar, list, kVar, list2, (String) null);
    }

    public static j p(long j10, e4.j jVar, List<b> list, k kVar, List<e> list2, String str) {
        k kVar2 = kVar;
        if (kVar2 instanceof k.e) {
            return new c(j10, jVar, list, (k.e) kVar2, list2, str, -1);
        } else if (kVar2 instanceof k.a) {
            return new b(j10, jVar, list, (k.a) kVar2, list2);
        } else {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
    }

    public abstract String k();

    public abstract e l();

    public abstract i m();

    public i n() {
        return this.f9697f;
    }

    private j(long j10, e4.j jVar, List<b> list, k kVar, List<e> list2) {
        List<e> list3;
        a6.a.a(!list.isEmpty());
        this.f9692a = j10;
        this.f9693b = jVar;
        this.f9694c = x.n(list);
        if (list2 == null) {
            list3 = Collections.emptyList();
        } else {
            list3 = Collections.unmodifiableList(list2);
        }
        this.f9696e = list3;
        this.f9697f = kVar.a(this);
        this.f9695d = kVar.b();
    }
}
