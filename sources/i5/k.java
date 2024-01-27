package i5;

import a6.m0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import e4.j;
import i5.g;
import k4.f;
import z5.q;

/* compiled from: ContainerMediaChunk */
public class k extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f9342o;

    /* renamed from: p  reason: collision with root package name */
    private final long f9343p;

    /* renamed from: q  reason: collision with root package name */
    private final g f9344q;

    /* renamed from: r  reason: collision with root package name */
    private long f9345r;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f9346s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9347t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(a aVar, b bVar, j jVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, g gVar) {
        super(aVar, bVar, jVar, i10, obj, j10, j11, j12, j13, j14);
        this.f9342o = i11;
        this.f9343p = j15;
        this.f9344q = gVar;
    }

    public final void b() {
        f fVar;
        if (this.f9345r == 0) {
            c j10 = j();
            j10.b(this.f9343p);
            g gVar = this.f9344q;
            g.b l10 = l(j10);
            long j11 = this.f9280k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f9343p;
            long j13 = this.f9281l;
            gVar.b(l10, j12, j13 == -9223372036854775807L ? -9223372036854775807L : j13 - this.f9343p);
        }
        try {
            b e10 = this.f9308b.e(this.f9345r);
            q qVar = this.f9315i;
            fVar = new f(qVar, e10.f7705g, qVar.h(e10));
            do {
                if (this.f9346s || !this.f9344q.a(fVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f9344q.a(fVar));
            break;
            this.f9345r = fVar.getPosition() - this.f9308b.f7705g;
            m0.n(this.f9315i);
            this.f9347t = !this.f9346s;
        } catch (Throwable th) {
            m0.n(this.f9315i);
            throw th;
        }
    }

    public final void c() {
        this.f9346s = true;
    }

    public long g() {
        return this.f9354j + ((long) this.f9342o);
    }

    public boolean h() {
        return this.f9347t;
    }

    /* access modifiers changed from: protected */
    public g.b l(c cVar) {
        return cVar;
    }
}
