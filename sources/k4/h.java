package k4;

import a6.y;
import e4.j;
import java.io.EOFException;
import k4.b0;
import z5.g;

/* compiled from: DummyTrackOutput */
public final class h implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f9597a = new byte[4096];

    public /* synthetic */ void a(y yVar, int i10) {
        a0.b(this, yVar, i10);
    }

    public int b(g gVar, int i10, boolean z10, int i11) {
        int read = gVar.read(this.f9597a, 0, Math.min(this.f9597a.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public /* synthetic */ int c(g gVar, int i10, boolean z10) {
        return a0.a(this, gVar, i10, z10);
    }

    public void d(j jVar) {
    }

    public void e(long j10, int i10, int i11, int i12, b0.a aVar) {
    }

    public void f(y yVar, int i10, int i11) {
        yVar.P(i10);
    }
}
