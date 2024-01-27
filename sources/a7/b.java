package a7;

import b7.a;

/* compiled from: BinaryShiftToken */
final class b extends g {

    /* renamed from: c  reason: collision with root package name */
    private final short f13270c;

    /* renamed from: d  reason: collision with root package name */
    private final short f13271d;

    b(g gVar, int i10, int i11) {
        super(gVar);
        this.f13270c = (short) i10;
        this.f13271d = (short) i11;
    }

    public void c(a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s10 = this.f13271d;
            if (i10 < s10) {
                if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                    aVar.c(31, 5);
                    short s11 = this.f13271d;
                    if (s11 > 62) {
                        aVar.c(s11 - 31, 16);
                    } else if (i10 == 0) {
                        aVar.c(Math.min(s11, 31), 5);
                    } else {
                        aVar.c(s11 - 31, 5);
                    }
                }
                aVar.c(bArr[this.f13270c + i10], 8);
                i10++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f13270c);
        sb.append("::");
        sb.append((this.f13270c + this.f13271d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
