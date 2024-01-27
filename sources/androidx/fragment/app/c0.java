package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.f;
import androidx.core.view.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: SpecialEffectsController */
abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f3144a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<e> f3145b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<e> f3146c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f3147d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f3148e = false;

    /* compiled from: SpecialEffectsController */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f3149h;

        a(d dVar) {
            this.f3149h = dVar;
        }

        public void run() {
            if (c0.this.f3145b.contains(this.f3149h)) {
                this.f3149h.e().a(this.f3149h.f().mView);
            }
        }
    }

    /* compiled from: SpecialEffectsController */
    class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f3151h;

        b(d dVar) {
            this.f3151h = dVar;
        }

        public void run() {
            c0.this.f3145b.remove(this.f3151h);
            c0.this.f3146c.remove(this.f3151h);
        }
    }

    /* compiled from: SpecialEffectsController */
    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3153a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f3154b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.c0$e$b[] r0 = androidx.fragment.app.c0.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3154b = r0
                r1 = 1
                androidx.fragment.app.c0$e$b r2 = androidx.fragment.app.c0.e.b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3154b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$b r3 = androidx.fragment.app.c0.e.b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3154b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$b r4 = androidx.fragment.app.c0.e.b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.c0$e$c[] r3 = androidx.fragment.app.c0.e.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3153a = r3
                androidx.fragment.app.c0$e$c r4 = androidx.fragment.app.c0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f3153a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.c0$e$c r3 = androidx.fragment.app.c0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f3153a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f3153a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c0.c.<clinit>():void");
        }
    }

    /* compiled from: SpecialEffectsController */
    private static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        private final u f3155h;

        d(e.c cVar, e.b bVar, u uVar, f fVar) {
            super(cVar, bVar, uVar.k(), fVar);
            this.f3155h = uVar;
        }

        public void c() {
            super.c();
            this.f3155h.m();
        }

        /* access modifiers changed from: package-private */
        public void l() {
            if (g() == e.b.ADDING) {
                Fragment k10 = this.f3155h.k();
                View findFocus = k10.mView.findFocus();
                if (findFocus != null) {
                    k10.setFocusedView(findFocus);
                    if (n.F0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(findFocus);
                        sb.append(" for Fragment ");
                        sb.append(k10);
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.f3155h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k10.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* compiled from: SpecialEffectsController */
    static class e {

        /* renamed from: a  reason: collision with root package name */
        private c f3156a;

        /* renamed from: b  reason: collision with root package name */
        private b f3157b;

        /* renamed from: c  reason: collision with root package name */
        private final Fragment f3158c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f3159d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet<f> f3160e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private boolean f3161f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f3162g = false;

        /* compiled from: SpecialEffectsController */
        class a implements f.b {
            a() {
            }

            public void onCancel() {
                e.this.b();
            }
        }

        /* compiled from: SpecialEffectsController */
        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController */
        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c d(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i10);
            }

            static c e(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return d(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            public void a(View view) {
                int i10 = c.f3153a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (n.F0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i10 == 2) {
                    if (n.F0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i10 == 3) {
                    if (n.F0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: Setting view ");
                        sb3.append(view);
                        sb3.append(" to GONE");
                    }
                    view.setVisibility(8);
                } else if (i10 == 4) {
                    if (n.F0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SpecialEffectsController: Setting view ");
                        sb4.append(view);
                        sb4.append(" to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        e(c cVar, b bVar, Fragment fragment, f fVar) {
            this.f3156a = cVar;
            this.f3157b = bVar;
            this.f3158c = fragment;
            fVar.c(new a());
        }

        /* access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f3159d.add(runnable);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (!h()) {
                this.f3161f = true;
                if (this.f3160e.isEmpty()) {
                    c();
                    return;
                }
                Iterator it = new ArrayList(this.f3160e).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
            }
        }

        public void c() {
            if (!this.f3162g) {
                if (n.F0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(this);
                    sb.append(" has called complete.");
                }
                this.f3162g = true;
                for (Runnable run : this.f3159d) {
                    run.run();
                }
            }
        }

        public final void d(f fVar) {
            if (this.f3160e.remove(fVar) && this.f3160e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f3156a;
        }

        public final Fragment f() {
            return this.f3158c;
        }

        /* access modifiers changed from: package-private */
        public b g() {
            return this.f3157b;
        }

        /* access modifiers changed from: package-private */
        public final boolean h() {
            return this.f3161f;
        }

        /* access modifiers changed from: package-private */
        public final boolean i() {
            return this.f3162g;
        }

        public final void j(f fVar) {
            l();
            this.f3160e.add(fVar);
        }

        /* access modifiers changed from: package-private */
        public final void k(c cVar, b bVar) {
            int i10 = c.f3154b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (n.F0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: For fragment ");
                        sb.append(this.f3158c);
                        sb.append(" mFinalState = ");
                        sb.append(this.f3156a);
                        sb.append(" -> REMOVED. mLifecycleImpact  = ");
                        sb.append(this.f3157b);
                        sb.append(" to REMOVING.");
                    }
                    this.f3156a = c.REMOVED;
                    this.f3157b = b.REMOVING;
                } else if (i10 == 3 && this.f3156a != c.REMOVED) {
                    if (n.F0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: For fragment ");
                        sb2.append(this.f3158c);
                        sb2.append(" mFinalState = ");
                        sb2.append(this.f3156a);
                        sb2.append(" -> ");
                        sb2.append(cVar);
                        sb2.append(". ");
                    }
                    this.f3156a = cVar;
                }
            } else if (this.f3156a == c.REMOVED) {
                if (n.F0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.f3158c);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.f3157b);
                    sb3.append(" to ADDING.");
                }
                this.f3156a = c.VISIBLE;
                this.f3157b = b.ADDING;
            }
        }

        /* access modifiers changed from: package-private */
        public void l() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f3156a + "} " + "{" + "mLifecycleImpact = " + this.f3157b + "} " + "{" + "mFragment = " + this.f3158c + "}";
        }
    }

    c0(ViewGroup viewGroup) {
        this.f3144a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, u uVar) {
        synchronized (this.f3145b) {
            f fVar = new f();
            e h10 = h(uVar.k());
            if (h10 != null) {
                h10.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, uVar, fVar);
            this.f3145b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it = this.f3145b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it = this.f3146c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    static c0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.y0());
    }

    static c0 o(ViewGroup viewGroup, d0 d0Var) {
        int i10 = l0.b.f9806b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof c0) {
            return (c0) tag;
        }
        c0 a10 = d0Var.a(viewGroup);
        viewGroup.setTag(i10, a10);
        return a10;
    }

    private void q() {
        Iterator<e> it = this.f3145b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.d(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(e.c cVar, u uVar) {
        if (n.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(uVar.k());
        }
        a(cVar, e.b.ADDING, uVar);
    }

    /* access modifiers changed from: package-private */
    public void c(u uVar) {
        if (n.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(uVar.k());
        }
        a(e.c.GONE, e.b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    public void d(u uVar) {
        if (n.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(uVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, uVar);
    }

    /* access modifiers changed from: package-private */
    public void e(u uVar) {
        if (n.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(uVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void f(List<e> list, boolean z10);

    /* access modifiers changed from: package-private */
    public void g() {
        if (!this.f3148e) {
            if (!z.E(this.f3144a)) {
                j();
                this.f3147d = false;
                return;
            }
            synchronized (this.f3145b) {
                if (!this.f3145b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f3146c);
                    this.f3146c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (n.F0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Cancelling operation ");
                            sb.append(eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f3146c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f3145b);
                    this.f3145b.clear();
                    this.f3146c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f3147d);
                    this.f3147d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        boolean E = z.E(this.f3144a);
        synchronized (this.f3145b) {
            q();
            Iterator<e> it = this.f3145b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.f3146c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (n.F0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (E) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f3144a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f3145b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (n.F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (E) {
                        str = "";
                    } else {
                        str = "Container " + this.f3144a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                }
                eVar2.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        if (this.f3148e) {
            this.f3148e = false;
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public e.b l(u uVar) {
        e h10 = h(uVar.k());
        e.b g10 = h10 != null ? h10.g() : null;
        e i10 = i(uVar.k());
        return (i10 == null || !(g10 == null || g10 == e.b.NONE)) ? g10 : i10.g();
    }

    public ViewGroup m() {
        return this.f3144a;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f3145b) {
            q();
            this.f3148e = false;
            int size = this.f3145b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f3145b.get(size);
                e.c e10 = e.c.e(eVar.f().mView);
                e.c e11 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e11 == cVar && e10 != cVar) {
                    this.f3148e = eVar.f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f3147d = z10;
    }
}
