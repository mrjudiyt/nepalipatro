package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.w;
import androidx.fragment.app.x;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentManager */
public abstract class n {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.c<androidx.activity.result.e> A;
    private androidx.activity.result.c<String[]> B;
    ArrayDeque<m> C = new ArrayDeque<>();
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<q> L;
    private q M;
    private Runnable N = new g();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<o> f3218a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f3219b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final v f3220c = new v();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f3221d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f3222e;

    /* renamed from: f  reason: collision with root package name */
    private final l f3223f = new l(this);

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f3224g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.e f3225h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f3226i = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f3227j = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f3228k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<C0048n> f3229l;

    /* renamed from: m  reason: collision with root package name */
    private Map<Fragment, HashSet<androidx.core.os.f>> f3230m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    private final x.g f3231n = new d();

    /* renamed from: o  reason: collision with root package name */
    private final m f3232o = new m(this);

    /* renamed from: p  reason: collision with root package name */
    private final CopyOnWriteArrayList<r> f3233p = new CopyOnWriteArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    int f3234q = -1;

    /* renamed from: r  reason: collision with root package name */
    private k<?> f3235r;

    /* renamed from: s  reason: collision with root package name */
    private g f3236s;

    /* renamed from: t  reason: collision with root package name */
    private Fragment f3237t;

    /* renamed from: u  reason: collision with root package name */
    Fragment f3238u;

    /* renamed from: v  reason: collision with root package name */
    private j f3239v = null;

    /* renamed from: w  reason: collision with root package name */
    private j f3240w = new e();

    /* renamed from: x  reason: collision with root package name */
    private d0 f3241x = null;

    /* renamed from: y  reason: collision with root package name */
    private d0 f3242y = new f();

    /* renamed from: z  reason: collision with root package name */
    private androidx.activity.result.c<Intent> f3243z;

    /* compiled from: FragmentManager */
    class a implements androidx.activity.result.b<androidx.activity.result.a> {
        a() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f3258h;
            int i10 = pollFirst.f3259i;
            Fragment i11 = n.this.f3220c.i(str);
            if (i11 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Intent Sender result delivered for unknown Fragment ");
                sb2.append(str);
                return;
            }
            i11.onActivityResult(i10, aVar.c(), aVar.b());
        }
    }

    /* compiled from: FragmentManager */
    class b implements androidx.activity.result.b<Map<String, Boolean>> {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f3258h;
            int i11 = pollFirst.f3259i;
            Fragment i12 = n.this.f3220c.i(str);
            if (i12 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Permission request result delivered for unknown Fragment ");
                sb2.append(str);
                return;
            }
            i12.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    /* compiled from: FragmentManager */
    class c extends androidx.activity.e {
        c(boolean z10) {
            super(z10);
        }

        public void handleOnBackPressed() {
            n.this.B0();
        }
    }

    /* compiled from: FragmentManager */
    class d implements x.g {
        d() {
        }

        public void a(Fragment fragment, androidx.core.os.f fVar) {
            if (!fVar.b()) {
                n.this.b1(fragment, fVar);
            }
        }

        public void b(Fragment fragment, androidx.core.os.f fVar) {
            n.this.f(fragment, fVar);
        }
    }

    /* compiled from: FragmentManager */
    class e extends j {
        e() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.t0().b(n.this.t0().f(), str, (Bundle) null);
        }
    }

    /* compiled from: FragmentManager */
    class f implements d0 {
        f() {
        }

        public c0 a(ViewGroup viewGroup) {
            return new c(viewGroup);
        }
    }

    /* compiled from: FragmentManager */
    class g implements Runnable {
        g() {
        }

        public void run() {
            n.this.b0(true);
        }
    }

    /* compiled from: FragmentManager */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3252b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f3253c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3251a = viewGroup;
            this.f3252b = view;
            this.f3253c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3251a.endViewTransition(this.f3252b);
            animator.removeListener(this);
            Fragment fragment = this.f3253c;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    /* compiled from: FragmentManager */
    class i implements r {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f3255h;

        i(Fragment fragment) {
            this.f3255h = fragment;
        }

        public void a(n nVar, Fragment fragment) {
            this.f3255h.onAttachFragment(fragment);
        }
    }

    /* compiled from: FragmentManager */
    class j implements androidx.activity.result.b<androidx.activity.result.a> {
        j() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f3258h;
            int i10 = pollFirst.f3259i;
            Fragment i11 = n.this.f3220c.i(str);
            if (i11 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Activity result delivered for unknown Fragment ");
                sb2.append(str);
                return;
            }
            i11.onActivityResult(i10, aVar.c(), aVar.b());
        }
    }

    /* compiled from: FragmentManager */
    static class k extends e.a<androidx.activity.result.e, androidx.activity.result.a> {
        k() {
        }

        /* renamed from: a */
        public Intent createIntent(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent b10 = eVar.b();
            if (!(b10 == null || (bundleExtra = b10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                b10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (b10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.b(eVar.e()).b((Intent) null).c(eVar.d(), eVar.c()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (n.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
            }
            return intent;
        }

        /* renamed from: b */
        public androidx.activity.result.a parseResult(int i10, Intent intent) {
            return new androidx.activity.result.a(i10, intent);
        }
    }

    /* compiled from: FragmentManager */
    public static abstract class l {
    }

    /* renamed from: androidx.fragment.app.n$n  reason: collision with other inner class name */
    /* compiled from: FragmentManager */
    public interface C0048n {
        void a();
    }

    /* compiled from: FragmentManager */
    interface o {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager */
    private class p implements o {

        /* renamed from: a  reason: collision with root package name */
        final String f3260a;

        /* renamed from: b  reason: collision with root package name */
        final int f3261b;

        /* renamed from: c  reason: collision with root package name */
        final int f3262c;

        p(String str, int i10, int i11) {
            this.f3260a = str;
            this.f3261b = i10;
            this.f3262c = i11;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.f3238u;
            if (fragment != null && this.f3261b < 0 && this.f3260a == null && fragment.getChildFragmentManager().X0()) {
                return false;
            }
            return n.this.Z0(arrayList, arrayList2, this.f3260a, this.f3261b, this.f3262c);
        }
    }

    /* compiled from: FragmentManager */
    static class q implements Fragment.k {

        /* renamed from: a  reason: collision with root package name */
        final boolean f3264a;

        /* renamed from: b  reason: collision with root package name */
        final a f3265b;

        /* renamed from: c  reason: collision with root package name */
        private int f3266c;

        q(a aVar, boolean z10) {
            this.f3264a = z10;
            this.f3265b = aVar;
        }

        public void a() {
            this.f3266c++;
        }

        public void b() {
            int i10 = this.f3266c - 1;
            this.f3266c = i10;
            if (i10 == 0) {
                this.f3265b.f3079t.j1();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            a aVar = this.f3265b;
            aVar.f3079t.u(aVar, this.f3264a, false, false);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            boolean z10 = this.f3266c > 0;
            for (Fragment next : this.f3265b.f3079t.s0()) {
                next.setOnStartEnterTransitionListener((Fragment.k) null);
                if (z10 && next.isPostponed()) {
                    next.startPostponedEnterTransition();
                }
            }
            a aVar = this.f3265b;
            aVar.f3079t.u(aVar, this.f3264a, !z10, true);
        }

        public boolean e() {
            return this.f3266c == 0;
        }
    }

    static boolean F0(int i10) {
        return O || Log.isLoggable("FragmentManager", i10);
    }

    private boolean G0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.o();
    }

    private void M(Fragment fragment) {
        if (fragment != null && fragment.equals(g0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    private void O0(androidx.collection.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment i11 = bVar.i(i10);
            if (!i11.mAdded) {
                View requireView = i11.requireView();
                i11.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void T(int i10) {
        try {
            this.f3219b = true;
            this.f3220c.d(i10);
            Q0(i10, false);
            if (P) {
                for (c0 j10 : s()) {
                    j10.j();
                }
            }
            this.f3219b = false;
            b0(true);
        } catch (Throwable th) {
            this.f3219b = false;
            throw th;
        }
    }

    private void W() {
        if (this.H) {
            this.H = false;
            p1();
        }
    }

    private void Y() {
        if (P) {
            for (c0 j10 : s()) {
                j10.j();
            }
        } else if (!this.f3230m.isEmpty()) {
            for (Fragment next : this.f3230m.keySet()) {
                n(next);
                R0(next);
            }
        }
    }

    private boolean Y0(String str, int i10, int i11) {
        b0(false);
        a0(true);
        Fragment fragment = this.f3238u;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().X0()) {
            return true;
        }
        boolean Z0 = Z0(this.I, this.J, str, i10, i11);
        if (Z0) {
            this.f3219b = true;
            try {
                d1(this.I, this.J);
            } finally {
                q();
            }
        }
        q1();
        W();
        this.f3220c.b();
        return Z0;
    }

    private void a0(boolean z10) {
        if (this.f3219b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3235r == null) {
            if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3235r.g().getLooper()) {
            if (!z10) {
                p();
            }
            if (this.I == null) {
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
            }
            this.f3219b = true;
            try {
                f0((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f3219b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private int a1(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, androidx.collection.b<Fragment> bVar) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            a aVar = arrayList.get(i13);
            boolean booleanValue = arrayList2.get(i13).booleanValue();
            if (aVar.y() && !aVar.w(arrayList, i13 + 1, i11)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                q qVar = new q(aVar, booleanValue);
                this.L.add(qVar);
                aVar.A(qVar);
                if (booleanValue) {
                    aVar.r();
                } else {
                    aVar.s(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, aVar);
                }
                d(bVar);
            }
        }
        return i12;
    }

    private void d(androidx.collection.b<Fragment> bVar) {
        int i10 = this.f3234q;
        if (i10 >= 1) {
            int min = Math.min(i10, 5);
            for (Fragment next : this.f3220c.n()) {
                if (next.mState < min) {
                    S0(next, min);
                    if (next.mView != null && !next.mHidden && next.mIsNewlyAdded) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    private static void d0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            a aVar = arrayList.get(i10);
            boolean z10 = true;
            if (arrayList2.get(i10).booleanValue()) {
                aVar.n(-1);
                if (i10 != i11 - 1) {
                    z10 = false;
                }
                aVar.s(z10);
            } else {
                aVar.n(1);
                aVar.r();
            }
            i10++;
        }
    }

    private void d1(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                f0(arrayList, arrayList2);
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).f3324r) {
                        if (i11 != i10) {
                            e0(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f3324r) {
                                i11++;
                            }
                        }
                        e0(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    e0(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            boolean r2 = r0.f3324r
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.K = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            androidx.fragment.app.v r1 = r6.f3220c
            java.util.List r1 = r1.n()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.x0()
            r1 = 0
            r7 = r4
            r16 = 0
        L_0x0034:
            r14 = 1
            if (r7 >= r3) goto L_0x0065
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.a) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0050
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.t(r9, r0)
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.B(r9, r0)
        L_0x0056:
            if (r16 != 0) goto L_0x0060
            boolean r8 = r8.f3315i
            if (r8 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r16 = 0
            goto L_0x0062
        L_0x0060:
            r16 = 1
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0065:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            r0.clear()
            if (r2 != 0) goto L_0x00bd
            int r0 = r6.f3234q
            if (r0 < r14) goto L_0x00bd
            boolean r0 = P
            if (r0 == 0) goto L_0x00a4
            r0 = r4
        L_0x0075:
            if (r0 >= r3) goto L_0x00bd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            java.util.ArrayList<androidx.fragment.app.w$a> r1 = r1.f3309c
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.w$a r7 = (androidx.fragment.app.w.a) r7
            androidx.fragment.app.Fragment r7 = r7.f3327b
            if (r7 == 0) goto L_0x0083
            androidx.fragment.app.n r8 = r7.mFragmentManager
            if (r8 == 0) goto L_0x0083
            androidx.fragment.app.u r7 = r6.w(r7)
            androidx.fragment.app.v r8 = r6.f3220c
            r8.p(r7)
            goto L_0x0083
        L_0x00a1:
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00a4:
            androidx.fragment.app.k<?> r0 = r6.f3235r
            android.content.Context r7 = r0.f()
            androidx.fragment.app.g r8 = r6.f3236s
            r13 = 0
            androidx.fragment.app.x$g r0 = r6.f3231n
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = 1
            r14 = r0
            androidx.fragment.app.x.B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x00bd:
            r1 = 1
        L_0x00be:
            d0(r18, r19, r20, r21)
            boolean r0 = P
            if (r0 == 0) goto L_0x0143
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        L_0x00d2:
            if (r2 >= r3) goto L_0x011c
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            if (r0 == 0) goto L_0x00fb
            java.util.ArrayList<androidx.fragment.app.w$a> r8 = r7.f3309c
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e3:
            if (r8 < 0) goto L_0x0119
            java.util.ArrayList<androidx.fragment.app.w$a> r9 = r7.f3309c
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.w$a r9 = (androidx.fragment.app.w.a) r9
            androidx.fragment.app.Fragment r9 = r9.f3327b
            if (r9 == 0) goto L_0x00f8
            androidx.fragment.app.u r9 = r6.w(r9)
            r9.m()
        L_0x00f8:
            int r8 = r8 + -1
            goto L_0x00e3
        L_0x00fb:
            java.util.ArrayList<androidx.fragment.app.w$a> r7 = r7.f3309c
            java.util.Iterator r7 = r7.iterator()
        L_0x0101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.w$a r8 = (androidx.fragment.app.w.a) r8
            androidx.fragment.app.Fragment r8 = r8.f3327b
            if (r8 == 0) goto L_0x0101
            androidx.fragment.app.u r8 = r6.w(r8)
            r8.m()
            goto L_0x0101
        L_0x0119:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x011c:
            int r2 = r6.f3234q
            r6.Q0(r2, r1)
            java.util.Set r1 = r6.t(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0129:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.c0 r2 = (androidx.fragment.app.c0) r2
            r2.r(r0)
            r2.p()
            r2.g()
            goto L_0x0129
        L_0x013f:
            r0 = r3
            r3 = r5
            goto L_0x0199
        L_0x0143:
            if (r2 == 0) goto L_0x0165
            androidx.collection.b r7 = new androidx.collection.b
            r7.<init>()
            r6.d(r7)
            r0 = r17
            r14 = 1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.a1(r1, r2, r3, r4, r5)
            r6.O0(r7)
            goto L_0x016b
        L_0x0165:
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r14 = 1
            r0 = r13
        L_0x016b:
            if (r0 == r12) goto L_0x0197
            if (r8 == 0) goto L_0x0197
            int r1 = r6.f3234q
            if (r1 < r14) goto L_0x018e
            androidx.fragment.app.k<?> r1 = r6.f3235r
            android.content.Context r7 = r1.f()
            androidx.fragment.app.g r8 = r6.f3236s
            r1 = 1
            androidx.fragment.app.x$g r2 = r6.f3231n
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = 1
            r14 = r2
            androidx.fragment.app.x.B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0191
        L_0x018e:
            r3 = r11
            r0 = r13
            r1 = 1
        L_0x0191:
            int r2 = r6.f3234q
            r6.Q0(r2, r1)
            goto L_0x0199
        L_0x0197:
            r3 = r11
            r0 = r13
        L_0x0199:
            r1 = r20
        L_0x019b:
            if (r1 >= r0) goto L_0x01bc
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.a) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b6
            int r4 = r2.f3081v
            if (r4 < 0) goto L_0x01b6
            r4 = -1
            r2.f3081v = r4
        L_0x01b6:
            r2.z()
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01bc:
            if (r16 == 0) goto L_0x01c1
            r17.f1()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.e0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private void f0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<q> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar = this.L.get(i10);
            if (arrayList != null && !qVar.f3264a && (indexOf2 = arrayList.indexOf(qVar.f3265b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.L.remove(i10);
                i10--;
                size--;
                qVar.c();
            } else if (qVar.e() || (arrayList != null && qVar.f3265b.w(arrayList, 0, arrayList.size()))) {
                this.L.remove(i10);
                i10--;
                size--;
                if (arrayList == null || qVar.f3264a || (indexOf = arrayList.indexOf(qVar.f3265b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    qVar.d();
                } else {
                    qVar.c();
                }
            }
            i10++;
        }
    }

    private void f1() {
        if (this.f3229l != null) {
            for (int i10 = 0; i10 < this.f3229l.size(); i10++) {
                this.f3229l.get(i10).a();
            }
        }
    }

    static int h1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 4099) {
            return i10 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void k0() {
        if (P) {
            for (c0 k10 : s()) {
                k10.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private boolean l0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3218a) {
            if (this.f3218a.isEmpty()) {
                return false;
            }
            int size = this.f3218a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f3218a.get(i10).a(arrayList, arrayList2);
            }
            this.f3218a.clear();
            this.f3235r.g().removeCallbacks(this.N);
            return z10;
        }
    }

    private void n(Fragment fragment) {
        HashSet hashSet = this.f3230m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((androidx.core.os.f) it.next()).a();
            }
            hashSet.clear();
            x(fragment);
            this.f3230m.remove(fragment);
        }
    }

    private q n0(Fragment fragment) {
        return this.M.i(fragment);
    }

    private void n1(Fragment fragment) {
        ViewGroup p02 = p0(fragment);
        if (p02 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i10 = l0.b.f9807c;
            if (p02.getTag(i10) == null) {
                p02.setTag(i10, fragment);
            }
            ((Fragment) p02.getTag(i10)).setPopDirection(fragment.getPopDirection());
        }
    }

    private void p() {
        if (K0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup p0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f3236s.d()) {
            View c10 = this.f3236s.c(fragment.mContainerId);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    private void p1() {
        for (u V0 : this.f3220c.k()) {
            V0(V0);
        }
    }

    private void q() {
        this.f3219b = false;
        this.J.clear();
        this.I.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (m0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (I0(r3.f3237t) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.setEnabled(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f3225h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.n$o> r0 = r3.f3218a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.n$o> r1 = r3.f3218a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.e r1 = r3.f3225h     // Catch:{ all -> 0x002a }
            r1.setEnabled(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.e r0 = r3.f3225h
            int r1 = r3.m0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f3237t
            boolean r1 = r3.I0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.setEnabled(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.q1():void");
    }

    private Set<c0> s() {
        HashSet hashSet = new HashSet();
        for (u k10 : this.f3220c.k()) {
            ViewGroup viewGroup = k10.k().mContainer;
            if (viewGroup != null) {
                hashSet.add(c0.o(viewGroup, y0()));
            }
        }
        return hashSet;
    }

    private Set<c0> t(ArrayList<a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<w.a> it = arrayList.get(i10).f3309c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3327b;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(c0.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void v(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            f.d c10 = f.c(this.f3235r.f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (c10 == null || (animator = c10.f3194b) == null) {
                if (c10 != null) {
                    fragment.mView.startAnimation(c10.f3193a);
                    c10.f3193a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    c10.f3194b.addListener(new h(viewGroup, view, fragment));
                }
                c10.f3194b.start();
            }
        }
        D0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    private void x(Fragment fragment) {
        fragment.performDestroyView();
        this.f3232o.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    static Fragment z0(View view) {
        Object tag = view.getTag(l0.b.f9805a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(0);
    }

    /* access modifiers changed from: package-private */
    public k0 A0(Fragment fragment) {
        return this.M.l(fragment);
    }

    /* access modifiers changed from: package-private */
    public void B(Configuration configuration) {
        for (Fragment next : this.f3220c.n()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void B0() {
        b0(true);
        if (this.f3225h.isEnabled()) {
            X0();
        } else {
            this.f3224g.c();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean C(MenuItem menuItem) {
        if (this.f3234q < 1) {
            return false;
        }
        for (Fragment next : this.f3220c.n()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void C0(Fragment fragment) {
        if (F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            n1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(1);
    }

    /* access modifiers changed from: package-private */
    public void D0(Fragment fragment) {
        if (fragment.mAdded && G0(fragment)) {
            this.D = true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.f3234q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment next : this.f3220c.n()) {
            if (next != null && H0(next) && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z10 = true;
            }
        }
        if (this.f3222e != null) {
            for (int i10 = 0; i10 < this.f3222e.size(); i10++) {
                Fragment fragment = this.f3222e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.f3222e = arrayList;
        return z10;
    }

    public boolean E0() {
        return this.G;
    }

    /* access modifiers changed from: package-private */
    public void F() {
        this.G = true;
        b0(true);
        Y();
        T(-1);
        this.f3235r = null;
        this.f3236s = null;
        this.f3237t = null;
        if (this.f3224g != null) {
            this.f3225h.remove();
            this.f3224g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.f3243z;
        if (cVar != null) {
            cVar.d();
            this.A.d();
            this.B.d();
        }
    }

    /* access modifiers changed from: package-private */
    public void G() {
        T(1);
    }

    /* access modifiers changed from: package-private */
    public void H() {
        for (Fragment next : this.f3220c.n()) {
            if (next != null) {
                next.performLowMemory();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* access modifiers changed from: package-private */
    public void I(boolean z10) {
        for (Fragment next : this.f3220c.n()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.mFragmentManager;
        if (!fragment.equals(nVar.x0()) || !I0(nVar.f3237t)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void J(Fragment fragment) {
        Iterator<r> it = this.f3233p.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean J0(int i10) {
        return this.f3234q >= i10;
    }

    /* access modifiers changed from: package-private */
    public boolean K(MenuItem menuItem) {
        if (this.f3234q < 1) {
            return false;
        }
        for (Fragment next : this.f3220c.n()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean K0() {
        return this.E || this.F;
    }

    /* access modifiers changed from: package-private */
    public void L(Menu menu) {
        if (this.f3234q >= 1) {
            for (Fragment next : this.f3220c.n()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void L0(Fragment fragment, String[] strArr, int i10) {
        if (this.B != null) {
            this.C.addLast(new m(fragment.mWho, i10));
            this.B.b(strArr);
            return;
        }
        this.f3235r.j(fragment, strArr, i10);
    }

    /* access modifiers changed from: package-private */
    public void M0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.f3243z != null) {
            this.C.addLast(new m(fragment.mWho, i10));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f3243z.b(intent);
            return;
        }
        this.f3235r.m(fragment, intent, i10, bundle);
    }

    /* access modifiers changed from: package-private */
    public void N() {
        T(5);
    }

    /* access modifiers changed from: package-private */
    public void N0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Intent intent2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (this.A != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (F0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ActivityOptions ");
                    sb.append(bundle2);
                    sb.append(" were added to fillInIntent ");
                    sb.append(intent2);
                    sb.append(" for fragment ");
                    sb.append(fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            int i14 = i11;
            androidx.activity.result.e a10 = new e.b(intentSender).b(intent2).c(i12, i11).a();
            int i15 = i10;
            this.C.addLast(new m(fragment2.mWho, i10));
            if (F0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(fragment);
                sb2.append("is launching an IntentSender for result ");
            }
            this.A.b(a10);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i16 = i10;
        this.f3235r.n(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z10) {
        for (Fragment next : this.f3220c.n()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean P(Menu menu) {
        boolean z10 = false;
        if (this.f3234q < 1) {
            return false;
        }
        for (Fragment next : this.f3220c.n()) {
            if (next != null && H0(next) && next.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void P0(Fragment fragment) {
        if (this.f3220c.c(fragment.mWho)) {
            R0(fragment);
            View view = fragment.mView;
            if (!(view == null || !fragment.mIsNewlyAdded || fragment.mContainer == null)) {
                float f10 = fragment.mPostponedAlpha;
                if (f10 > 0.0f) {
                    view.setAlpha(f10);
                }
                fragment.mPostponedAlpha = 0.0f;
                fragment.mIsNewlyAdded = false;
                f.d c10 = f.c(this.f3235r.f(), fragment, true, fragment.getPopDirection());
                if (c10 != null) {
                    Animation animation = c10.f3193a;
                    if (animation != null) {
                        fragment.mView.startAnimation(animation);
                    } else {
                        c10.f3194b.setTarget(fragment.mView);
                        c10.f3194b.start();
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                v(fragment);
            }
        } else if (F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring moving ");
            sb.append(fragment);
            sb.append(" to state ");
            sb.append(this.f3234q);
            sb.append("since it is not added to ");
            sb.append(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        q1();
        M(this.f3238u);
    }

    /* access modifiers changed from: package-private */
    public void Q0(int i10, boolean z10) {
        k<?> kVar;
        if (this.f3235r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z10 || i10 != this.f3234q) {
            this.f3234q = i10;
            if (P) {
                this.f3220c.r();
            } else {
                for (Fragment P0 : this.f3220c.n()) {
                    P0(P0);
                }
                for (u next : this.f3220c.k()) {
                    Fragment k10 = next.k();
                    if (!k10.mIsNewlyAdded) {
                        P0(k10);
                    }
                    if (k10.mRemoving && !k10.isInBackStack()) {
                        this.f3220c.q(next);
                    }
                }
            }
            p1();
            if (this.D && (kVar = this.f3235r) != null && this.f3234q == 7) {
                kVar.o();
                this.D = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void R() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(7);
    }

    /* access modifiers changed from: package-private */
    public void R0(Fragment fragment) {
        S0(fragment, this.f3234q);
    }

    /* access modifiers changed from: package-private */
    public void S() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r2 != 5) goto L_0x0154;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S0(androidx.fragment.app.Fragment r10, int r11) {
        /*
            r9 = this;
            androidx.fragment.app.v r0 = r9.f3220c
            java.lang.String r1 = r10.mWho
            androidx.fragment.app.u r0 = r0.m(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.u r0 = new androidx.fragment.app.u
            androidx.fragment.app.m r2 = r9.f3232o
            androidx.fragment.app.v r3 = r9.f3220c
            r0.<init>(r2, r3, r10)
            r0.t(r1)
        L_0x0017:
            boolean r2 = r10.mFromLayout
            r3 = 2
            if (r2 == 0) goto L_0x0028
            boolean r2 = r10.mInLayout
            if (r2 == 0) goto L_0x0028
            int r2 = r10.mState
            if (r2 != r3) goto L_0x0028
            int r11 = java.lang.Math.max(r11, r3)
        L_0x0028:
            int r2 = r0.d()
            int r11 = java.lang.Math.min(r11, r2)
            int r2 = r10.mState
            r4 = 3
            r5 = -1
            r6 = 5
            r7 = 4
            if (r2 > r11) goto L_0x007a
            if (r2 >= r11) goto L_0x0045
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.f>> r2 = r9.f3230m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0045
            r9.n(r10)
        L_0x0045:
            int r2 = r10.mState
            if (r2 == r5) goto L_0x0055
            if (r2 == 0) goto L_0x005a
            if (r2 == r1) goto L_0x005f
            if (r2 == r3) goto L_0x0069
            if (r2 == r7) goto L_0x006e
            if (r2 == r6) goto L_0x0073
            goto L_0x0154
        L_0x0055:
            if (r11 <= r5) goto L_0x005a
            r0.c()
        L_0x005a:
            if (r11 <= 0) goto L_0x005f
            r0.e()
        L_0x005f:
            if (r11 <= r5) goto L_0x0064
            r0.j()
        L_0x0064:
            if (r11 <= r1) goto L_0x0069
            r0.f()
        L_0x0069:
            if (r11 <= r3) goto L_0x006e
            r0.a()
        L_0x006e:
            if (r11 <= r7) goto L_0x0073
            r0.u()
        L_0x0073:
            if (r11 <= r6) goto L_0x0154
            r0.p()
            goto L_0x0154
        L_0x007a:
            if (r2 <= r11) goto L_0x0154
            if (r2 == 0) goto L_0x014d
            if (r2 == r1) goto L_0x013f
            if (r2 == r3) goto L_0x00bd
            if (r2 == r7) goto L_0x0095
            if (r2 == r6) goto L_0x0090
            r8 = 7
            if (r2 == r8) goto L_0x008b
            goto L_0x0154
        L_0x008b:
            if (r11 >= r8) goto L_0x0090
            r0.n()
        L_0x0090:
            if (r11 >= r6) goto L_0x0095
            r0.v()
        L_0x0095:
            if (r11 >= r7) goto L_0x00bd
            boolean r2 = F0(r4)
            if (r2 == 0) goto L_0x00aa
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r2.append(r6)
            r2.append(r10)
        L_0x00aa:
            android.view.View r2 = r10.mView
            if (r2 == 0) goto L_0x00bd
            androidx.fragment.app.k<?> r2 = r9.f3235r
            boolean r2 = r2.k(r10)
            if (r2 == 0) goto L_0x00bd
            android.util.SparseArray<android.os.Parcelable> r2 = r10.mSavedViewState
            if (r2 != 0) goto L_0x00bd
            r0.s()
        L_0x00bd:
            if (r11 >= r3) goto L_0x013f
            r2 = 0
            android.view.View r6 = r10.mView
            if (r6 == 0) goto L_0x0134
            android.view.ViewGroup r7 = r10.mContainer
            if (r7 == 0) goto L_0x0134
            r7.endViewTransition(r6)
            android.view.View r6 = r10.mView
            r6.clearAnimation()
            boolean r6 = r10.isRemovingParent()
            if (r6 != 0) goto L_0x0134
            int r6 = r9.f3234q
            r7 = 0
            if (r6 <= r5) goto L_0x00fc
            boolean r5 = r9.G
            if (r5 != 0) goto L_0x00fc
            android.view.View r5 = r10.mView
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x00fc
            float r5 = r10.mPostponedAlpha
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x00fc
            androidx.fragment.app.k<?> r2 = r9.f3235r
            android.content.Context r2 = r2.f()
            r5 = 0
            boolean r6 = r10.getPopDirection()
            androidx.fragment.app.f$d r2 = androidx.fragment.app.f.c(r2, r10, r5, r6)
        L_0x00fc:
            r10.mPostponedAlpha = r7
            android.view.ViewGroup r5 = r10.mContainer
            android.view.View r6 = r10.mView
            if (r2 == 0) goto L_0x0109
            androidx.fragment.app.x$g r7 = r9.f3231n
            androidx.fragment.app.f.a(r10, r2, r7)
        L_0x0109:
            r5.removeView(r6)
            boolean r2 = F0(r3)
            if (r2 == 0) goto L_0x012f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removing view "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = " for fragment "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = " from container "
            r2.append(r3)
            r2.append(r5)
        L_0x012f:
            android.view.ViewGroup r2 = r10.mContainer
            if (r5 == r2) goto L_0x0134
            return
        L_0x0134:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.f>> r2 = r9.f3230m
            java.lang.Object r2 = r2.get(r10)
            if (r2 != 0) goto L_0x013f
            r0.h()
        L_0x013f:
            if (r11 >= r1) goto L_0x014d
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.f>> r2 = r9.f3230m
            java.lang.Object r2 = r2.get(r10)
            if (r2 == 0) goto L_0x014a
            goto L_0x014e
        L_0x014a:
            r0.g()
        L_0x014d:
            r1 = r11
        L_0x014e:
            if (r1 >= 0) goto L_0x0153
            r0.i()
        L_0x0153:
            r11 = r1
        L_0x0154:
            int r0 = r10.mState
            if (r0 == r11) goto L_0x017f
            boolean r0 = F0(r4)
            if (r0 == 0) goto L_0x017d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r10.mState
            r0.append(r1)
        L_0x017d:
            r10.mState = r11
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.S0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    public void T0() {
        if (this.f3235r != null) {
            this.E = false;
            this.F = false;
            this.M.o(false);
            for (Fragment next : this.f3220c.n()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void U() {
        this.F = true;
        this.M.o(true);
        T(4);
    }

    /* access modifiers changed from: package-private */
    public void U0(h hVar) {
        View view;
        for (u next : this.f3220c.k()) {
            Fragment k10 = next.k();
            if (k10.mContainerId == hVar.getId() && (view = k10.mView) != null && view.getParent() == null) {
                k10.mContainer = hVar;
                next.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        T(2);
    }

    /* access modifiers changed from: package-private */
    public void V0(u uVar) {
        Fragment k10 = uVar.k();
        if (!k10.mDeferStart) {
            return;
        }
        if (this.f3219b) {
            this.H = true;
            return;
        }
        k10.mDeferStart = false;
        if (P) {
            uVar.m();
        } else {
            R0(k10);
        }
    }

    public void W0(int i10, int i11) {
        if (i10 >= 0) {
            Z(new p((String) null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3220c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3222e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f3222e.get(i10).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f3221d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = this.f3221d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.p(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3226i.get());
        synchronized (this.f3218a) {
            int size3 = this.f3218a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(this.f3218a.get(i12));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3235r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3236s);
        if (this.f3237t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3237t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3234q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public boolean X0() {
        return Y0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void Z(o oVar, boolean z10) {
        if (!z10) {
            if (this.f3235r != null) {
                p();
            } else if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3218a) {
            if (this.f3235r != null) {
                this.f3218a.add(oVar);
                j1();
            } else if (!z10) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Z0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<a> arrayList3 = this.f3221d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3221d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.f3221d.get(size2);
                    if ((str != null && str.equals(aVar.u())) || (i10 >= 0 && i10 == aVar.f3081v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.f3221d.get(size2);
                        if ((str == null || !str.equals(aVar2.u())) && (i10 < 0 || i10 != aVar2.f3081v)) {
                            break;
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f3221d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3221d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f3221d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean b0(boolean z10) {
        a0(z10);
        boolean z11 = false;
        while (l0(this.I, this.J)) {
            this.f3219b = true;
            try {
                d1(this.I, this.J);
                q();
                z11 = true;
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        q1();
        W();
        this.f3220c.b();
        return z11;
    }

    /* access modifiers changed from: package-private */
    public void b1(Fragment fragment, androidx.core.os.f fVar) {
        HashSet hashSet = this.f3230m.get(fragment);
        if (hashSet != null && hashSet.remove(fVar) && hashSet.isEmpty()) {
            this.f3230m.remove(fragment);
            if (fragment.mState < 5) {
                x(fragment);
                R0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c0(o oVar, boolean z10) {
        if (!z10 || (this.f3235r != null && !this.G)) {
            a0(z10);
            if (oVar.a(this.I, this.J)) {
                this.f3219b = true;
                try {
                    d1(this.I, this.J);
                } finally {
                    q();
                }
            }
            q1();
            W();
            this.f3220c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void c1(Fragment fragment) {
        if (F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            this.f3220c.s(fragment);
            if (G0(fragment)) {
                this.D = true;
            }
            fragment.mRemoving = true;
            n1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        if (this.f3221d == null) {
            this.f3221d = new ArrayList<>();
        }
        this.f3221d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void e1(Fragment fragment) {
        this.M.n(fragment);
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, androidx.core.os.f fVar) {
        if (this.f3230m.get(fragment) == null) {
            this.f3230m.put(fragment, new HashSet());
        }
        this.f3230m.get(fragment).add(fVar);
    }

    /* access modifiers changed from: package-private */
    public u g(Fragment fragment) {
        if (F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
        }
        u w10 = w(fragment);
        fragment.mFragmentManager = this;
        this.f3220c.p(w10);
        if (!fragment.mDetached) {
            this.f3220c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (G0(fragment)) {
                this.D = true;
            }
        }
        return w10;
    }

    /* access modifiers changed from: package-private */
    public Fragment g0(String str) {
        return this.f3220c.f(str);
    }

    /* access modifiers changed from: package-private */
    public void g1(Parcelable parcelable) {
        u uVar;
        if (parcelable != null) {
            p pVar = (p) parcelable;
            if (pVar.f3267h != null) {
                this.f3220c.t();
                Iterator<t> it = pVar.f3267h.iterator();
                while (it.hasNext()) {
                    t next = it.next();
                    if (next != null) {
                        Fragment h10 = this.M.h(next.f3284i);
                        if (h10 != null) {
                            if (F0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("restoreSaveState: re-attaching retained ");
                                sb.append(h10);
                            }
                            uVar = new u(this.f3232o, this.f3220c, h10, next);
                        } else {
                            uVar = new u(this.f3232o, this.f3220c, this.f3235r.f().getClassLoader(), q0(), next);
                        }
                        Fragment k10 = uVar.k();
                        k10.mFragmentManager = this;
                        if (F0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("restoreSaveState: active (");
                            sb2.append(k10.mWho);
                            sb2.append("): ");
                            sb2.append(k10);
                        }
                        uVar.o(this.f3235r.f().getClassLoader());
                        this.f3220c.p(uVar);
                        uVar.t(this.f3234q);
                    }
                }
                for (Fragment next2 : this.M.k()) {
                    if (!this.f3220c.c(next2.mWho)) {
                        if (F0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Discarding retained Fragment ");
                            sb3.append(next2);
                            sb3.append(" that was not found in the set of active Fragments ");
                            sb3.append(pVar.f3267h);
                        }
                        this.M.n(next2);
                        next2.mFragmentManager = this;
                        u uVar2 = new u(this.f3232o, this.f3220c, next2);
                        uVar2.t(1);
                        uVar2.m();
                        next2.mRemoving = true;
                        uVar2.m();
                    }
                }
                this.f3220c.u(pVar.f3268i);
                if (pVar.f3269j != null) {
                    this.f3221d = new ArrayList<>(pVar.f3269j.length);
                    int i10 = 0;
                    while (true) {
                        b[] bVarArr = pVar.f3269j;
                        if (i10 >= bVarArr.length) {
                            break;
                        }
                        a b10 = bVarArr[i10].b(this);
                        if (F0(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("restoreAllState: back stack #");
                            sb4.append(i10);
                            sb4.append(" (index ");
                            sb4.append(b10.f3081v);
                            sb4.append("): ");
                            sb4.append(b10);
                            PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                            b10.q("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3221d.add(b10);
                        i10++;
                    }
                } else {
                    this.f3221d = null;
                }
                this.f3226i.set(pVar.f3270k);
                String str = pVar.f3271l;
                if (str != null) {
                    Fragment g02 = g0(str);
                    this.f3238u = g02;
                    M(g02);
                }
                ArrayList<String> arrayList = pVar.f3272m;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        Bundle bundle = pVar.f3273n.get(i11);
                        bundle.setClassLoader(this.f3235r.f().getClassLoader());
                        this.f3227j.put(arrayList.get(i11), bundle);
                    }
                }
                this.C = new ArrayDeque<>(pVar.f3274o);
            }
        }
    }

    public void h(r rVar) {
        this.f3233p.add(rVar);
    }

    public Fragment h0(int i10) {
        return this.f3220c.g(i10);
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment) {
        this.M.f(fragment);
    }

    public Fragment i0(String str) {
        return this.f3220c.h(str);
    }

    /* access modifiers changed from: package-private */
    public Parcelable i1() {
        int size;
        k0();
        Y();
        b0(true);
        this.E = true;
        this.M.o(true);
        ArrayList<t> v10 = this.f3220c.v();
        b[] bVarArr = null;
        if (v10.isEmpty()) {
            F0(2);
            return null;
        }
        ArrayList<String> w10 = this.f3220c.w();
        ArrayList<a> arrayList = this.f3221d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new b[size];
            for (int i10 = 0; i10 < size; i10++) {
                bVarArr[i10] = new b(this.f3221d.get(i10));
                if (F0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding back stack #");
                    sb.append(i10);
                    sb.append(": ");
                    sb.append(this.f3221d.get(i10));
                }
            }
        }
        p pVar = new p();
        pVar.f3267h = v10;
        pVar.f3268i = w10;
        pVar.f3269j = bVarArr;
        pVar.f3270k = this.f3226i.get();
        Fragment fragment = this.f3238u;
        if (fragment != null) {
            pVar.f3271l = fragment.mWho;
        }
        pVar.f3272m.addAll(this.f3227j.keySet());
        pVar.f3273n.addAll(this.f3227j.values());
        pVar.f3274o = new ArrayList<>(this.C);
        return pVar;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f3226i.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public Fragment j0(String str) {
        return this.f3220c.i(str);
    }

    /* access modifiers changed from: package-private */
    public void j1() {
        synchronized (this.f3218a) {
            ArrayList<q> arrayList = this.L;
            boolean z10 = false;
            boolean z11 = arrayList != null && !arrayList.isEmpty();
            if (this.f3218a.size() == 1) {
                z10 = true;
            }
            if (z11 || z10) {
                this.f3235r.g().removeCallbacks(this.N);
                this.f3235r.g().post(this.N);
                q1();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.activity.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(androidx.fragment.app.k<?> r3, androidx.fragment.app.g r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.k<?> r0 = r2.f3235r
            if (r0 != 0) goto L_0x0108
            r2.f3235r = r3
            r2.f3236s = r4
            r2.f3237t = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.n$i r4 = new androidx.fragment.app.n$i
            r4.<init>(r5)
            r2.h(r4)
            goto L_0x001f
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.r
            if (r4 == 0) goto L_0x001f
            r4 = r3
            androidx.fragment.app.r r4 = (androidx.fragment.app.r) r4
            r2.h(r4)
        L_0x001f:
            androidx.fragment.app.Fragment r4 = r2.f3237t
            if (r4 == 0) goto L_0x0026
            r2.q1()
        L_0x0026:
            boolean r4 = r3 instanceof androidx.activity.f
            if (r4 == 0) goto L_0x003b
            r4 = r3
            androidx.activity.f r4 = (androidx.activity.f) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f3224g = r0
            if (r5 == 0) goto L_0x0036
            r4 = r5
        L_0x0036:
            androidx.activity.e r1 = r2.f3225h
            r0.a(r4, r1)
        L_0x003b:
            if (r5 == 0) goto L_0x0046
            androidx.fragment.app.n r3 = r5.mFragmentManager
            androidx.fragment.app.q r3 = r3.n0(r5)
            r2.M = r3
            goto L_0x005f
        L_0x0046:
            boolean r4 = r3 instanceof androidx.lifecycle.l0
            if (r4 == 0) goto L_0x0057
            androidx.lifecycle.l0 r3 = (androidx.lifecycle.l0) r3
            androidx.lifecycle.k0 r3 = r3.getViewModelStore()
            androidx.fragment.app.q r3 = androidx.fragment.app.q.j(r3)
            r2.M = r3
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.q r3 = new androidx.fragment.app.q
            r4 = 0
            r3.<init>(r4)
            r2.M = r3
        L_0x005f:
            androidx.fragment.app.q r3 = r2.M
            boolean r4 = r2.K0()
            r3.o(r4)
            androidx.fragment.app.v r3 = r2.f3220c
            androidx.fragment.app.q r4 = r2.M
            r3.x(r4)
            androidx.fragment.app.k<?> r3 = r2.f3235r
            boolean r4 = r3 instanceof androidx.activity.result.d
            if (r4 == 0) goto L_0x0107
            androidx.activity.result.d r3 = (androidx.activity.result.d) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L_0x0091
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x0093
        L_0x0091:
            java.lang.String r4 = ""
        L_0x0093:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            e.c r0 = new e.c
            r0.<init>()
            androidx.fragment.app.n$j r1 = new androidx.fragment.app.n$j
            r1.<init>()
            androidx.activity.result.c r5 = r3.j(r5, r0, r1)
            r2.f3243z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.n$k r0 = new androidx.fragment.app.n$k
            r0.<init>()
            androidx.fragment.app.n$a r1 = new androidx.fragment.app.n$a
            r1.<init>()
            androidx.activity.result.c r5 = r3.j(r5, r0, r1)
            r2.A = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            e.b r5 = new e.b
            r5.<init>()
            androidx.fragment.app.n$b r0 = new androidx.fragment.app.n$b
            r0.<init>()
            androidx.activity.result.c r3 = r3.j(r4, r5, r0)
            r2.B = r3
        L_0x0107:
            return
        L_0x0108:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.k(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public void k1(Fragment fragment, boolean z10) {
        ViewGroup p02 = p0(fragment);
        if (p02 != null && (p02 instanceof h)) {
            ((h) p02).setDrawDisappearingViewsLast(!z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Fragment fragment) {
        if (F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f3220c.a(fragment);
                if (F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                }
                if (G0(fragment)) {
                    this.D = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l1(Fragment fragment, h.b bVar) {
        if (!fragment.equals(g0(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = bVar;
    }

    public w m() {
        return new a(this);
    }

    public int m0() {
        ArrayList<a> arrayList = this.f3221d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void m1(Fragment fragment) {
        if (fragment == null || (fragment.equals(g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f3238u;
            this.f3238u = fragment;
            M(fragment2);
            M(this.f3238u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        boolean z10 = false;
        for (Fragment next : this.f3220c.l()) {
            if (next != null) {
                z10 = G0(next);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public g o0() {
        return this.f3236s;
    }

    /* access modifiers changed from: package-private */
    public void o1(Fragment fragment) {
        if (F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public j q0() {
        j jVar = this.f3239v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.f3237t;
        if (fragment != null) {
            return fragment.mFragmentManager.q0();
        }
        return this.f3240w;
    }

    public final void r(String str) {
        this.f3227j.remove(str);
    }

    /* access modifiers changed from: package-private */
    public v r0() {
        return this.f3220c;
    }

    public List<Fragment> s0() {
        return this.f3220c.n();
    }

    /* access modifiers changed from: package-private */
    public k<?> t0() {
        return this.f3235r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3237t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3237t)));
            sb.append("}");
        } else {
            k<?> kVar = this.f3235r;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3235r)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void u(a aVar, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            aVar.s(z12);
        } else {
            aVar.r();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f3234q >= 1) {
            x.B(this.f3235r.f(), this.f3236s, arrayList, arrayList2, 0, 1, true, this.f3231n);
        }
        if (z12) {
            Q0(this.f3234q, true);
        }
        for (Fragment next : this.f3220c.l()) {
            if (next != null && next.mView != null && next.mIsNewlyAdded && aVar.v(next.mContainerId)) {
                float f10 = next.mPostponedAlpha;
                if (f10 > 0.0f) {
                    next.mView.setAlpha(f10);
                }
                if (z12) {
                    next.mPostponedAlpha = 0.0f;
                } else {
                    next.mPostponedAlpha = -1.0f;
                    next.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 u0() {
        return this.f3223f;
    }

    /* access modifiers changed from: package-private */
    public m v0() {
        return this.f3232o;
    }

    /* access modifiers changed from: package-private */
    public u w(Fragment fragment) {
        u m10 = this.f3220c.m(fragment.mWho);
        if (m10 != null) {
            return m10;
        }
        u uVar = new u(this.f3232o, this.f3220c, fragment);
        uVar.o(this.f3235r.f().getClassLoader());
        uVar.t(this.f3234q);
        return uVar;
    }

    /* access modifiers changed from: package-private */
    public Fragment w0() {
        return this.f3237t;
    }

    public Fragment x0() {
        return this.f3238u;
    }

    /* access modifiers changed from: package-private */
    public void y(Fragment fragment) {
        if (F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                }
                this.f3220c.s(fragment);
                if (G0(fragment)) {
                    this.D = true;
                }
                n1(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public d0 y0() {
        d0 d0Var = this.f3241x;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.f3237t;
        if (fragment != null) {
            return fragment.mFragmentManager.y0();
        }
        return this.f3242y;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(4);
    }

    @SuppressLint({"BanParcelableUsage"})
    /* compiled from: FragmentManager */
    static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        String f3258h;

        /* renamed from: i  reason: collision with root package name */
        int f3259i;

        /* compiled from: FragmentManager */
        class a implements Parcelable.Creator<m> {
            a() {
            }

            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            /* renamed from: b */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        m(String str, int i10) {
            this.f3258h = str;
            this.f3259i = i10;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f3258h);
            parcel.writeInt(this.f3259i);
        }

        m(Parcel parcel) {
            this.f3258h = parcel.readString();
            this.f3259i = parcel.readInt();
        }
    }
}
