package a7;

import b7.a;

/* compiled from: SimpleToken */
final class e extends g {

    /* renamed from: c  reason: collision with root package name */
    private final short f13279c;

    /* renamed from: d  reason: collision with root package name */
    private final short f13280d;

    e(g gVar, int i10, int i11) {
        super(gVar);
        this.f13279c = (short) i10;
        this.f13280d = (short) i11;
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar, byte[] bArr) {
        aVar.c(this.f13279c, this.f13280d);
    }

    public String toString() {
        short s10 = this.f13279c;
        short s11 = this.f13280d;
        short s12 = (s10 & ((1 << s11) - 1)) | (1 << s11);
        return "<" + Integer.toBinaryString(s12 | (1 << this.f13280d)).substring(1) + '>';
    }
}
