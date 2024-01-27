package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.f;
import androidx.core.view.v;
import androidx.core.view.z;
import androidx.fragment.app.c0;
import androidx.fragment.app.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultSpecialEffectsController */
class c extends c0 {

    /* compiled from: DefaultSpecialEffectsController */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3102a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.c0$e$c[] r0 = androidx.fragment.app.c0.e.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3102a = r0
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3102a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3102a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3102a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.a.<clinit>():void");
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List f3103h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c0.e f3104i;

        b(List list, c0.e eVar) {
            this.f3103h = list;
            this.f3104i = eVar;
        }

        public void run() {
            if (this.f3103h.contains(this.f3104i)) {
                this.f3103h.remove(this.f3104i);
                c.this.s(this.f3104i);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultSpecialEffectsController */
    class C0046c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3106a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3107b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3108c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c0.e f3109d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f3110e;

        C0046c(ViewGroup viewGroup, View view, boolean z10, c0.e eVar, k kVar) {
            this.f3106a = viewGroup;
            this.f3107b = view;
            this.f3108c = z10;
            this.f3109d = eVar;
            this.f3110e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3106a.endViewTransition(this.f3107b);
            if (this.f3108c) {
                this.f3109d.e().a(this.f3107b);
            }
            this.f3110e.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class d implements f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Animator f3112a;

        d(Animator animator) {
            this.f3112a = animator;
        }

        public void onCancel() {
            this.f3112a.end();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3114a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3115b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f3116c;

        /* compiled from: DefaultSpecialEffectsController */
        class a implements Runnable {
            a() {
            }

            public void run() {
                e eVar = e.this;
                eVar.f3114a.endViewTransition(eVar.f3115b);
                e.this.f3116c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f3114a = viewGroup;
            this.f3115b = view;
            this.f3116c = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3114a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class f implements f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f3119a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3120b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f3121c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f3119a = view;
            this.f3120b = viewGroup;
            this.f3121c = kVar;
        }

        public void onCancel() {
            this.f3119a.clearAnimation();
            this.f3120b.endViewTransition(this.f3119a);
            this.f3121c.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class g implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0.e f3123h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c0.e f3124i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f3125j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f3126k;

        g(c0.e eVar, c0.e eVar2, boolean z10, androidx.collection.a aVar) {
            this.f3123h = eVar;
            this.f3124i = eVar2;
            this.f3125j = z10;
            this.f3126k = aVar;
        }

        public void run() {
            x.f(this.f3123h.f(), this.f3124i.f(), this.f3125j, this.f3126k, false);
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class h implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ z f3128h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ View f3129i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Rect f3130j;

        h(z zVar, View view, Rect rect) {
            this.f3128h = zVar;
            this.f3129i = view;
            this.f3130j = rect;
        }

        public void run() {
            this.f3128h.k(this.f3129i, this.f3130j);
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class i implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f3132h;

        i(ArrayList arrayList) {
            this.f3132h = arrayList;
        }

        public void run() {
            x.A(this.f3132h, 4);
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class j implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m f3134h;

        j(m mVar) {
            this.f3134h = mVar;
        }

        public void run() {
            this.f3134h.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    private static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private boolean f3136c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3137d = false;

        /* renamed from: e  reason: collision with root package name */
        private f.d f3138e;

        k(c0.e eVar, androidx.core.os.f fVar, boolean z10) {
            super(eVar, fVar);
            this.f3136c = z10;
        }

        /* access modifiers changed from: package-private */
        public f.d e(Context context) {
            if (this.f3137d) {
                return this.f3138e;
            }
            f.d c10 = f.c(context, b().f(), b().e() == c0.e.c.VISIBLE, this.f3136c);
            this.f3138e = c10;
            this.f3137d = true;
            return c10;
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    private static class l {

        /* renamed from: a  reason: collision with root package name */
        private final c0.e f3139a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.os.f f3140b;

        l(c0.e eVar, androidx.core.os.f fVar) {
            this.f3139a = eVar;
            this.f3140b = fVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3139a.d(this.f3140b);
        }

        /* access modifiers changed from: package-private */
        public c0.e b() {
            return this.f3139a;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.os.f c() {
            return this.f3140b;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.c0.e.c.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d() {
            /*
                r3 = this;
                androidx.fragment.app.c0$e r0 = r3.f3139a
                androidx.fragment.app.Fragment r0 = r0.f()
                android.view.View r0 = r0.mView
                androidx.fragment.app.c0$e$c r0 = androidx.fragment.app.c0.e.c.e(r0)
                androidx.fragment.app.c0$e r1 = r3.f3139a
                androidx.fragment.app.c0$e$c r1 = r1.e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.c0$e$c r2 = androidx.fragment.app.c0.e.c.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.l.d():boolean");
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    private static class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final Object f3141c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f3142d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f3143e;

        m(c0.e eVar, androidx.core.os.f fVar, boolean z10, boolean z11) {
            super(eVar, fVar);
            Object obj;
            Object obj2;
            boolean z12;
            if (eVar.e() == c0.e.c.VISIBLE) {
                if (z10) {
                    obj2 = eVar.f().getReenterTransition();
                } else {
                    obj2 = eVar.f().getEnterTransition();
                }
                this.f3141c = obj2;
                if (z10) {
                    z12 = eVar.f().getAllowReturnTransitionOverlap();
                } else {
                    z12 = eVar.f().getAllowEnterTransitionOverlap();
                }
                this.f3142d = z12;
            } else {
                if (z10) {
                    obj = eVar.f().getReturnTransition();
                } else {
                    obj = eVar.f().getExitTransition();
                }
                this.f3141c = obj;
                this.f3142d = true;
            }
            if (!z11) {
                this.f3143e = null;
            } else if (z10) {
                this.f3143e = eVar.f().getSharedElementReturnTransition();
            } else {
                this.f3143e = eVar.f().getSharedElementEnterTransition();
            }
        }

        private z f(Object obj) {
            if (obj == null) {
                return null;
            }
            z zVar = x.f3335b;
            if (zVar != null && zVar.e(obj)) {
                return zVar;
            }
            z zVar2 = x.f3336c;
            if (zVar2 != null && zVar2.e(obj)) {
                return zVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        public z e() {
            z f10 = f(this.f3141c);
            z f11 = f(this.f3143e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 != null ? f10 : f11;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f3141c + " which uses a different Transition  type than its shared element transition " + this.f3143e);
        }

        public Object g() {
            return this.f3143e;
        }

        /* access modifiers changed from: package-private */
        public Object h() {
            return this.f3141c;
        }

        public boolean i() {
            return this.f3143e != null;
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return this.f3142d;
        }
    }

    c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<c0.e> list2, boolean z10, Map<c0.e, Boolean> map) {
        ViewGroup m10 = m();
        Context context = m10.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (k next : list) {
            if (next.d()) {
                next.a();
            } else {
                f.d e10 = next.e(context);
                if (e10 == null) {
                    next.a();
                } else {
                    Animator animator = e10.f3194b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        c0.e b10 = next.b();
                        Fragment f10 = b10.f();
                        if (Boolean.TRUE.equals(map.get(b10))) {
                            if (n.F0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Ignoring Animator set on ");
                                sb.append(f10);
                                sb.append(" as this Fragment was involved in a Transition.");
                            }
                            next.a();
                        } else {
                            boolean z12 = b10.e() == c0.e.c.GONE;
                            List<c0.e> list3 = list2;
                            if (z12) {
                                list3.remove(b10);
                            }
                            View view = f10.mView;
                            m10.startViewTransition(view);
                            C0046c cVar = r0;
                            View view2 = view;
                            C0046c cVar2 = new C0046c(m10, view2, z12, b10, next);
                            animator.addListener(cVar);
                            animator.setTarget(view2);
                            animator.start();
                            next.c().c(new d(animator));
                            z11 = true;
                        }
                    }
                }
            }
            Map<c0.e, Boolean> map2 = map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            c0.e b11 = kVar.b();
            Fragment f11 = b11.f();
            if (z10) {
                if (n.F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(f11);
                    sb2.append(" as Animations cannot run alongside Transitions.");
                }
                kVar.a();
            } else if (z11) {
                if (n.F0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Ignoring Animation set on ");
                    sb3.append(f11);
                    sb3.append(" as Animations cannot run alongside Animators.");
                }
                kVar.a();
            } else {
                View view3 = f11.mView;
                Animation animation = (Animation) androidx.core.util.h.b(((f.d) androidx.core.util.h.b(kVar.e(context))).f3193a);
                if (b11.e() != c0.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar.a();
                } else {
                    m10.startViewTransition(view3);
                    f.e eVar = new f.e(animation, m10, view3);
                    eVar.setAnimationListener(new e(m10, view3, kVar));
                    view3.startAnimation(eVar);
                }
                kVar.c().c(new f(view3, m10, kVar));
            }
        }
    }

    private Map<c0.e, Boolean> x(List<m> list, List<c0.e> list2, boolean z10, c0.e eVar, c0.e eVar2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        View view2;
        Object obj;
        c0.e eVar3;
        c0.e eVar4;
        Object obj2;
        Object obj3;
        androidx.collection.a aVar;
        c0.e eVar5;
        z zVar;
        View view3;
        Rect rect;
        ArrayList arrayList3;
        c0.e eVar6;
        ArrayList arrayList4;
        boolean z11 = z10;
        c0.e eVar7 = eVar;
        c0.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        z zVar2 = null;
        for (m next : list) {
            if (!next.d()) {
                z e10 = next.e();
                if (zVar2 == null) {
                    zVar2 = e10;
                } else if (!(e10 == null || zVar2 == e10)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.b().f() + " returned Transition " + next.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (zVar2 == null) {
            for (m next2 : list) {
                hashMap.put(next2.b(), Boolean.FALSE);
                next2.a();
            }
            return hashMap;
        }
        View view4 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Object obj4 = null;
        View view5 = null;
        boolean z12 = false;
        for (m next3 : list) {
            if (!next3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList4 = arrayList6;
                eVar6 = eVar7;
                arrayList3 = arrayList5;
                rect = rect2;
                view3 = view4;
                zVar = zVar2;
                eVar5 = eVar8;
                view5 = view5;
            } else {
                Object B = zVar2.B(zVar2.g(next3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                Object obj5 = B;
                View view6 = view5;
                int i10 = 0;
                while (i10 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i10));
                    }
                    i10++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                if (!z11) {
                    eVar.f().getExitTransitionCallback();
                    eVar2.f().getEnterTransitionCallback();
                } else {
                    eVar.f().getEnterTransitionCallback();
                    eVar2.f().getExitTransitionCallback();
                }
                int i11 = 0;
                for (int size = sharedElementSourceNames.size(); i11 < size; size = size) {
                    aVar2.put(sharedElementSourceNames.get(i11), sharedElementTargetNames2.get(i11));
                    i11++;
                }
                androidx.collection.a aVar3 = new androidx.collection.a();
                u(aVar3, eVar.f().mView);
                aVar3.o(sharedElementSourceNames);
                aVar2.o(aVar3.keySet());
                androidx.collection.a aVar4 = new androidx.collection.a();
                u(aVar4, eVar2.f().mView);
                aVar4.o(sharedElementTargetNames2);
                aVar4.o(aVar2.values());
                x.x(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList4 = arrayList6;
                    eVar6 = eVar7;
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    zVar = zVar2;
                    view5 = view6;
                    obj4 = null;
                    eVar5 = eVar8;
                } else {
                    x.f(eVar2.f(), eVar.f(), z11, aVar3, true);
                    ArrayList<String> arrayList8 = sharedElementSourceNames;
                    g gVar = r0;
                    ViewGroup m10 = m();
                    Object obj6 = obj5;
                    androidx.collection.a aVar5 = aVar4;
                    View view7 = view6;
                    androidx.collection.a aVar6 = aVar3;
                    aVar = aVar2;
                    ArrayList arrayList9 = arrayList6;
                    g gVar2 = new g(eVar2, eVar, z10, aVar5);
                    v.a(m10, gVar2);
                    arrayList5.addAll(aVar6.values());
                    if (!arrayList8.isEmpty()) {
                        View view8 = (View) aVar6.get(arrayList8.get(0));
                        zVar2.v(obj6, view8);
                        view5 = view8;
                    } else {
                        view5 = view7;
                    }
                    arrayList4 = arrayList9;
                    arrayList4.addAll(aVar5.values());
                    if (!sharedElementTargetNames2.isEmpty()) {
                        View view9 = (View) aVar5.get(sharedElementTargetNames2.get(0));
                        if (view9 != null) {
                            v.a(m(), new h(zVar2, view9, rect2));
                            z12 = true;
                        }
                    }
                    zVar2.z(obj6, view4, arrayList5);
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    zVar = zVar2;
                    zVar2.t(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool = Boolean.TRUE;
                    eVar6 = eVar;
                    hashMap.put(eVar6, bool);
                    eVar5 = eVar2;
                    hashMap.put(eVar5, bool);
                    obj4 = obj6;
                }
            }
            eVar7 = eVar6;
            arrayList5 = arrayList3;
            rect2 = rect;
            view4 = view3;
            eVar8 = eVar5;
            aVar2 = aVar;
            z11 = z10;
            arrayList6 = arrayList4;
            zVar2 = zVar;
        }
        View view10 = view5;
        androidx.collection.a aVar7 = aVar2;
        ArrayList arrayList10 = arrayList6;
        c0.e eVar9 = eVar7;
        ArrayList arrayList11 = arrayList5;
        Rect rect3 = rect2;
        View view11 = view4;
        z zVar3 = zVar2;
        c0.e eVar10 = eVar8;
        ArrayList arrayList12 = new ArrayList();
        Object obj7 = null;
        Object obj8 = null;
        for (m next4 : list) {
            if (next4.d()) {
                hashMap.put(next4.b(), Boolean.FALSE);
                next4.a();
            } else {
                Object g10 = zVar3.g(next4.h());
                c0.e b10 = next4.b();
                boolean z13 = obj4 != null && (b10 == eVar9 || b10 == eVar10);
                if (g10 == null) {
                    if (!z13) {
                        hashMap.put(b10, Boolean.FALSE);
                        next4.a();
                    }
                    List<c0.e> list3 = list2;
                    arrayList = arrayList10;
                    arrayList2 = arrayList11;
                    view = view11;
                    obj = obj7;
                    eVar3 = eVar10;
                    view2 = view10;
                } else {
                    ArrayList arrayList13 = new ArrayList();
                    Object obj9 = obj7;
                    t(arrayList13, b10.f().mView);
                    if (z13) {
                        if (b10 == eVar9) {
                            arrayList13.removeAll(arrayList11);
                        } else {
                            arrayList13.removeAll(arrayList10);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        zVar3.a(g10, view11);
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        view = view11;
                        eVar4 = b10;
                        obj3 = obj8;
                        eVar3 = eVar10;
                        List<c0.e> list4 = list2;
                        obj2 = obj9;
                    } else {
                        zVar3.b(g10, arrayList13);
                        view = view11;
                        obj2 = obj9;
                        c0.e eVar11 = b10;
                        arrayList2 = arrayList11;
                        obj3 = obj8;
                        arrayList = arrayList10;
                        eVar3 = eVar10;
                        zVar3.t(g10, g10, arrayList13, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (eVar11.e() == c0.e.c.GONE) {
                            eVar4 = eVar11;
                            list2.remove(eVar4);
                            ArrayList arrayList14 = new ArrayList(arrayList13);
                            arrayList14.remove(eVar4.f().mView);
                            zVar3.r(g10, eVar4.f().mView, arrayList14);
                            v.a(m(), new i(arrayList13));
                        } else {
                            List<c0.e> list5 = list2;
                            eVar4 = eVar11;
                        }
                    }
                    if (eVar4.e() == c0.e.c.VISIBLE) {
                        arrayList12.addAll(arrayList13);
                        if (z12) {
                            zVar3.u(g10, rect3);
                        }
                        view2 = view10;
                    } else {
                        view2 = view10;
                        zVar3.v(g10, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (next4.j()) {
                        obj8 = zVar3.n(obj3, g10, (Object) null);
                        obj = obj2;
                    } else {
                        obj = zVar3.n(obj2, g10, (Object) null);
                        obj8 = obj3;
                    }
                }
                eVar10 = eVar3;
                obj7 = obj;
                view10 = view2;
                view11 = view;
                arrayList11 = arrayList2;
                arrayList10 = arrayList;
            }
        }
        ArrayList arrayList15 = arrayList10;
        ArrayList arrayList16 = arrayList11;
        c0.e eVar12 = eVar10;
        Object m11 = zVar3.m(obj8, obj7, obj4);
        for (m next5 : list) {
            if (!next5.d()) {
                Object h10 = next5.h();
                c0.e b11 = next5.b();
                boolean z14 = obj4 != null && (b11 == eVar9 || b11 == eVar12);
                if (h10 != null || z14) {
                    if (!z.F(m())) {
                        if (n.F0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Container ");
                            sb.append(m());
                            sb.append(" has not been laid out. Completing operation ");
                            sb.append(b11);
                        }
                        next5.a();
                    } else {
                        zVar3.w(next5.b().f(), m11, next5.c(), new j(next5));
                    }
                }
            }
        }
        if (!z.F(m())) {
            return hashMap;
        }
        x.A(arrayList12, 4);
        ArrayList arrayList17 = arrayList15;
        ArrayList<String> o10 = zVar3.o(arrayList17);
        zVar3.c(m(), m11);
        zVar3.y(m(), arrayList16, arrayList17, o10, aVar7);
        x.A(arrayList12, 0);
        zVar3.A(obj4, arrayList16, arrayList17);
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void f(List<c0.e> list, boolean z10) {
        c0.e eVar = null;
        c0.e eVar2 = null;
        for (c0.e next : list) {
            c0.e.c e10 = c0.e.c.e(next.f().mView);
            int i10 = a.f3102a[next.e().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                if (e10 == c0.e.c.VISIBLE && eVar == null) {
                    eVar = next;
                }
            } else if (i10 == 4 && e10 != c0.e.c.VISIBLE) {
                eVar2 = next;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<c0.e> arrayList3 = new ArrayList<>(list);
        for (c0.e next2 : list) {
            androidx.core.os.f fVar = new androidx.core.os.f();
            next2.j(fVar);
            arrayList.add(new k(next2, fVar, z10));
            androidx.core.os.f fVar2 = new androidx.core.os.f();
            next2.j(fVar2);
            boolean z11 = false;
            if (z10) {
                if (next2 != eVar) {
                    arrayList2.add(new m(next2, fVar2, z10, z11));
                    next2.a(new b(arrayList3, next2));
                }
            } else if (next2 != eVar2) {
                arrayList2.add(new m(next2, fVar2, z10, z11));
                next2.a(new b(arrayList3, next2));
            }
            z11 = true;
            arrayList2.add(new m(next2, fVar2, z10, z11));
            next2.a(new b(arrayList3, next2));
        }
        Map<c0.e, Boolean> x10 = x(arrayList2, arrayList3, z10, eVar, eVar2);
        w(arrayList, arrayList3, x10.containsValue(Boolean.TRUE), x10);
        for (c0.e s10 : arrayList3) {
            s(s10);
        }
        arrayList3.clear();
    }

    /* access modifiers changed from: package-private */
    public void s(c0.e eVar) {
        eVar.e().a(eVar.f().mView);
    }

    /* access modifiers changed from: package-private */
    public void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!androidx.core.view.c0.a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(Map<String, View> map, View view) {
        String y10 = z.y(view);
        if (y10 != null) {
            map.put(y10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(z.y((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
