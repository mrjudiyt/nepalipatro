package l6;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* compiled from: Preconditions */
public final class p {
    private static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return t.c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        } else if (i11 >= 0) {
            return t.c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i11);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return t.c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        } else if (i11 >= 0) {
            return t.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i11);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static String c(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i12) {
            return b(i10, i12, "start index");
        }
        if (i11 < 0 || i11 > i12) {
            return b(i11, i12, "end index");
        }
        return t.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(t.c(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void g(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(t.c(str, Long.valueOf(j10)));
        }
    }

    public static int h(int i10, int i11) {
        return i(i10, i11, FirebaseAnalytics.Param.INDEX);
    }

    public static int i(int i10, int i11, String str) {
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(a(i10, i11, str));
    }

    public static <T> T j(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T k(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int l(int i10, int i11) {
        return m(i10, i11, FirebaseAnalytics.Param.INDEX);
    }

    public static int m(int i10, int i11, String str) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(b(i10, i11, str));
    }

    public static void n(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(c(i10, i11, i12));
        }
    }

    public static void o(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void p(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void q(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalStateException(t.c(str, Integer.valueOf(i10)));
        }
    }

    public static void r(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(t.c(str, obj));
        }
    }
}
