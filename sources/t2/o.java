package t2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SupportRequestManagerFragment */
public class o extends Fragment {

    /* renamed from: h  reason: collision with root package name */
    private final a f11625h;

    /* renamed from: i  reason: collision with root package name */
    private final m f11626i;

    /* renamed from: j  reason: collision with root package name */
    private final Set<o> f11627j;

    /* renamed from: k  reason: collision with root package name */
    private o f11628k;

    /* renamed from: l  reason: collision with root package name */
    private h f11629l;

    /* renamed from: m  reason: collision with root package name */
    private Fragment f11630m;

    /* compiled from: SupportRequestManagerFragment */
    private class a implements m {
        a() {
        }

        public Set<h> a() {
            Set<o> b10 = o.this.b();
            HashSet hashSet = new HashSet(b10.size());
            for (o next : b10) {
                if (next.e() != null) {
                    hashSet.add(next.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        this(new a());
    }

    private void a(o oVar) {
        this.f11627j.add(oVar);
    }

    private Fragment d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f11630m;
    }

    private static n g(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private boolean h(Fragment fragment) {
        Fragment d10 = d();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(d10)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void i(Context context, n nVar) {
        m();
        o j10 = b.c(context).k().j(context, nVar);
        this.f11628k = j10;
        if (!equals(j10)) {
            this.f11628k.a(this);
        }
    }

    private void j(o oVar) {
        this.f11627j.remove(oVar);
    }

    private void m() {
        o oVar = this.f11628k;
        if (oVar != null) {
            oVar.j(this);
            this.f11628k = null;
        }
    }

    /* access modifiers changed from: package-private */
    public Set<o> b() {
        o oVar = this.f11628k;
        if (oVar == null) {
            return Collections.emptySet();
        }
        if (equals(oVar)) {
            return Collections.unmodifiableSet(this.f11627j);
        }
        HashSet hashSet = new HashSet();
        for (o next : this.f11628k.b()) {
            if (h(next.d())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    public a c() {
        return this.f11625h;
    }

    public h e() {
        return this.f11629l;
    }

    public m f() {
        return this.f11626i;
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment) {
        n g10;
        this.f11630m = fragment;
        if (fragment != null && fragment.getContext() != null && (g10 = g(fragment)) != null) {
            i(fragment.getContext(), g10);
        }
    }

    public void l(h hVar) {
        this.f11629l = hVar;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        n g10 = g(this);
        if (g10 != null) {
            try {
                i(getContext(), g10);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f11625h.c();
        m();
    }

    public void onDetach() {
        super.onDetach();
        this.f11630m = null;
        m();
    }

    public void onStart() {
        super.onStart();
        this.f11625h.d();
    }

    public void onStop() {
        super.onStop();
        this.f11625h.e();
    }

    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public o(a aVar) {
        this.f11626i = new a();
        this.f11627j = new HashSet();
        this.f11625h = aVar;
    }
}
