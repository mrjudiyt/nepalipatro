package x5;

import a6.a;
import a6.d;
import a6.m0;
import a6.p;
import a6.y;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WebvttCssParser */
final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f12781c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f12782d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    private final y f12783a = new y();

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f12784b = new StringBuilder();

    private void a(d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f12781c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.z((String) a.e(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] E0 = m0.E0(str, "\\.");
            String str2 = E0[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.y(str2.substring(0, indexOf2));
                dVar.x(str2.substring(indexOf2 + 1));
            } else {
                dVar.y(str2);
            }
            if (E0.length > 1) {
                dVar.w((String[]) m0.w0(E0, 1, E0.length));
            }
        }
    }

    private static boolean b(y yVar) {
        int e10 = yVar.e();
        int f10 = yVar.f();
        byte[] d10 = yVar.d();
        if (e10 + 2 > f10) {
            return false;
        }
        int i10 = e10 + 1;
        if (d10[e10] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (d10[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= f10) {
                yVar.P(f10 - yVar.e());
                return true;
            } else if (((char) d10[i11]) == '*' && ((char) d10[i12]) == '/') {
                i11 = i12 + 1;
                f10 = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(y yVar) {
        char k10 = k(yVar, yVar.e());
        if (k10 != 9 && k10 != 10 && k10 != 12 && k10 != 13 && k10 != ' ') {
            return false;
        }
        yVar.P(1);
        return true;
    }

    private static void e(String str, d dVar) {
        Matcher matcher = f12782d.matcher(l6.c.e(str));
        if (!matcher.matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("Invalid font-size: '");
            sb.append(str);
            sb.append("'.");
            p.h("WebvttCssParser", sb.toString());
            return;
        }
        String str2 = (String) a.e(matcher.group(2));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals(UserDataStore.EMAIL)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                dVar.t(3);
                break;
            case 1:
                dVar.t(2);
                break;
            case 2:
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) a.e(matcher.group(1))));
    }

    private static String f(y yVar, StringBuilder sb) {
        boolean z10 = false;
        sb.setLength(0);
        int e10 = yVar.e();
        int f10 = yVar.f();
        while (e10 < f10 && !z10) {
            char c10 = (char) yVar.d()[e10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                e10++;
                sb.append(c10);
            }
        }
        yVar.P(e10 - yVar.e());
        return sb.toString();
    }

    static String g(y yVar, StringBuilder sb) {
        n(yVar);
        if (yVar.a() == 0) {
            return null;
        }
        String f10 = f(yVar, sb);
        if (!"".equals(f10)) {
            return f10;
        }
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) yVar.C());
        return sb2.toString();
    }

    private static String h(y yVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int e10 = yVar.e();
            String g10 = g(yVar, sb);
            if (g10 == null) {
                return null;
            }
            if ("}".equals(g10) || ";".equals(g10)) {
                yVar.O(e10);
                z10 = true;
            } else {
                sb2.append(g10);
            }
        }
        return sb2.toString();
    }

    private static String i(y yVar, StringBuilder sb) {
        n(yVar);
        if (yVar.a() < 5 || !"::cue".equals(yVar.z(5))) {
            return null;
        }
        int e10 = yVar.e();
        String g10 = g(yVar, sb);
        if (g10 == null) {
            return null;
        }
        if ("{".equals(g10)) {
            yVar.O(e10);
            return "";
        }
        String l10 = "(".equals(g10) ? l(yVar) : null;
        if (!")".equals(g(yVar, sb))) {
            return null;
        }
        return l10;
    }

    private static void j(y yVar, d dVar, StringBuilder sb) {
        n(yVar);
        String f10 = f(yVar, sb);
        if (!"".equals(f10) && CertificateUtil.DELIMITER.equals(g(yVar, sb))) {
            n(yVar);
            String h10 = h(yVar, sb);
            if (h10 != null && !"".equals(h10)) {
                int e10 = yVar.e();
                String g10 = g(yVar, sb);
                if (!";".equals(g10)) {
                    if ("}".equals(g10)) {
                        yVar.O(e10);
                    } else {
                        return;
                    }
                }
                if ("color".equals(f10)) {
                    dVar.q(d.b(h10));
                } else if ("background-color".equals(f10)) {
                    dVar.n(d.b(h10));
                } else {
                    boolean z10 = true;
                    if ("ruby-position".equals(f10)) {
                        if ("over".equals(h10)) {
                            dVar.v(1);
                        } else if ("under".equals(h10)) {
                            dVar.v(2);
                        }
                    } else if ("text-combine-upright".equals(f10)) {
                        if (!"all".equals(h10) && !h10.startsWith("digits")) {
                            z10 = false;
                        }
                        dVar.p(z10);
                    } else if ("text-decoration".equals(f10)) {
                        if ("underline".equals(h10)) {
                            dVar.A(true);
                        }
                    } else if ("font-family".equals(f10)) {
                        dVar.r(h10);
                    } else if ("font-weight".equals(f10)) {
                        if ("bold".equals(h10)) {
                            dVar.o(true);
                        }
                    } else if ("font-style".equals(f10)) {
                        if ("italic".equals(h10)) {
                            dVar.u(true);
                        }
                    } else if ("font-size".equals(f10)) {
                        e(h10, dVar);
                    }
                }
            }
        }
    }

    private static char k(y yVar, int i10) {
        return (char) yVar.d()[i10];
    }

    private static String l(y yVar) {
        int e10 = yVar.e();
        int f10 = yVar.f();
        boolean z10 = false;
        while (e10 < f10 && !z10) {
            int i10 = e10 + 1;
            z10 = ((char) yVar.d()[e10]) == ')';
            e10 = i10;
        }
        return yVar.z((e10 - 1) - yVar.e()).trim();
    }

    static void m(y yVar) {
        do {
        } while (!TextUtils.isEmpty(yVar.o()));
    }

    static void n(y yVar) {
        while (true) {
            boolean z10 = true;
            while (yVar.a() > 0 && z10) {
                if (!c(yVar) && !b(yVar)) {
                    z10 = false;
                }
            }
            return;
        }
    }

    public List<d> d(y yVar) {
        this.f12784b.setLength(0);
        int e10 = yVar.e();
        m(yVar);
        this.f12783a.M(yVar.d(), yVar.e());
        this.f12783a.O(e10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i10 = i(this.f12783a, this.f12784b);
            if (i10 == null || !"{".equals(g(this.f12783a, this.f12784b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, i10);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int e11 = this.f12783a.e();
                String g10 = g(this.f12783a, this.f12784b);
                boolean z11 = g10 == null || "}".equals(g10);
                if (!z11) {
                    this.f12783a.O(e11);
                    j(this.f12783a, dVar, this.f12784b);
                }
                str = g10;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
