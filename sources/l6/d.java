package l6;

/* compiled from: CharMatcher */
public abstract class d implements q<Character> {

    /* compiled from: CharMatcher */
    static abstract class a extends d {
        a() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return d.super.b((Character) obj);
        }
    }

    /* compiled from: CharMatcher */
    private static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final char f15599a;

        b(char c10) {
            this.f15599a = c10;
        }

        public boolean e(char c10) {
            return c10 == this.f15599a;
        }

        public String toString() {
            String a10 = d.g(this.f15599a);
            StringBuilder sb = new StringBuilder(String.valueOf(a10).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(a10);
            sb.append("')");
            return sb.toString();
        }
    }

    /* compiled from: CharMatcher */
    static abstract class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private final String f15600a;

        c(String str) {
            this.f15600a = (String) p.j(str);
        }

        public final String toString() {
            return this.f15600a;
        }
    }

    /* renamed from: l6.d$d  reason: collision with other inner class name */
    /* compiled from: CharMatcher */
    private static final class C0261d extends c {

        /* renamed from: b  reason: collision with root package name */
        static final C0261d f15601b = new C0261d();

        private C0261d() {
            super("CharMatcher.none()");
        }

        public int c(CharSequence charSequence, int i10) {
            p.l(i10, charSequence.length());
            return -1;
        }

        public boolean e(char c10) {
            return false;
        }
    }

    protected d() {
    }

    public static d d(char c10) {
        return new b(c10);
    }

    public static d f() {
        return C0261d.f15601b;
    }

    /* access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        p.l(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
