package g9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Regex.kt */
public final class f implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final a f14775i = new a((g) null);

    /* renamed from: h  reason: collision with root package name */
    private final Pattern f14776h;

    /* compiled from: Regex.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* compiled from: Regex.kt */
    private static final class b implements Serializable {

        /* renamed from: j  reason: collision with root package name */
        public static final a f14777j = new a((g) null);

        /* renamed from: h  reason: collision with root package name */
        private final String f14778h;

        /* renamed from: i  reason: collision with root package name */
        private final int f14779i;

        /* compiled from: Regex.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }
        }

        public b(String str, int i10) {
            m.f(str, "pattern");
            this.f14778h = str;
            this.f14779i = i10;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f14778h, this.f14779i);
            m.e(compile, "compile(pattern, flags)");
            return new f(compile);
        }
    }

    public f(Pattern pattern) {
        m.f(pattern, "nativePattern");
        this.f14776h = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f14776h.pattern();
        m.e(pattern, "nativePattern.pattern()");
        return new b(pattern, this.f14776h.flags());
    }

    public final boolean a(CharSequence charSequence) {
        m.f(charSequence, "input");
        return this.f14776h.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        m.f(charSequence, "input");
        m.f(str, "replacement");
        String replaceAll = this.f14776h.matcher(charSequence).replaceAll(str);
        m.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final List<String> c(CharSequence charSequence, int i10) {
        m.f(charSequence, "input");
        q.X(i10);
        Matcher matcher = this.f14776h.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            return o.b(charSequence.toString());
        }
        int i11 = 10;
        if (i10 > 0) {
            i11 = l.c(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        int i13 = i10 - 1;
        do {
            arrayList.add(charSequence.subSequence(i12, matcher.start()).toString());
            i12 = matcher.end();
            if ((i13 >= 0 && arrayList.size() == i13) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i12, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i12, matcher.start()).toString());
            i12 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i12, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f14776h.toString();
        m.e(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.m.f(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.m.e(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.f.<init>(java.lang.String):void");
    }
}
