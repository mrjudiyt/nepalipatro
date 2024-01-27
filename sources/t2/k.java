package t2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* compiled from: RequestManagerFragment */
public class k extends Fragment {

    /* renamed from: h  reason: collision with root package name */
    private final a f11606h;

    /* renamed from: i  reason: collision with root package name */
    private final m f11607i;

    /* renamed from: j  reason: collision with root package name */
    private final Set<k> f11608j;

    /* renamed from: k  reason: collision with root package name */
    private h f11609k;

    /* renamed from: l  reason: collision with root package name */
    private k f11610l;

    /* renamed from: m  reason: collision with root package name */
    private Fragment f11611m;

    /* compiled from: RequestManagerFragment */
    private class a implements m {
        a() {
        }

        public Set<h> a() {
            Set<k> b10 = k.this.b();
            HashSet hashSet = new HashSet(b10.size());
            for (k next : b10) {
                if (next.e() != null) {
                    hashSet.add(next.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        this(new a());
    }

    private void a(k kVar) {
        this.f11608j.add(kVar);
    }

    @TargetApi(17)
    private Fragment d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f11611m;
    }

    @TargetApi(17)
    private boolean g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(Activity activity) {
        l();
        k h10 = b.c(activity).k().h(activity);
        this.f11610l = h10;
        if (!equals(h10)) {
            this.f11610l.a(this);
        }
    }

    private void i(k kVar) {
        this.f11608j.remove(kVar);
    }

    private void l() {
        k kVar = this.f11610l;
        if (kVar != null) {
            kVar.i(this);
            this.f11610l = null;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(17)
    public Set<k> b() {
        if (equals(this.f11610l)) {
            return Collections.unmodifiableSet(this.f11608j);
        }
        if (this.f11610l == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (k next : this.f11610l.b()) {
            if (g(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    public a c() {
        return this.f11606h;
    }

    public h e() {
        return this.f11609k;
    }

    public m f() {
        return this.f11607i;
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment) {
        this.f11611m = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            h(fragment.getActivity());
        }
    }

    public void k(h hVar) {
        this.f11609k = hVar;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException unused) {
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f11606h.c();
        l();
    }

    public void onDetach() {
        super.onDetach();
        l();
    }

    public void onStart() {
        super.onStart();
        this.f11606h.d();
    }

    public void onStop() {
        super.onStop();
        this.f11606h.e();
    }

    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }

    @SuppressLint({"ValidFragment"})
    k(a aVar) {
        this.f11607i = new a();
        this.f11608j = new HashSet();
        this.f11606h = aVar;
    }
}
