package i5;

import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import e4.j;

/* compiled from: MediaChunk */
public abstract class n extends f {

    /* renamed from: j  reason: collision with root package name */
    public final long f9354j;

    public n(a aVar, b bVar, j jVar, int i10, Object obj, long j10, long j11, long j12) {
        super(aVar, bVar, 1, jVar, i10, obj, j10, j11);
        a6.a.e(jVar);
        this.f9354j = j12;
    }

    public long g() {
        long j10 = this.f9354j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1;
    }

    public abstract boolean h();
}
