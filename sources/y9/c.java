package y9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Environment;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.b;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.l;
import np.com.nepalipatro.models.NsDate;
import r6.f;

/* compiled from: NsMapping.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private String f17458a = "";

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f17459b;

    /* renamed from: c  reason: collision with root package name */
    private Context f17460c;
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: d  reason: collision with root package name */
    private final DateFormat f17461d = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: e  reason: collision with root package name */
    private Date f17462e;

    /* renamed from: f  reason: collision with root package name */
    private String f17463f;

    /* renamed from: g  reason: collision with root package name */
    private int f17464g;

    /* renamed from: h  reason: collision with root package name */
    private String f17465h = "";

    /* renamed from: i  reason: collision with root package name */
    private int f17466i;

    /* renamed from: j  reason: collision with root package name */
    public String[] f17467j;

    public c(Context context) {
        this.f17460c = context;
        i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r3 = r3.keySet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<?, ?> f(int r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.f17459b
            r4 = 0
            if (r3 == 0) goto L_0x0016
            java.util.Set r3 = r3.keySet()
            if (r3 == 0) goto L_0x0016
            int r3 = r3.size()
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            r2.<init>(r3)
            int r3 = r2.size()
            java.lang.String r5 = ""
            r7 = r5
            r6 = 0
        L_0x0022:
            r8 = 0
            r9 = 1
            if (r6 >= r3) goto L_0x00c1
            java.lang.Object r7 = r2.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            int r6 = r6 + 1
            int r10 = r2.size()
            if (r6 >= r10) goto L_0x003c
            java.lang.Object r10 = r2.get(r6)
            java.lang.String r10 = (java.lang.String) r10
            r15 = r10
            goto L_0x003d
        L_0x003c:
            r15 = r5
        L_0x003d:
            java.lang.String r10 = "."
            r11 = 2
            boolean r12 = g9.q.y(r7, r10, r4, r11, r8)
            java.lang.String r16 = "\\."
            if (r12 == 0) goto L_0x0097
            boolean r10 = g9.q.y(r15, r10, r4, r11, r8)
            if (r10 == 0) goto L_0x0097
            java.lang.String[] r11 = new java.lang.String[]{r16}
            r12 = 0
            r13 = 0
            r14 = 6
            r17 = 0
            r10 = r7
            r18 = r15
            r15 = r17
            java.util.List r10 = g9.q.c0(r10, r11, r12, r13, r14, r15)
            java.lang.String[] r11 = new java.lang.String[r4]
            java.lang.Object[] r10 = r10.toArray(r11)
            java.lang.String[] r10 = (java.lang.String[]) r10
            r10 = r10[r4]
            int r10 = java.lang.Integer.parseInt(r10)
            java.lang.String[] r12 = new java.lang.String[]{r16}     // Catch:{ Exception -> 0x008c }
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r18
            java.util.List r11 = g9.q.c0(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x008c }
            java.lang.String[] r12 = new java.lang.String[r4]     // Catch:{ Exception -> 0x008c }
            java.lang.Object[] r11 = r11.toArray(r12)     // Catch:{ Exception -> 0x008c }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ Exception -> 0x008c }
            r11 = r11[r4]     // Catch:{ Exception -> 0x008c }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ Exception -> 0x008c }
            goto L_0x008d
        L_0x008c:
            r11 = 0
        L_0x008d:
            if (r10 > r1) goto L_0x0093
            if (r1 > r11) goto L_0x0093
            r10 = 1
            goto L_0x0094
        L_0x0093:
            r10 = 0
        L_0x0094:
            if (r10 == 0) goto L_0x0022
            goto L_0x00c1
        L_0x0097:
            r18 = r15
            int r10 = r18.length()
            if (r10 != 0) goto L_0x00a1
            r10 = 1
            goto L_0x00a2
        L_0x00a1:
            r10 = 0
        L_0x00a2:
            if (r10 == 0) goto L_0x0022
            java.lang.String[] r11 = new java.lang.String[]{r16}
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            r10 = r7
            java.util.List r10 = g9.q.c0(r10, r11, r12, r13, r14, r15)
            java.lang.String[] r11 = new java.lang.String[r4]
            java.lang.Object[] r10 = r10.toArray(r11)
            java.lang.String[] r10 = (java.lang.String[]) r10
            r10 = r10[r4]
            int r10 = java.lang.Integer.parseInt(r10)
            if (r1 < r10) goto L_0x0022
        L_0x00c1:
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f17459b
            if (r2 == 0) goto L_0x00cc
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00cd
        L_0x00cc:
            r2 = r8
        L_0x00cd:
            java.lang.String r10 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "~"
            java.lang.String[] r11 = new java.lang.String[]{r3}
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            java.util.List r3 = g9.q.c0(r10, r11, r12, r13, r14, r15)
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r5)
            java.lang.String[] r3 = (java.lang.String[]) r3
            int r5 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r5)
            java.util.List r3 = java.util.Arrays.asList(r3)
            int r5 = r3.size()
            r6 = 0
        L_0x00f5:
            if (r6 >= r5) goto L_0x0146
            java.lang.Object r7 = r3.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r10 = "monthMap"
            kotlin.jvm.internal.m.e(r7, r10)
            r10 = 4
            java.lang.String r11 = r7.substring(r4, r10)
            java.lang.String r12 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.m.e(r11, r12)
            int r11 = java.lang.Integer.parseInt(r11)
            r13 = 8
            java.lang.String r7 = r7.substring(r10, r13)
            kotlin.jvm.internal.m.e(r7, r12)
            r10 = r21
            if (r11 != r1) goto L_0x0143
            boolean r7 = g9.p.m(r7, r10, r9)
            if (r7 == 0) goto L_0x0143
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r3 = "mapping"
            boolean r4 = r1.containsKey(r3)
            if (r4 != 0) goto L_0x0133
            r1.put(r3, r2)
        L_0x0133:
            java.lang.String r2 = "index"
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L_0x0142
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r1.put(r2, r3)
        L_0x0142:
            return r1
        L_0x0143:
            int r6 = r6 + 1
            goto L_0x00f5
        L_0x0146:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.c.f(int, java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r1.keySet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String g(int r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.String> r1 = r14.f17459b
            r2 = 0
            if (r1 == 0) goto L_0x0012
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L_0x0012
            int r1 = r1.size()
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 5
            r1.<init>(r3)
            int r1 = r0.size()
            r3 = 0
        L_0x0021:
            r4 = 0
            if (r3 >= r1) goto L_0x00f0
            java.lang.Object r5 = r0.get(r3)
            java.lang.String r6 = "_keys[i]"
            kotlin.jvm.internal.m.e(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            int r3 = r3 + 1
            int r6 = r0.size()
            if (r3 >= r6) goto L_0x0043
            java.lang.Object r6 = r0.get(r3)
            java.lang.String r7 = "_keys[i + 1]"
            kotlin.jvm.internal.m.e(r6, r7)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0045
        L_0x0043:
            java.lang.String r6 = ""
        L_0x0045:
            java.lang.String r7 = "."
            r8 = 2
            boolean r9 = g9.q.y(r5, r7, r2, r8, r4)
            java.lang.String r13 = "\\."
            if (r9 == 0) goto L_0x0096
            boolean r9 = g9.q.y(r6, r7, r2, r8, r4)
            if (r9 == 0) goto L_0x0096
            java.lang.String[] r8 = new java.lang.String[]{r13}
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r5
            java.util.List r4 = g9.q.c0(r7, r8, r9, r10, r11, r12)
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.Object[] r4 = r4.toArray(r7)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r4 = r4[r2]
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String[] r8 = new java.lang.String[]{r13}     // Catch:{ Exception -> 0x008d }
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r6
            java.util.List r7 = g9.q.c0(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x008d }
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ Exception -> 0x008d }
            java.lang.Object[] r7 = r7.toArray(r8)     // Catch:{ Exception -> 0x008d }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ Exception -> 0x008d }
            r7 = r7[r2]     // Catch:{ Exception -> 0x008d }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x008d }
            goto L_0x008e
        L_0x008d:
            r7 = 0
        L_0x008e:
            if (r15 < r4) goto L_0x0093
            if (r15 >= r7) goto L_0x0093
            return r5
        L_0x0093:
            if (r15 != r7) goto L_0x0021
            return r6
        L_0x0096:
            int r9 = r6.length()
            r10 = 1
            if (r9 != 0) goto L_0x009f
            r9 = 1
            goto L_0x00a0
        L_0x009f:
            r9 = 0
        L_0x00a0:
            if (r9 != 0) goto L_0x00c2
            java.lang.String[] r8 = new java.lang.String[]{r13}     // Catch:{ Exception -> 0x00be }
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r6
            java.util.List r4 = g9.q.c0(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00be }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00be }
            java.lang.Object[] r4 = r4.toArray(r5)     // Catch:{ Exception -> 0x00be }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ Exception -> 0x00be }
            r4 = r4[r2]     // Catch:{ Exception -> 0x00be }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x00be }
            goto L_0x00bf
        L_0x00be:
            r4 = 0
        L_0x00bf:
            if (r15 != r4) goto L_0x0021
            return r6
        L_0x00c2:
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r10 = 0
        L_0x00ca:
            if (r10 == 0) goto L_0x0021
            boolean r4 = g9.q.y(r5, r7, r2, r8, r4)
            if (r4 == 0) goto L_0x0021
            java.lang.String[] r8 = new java.lang.String[]{r13}
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r5
            java.util.List r4 = g9.q.c0(r7, r8, r9, r10, r11, r12)
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.Object[] r4 = r4.toArray(r6)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r4 = r4[r2]
            int r4 = java.lang.Integer.parseInt(r4)
            if (r15 < r4) goto L_0x0021
            return r5
        L_0x00f0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.c.g(int):java.lang.String");
    }

    private final void i() {
        String str;
        String str2;
        try {
            if (this.f17458a.length() == 0) {
                File dataDirectory = Environment.getDataDirectory();
                StringBuilder sb = new StringBuilder();
                sb.append(dataDirectory.getPath());
                sb.append("/data/");
                Context context = this.f17460c;
                m.c(context);
                sb.append(context.getPackageName());
                sb.append("/app_flutter");
                File file = new File(sb.toString(), "tithimap.txt");
                l.a aVar = l.f16129a;
                String v10 = aVar.v(file);
                this.f17458a = v10;
                this.f17458a = aVar.a("9E4mk3Woz7tN8Ic9LRZYG5ipy7971B62egK199a0d+c=", v10);
            }
            if (this.f17459b == null) {
                this.f17459b = (Map) new f().i(this.f17458a, Map.class);
            }
            Map<String, String> map = this.f17459b;
            String str3 = null;
            if ((map != null ? map.get("st_ad") : null) != null) {
                Map<String, String> map2 = this.f17459b;
                str = String.valueOf(map2 != null ? map2.get("st_ad") : null);
            } else {
                str = "18430415";
            }
            Map<String, String> map3 = this.f17459b;
            if ((map3 != null ? map3.get("st_ns") : null) != null) {
                Map<String, String> map4 = this.f17459b;
                if (map4 != null) {
                    str3 = map4.get("st_ns");
                }
                str2 = String.valueOf(str3);
            } else {
                str2 = "963";
            }
            this.f17463f = str2;
            this.f17462e = this.f17461d.parse(str);
        } catch (ParseException e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final Map<?, ?> a(NsDate nsDate, int i10, int i11) {
        String str;
        m.f(nsDate, "nsDate");
        Map<?, ?> f10 = f(nsDate.getYear(), nsDate.getMonth());
        HashMap hashMap = new HashMap();
        Object obj = f10 != null ? f10.get(FirebaseAnalytics.Param.INDEX) : null;
        m.d(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = f10.get("mapping");
        new ArrayList();
        Object arrayList = new ArrayList();
        String[] strArr = (String[]) q.c0(String.valueOf(obj2), new String[]{"~"}, false, 0, 6, (Object) null).toArray(new String[0]);
        List asList = Arrays.asList(Arrays.copyOf(strArr, strArr.length));
        m.e(asList, "asList(*map.toString().split(\"~\").toTypedArray())");
        int i12 = intValue + i11;
        if (i12 < asList.size()) {
            try {
                str = (String) asList.get(i12);
            } catch (Exception unused) {
                str = "";
            }
            m.c(str);
            String substring = str.substring(0, 4);
            m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            String substring2 = str.substring(4, 8);
            m.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            NsDate nsDate2 = new NsDate(parseInt, substring2, i10);
            arrayList = c(new NsDate(parseInt, substring2, i10), Boolean.FALSE);
            if (!hashMap.containsKey("nsdate")) {
                hashMap.put("nsdate", nsDate2);
            }
        }
        if (!hashMap.containsKey("recurrence")) {
            hashMap.put("recurrence", arrayList);
        }
        return hashMap;
    }

    public final List<Date> b(NsDate nsDate, int i10, String str, int i11, int i12) {
        m.f(nsDate, "nsDate");
        m.c(str);
        return c(new NsDate(nsDate.getYear() + i11, str, i10), Boolean.valueOf(i12 == nsDate.getYear()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082 A[SYNTHETIC, Splitter:B:18:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0158 A[Catch:{ Exception -> 0x0225 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d9 A[Catch:{ Exception -> 0x0225 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0156 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.util.Date> c(np.com.nepalipatro.models.NsDate r25, java.lang.Boolean r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.String r2 = "nsDate"
            kotlin.jvm.internal.m.f(r1, r2)
            int r2 = r25.getYear()     // Catch:{ Exception -> 0x0225 }
            java.lang.String r3 = r0.g(r2)     // Catch:{ Exception -> 0x0225 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f17459b     // Catch:{ Exception -> 0x0225 }
            r4 = 0
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0225 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0225 }
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r4
        L_0x001f:
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.m.d(r5, r2)     // Catch:{ Exception -> 0x0225 }
            java.lang.String r2 = "~"
            java.lang.String[] r6 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x0225 }
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r2 = g9.q.c0(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0225 }
            r9 = 0
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ Exception -> 0x0225 }
            java.lang.Object[] r2 = r2.toArray(r5)     // Catch:{ Exception -> 0x0225 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Exception -> 0x0225 }
            int r5 = r2.length     // Catch:{ Exception -> 0x0225 }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch:{ Exception -> 0x0225 }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ Exception -> 0x0225 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0225 }
            r10.<init>()     // Catch:{ Exception -> 0x0225 }
            kotlin.jvm.internal.m.c(r3)     // Catch:{ Exception -> 0x0225 }
            java.lang.String r5 = "."
            r11 = 2
            boolean r4 = g9.q.y(r3, r5, r9, r11, r4)     // Catch:{ Exception -> 0x0225 }
            java.lang.String r12 = "\\."
            r13 = 1
            if (r4 == 0) goto L_0x0073
            java.lang.String[] r4 = new java.lang.String[]{r12}     // Catch:{ Exception -> 0x0073 }
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            java.util.List r3 = g9.q.c0(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0073 }
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ Exception -> 0x0073 }
            java.lang.Object[] r3 = r3.toArray(r4)     // Catch:{ Exception -> 0x0073 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ Exception -> 0x0073 }
            r3 = r3[r13]     // Catch:{ Exception -> 0x0073 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0073 }
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            int r4 = r2.size()     // Catch:{ Exception -> 0x0225 }
            java.lang.String r5 = ""
            r8 = r5
            r6 = 0
            r7 = 0
            r14 = 0
        L_0x007e:
            java.lang.String r15 = "this as java.lang.String…ing(startIndex, endIndex)"
            if (r6 >= r4) goto L_0x014d
            java.lang.Object r7 = r2.get(r6)     // Catch:{ Exception -> 0x0225 }
            if (r7 == 0) goto L_0x008f
            java.lang.Object r7 = r2.get(r6)     // Catch:{ Exception -> 0x0225 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0225 }
            goto L_0x0090
        L_0x008f:
            r7 = r5
        L_0x0090:
            kotlin.jvm.internal.m.c(r7)     // Catch:{ Exception -> 0x0225 }
            int r8 = r7.length()     // Catch:{ Exception -> 0x0225 }
            int r8 = r8 - r11
            int r14 = r7.length()     // Catch:{ Exception -> 0x0225 }
            java.lang.String r8 = r7.substring(r8, r14)     // Catch:{ Exception -> 0x0225 }
            kotlin.jvm.internal.m.e(r8, r15)     // Catch:{ Exception -> 0x0225 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0225 }
            r14 = 4
            java.lang.String r11 = r7.substring(r9, r14)     // Catch:{ Exception -> 0x0225 }
            kotlin.jvm.internal.m.e(r11, r15)     // Catch:{ Exception -> 0x0225 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ Exception -> 0x0225 }
            r0.f17464g = r11     // Catch:{ Exception -> 0x0225 }
            r11 = 9
            r13 = 11
            java.lang.String r11 = r7.substring(r11, r13)     // Catch:{ Exception -> 0x0225 }
            kotlin.jvm.internal.m.e(r11, r15)     // Catch:{ Exception -> 0x0225 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ Exception -> 0x0225 }
            r9 = 8
            java.lang.String r9 = r7.substring(r14, r9)     // Catch:{ Exception -> 0x0225 }
            kotlin.jvm.internal.m.e(r9, r15)     // Catch:{ Exception -> 0x0225 }
            r0.f17465h = r9     // Catch:{ Exception -> 0x0225 }
            r9 = 27
            java.lang.String r7 = r7.substring(r13, r9)     // Catch:{ Exception -> 0x0225 }
            kotlin.jvm.internal.m.e(r7, r15)     // Catch:{ Exception -> 0x0225 }
            kotlin.jvm.internal.m.c(r26)     // Catch:{ Exception -> 0x0225 }
            boolean r9 = r26.booleanValue()     // Catch:{ Exception -> 0x0225 }
            if (r9 != 0) goto L_0x0122
            java.lang.String r17 = r25.getMonth()     // Catch:{ Exception -> 0x0225 }
            java.lang.String[] r18 = new java.lang.String[]{r12}     // Catch:{ Exception -> 0x0225 }
            r19 = 0
            r20 = 0
            r21 = 6
            r22 = 0
            java.util.List r9 = g9.q.c0(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0225 }
            r13 = 0
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ Exception -> 0x0225 }
            java.lang.Object[] r9 = r9.toArray(r14)     // Catch:{ Exception -> 0x0225 }
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ Exception -> 0x0225 }
            java.lang.String r13 = "0"
            r14 = 1
            r9[r14] = r13     // Catch:{ Exception -> 0x0225 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0225 }
            r13.<init>()     // Catch:{ Exception -> 0x0225 }
            r16 = 0
            r14 = r9[r16]     // Catch:{ Exception -> 0x0225 }
            r13.append(r14)     // Catch:{ Exception -> 0x0225 }
            r14 = 46
            r13.append(r14)     // Catch:{ Exception -> 0x0225 }
            r14 = 1
            r9 = r9[r14]     // Catch:{ Exception -> 0x0225 }
            r13.append(r9)     // Catch:{ Exception -> 0x0225 }
            java.lang.String r9 = r13.toString()     // Catch:{ Exception -> 0x0225 }
            r1.setMonth(r9)     // Catch:{ Exception -> 0x0225 }
            goto L_0x0124
        L_0x0122:
            r16 = 0
        L_0x0124:
            java.lang.String r9 = r0.f17465h     // Catch:{ Exception -> 0x0225 }
            java.lang.String r13 = r25.getMonth()     // Catch:{ Exception -> 0x0225 }
            boolean r9 = kotlin.jvm.internal.m.a(r9, r13)     // Catch:{ Exception -> 0x0225 }
            if (r9 == 0) goto L_0x013f
            int r9 = r0.f17464g     // Catch:{ Exception -> 0x0225 }
            int r13 = r25.getYear()     // Catch:{ Exception -> 0x0225 }
            if (r9 != r13) goto L_0x013f
            r14 = r11
            r23 = r8
            r8 = r7
            r7 = r23
            goto L_0x014f
        L_0x013f:
            int r3 = r3 + r8
            int r6 = r6 + 1
            r14 = r11
            r9 = 0
            r11 = 2
            r13 = 1
            r23 = r8
            r8 = r7
            r7 = r23
            goto L_0x007e
        L_0x014d:
            r16 = 0
        L_0x014f:
            r13 = 0
        L_0x0150:
            int r2 = r10.size()     // Catch:{ Exception -> 0x0225 }
            if (r2 < r7) goto L_0x0158
            goto L_0x01cd
        L_0x0158:
            int r2 = r13 + 1
            int r4 = r8.length()     // Catch:{ Exception -> 0x0225 }
            if (r2 > r4) goto L_0x01c6
            java.lang.String r4 = r8.substring(r13, r2)     // Catch:{ Exception -> 0x016c }
            kotlin.jvm.internal.m.e(r4, r15)     // Catch:{ Exception -> 0x016c }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x016c }
            goto L_0x016d
        L_0x016c:
            r4 = 0
        L_0x016d:
            int r5 = r10.size()     // Catch:{ Exception -> 0x0225 }
            if (r5 != 0) goto L_0x0176
            r5 = 0
            r6 = 1
            goto L_0x0186
        L_0x0176:
            int r5 = r10.size()     // Catch:{ Exception -> 0x0225 }
            r6 = 1
            int r5 = r5 - r6
            java.lang.Object r5 = r10.get(r5)     // Catch:{ Exception -> 0x0225 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ Exception -> 0x0225 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0225 }
        L_0x0186:
            if (r4 == 0) goto L_0x01ab
            if (r4 == r6) goto L_0x019f
            r6 = 2
            if (r4 == r6) goto L_0x018e
            goto L_0x01c7
        L_0x018e:
            int r5 = r5 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0225 }
            r10.add(r4)     // Catch:{ Exception -> 0x0225 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0225 }
            r10.add(r4)     // Catch:{ Exception -> 0x0225 }
            goto L_0x01a9
        L_0x019f:
            r6 = 2
            int r5 = r5 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0225 }
            r10.add(r4)     // Catch:{ Exception -> 0x0225 }
        L_0x01a9:
            r13 = r2
            goto L_0x01c7
        L_0x01ab:
            r6 = 2
            int r5 = r5 + 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0225 }
            r10.add(r2)     // Catch:{ Exception -> 0x0225 }
            int r2 = r10.size()     // Catch:{ Exception -> 0x0225 }
            r4 = 1
            int r2 = r2 - r4
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x0225 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ Exception -> 0x0225 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0225 }
            goto L_0x01a9
        L_0x01c6:
            r6 = 2
        L_0x01c7:
            int r2 = r8.length()     // Catch:{ Exception -> 0x0225 }
            if (r13 < r2) goto L_0x0150
        L_0x01cd:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0225 }
            r2.<init>()     // Catch:{ Exception -> 0x0225 }
            int r4 = r10.size()     // Catch:{ Exception -> 0x0225 }
            r13 = 0
        L_0x01d7:
            if (r13 >= r4) goto L_0x022a
            java.lang.Object r5 = r10.get(r13)     // Catch:{ Exception -> 0x0225 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ Exception -> 0x0225 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0225 }
            r6 = 15
            r8 = 30
            if (r5 == r6) goto L_0x01ee
            r6 = 16
            if (r5 == r6) goto L_0x01ee
            goto L_0x01f2
        L_0x01ee:
            if (r14 != r8) goto L_0x01f2
            r5 = 30
        L_0x01f2:
            int r6 = r25.getTithi()     // Catch:{ Exception -> 0x0225 }
            if (r6 != r5) goto L_0x0221
            int r5 = r13 + 1
            int r6 = r25.getTithi()     // Catch:{ Exception -> 0x0225 }
            if (r6 != r8) goto L_0x0201
            r5 = r7
        L_0x0201:
            int r5 = r5 + r3
            r9 = 1
            int r5 = r5 - r9
            if (r5 >= 0) goto L_0x0207
            r5 = 0
        L_0x0207:
            java.util.Calendar r6 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0225 }
            java.util.Date r8 = r0.f17462e     // Catch:{ Exception -> 0x0225 }
            r6.setTime(r8)     // Catch:{ Exception -> 0x0225 }
            r8 = 5
            r6.add(r8, r5)     // Catch:{ Exception -> 0x0225 }
            java.util.Date r5 = r6.getTime()     // Catch:{ Exception -> 0x0225 }
            java.lang.String r6 = "resultDate"
            kotlin.jvm.internal.m.e(r5, r6)     // Catch:{ Exception -> 0x0225 }
            r2.add(r5)     // Catch:{ Exception -> 0x0225 }
            goto L_0x0222
        L_0x0221:
            r9 = 1
        L_0x0222:
            int r13 = r13 + 1
            goto L_0x01d7
        L_0x0225:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x022a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.c.c(np.com.nepalipatro.models.NsDate, java.lang.Boolean):java.util.List");
    }

    public final NsDate d(Calendar calendar) {
        int i10;
        try {
            Calendar instance = Calendar.getInstance();
            instance.setTime(this.f17462e);
            Calendar instance2 = Calendar.getInstance(e.f15961a.T());
            instance2.setTime(calendar != null ? calendar.getTime() : null);
            b bVar = b.f15915a;
            m.e(instance, "calendarStarAdDate");
            m.e(instance2, "calendarAdDate");
            int j10 = bVar.j(instance, instance2, true);
            String e10 = e(j10);
            Map<String, String> map = this.f17459b;
            j((String[]) q.c0(String.valueOf(map != null ? map.get(e10) : null), new String[]{"~"}, false, 0, 6, (Object) null).toArray(new String[0]));
            int parseInt = ((e10.length() == 0) || !q.y(e10, ".", false, 2, (Object) null)) ? 0 : Integer.parseInt(((String[]) q.c0(e10, new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]))[1]);
            String str = "";
            ArrayList arrayList = new ArrayList();
            int length = h().length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                str = h()[i11];
                String substring = str.substring(str.length() - 2, str.length());
                m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                i12 = Integer.parseInt(substring);
                String substring2 = str.substring(0, 4);
                m.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                this.f17464g = Integer.parseInt(substring2);
                String substring3 = str.substring(4, 8);
                m.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                this.f17465h = substring3;
                parseInt += i12;
                if (j10 < parseInt) {
                    break;
                }
                i11++;
            }
            String substring4 = str.substring(9, 11);
            m.e(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt2 = Integer.parseInt(substring4);
            String substring5 = str.substring(11, 27);
            m.e(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
            int i13 = 0;
            while (true) {
                if (arrayList.size() < i12) {
                    int i14 = i13 + 1;
                    if (i14 <= substring5.length()) {
                        try {
                            String substring6 = substring5.substring(i13, i14);
                            m.e(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                            i10 = Integer.parseInt(substring6);
                        } catch (Exception unused) {
                            i10 = 0;
                        }
                        int intValue = arrayList.size() == 0 ? 0 : ((Number) arrayList.get(arrayList.size() - 1)).intValue();
                        if (i10 != 0) {
                            if (i10 == 1) {
                                arrayList.add(Integer.valueOf(intValue + 1));
                            } else if (i10 == 2) {
                                int i15 = intValue + 1;
                                arrayList.add(Integer.valueOf(i15));
                                arrayList.add(Integer.valueOf(i15));
                            }
                            i13 = i14;
                        } else {
                            arrayList.add(Integer.valueOf(intValue + 2));
                            i13 = ((Number) arrayList.get(arrayList.size() - 1)).intValue();
                        }
                    }
                    if (i13 >= substring5.length()) {
                        break;
                    }
                } else {
                    break;
                }
            }
            int intValue2 = ((Number) arrayList.get(((i12 - (parseInt - j10)) + 1) - 1)).intValue();
            if (intValue2 == 15 || intValue2 == 16) {
                if (parseInt2 == 30) {
                    this.f17466i = parseInt2;
                    return new NsDate(this.f17464g, this.f17465h, parseInt2);
                }
            }
            parseInt2 = intValue2;
            this.f17466i = parseInt2;
            return new NsDate(this.f17464g, this.f17465h, parseInt2);
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x007f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x001d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f17459b
            r3 = 0
            if (r2 == 0) goto L_0x000e
            java.util.Set r2 = r2.keySet()
            goto L_0x000f
        L_0x000e:
            r2 = r3
        L_0x000f:
            kotlin.jvm.internal.m.c(r2)
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r5)
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r5 = r2.length
            r6 = 0
        L_0x001d:
            java.lang.String r7 = ""
            if (r6 >= r5) goto L_0x00af
            r14 = r2[r6]
            int r6 = r6 + 1
            int r8 = r2.length
            if (r6 >= r8) goto L_0x002a
            r7 = r2[r6]
        L_0x002a:
            java.lang.String r15 = "."
            r8 = 2
            boolean r9 = g9.q.y(r14, r15, r4, r8, r3)
            r16 = 1
            if (r9 == 0) goto L_0x0080
            boolean r9 = g9.q.y(r7, r15, r4, r8, r3)
            if (r9 == 0) goto L_0x0080
            java.lang.String[] r9 = new java.lang.String[]{r15}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r14
            java.util.List r8 = g9.q.c0(r8, r9, r10, r11, r12, r13)
            java.lang.String[] r9 = new java.lang.String[r4]
            java.lang.Object[] r8 = r8.toArray(r9)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r8 = r8[r16]
            int r13 = java.lang.Integer.parseInt(r8)
            java.lang.String[] r9 = new java.lang.String[]{r15}     // Catch:{ Exception -> 0x0074 }
            r10 = 0
            r11 = 0
            r12 = 6
            r15 = 0
            r8 = r7
            r7 = r13
            r13 = r15
            java.util.List r8 = g9.q.c0(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0075 }
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0075 }
            java.lang.Object[] r8 = r8.toArray(r9)     // Catch:{ Exception -> 0x0075 }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ Exception -> 0x0075 }
            r8 = r8[r16]     // Catch:{ Exception -> 0x0075 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0076
        L_0x0074:
            r7 = r13
        L_0x0075:
            r8 = 0
        L_0x0076:
            if (r7 > r1) goto L_0x007b
            if (r1 > r8) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r16 = 0
        L_0x007d:
            if (r16 == 0) goto L_0x001d
            return r14
        L_0x0080:
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0088
            r7 = 1
            goto L_0x0089
        L_0x0088:
            r7 = 0
        L_0x0089:
            if (r7 == 0) goto L_0x001d
            boolean r7 = g9.q.y(r14, r15, r4, r8, r3)
            if (r7 == 0) goto L_0x001d
            java.lang.String[] r9 = new java.lang.String[]{r15}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r14
            java.util.List r7 = g9.q.c0(r8, r9, r10, r11, r12, r13)
            java.lang.String[] r8 = new java.lang.String[r4]
            java.lang.Object[] r7 = r7.toArray(r8)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r7 = r7[r16]
            int r7 = java.lang.Integer.parseInt(r7)
            if (r1 < r7) goto L_0x001d
            return r14
        L_0x00af:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.c.e(int):java.lang.String");
    }

    public final String[] h() {
        String[] strArr = this.f17467j;
        if (strArr != null) {
            return strArr;
        }
        m.x("_dataMap");
        return null;
    }

    public final void j(String[] strArr) {
        m.f(strArr, "<set-?>");
        this.f17467j = strArr;
    }
}
