package q5;

import a6.y;
import java.util.List;
import o5.c;
import o5.e;

/* compiled from: DvbDecoder */
public final class a extends c {

    /* renamed from: o  reason: collision with root package name */
    private final b f10723o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        y yVar = new y(list.get(0));
        this.f10723o = new b(yVar.I(), yVar.I());
    }

    /* access modifiers changed from: protected */
    public e A(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f10723o.r();
        }
        return new c(this.f10723o.b(bArr, i10));
    }
}
