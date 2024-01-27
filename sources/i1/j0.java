package i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import i1.a;
import i1.m;

/* compiled from: Visibility */
public abstract class j0 extends m {
    private static final String[] R = {"android:visibility:visibility", "android:visibility:parent"};
    private int Q = 3;

    /* compiled from: Visibility */
    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f9148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f9149b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f9150c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f9148a = viewGroup;
            this.f9149b = view;
            this.f9150c = view2;
        }

        public void b(m mVar) {
            this.f9150c.setTag(j.save_overlay_view, (Object) null);
            x.a(this.f9148a).d(this.f9149b);
            mVar.R(this);
        }

        public void c(m mVar) {
            x.a(this.f9148a).d(this.f9149b);
        }

        public void e(m mVar) {
            if (this.f9149b.getParent() == null) {
                x.a(this.f9148a).c(this.f9149b);
            } else {
                j0.this.f();
            }
        }
    }

    /* compiled from: Visibility */
    private static class b extends AnimatorListenerAdapter implements m.f, a.C0149a {

        /* renamed from: a  reason: collision with root package name */
        private final View f9152a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9153b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f9154c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f9155d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f9156e;

        /* renamed from: f  reason: collision with root package name */
        boolean f9157f = false;

        b(View view, int i10, boolean z10) {
            this.f9152a = view;
            this.f9153b = i10;
            this.f9154c = (ViewGroup) view.getParent();
            this.f9155d = z10;
            g(true);
        }

        private void f() {
            if (!this.f9157f) {
                c0.h(this.f9152a, this.f9153b);
                ViewGroup viewGroup = this.f9154c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (this.f9155d && this.f9156e != z10 && (viewGroup = this.f9154c) != null) {
                this.f9156e = z10;
                x.c(viewGroup, z10);
            }
        }

        public void a(m mVar) {
        }

        public void b(m mVar) {
            f();
            mVar.R(this);
        }

        public void c(m mVar) {
            g(false);
        }

        public void d(m mVar) {
        }

        public void e(m mVar) {
            g(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f9157f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f9157f) {
                c0.h(this.f9152a, this.f9153b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f9157f) {
                c0.h(this.f9152a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Visibility */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f9158a;

        /* renamed from: b  reason: collision with root package name */
        boolean f9159b;

        /* renamed from: c  reason: collision with root package name */
        int f9160c;

        /* renamed from: d  reason: collision with root package name */
        int f9161d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f9162e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f9163f;

        c() {
        }
    }

    private void e0(s sVar) {
        sVar.f9209a.put("android:visibility:visibility", Integer.valueOf(sVar.f9210b.getVisibility()));
        sVar.f9209a.put("android:visibility:parent", sVar.f9210b.getParent());
        int[] iArr = new int[2];
        sVar.f9210b.getLocationOnScreen(iArr);
        sVar.f9209a.put("android:visibility:screenLocation", iArr);
    }

    private c f0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f9158a = false;
        cVar.f9159b = false;
        if (sVar == null || !sVar.f9209a.containsKey("android:visibility:visibility")) {
            cVar.f9160c = -1;
            cVar.f9162e = null;
        } else {
            cVar.f9160c = ((Integer) sVar.f9209a.get("android:visibility:visibility")).intValue();
            cVar.f9162e = (ViewGroup) sVar.f9209a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f9209a.containsKey("android:visibility:visibility")) {
            cVar.f9161d = -1;
            cVar.f9163f = null;
        } else {
            cVar.f9161d = ((Integer) sVar2.f9209a.get("android:visibility:visibility")).intValue();
            cVar.f9163f = (ViewGroup) sVar2.f9209a.get("android:visibility:parent");
        }
        if (sVar != null && sVar2 != null) {
            int i10 = cVar.f9160c;
            int i11 = cVar.f9161d;
            if (i10 == i11 && cVar.f9162e == cVar.f9163f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f9159b = false;
                    cVar.f9158a = true;
                } else if (i11 == 0) {
                    cVar.f9159b = true;
                    cVar.f9158a = true;
                }
            } else if (cVar.f9163f == null) {
                cVar.f9159b = false;
                cVar.f9158a = true;
            } else if (cVar.f9162e == null) {
                cVar.f9159b = true;
                cVar.f9158a = true;
            }
        } else if (sVar == null && cVar.f9161d == 0) {
            cVar.f9159b = true;
            cVar.f9158a = true;
        } else if (sVar2 == null && cVar.f9160c == 0) {
            cVar.f9159b = false;
            cVar.f9158a = true;
        }
        return cVar;
    }

    public String[] F() {
        return R;
    }

    public boolean H(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f9209a.containsKey("android:visibility:visibility") != sVar.f9209a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c f02 = f0(sVar, sVar2);
        if (!f02.f9158a) {
            return false;
        }
        if (f02.f9160c == 0 || f02.f9161d == 0) {
            return true;
        }
        return false;
    }

    public void g(s sVar) {
        e0(sVar);
    }

    public abstract Animator g0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator h0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        if ((this.Q & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f9210b.getParent();
            if (f0(v(view, false), G(view, false)).f9158a) {
                return null;
            }
        }
        return g0(viewGroup, sVar2.f9210b, sVar, sVar2);
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.C != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator j0(android.view.ViewGroup r18, i1.s r19, int r20, i1.s r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.Q
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f9210b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f9210b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = i1.j.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = 1
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = 0
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = 1
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            i1.s r14 = r0.G(r13, r12)
            i1.s r15 = r0.v(r13, r12)
            i1.j0$c r14 = r0.f0(r14, r15)
            boolean r14 = r14.f9158a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = i1.r.a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.C
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f9209a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            i1.w r4 = i1.x.a(r18)
            r4.c(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.i0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            i1.w r1 = i1.x.a(r18)
            r1.d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            i1.j0$a r3 = new i1.j0$a
            r3.<init>(r1, r10, r5)
            r0.a(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            i1.c0.h(r8, r11)
            android.animation.Animator r1 = r0.i0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            i1.j0$b r2 = new i1.j0$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            i1.a.a(r1, r2)
            r0.a(r2)
            goto L_0x0106
        L_0x0103:
            i1.c0.h(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.j0.j0(android.view.ViewGroup, i1.s, int, i1.s, int):android.animation.Animator");
    }

    public void k0(int i10) {
        if ((i10 & -4) == 0) {
            this.Q = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public void l(s sVar) {
        e0(sVar);
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        c f02 = f0(sVar, sVar2);
        if (!f02.f9158a) {
            return null;
        }
        if (f02.f9162e == null && f02.f9163f == null) {
            return null;
        }
        if (f02.f9159b) {
            return h0(viewGroup, sVar, f02.f9160c, sVar2, f02.f9161d);
        }
        return j0(viewGroup, sVar, f02.f9160c, sVar2, f02.f9161d);
    }
}
