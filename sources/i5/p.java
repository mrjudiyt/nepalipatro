package i5;

import a6.m0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.gms.common.api.Api;
import e4.j;
import k4.b0;
import k4.f;

/* compiled from: SingleSampleMediaChunk */
public final class p extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f9356o;

    /* renamed from: p  reason: collision with root package name */
    private final j f9357p;

    /* renamed from: q  reason: collision with root package name */
    private long f9358q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f9359r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(a aVar, b bVar, j jVar, int i10, Object obj, long j10, long j11, long j12, int i11, j jVar2) {
        super(aVar, bVar, jVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f9356o = i11;
        this.f9357p = jVar2;
    }

    /* JADX INFO: finally extract failed */
    public void b() {
        c j10 = j();
        j10.b(0);
        b0 e10 = j10.e(0, this.f9356o);
        e10.d(this.f9357p);
        try {
            long h10 = this.f9315i.h(this.f9308b.e(this.f9358q));
            if (h10 != -1) {
                h10 += this.f9358q;
            }
            f fVar = new f(this.f9315i, this.f9358q, h10);
            for (int i10 = 0; i10 != -1; i10 = e10.c(fVar, Api.BaseClientBuilder.API_PRIORITY_OTHER, true)) {
                this.f9358q += (long) i10;
            }
            e10.e(this.f9313g, 1, (int) this.f9358q, 0, (b0.a) null);
            m0.n(this.f9315i);
            this.f9359r = true;
        } catch (Throwable th) {
            m0.n(this.f9315i);
            throw th;
        }
    }

    public void c() {
    }

    public boolean h() {
        return this.f9359r;
    }
}
