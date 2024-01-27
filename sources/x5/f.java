package x5;

import a6.m0;
import a6.p;
import a6.y;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.security.CertificateUtil;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o5.a;

/* compiled from: WebvttCueParser */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f12805a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f12806b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, Integer> f12807c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, Integer> f12808d;

    /* compiled from: WebvttCueParser */
    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator<b> f12809c = g.f17101h;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final c f12810a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f12811b;

        private b(c cVar, int i10) {
            this.f12810a = cVar;
            this.f12811b = i10;
        }
    }

    /* compiled from: WebvttCueParser */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f12812a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12813b;

        /* renamed from: c  reason: collision with root package name */
        public final String f12814c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f12815d;

        private c(String str, int i10, String str2, Set<String> set) {
            this.f12813b = i10;
            this.f12812a = str;
            this.f12814c = str2;
            this.f12815d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String trim = str.trim();
            a6.a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] E0 = m0.E0(trim, "\\.");
            String str3 = E0[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < E0.length; i11++) {
                hashSet.add(E0[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* compiled from: WebvttCueParser */
    private static final class d implements Comparable<d> {

        /* renamed from: h  reason: collision with root package name */
        public final int f12816h;

        /* renamed from: i  reason: collision with root package name */
        public final d f12817i;

        public d(int i10, d dVar) {
            this.f12816h = i10;
            this.f12817i = dVar;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return Integer.compare(this.f12816h, dVar.f12816h);
        }
    }

    /* compiled from: WebvttCueParser */
    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public long f12818a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f12819b = 0;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f12820c;

        /* renamed from: d  reason: collision with root package name */
        public int f12821d = 2;

        /* renamed from: e  reason: collision with root package name */
        public float f12822e = -3.4028235E38f;

        /* renamed from: f  reason: collision with root package name */
        public int f12823f = 1;

        /* renamed from: g  reason: collision with root package name */
        public int f12824g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f12825h = -3.4028235E38f;

        /* renamed from: i  reason: collision with root package name */
        public int f12826i = Integer.MIN_VALUE;

        /* renamed from: j  reason: collision with root package name */
        public float f12827j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public int f12828k = Integer.MIN_VALUE;

        private static float b(float f10, int i10) {
            int i11 = (f10 > -3.4028235E38f ? 1 : (f10 == -3.4028235E38f ? 0 : -1));
            if (i11 == 0 || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return i11 != 0 ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            StringBuilder sb = new StringBuilder(34);
                            sb.append("Unknown textAlignment: ");
                            sb.append(i10);
                            p.h("WebvttCueParser", sb.toString());
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public e a() {
            return new e(g().a(), this.f12818a, this.f12819b);
        }

        public a.b g() {
            float f10 = this.f12825h;
            if (f10 == -3.4028235E38f) {
                f10 = e(this.f12821d);
            }
            int i10 = this.f12826i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = f(this.f12821d);
            }
            a.b q10 = new a.b().o(c(this.f12821d)).g(b(this.f12822e, this.f12823f), this.f12823f).h(this.f12824g).j(f10).k(i10).m(Math.min(this.f12827j, d(i10, f10))).q(this.f12828k);
            CharSequence charSequence = this.f12820c;
            if (charSequence != null) {
                q10.n(charSequence);
            }
            return q10;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f12807c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f12808d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String next : set) {
            Map<String, Integer> map = f12807c;
            if (map.containsKey(next)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(next).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map2 = f12808d;
                if (map2.containsKey(next)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(next).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c10 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                StringBuilder sb = new StringBuilder(str.length() + 33);
                sb.append("ignoring unsupported entity: '&");
                sb.append(str);
                sb.append(";'");
                p.h("WebvttCueParser", sb.toString());
                return;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<d> list2) {
        int i10 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f12809c);
        int i11 = cVar.f12813b;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if ("rt".equals(((b) arrayList.get(i13)).f12810a.f12812a)) {
                b bVar = (b) arrayList.get(i13);
                int g10 = g(i(list2, str, bVar.f12810a), i10, 1);
                int i14 = bVar.f12810a.f12813b - i12;
                int d10 = bVar.f12811b - i12;
                CharSequence subSequence = spannableStringBuilder.subSequence(i14, d10);
                spannableStringBuilder.delete(i14, d10);
                spannableStringBuilder.setSpan(new s5.b(subSequence.toString(), g10), i11, i14, 33);
                i12 += subSequence.length();
                i11 = i14;
            }
        }
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<d> list2) {
        int i10 = cVar.f12813b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f12812a;
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c10 = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c10 = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals("c")) {
                    c10 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c10 = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c10 = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, cVar.f12815d, i10, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 7:
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> h10 = h(list2, str, cVar);
        for (int i11 = 0; i11 < h10.size(); i11++) {
            e(spannableStringBuilder, h10.get(i11).f12817i, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, d dVar, int i10, int i11) {
        if (dVar != null) {
            if (dVar.i() != -1) {
                s5.c.a(spannableStringBuilder, new StyleSpan(dVar.i()), i10, i11, 33);
            }
            if (dVar.l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
            if (dVar.m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (dVar.k()) {
                s5.c.a(spannableStringBuilder, new ForegroundColorSpan(dVar.c()), i10, i11, 33);
            }
            if (dVar.j()) {
                s5.c.a(spannableStringBuilder, new BackgroundColorSpan(dVar.a()), i10, i11, 33);
            }
            if (dVar.d() != null) {
                s5.c.a(spannableStringBuilder, new TypefaceSpan(dVar.d()), i10, i11, 33);
            }
            int f10 = dVar.f();
            if (f10 == 1) {
                s5.c.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.e(), true), i10, i11, 33);
            } else if (f10 == 2) {
                s5.c.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e()), i10, i11, 33);
            } else if (f10 == 3) {
                s5.c.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e() / 100.0f), i10, i11, 33);
            }
            if (dVar.b()) {
                spannableStringBuilder.setSpan(new s5.a(), i10, i11, 33);
            }
        }
    }

    private static int f(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int g(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> h(List<d> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            int h10 = dVar.h(str, cVar.f12812a, cVar.f12815d, cVar.f12814c);
            if (h10 > 0) {
                arrayList.add(new d(h10, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List<d> list, String str, c cVar) {
        List<d> h10 = h(list, str, cVar);
        for (int i10 = 0; i10 < h10.size(); i10++) {
            d dVar = h10.get(i10).f12817i;
            if (dVar.g() != -1) {
                return dVar.g();
            }
        }
        return -1;
    }

    private static String j(String str) {
        String trim = str.trim();
        a6.a.a(!trim.isEmpty());
        return m0.F0(trim, "[ \\.]")[0];
    }

    private static boolean k(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c10 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c10 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c10 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c10 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    static o5.a l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f12820c = charSequence;
        return eVar.g().a();
    }

    public static e m(y yVar, List<d> list) {
        String o10 = yVar.o();
        if (o10 == null) {
            return null;
        }
        Pattern pattern = f12805a;
        Matcher matcher = pattern.matcher(o10);
        if (matcher.matches()) {
            return n((String) null, matcher, yVar, list);
        }
        String o11 = yVar.o();
        if (o11 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(o11);
        if (matcher2.matches()) {
            return n(o10.trim(), matcher2, yVar, list);
        }
        return null;
    }

    private static e n(String str, Matcher matcher, y yVar, List<d> list) {
        e eVar = new e();
        try {
            eVar.f12818a = i.d((String) a6.a.e(matcher.group(1)));
            eVar.f12819b = i.d((String) a6.a.e(matcher.group(2)));
            p((String) a6.a.e(matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String o10 = yVar.o();
            while (!TextUtils.isEmpty(o10)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(o10.trim());
                o10 = yVar.o();
            }
            eVar.f12820c = q(str, sb.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            p.h("WebvttCueParser", valueOf.length() != 0 ? "Skipping cue with bad header: ".concat(valueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    static a.b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    private static void p(String str, e eVar) {
        Matcher matcher = f12806b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) a6.a.e(matcher.group(1));
            String str3 = (String) a6.a.e(matcher.group(2));
            try {
                if (Constants.LINE.equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f12821d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f12827j = i.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f12828k = w(str3);
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str3).length());
                    sb.append("Unknown cue setting ");
                    sb.append(str2);
                    sb.append(CertificateUtil.DELIMITER);
                    sb.append(str3);
                    p.h("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(matcher.group());
                p.h("WebvttCueParser", valueOf.length() != 0 ? "Skipping bad cue setting: ".concat(valueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    static SpannedString q(String str, String str2, List<d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i10, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    int i12 = 1;
                    boolean z10 = str2.charAt(i11) == '/';
                    i11 = f(str2, i11);
                    int i13 = i11 - 2;
                    boolean z11 = str2.charAt(i13) == '/';
                    if (z10) {
                        i12 = 2;
                    }
                    int i14 = i10 + i12;
                    if (!z11) {
                        i13 = i11 - 1;
                    }
                    String substring = str2.substring(i14, i13);
                    if (!substring.trim().isEmpty()) {
                        String j10 = j(substring);
                        if (k(j10)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f12812a.equals(j10)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = i11;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int r(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                p.h("WebvttCueParser", str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    private static void s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f12824g = r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f12822e = i.c(str);
            eVar.f12823f = 0;
            return;
        }
        eVar.f12822e = (float) Integer.parseInt(str);
        eVar.f12823f = 1;
    }

    private static int t(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                p.h("WebvttCueParser", str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    private static void u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f12826i = t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f12825h = i.c(str);
    }

    private static int v(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(ViewHierarchyConstants.DIMENSION_LEFT_KEY)) {
                    c10 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                p.h("WebvttCueParser", str.length() != 0 ? "Invalid alignment value: ".concat(str) : new String("Invalid alignment value: "));
                return 2;
        }
    }

    private static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        p.h("WebvttCueParser", str.length() != 0 ? "Invalid 'vertical' value: ".concat(str) : new String("Invalid 'vertical' value: "));
        return Integer.MIN_VALUE;
    }
}
