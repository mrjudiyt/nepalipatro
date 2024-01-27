package g9;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import y8.l;

/* compiled from: Indent.kt */
class i extends h {

    /* compiled from: Indent.kt */
    static final class a extends n implements l<String, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f14780h = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            m.f(str, Constants.LINE);
            return str;
        }
    }

    /* compiled from: Indent.kt */
    static final class b extends n implements l<String, String> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f14781h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f14781h = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            m.f(str, Constants.LINE);
            return this.f14781h + str;
        }
    }

    private static final l<String, String> b(String str) {
        if (str.length() == 0) {
            return a.f14780h;
        }
        return new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!b.c(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String d(String str, String str2) {
        String invoke;
        m.f(str, "<this>");
        m.f(str2, "newIndent");
        List<String> P = q.P(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : P) {
            if (!p.o((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.l(arrayList, 10));
        for (String c10 : arrayList) {
            arrayList2.add(Integer.valueOf(c(c10)));
        }
        Integer num = (Integer) x.G(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * P.size());
        l<String, String> b10 = b(str2);
        int f10 = p.f(P);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : P) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p.k();
            }
            String str3 = (String) next2;
            if ((i10 == 0 || i10 == f10) && p.o(str3)) {
                str3 = null;
            } else {
                String r02 = s.r0(str3, intValue);
                if (!(r02 == null || (invoke = b10.invoke(r02)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        String sb = ((StringBuilder) x.B(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124, (Object) null)).toString();
        m.e(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static String e(String str) {
        m.f(str, "<this>");
        return d(str, "");
    }
}
