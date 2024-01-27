package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private final j f3307a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f3308b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<a> f3309c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    int f3310d;

    /* renamed from: e  reason: collision with root package name */
    int f3311e;

    /* renamed from: f  reason: collision with root package name */
    int f3312f;

    /* renamed from: g  reason: collision with root package name */
    int f3313g;

    /* renamed from: h  reason: collision with root package name */
    int f3314h;

    /* renamed from: i  reason: collision with root package name */
    boolean f3315i;

    /* renamed from: j  reason: collision with root package name */
    boolean f3316j = true;

    /* renamed from: k  reason: collision with root package name */
    String f3317k;

    /* renamed from: l  reason: collision with root package name */
    int f3318l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f3319m;

    /* renamed from: n  reason: collision with root package name */
    int f3320n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f3321o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<String> f3322p;

    /* renamed from: q  reason: collision with root package name */
    ArrayList<String> f3323q;

    /* renamed from: r  reason: collision with root package name */
    boolean f3324r = false;

    /* renamed from: s  reason: collision with root package name */
    ArrayList<Runnable> f3325s;

    /* compiled from: FragmentTransaction */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f3326a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f3327b;

        /* renamed from: c  reason: collision with root package name */
        int f3328c;

        /* renamed from: d  reason: collision with root package name */
        int f3329d;

        /* renamed from: e  reason: collision with root package name */
        int f3330e;

        /* renamed from: f  reason: collision with root package name */
        int f3331f;

        /* renamed from: g  reason: collision with root package name */
        h.b f3332g;

        /* renamed from: h  reason: collision with root package name */
        h.b f3333h;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f3326a = i10;
            this.f3327b = fragment;
            h.b bVar = h.b.RESUMED;
            this.f3332g = bVar;
            this.f3333h = bVar;
        }
    }

    w(j jVar, ClassLoader classLoader) {
        this.f3307a = jVar;
        this.f3308b = classLoader;
    }

    public w b(int i10, Fragment fragment, String str) {
        k(i10, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public w c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public w d(Fragment fragment, String str) {
        k(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f3309c.add(aVar);
        aVar.f3328c = this.f3310d;
        aVar.f3329d = this.f3311e;
        aVar.f3330e = this.f3312f;
        aVar.f3331f = this.f3313g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public w j() {
        if (!this.f3315i) {
            this.f3316j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void k(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 == null || str.equals(str2)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i10 != 0) {
            if (i10 != -1) {
                int i12 = fragment.mFragmentId;
                if (i12 == 0 || i12 == i10) {
                    fragment.mFragmentId = i10;
                    fragment.mContainerId = i10;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        e(new a(i11, fragment));
    }

    public w l(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public w m(boolean z10) {
        this.f3324r = z10;
        return this;
    }
}
