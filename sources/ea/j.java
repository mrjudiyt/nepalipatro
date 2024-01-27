package ea;

import kotlin.jvm.internal.m;

/* compiled from: ForwardingSource.kt */
public abstract class j implements z {

    /* renamed from: h  reason: collision with root package name */
    private final z f14371h;

    public j(z zVar) {
        m.g(zVar, "delegate");
        this.f14371h = zVar;
    }

    public long S(e eVar, long j10) {
        m.g(eVar, "sink");
        return this.f14371h.S(eVar, j10);
    }

    public void close() {
        this.f14371h.close();
    }

    public a0 d() {
        return this.f14371h.d();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f14371h + ')';
    }
}
