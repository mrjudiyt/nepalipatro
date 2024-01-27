package l6;

import java.util.logging.Logger;

/* compiled from: Platform */
final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f15619a = Logger.getLogger(o.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final n f15620b = b();

    /* compiled from: Platform */
    private static final class b implements n {
        private b() {
        }
    }

    private o() {
    }

    static String a(String str) {
        if (c(str)) {
            return null;
        }
        return str;
    }

    private static n b() {
        return new b();
    }

    static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
