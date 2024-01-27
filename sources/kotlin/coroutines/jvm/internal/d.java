package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.m;
import r8.e;
import r8.g;

/* compiled from: ContinuationImpl.kt */
public abstract class d extends a {
    private final g _context;
    private transient r8.d<Object> intercepted;

    public d(r8.d<Object> dVar, g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public g getContext() {
        g gVar = this._context;
        m.c(gVar);
        return gVar;
    }

    public final r8.d<Object> intercepted() {
        r8.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().h(e.f16407g);
            if (eVar == null || (dVar = eVar.E(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        r8.d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            g.b h10 = getContext().h(e.f16407g);
            m.c(h10);
            ((e) h10).u(dVar);
        }
        this.intercepted = c.f15547h;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(r8.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
