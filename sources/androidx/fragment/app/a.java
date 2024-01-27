package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.w;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord */
final class a extends w implements n.o {

    /* renamed from: t  reason: collision with root package name */
    final n f3079t;

    /* renamed from: u  reason: collision with root package name */
    boolean f3080u;

    /* renamed from: v  reason: collision with root package name */
    int f3081v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a(n nVar) {
        super(nVar.q0(), nVar.t0() != null ? nVar.t0().f().getClassLoader() : null);
        this.f3081v = -1;
        this.f3079t = nVar;
    }

    private static boolean x(w.a aVar) {
        Fragment fragment = aVar.f3327b;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    /* access modifiers changed from: package-private */
    public void A(Fragment.k kVar) {
        for (int i10 = 0; i10 < this.f3309c.size(); i10++) {
            w.a aVar = this.f3309c.get(i10);
            if (x(aVar)) {
                aVar.f3327b.setOnStartEnterTransitionListener(kVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment B(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3309c.size() - 1; size >= 0; size--) {
            w.a aVar = this.f3309c.get(size);
            int i10 = aVar.f3326a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3327b;
                            break;
                        case 10:
                            aVar.f3333h = aVar.f3332g;
                            break;
                    }
                }
                arrayList.add(aVar.f3327b);
            }
            arrayList.remove(aVar.f3327b);
        }
        return fragment;
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3315i) {
            return true;
        }
        this.f3079t.e(this);
        return true;
    }

    public int f() {
        return o(false);
    }

    public int g() {
        return o(true);
    }

    public void h() {
        j();
        this.f3079t.c0(this, false);
    }

    public void i() {
        j();
        this.f3079t.c0(this, true);
    }

    /* access modifiers changed from: package-private */
    public void k(int i10, Fragment fragment, String str, int i11) {
        super.k(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f3079t;
    }

    public w l(Fragment fragment) {
        n nVar = fragment.mFragmentManager;
        if (nVar == null || nVar == this.f3079t) {
            return super.l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void n(int i10) {
        if (this.f3315i) {
            if (n.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i10);
            }
            int size = this.f3309c.size();
            for (int i11 = 0; i11 < size; i11++) {
                w.a aVar = this.f3309c.get(i11);
                Fragment fragment = aVar.f3327b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (n.F0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f3327b);
                        sb2.append(" to ");
                        sb2.append(aVar.f3327b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int o(boolean z10) {
        if (!this.f3080u) {
            if (n.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                p("  ", printWriter);
                printWriter.close();
            }
            this.f3080u = true;
            if (this.f3315i) {
                this.f3081v = this.f3079t.j();
            } else {
                this.f3081v = -1;
            }
            this.f3079t.Z(this, z10);
            return this.f3081v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void p(String str, PrintWriter printWriter) {
        q(str, printWriter, true);
    }

    public void q(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3317k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3081v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3080u);
            if (this.f3314h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3314h));
            }
            if (!(this.f3310d == 0 && this.f3311e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3310d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3311e));
            }
            if (!(this.f3312f == 0 && this.f3313g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3312f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3313g));
            }
            if (!(this.f3318l == 0 && this.f3319m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3318l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3319m);
            }
            if (!(this.f3320n == 0 && this.f3321o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3320n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3321o);
            }
        }
        if (!this.f3309c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3309c.size();
            for (int i10 = 0; i10 < size; i10++) {
                w.a aVar = this.f3309c.get(i10);
                switch (aVar.f3326a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3326a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3327b);
                if (z10) {
                    if (!(aVar.f3328c == 0 && aVar.f3329d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3328c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3329d));
                    }
                    if (aVar.f3330e != 0 || aVar.f3331f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3330e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3331f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        int size = this.f3309c.size();
        for (int i10 = 0; i10 < size; i10++) {
            w.a aVar = this.f3309c.get(i10);
            Fragment fragment = aVar.f3327b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f3314h);
                fragment.setSharedElementNames(this.f3322p, this.f3323q);
            }
            switch (aVar.f3326a) {
                case 1:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.k1(fragment, false);
                    this.f3079t.g(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.c1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.C0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.k1(fragment, false);
                    this.f3079t.o1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.y(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.k1(fragment, false);
                    this.f3079t.l(fragment);
                    break;
                case 8:
                    this.f3079t.m1(fragment);
                    break;
                case 9:
                    this.f3079t.m1((Fragment) null);
                    break;
                case 10:
                    this.f3079t.l1(fragment, aVar.f3333h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3326a);
            }
            if (!this.f3324r && aVar.f3326a != 1 && fragment != null && !n.P) {
                this.f3079t.P0(fragment);
            }
        }
        if (!this.f3324r && !n.P) {
            n nVar = this.f3079t;
            nVar.Q0(nVar.f3234q, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        for (int size = this.f3309c.size() - 1; size >= 0; size--) {
            w.a aVar = this.f3309c.get(size);
            Fragment fragment = aVar.f3327b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(n.h1(this.f3314h));
                fragment.setSharedElementNames(this.f3323q, this.f3322p);
            }
            switch (aVar.f3326a) {
                case 1:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.k1(fragment, true);
                    this.f3079t.c1(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.o1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.k1(fragment, true);
                    this.f3079t.C0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3328c, aVar.f3329d, aVar.f3330e, aVar.f3331f);
                    this.f3079t.k1(fragment, true);
                    this.f3079t.y(fragment);
                    break;
                case 8:
                    this.f3079t.m1((Fragment) null);
                    break;
                case 9:
                    this.f3079t.m1(fragment);
                    break;
                case 10:
                    this.f3079t.l1(fragment, aVar.f3332g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3326a);
            }
            if (!this.f3324r && aVar.f3326a != 3 && fragment != null && !n.P) {
                this.f3079t.P0(fragment);
            }
        }
        if (!this.f3324r && z10 && !n.P) {
            n nVar = this.f3079t;
            nVar.Q0(nVar.f3234q, true);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment t(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f3309c.size()) {
            w.a aVar = this.f3309c.get(i10);
            int i11 = aVar.f3326a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f3327b;
                    int i12 = fragment3.mContainerId;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.mContainerId == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3309c.add(i10, new w.a(9, fragment4));
                                    i10++;
                                    fragment2 = null;
                                }
                                w.a aVar2 = new w.a(3, fragment4);
                                aVar2.f3328c = aVar.f3328c;
                                aVar2.f3330e = aVar.f3330e;
                                aVar2.f3329d = aVar.f3329d;
                                aVar2.f3331f = aVar.f3331f;
                                this.f3309c.add(i10, aVar2);
                                arrayList2.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f3309c.remove(i10);
                        i10--;
                    } else {
                        aVar.f3326a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList2.remove(aVar.f3327b);
                    Fragment fragment5 = aVar.f3327b;
                    if (fragment5 == fragment2) {
                        this.f3309c.add(i10, new w.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f3309c.add(i10, new w.a(9, fragment2));
                        i10++;
                        fragment2 = aVar.f3327b;
                    }
                }
                i10++;
            }
            arrayList2.add(aVar.f3327b);
            i10++;
        }
        return fragment2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3081v >= 0) {
            sb.append(" #");
            sb.append(this.f3081v);
        }
        if (this.f3317k != null) {
            sb.append(" ");
            sb.append(this.f3317k);
        }
        sb.append("}");
        return sb.toString();
    }

    public String u() {
        return this.f3317k;
    }

    /* access modifiers changed from: package-private */
    public boolean v(int i10) {
        int size = this.f3309c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f3309c.get(i11).f3327b;
            int i12 = fragment != null ? fragment.mContainerId : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean w(ArrayList<a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f3309c.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f3309c.get(i13).f3327b;
            int i14 = fragment != null ? fragment.mContainerId : 0;
            if (!(i14 == 0 || i14 == i12)) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = arrayList.get(i15);
                    int size2 = aVar.f3309c.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = aVar.f3309c.get(i16).f3327b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        for (int i10 = 0; i10 < this.f3309c.size(); i10++) {
            if (x(this.f3309c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void z() {
        if (this.f3325s != null) {
            for (int i10 = 0; i10 < this.f3325s.size(); i10++) {
                this.f3325s.get(i10).run();
            }
            this.f3325s = null;
        }
    }
}
