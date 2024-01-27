package t5;

import a6.m0;
import a6.p;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import io.flutter.embedding.android.KeyboardMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n6.d;

/* compiled from: SsaStyle */
final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f11680a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11681b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f11682c;

    /* renamed from: d  reason: collision with root package name */
    public final float f11683d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11684e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11685f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f11686g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11687h;

    /* compiled from: SsaStyle */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11688a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11689b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11690c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11691d;

        /* renamed from: e  reason: collision with root package name */
        public final int f11692e;

        /* renamed from: f  reason: collision with root package name */
        public final int f11693f;

        /* renamed from: g  reason: collision with root package name */
        public final int f11694g;

        /* renamed from: h  reason: collision with root package name */
        public final int f11695h;

        /* renamed from: i  reason: collision with root package name */
        public final int f11696i;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f11688a = i10;
            this.f11689b = i11;
            this.f11690c = i12;
            this.f11691d = i13;
            this.f11692e = i14;
            this.f11693f = i15;
            this.f11694g = i16;
            this.f11695h = i17;
            this.f11696i = i18;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static t5.c.a a(java.lang.String r14) {
            /*
                r0 = 7
                java.lang.String r14 = r14.substring(r0)
                java.lang.String r1 = ","
                java.lang.String[] r14 = android.text.TextUtils.split(r14, r1)
                r1 = 0
                r2 = -1
                r3 = 0
                r5 = -1
                r6 = -1
                r7 = -1
                r8 = -1
                r9 = -1
                r10 = -1
                r11 = -1
                r12 = -1
            L_0x0016:
                int r4 = r14.length
                if (r3 >= r4) goto L_0x009e
                r4 = r14[r3]
                java.lang.String r4 = r4.trim()
                java.lang.String r4 = l6.c.e(r4)
                r4.hashCode()
                int r13 = r4.hashCode()
                switch(r13) {
                    case -1178781136: goto L_0x007d;
                    case -1026963764: goto L_0x0072;
                    case -192095652: goto L_0x0067;
                    case -70925746: goto L_0x005c;
                    case 3029637: goto L_0x0051;
                    case 3373707: goto L_0x0046;
                    case 366554320: goto L_0x003b;
                    case 1767875043: goto L_0x0030;
                    default: goto L_0x002d;
                }
            L_0x002d:
                r4 = -1
                goto L_0x0087
            L_0x0030:
                java.lang.String r13 = "alignment"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0039
                goto L_0x002d
            L_0x0039:
                r4 = 7
                goto L_0x0087
            L_0x003b:
                java.lang.String r13 = "fontsize"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0044
                goto L_0x002d
            L_0x0044:
                r4 = 6
                goto L_0x0087
            L_0x0046:
                java.lang.String r13 = "name"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x004f
                goto L_0x002d
            L_0x004f:
                r4 = 5
                goto L_0x0087
            L_0x0051:
                java.lang.String r13 = "bold"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x005a
                goto L_0x002d
            L_0x005a:
                r4 = 4
                goto L_0x0087
            L_0x005c:
                java.lang.String r13 = "primarycolour"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0065
                goto L_0x002d
            L_0x0065:
                r4 = 3
                goto L_0x0087
            L_0x0067:
                java.lang.String r13 = "strikeout"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0070
                goto L_0x002d
            L_0x0070:
                r4 = 2
                goto L_0x0087
            L_0x0072:
                java.lang.String r13 = "underline"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x007b
                goto L_0x002d
            L_0x007b:
                r4 = 1
                goto L_0x0087
            L_0x007d:
                java.lang.String r13 = "italic"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0086
                goto L_0x002d
            L_0x0086:
                r4 = 0
            L_0x0087:
                switch(r4) {
                    case 0: goto L_0x0099;
                    case 1: goto L_0x0097;
                    case 2: goto L_0x0095;
                    case 3: goto L_0x0093;
                    case 4: goto L_0x0091;
                    case 5: goto L_0x008f;
                    case 6: goto L_0x008d;
                    case 7: goto L_0x008b;
                    default: goto L_0x008a;
                }
            L_0x008a:
                goto L_0x009a
            L_0x008b:
                r6 = r3
                goto L_0x009a
            L_0x008d:
                r8 = r3
                goto L_0x009a
            L_0x008f:
                r5 = r3
                goto L_0x009a
            L_0x0091:
                r9 = r3
                goto L_0x009a
            L_0x0093:
                r7 = r3
                goto L_0x009a
            L_0x0095:
                r12 = r3
                goto L_0x009a
            L_0x0097:
                r11 = r3
                goto L_0x009a
            L_0x0099:
                r10 = r3
            L_0x009a:
                int r3 = r3 + 1
                goto L_0x0016
            L_0x009e:
                if (r5 == r2) goto L_0x00a8
                t5.c$a r0 = new t5.c$a
                int r13 = r14.length
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x00a9
            L_0x00a8:
                r0 = 0
            L_0x00a9:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t5.c.a.a(java.lang.String):t5.c$a");
        }
    }

    /* compiled from: SsaStyle */
    static final class b {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f11697c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d  reason: collision with root package name */
        private static final Pattern f11698d = Pattern.compile(m0.C("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f11699e = Pattern.compile(m0.C("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f  reason: collision with root package name */
        private static final Pattern f11700f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a  reason: collision with root package name */
        public final int f11701a;

        /* renamed from: b  reason: collision with root package name */
        public final PointF f11702b;

        private b(int i10, PointF pointF) {
            this.f11701a = i10;
            this.f11702b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f11700f.matcher(str);
            if (matcher.find()) {
                return c.d((String) a6.a.e(matcher.group(1)));
            }
            return -1;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|(1:7)|8|9|(2:11|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static t5.c.b b(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = f11697c
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = -1
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x002b
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = a6.a.e(r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = c(r3)     // Catch:{ RuntimeException -> 0x0021 }
                if (r4 == 0) goto L_0x0021
                r1 = r4
            L_0x0021:
                int r3 = a(r3)     // Catch:{ RuntimeException -> 0x0029 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0029:
                goto L_0x0009
            L_0x002b:
                t5.c$b r5 = new t5.c$b
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: t5.c.b.b(java.lang.String):t5.c$b");
        }

        private static PointF c(String str) {
            String str2;
            String str3;
            Matcher matcher = f11698d.matcher(str);
            Matcher matcher2 = f11699e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    p.f("SsaStyle.Overrides", sb.toString());
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) a6.a.e(str2)).trim()), Float.parseFloat(((String) a6.a.e(str3)).trim()));
        }

        public static String d(String str) {
            return f11697c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i10, Integer num, float f10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f11680a = str;
        this.f11681b = i10;
        this.f11682c = num;
        this.f11683d = f10;
        this.f11684e = z10;
        this.f11685f = z11;
        this.f11686g = z12;
        this.f11687h = z13;
    }

    public static c b(String str, a aVar) {
        a6.a.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = aVar.f11696i;
        if (length != i10) {
            p.h("SsaStyle", m0.C("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f11688a].trim();
            int i11 = aVar.f11689b;
            int d10 = i11 != -1 ? d(split[i11].trim()) : -1;
            int i12 = aVar.f11690c;
            Integer f10 = i12 != -1 ? f(split[i12].trim()) : null;
            int i13 = aVar.f11691d;
            float g10 = i13 != -1 ? g(split[i13].trim()) : -3.4028235E38f;
            int i14 = aVar.f11692e;
            boolean z10 = i14 != -1 && e(split[i14].trim());
            int i15 = aVar.f11693f;
            boolean z11 = i15 != -1 && e(split[i15].trim());
            int i16 = aVar.f11694g;
            boolean z12 = i16 != -1 && e(split[i16].trim());
            int i17 = aVar.f11695h;
            return new c(trim, d10, f10, g10, z10, z11, z12, i17 != -1 && e(split[i17].trim()));
        } catch (RuntimeException e10) {
            StringBuilder sb = new StringBuilder(str.length() + 36);
            sb.append("Skipping malformed 'Style:' line: '");
            sb.append(str);
            sb.append("'");
            p.i("SsaStyle", sb.toString(), e10);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    public static int d(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        p.h("SsaStyle", valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    private static boolean e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            p.i("SsaStyle", sb.toString(), e10);
            return false;
        }
    }

    public static Integer f(String str) {
        long j10;
        try {
            if (str.startsWith("&H")) {
                j10 = Long.parseLong(str.substring(2), 16);
            } else {
                j10 = Long.parseLong(str);
            }
            a6.a.a(j10 <= KeyboardMap.kValueMask);
            return Integer.valueOf(Color.argb(d.c(((j10 >> 24) & 255) ^ 255), d.c(j10 & 255), d.c((j10 >> 8) & 255), d.c((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            p.i("SsaStyle", sb.toString(), e10);
            return null;
        }
    }

    private static float g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
            sb.append("Failed to parse font size: '");
            sb.append(str);
            sb.append("'");
            p.i("SsaStyle", sb.toString(), e10);
            return -3.4028235E38f;
        }
    }
}
