package i1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import i1.m;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet */
public class q extends m {
    private ArrayList<m> Q = new ArrayList<>();
    private boolean R = true;
    int S;
    boolean T = false;
    private int U = 0;

    /* compiled from: TransitionSet */
    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f9203a;

        a(m mVar) {
            this.f9203a = mVar;
        }

        public void b(m mVar) {
            this.f9203a.V();
            mVar.R(this);
        }
    }

    /* compiled from: TransitionSet */
    static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        q f9205a;

        b(q qVar) {
            this.f9205a = qVar;
        }

        public void b(m mVar) {
            q qVar = this.f9205a;
            int i10 = qVar.S - 1;
            qVar.S = i10;
            if (i10 == 0) {
                qVar.T = false;
                qVar.r();
            }
            mVar.R(this);
        }

        public void d(m mVar) {
            q qVar = this.f9205a;
            if (!qVar.T) {
                qVar.c0();
                this.f9205a.T = true;
            }
        }
    }

    private void h0(m mVar) {
        this.Q.add(mVar);
        mVar.f9186y = this;
    }

    private void q0() {
        b bVar = new b(this);
        Iterator<m> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.S = this.Q.size();
    }

    public void P(View view) {
        super.P(view);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).P(view);
        }
    }

    public void T(View view) {
        super.T(view);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).T(view);
        }
    }

    /* access modifiers changed from: protected */
    public void V() {
        if (this.Q.isEmpty()) {
            c0();
            r();
            return;
        }
        q0();
        if (!this.R) {
            for (int i10 = 1; i10 < this.Q.size(); i10++) {
                this.Q.get(i10 - 1).a(new a(this.Q.get(i10)));
            }
            m mVar = this.Q.get(0);
            if (mVar != null) {
                mVar.V();
                return;
            }
            return;
        }
        Iterator<m> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().V();
        }
    }

    public void X(m.e eVar) {
        super.X(eVar);
        this.U |= 8;
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).X(eVar);
        }
    }

    public void Z(g gVar) {
        super.Z(gVar);
        this.U |= 4;
        if (this.Q != null) {
            for (int i10 = 0; i10 < this.Q.size(); i10++) {
                this.Q.get(i10).Z(gVar);
            }
        }
    }

    public void a0(p pVar) {
        super.a0(pVar);
        this.U |= 2;
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).a0(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    public String d0(String str) {
        String d02 = super.d0(str);
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            StringBuilder sb = new StringBuilder();
            sb.append(d02);
            sb.append("\n");
            sb.append(this.Q.get(i10).d0(str + "  "));
            d02 = sb.toString();
        }
        return d02;
    }

    /* renamed from: e0 */
    public q a(m.f fVar) {
        return (q) super.a(fVar);
    }

    /* access modifiers changed from: protected */
    public void f() {
        super.f();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).f();
        }
    }

    /* renamed from: f0 */
    public q b(View view) {
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            this.Q.get(i10).b(view);
        }
        return (q) super.b(view);
    }

    public void g(s sVar) {
        if (I(sVar.f9210b)) {
            Iterator<m> it = this.Q.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.I(sVar.f9210b)) {
                    next.g(sVar);
                    sVar.f9211c.add(next);
                }
            }
        }
    }

    public q g0(m mVar) {
        h0(mVar);
        long j10 = this.f9171j;
        if (j10 >= 0) {
            mVar.W(j10);
        }
        if ((this.U & 1) != 0) {
            mVar.Y(u());
        }
        if ((this.U & 2) != 0) {
            mVar.a0(y());
        }
        if ((this.U & 4) != 0) {
            mVar.Z(x());
        }
        if ((this.U & 8) != 0) {
            mVar.X(t());
        }
        return this;
    }

    public m i0(int i10) {
        if (i10 < 0 || i10 >= this.Q.size()) {
            return null;
        }
        return this.Q.get(i10);
    }

    public int j0() {
        return this.Q.size();
    }

    /* access modifiers changed from: package-private */
    public void k(s sVar) {
        super.k(sVar);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).k(sVar);
        }
    }

    /* renamed from: k0 */
    public q R(m.f fVar) {
        return (q) super.R(fVar);
    }

    public void l(s sVar) {
        if (I(sVar.f9210b)) {
            Iterator<m> it = this.Q.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.I(sVar.f9210b)) {
                    next.l(sVar);
                    sVar.f9211c.add(next);
                }
            }
        }
    }

    /* renamed from: l0 */
    public q S(View view) {
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            this.Q.get(i10).S(view);
        }
        return (q) super.S(view);
    }

    /* renamed from: m0 */
    public q W(long j10) {
        ArrayList<m> arrayList;
        super.W(j10);
        if (this.f9171j >= 0 && (arrayList = this.Q) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Q.get(i10).W(j10);
            }
        }
        return this;
    }

    /* renamed from: n0 */
    public q Y(TimeInterpolator timeInterpolator) {
        this.U |= 1;
        ArrayList<m> arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Q.get(i10).Y(timeInterpolator);
            }
        }
        return (q) super.Y(timeInterpolator);
    }

    /* renamed from: o */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.Q = new ArrayList<>();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            qVar.h0(this.Q.get(i10).clone());
        }
        return qVar;
    }

    public q o0(int i10) {
        if (i10 == 0) {
            this.R = true;
        } else if (i10 == 1) {
            this.R = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        }
        return this;
    }

    /* renamed from: p0 */
    public q b0(long j10) {
        return (q) super.b0(j10);
    }

    /* access modifiers changed from: protected */
    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long A = A();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.Q.get(i10);
            if (A > 0 && (this.R || i10 == 0)) {
                long A2 = mVar.A();
                if (A2 > 0) {
                    mVar.b0(A2 + A);
                } else {
                    mVar.b0(A);
                }
            }
            mVar.q(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
