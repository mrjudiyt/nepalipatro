package y5;

import a6.m0;
import e4.t;

/* compiled from: TrackSelectorResult */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final int f13098a;

    /* renamed from: b  reason: collision with root package name */
    public final t[] f13099b;

    /* renamed from: c  reason: collision with root package name */
    public final h[] f13100c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13101d;

    public p(t[] tVarArr, h[] hVarArr, Object obj) {
        this.f13099b = tVarArr;
        this.f13100c = (h[]) hVarArr.clone();
        this.f13101d = obj;
        this.f13098a = tVarArr.length;
    }

    public boolean a(p pVar) {
        if (pVar == null || pVar.f13100c.length != this.f13100c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f13100c.length; i10++) {
            if (!b(pVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(p pVar, int i10) {
        if (pVar != null && m0.c(this.f13099b[i10], pVar.f13099b[i10]) && m0.c(this.f13100c[i10], pVar.f13100c[i10])) {
            return true;
        }
        return false;
    }

    public boolean c(int i10) {
        return this.f13099b[i10] != null;
    }
}
