package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    private static final k f2392b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    private final m f2393a;

    /* compiled from: LocaleListCompat */
    static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private k(m mVar) {
        this.f2393a = mVar;
    }

    public static k a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e(a.a(localeArr));
        }
        return new k(new l(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static k e(LocaleList localeList) {
        return new k(new n(localeList));
    }

    public Locale c(int i10) {
        return this.f2393a.get(i10);
    }

    public Object d() {
        return this.f2393a.a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && this.f2393a.equals(((k) obj).f2393a);
    }

    public int hashCode() {
        return this.f2393a.hashCode();
    }

    public String toString() {
        return this.f2393a.toString();
    }
}
