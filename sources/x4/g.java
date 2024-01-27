package x4;

import a6.m0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import e4.a;
import e4.j;
import e4.k;
import e4.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import x4.a;

/* compiled from: MetadataRenderer */
public final class g extends a implements Handler.Callback {
    private long A;
    private long B;
    private a C;

    /* renamed from: t  reason: collision with root package name */
    private final d f12772t;

    /* renamed from: u  reason: collision with root package name */
    private final f f12773u;

    /* renamed from: v  reason: collision with root package name */
    private final Handler f12774v;

    /* renamed from: w  reason: collision with root package name */
    private final e f12775w;

    /* renamed from: x  reason: collision with root package name */
    private c f12776x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f12777y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f12778z;

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f12770a);
    }

    private void P(a aVar, List<a.b> list) {
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            j u10 = aVar.d(i10).u();
            if (u10 == null || !this.f12772t.a(u10)) {
                list.add(aVar.d(i10));
            } else {
                c b10 = this.f12772t.b(u10);
                byte[] bArr = (byte[]) a6.a.e(aVar.d(i10).W());
                this.f12775w.k();
                this.f12775w.t(bArr.length);
                ((ByteBuffer) m0.j(this.f12775w.f6469j)).put(bArr);
                this.f12775w.u();
                a a10 = b10.a(this.f12775w);
                if (a10 != null) {
                    P(a10, list);
                }
            }
        }
    }

    private void Q(a aVar) {
        Handler handler = this.f12774v;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            R(aVar);
        }
    }

    private void R(a aVar) {
        this.f12773u.p(aVar);
    }

    private boolean S(long j10) {
        boolean z10;
        a aVar = this.C;
        if (aVar == null || this.B > j10) {
            z10 = false;
        } else {
            Q(aVar);
            this.C = null;
            this.B = -9223372036854775807L;
            z10 = true;
        }
        if (this.f12777y && this.C == null) {
            this.f12778z = true;
        }
        return z10;
    }

    private void T() {
        if (!this.f12777y && this.C == null) {
            this.f12775w.k();
            k C2 = C();
            int N = N(C2, this.f12775w, 0);
            if (N == -4) {
                if (this.f12775w.p()) {
                    this.f12777y = true;
                    return;
                }
                e eVar = this.f12775w;
                eVar.f12771p = this.A;
                eVar.u();
                a a10 = ((c) m0.j(this.f12776x)).a(this.f12775w);
                if (a10 != null) {
                    ArrayList arrayList = new ArrayList(a10.e());
                    P(a10, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.C = new a((List<? extends a.b>) arrayList);
                        this.B = this.f12775w.f6471l;
                    }
                }
            } else if (N == -5) {
                this.A = ((j) a6.a.e(C2.f8131b)).f8100w;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void G() {
        this.C = null;
        this.B = -9223372036854775807L;
        this.f12776x = null;
    }

    /* access modifiers changed from: protected */
    public void I(long j10, boolean z10) {
        this.C = null;
        this.B = -9223372036854775807L;
        this.f12777y = false;
        this.f12778z = false;
    }

    /* access modifiers changed from: protected */
    public void M(j[] jVarArr, long j10, long j11) {
        this.f12776x = this.f12772t.b(jVarArr[0]);
    }

    public int a(j jVar) {
        if (!this.f12772t.a(jVar)) {
            return r.a(0);
        }
        return r.a(jVar.L == null ? 4 : 2);
    }

    public String b() {
        return "MetadataRenderer";
    }

    public boolean c() {
        return this.f12778z;
    }

    public boolean e() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            R((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public void q(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            T();
            z10 = S(j10);
        }
    }

    public g(f fVar, Looper looper, d dVar) {
        super(5);
        Handler handler;
        this.f12773u = (f) a6.a.e(fVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = m0.w(looper, this);
        }
        this.f12774v = handler;
        this.f12772t = (d) a6.a.e(dVar);
        this.f12775w = new e();
        this.B = -9223372036854775807L;
    }
}
