package u5;

import a6.p;
import a6.q;
import a6.y;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o5.c;
import o5.e;

/* compiled from: SubripDecoder */
public final class a extends c {

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f12095q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f12096r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o  reason: collision with root package name */
    private final StringBuilder f12097o = new StringBuilder();

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList<String> f12098p = new ArrayList<>();

    public a() {
        super("SubripDecoder");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o5.a B(android.text.Spanned r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r18
            o5.a$b r1 = new o5.a$b
            r1.<init>()
            r2 = r17
            o5.a$b r1 = r1.n(r2)
            if (r0 != 0) goto L_0x0014
            o5.a r0 = r1.a()
            return r0
        L_0x0014:
            int r2 = r18.hashCode()
            java.lang.String r6 = "{\\an9}"
            java.lang.String r7 = "{\\an8}"
            java.lang.String r8 = "{\\an7}"
            java.lang.String r9 = "{\\an6}"
            java.lang.String r10 = "{\\an5}"
            java.lang.String r11 = "{\\an4}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an2}"
            java.lang.String r14 = "{\\an1}"
            r4 = 4
            r5 = 3
            r15 = 2
            r3 = 1
            switch(r2) {
                case -685620710: goto L_0x0073;
                case -685620679: goto L_0x006b;
                case -685620648: goto L_0x0063;
                case -685620617: goto L_0x005b;
                case -685620586: goto L_0x0053;
                case -685620555: goto L_0x004b;
                case -685620524: goto L_0x0043;
                case -685620493: goto L_0x003a;
                case -685620462: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x007b
        L_0x0032:
            boolean r2 = r0.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 5
            goto L_0x007c
        L_0x003a:
            boolean r2 = r0.equals(r7)
            if (r2 == 0) goto L_0x007b
            r2 = 8
            goto L_0x007c
        L_0x0043:
            boolean r2 = r0.equals(r8)
            if (r2 == 0) goto L_0x007b
            r2 = 2
            goto L_0x007c
        L_0x004b:
            boolean r2 = r0.equals(r9)
            if (r2 == 0) goto L_0x007b
            r2 = 4
            goto L_0x007c
        L_0x0053:
            boolean r2 = r0.equals(r10)
            if (r2 == 0) goto L_0x007b
            r2 = 7
            goto L_0x007c
        L_0x005b:
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L_0x007b
            r2 = 1
            goto L_0x007c
        L_0x0063:
            boolean r2 = r0.equals(r12)
            if (r2 == 0) goto L_0x007b
            r2 = 3
            goto L_0x007c
        L_0x006b:
            boolean r2 = r0.equals(r13)
            if (r2 == 0) goto L_0x007b
            r2 = 6
            goto L_0x007c
        L_0x0073:
            boolean r2 = r0.equals(r14)
            if (r2 == 0) goto L_0x007b
            r2 = 0
            goto L_0x007c
        L_0x007b:
            r2 = -1
        L_0x007c:
            if (r2 == 0) goto L_0x0091
            if (r2 == r3) goto L_0x0091
            if (r2 == r15) goto L_0x0091
            if (r2 == r5) goto L_0x008d
            if (r2 == r4) goto L_0x008d
            r4 = 5
            if (r2 == r4) goto L_0x008d
            r1.k(r3)
            goto L_0x0095
        L_0x008d:
            r1.k(r15)
            goto L_0x0095
        L_0x0091:
            r2 = 0
            r1.k(r2)
        L_0x0095:
            int r2 = r18.hashCode()
            switch(r2) {
                case -685620710: goto L_0x00de;
                case -685620679: goto L_0x00d6;
                case -685620648: goto L_0x00ce;
                case -685620617: goto L_0x00c6;
                case -685620586: goto L_0x00be;
                case -685620555: goto L_0x00b5;
                case -685620524: goto L_0x00ad;
                case -685620493: goto L_0x00a5;
                case -685620462: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00e6
        L_0x009d:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e6
            r0 = 5
            goto L_0x00e7
        L_0x00a5:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e6
            r0 = 4
            goto L_0x00e7
        L_0x00ad:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e6
            r0 = 3
            goto L_0x00e7
        L_0x00b5:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e6
            r0 = 8
            goto L_0x00e7
        L_0x00be:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e6
            r0 = 7
            goto L_0x00e7
        L_0x00c6:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e6
            r0 = 6
            goto L_0x00e7
        L_0x00ce:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e6
            r0 = 2
            goto L_0x00e7
        L_0x00d6:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00e6
            r0 = 1
            goto L_0x00e7
        L_0x00de:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e7
        L_0x00e6:
            r0 = -1
        L_0x00e7:
            if (r0 == 0) goto L_0x00fe
            if (r0 == r3) goto L_0x00fe
            if (r0 == r15) goto L_0x00fe
            if (r0 == r5) goto L_0x00f9
            r2 = 4
            if (r0 == r2) goto L_0x00f9
            r2 = 5
            if (r0 == r2) goto L_0x00f9
            r1.h(r3)
            goto L_0x0101
        L_0x00f9:
            r0 = 0
            r1.h(r0)
            goto L_0x0101
        L_0x00fe:
            r1.h(r15)
        L_0x0101:
            int r0 = r1.c()
            float r0 = C(r0)
            o5.a$b r0 = r1.j(r0)
            int r1 = r1.b()
            float r1 = C(r1)
            r2 = 0
            o5.a$b r0 = r0.g(r1, r2)
            o5.a r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.a.B(android.text.Spanned, java.lang.String):o5.a");
    }

    static float C(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long D(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0) + (Long.parseLong((String) a6.a.e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) a6.a.e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String E(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f12096r.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb.replace(start, start + length, "");
            i10 += length;
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public e A(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        q qVar = new q();
        y yVar = new y(bArr, i10);
        while (true) {
            String o10 = yVar.o();
            int i11 = 0;
            if (o10 == null) {
                break;
            } else if (o10.length() != 0) {
                try {
                    Integer.parseInt(o10);
                    String o11 = yVar.o();
                    if (o11 == null) {
                        p.h("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f12095q.matcher(o11);
                    if (matcher.matches()) {
                        qVar.a(D(matcher, 1));
                        qVar.a(D(matcher, 6));
                        this.f12097o.setLength(0);
                        this.f12098p.clear();
                        for (String o12 = yVar.o(); !TextUtils.isEmpty(o12); o12 = yVar.o()) {
                            if (this.f12097o.length() > 0) {
                                this.f12097o.append("<br>");
                            }
                            this.f12097o.append(E(o12, this.f12098p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f12097o.toString());
                        String str = null;
                        while (true) {
                            if (i11 >= this.f12098p.size()) {
                                break;
                            }
                            String str2 = this.f12098p.get(i11);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(B(fromHtml, str));
                        arrayList.add(o5.a.f10394r);
                    } else {
                        p.h("SubripDecoder", o11.length() != 0 ? "Skipping invalid timing: ".concat(o11) : new String("Skipping invalid timing: "));
                    }
                } catch (NumberFormatException unused) {
                    p.h("SubripDecoder", o10.length() != 0 ? "Skipping invalid index: ".concat(o10) : new String("Skipping invalid index: "));
                }
            }
        }
        return new b((o5.a[]) arrayList.toArray(new o5.a[0]), qVar.d());
    }
}
