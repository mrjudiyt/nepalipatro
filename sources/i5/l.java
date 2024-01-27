package i5;

import a6.m0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import e4.j;
import java.util.Arrays;

/* compiled from: DataChunk */
public abstract class l extends f {

    /* renamed from: j  reason: collision with root package name */
    private byte[] f9348j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f9349k;

    public l(a aVar, b bVar, int i10, j jVar, int i11, Object obj, byte[] bArr) {
        super(aVar, bVar, i10, jVar, i11, obj, -9223372036854775807L, -9223372036854775807L);
        l lVar;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = m0.f210f;
            lVar = this;
        } else {
            lVar = this;
            bArr2 = bArr;
        }
        lVar.f9348j = bArr2;
    }

    private void i(int i10) {
        byte[] bArr = this.f9348j;
        if (bArr.length < i10 + 16384) {
            this.f9348j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    public final void b() {
        try {
            this.f9315i.h(this.f9308b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f9349k) {
                i(i11);
                i10 = this.f9315i.read(this.f9348j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f9349k) {
                g(this.f9348j, i11);
            }
        } finally {
            m0.n(this.f9315i);
        }
    }

    public final void c() {
        this.f9349k = true;
    }

    /* access modifiers changed from: protected */
    public abstract void g(byte[] bArr, int i10);

    public byte[] h() {
        return this.f9348j;
    }
}
