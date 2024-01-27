package t5;

import a6.m0;
import a6.p;
import a6.y;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o5.a;
import o5.c;
import o5.e;
import t5.c;

/* compiled from: SsaDecoder */
public final class a extends c {

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f11669t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o  reason: collision with root package name */
    private final boolean f11670o;

    /* renamed from: p  reason: collision with root package name */
    private final b f11671p;

    /* renamed from: q  reason: collision with root package name */
    private Map<String, c> f11672q;

    /* renamed from: r  reason: collision with root package name */
    private float f11673r = -3.4028235E38f;

    /* renamed from: s  reason: collision with root package name */
    private float f11674s = -3.4028235E38f;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f11670o = false;
            this.f11671p = null;
            return;
        }
        this.f11670o = true;
        String D = m0.D(list.get(0));
        a6.a.a(D.startsWith("Format:"));
        this.f11671p = (b) a6.a.e(b.a(D));
        G(new y(list.get(1)));
    }

    private static int B(long j10, List<Long> list, List<List<o5.a>> list2) {
        int i10;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (list.get(size).longValue() == j10) {
                return size;
            } else {
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        if (i10 != 0) {
            arrayList = new ArrayList(list2.get(i10 - 1));
        }
        list2.add(i10, arrayList);
        return i10;
    }

    private static float C(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static o5.a D(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        a.b n10 = new a.b().n(spannableString);
        if (cVar != null) {
            if (cVar.f11682c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f11682c.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f11683d;
            if (!(f12 == -3.4028235E38f || f11 == -3.4028235E38f)) {
                n10.p(f12 / f11, 1);
            }
            boolean z10 = cVar.f11684e;
            if (z10 && cVar.f11685f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f11685f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f11686g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f11687h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f11701a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f11681b : -1;
        }
        n10.o(M(i10)).k(L(i10)).h(K(i10));
        PointF pointF = bVar.f11702b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            n10.j(C(n10.c()));
            n10.g(C(n10.b()), 0);
        } else {
            n10.j(pointF.x / f10);
            n10.g(bVar.f11702b.y / f11, 0);
        }
        return n10.a();
    }

    private void E(String str, b bVar, List<List<o5.a>> list, List<Long> list2) {
        int i10;
        a6.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f11679e);
        if (split.length != bVar.f11679e) {
            p.h("SsaDecoder", str.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(str) : new String("Skipping dialogue line with fewer columns than format: "));
            return;
        }
        long J = J(split[bVar.f11675a]);
        if (J == -9223372036854775807L) {
            p.h("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        long J2 = J(split[bVar.f11676b]);
        if (J2 == -9223372036854775807L) {
            p.h("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        Map<String, c> map = this.f11672q;
        c cVar = (map == null || (i10 = bVar.f11677c) == -1) ? null : map.get(split[i10].trim());
        String str2 = split[bVar.f11678d];
        o5.a D = D(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f11673r, this.f11674s);
        int B = B(J2, list2, list);
        for (int B2 = B(J, list2, list); B2 < B; B2++) {
            list.get(B2).add(D);
        }
    }

    private void F(y yVar, List<List<o5.a>> list, List<Long> list2) {
        b bVar = this.f11670o ? this.f11671p : null;
        while (true) {
            String o10 = yVar.o();
            if (o10 == null) {
                return;
            }
            if (o10.startsWith("Format:")) {
                bVar = b.a(o10);
            } else if (o10.startsWith("Dialogue:")) {
                if (bVar == null) {
                    p.h("SsaDecoder", o10.length() != 0 ? "Skipping dialogue line before complete format: ".concat(o10) : new String("Skipping dialogue line before complete format: "));
                } else {
                    E(o10, bVar, list, list2);
                }
            }
        }
    }

    private void G(y yVar) {
        while (true) {
            String o10 = yVar.o();
            if (o10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(o10)) {
                H(yVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(o10)) {
                this.f11672q = I(yVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(o10)) {
                p.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(o10)) {
                return;
            }
        }
    }

    private void H(y yVar) {
        while (true) {
            String o10 = yVar.o();
            if (o10 == null) {
                return;
            }
            if (yVar.a() == 0 || yVar.h() != 91) {
                String[] split = o10.split(CertificateUtil.DELIMITER);
                if (split.length == 2) {
                    String e10 = l6.c.e(split[0].trim());
                    e10.hashCode();
                    if (e10.equals("playresx")) {
                        this.f11673r = Float.parseFloat(split[1].trim());
                    } else if (e10.equals("playresy")) {
                        try {
                            this.f11674s = Float.parseFloat(split[1].trim());
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    private static Map<String, c> I(y yVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String o10 = yVar.o();
            if (o10 == null || (yVar.a() != 0 && yVar.h() == 91)) {
                return linkedHashMap;
            }
            if (o10.startsWith("Format:")) {
                aVar = c.a.a(o10);
            } else if (o10.startsWith("Style:")) {
                if (aVar == null) {
                    p.h("SsaDecoder", o10.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(o10) : new String("Skipping 'Style:' line before 'Format:' line: "));
                } else {
                    c b10 = c.b(o10, aVar);
                    if (b10 != null) {
                        linkedHashMap.put(b10.f11680a, b10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long J(String str) {
        Matcher matcher = f11669t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) m0.j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) m0.j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) m0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) m0.j(matcher.group(4))) * 10000);
    }

    private static int K(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i10);
                p.h("SsaDecoder", sb.toString());
                return Integer.MIN_VALUE;
        }
    }

    private static int L(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i10);
                p.h("SsaDecoder", sb.toString());
                return Integer.MIN_VALUE;
        }
    }

    private static Layout.Alignment M(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i10);
                p.h("SsaDecoder", sb.toString());
                return null;
        }
    }

    /* access modifiers changed from: protected */
    public e A(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        y yVar = new y(bArr, i10);
        if (!this.f11670o) {
            G(yVar);
        }
        F(yVar, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}
