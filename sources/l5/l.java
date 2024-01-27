package l5;

import a6.a;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import e4.k;
import g5.t;

/* compiled from: HlsSampleStream */
final class l implements t {

    /* renamed from: h  reason: collision with root package name */
    private final int f10062h;

    /* renamed from: i  reason: collision with root package name */
    private final p f10063i;

    /* renamed from: j  reason: collision with root package name */
    private int f10064j = -1;

    public l(p pVar, int i10) {
        this.f10063i = pVar;
        this.f10062h = i10;
    }

    private boolean c() {
        int i10 = this.f10064j;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void a() {
        int i10 = this.f10064j;
        if (i10 == -2) {
            throw new SampleQueueMappingException(this.f10063i.r().b(this.f10062h).b(0).f8096s);
        } else if (i10 == -1) {
            this.f10063i.T();
        } else if (i10 != -3) {
            this.f10063i.U(i10);
        }
    }

    public void b() {
        a.a(this.f10064j == -1);
        this.f10064j = this.f10063i.y(this.f10062h);
    }

    public void d() {
        if (this.f10064j != -1) {
            this.f10063i.o0(this.f10062h);
            this.f10064j = -1;
        }
    }

    public boolean e() {
        return this.f10064j == -3 || (c() && this.f10063i.Q(this.f10064j));
    }

    public int i(k kVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        if (this.f10064j == -3) {
            decoderInputBuffer.g(4);
            return -4;
        } else if (c()) {
            return this.f10063i.d0(this.f10064j, kVar, decoderInputBuffer, i10);
        } else {
            return -3;
        }
    }

    public int o(long j10) {
        if (c()) {
            return this.f10063i.n0(this.f10064j, j10);
        }
        return 0;
    }
}
