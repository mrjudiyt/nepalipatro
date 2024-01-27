package i5;

import a6.m0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import e4.j;
import i5.g;
import k4.f;
import z5.q;

/* compiled from: InitializationChunk */
public final class m extends f {

    /* renamed from: j  reason: collision with root package name */
    private final g f9350j;

    /* renamed from: k  reason: collision with root package name */
    private g.b f9351k;

    /* renamed from: l  reason: collision with root package name */
    private long f9352l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f9353m;

    public m(a aVar, b bVar, j jVar, int i10, Object obj, g gVar) {
        super(aVar, bVar, 2, jVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f9350j = gVar;
    }

    public void b() {
        f fVar;
        if (this.f9352l == 0) {
            this.f9350j.b(this.f9351k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            b e10 = this.f9308b.e(this.f9352l);
            q qVar = this.f9315i;
            fVar = new f(qVar, e10.f7705g, qVar.h(e10));
            do {
                if (this.f9353m || !this.f9350j.a(fVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f9350j.a(fVar));
            break;
            this.f9352l = fVar.getPosition() - this.f9308b.f7705g;
            m0.n(this.f9315i);
        } catch (Throwable th) {
            m0.n(this.f9315i);
            throw th;
        }
    }

    public void c() {
        this.f9353m = true;
    }

    public void g(g.b bVar) {
        this.f9351k = bVar;
    }
}
