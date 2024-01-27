package i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.collection.h;
import androidx.core.view.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Transition */
public abstract class m implements Cloneable {
    private static final int[] N = {2, 1, 3, 4};
    private static final g O = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> P = new ThreadLocal<>();
    private ArrayList<s> A;
    private ArrayList<s> B;
    boolean C = false;
    ArrayList<Animator> D = new ArrayList<>();
    private int E = 0;
    private boolean F = false;
    private boolean G = false;
    private ArrayList<f> H = null;
    private ArrayList<Animator> I = new ArrayList<>();
    p J;
    private e K;
    private androidx.collection.a<String, String> L;
    private g M = O;

    /* renamed from: h  reason: collision with root package name */
    private String f9169h = getClass().getName();

    /* renamed from: i  reason: collision with root package name */
    private long f9170i = -1;

    /* renamed from: j  reason: collision with root package name */
    long f9171j = -1;

    /* renamed from: k  reason: collision with root package name */
    private TimeInterpolator f9172k = null;

    /* renamed from: l  reason: collision with root package name */
    ArrayList<Integer> f9173l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    ArrayList<View> f9174m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<String> f9175n = null;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<Class<?>> f9176o = null;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList<Integer> f9177p = null;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<View> f9178q = null;

    /* renamed from: r  reason: collision with root package name */
    private ArrayList<Class<?>> f9179r = null;

    /* renamed from: s  reason: collision with root package name */
    private ArrayList<String> f9180s = null;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<Integer> f9181t = null;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<View> f9182u = null;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<Class<?>> f9183v = null;

    /* renamed from: w  reason: collision with root package name */
    private t f9184w = new t();

    /* renamed from: x  reason: collision with root package name */
    private t f9185x = new t();

    /* renamed from: y  reason: collision with root package name */
    q f9186y = null;

    /* renamed from: z  reason: collision with root package name */
    private int[] f9187z = N;

    /* compiled from: Transition */
    class a extends g {
        a() {
        }

        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* compiled from: Transition */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f9188a;

        b(androidx.collection.a aVar) {
            this.f9188a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f9188a.remove(animator);
            m.this.D.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            m.this.D.add(animator);
        }
    }

    /* compiled from: Transition */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            m.this.r();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        View f9191a;

        /* renamed from: b  reason: collision with root package name */
        String f9192b;

        /* renamed from: c  reason: collision with root package name */
        s f9193c;

        /* renamed from: d  reason: collision with root package name */
        m0 f9194d;

        /* renamed from: e  reason: collision with root package name */
        m f9195e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.f9191a = view;
            this.f9192b = str;
            this.f9193c = sVar;
            this.f9194d = m0Var;
            this.f9195e = mVar;
        }
    }

    /* compiled from: Transition */
    public static abstract class e {
    }

    /* compiled from: Transition */
    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private static boolean J(s sVar, s sVar2, String str) {
        Object obj = sVar.f9209a.get(str);
        Object obj2 = sVar2.f9209a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void K(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && I(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && I(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.A.add(sVar);
                    this.B.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void L(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i10 = aVar.i(size);
            if (i10 != null && I(i10) && (remove = aVar2.remove(i10)) != null && I(remove.f9210b)) {
                this.A.add(aVar.k(size));
                this.B.add(remove);
            }
        }
    }

    private void M(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.e<View> eVar, androidx.collection.e<View> eVar2) {
        View e10;
        int n10 = eVar.n();
        for (int i10 = 0; i10 < n10; i10++) {
            View o10 = eVar.o(i10);
            if (o10 != null && I(o10) && (e10 = eVar2.e(eVar.i(i10))) != null && I(e10)) {
                s sVar = aVar.get(o10);
                s sVar2 = aVar2.get(e10);
                if (!(sVar == null || sVar2 == null)) {
                    this.A.add(sVar);
                    this.B.add(sVar2);
                    aVar.remove(o10);
                    aVar2.remove(e10);
                }
            }
        }
    }

    private void N(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View m10 = aVar3.m(i10);
            if (m10 != null && I(m10) && (view = aVar4.get(aVar3.i(i10))) != null && I(view)) {
                s sVar = aVar.get(m10);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.A.add(sVar);
                    this.B.add(sVar2);
                    aVar.remove(m10);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void O(t tVar, t tVar2) {
        androidx.collection.a aVar = new androidx.collection.a((h) tVar.f9212a);
        androidx.collection.a aVar2 = new androidx.collection.a((h) tVar2.f9212a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f9187z;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    L(aVar, aVar2);
                } else if (i11 == 2) {
                    N(aVar, aVar2, tVar.f9215d, tVar2.f9215d);
                } else if (i11 == 3) {
                    K(aVar, aVar2, tVar.f9213b, tVar2.f9213b);
                } else if (i11 == 4) {
                    M(aVar, aVar2, tVar.f9214c, tVar2.f9214c);
                }
                i10++;
            } else {
                c(aVar, aVar2);
                return;
            }
        }
    }

    private void U(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            e(animator);
        }
    }

    private void c(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            s m10 = aVar.m(i10);
            if (I(m10.f9210b)) {
                this.A.add(m10);
                this.B.add((Object) null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            s m11 = aVar2.m(i11);
            if (I(m11.f9210b)) {
                this.B.add(m11);
                this.A.add((Object) null);
            }
        }
    }

    private static void d(t tVar, View view, s sVar) {
        tVar.f9212a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f9213b.indexOfKey(id) >= 0) {
                tVar.f9213b.put(id, (Object) null);
            } else {
                tVar.f9213b.put(id, view);
            }
        }
        String y10 = z.y(view);
        if (y10 != null) {
            if (tVar.f9215d.containsKey(y10)) {
                tVar.f9215d.put(y10, null);
            } else {
                tVar.f9215d.put(y10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f9214c.g(itemIdAtPosition) >= 0) {
                    View e10 = tVar.f9214c.e(itemIdAtPosition);
                    if (e10 != null) {
                        z.Y(e10, false);
                        tVar.f9214c.k(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                z.Y(view, true);
                tVar.f9214c.k(itemIdAtPosition, view);
            }
        }
    }

    private void i(View view, boolean z10) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f9177p;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f9178q;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f9179r;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            if (!this.f9179r.get(i10).isInstance(view)) {
                                i10++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        s sVar = new s(view);
                        if (z10) {
                            l(sVar);
                        } else {
                            g(sVar);
                        }
                        sVar.f9211c.add(this);
                        k(sVar);
                        if (z10) {
                            d(this.f9184w, view, sVar);
                        } else {
                            d(this.f9185x, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f9181t;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f9182u;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f9183v;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        if (!this.f9183v.get(i11).isInstance(view)) {
                                            i11++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                    i(viewGroup.getChildAt(i12), z10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static androidx.collection.a<Animator, d> z() {
        androidx.collection.a<Animator, d> aVar = P.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
        P.set(aVar2);
        return aVar2;
    }

    public long A() {
        return this.f9170i;
    }

    public List<Integer> B() {
        return this.f9173l;
    }

    public List<String> C() {
        return this.f9175n;
    }

    public List<Class<?>> D() {
        return this.f9176o;
    }

    public List<View> E() {
        return this.f9174m;
    }

    public String[] F() {
        return null;
    }

    public s G(View view, boolean z10) {
        q qVar = this.f9186y;
        if (qVar != null) {
            return qVar.G(view, z10);
        }
        return (z10 ? this.f9184w : this.f9185x).f9212a.get(view);
    }

    public boolean H(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] F2 = F();
        if (F2 != null) {
            int length = F2.length;
            int i10 = 0;
            while (i10 < length) {
                if (!J(sVar, sVar2, F2[i10])) {
                    i10++;
                }
            }
            return false;
        }
        for (String J2 : sVar.f9209a.keySet()) {
            if (J(sVar, sVar2, J2)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean I(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f9177p;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f9178q;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f9179r;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f9179r.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f9180s != null && z.y(view) != null && this.f9180s.contains(z.y(view))) {
            return false;
        }
        if ((this.f9173l.size() == 0 && this.f9174m.size() == 0 && (((arrayList = this.f9176o) == null || arrayList.isEmpty()) && ((arrayList2 = this.f9175n) == null || arrayList2.isEmpty()))) || this.f9173l.contains(Integer.valueOf(id)) || this.f9174m.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f9175n;
        if (arrayList6 != null && arrayList6.contains(z.y(view))) {
            return true;
        }
        if (this.f9176o != null) {
            for (int i11 = 0; i11 < this.f9176o.size(); i11++) {
                if (this.f9176o.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void P(View view) {
        if (!this.G) {
            for (int size = this.D.size() - 1; size >= 0; size--) {
                a.b(this.D.get(size));
            }
            ArrayList<f> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((f) arrayList2.get(i10)).c(this);
                }
            }
            this.F = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(ViewGroup viewGroup) {
        d dVar;
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        O(this.f9184w, this.f9185x);
        androidx.collection.a<Animator, d> z10 = z();
        int size = z10.size();
        m0 d10 = c0.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator i11 = z10.i(i10);
            if (!(i11 == null || (dVar = z10.get(i11)) == null || dVar.f9191a == null || !d10.equals(dVar.f9194d))) {
                s sVar = dVar.f9193c;
                View view = dVar.f9191a;
                s G2 = G(view, true);
                s v10 = v(view, true);
                if (G2 == null && v10 == null) {
                    v10 = this.f9185x.f9212a.get(view);
                }
                if (!(G2 == null && v10 == null) && dVar.f9195e.H(sVar, v10)) {
                    if (i11.isRunning() || i11.isStarted()) {
                        i11.cancel();
                    } else {
                        z10.remove(i11);
                    }
                }
            }
        }
        q(viewGroup, this.f9184w, this.f9185x, this.A, this.B);
        V();
    }

    public m R(f fVar) {
        ArrayList<f> arrayList = this.H;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.H.size() == 0) {
            this.H = null;
        }
        return this;
    }

    public m S(View view) {
        this.f9174m.remove(view);
        return this;
    }

    public void T(View view) {
        if (this.F) {
            if (!this.G) {
                for (int size = this.D.size() - 1; size >= 0; size--) {
                    a.c(this.D.get(size));
                }
                ArrayList<f> arrayList = this.H;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.H.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((f) arrayList2.get(i10)).e(this);
                    }
                }
            }
            this.F = false;
        }
    }

    /* access modifiers changed from: protected */
    public void V() {
        c0();
        androidx.collection.a<Animator, d> z10 = z();
        Iterator<Animator> it = this.I.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (z10.containsKey(next)) {
                c0();
                U(next, z10);
            }
        }
        this.I.clear();
        r();
    }

    public m W(long j10) {
        this.f9171j = j10;
        return this;
    }

    public void X(e eVar) {
        this.K = eVar;
    }

    public m Y(TimeInterpolator timeInterpolator) {
        this.f9172k = timeInterpolator;
        return this;
    }

    public void Z(g gVar) {
        if (gVar == null) {
            this.M = O;
        } else {
            this.M = gVar;
        }
    }

    public m a(f fVar) {
        if (this.H == null) {
            this.H = new ArrayList<>();
        }
        this.H.add(fVar);
        return this;
    }

    public void a0(p pVar) {
    }

    public m b(View view) {
        this.f9174m.add(view);
        return this;
    }

    public m b0(long j10) {
        this.f9170i = j10;
        return this;
    }

    /* access modifiers changed from: protected */
    public void c0() {
        if (this.E == 0) {
            ArrayList<f> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).d(this);
                }
            }
            this.G = false;
        }
        this.E++;
    }

    /* access modifiers changed from: package-private */
    public String d0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f9171j != -1) {
            str2 = str2 + "dur(" + this.f9171j + ") ";
        }
        if (this.f9170i != -1) {
            str2 = str2 + "dly(" + this.f9170i + ") ";
        }
        if (this.f9172k != null) {
            str2 = str2 + "interp(" + this.f9172k + ") ";
        }
        if (this.f9173l.size() <= 0 && this.f9174m.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f9173l.size() > 0) {
            for (int i10 = 0; i10 < this.f9173l.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f9173l.get(i10);
            }
        }
        if (this.f9174m.size() > 0) {
            for (int i11 = 0; i11 < this.f9174m.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f9174m.get(i11);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    public void e(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (s() >= 0) {
            animator.setDuration(s());
        }
        if (A() >= 0) {
            animator.setStartDelay(A() + animator.getStartDelay());
        }
        if (u() != null) {
            animator.setInterpolator(u());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* access modifiers changed from: protected */
    public void f() {
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).cancel();
        }
        ArrayList<f> arrayList = this.H;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.H.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((f) arrayList2.get(i10)).a(this);
            }
        }
    }

    public abstract void g(s sVar);

    /* access modifiers changed from: package-private */
    public void k(s sVar) {
    }

    public abstract void l(s sVar);

    /* access modifiers changed from: package-private */
    public void m(ViewGroup viewGroup, boolean z10) {
        androidx.collection.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        n(z10);
        if ((this.f9173l.size() > 0 || this.f9174m.size() > 0) && (((arrayList = this.f9175n) == null || arrayList.isEmpty()) && ((arrayList2 = this.f9176o) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f9173l.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f9173l.get(i10).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z10) {
                        l(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f9211c.add(this);
                    k(sVar);
                    if (z10) {
                        d(this.f9184w, findViewById, sVar);
                    } else {
                        d(this.f9185x, findViewById, sVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f9174m.size(); i11++) {
                View view = this.f9174m.get(i11);
                s sVar2 = new s(view);
                if (z10) {
                    l(sVar2);
                } else {
                    g(sVar2);
                }
                sVar2.f9211c.add(this);
                k(sVar2);
                if (z10) {
                    d(this.f9184w, view, sVar2);
                } else {
                    d(this.f9185x, view, sVar2);
                }
            }
        } else {
            i(viewGroup, z10);
        }
        if (!z10 && (aVar = this.L) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.f9184w.f9215d.remove(this.L.i(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.f9184w.f9215d.put(this.L.m(i13), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n(boolean z10) {
        if (z10) {
            this.f9184w.f9212a.clear();
            this.f9184w.f9213b.clear();
            this.f9184w.f9214c.b();
            return;
        }
        this.f9185x.f9212a.clear();
        this.f9185x.f9213b.clear();
        this.f9185x.f9214c.b();
    }

    /* renamed from: o */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.I = new ArrayList<>();
            mVar.f9184w = new t();
            mVar.f9185x = new t();
            mVar.A = null;
            mVar.B = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i10;
        Animator animator;
        s sVar;
        View view;
        s sVar2;
        Animator animator2;
        androidx.collection.a<Animator, d> z10 = z();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = arrayList.get(i11);
            s sVar4 = arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f9211c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f9211c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if (sVar3 == null || sVar4 == null || H(sVar3, sVar4)) {
                    Animator p10 = p(viewGroup, sVar3, sVar4);
                    if (p10 != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f9210b;
                            String[] F2 = F();
                            if (F2 != null && F2.length > 0) {
                                sVar2 = new s(view2);
                                s sVar5 = tVar2.f9212a.get(view2);
                                if (sVar5 != null) {
                                    int i12 = 0;
                                    while (i12 < F2.length) {
                                        sVar2.f9209a.put(F2[i12], sVar5.f9209a.get(F2[i12]));
                                        i12++;
                                        p10 = p10;
                                        size = size;
                                        sVar5 = sVar5;
                                    }
                                }
                                Animator animator3 = p10;
                                i10 = size;
                                int size2 = z10.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d dVar = z10.get(z10.i(i13));
                                    if (dVar.f9193c != null && dVar.f9191a == view2 && dVar.f9192b.equals(w()) && dVar.f9193c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                t tVar3 = tVar2;
                                i10 = size;
                                animator2 = p10;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            t tVar4 = tVar2;
                            i10 = size;
                            view = sVar3.f9210b;
                            animator = p10;
                            sVar = null;
                        }
                        if (animator != null) {
                            z10.put(animator, new d(view, w(), this, c0.d(viewGroup), sVar));
                            this.I.add(animator);
                        }
                        i11++;
                        size = i10;
                    }
                    t tVar5 = tVar2;
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            t tVar52 = tVar2;
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator4 = this.I.get(sparseIntArray.keyAt(i14));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i14)) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void r() {
        int i10 = this.E - 1;
        this.E = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).b(this);
                }
            }
            for (int i12 = 0; i12 < this.f9184w.f9214c.n(); i12++) {
                View o10 = this.f9184w.f9214c.o(i12);
                if (o10 != null) {
                    z.Y(o10, false);
                }
            }
            for (int i13 = 0; i13 < this.f9185x.f9214c.n(); i13++) {
                View o11 = this.f9185x.f9214c.o(i13);
                if (o11 != null) {
                    z.Y(o11, false);
                }
            }
            this.G = true;
        }
    }

    public long s() {
        return this.f9171j;
    }

    public e t() {
        return this.K;
    }

    public String toString() {
        return d0("");
    }

    public TimeInterpolator u() {
        return this.f9172k;
    }

    /* access modifiers changed from: package-private */
    public s v(View view, boolean z10) {
        q qVar = this.f9186y;
        if (qVar != null) {
            return qVar.v(view, z10);
        }
        ArrayList<s> arrayList = z10 ? this.A : this.B;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            s sVar = arrayList.get(i11);
            if (sVar == null) {
                return null;
            }
            if (sVar.f9210b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 < 0) {
            return null;
        }
        return (z10 ? this.B : this.A).get(i10);
    }

    public String w() {
        return this.f9169h;
    }

    public g x() {
        return this.M;
    }

    public p y() {
        return this.J;
    }
}
