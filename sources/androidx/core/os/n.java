package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper */
final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f2400a;

    n(Object obj) {
        this.f2400a = (LocaleList) obj;
    }

    public Object a() {
        return this.f2400a;
    }

    public boolean equals(Object obj) {
        return this.f2400a.equals(((m) obj).a());
    }

    public Locale get(int i10) {
        return this.f2400a.get(i10);
    }

    public int hashCode() {
        return this.f2400a.hashCode();
    }

    public String toString() {
        return this.f2400a.toString();
    }
}
