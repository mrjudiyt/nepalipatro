package k4;

import a6.y;
import c5.h;
import java.io.EOFException;
import x4.a;

/* compiled from: Id3Peeker */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final y f9622a = new y(10);

    public a a(j jVar, h.a aVar) {
        a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                jVar.o(this.f9622a.d(), 0, 10);
                this.f9622a.O(0);
                if (this.f9622a.F() != 4801587) {
                    break;
                }
                this.f9622a.P(3);
                int B = this.f9622a.B();
                int i11 = B + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f9622a.d(), 0, bArr, 0, 10);
                    jVar.o(bArr, 10, B);
                    aVar2 = new h(aVar).e(bArr, i11);
                } else {
                    jVar.f(B);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        jVar.k();
        jVar.f(i10);
        return aVar2;
    }
}
