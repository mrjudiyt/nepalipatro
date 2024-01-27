package i1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import i1.m;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* compiled from: FragmentTransitionSupport */
public class e extends z {

    /* compiled from: FragmentTransitionSupport */
    class a extends m.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f9116a;

        a(Rect rect) {
            this.f9116a = rect;
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class b implements m.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f9118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f9119b;

        b(View view, ArrayList arrayList) {
            this.f9118a = view;
            this.f9119b = arrayList;
        }

        public void a(m mVar) {
        }

        public void b(m mVar) {
            mVar.R(this);
            this.f9118a.setVisibility(8);
            int size = this.f9119b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f9119b.get(i10)).setVisibility(0);
            }
        }

        public void c(m mVar) {
        }

        public void d(m mVar) {
            mVar.R(this);
            mVar.a(this);
        }

        public void e(m mVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class c extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f9121a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f9122b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f9123c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f9124d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f9125e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f9126f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f9121a = obj;
            this.f9122b = arrayList;
            this.f9123c = obj2;
            this.f9124d = arrayList2;
            this.f9125e = obj3;
            this.f9126f = arrayList3;
        }

        public void b(m mVar) {
            mVar.R(this);
        }

        public void d(m mVar) {
            Object obj = this.f9121a;
            if (obj != null) {
                e.this.q(obj, this.f9122b, (ArrayList<View>) null);
            }
            Object obj2 = this.f9123c;
            if (obj2 != null) {
                e.this.q(obj2, this.f9124d, (ArrayList<View>) null);
            }
            Object obj3 = this.f9125e;
            if (obj3 != null) {
                e.this.q(obj3, this.f9126f, (ArrayList<View>) null);
            }
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class d implements f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f9128a;

        d(m mVar) {
            this.f9128a = mVar;
        }

        public void onCancel() {
            this.f9128a.f();
        }
    }

    /* renamed from: i1.e$e  reason: collision with other inner class name */
    /* compiled from: FragmentTransitionSupport */
    class C0151e implements m.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f9130a;

        C0151e(Runnable runnable) {
            this.f9130a = runnable;
        }

        public void a(m mVar) {
        }

        public void b(m mVar) {
            this.f9130a.run();
        }

        public void c(m mVar) {
        }

        public void d(m mVar) {
        }

        public void e(m mVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class f extends m.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f9132a;

        f(Rect rect) {
            this.f9132a = rect;
        }
    }

    private static boolean C(m mVar) {
        return !z.l(mVar.B()) || !z.l(mVar.C()) || !z.l(mVar.D());
    }

    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.E().clear();
            qVar.E().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.g0((m) obj);
        return qVar;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).b(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar != null) {
            int i10 = 0;
            if (mVar instanceof q) {
                q qVar = (q) mVar;
                int j02 = qVar.j0();
                while (i10 < j02) {
                    b(qVar.i0(i10), arrayList);
                    i10++;
                }
            } else if (!C(mVar) && z.l(mVar.E())) {
                int size = arrayList.size();
                while (i10 < size) {
                    mVar.b(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof m;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new q().g0(mVar).g0(mVar2).o0(1);
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        q qVar = new q();
        if (mVar != null) {
            qVar.g0(mVar);
        }
        qVar.g0(mVar3);
        return qVar;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.g0((m) obj);
        }
        if (obj2 != null) {
            qVar.g0((m) obj2);
        }
        if (obj3 != null) {
            qVar.g0((m) obj3);
        }
        return qVar;
    }

    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).S(view);
        }
    }

    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i10;
        m mVar = (m) obj;
        int i11 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int j02 = qVar.j0();
            while (i11 < j02) {
                q(qVar.i0(i11), arrayList, arrayList2);
                i11++;
            }
        } else if (!C(mVar)) {
            List<View> E = mVar.E();
            if (E.size() == arrayList.size() && E.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i10 = 0;
                } else {
                    i10 = arrayList2.size();
                }
                while (i11 < i10) {
                    mVar.b(arrayList2.get(i11));
                    i11++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mVar.S(arrayList.get(size));
                }
            }
        }
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).a(new b(view, arrayList));
    }

    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).X(new f(rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).X(new a(rect));
        }
    }

    public void w(Fragment fragment, Object obj, androidx.core.os.f fVar, Runnable runnable) {
        m mVar = (m) obj;
        fVar.c(new d(mVar));
        mVar.a(new C0151e(runnable));
    }

    public void z(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> E = qVar.E();
        E.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z.d(E, arrayList.get(i10));
        }
        E.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }
}
