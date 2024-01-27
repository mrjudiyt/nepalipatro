package k5;

import a6.k0;
import a6.m0;
import a6.n0;
import a6.p;
import a6.t;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.i0;
import com.google.common.collect.x;
import e4.j;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k5.k;
import l6.c;
import l6.e;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: DashManifestParser */
public class d extends DefaultHandler implements h.a<c> {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f9658b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f9659c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f9660d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f9661e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f9662a;

    /* compiled from: DashManifestParser */
    protected static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final j f9663a;

        /* renamed from: b  reason: collision with root package name */
        public final x<b> f9664b;

        /* renamed from: c  reason: collision with root package name */
        public final k f9665c;

        /* renamed from: d  reason: collision with root package name */
        public final String f9666d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<h.b> f9667e;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList<e> f9668f;

        /* renamed from: g  reason: collision with root package name */
        public final long f9669g;

        public a(j jVar, List<b> list, k kVar, String str, ArrayList<h.b> arrayList, ArrayList<e> arrayList2, long j10) {
            this.f9663a = jVar;
            this.f9664b = x.n(list);
            this.f9665c = kVar;
            this.f9666d = str;
            this.f9667e = arrayList;
            this.f9668f = arrayList2;
            this.f9669g = j10;
        }
    }

    public d() {
        try {
            this.f9662a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    protected static int B(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f9670a) && (str = eVar.f9671b) != null) {
                Matcher matcher = f9659c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String valueOf = String.valueOf(eVar.f9671b);
                p.h("MpdParser", valueOf.length() != 0 ? "Unable to parse CEA-608 channel number from: ".concat(valueOf) : new String("Unable to parse CEA-608 channel number from: "));
            }
        }
        return -1;
    }

    protected static int C(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f9670a) && (str = eVar.f9671b) != null) {
                Matcher matcher = f9660d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String valueOf = String.valueOf(eVar.f9671b);
                p.h("MpdParser", valueOf.length() != 0 ? "Unable to parse CEA-708 service block number from: ".concat(valueOf) : new String("Unable to parse CEA-708 service block number from: "));
            }
        }
        return -1;
    }

    protected static long F(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j10;
        }
        return m0.x0(attributeValue);
    }

    protected static e G(XmlPullParser xmlPullParser, String str) {
        String m02 = m0(xmlPullParser, "schemeIdUri", "");
        String m03 = m0(xmlPullParser, "value", (String) null);
        String m04 = m0(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!n0.d(xmlPullParser, str));
        return new e(m02, m03, m04);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static int H(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r0 = 0
            java.lang.String r1 = "value"
            java.lang.String r4 = r4.getAttributeValue(r0, r1)
            r0 = -1
            if (r4 != 0) goto L_0x000b
            return r0
        L_0x000b:
            java.lang.String r4 = l6.c.e(r4)
            r4.hashCode()
            int r1 = r4.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case 1596796: goto L_0x003e;
                case 2937391: goto L_0x0033;
                case 3094035: goto L_0x0028;
                case 3133436: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r4 = -1
            goto L_0x0048
        L_0x001d:
            java.lang.String r1 = "fa01"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0026
            goto L_0x001b
        L_0x0026:
            r4 = 3
            goto L_0x0048
        L_0x0028:
            java.lang.String r1 = "f801"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0031
            goto L_0x001b
        L_0x0031:
            r4 = 2
            goto L_0x0048
        L_0x0033:
            java.lang.String r1 = "a000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x003c
            goto L_0x001b
        L_0x003c:
            r4 = 1
            goto L_0x0048
        L_0x003e:
            java.lang.String r1 = "4000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0047
            goto L_0x001b
        L_0x0047:
            r4 = 0
        L_0x0048:
            switch(r4) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0051;
                case 2: goto L_0x004f;
                case 3: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            return r0
        L_0x004c:
            r4 = 8
            return r4
        L_0x004f:
            r4 = 6
            return r4
        L_0x0051:
            return r2
        L_0x0052:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.d.H(org.xmlpull.v1.XmlPullParser):int");
    }

    protected static long I(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j10;
        }
        return m0.y0(attributeValue);
    }

    protected static String J(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            String str = eVar.f9670a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f9671b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f9671b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float N(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    protected static float O(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f10;
        }
        Matcher matcher = f9658b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f10;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    protected static int Q(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    protected static long S(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (c.a("http://dashif.org/guidelines/last-segment-number", eVar.f9670a)) {
                return Long.parseLong(eVar.f9671b);
            }
        }
        return -1;
    }

    protected static long T(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    protected static int V(XmlPullParser xmlPullParser) {
        int Q = Q(xmlPullParser, "value", -1);
        if (Q < 0) {
            return -1;
        }
        int[] iArr = f9661e;
        if (Q < iArr.length) {
            return iArr[Q];
        }
        return -1;
    }

    private long b(List<k.d> list, long j10, long j11, int i10, long j12) {
        int m10 = i10 >= 0 ? i10 + 1 : (int) m0.m(j12 - j10, j11);
        for (int i11 = 0; i11 < m10; i11++) {
            list.add(m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    protected static String m0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    protected static String n0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                u(xmlPullParser);
            }
        } while (!n0.d(xmlPullParser, str));
        return str2;
    }

    private static int p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        a6.a.f(i10 == i11);
        return i10;
    }

    private static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        a6.a.f(str.equals(str2));
        return str;
    }

    private static void r(ArrayList<h.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h.b bVar = arrayList.get(size);
            if (!bVar.d()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i10).b(bVar)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }

    private static long s(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    private static String t(String str, String str2) {
        if (t.p(str)) {
            return t.c(str2);
        }
        if (t.s(str)) {
            return t.o(str2);
        }
        if (t.r(str)) {
            return "application/x-rawcc".equals(str) ? t.j(str2) : str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String g10 = t.g(str2);
        return "text/vtt".equals(g10) ? "application/x-mp4-vtt" : g10;
    }

    public static void u(XmlPullParser xmlPullParser) {
        if (n0.e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (n0.e(xmlPullParser)) {
                    i10++;
                } else if (n0.c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public List<b> A(XmlPullParser xmlPullParser, List<b> list) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 1;
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "serviceLocation");
        String n02 = n0(xmlPullParser, "BaseURL");
        if (attributeValue3 == null) {
            attributeValue3 = n02;
        }
        if (k0.b(n02)) {
            return i0.j(new b(n02, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = list.get(i10);
            arrayList.add(new b(k0.d(bVar.f9641a, n02), bVar.f9642b, bVar.f9643c, bVar.f9644d));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.String} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        r1 = null;
        r4 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.h.b> D(org.xmlpull.v1.XmlPullParser r11) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r11.getAttributeValue(r0, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0082
            java.lang.String r1 = l6.c.e(r1)
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case 489446379: goto L_0x0030;
                case 755418770: goto L_0x0025;
                case 1812765994: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x003a
        L_0x001a:
            java.lang.String r4 = "urn:mpeg:dash:mp4protection:2011"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0023
            goto L_0x003a
        L_0x0023:
            r3 = 2
            goto L_0x003a
        L_0x0025:
            java.lang.String r4 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x002e
            goto L_0x003a
        L_0x002e:
            r3 = 1
            goto L_0x003a
        L_0x0030:
            java.lang.String r4 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            switch(r3) {
                case 0: goto L_0x007d;
                case 1: goto L_0x007a;
                case 2: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0082
        L_0x003e:
            java.lang.String r1 = "value"
            java.lang.String r1 = r11.getAttributeValue(r0, r1)
            java.lang.String r3 = "default_KID"
            java.lang.String r3 = a6.n0.b(r11, r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0078
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0078
            java.lang.String r4 = "\\s+"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            java.util.UUID[] r4 = new java.util.UUID[r4]
            r5 = 0
        L_0x0062:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x0070
            r6 = r3[r5]
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0062
        L_0x0070:
            java.util.UUID r3 = e4.c.f8046b
            byte[] r4 = r4.l.b(r3, r4, r0)
            r5 = r0
            goto L_0x0086
        L_0x0078:
            r3 = r0
            goto L_0x0084
        L_0x007a:
            java.util.UUID r3 = e4.c.f8048d
            goto L_0x007f
        L_0x007d:
            java.util.UUID r3 = e4.c.f8049e
        L_0x007f:
            r1 = r0
            r4 = r1
            goto L_0x0085
        L_0x0082:
            r1 = r0
            r3 = r1
        L_0x0084:
            r4 = r3
        L_0x0085:
            r5 = r4
        L_0x0086:
            r11.next()
            java.lang.String r6 = "ms:laurl"
            boolean r6 = a6.n0.f(r11, r6)
            if (r6 == 0) goto L_0x0098
            java.lang.String r5 = "licenseUrl"
            java.lang.String r5 = r11.getAttributeValue(r0, r5)
            goto L_0x00ed
        L_0x0098:
            r6 = 4
            if (r4 != 0) goto L_0x00c5
            java.lang.String r7 = "pssh"
            boolean r7 = a6.n0.g(r11, r7)
            if (r7 == 0) goto L_0x00c5
            int r7 = r11.next()
            if (r7 != r6) goto L_0x00c5
            java.lang.String r3 = r11.getText()
            byte[] r3 = android.util.Base64.decode(r3, r2)
            java.util.UUID r4 = r4.l.f(r3)
            if (r4 != 0) goto L_0x00c1
            java.lang.String r3 = "MpdParser"
            java.lang.String r6 = "Skipping malformed cenc:pssh data"
            a6.p.h(r3, r6)
            r3 = r4
            r4 = r0
            goto L_0x00ed
        L_0x00c1:
            r9 = r4
            r4 = r3
            r3 = r9
            goto L_0x00ed
        L_0x00c5:
            if (r4 != 0) goto L_0x00ea
            java.util.UUID r7 = e4.c.f8049e
            boolean r8 = r7.equals(r3)
            if (r8 == 0) goto L_0x00ea
            java.lang.String r8 = "mspr:pro"
            boolean r8 = a6.n0.f(r11, r8)
            if (r8 == 0) goto L_0x00ea
            int r8 = r11.next()
            if (r8 != r6) goto L_0x00ea
            java.lang.String r4 = r11.getText()
            byte[] r4 = android.util.Base64.decode(r4, r2)
            byte[] r4 = r4.l.a(r7, r4)
            goto L_0x00ed
        L_0x00ea:
            u(r11)
        L_0x00ed:
            java.lang.String r6 = "ContentProtection"
            boolean r6 = a6.n0.d(r11, r6)
            if (r6 == 0) goto L_0x0086
            if (r3 == 0) goto L_0x00fe
            com.google.android.exoplayer2.drm.h$b r0 = new com.google.android.exoplayer2.drm.h$b
            java.lang.String r11 = "video/mp4"
            r0.<init>(r3, r5, r11, r4)
        L_0x00fe:
            android.util.Pair r11 = android.util.Pair.create(r1, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.d.D(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    public int E(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.equals(attributeValue)) {
            return 2;
        }
        if (ViewHierarchyConstants.TEXT_KEY.equals(attributeValue)) {
            return 3;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public Pair<Long, z4.a> K(XmlPullParser xmlPullParser, String str, String str2, long j10, ByteArrayOutputStream byteArrayOutputStream) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long T = T(xmlPullParser2, "id", 0);
        long T2 = T(xmlPullParser2, "duration", -9223372036854775807L);
        long T3 = T(xmlPullParser2, "presentationTime", 0);
        long C0 = m0.C0(T2, 1000, j10);
        long C02 = m0.C0(T3, 1000000, j10);
        String m02 = m0(xmlPullParser2, "messageData", (String) null);
        byte[] L = L(xmlPullParser2, byteArrayOutputStream);
        Long valueOf = Long.valueOf(C02);
        if (m02 != null) {
            L = m0.g0(m02);
        }
        return Pair.create(valueOf, d(str, str2, T, C0, L));
    }

    /* access modifiers changed from: protected */
    public byte[] L(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, e.f15604c.name());
        xmlPullParser.nextToken();
        while (!n0.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument((String) null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: protected */
    public f M(XmlPullParser xmlPullParser) {
        String m02 = m0(xmlPullParser, "schemeIdUri", "");
        String m03 = m0(xmlPullParser, "value", "");
        long T = T(xmlPullParser, "timescale", 1);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "Event")) {
                arrayList.add(K(xmlPullParser, m02, m03, T, byteArrayOutputStream));
            } else {
                u(xmlPullParser);
            }
        } while (!n0.d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        z4.a[] aVarArr = new z4.a[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            aVarArr[i10] = (z4.a) pair.second;
        }
        return e(m02, m03, T, jArr, aVarArr);
    }

    /* access modifiers changed from: protected */
    public i P(XmlPullParser xmlPullParser) {
        return Y(xmlPullParser, "sourceURL", "range");
    }

    /* access modifiers changed from: protected */
    public String R(XmlPullParser xmlPullParser) {
        return n0(xmlPullParser, "Label");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b9 A[LOOP:0: B:18:0x0082->B:73:0x01b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0175 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k5.c U(org.xmlpull.v1.XmlPullParser r44, k5.b r45) {
        /*
            r43 = this;
            r14 = r43
            r11 = r44
            java.lang.String r0 = "availabilityStartTime"
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r15 = F(r11, r0, r12)
            java.lang.String r0 = "mediaPresentationDuration"
            long r17 = I(r11, r0, r12)
            java.lang.String r0 = "minBufferTime"
            long r19 = I(r11, r0, r12)
            r9 = 0
            java.lang.String r0 = "type"
            java.lang.String r0 = r11.getAttributeValue(r9, r0)
            java.lang.String r1 = "dynamic"
            boolean r21 = r1.equals(r0)
            if (r21 == 0) goto L_0x0033
            java.lang.String r0 = "minimumUpdatePeriod"
            long r0 = I(r11, r0, r12)
            r22 = r0
            goto L_0x0035
        L_0x0033:
            r22 = r12
        L_0x0035:
            if (r21 == 0) goto L_0x0040
            java.lang.String r0 = "timeShiftBufferDepth"
            long r0 = I(r11, r0, r12)
            r24 = r0
            goto L_0x0042
        L_0x0040:
            r24 = r12
        L_0x0042:
            if (r21 == 0) goto L_0x004d
            java.lang.String r0 = "suggestedPresentationDelay"
            long r0 = I(r11, r0, r12)
            r26 = r0
            goto L_0x004f
        L_0x004d:
            r26 = r12
        L_0x004f:
            java.lang.String r0 = "publishTime"
            long r28 = F(r11, r0, r12)
            r0 = 0
            if (r21 == 0) goto L_0x005b
            r2 = r0
            goto L_0x005c
        L_0x005b:
            r2 = r12
        L_0x005c:
            r10 = 1
            k5.b[] r4 = new k5.b[r10]
            r5 = 0
            r4[r5] = r45
            java.util.ArrayList r7 = com.google.common.collect.i0.j(r4)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r21 == 0) goto L_0x0073
            r0 = r12
        L_0x0073:
            r30 = r0
            r3 = r2
            r34 = r9
            r35 = r34
            r36 = r35
            r37 = r36
            r32 = 0
            r33 = 0
        L_0x0082:
            r44.next()
            java.lang.String r0 = "BaseURL"
            boolean r0 = a6.n0.f(r11, r0)
            if (r0 == 0) goto L_0x009d
            if (r32 != 0) goto L_0x0095
            long r3 = r14.z(r11, r3)
            r32 = 1
        L_0x0095:
            java.util.List r0 = r14.A(r11, r7)
            r6.addAll(r0)
            goto L_0x00ab
        L_0x009d:
            java.lang.String r0 = "ProgramInformation"
            boolean r0 = a6.n0.f(r11, r0)
            if (r0 == 0) goto L_0x00b5
            k5.h r0 = r43.X(r44)
            r34 = r0
        L_0x00ab:
            r40 = r6
            r41 = r7
            r10 = r8
            r2 = r9
            r42 = 1
            goto L_0x016d
        L_0x00b5:
            java.lang.String r0 = "UTCTiming"
            boolean r0 = a6.n0.f(r11, r0)
            if (r0 == 0) goto L_0x00c4
            k5.o r0 = r43.q0(r44)
            r35 = r0
            goto L_0x00ab
        L_0x00c4:
            java.lang.String r0 = "Location"
            boolean r0 = a6.n0.f(r11, r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = r44.nextText()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r36 = r0
            goto L_0x00ab
        L_0x00d7:
            java.lang.String r0 = "ServiceDescription"
            boolean r0 = a6.n0.f(r11, r0)
            if (r0 == 0) goto L_0x00e6
            k5.l r0 = r43.l0(r44)
            r37 = r0
            goto L_0x00ab
        L_0x00e6:
            java.lang.String r0 = "Period"
            boolean r0 = a6.n0.f(r11, r0)
            if (r0 == 0) goto L_0x015e
            if (r33 != 0) goto L_0x015e
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00f8
            r2 = r6
            goto L_0x00f9
        L_0x00f8:
            r2 = r7
        L_0x00f9:
            r0 = r43
            r1 = r44
            r38 = r3
            r3 = r30
            r40 = r6
            r5 = r38
            r41 = r7
            r45 = r8
            r7 = r15
            r42 = 1
            r9 = r24
            android.util.Pair r0 = r0.W(r1, r2, r3, r5, r7, r9)
            java.lang.Object r1 = r0.first
            k5.g r1 = (k5.g) r1
            long r2 = r1.f9679b
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0141
            if (r21 == 0) goto L_0x0124
            r10 = r45
            r2 = 0
            r33 = 1
            goto L_0x016b
        L_0x0124:
            int r0 = r45.size()
            r1 = 47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Unable to determine start of period "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0, r2)
            throw r0
        L_0x0141:
            r2 = 0
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0153
            r10 = r45
            r30 = r12
            goto L_0x015a
        L_0x0153:
            long r5 = r1.f9679b
            long r5 = r5 + r3
            r10 = r45
            r30 = r5
        L_0x015a:
            r10.add(r1)
            goto L_0x016b
        L_0x015e:
            r38 = r3
            r40 = r6
            r41 = r7
            r10 = r8
            r2 = r9
            r42 = 1
            u(r44)
        L_0x016b:
            r3 = r38
        L_0x016d:
            java.lang.String r0 = "MPD"
            boolean r0 = a6.n0.d(r11, r0)
            if (r0 == 0) goto L_0x01b9
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x018a
            int r0 = (r30 > r12 ? 1 : (r30 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0180
            r3 = r30
            goto L_0x018c
        L_0x0180:
            if (r21 == 0) goto L_0x0183
            goto L_0x018a
        L_0x0183:
            java.lang.String r0 = "Unable to determine duration of static manifest."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0, r2)
            throw r0
        L_0x018a:
            r3 = r17
        L_0x018c:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x01b2
            r0 = r43
            r1 = r15
            r5 = r19
            r7 = r21
            r8 = r22
            r38 = r10
            r10 = r24
            r12 = r26
            r14 = r28
            r16 = r34
            r17 = r35
            r18 = r37
            r19 = r36
            r20 = r38
            k5.c r0 = r0.g(r1, r3, r5, r7, r8, r10, r12, r14, r16, r17, r18, r19, r20)
            return r0
        L_0x01b2:
            java.lang.String r0 = "No periods found."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0, r2)
            throw r0
        L_0x01b9:
            r14 = r43
            r9 = r2
            r8 = r10
            r6 = r40
            r7 = r41
            r10 = 1
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.d.U(org.xmlpull.v1.XmlPullParser, k5.b):k5.c");
    }

    /* access modifiers changed from: protected */
    public Pair<g, Long> W(XmlPullParser xmlPullParser, List<b> list, long j10, long j11, long j12, long j13) {
        long j14;
        ArrayList arrayList;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j15;
        long j16;
        k g02;
        d dVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "id");
        long I = I(xmlPullParser2, "start", j10);
        long j17 = -9223372036854775807L;
        long j18 = j12 != -9223372036854775807L ? j12 + I : -9223372036854775807L;
        long I2 = I(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j19 = j11;
        long j20 = -9223372036854775807L;
        k kVar = null;
        e eVar = null;
        boolean z10 = false;
        while (true) {
            xmlPullParser.next();
            if (n0.f(xmlPullParser2, "BaseURL")) {
                if (!z10) {
                    j19 = dVar.z(xmlPullParser2, j19);
                    z10 = true;
                }
                arrayList6.addAll(A(xmlPullParser, list));
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                j14 = j17;
                obj = obj2;
                arrayList3 = arrayList4;
            } else {
                if (n0.f(xmlPullParser2, "AdaptationSet")) {
                    j15 = j19;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList4;
                    arrayList3.add(w(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, kVar, I2, j19, j20, j18, j13));
                    arrayList = arrayList5;
                } else {
                    j15 = j19;
                    ArrayList arrayList7 = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList4;
                    if (n0.f(xmlPullParser2, "EventStream")) {
                        ArrayList arrayList8 = arrayList7;
                        arrayList8.add(M(xmlPullParser));
                        arrayList = arrayList8;
                    } else {
                        ArrayList arrayList9 = arrayList7;
                        if (n0.f(xmlPullParser2, "SegmentBase")) {
                            arrayList = arrayList9;
                            kVar = e0(xmlPullParser2, (k.e) null);
                            obj = null;
                            j19 = j15;
                            j14 = -9223372036854775807L;
                        } else {
                            arrayList = arrayList9;
                            if (n0.f(xmlPullParser2, "SegmentList")) {
                                long z11 = z(xmlPullParser2, -9223372036854775807L);
                                obj = null;
                                g02 = f0(xmlPullParser, (k.b) null, j18, I2, j15, z11, j13);
                                j20 = z11;
                                j19 = j15;
                                j14 = -9223372036854775807L;
                            } else {
                                obj = null;
                                if (n0.f(xmlPullParser2, "SegmentTemplate")) {
                                    long z12 = z(xmlPullParser2, -9223372036854775807L);
                                    j14 = -9223372036854775807L;
                                    g02 = g0(xmlPullParser, (k.c) null, x.s(), j18, I2, j15, z12, j13);
                                    j20 = z12;
                                    j19 = j15;
                                } else {
                                    j16 = -9223372036854775807L;
                                    if (n0.f(xmlPullParser2, "AssetIdentifier")) {
                                        eVar = G(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        u(xmlPullParser);
                                    }
                                    j19 = j15;
                                }
                            }
                            kVar = g02;
                        }
                    }
                }
                obj = null;
                j16 = -9223372036854775807L;
                j19 = j15;
            }
            if (n0.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, I, arrayList3, arrayList, eVar), Long.valueOf(I2));
            }
            arrayList4 = arrayList3;
            arrayList6 = arrayList2;
            obj2 = obj;
            arrayList5 = arrayList;
            j17 = j14;
            dVar = this;
        }
    }

    /* access modifiers changed from: protected */
    public h X(XmlPullParser xmlPullParser) {
        String str = null;
        String m02 = m0(xmlPullParser, "moreInformationURL", (String) null);
        String m03 = m0(xmlPullParser, "lang", (String) null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (n0.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (n0.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                u(xmlPullParser);
            }
            String str4 = str3;
            if (n0.d(xmlPullParser, "ProgramInformation")) {
                return new h(str, str2, str4, m02, m03);
            }
            str3 = str4;
        }
    }

    /* access modifiers changed from: protected */
    public i Y(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j11 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j10 = (Long.parseLong(split[1]) - j11) + 1;
                return i(attributeValue, j11, j10);
            }
        } else {
            j11 = 0;
        }
        j10 = -1;
        return i(attributeValue, j11, j10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: k5.k$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r31v1 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e2 A[LOOP:0: B:1:0x006a->B:53:0x01e2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0190 A[EDGE_INSN: B:54:0x0190->B:45:0x0190 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k5.d.a Z(org.xmlpull.v1.XmlPullParser r36, java.util.List<k5.b> r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<k5.e> r46, java.util.List<k5.e> r47, java.util.List<k5.e> r48, java.util.List<k5.e> r49, k5.k r50, long r51, long r53, long r55, long r57, long r59) {
        /*
            r35 = this;
            r15 = r35
            r14 = r36
            r0 = 0
            java.lang.String r1 = "id"
            java.lang.String r16 = r14.getAttributeValue(r0, r1)
            java.lang.String r1 = "bandwidth"
            r2 = -1
            int r17 = Q(r14, r1, r2)
            java.lang.String r1 = "mimeType"
            r2 = r38
            java.lang.String r18 = m0(r14, r1, r2)
            java.lang.String r1 = "codecs"
            r2 = r39
            java.lang.String r19 = m0(r14, r1, r2)
            java.lang.String r1 = "width"
            r2 = r40
            int r20 = Q(r14, r1, r2)
            java.lang.String r1 = "height"
            r2 = r41
            int r21 = Q(r14, r1, r2)
            r1 = r42
            float r22 = O(r14, r1)
            java.lang.String r1 = "audioSamplingRate"
            r2 = r44
            int r23 = Q(r14, r1, r2)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r1 = r48
            r12.<init>(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = r49
            r9.<init>(r10)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1 = 0
            r24 = r43
            r5 = r55
            r1 = r57
            r25 = r0
            r26 = 0
            r0 = r50
        L_0x006a:
            r36.next()
            java.lang.String r3 = "BaseURL"
            boolean r3 = a6.n0.f(r14, r3)
            if (r3 == 0) goto L_0x008c
            if (r26 != 0) goto L_0x007d
            long r5 = r15.z(r14, r5)
            r26 = 1
        L_0x007d:
            java.util.List r3 = r35.A(r36, r37)
            r7.addAll(r3)
        L_0x0084:
            r31 = r7
            r15 = r13
            r7 = r24
            r24 = r0
            goto L_0x009e
        L_0x008c:
            java.lang.String r3 = "AudioChannelConfiguration"
            boolean r3 = a6.n0.f(r14, r3)
            if (r3 == 0) goto L_0x00a2
            int r3 = r35.y(r36)
            r24 = r0
            r31 = r7
            r15 = r13
            r7 = r3
        L_0x009e:
            r13 = r11
            r11 = r9
            goto L_0x0188
        L_0x00a2:
            java.lang.String r3 = "SegmentBase"
            boolean r3 = a6.n0.f(r14, r3)
            if (r3 == 0) goto L_0x00b1
            k5.k$e r0 = (k5.k.e) r0
            k5.k$e r0 = r15.e0(r14, r0)
            goto L_0x0084
        L_0x00b1:
            java.lang.String r3 = "SegmentList"
            boolean r3 = a6.n0.f(r14, r3)
            if (r3 == 0) goto L_0x00ed
            long r27 = r15.z(r14, r1)
            r2 = r0
            k5.k$b r2 = (k5.k.b) r2
            r0 = r35
            r1 = r36
            r3 = r51
            r29 = r5
            r5 = r53
            r31 = r7
            r7 = r29
            r32 = r9
            r9 = r27
            r33 = r11
            r34 = r12
            r11 = r59
            k5.k$b r0 = r0.f0(r1, r2, r3, r5, r7, r9, r11)
            r15 = r13
        L_0x00dd:
            r7 = r24
            r1 = r27
        L_0x00e1:
            r5 = r29
            r11 = r32
            r13 = r33
            r12 = r34
        L_0x00e9:
            r24 = r0
            goto L_0x0188
        L_0x00ed:
            r29 = r5
            r31 = r7
            r32 = r9
            r33 = r11
            r34 = r12
            java.lang.String r3 = "SegmentTemplate"
            boolean r3 = a6.n0.f(r14, r3)
            if (r3 == 0) goto L_0x011c
            long r27 = r15.z(r14, r1)
            r2 = r0
            k5.k$c r2 = (k5.k.c) r2
            r0 = r35
            r1 = r36
            r3 = r49
            r4 = r51
            r6 = r53
            r8 = r29
            r10 = r27
            r15 = r13
            r12 = r59
            k5.k$c r0 = r0.g0(r1, r2, r3, r4, r6, r8, r10, r12)
            goto L_0x00dd
        L_0x011c:
            r15 = r13
            java.lang.String r3 = "ContentProtection"
            boolean r3 = a6.n0.f(r14, r3)
            if (r3 == 0) goto L_0x013d
            android.util.Pair r3 = r35.D(r36)
            java.lang.Object r4 = r3.first
            if (r4 == 0) goto L_0x0131
            r25 = r4
            java.lang.String r25 = (java.lang.String) r25
        L_0x0131:
            java.lang.Object r3 = r3.second
            if (r3 == 0) goto L_0x013a
            com.google.android.exoplayer2.drm.h$b r3 = (com.google.android.exoplayer2.drm.h.b) r3
            r15.add(r3)
        L_0x013a:
            r7 = r24
            goto L_0x00e1
        L_0x013d:
            java.lang.String r3 = "InbandEventStream"
            boolean r4 = a6.n0.f(r14, r3)
            if (r4 == 0) goto L_0x0153
            k5.e r3 = G(r14, r3)
            r13 = r33
            r13.add(r3)
            r11 = r32
            r12 = r34
            goto L_0x0182
        L_0x0153:
            r13 = r33
            java.lang.String r3 = "EssentialProperty"
            boolean r4 = a6.n0.f(r14, r3)
            if (r4 == 0) goto L_0x0169
            k5.e r3 = G(r14, r3)
            r12 = r34
            r12.add(r3)
            r11 = r32
            goto L_0x0182
        L_0x0169:
            r12 = r34
            java.lang.String r3 = "SupplementalProperty"
            boolean r4 = a6.n0.f(r14, r3)
            if (r4 == 0) goto L_0x017d
            k5.e r3 = G(r14, r3)
            r11 = r32
            r11.add(r3)
            goto L_0x0182
        L_0x017d:
            r11 = r32
            u(r36)
        L_0x0182:
            r7 = r24
            r5 = r29
            goto L_0x00e9
        L_0x0188:
            java.lang.String r0 = "Representation"
            boolean r0 = a6.n0.d(r14, r0)
            if (r0 == 0) goto L_0x01e2
            r0 = r35
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r7
            r7 = r23
            r8 = r17
            r9 = r45
            r10 = r46
            r27 = r11
            r11 = r47
            r28 = r12
            r12 = r19
            r29 = r13
            r13 = r28
            r14 = r27
            e4.j r0 = r0.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r24 == 0) goto L_0x01ba
            goto L_0x01c1
        L_0x01ba:
            k5.k$e r1 = new k5.k$e
            r1.<init>()
            r24 = r1
        L_0x01c1:
            k5.d$a r1 = new k5.d$a
            boolean r2 = r31.isEmpty()
            if (r2 != 0) goto L_0x01ca
            goto L_0x01cc
        L_0x01ca:
            r31 = r37
        L_0x01cc:
            r2 = -1
            r36 = r1
            r37 = r0
            r38 = r31
            r39 = r24
            r40 = r25
            r41 = r15
            r42 = r29
            r43 = r2
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)
            return r1
        L_0x01e2:
            r10 = r49
            r9 = r11
            r11 = r13
            r13 = r15
            r0 = r24
            r15 = r35
            r24 = r7
            r7 = r31
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.d.Z(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, k5.k, long, long, long, long, long):k5.d$a");
    }

    /* access modifiers changed from: protected */
    public int a0(List<e> list) {
        int o02;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (c.a("urn:mpeg:dash:role:2011", eVar.f9670a)) {
                o02 = b0(eVar.f9671b);
            } else if (c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f9670a)) {
                o02 = o0(eVar.f9671b);
            }
            i10 |= o02;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public int b0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c10 = 4;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c10 = 7;
                    break;
                }
                break;
            case 552573414:
                if (str.equals(ShareConstants.FEED_CAPTION_PARAM)) {
                    c10 = 8;
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 5:
                return 16;
            case 6:
                return 1;
            case 7:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
            case 8:
                return 64;
            case 9:
                return 8;
            case 10:
                return 32;
            case 11:
                return 4;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public a c(int i10, int i11, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        return new a(i10, i11, list, list2, list3, list4);
    }

    /* access modifiers changed from: protected */
    public int c0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (c.a("http://dashif.org/guidelines/trickmode", list.get(i11).f9670a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public z4.a d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new z4.a(str, str2, j11, j10, bArr);
    }

    /* access modifiers changed from: protected */
    public int d0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (c.a("urn:mpeg:dash:role:2011", eVar.f9670a)) {
                i10 |= b0(eVar.f9671b);
            }
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public f e(String str, String str2, long j10, long[] jArr, z4.a[] aVarArr) {
        return new f(str, str2, j10, jArr, aVarArr);
    }

    /* access modifiers changed from: protected */
    public k.e e0(XmlPullParser xmlPullParser, k.e eVar) {
        long j10;
        long j11;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        k.e eVar2 = eVar;
        long T = T(xmlPullParser2, "timescale", eVar2 != null ? eVar2.f9705b : 1);
        long j12 = 0;
        long T2 = T(xmlPullParser2, "presentationTimeOffset", eVar2 != null ? eVar2.f9706c : 0);
        long j13 = eVar2 != null ? eVar2.f9719d : 0;
        if (eVar2 != null) {
            j12 = eVar2.f9720e;
        }
        i iVar = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j10 = (Long.parseLong(split[1]) - parseLong) + 1;
            j11 = parseLong;
        } else {
            j10 = j12;
            j11 = j13;
        }
        if (eVar2 != null) {
            iVar = eVar2.f9704a;
        }
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser2, "Initialization")) {
                iVar = P(xmlPullParser);
            } else {
                u(xmlPullParser);
            }
        } while (!n0.d(xmlPullParser2, "SegmentBase"));
        return n(iVar, T, T2, j11, j10);
    }

    /* access modifiers changed from: protected */
    public j f(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List<e> list, List<e> list2, String str4, List<e> list3, List<e> list4) {
        String str5 = str2;
        List<e> list5 = list;
        String str6 = str4;
        String t10 = t(str2, str6);
        if ("audio/eac3".equals(t10)) {
            t10 = J(list4);
            if ("audio/eac3-joc".equals(t10)) {
                str6 = "ec+3";
            }
        }
        int k02 = k0(list5);
        String str7 = str;
        j.b V = new j.b().S(str).K(str2).e0(t10).I(str6).Z(i14).g0(k02).c0(d0(list5) | a0(list2) | c0(list3) | c0(list4)).V(str3);
        if (t.s(t10)) {
            int i15 = i10;
            int i16 = i11;
            float f11 = f10;
            V.j0(i10).Q(i11).P(f10);
        } else if (t.p(t10)) {
            int i17 = i12;
            V.H(i12).f0(i13);
        } else if (t.r(t10)) {
            int i18 = -1;
            if ("application/cea-608".equals(t10)) {
                i18 = B(list2);
            } else if ("application/cea-708".equals(t10)) {
                i18 = C(list2);
            }
            V.F(i18);
        }
        return V.E();
    }

    /* access modifiers changed from: protected */
    public k.b f0(XmlPullParser xmlPullParser, k.b bVar, long j10, long j11, long j12, long j13, long j14) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        k.b bVar2 = bVar;
        long j15 = 1;
        long T = T(xmlPullParser2, "timescale", bVar2 != null ? bVar2.f9705b : 1);
        long T2 = T(xmlPullParser2, "presentationTimeOffset", bVar2 != null ? bVar2.f9706c : 0);
        long T3 = T(xmlPullParser2, "duration", bVar2 != null ? bVar2.f9708e : -9223372036854775807L);
        if (bVar2 != null) {
            j15 = bVar2.f9707d;
        }
        long T4 = T(xmlPullParser2, "startNumber", j15);
        long s10 = s(j12, j13);
        List<k.d> list = null;
        List list2 = null;
        i iVar = null;
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser2, "Initialization")) {
                iVar = P(xmlPullParser);
            } else if (n0.f(xmlPullParser2, "SegmentTimeline")) {
                list = h0(xmlPullParser, T, j11);
            } else if (n0.f(xmlPullParser2, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(i0(xmlPullParser));
            } else {
                u(xmlPullParser);
            }
        } while (!n0.d(xmlPullParser2, "SegmentList"));
        if (bVar2 != null) {
            if (iVar == null) {
                iVar = bVar2.f9704a;
            }
            if (list == null) {
                list = bVar2.f9709f;
            }
            if (list2 == null) {
                list2 = bVar2.f9713j;
            }
        }
        return k(iVar, T, T2, T4, T3, list, s10, list2, j14, j10);
    }

    /* access modifiers changed from: protected */
    public c g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        return new c(j10, j11, j12, z10, j13, j14, j15, j16, hVar, oVar, lVar, uri, list);
    }

    /* access modifiers changed from: protected */
    public k.c g0(XmlPullParser xmlPullParser, k.c cVar, List<e> list, long j10, long j11, long j12, long j13, long j14) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        k.c cVar2 = cVar;
        long j15 = 1;
        long T = T(xmlPullParser2, "timescale", cVar2 != null ? cVar2.f9705b : 1);
        long T2 = T(xmlPullParser2, "presentationTimeOffset", cVar2 != null ? cVar2.f9706c : 0);
        long T3 = T(xmlPullParser2, "duration", cVar2 != null ? cVar2.f9708e : -9223372036854775807L);
        if (cVar2 != null) {
            j15 = cVar2.f9707d;
        }
        long T4 = T(xmlPullParser2, "startNumber", j15);
        long S = S(list);
        long s10 = s(j12, j13);
        List<k.d> list2 = null;
        n p02 = p0(xmlPullParser2, ShareConstants.WEB_DIALOG_PARAM_MEDIA, cVar2 != null ? cVar2.f9715k : null);
        n p03 = p0(xmlPullParser2, "initialization", cVar2 != null ? cVar2.f9714j : null);
        i iVar = null;
        while (true) {
            xmlPullParser.next();
            if (n0.f(xmlPullParser2, "Initialization")) {
                iVar = P(xmlPullParser);
            } else if (n0.f(xmlPullParser2, "SegmentTimeline")) {
                list2 = h0(xmlPullParser, T, j11);
            } else {
                u(xmlPullParser);
            }
            if (n0.d(xmlPullParser2, "SegmentTemplate")) {
                break;
            }
        }
        if (cVar2 != null) {
            if (iVar == null) {
                iVar = cVar2.f9704a;
            }
            if (list2 == null) {
                list2 = cVar2.f9709f;
            }
        }
        return l(iVar, T, T2, T4, S, T3, list2, s10, p03, p02, j14, j10);
    }

    /* access modifiers changed from: protected */
    public g h(String str, long j10, List<a> list, List<f> list2, e eVar) {
        return new g(str, j10, list, list2, eVar);
    }

    /* access modifiers changed from: protected */
    public List<k.d> h0(XmlPullParser xmlPullParser, long j10, long j11) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser2, "S")) {
                long T = T(xmlPullParser2, "t", -9223372036854775807L);
                if (z10) {
                    j12 = b(arrayList, j12, j13, i10, T);
                }
                if (T == -9223372036854775807L) {
                    T = j12;
                }
                j13 = T(xmlPullParser2, "d", -9223372036854775807L);
                i10 = Q(xmlPullParser2, "r", 0);
                j12 = T;
                z10 = true;
            } else {
                u(xmlPullParser);
            }
        } while (!n0.d(xmlPullParser2, "SegmentTimeline"));
        if (z10) {
            b(arrayList, j12, j13, i10, m0.C0(j11, j10, 1000));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public i i(String str, long j10, long j11) {
        return new i(str, j10, j11);
    }

    /* access modifiers changed from: protected */
    public i i0(XmlPullParser xmlPullParser) {
        return Y(xmlPullParser, ShareConstants.WEB_DIALOG_PARAM_MEDIA, "mediaRange");
    }

    /* access modifiers changed from: protected */
    public j j(a aVar, String str, String str2, ArrayList<h.b> arrayList, ArrayList<e> arrayList2) {
        j.b b10 = aVar.f9663a.b();
        if (str != null) {
            b10.U(str);
        }
        String str3 = aVar.f9666d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<h.b> arrayList3 = aVar.f9667e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            b10.L(new com.google.android.exoplayer2.drm.h(str2, (List<h.b>) arrayList3));
        }
        ArrayList<e> arrayList4 = aVar.f9668f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f9669g, b10.E(), aVar.f9664b, aVar.f9665c, arrayList4);
    }

    /* access modifiers changed from: protected */
    public int j0(String str) {
        if (str == null) {
            return 0;
        }
        if (!str.equals("forced_subtitle")) {
            return !str.equals("main") ? 0 : 1;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    public k.b k(i iVar, long j10, long j11, long j12, long j13, List<k.d> list, long j14, List<i> list2, long j15, long j16) {
        return new k.b(iVar, j10, j11, j12, j13, list, j14, list2, e4.c.d(j15), e4.c.d(j16));
    }

    /* access modifiers changed from: protected */
    public int k0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (c.a("urn:mpeg:dash:role:2011", eVar.f9670a)) {
                i10 |= j0(eVar.f9671b);
            }
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public k.c l(i iVar, long j10, long j11, long j12, long j13, long j14, List<k.d> list, long j15, n nVar, n nVar2, long j16, long j17) {
        return new k.c(iVar, j10, j11, j12, j13, j14, list, j15, nVar, nVar2, e4.c.d(j16), e4.c.d(j17));
    }

    /* access modifiers changed from: protected */
    public l l0(XmlPullParser xmlPullParser) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        float f10 = -3.4028235E38f;
        float f11 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (n0.f(xmlPullParser2, "Latency")) {
                j10 = T(xmlPullParser2, "target", -9223372036854775807L);
                j11 = T(xmlPullParser2, "min", -9223372036854775807L);
                j12 = T(xmlPullParser2, "max", -9223372036854775807L);
            } else if (n0.f(xmlPullParser2, "PlaybackRate")) {
                f10 = N(xmlPullParser2, "min", -3.4028235E38f);
                f11 = N(xmlPullParser2, "max", -3.4028235E38f);
            }
            long j13 = j10;
            long j14 = j11;
            long j15 = j12;
            float f12 = f10;
            float f13 = f11;
            if (n0.d(xmlPullParser2, "ServiceDescription")) {
                return new l(j13, j14, j15, f12, f13);
            }
            j10 = j13;
            j11 = j14;
            j12 = j15;
            f10 = f12;
            f11 = f13;
        }
    }

    /* access modifiers changed from: protected */
    public k.d m(long j10, long j11) {
        return new k.d(j10, j11);
    }

    /* access modifiers changed from: protected */
    public k.e n(i iVar, long j10, long j11, long j12, long j13) {
        return new k.e(iVar, j10, j11, j12, j13);
    }

    /* access modifiers changed from: protected */
    public o o(String str, String str2) {
        return new o(str, str2);
    }

    /* access modifiers changed from: protected */
    public int o0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals(AppEventsConstants.EVENT_PARAM_VALUE_YES)) {
                    c10 = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c10 = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c10 = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c10 = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public n p0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    /* access modifiers changed from: protected */
    public o q0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue((String) null, "schemeIdUri"), xmlPullParser.getAttributeValue((String) null, "value"));
    }

    /* renamed from: v */
    public c a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f9662a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return U(newPullParser, new b(uri.toString()));
            }
            throw ParserException.c("inputStream does not contain a valid media presentation description", (Throwable) null);
        } catch (XmlPullParserException e10) {
            throw ParserException.c((String) null, e10);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0319 A[LOOP:0: B:1:0x007c->B:72:0x0319, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02da A[EDGE_INSN: B:73:0x02da->B:66:0x02da ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k5.a w(org.xmlpull.v1.XmlPullParser r54, java.util.List<k5.b> r55, k5.k r56, long r57, long r59, long r61, long r63, long r65) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            java.lang.String r0 = "id"
            r1 = -1
            int r26 = Q(r14, r0, r1)
            int r0 = r53.E(r54)
            r13 = 0
            java.lang.String r2 = "mimeType"
            java.lang.String r27 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "codecs"
            java.lang.String r28 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "width"
            int r29 = Q(r14, r2, r1)
            java.lang.String r2 = "height"
            int r30 = Q(r14, r2, r1)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r31 = O(r14, r2)
            java.lang.String r2 = "audioSamplingRate"
            int r32 = Q(r14, r2, r1)
            java.lang.String r12 = "lang"
            java.lang.String r2 = r14.getAttributeValue(r13, r12)
            java.lang.String r3 = "label"
            java.lang.String r3 = r14.getAttributeValue(r13, r3)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r33 = 0
            r34 = r56
            r35 = r0
            r37 = r2
            r38 = r3
            r40 = r13
            r36 = -1
            r39 = 0
            r2 = r59
            r0 = r61
        L_0x007c:
            r54.next()
            java.lang.String r13 = "BaseURL"
            boolean r13 = a6.n0.f(r14, r13)
            if (r13 == 0) goto L_0x00ae
            if (r39 != 0) goto L_0x008f
            long r2 = r15.z(r14, r2)
            r39 = 1
        L_0x008f:
            java.util.List r13 = r53.A(r54, r55)
            r4.addAll(r13)
        L_0x0096:
            r41 = r2
            r15 = r5
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r3 = r10
            r49 = r11
            r50 = r12
            r2 = r37
            r51 = 0
            r37 = r4
            goto L_0x02d2
        L_0x00ae:
            java.lang.String r13 = "ContentProtection"
            boolean r13 = a6.n0.f(r14, r13)
            if (r13 == 0) goto L_0x00d0
            android.util.Pair r13 = r53.D(r54)
            r59 = r0
            java.lang.Object r0 = r13.first
            if (r0 == 0) goto L_0x00c4
            r40 = r0
            java.lang.String r40 = (java.lang.String) r40
        L_0x00c4:
            java.lang.Object r0 = r13.second
            if (r0 == 0) goto L_0x00cd
            com.google.android.exoplayer2.drm.h$b r0 = (com.google.android.exoplayer2.drm.h.b) r0
            r11.add(r0)
        L_0x00cd:
            r0 = r59
            goto L_0x0096
        L_0x00d0:
            r59 = r0
            java.lang.String r0 = "ContentComponent"
            boolean r0 = a6.n0.f(r14, r0)
            if (r0 == 0) goto L_0x010a
            r13 = 0
            java.lang.String r0 = r14.getAttributeValue(r13, r12)
            r1 = r37
            java.lang.String r0 = q(r1, r0)
            int r1 = r53.E(r54)
            r15 = r35
            int r1 = p(r15, r1)
            r35 = r1
            r41 = r2
            r37 = r4
            r15 = r5
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r3 = r10
            r49 = r11
            r50 = r12
            r51 = r13
            r2 = r0
        L_0x0106:
            r0 = r59
            goto L_0x02d2
        L_0x010a:
            r15 = r35
            r1 = r37
            r13 = 0
            java.lang.String r0 = "Role"
            boolean r16 = a6.n0.f(r14, r0)
            if (r16 == 0) goto L_0x013a
            k5.e r0 = G(r14, r0)
            r8.add(r0)
        L_0x011e:
            r35 = r1
            r41 = r2
            r37 = r4
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r3 = r10
            r49 = r11
            r50 = r12
            r51 = r13
            r52 = r15
            r0 = r59
            r15 = r5
            goto L_0x02ce
        L_0x013a:
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = a6.n0.f(r14, r0)
            if (r0 == 0) goto L_0x0160
            int r0 = r53.y(r54)
            r36 = r0
            r41 = r2
            r37 = r4
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r3 = r10
            r49 = r11
            r50 = r12
            r51 = r13
            r35 = r15
            r2 = r1
            r15 = r5
            goto L_0x0106
        L_0x0160:
            java.lang.String r0 = "Accessibility"
            boolean r16 = a6.n0.f(r14, r0)
            if (r16 == 0) goto L_0x0170
            k5.e r0 = G(r14, r0)
            r9.add(r0)
            goto L_0x011e
        L_0x0170:
            java.lang.String r0 = "EssentialProperty"
            boolean r16 = a6.n0.f(r14, r0)
            if (r16 == 0) goto L_0x0180
            k5.e r0 = G(r14, r0)
            r7.add(r0)
            goto L_0x011e
        L_0x0180:
            java.lang.String r0 = "SupplementalProperty"
            boolean r16 = a6.n0.f(r14, r0)
            if (r16 == 0) goto L_0x0190
            k5.e r0 = G(r14, r0)
            r6.add(r0)
            goto L_0x011e
        L_0x0190:
            java.lang.String r0 = "Representation"
            boolean r0 = a6.n0.f(r14, r0)
            if (r0 == 0) goto L_0x0208
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01a1
            r16 = r4
            goto L_0x01a3
        L_0x01a1:
            r16 = r55
        L_0x01a3:
            r0 = r53
            r35 = r1
            r1 = r54
            r41 = r2
            r2 = r16
            r3 = r27
            r37 = r4
            r4 = r28
            r43 = r5
            r5 = r29
            r44 = r6
            r6 = r30
            r45 = r7
            r7 = r31
            r46 = r8
            r8 = r36
            r47 = r9
            r9 = r32
            r48 = r10
            r10 = r35
            r49 = r11
            r11 = r46
            r50 = r12
            r12 = r47
            r51 = r13
            r13 = r45
            r14 = r44
            r52 = r15
            r15 = r34
            r16 = r63
            r18 = r57
            r20 = r41
            r22 = r59
            r24 = r65
            k5.d$a r0 = r0.Z(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r24)
            e4.j r1 = r0.f9663a
            java.lang.String r1 = r1.f8096s
            int r1 = a6.t.l(r1)
            r14 = r52
            int r1 = p(r14, r1)
            r15 = r43
            r15.add(r0)
            r14 = r54
            r2 = r35
            r3 = r48
            r35 = r1
            goto L_0x0106
        L_0x0208:
            r35 = r1
            r41 = r2
            r37 = r4
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r48 = r10
            r49 = r11
            r50 = r12
            r51 = r13
            r14 = r15
            r15 = r5
            java.lang.String r0 = "SegmentBase"
            r13 = r54
            boolean r0 = a6.n0.f(r13, r0)
            if (r0 == 0) goto L_0x0241
            r0 = r34
            k5.k$e r0 = (k5.k.e) r0
            r11 = r53
            k5.k$e r0 = r11.e0(r13, r0)
            r34 = r0
            r2 = r35
            r3 = r48
            r0 = r59
            r35 = r14
            r14 = r13
            goto L_0x02d2
        L_0x0241:
            r11 = r53
            java.lang.String r0 = "SegmentList"
            boolean r0 = a6.n0.f(r13, r0)
            if (r0 == 0) goto L_0x0274
            r0 = r59
            long r16 = r11.z(r13, r0)
            r2 = r34
            k5.k$b r2 = (k5.k.b) r2
            r0 = r53
            r1 = r54
            r3 = r63
            r5 = r57
            r7 = r41
            r9 = r16
            r52 = r14
            r14 = r11
            r11 = r65
            k5.k$b r0 = r0.f0(r1, r2, r3, r5, r7, r9, r11)
            r34 = r0
            r14 = r13
        L_0x026d:
            r0 = r16
            r2 = r35
            r3 = r48
            goto L_0x02d0
        L_0x0274:
            r0 = r59
            r52 = r14
            r14 = r11
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = a6.n0.f(r13, r2)
            if (r2 == 0) goto L_0x02a1
            long r16 = r14.z(r13, r0)
            r2 = r34
            k5.k$c r2 = (k5.k.c) r2
            r0 = r53
            r1 = r54
            r3 = r44
            r4 = r63
            r6 = r57
            r8 = r41
            r10 = r16
            r14 = r13
            r12 = r65
            k5.k$c r0 = r0.g0(r1, r2, r3, r4, r6, r8, r10, r12)
            r34 = r0
            goto L_0x026d
        L_0x02a1:
            r14 = r13
            java.lang.String r2 = "InbandEventStream"
            boolean r3 = a6.n0.f(r14, r2)
            if (r3 == 0) goto L_0x02b4
            k5.e r2 = G(r14, r2)
            r3 = r48
            r3.add(r2)
            goto L_0x02ce
        L_0x02b4:
            r3 = r48
            java.lang.String r2 = "Label"
            boolean r2 = a6.n0.f(r14, r2)
            if (r2 == 0) goto L_0x02c5
            java.lang.String r2 = r53.R(r54)
            r38 = r2
            goto L_0x02ce
        L_0x02c5:
            boolean r2 = a6.n0.e(r54)
            if (r2 == 0) goto L_0x02ce
            r53.x(r54)
        L_0x02ce:
            r2 = r35
        L_0x02d0:
            r35 = r52
        L_0x02d2:
            java.lang.String r4 = "AdaptationSet"
            boolean r4 = a6.n0.d(r14, r4)
            if (r4 == 0) goto L_0x0319
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            r1 = 0
        L_0x02e4:
            int r2 = r15.size()
            if (r1 >= r2) goto L_0x0306
            java.lang.Object r2 = r15.get(r1)
            k5.d$a r2 = (k5.d.a) r2
            r54 = r53
            r55 = r2
            r56 = r38
            r57 = r40
            r58 = r49
            r59 = r3
            k5.j r2 = r54.j(r55, r56, r57, r58, r59)
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x02e4
        L_0x0306:
            r54 = r53
            r55 = r26
            r56 = r35
            r57 = r0
            r58 = r47
            r59 = r45
            r60 = r44
            k5.a r0 = r54.c(r55, r56, r57, r58, r59, r60)
            return r0
        L_0x0319:
            r10 = r3
            r5 = r15
            r4 = r37
            r6 = r44
            r7 = r45
            r8 = r46
            r9 = r47
            r11 = r49
            r12 = r50
            r13 = r51
            r15 = r53
            r37 = r2
            r2 = r41
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.d.w(org.xmlpull.v1.XmlPullParser, java.util.List, k5.k, long, long, long, long, long):k5.a");
    }

    /* access modifiers changed from: protected */
    public void x(XmlPullParser xmlPullParser) {
        u(xmlPullParser);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int y(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = m0(r4, r0, r1)
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -1352850286: goto L_0x0035;
                case -1138141449: goto L_0x002a;
                case -986633423: goto L_0x001f;
                case 2036691300: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            r0 = -1
            goto L_0x003f
        L_0x0014:
            java.lang.String r1 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001d
            goto L_0x0012
        L_0x001d:
            r0 = 3
            goto L_0x003f
        L_0x001f:
            java.lang.String r1 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0028
            goto L_0x0012
        L_0x0028:
            r0 = 2
            goto L_0x003f
        L_0x002a:
            java.lang.String r1 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0033
            goto L_0x0012
        L_0x0033:
            r0 = 1
            goto L_0x003f
        L_0x0035:
            java.lang.String r1 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003e
            goto L_0x0012
        L_0x003e:
            r0 = 0
        L_0x003f:
            switch(r0) {
                case 0: goto L_0x004d;
                case 1: goto L_0x0048;
                case 2: goto L_0x0043;
                case 3: goto L_0x0048;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x0053
        L_0x0043:
            int r2 = V(r4)
            goto L_0x0053
        L_0x0048:
            int r2 = H(r4)
            goto L_0x0053
        L_0x004d:
            java.lang.String r0 = "value"
            int r2 = Q(r4, r0, r2)
        L_0x0053:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = a6.n0.d(r4, r0)
            if (r0 == 0) goto L_0x0053
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.d.y(org.xmlpull.v1.XmlPullParser):int");
    }

    /* access modifiers changed from: protected */
    public long z(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }
}
