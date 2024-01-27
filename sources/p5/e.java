package p5;

import a6.m0;
import h4.f;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import o5.f;
import o5.h;
import o5.i;

/* compiled from: CeaDecoder */
abstract class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<b> f10643a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<i> f10644b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityQueue<b> f10645c;

    /* renamed from: d  reason: collision with root package name */
    private b f10646d;

    /* renamed from: e  reason: collision with root package name */
    private long f10647e;

    /* renamed from: f  reason: collision with root package name */
    private long f10648f;

    /* compiled from: CeaDecoder */
    private static final class b extends h implements Comparable<b> {
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public long f10649q;

        private b() {
        }

        /* renamed from: z */
        public int compareTo(b bVar) {
            if (p() == bVar.p()) {
                long j10 = this.f6471l - bVar.f6471l;
                if (j10 == 0) {
                    j10 = this.f10649q - bVar.f10649q;
                    if (j10 == 0) {
                        return 0;
                    }
                }
                if (j10 > 0) {
                    return 1;
                }
                return -1;
            } else if (p()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* compiled from: CeaDecoder */
    private static final class c extends i {

        /* renamed from: m  reason: collision with root package name */
        private f.a<c> f10650m;

        public c(f.a<c> aVar) {
            this.f10650m = aVar;
        }

        public final void s() {
            this.f10650m.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f10643a.add(new b());
        }
        this.f10644b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f10644b.add(new c(new d(this)));
        }
        this.f10645c = new PriorityQueue<>();
    }

    private void m(b bVar) {
        bVar.k();
        this.f10643a.add(bVar);
    }

    public void a(long j10) {
        this.f10647e = j10;
    }

    /* access modifiers changed from: protected */
    public abstract o5.e e();

    /* access modifiers changed from: protected */
    public abstract void f(h hVar);

    public void flush() {
        this.f10648f = 0;
        this.f10647e = 0;
        while (!this.f10645c.isEmpty()) {
            m((b) m0.j(this.f10645c.poll()));
        }
        b bVar = this.f10646d;
        if (bVar != null) {
            m(bVar);
            this.f10646d = null;
        }
    }

    /* renamed from: g */
    public h c() {
        a6.a.f(this.f10646d == null);
        if (this.f10643a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f10643a.pollFirst();
        this.f10646d = pollFirst;
        return pollFirst;
    }

    /* renamed from: h */
    public i b() {
        if (this.f10644b.isEmpty()) {
            return null;
        }
        while (!this.f10645c.isEmpty() && ((b) m0.j(this.f10645c.peek())).f6471l <= this.f10647e) {
            b bVar = (b) m0.j(this.f10645c.poll());
            if (bVar.p()) {
                i iVar = (i) m0.j(this.f10644b.pollFirst());
                iVar.g(4);
                m(bVar);
                return iVar;
            }
            f(bVar);
            if (k()) {
                o5.e e10 = e();
                i iVar2 = (i) m0.j(this.f10644b.pollFirst());
                iVar2.t(bVar.f6471l, e10, Long.MAX_VALUE);
                m(bVar);
                return iVar2;
            }
            m(bVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final i i() {
        return this.f10644b.pollFirst();
    }

    /* access modifiers changed from: protected */
    public final long j() {
        return this.f10647e;
    }

    /* access modifiers changed from: protected */
    public abstract boolean k();

    /* renamed from: l */
    public void d(h hVar) {
        a6.a.a(hVar == this.f10646d);
        b bVar = (b) hVar;
        if (bVar.o()) {
            m(bVar);
        } else {
            long j10 = this.f10648f;
            this.f10648f = 1 + j10;
            long unused = bVar.f10649q = j10;
            this.f10645c.add(bVar);
        }
        this.f10646d = null;
    }

    /* access modifiers changed from: protected */
    public void n(i iVar) {
        iVar.k();
        this.f10644b.add(iVar);
    }

    public void release() {
    }
}
