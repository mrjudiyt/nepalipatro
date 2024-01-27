package z5;

import a6.m0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: BaseDataSource */
public abstract class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13202a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<r> f13203b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    private int f13204c;

    /* renamed from: d  reason: collision with root package name */
    private b f13205d;

    protected f(boolean z10) {
        this.f13202a = z10;
    }

    public final void c(r rVar) {
        a6.a.e(rVar);
        if (!this.f13203b.contains(rVar)) {
            this.f13203b.add(rVar);
            this.f13204c++;
        }
    }

    public /* synthetic */ Map j() {
        return i.a(this);
    }

    /* access modifiers changed from: protected */
    public final void p(int i10) {
        b bVar = (b) m0.j(this.f13205d);
        for (int i11 = 0; i11 < this.f13204c; i11++) {
            this.f13203b.get(i11).h(this, bVar, this.f13202a, i10);
        }
    }

    /* access modifiers changed from: protected */
    public final void q() {
        b bVar = (b) m0.j(this.f13205d);
        for (int i10 = 0; i10 < this.f13204c; i10++) {
            this.f13203b.get(i10).b(this, bVar, this.f13202a);
        }
        this.f13205d = null;
    }

    /* access modifiers changed from: protected */
    public final void r(b bVar) {
        for (int i10 = 0; i10 < this.f13204c; i10++) {
            this.f13203b.get(i10).i(this, bVar, this.f13202a);
        }
    }

    /* access modifiers changed from: protected */
    public final void s(b bVar) {
        this.f13205d = bVar;
        for (int i10 = 0; i10 < this.f13204c; i10++) {
            this.f13203b.get(i10).c(this, bVar, this.f13202a);
        }
    }
}
