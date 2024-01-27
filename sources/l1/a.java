package l1;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ApiFeature */
public abstract class a implements g {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<a> f9820c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final String f9821a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9822b;

    /* renamed from: l1.a$a  reason: collision with other inner class name */
    /* compiled from: ApiFeature */
    private static class C0161a {

        /* renamed from: a  reason: collision with root package name */
        static final Set<String> f9823a = new HashSet(Arrays.asList(n.d().a()));
    }

    /* compiled from: ApiFeature */
    public static class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    /* compiled from: ApiFeature */
    public static class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* compiled from: ApiFeature */
    public static class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return false;
        }
    }

    /* compiled from: ApiFeature */
    public static class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* compiled from: ApiFeature */
    public static class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* compiled from: ApiFeature */
    public static class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* compiled from: ApiFeature */
    public static class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* compiled from: ApiFeature */
    public static class i extends a {
        i(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f9821a = str;
        this.f9822b = str2;
        f9820c.add(this);
    }

    public static Set<a> e() {
        return Collections.unmodifiableSet(f9820c);
    }

    public String a() {
        return this.f9821a;
    }

    public boolean b() {
        return c() || d();
    }

    public abstract boolean c();

    public boolean d() {
        return ga.a.b(C0161a.f9823a, this.f9822b);
    }
}
