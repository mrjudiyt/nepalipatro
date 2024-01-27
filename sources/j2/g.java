package j2;

import android.annotation.SuppressLint;
import e2.e;
import h2.c;
import j2.h;

/* compiled from: LruResourceCache */
public class g extends a3.g<e, c<?>> implements h {

    /* renamed from: e  reason: collision with root package name */
    private h.a f9415e;

    public g(long j10) {
        super(j10);
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    public void c(h.a aVar) {
        this.f9415e = aVar;
    }

    public /* bridge */ /* synthetic */ c d(e eVar) {
        return (c) super.l(eVar);
    }

    public /* bridge */ /* synthetic */ c e(e eVar, c cVar) {
        return (c) super.k(eVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int i(c<?> cVar) {
        if (cVar == null) {
            return super.i(null);
        }
        return cVar.b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void j(e eVar, c<?> cVar) {
        h.a aVar = this.f9415e;
        if (aVar != null && cVar != null) {
            aVar.d(cVar);
        }
    }
}
