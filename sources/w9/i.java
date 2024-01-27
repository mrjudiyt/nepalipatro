package w9;

/* compiled from: StringUtils.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f17064a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f17065b = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          "};

    private i() {
    }

    public final boolean a(String str) {
        if (!(str == null || str.length() == 0)) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (!b(str.codePointAt(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean b(int i10) {
        return i10 == 32 || i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13;
    }
}
