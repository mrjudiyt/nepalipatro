package com.google.android.exoplayer2.extractor.flv;

import a6.u;
import a6.y;
import b6.a;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import e4.j;
import k4.b0;

/* compiled from: VideoTagPayloadReader */
final class d extends TagPayloadReader {

    /* renamed from: b  reason: collision with root package name */
    private final y f6649b = new y(u.f244a);

    /* renamed from: c  reason: collision with root package name */
    private final y f6650c = new y(4);

    /* renamed from: d  reason: collision with root package name */
    private int f6651d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6652e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6653f;

    /* renamed from: g  reason: collision with root package name */
    private int f6654g;

    public d(b0 b0Var) {
        super(b0Var);
    }

    /* access modifiers changed from: protected */
    public boolean b(y yVar) {
        int C = yVar.C();
        int i10 = (C >> 4) & 15;
        int i11 = C & 15;
        if (i11 == 7) {
            this.f6654g = i10;
            return i10 != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i11);
        throw new TagPayloadReader.UnsupportedFormatException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public boolean c(y yVar, long j10) {
        int C = yVar.C();
        long n10 = j10 + (((long) yVar.n()) * 1000);
        if (C == 0 && !this.f6652e) {
            y yVar2 = new y(new byte[yVar.a()]);
            yVar.j(yVar2.d(), 0, yVar.a());
            a b10 = a.b(yVar2);
            this.f6651d = b10.f5009b;
            this.f6624a.d(new j.b().e0("video/avc").I(b10.f5013f).j0(b10.f5010c).Q(b10.f5011d).a0(b10.f5012e).T(b10.f5008a).E());
            this.f6652e = true;
            return false;
        } else if (C != 1 || !this.f6652e) {
            return false;
        } else {
            int i10 = this.f6654g == 1 ? 1 : 0;
            if (!this.f6653f && i10 == 0) {
                return false;
            }
            byte[] d10 = this.f6650c.d();
            d10[0] = 0;
            d10[1] = 0;
            d10[2] = 0;
            int i11 = 4 - this.f6651d;
            int i12 = 0;
            while (yVar.a() > 0) {
                yVar.j(this.f6650c.d(), i11, this.f6651d);
                this.f6650c.O(0);
                int G = this.f6650c.G();
                this.f6649b.O(0);
                this.f6624a.a(this.f6649b, 4);
                this.f6624a.a(yVar, G);
                i12 = i12 + 4 + G;
            }
            this.f6624a.e(n10, i10, i12, 0, (b0.a) null);
            this.f6653f = true;
            return true;
        }
    }
}
