package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: FragmentStore */
class v {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Fragment> f3304a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, u> f3305b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private q f3306c;

    v() {
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.f3304a.contains(fragment)) {
            synchronized (this.f3304a) {
                this.f3304a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f3305b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f3305b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    public void d(int i10) {
        for (u next : this.f3305b.values()) {
            if (next != null) {
                next.t(i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3305b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (u next : this.f3305b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k10 = next.k();
                    printWriter.println(k10);
                    k10.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3304a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f3304a.get(i10).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment f(String str) {
        u uVar = this.f3305b.get(str);
        if (uVar != null) {
            return uVar.k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment g(int i10) {
        for (int size = this.f3304a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3304a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (u next : this.f3305b.values()) {
            if (next != null) {
                Fragment k10 = next.k();
                if (k10.mFragmentId == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f3304a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3304a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (u next : this.f3305b.values()) {
            if (next != null) {
                Fragment k10 = next.k();
                if (str.equals(k10.mTag)) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment findFragmentByWho;
        for (u next : this.f3305b.values()) {
            if (next != null && (findFragmentByWho = next.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3304a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f3304a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f3304a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3304a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<u> k() {
        ArrayList arrayList = new ArrayList();
        for (u next : this.f3305b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (u next : this.f3305b.values()) {
            if (next != null) {
                arrayList.add(next.k());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public u m(String str) {
        return this.f3305b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.f3304a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3304a) {
            arrayList = new ArrayList(this.f3304a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public q o() {
        return this.f3306c;
    }

    /* access modifiers changed from: package-private */
    public void p(u uVar) {
        Fragment k10 = uVar.k();
        if (!c(k10.mWho)) {
            this.f3305b.put(k10.mWho, uVar);
            if (k10.mRetainInstanceChangedWhileDetached) {
                if (k10.mRetainInstance) {
                    this.f3306c.f(k10);
                } else {
                    this.f3306c.n(k10);
                }
                k10.mRetainInstanceChangedWhileDetached = false;
            }
            if (n.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(k10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(u uVar) {
        Fragment k10 = uVar.k();
        if (k10.mRetainInstance) {
            this.f3306c.n(k10);
        }
        if (this.f3305b.put(k10.mWho, (Object) null) != null && n.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(k10);
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        Iterator<Fragment> it = this.f3304a.iterator();
        while (it.hasNext()) {
            u uVar = this.f3305b.get(it.next().mWho);
            if (uVar != null) {
                uVar.m();
            }
        }
        for (u next : this.f3305b.values()) {
            if (next != null) {
                next.m();
                Fragment k10 = next.k();
                if (k10.mRemoving && !k10.isInBackStack()) {
                    q(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Fragment fragment) {
        synchronized (this.f3304a) {
            this.f3304a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f3305b.clear();
    }

    /* access modifiers changed from: package-private */
    public void u(List<String> list) {
        this.f3304a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f10 = f(next);
                if (f10 != null) {
                    if (n.F0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: added (");
                        sb.append(next);
                        sb.append("): ");
                        sb.append(f10);
                    }
                    a(f10);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<t> v() {
        ArrayList<t> arrayList = new ArrayList<>(this.f3305b.size());
        for (u next : this.f3305b.values()) {
            if (next != null) {
                Fragment k10 = next.k();
                t r10 = next.r();
                arrayList.add(r10);
                if (n.F0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(k10);
                    sb.append(": ");
                    sb.append(r10.f3295t);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> w() {
        synchronized (this.f3304a) {
            if (this.f3304a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3304a.size());
            Iterator<Fragment> it = this.f3304a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (n.F0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(next.mWho);
                    sb.append("): ");
                    sb.append(next);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public void x(q qVar) {
        this.f3306c = qVar;
    }
}
