package c6;

import a6.m0;
import a6.y;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import e4.a;
import e4.j;
import e4.r;
import java.nio.ByteBuffer;

/* compiled from: CameraMotionRenderer */
public final class b extends a {

    /* renamed from: t  reason: collision with root package name */
    private final DecoderInputBuffer f5269t = new DecoderInputBuffer(1);

    /* renamed from: u  reason: collision with root package name */
    private final y f5270u = new y();

    /* renamed from: v  reason: collision with root package name */
    private long f5271v;

    /* renamed from: w  reason: collision with root package name */
    private a f5272w;

    /* renamed from: x  reason: collision with root package name */
    private long f5273x;

    public b() {
        super(6);
    }

    private float[] P(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f5270u.M(byteBuffer.array(), byteBuffer.limit());
        this.f5270u.O(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f5270u.p());
        }
        return fArr;
    }

    private void Q() {
        a aVar = this.f5272w;
        if (aVar != null) {
            aVar.g();
        }
    }

    /* access modifiers changed from: protected */
    public void G() {
        Q();
    }

    /* access modifiers changed from: protected */
    public void I(long j10, boolean z10) {
        this.f5273x = Long.MIN_VALUE;
        Q();
    }

    /* access modifiers changed from: protected */
    public void M(j[] jVarArr, long j10, long j11) {
        this.f5271v = j11;
    }

    public int a(j jVar) {
        if ("application/x-camera-motion".equals(jVar.f8096s)) {
            return r.a(4);
        }
        return r.a(0);
    }

    public String b() {
        return "CameraMotionRenderer";
    }

    public boolean c() {
        return k();
    }

    public boolean e() {
        return true;
    }

    public void q(long j10, long j11) {
        while (!k() && this.f5273x < 100000 + j10) {
            this.f5269t.k();
            if (N(C(), this.f5269t, 0) == -4 && !this.f5269t.p()) {
                DecoderInputBuffer decoderInputBuffer = this.f5269t;
                this.f5273x = decoderInputBuffer.f6471l;
                if (this.f5272w != null && !decoderInputBuffer.o()) {
                    this.f5269t.u();
                    float[] P = P((ByteBuffer) m0.j(this.f5269t.f6469j));
                    if (P != null) {
                        ((a) m0.j(this.f5272w)).a(this.f5273x - this.f5271v, P);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void r(int i10, Object obj) {
        if (i10 == 7) {
            this.f5272w = (a) obj;
        } else {
            super.r(i10, obj);
        }
    }
}
