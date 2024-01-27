package androidx.fragment.app;

import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel */
final class q extends g0 {

    /* renamed from: k  reason: collision with root package name */
    private static final h0.b f3275k = new a();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Fragment> f3276d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, q> f3277e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, k0> f3278f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3279g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3280h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3281i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3282j = false;

    /* compiled from: FragmentManagerViewModel */
    class a implements h0.b {
        a() {
        }

        public <T extends g0> T a(Class<T> cls) {
            return new q(true);
        }

        public /* synthetic */ g0 b(Class cls, p0.a aVar) {
            return i0.b(this, cls, aVar);
        }
    }

    q(boolean z10) {
        this.f3279g = z10;
    }

    static q j(k0 k0Var) {
        return (q) new h0(k0Var, f3275k).a(q.class);
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f3280h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f3276d.equals(qVar.f3276d) || !this.f3277e.equals(qVar.f3277e) || !this.f3278f.equals(qVar.f3278f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (this.f3282j) {
            n.F0(2);
        } else if (!this.f3276d.containsKey(fragment.mWho)) {
            this.f3276d.put(fragment.mWho, fragment);
            if (n.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updating retained Fragments: Added ");
                sb.append(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        q qVar = this.f3277e.get(fragment.mWho);
        if (qVar != null) {
            qVar.d();
            this.f3277e.remove(fragment.mWho);
        }
        k0 k0Var = this.f3278f.get(fragment.mWho);
        if (k0Var != null) {
            k0Var.a();
            this.f3278f.remove(fragment.mWho);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        return this.f3276d.get(str);
    }

    public int hashCode() {
        return (((this.f3276d.hashCode() * 31) + this.f3277e.hashCode()) * 31) + this.f3278f.hashCode();
    }

    /* access modifiers changed from: package-private */
    public q i(Fragment fragment) {
        q qVar = this.f3277e.get(fragment.mWho);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f3279g);
        this.f3277e.put(fragment.mWho, qVar2);
        return qVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> k() {
        return new ArrayList(this.f3276d.values());
    }

    /* access modifiers changed from: package-private */
    public k0 l(Fragment fragment) {
        k0 k0Var = this.f3278f.get(fragment.mWho);
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0();
        this.f3278f.put(fragment.mWho, k0Var2);
        return k0Var2;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f3280h;
    }

    /* access modifiers changed from: package-private */
    public void n(Fragment fragment) {
        if (this.f3282j) {
            n.F0(2);
            return;
        }
        if ((this.f3276d.remove(fragment.mWho) != null) && n.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z10) {
        this.f3282j = z10;
    }

    /* access modifiers changed from: package-private */
    public boolean p(Fragment fragment) {
        if (!this.f3276d.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f3279g) {
            return this.f3280h;
        }
        return !this.f3281i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3276d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3277e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3278f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
