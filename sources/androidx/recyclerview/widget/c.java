package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator */
public class c extends k {

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<RecyclerView.c0> f4203h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<RecyclerView.c0> f4204i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<j> f4205j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<i> f4206k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.c0>> f4207l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    ArrayList<ArrayList<j>> f4208m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    ArrayList<ArrayList<i>> f4209n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    ArrayList<RecyclerView.c0> f4210o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    ArrayList<RecyclerView.c0> f4211p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    ArrayList<RecyclerView.c0> f4212q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    ArrayList<RecyclerView.c0> f4213r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f4214h;

        a(ArrayList arrayList) {
            this.f4214h = arrayList;
        }

        public void run() {
            Iterator it = this.f4214h.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.J(jVar.f4248a, jVar.f4249b, jVar.f4250c, jVar.f4251d, jVar.f4252e);
            }
            this.f4214h.clear();
            c.this.f4208m.remove(this.f4214h);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f4216h;

        b(ArrayList arrayList) {
            this.f4216h = arrayList;
        }

        public void run() {
            Iterator it = this.f4216h.iterator();
            while (it.hasNext()) {
                c.this.I((i) it.next());
            }
            this.f4216h.clear();
            c.this.f4209n.remove(this.f4216h);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultItemAnimator */
    class C0071c implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f4218h;

        C0071c(ArrayList arrayList) {
            this.f4218h = arrayList;
        }

        public void run() {
            Iterator it = this.f4218h.iterator();
            while (it.hasNext()) {
                c.this.H((RecyclerView.c0) it.next());
            }
            this.f4218h.clear();
            c.this.f4207l.remove(this.f4218h);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.c0 f4220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4221b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4222c;

        d(RecyclerView.c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4220a = c0Var;
            this.f4221b = viewPropertyAnimator;
            this.f4222c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4221b.setListener((Animator.AnimatorListener) null);
            this.f4222c.setAlpha(1.0f);
            c.this.x(this.f4220a);
            c.this.f4212q.remove(this.f4220a);
            c.this.M();
        }

        public void onAnimationStart(Animator animator) {
            c.this.y(this.f4220a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.c0 f4224a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f4225b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4226c;

        e(RecyclerView.c0 c0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4224a = c0Var;
            this.f4225b = view;
            this.f4226c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4225b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f4226c.setListener((Animator.AnimatorListener) null);
            c.this.r(this.f4224a);
            c.this.f4210o.remove(this.f4224a);
            c.this.M();
        }

        public void onAnimationStart(Animator animator) {
            c.this.s(this.f4224a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.c0 f4228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f4229b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4230c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f4231d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4232e;

        f(RecyclerView.c0 c0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4228a = c0Var;
            this.f4229b = i10;
            this.f4230c = view;
            this.f4231d = i11;
            this.f4232e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f4229b != 0) {
                this.f4230c.setTranslationX(0.0f);
            }
            if (this.f4231d != 0) {
                this.f4230c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f4232e.setListener((Animator.AnimatorListener) null);
            c.this.v(this.f4228a);
            c.this.f4211p.remove(this.f4228a);
            c.this.M();
        }

        public void onAnimationStart(Animator animator) {
            c.this.w(this.f4228a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4234a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4235b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4236c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4234a = iVar;
            this.f4235b = viewPropertyAnimator;
            this.f4236c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4235b.setListener((Animator.AnimatorListener) null);
            this.f4236c.setAlpha(1.0f);
            this.f4236c.setTranslationX(0.0f);
            this.f4236c.setTranslationY(0.0f);
            c.this.t(this.f4234a.f4242a, true);
            c.this.f4213r.remove(this.f4234a.f4242a);
            c.this.M();
        }

        public void onAnimationStart(Animator animator) {
            c.this.u(this.f4234a.f4242a, true);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4240c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4238a = iVar;
            this.f4239b = viewPropertyAnimator;
            this.f4240c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4239b.setListener((Animator.AnimatorListener) null);
            this.f4240c.setAlpha(1.0f);
            this.f4240c.setTranslationX(0.0f);
            this.f4240c.setTranslationY(0.0f);
            c.this.t(this.f4238a.f4243b, false);
            c.this.f4213r.remove(this.f4238a.f4243b);
            c.this.M();
        }

        public void onAnimationStart(Animator animator) {
            c.this.u(this.f4238a.f4243b, false);
        }
    }

    /* compiled from: DefaultItemAnimator */
    private static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.c0 f4242a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.c0 f4243b;

        /* renamed from: c  reason: collision with root package name */
        public int f4244c;

        /* renamed from: d  reason: collision with root package name */
        public int f4245d;

        /* renamed from: e  reason: collision with root package name */
        public int f4246e;

        /* renamed from: f  reason: collision with root package name */
        public int f4247f;

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4242a + ", newHolder=" + this.f4243b + ", fromX=" + this.f4244c + ", fromY=" + this.f4245d + ", toX=" + this.f4246e + ", toY=" + this.f4247f + '}';
        }
    }

    /* compiled from: DefaultItemAnimator */
    private static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.c0 f4248a;

        /* renamed from: b  reason: collision with root package name */
        public int f4249b;

        /* renamed from: c  reason: collision with root package name */
        public int f4250c;

        /* renamed from: d  reason: collision with root package name */
        public int f4251d;

        /* renamed from: e  reason: collision with root package name */
        public int f4252e;
    }

    private void K(RecyclerView.c0 c0Var) {
        View view = c0Var.f4058a;
        ViewPropertyAnimator animate = view.animate();
        this.f4212q.add(c0Var);
        animate.setDuration(k()).alpha(0.0f).setListener(new d(c0Var, animate, view)).start();
    }

    private void N(List<i> list, RecyclerView.c0 c0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (P(iVar, c0Var) && iVar.f4242a == null && iVar.f4243b == null) {
                list.remove(iVar);
            }
        }
    }

    private void O(i iVar) {
        RecyclerView.c0 c0Var = iVar.f4242a;
        if (c0Var != null) {
            P(iVar, c0Var);
        }
        RecyclerView.c0 c0Var2 = iVar.f4243b;
        if (c0Var2 != null) {
            P(iVar, c0Var2);
        }
    }

    private boolean P(i iVar, RecyclerView.c0 c0Var) {
        boolean z10 = false;
        if (iVar.f4243b == c0Var) {
            iVar.f4243b = null;
        } else if (iVar.f4242a != c0Var) {
            return false;
        } else {
            iVar.f4242a = null;
            z10 = true;
        }
        c0Var.f4058a.setAlpha(1.0f);
        c0Var.f4058a.setTranslationX(0.0f);
        c0Var.f4058a.setTranslationY(0.0f);
        t(c0Var, z10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void H(RecyclerView.c0 c0Var) {
        View view = c0Var.f4058a;
        ViewPropertyAnimator animate = view.animate();
        this.f4210o.add(c0Var);
        animate.alpha(1.0f).setDuration(h()).setListener(new e(c0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void I(i iVar) {
        View view;
        RecyclerView.c0 c0Var = iVar.f4242a;
        View view2 = null;
        if (c0Var == null) {
            view = null;
        } else {
            view = c0Var.f4058a;
        }
        RecyclerView.c0 c0Var2 = iVar.f4243b;
        if (c0Var2 != null) {
            view2 = c0Var2.f4058a;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(i());
            this.f4213r.add(iVar.f4242a);
            duration.translationX((float) (iVar.f4246e - iVar.f4244c));
            duration.translationY((float) (iVar.f4247f - iVar.f4245d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f4213r.add(iVar.f4243b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(i()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void J(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
        View view = c0Var.f4058a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4211p.add(c0Var);
        animate.setDuration(j()).setListener(new f(c0Var, i14, view, i15, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void L(List<RecyclerView.c0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f4058a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void M() {
        if (!l()) {
            e();
        }
    }

    public boolean c(RecyclerView.c0 c0Var, List<Object> list) {
        return !list.isEmpty() || super.c(c0Var, list);
    }

    public void f(RecyclerView.c0 c0Var) {
        View view = c0Var.f4058a;
        view.animate().cancel();
        int size = this.f4205j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f4205j.get(size).f4248a == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(c0Var);
                this.f4205j.remove(size);
            }
        }
        N(this.f4206k, c0Var);
        if (this.f4203h.remove(c0Var)) {
            view.setAlpha(1.0f);
            x(c0Var);
        }
        if (this.f4204i.remove(c0Var)) {
            view.setAlpha(1.0f);
            r(c0Var);
        }
        for (int size2 = this.f4209n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f4209n.get(size2);
            N(arrayList, c0Var);
            if (arrayList.isEmpty()) {
                this.f4209n.remove(size2);
            }
        }
        for (int size3 = this.f4208m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f4208m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).f4248a == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(c0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4208m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4207l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f4207l.get(size5);
            if (arrayList3.remove(c0Var)) {
                view.setAlpha(1.0f);
                r(c0Var);
                if (arrayList3.isEmpty()) {
                    this.f4207l.remove(size5);
                }
            }
        }
        this.f4212q.remove(c0Var);
        this.f4210o.remove(c0Var);
        this.f4213r.remove(c0Var);
        this.f4211p.remove(c0Var);
        M();
    }

    public void g() {
        int size = this.f4205j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f4205j.get(size);
            View view = jVar.f4248a.f4058a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(jVar.f4248a);
            this.f4205j.remove(size);
        }
        for (int size2 = this.f4203h.size() - 1; size2 >= 0; size2--) {
            x(this.f4203h.get(size2));
            this.f4203h.remove(size2);
        }
        int size3 = this.f4204i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.c0 c0Var = this.f4204i.get(size3);
            c0Var.f4058a.setAlpha(1.0f);
            r(c0Var);
            this.f4204i.remove(size3);
        }
        for (int size4 = this.f4206k.size() - 1; size4 >= 0; size4--) {
            O(this.f4206k.get(size4));
        }
        this.f4206k.clear();
        if (l()) {
            for (int size5 = this.f4208m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f4208m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f4248a.f4058a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    v(jVar2.f4248a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4208m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4207l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f4207l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.c0 c0Var2 = (RecyclerView.c0) arrayList2.get(size8);
                    c0Var2.f4058a.setAlpha(1.0f);
                    r(c0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4207l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4209n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f4209n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    O((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4209n.remove(arrayList3);
                    }
                }
            }
            L(this.f4212q);
            L(this.f4211p);
            L(this.f4210o);
            L(this.f4213r);
            e();
        }
    }

    public boolean l() {
        return !this.f4204i.isEmpty() || !this.f4206k.isEmpty() || !this.f4205j.isEmpty() || !this.f4203h.isEmpty() || !this.f4211p.isEmpty() || !this.f4212q.isEmpty() || !this.f4210o.isEmpty() || !this.f4213r.isEmpty() || !this.f4208m.isEmpty() || !this.f4207l.isEmpty() || !this.f4209n.isEmpty();
    }

    public void p() {
        boolean z10 = !this.f4203h.isEmpty();
        boolean z11 = !this.f4205j.isEmpty();
        boolean z12 = !this.f4206k.isEmpty();
        boolean z13 = !this.f4204i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.c0> it = this.f4203h.iterator();
            while (it.hasNext()) {
                K(it.next());
            }
            this.f4203h.clear();
            if (z11) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f4205j);
                this.f4208m.add(arrayList);
                this.f4205j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    z.O(((j) arrayList.get(0)).f4248a.f4058a, aVar, k());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f4206k);
                this.f4209n.add(arrayList2);
                this.f4206k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    z.O(((i) arrayList2.get(0)).f4242a.f4058a, bVar, k());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f4204i);
                this.f4207l.add(arrayList3);
                this.f4204i.clear();
                C0071c cVar = new C0071c(arrayList3);
                if (z10 || z11 || z12) {
                    long j10 = 0;
                    long k10 = z10 ? k() : 0;
                    long j11 = z11 ? j() : 0;
                    if (z12) {
                        j10 = i();
                    }
                    z.O(((RecyclerView.c0) arrayList3.get(0)).f4058a, cVar, k10 + Math.max(j11, j10));
                    return;
                }
                cVar.run();
            }
        }
    }
}
