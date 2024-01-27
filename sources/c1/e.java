package c1;

/* compiled from: StringUtil */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f5156a = new String[0];

    public static void a(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("?");
            if (i11 < i10 - 1) {
                sb.append(",");
            }
        }
    }

    public static StringBuilder b() {
        return new StringBuilder();
    }
}
