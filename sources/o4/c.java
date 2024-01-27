package o4;

import a6.a;
import k4.j;
import k4.t;

/* compiled from: StartOffsetExtractorInput */
final class c extends t {

    /* renamed from: b  reason: collision with root package name */
    private final long f10386b;

    public c(j jVar, long j10) {
        super(jVar);
        a.a(jVar.getPosition() >= j10);
        this.f10386b = j10;
    }

    public long a() {
        return super.a() - this.f10386b;
    }

    public long e() {
        return super.e() - this.f10386b;
    }

    public long getPosition() {
        return super.getPosition() - this.f10386b;
    }
}
