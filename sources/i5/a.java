package i5;

import com.google.android.exoplayer2.upstream.b;
import e4.j;

/* compiled from: BaseMediaChunk */
public abstract class a extends n {

    /* renamed from: k  reason: collision with root package name */
    public final long f9280k;

    /* renamed from: l  reason: collision with root package name */
    public final long f9281l;

    /* renamed from: m  reason: collision with root package name */
    private c f9282m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f9283n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.google.android.exoplayer2.upstream.a aVar, b bVar, j jVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(aVar, bVar, jVar, i10, obj, j10, j11, j14);
        this.f9280k = j12;
        this.f9281l = j13;
    }

    public final int i(int i10) {
        return ((int[]) a6.a.h(this.f9283n))[i10];
    }

    /* access modifiers changed from: protected */
    public final c j() {
        return (c) a6.a.h(this.f9282m);
    }

    public void k(c cVar) {
        this.f9282m = cVar;
        this.f9283n = cVar.a();
    }
}
