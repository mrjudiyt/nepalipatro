package y7;

import ea.g;
import v7.p;
import v7.s;
import v7.y;

/* compiled from: RealResponseBody */
public final class l extends y {

    /* renamed from: h  reason: collision with root package name */
    private final p f17426h;

    /* renamed from: i  reason: collision with root package name */
    private final g f17427i;

    public l(p pVar, g gVar) {
        this.f17426h = pVar;
        this.f17427i = gVar;
    }

    public long j() {
        return k.c(this.f17426h);
    }

    public s q() {
        String a10 = this.f17426h.a("Content-Type");
        if (a10 != null) {
            return s.c(a10);
        }
        return null;
    }

    public g u() {
        return this.f17427i;
    }
}
