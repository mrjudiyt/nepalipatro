package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper */
final class l implements m {

    /* renamed from: c  reason: collision with root package name */
    private static final Locale[] f2394c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    private static final Locale f2395d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    private static final Locale f2396e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    private static final Locale f2397f = k.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    private final Locale[] f2398a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2399b;

    l(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f2398a = f2394c;
            this.f2399b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (i10 < localeArr.length) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i10++;
            } else {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
        }
        this.f2398a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f2399b = sb.toString();
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        Locale[] localeArr = ((l) obj).f2398a;
        if (this.f2398a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f2398a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f2398a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        for (Locale hashCode : this.f2398a) {
            i10 = (i10 * 31) + hashCode.hashCode();
        }
        return i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f2398a;
            if (i10 < localeArr.length) {
                sb.append(localeArr[i10]);
                if (i10 < this.f2398a.length - 1) {
                    sb.append(',');
                }
                i10++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
