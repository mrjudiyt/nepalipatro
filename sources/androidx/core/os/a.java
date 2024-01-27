package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* compiled from: BuildCompat.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2374a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final int f2375b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f2376c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f2377d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f2378e;

    /* renamed from: androidx.core.os.a$a  reason: collision with other inner class name */
    /* compiled from: BuildCompat.kt */
    private static final class C0035a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0035a f2379a = new C0035a();

        private C0035a() {
        }

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        f2375b = i10 >= 30 ? C0035a.f2379a.a(30) : 0;
        f2376c = i10 >= 30 ? C0035a.f2379a.a(31) : 0;
        f2377d = i10 >= 30 ? C0035a.f2379a.a(33) : 0;
        if (i10 >= 30) {
            i11 = C0035a.f2379a.a(1000000);
        }
        f2378e = i11;
    }

    private a() {
    }

    public static final boolean a(String str, String str2) {
        m.f(str, "codename");
        m.f(str2, "buildCodename");
        if (m.a("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        m.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        m.e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.compareTo(upperCase2) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            if (i10 >= 30) {
                String str = Build.VERSION.CODENAME;
                m.e(str, "CODENAME");
                if (a("S", str)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 34) {
            if (i10 >= 33) {
                String str = Build.VERSION.CODENAME;
                m.e(str, "CODENAME");
                if (a("UpsideDownCake", str)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
