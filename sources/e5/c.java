package e5;

import a6.i0;
import a6.x;
import a6.y;
import java.nio.ByteBuffer;
import x4.a;
import x4.e;
import x4.h;

/* compiled from: SpliceInfoDecoder */
public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final y f8149a = new y();

    /* renamed from: b  reason: collision with root package name */
    private final x f8150b = new x();

    /* renamed from: c  reason: collision with root package name */
    private i0 f8151c;

    /* access modifiers changed from: protected */
    public a b(e eVar, ByteBuffer byteBuffer) {
        i0 i0Var = this.f8151c;
        if (i0Var == null || eVar.f12771p != i0Var.e()) {
            i0 i0Var2 = new i0(eVar.f6471l);
            this.f8151c = i0Var2;
            i0Var2.a(eVar.f6471l - eVar.f12771p);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f8149a.M(array, limit);
        this.f8150b.o(array, limit);
        this.f8150b.r(39);
        long h10 = (((long) this.f8150b.h(1)) << 32) | ((long) this.f8150b.h(32));
        this.f8150b.r(20);
        int h11 = this.f8150b.h(12);
        int h12 = this.f8150b.h(8);
        a.b bVar = null;
        this.f8149a.P(14);
        if (h12 == 0) {
            bVar = new e();
        } else if (h12 == 255) {
            bVar = a.b(this.f8149a, h11, h10);
        } else if (h12 == 4) {
            bVar = f.b(this.f8149a);
        } else if (h12 == 5) {
            bVar = d.b(this.f8149a, h10, this.f8151c);
        } else if (h12 == 6) {
            bVar = g.b(this.f8149a, h10, this.f8151c);
        }
        if (bVar == null) {
            return new a(new a.b[0]);
        }
        return new a(bVar);
    }
}
