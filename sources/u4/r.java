package u4;

import a6.a;
import a6.p;
import a6.y;
import e4.j;
import k4.b0;
import k4.k;
import u4.i0;

/* compiled from: Id3Reader */
public final class r implements m {

    /* renamed from: a  reason: collision with root package name */
    private final y f12026a = new y(10);

    /* renamed from: b  reason: collision with root package name */
    private b0 f12027b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12028c;

    /* renamed from: d  reason: collision with root package name */
    private long f12029d;

    /* renamed from: e  reason: collision with root package name */
    private int f12030e;

    /* renamed from: f  reason: collision with root package name */
    private int f12031f;

    public void a(y yVar) {
        a.h(this.f12027b);
        if (this.f12028c) {
            int a10 = yVar.a();
            int i10 = this.f12031f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(yVar.d(), yVar.e(), this.f12026a.d(), this.f12031f, min);
                if (this.f12031f + min == 10) {
                    this.f12026a.O(0);
                    if (73 == this.f12026a.C() && 68 == this.f12026a.C() && 51 == this.f12026a.C()) {
                        this.f12026a.P(3);
                        this.f12030e = this.f12026a.B() + 10;
                    } else {
                        p.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f12028c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f12030e - this.f12031f);
            this.f12027b.a(yVar, min2);
            this.f12031f += min2;
        }
    }

    public void b() {
        this.f12028c = false;
    }

    public void c() {
        int i10;
        a.h(this.f12027b);
        if (this.f12028c && (i10 = this.f12030e) != 0 && this.f12031f == i10) {
            this.f12027b.e(this.f12029d, 1, i10, 0, (b0.a) null);
            this.f12028c = false;
        }
    }

    public void d(k kVar, i0.d dVar) {
        dVar.a();
        b0 e10 = kVar.e(dVar.c(), 5);
        this.f12027b = e10;
        e10.d(new j.b().S(dVar.b()).e0("application/id3").E());
    }

    public void e(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f12028c = true;
            this.f12029d = j10;
            this.f12030e = 0;
            this.f12031f = 0;
        }
    }
}
