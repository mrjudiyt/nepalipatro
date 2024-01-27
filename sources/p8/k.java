package p8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: _Arrays.kt */
class k extends j {
    public static final <T> Set<T> A(T[] tArr) {
        m.f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return m0.b();
        }
        if (length != 1) {
            return (Set) w(tArr, new LinkedHashSet(g0.a(tArr.length)));
        }
        return l0.a(tArr[0]);
    }

    public static <T> boolean l(T[] tArr, T t10) {
        m.f(tArr, "<this>");
        return s(tArr, t10) >= 0;
    }

    public static <T> List<T> m(T[] tArr, int i10) {
        m.f(tArr, "<this>");
        if (i10 >= 0) {
            return v(tArr, l.a(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> n(T[] tArr) {
        m.f(tArr, "<this>");
        return (List) o(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C o(T[] tArr, C c10) {
        m.f(tArr, "<this>");
        m.f(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static <T> T p(T[] tArr) {
        m.f(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int q(int[] iArr) {
        m.f(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final <T> int r(T[] tArr) {
        m.f(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final <T> int s(T[] tArr, T t10) {
        m.f(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (m.a(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static char t(char[] cArr) {
        m.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> T u(T[] tArr) {
        m.f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> List<T> v(T[] tArr, int i10) {
        m.f(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return p.e();
        } else {
            int length = tArr.length;
            if (i10 >= length) {
                return y(tArr);
            }
            if (i10 == 1) {
                return o.b(tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(tArr[i11]);
            }
            return arrayList;
        }
    }

    public static final <T, C extends Collection<? super T>> C w(T[] tArr, C c10) {
        m.f(tArr, "<this>");
        m.f(c10, "destination");
        for (T add : tArr) {
            c10.add(add);
        }
        return c10;
    }

    public static <T> HashSet<T> x(T[] tArr) {
        m.f(tArr, "<this>");
        return (HashSet) w(tArr, new HashSet(g0.a(tArr.length)));
    }

    public static <T> List<T> y(T[] tArr) {
        m.f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return p.e();
        }
        if (length != 1) {
            return z(tArr);
        }
        return o.b(tArr[0]);
    }

    public static final <T> List<T> z(T[] tArr) {
        m.f(tArr, "<this>");
        return new ArrayList(p.d(tArr));
    }
}
