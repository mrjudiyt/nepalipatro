package m1;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* compiled from: Version.kt */
public final class h implements Comparable<h> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f10179m = new a((g) null);

    /* renamed from: n  reason: collision with root package name */
    private static final h f10180n = new h(0, 0, 0, "");
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final h f10181o = new h(0, 1, 0, "");

    /* renamed from: p  reason: collision with root package name */
    private static final h f10182p;

    /* renamed from: q  reason: collision with root package name */
    private static final h f10183q;

    /* renamed from: h  reason: collision with root package name */
    private final int f10184h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10185i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10186j;

    /* renamed from: k  reason: collision with root package name */
    private final String f10187k;

    /* renamed from: l  reason: collision with root package name */
    private final o8.g f10188l;

    /* compiled from: Version.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final h a() {
            return h.f10181o;
        }

        public final h b(String str) {
            if (str == null || p.o(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String group = matcher.group(1);
            Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
            if (valueOf == null) {
                return null;
            }
            int intValue = valueOf.intValue();
            String group2 = matcher.group(2);
            Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
            if (valueOf2 == null) {
                return null;
            }
            int intValue2 = valueOf2.intValue();
            String group3 = matcher.group(3);
            Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
            if (valueOf3 == null) {
                return null;
            }
            int intValue3 = valueOf3.intValue();
            String group4 = matcher.group(4) != null ? matcher.group(4) : "";
            m.e(group4, "description");
            return new h(intValue, intValue2, intValue3, group4, (g) null);
        }
    }

    /* compiled from: Version.kt */
    static final class b extends n implements y8.a<BigInteger> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f10189h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar) {
            super(0);
            this.f10189h = hVar;
        }

        /* renamed from: a */
        public final BigInteger invoke() {
            return BigInteger.valueOf((long) this.f10189h.f()).shiftLeft(32).or(BigInteger.valueOf((long) this.f10189h.g())).shiftLeft(32).or(BigInteger.valueOf((long) this.f10189h.k()));
        }
    }

    static {
        h hVar = new h(1, 0, 0, "");
        f10182p = hVar;
        f10183q = hVar;
    }

    private h(int i10, int i11, int i12, String str) {
        this.f10184h = i10;
        this.f10185i = i11;
        this.f10186j = i12;
        this.f10187k = str;
        this.f10188l = i.a(new b(this));
    }

    public /* synthetic */ h(int i10, int i11, int i12, String str, g gVar) {
        this(i10, i11, i12, str);
    }

    private final BigInteger e() {
        Object value = this.f10188l.getValue();
        m.e(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    /* renamed from: d */
    public int compareTo(h hVar) {
        m.f(hVar, "other");
        return e().compareTo(hVar.e());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f10184h == hVar.f10184h && this.f10185i == hVar.f10185i && this.f10186j == hVar.f10186j) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f10184h;
    }

    public final int g() {
        return this.f10185i;
    }

    public int hashCode() {
        return ((((527 + this.f10184h) * 31) + this.f10185i) * 31) + this.f10186j;
    }

    public final int k() {
        return this.f10186j;
    }

    public String toString() {
        String o10 = p.o(this.f10187k) ^ true ? m.o("-", this.f10187k) : "";
        return this.f10184h + '.' + this.f10185i + '.' + this.f10186j + o10;
    }
}
