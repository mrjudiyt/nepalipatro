package y9;

import android.content.Context;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.b;
import np.com.nepalipatro.models.BsDate;
import np.com.nepalipatro.models.NsDate;

/* compiled from: RecurrenceRuleHelper.kt */
public final class d {
    public static final a C = new a((g) null);
    private b A;
    private Context B;

    /* renamed from: a  reason: collision with root package name */
    private final String f17468a = "FREQ";

    /* renamed from: b  reason: collision with root package name */
    private final String f17469b = "INTERVAL";

    /* renamed from: c  reason: collision with root package name */
    private final String f17470c = "COUNT";

    /* renamed from: d  reason: collision with root package name */
    private final String f17471d = "BYMONTH";

    /* renamed from: e  reason: collision with root package name */
    private final String f17472e = "BYDAY";

    /* renamed from: f  reason: collision with root package name */
    private final String f17473f = "BYMONTHDAY";

    /* renamed from: g  reason: collision with root package name */
    private final String f17474g = "UNTIL";

    /* renamed from: h  reason: collision with root package name */
    private String f17475h = "DAILY";

    /* renamed from: i  reason: collision with root package name */
    private String f17476i = "WEEKLY";

    /* renamed from: j  reason: collision with root package name */
    private String f17477j = "MONTHLY";

    /* renamed from: k  reason: collision with root package name */
    private String f17478k = "YEARLY";

    /* renamed from: l  reason: collision with root package name */
    private String f17479l = "";

    /* renamed from: m  reason: collision with root package name */
    private String f17480m = "";

    /* renamed from: n  reason: collision with root package name */
    private String f17481n = "";

    /* renamed from: o  reason: collision with root package name */
    private String f17482o = "";

    /* renamed from: p  reason: collision with root package name */
    private String f17483p = "";

    /* renamed from: q  reason: collision with root package name */
    private String f17484q = "";

    /* renamed from: r  reason: collision with root package name */
    private int[] f17485r;

    /* renamed from: s  reason: collision with root package name */
    private String f17486s = "";

    /* renamed from: t  reason: collision with root package name */
    private Date f17487t;

    /* renamed from: u  reason: collision with root package name */
    private Date f17488u;

    /* renamed from: v  reason: collision with root package name */
    private Date f17489v;

    /* renamed from: w  reason: collision with root package name */
    private Date f17490w;

    /* renamed from: x  reason: collision with root package name */
    private a f17491x;

    /* renamed from: y  reason: collision with root package name */
    private Date f17492y;

    /* renamed from: z  reason: collision with root package name */
    private c f17493z;

    /* compiled from: RecurrenceRuleHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final a a(String str) {
            m.f(str, ShareConstants.MEDIA_TYPE);
            if (p.m(str, "bs", true)) {
                return a.BS;
            }
            if (p.m(str, "ad", true)) {
                return a.AD;
            }
            if (p.m(str, "ns", true)) {
                return a.NS;
            }
            return a.AD;
        }
    }

    public d(Context context, String str, Date date, Date date2, Date date3, a aVar) {
        this.B = context;
        m.c(str);
        this.f17486s = str;
        this.f17487t = date;
        this.f17489v = date2;
        this.f17490w = date3;
        this.f17491x = aVar;
        this.f17493z = new c(context);
        this.A = new b();
        l();
        k();
    }

    private final Date a(Date date, int i10) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        if (this.f17491x == a.AD) {
            Calendar instance2 = Calendar.getInstance();
            instance2.set(1, instance.get(1));
            instance2.set(2, instance.get(2) + i10);
            instance2.set(5, instance.get(5));
            instance2.set(10, instance.get(10));
            Date time = instance2.getTime();
            m.e(time, "{\n            val calcul…edCalendar.time\n        }");
            return time;
        }
        b bVar = this.A;
        m.c(bVar);
        BsDate d10 = bVar.d(instance);
        int year = d10.getYear();
        int month = d10.getMonth();
        String str = this.f17484q;
        m.c(str);
        Date time2 = new b().a(new BsDate(year, month, Integer.parseInt(str)), i10).getAd().getTime();
        m.e(time2, "{\n            val bsDate…ulatedTime.time\n        }");
        return time2;
    }

    private final Date b(Date date, int i10) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        if (this.f17491x == a.AD) {
            Calendar instance2 = Calendar.getInstance();
            instance2.set(instance.get(1) + i10, instance.get(2), instance.get(5), instance.get(10), instance.get(12));
            Date time = instance2.getTime();
            m.e(time, "{\n            val calcul…meCalendar.time\n        }");
            return time;
        }
        b bVar = this.A;
        m.c(bVar);
        int year = bVar.d(instance).getYear() + i10;
        String str = this.f17483p;
        m.c(str);
        int parseInt = Integer.parseInt(str);
        String str2 = this.f17484q;
        m.c(str2);
        BsDate bsDate = new BsDate(year, parseInt, Integer.parseInt(str2));
        Calendar.getInstance();
        Date time2 = bsDate.getAd().getTime();
        m.e(time2, "{\n            val bsDate…ulatedtime.time\n        }");
        return time2;
    }

    private final List<Object> c(int i10) {
        int i11;
        Date time;
        ArrayList arrayList = new ArrayList();
        try {
            String str = this.f17481n;
            m.c(str);
            i11 = Integer.parseInt(str);
        } catch (Exception unused) {
            i11 = 1;
        }
        Date date = null;
        String str2 = this.f17482o;
        m.c(str2);
        if (!(str2.length() == 0)) {
            date = b.f15915a.h(this.f17482o);
        }
        int i12 = 0;
        do {
            Calendar instance = Calendar.getInstance();
            instance.setTime(this.f17488u);
            instance.add(5, i12 * i11 * i10);
            time = instance.getTime();
            if (time.after(this.f17490w)) {
                return arrayList;
            }
            String str3 = this.f17480m;
            m.c(str3);
            if (!(str3.length() == 0)) {
                String str4 = this.f17480m;
                m.c(str4);
                if (i12 >= Integer.parseInt(str4)) {
                    return arrayList;
                }
            } else if (date != null) {
                b bVar = b.f15915a;
                Date date2 = this.f17492y;
                m.c(date2);
                if (bVar.k(date2, date) != 0) {
                    Date date3 = this.f17492y;
                    m.c(date3);
                    if (!date3.before(date)) {
                        return arrayList;
                    }
                }
            }
            m.e(time, "date");
            Date date4 = this.f17489v;
            m.c(date4);
            if (m(time, date4, date, true)) {
                arrayList.add(time);
            }
            this.f17492y = time;
            i12++;
            m.c(time);
        } while (time.before(this.f17490w));
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.Object> d() {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            java.lang.String r2 = r12.f17481n     // Catch:{ Exception -> 0x0010 }
            kotlin.jvm.internal.m.c(r2)     // Catch:{ Exception -> 0x0010 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0010 }
            goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            java.lang.String r3 = r12.f17482o
            kotlin.jvm.internal.m.c(r3)
            int r3 = r3.length()
            r4 = 0
            if (r3 != 0) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            r5 = 0
            if (r3 != 0) goto L_0x002c
            np.com.nepalipatro.helpers.b r3 = np.com.nepalipatro.helpers.b.f15915a
            java.lang.String r6 = r12.f17482o
            java.util.Date r3 = r3.h(r6)
            goto L_0x002d
        L_0x002c:
            r3 = r5
        L_0x002d:
            r6 = 0
            r7 = 0
        L_0x002f:
            java.util.Date r8 = r12.f17488u
            if (r8 == 0) goto L_0x003a
            int r9 = r6 * r2
            java.util.Date r8 = r12.a(r8, r9)
            goto L_0x003b
        L_0x003a:
            r8 = r5
        L_0x003b:
            java.util.Calendar r9 = java.util.Calendar.getInstance()
            r9.setTime(r8)
            r10 = 5
            r11 = -1
            r9.add(r10, r11)
            java.util.Date r10 = r9.getTime()
            java.util.Date r11 = r12.f17490w
            boolean r10 = r10.after(r11)
            if (r10 == 0) goto L_0x0054
            return r0
        L_0x0054:
            java.lang.String r10 = r12.f17480m
            kotlin.jvm.internal.m.c(r10)
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0061
            r10 = 1
            goto L_0x0062
        L_0x0061:
            r10 = 0
        L_0x0062:
            if (r10 != 0) goto L_0x0070
            java.lang.String r8 = r12.f17480m
            kotlin.jvm.internal.m.c(r8)
            int r8 = java.lang.Integer.parseInt(r8)
            if (r7 < r8) goto L_0x0088
            return r0
        L_0x0070:
            if (r3 == 0) goto L_0x0088
            if (r8 == 0) goto L_0x007d
            boolean r8 = r8.before(r3)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto L_0x007e
        L_0x007d:
            r8 = r5
        L_0x007e:
            kotlin.jvm.internal.m.c(r8)
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0088
            return r0
        L_0x0088:
            java.util.Date r8 = r12.f17489v
            java.lang.String r10 = "temporyDateCalendar.time"
            if (r8 == 0) goto L_0x009d
            java.util.Date r11 = r9.getTime()
            kotlin.jvm.internal.m.e(r11, r10)
            boolean r8 = r12.m(r11, r8, r3, r1)
            if (r8 != r1) goto L_0x009d
            r8 = 1
            goto L_0x009e
        L_0x009d:
            r8 = 0
        L_0x009e:
            if (r8 == 0) goto L_0x00ac
            java.util.Date r8 = r9.getTime()
            kotlin.jvm.internal.m.e(r8, r10)
            r0.add(r8)
            int r7 = r7 + 1
        L_0x00ac:
            java.util.Date r8 = r9.getTime()
            r12.f17492y = r8
            int r6 = r6 + 1
            kotlin.jvm.internal.m.c(r8)
            java.util.Date r9 = r12.f17490w
            boolean r8 = r8.before(r9)
            if (r8 != 0) goto L_0x002f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.d.d():java.util.List");
    }

    private final List<Object> e() {
        int i10;
        Date a10;
        ArrayList arrayList = new ArrayList();
        try {
            String str = this.f17481n;
            m.c(str);
            i10 = Integer.parseInt(str);
        } catch (Exception unused) {
            i10 = 1;
        }
        String str2 = this.f17482o;
        m.c(str2);
        Date h10 = !(str2.length() == 0) ? b.f15915a.h(this.f17482o) : null;
        int i11 = 0;
        do {
            Calendar.getInstance();
            Date date = this.f17487t;
            a10 = date != null ? a(date, i11 * i10) : null;
            m.c(a10);
            String str3 = this.f17482o;
            m.c(str3);
            if (!(str3.length() == 0)) {
                b bVar = b.f15915a;
                Date date2 = this.f17492y;
                m.c(date2);
                m.c(h10);
                if (bVar.k(date2, h10) != 0 && a10.after(this.f17490w)) {
                    return arrayList;
                }
            } else if (a10.after(this.f17490w)) {
                return arrayList;
            }
            String str4 = this.f17480m;
            m.c(str4);
            if (!(str4.length() == 0)) {
                String str5 = this.f17480m;
                m.c(str5);
                if (arrayList.size() >= Integer.parseInt(str5)) {
                    return arrayList;
                }
            } else if (h10 != null) {
                b bVar2 = b.f15915a;
                Date date3 = this.f17492y;
                m.c(date3);
                if (bVar2.k(date3, h10) != 0) {
                    Date date4 = this.f17492y;
                    m.c(date4);
                    if (!date4.before(h10)) {
                        return arrayList;
                    }
                }
            }
            String str6 = this.f17480m;
            m.c(str6);
            Date date5 = !(str6.length() == 0) ? this.f17487t : this.f17489v;
            if (date5 != null && m(a10, date5, h10, true)) {
                arrayList.add(a10);
            }
            this.f17492y = a10;
            i11++;
            m.c(a10);
        } while (a10.before(this.f17490w));
        return arrayList;
    }

    private final List<Object> f() {
        int i10;
        int i11;
        int i12;
        int[] iArr = this.f17485r;
        if (iArr != null) {
            m.c(iArr);
            if (iArr.length > 1) {
                return new ArrayList();
            }
        }
        ArrayList arrayList = new ArrayList();
        Calendar.getInstance().setTime(this.f17489v);
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(this.f17487t);
        Calendar instance3 = Calendar.getInstance();
        instance3.set(1, instance2.get(1));
        instance3.set(2, instance2.get(2));
        instance3.set(5, instance2.get(5));
        c cVar = this.f17493z;
        m.c(cVar);
        NsDate d10 = cVar.d(instance3);
        instance.set(1, instance2.get(1));
        instance.set(2, instance2.get(2));
        instance.set(5, instance2.get(5));
        Date time = instance.getTime();
        HashMap hashMap = new HashMap();
        int i13 = 0;
        do {
            if (i13 == 0) {
                i10 = 0;
            } else {
                m.a(this.f17481n, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                i10 = i13;
            }
            m.c(d10);
            int i14 = (d10.getTithi() == 30 || d10.getTithi() == 15 || d10.getTithi() == 16) ? 2 : 1;
            c cVar2 = this.f17493z;
            m.c(cVar2);
            if (m.a(this.f17484q, "")) {
                i11 = 0;
            } else {
                String str = this.f17484q;
                m.c(str);
                i11 = Integer.parseInt(str);
            }
            Map<?, ?> a10 = cVar2.a(d10, i11, i10 * i14);
            NsDate nsDate = (NsDate) a10.get("nsdate");
            List<Date> list = (List) a10.get("recurrence");
            StringBuilder sb = new StringBuilder();
            m.c(nsDate);
            sb.append(nsDate.getYear());
            sb.append(nsDate.getMonth());
            String sb2 = sb.toString();
            Date date = null;
            String str2 = this.f17482o;
            m.c(str2);
            if (!(str2.length() == 0)) {
                date = b.f15915a.h(this.f17482o);
            }
            if (list != null) {
                for (Date date2 : list) {
                    if (date2.after(this.f17490w)) {
                        return arrayList;
                    }
                    String str3 = this.f17480m;
                    m.c(str3);
                    if (!(str3.length() == 0)) {
                        String str4 = this.f17480m;
                        m.c(str4);
                        if (hashMap.keySet().size() >= Integer.parseInt(str4)) {
                            return arrayList;
                        }
                    } else {
                        String str5 = this.f17482o;
                        m.c(str5);
                        if (!(str5.length() == 0) && !date2.before(date)) {
                            return arrayList;
                        }
                    }
                    Date date3 = this.f17487t;
                    if (date3 != null && m(date2, date3, this.f17490w, false)) {
                        arrayList.add(date2);
                        if (!hashMap.containsKey(sb2) && !hashMap.containsKey(sb2)) {
                            hashMap.put(sb2, 1);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                Object obj = arrayList.get(arrayList.size() - 1);
                m.d(obj, "null cannot be cast to non-null type java.util.Date");
                time = (Date) obj;
            }
            if (m.a(this.f17481n, "")) {
                i12 = 0;
            } else {
                String str6 = this.f17481n;
                m.c(str6);
                i12 = Integer.parseInt(str6);
            }
            i13 += i12;
        } while (time.before(this.f17490w));
        return arrayList;
    }

    private final List<Object> g() {
        int i10;
        boolean z10;
        try {
            int[] iArr = this.f17485r;
            if (iArr != null) {
                m.c(iArr);
                if (iArr.length > 1) {
                    return new ArrayList();
                }
            }
            ArrayList arrayList = new ArrayList();
            Calendar instance = Calendar.getInstance();
            instance.setTime(this.f17489v);
            Calendar instance2 = Calendar.getInstance();
            Calendar instance3 = Calendar.getInstance();
            Calendar instance4 = Calendar.getInstance();
            instance4.setTime(this.f17487t);
            if (!m.a(this.f17481n, AppEventsConstants.EVENT_PARAM_VALUE_YES) || (!m.a(this.f17480m, AppEventsConstants.EVENT_PARAM_VALUE_NO) && !m.a(this.f17480m, "") && this.f17480m != null)) {
                instance2.set(1, instance4.get(1));
                instance2.set(2, instance4.get(2));
                instance2.set(5, instance4.get(5));
            } else {
                instance2.set(1, instance.get(1) - 1);
                instance2.set(2, instance.get(2));
                instance2.set(5, instance.get(5));
            }
            c cVar = this.f17493z;
            m.c(cVar);
            NsDate d10 = cVar.d(instance2);
            instance3.set(1, instance4.get(1));
            instance3.set(2, instance4.get(2));
            instance3.set(5, instance4.get(5));
            c cVar2 = this.f17493z;
            m.c(cVar2);
            NsDate d11 = cVar2.d(instance3);
            String str = this.f17482o;
            m.c(str);
            Date h10 = !(str.length() == 0) ? b.f15915a.h(this.f17482o) : null;
            Date time = instance3.getTime();
            if (m.a(this.f17484q, "16")) {
                this.f17484q = "30";
            }
            int i11 = 0;
            do {
                if (i11 == 0) {
                    i10 = 0;
                } else {
                    m.a(this.f17481n, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                    i10 = i11;
                }
                c cVar3 = this.f17493z;
                m.c(cVar3);
                m.c(d10);
                String str2 = this.f17484q;
                m.c(str2);
                int parseInt = Integer.parseInt(str2);
                String str3 = this.f17483p;
                m.c(d11);
                List<Date> b10 = cVar3.b(d10, parseInt, str3, i10, d11.getYear());
                m.c(b10);
                Iterator<Date> it = b10.iterator();
                while (it.hasNext()) {
                    time = it.next();
                    String str4 = this.f17480m;
                    m.c(str4);
                    if (!(str4.length() == 0)) {
                        String str5 = this.f17480m;
                        m.c(str5);
                        if (arrayList.size() >= Integer.parseInt(str5)) {
                            return arrayList;
                        }
                    } else {
                        String str6 = this.f17482o;
                        m.c(str6);
                        if (!(str6.length() == 0)) {
                            m.c(time);
                            if (!time.before(h10)) {
                                return arrayList;
                            }
                        }
                    }
                    if (time != null) {
                        Date date = this.f17487t;
                        z10 = m.a(date != null ? Boolean.valueOf(m(time, date, this.f17490w, true)) : null, Boolean.TRUE);
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList.add(time);
                    }
                }
                String str7 = this.f17481n;
                m.c(str7);
                i11 += Integer.parseInt(str7);
            } while (time.before(this.f17490w));
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private final List<Object> h(int i10) {
        int i11;
        Date time;
        try {
            ArrayList arrayList = new ArrayList();
            try {
                String str = this.f17481n;
                m.c(str);
                i11 = Integer.parseInt(str);
            } catch (Exception unused) {
                i11 = 1;
            }
            String str2 = this.f17482o;
            m.c(str2);
            Date h10 = !(str2.length() == 0) ? b.f15915a.h(this.f17482o) : null;
            Calendar instance = Calendar.getInstance();
            instance.setTime(this.f17490w);
            instance.add(5, 8);
            this.f17490w = instance.getTime();
            int i12 = 0;
            int i13 = 0;
            do {
                Calendar instance2 = Calendar.getInstance();
                instance2.setTime(this.f17488u);
                instance2.add(5, i12 * i11 * i10);
                time = instance2.getTime();
                Arrays.sort(this.f17485r);
                int[] iArr = this.f17485r;
                m.c(iArr);
                int length = iArr.length;
                for (int i14 = 0; i14 < length; i14++) {
                    int[] iArr2 = this.f17485r;
                    m.c(iArr2);
                    int i15 = iArr2[i14];
                    if (i15 >= 0) {
                        instance2.add(5, -((instance2.get(7) - 1) - i15));
                        time = instance2.getTime();
                    }
                    if (time.after(this.f17490w)) {
                        return arrayList;
                    }
                    String str3 = this.f17480m;
                    m.c(str3);
                    if (!(str3.length() == 0)) {
                        String str4 = this.f17480m;
                        m.c(str4);
                        if (i13 >= Integer.parseInt(str4)) {
                            return arrayList;
                        }
                    } else if (h10 != null) {
                        b bVar = b.f15915a;
                        Date date = this.f17492y;
                        m.c(date);
                        if (bVar.k(date, h10) != 0) {
                            Date date2 = this.f17492y;
                            m.c(date2);
                            if (!date2.before(h10)) {
                                return arrayList;
                            }
                        }
                    }
                    m.e(time, "date");
                    Date date3 = this.f17487t;
                    m.c(date3);
                    if (m(time, date3, h10, false)) {
                        m.e(time, "date");
                        arrayList.add(time);
                        i13++;
                    }
                }
                this.f17492y = time;
                i12++;
                m.c(time);
            } while (time.before(this.f17490w));
            return arrayList;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.Object> i() {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            java.lang.String r2 = r12.f17481n     // Catch:{ Exception -> 0x0010 }
            kotlin.jvm.internal.m.c(r2)     // Catch:{ Exception -> 0x0010 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0010 }
            goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            java.lang.String r3 = r12.f17482o
            kotlin.jvm.internal.m.c(r3)
            int r3 = r3.length()
            r4 = 0
            if (r3 != 0) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            r5 = 0
            if (r3 != 0) goto L_0x002c
            np.com.nepalipatro.helpers.b r3 = np.com.nepalipatro.helpers.b.f15915a
            java.lang.String r6 = r12.f17482o
            java.util.Date r3 = r3.h(r6)
            goto L_0x002d
        L_0x002c:
            r3 = r5
        L_0x002d:
            r6 = 0
            r7 = 0
        L_0x002f:
            java.util.Date r8 = r12.f17488u
            if (r8 == 0) goto L_0x003a
            int r9 = r6 * r2
            java.util.Date r8 = r12.b(r8, r9)
            goto L_0x003b
        L_0x003a:
            r8 = r5
        L_0x003b:
            java.util.Calendar r9 = java.util.Calendar.getInstance()
            r9.setTime(r8)
            r8 = 5
            r10 = -1
            r9.add(r8, r10)
            java.util.Date r8 = r9.getTime()
            java.util.Date r10 = r12.f17490w
            boolean r8 = r8.after(r10)
            if (r8 == 0) goto L_0x0054
            return r0
        L_0x0054:
            java.lang.String r8 = r12.f17480m
            kotlin.jvm.internal.m.c(r8)
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0061
            r8 = 1
            goto L_0x0062
        L_0x0061:
            r8 = 0
        L_0x0062:
            if (r8 != 0) goto L_0x0070
            java.lang.String r8 = r12.f17480m
            kotlin.jvm.internal.m.c(r8)
            int r8 = java.lang.Integer.parseInt(r8)
            if (r7 < r8) goto L_0x008b
            return r0
        L_0x0070:
            if (r3 == 0) goto L_0x008b
            np.com.nepalipatro.helpers.b r8 = np.com.nepalipatro.helpers.b.f15915a
            java.util.Date r10 = r12.f17492y
            kotlin.jvm.internal.m.c(r10)
            int r8 = r8.k(r10, r3)
            if (r8 == 0) goto L_0x008b
            java.util.Date r8 = r12.f17492y
            kotlin.jvm.internal.m.c(r8)
            boolean r8 = r8.before(r3)
            if (r8 != 0) goto L_0x008b
            return r0
        L_0x008b:
            java.util.Date r8 = r12.f17489v
            java.lang.String r10 = "temporyDateCalendar.time"
            if (r8 == 0) goto L_0x00a0
            java.util.Date r11 = r9.getTime()
            kotlin.jvm.internal.m.e(r11, r10)
            boolean r8 = r12.m(r11, r8, r3, r1)
            if (r8 != r1) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r8 == 0) goto L_0x00af
            java.util.Date r8 = r9.getTime()
            kotlin.jvm.internal.m.e(r8, r10)
            r0.add(r8)
            int r7 = r7 + 1
        L_0x00af:
            java.util.Date r8 = r9.getTime()
            r12.f17492y = r8
            int r6 = r6 + 1
            kotlin.jvm.internal.m.c(r8)
            java.util.Date r9 = r12.f17490w
            boolean r8 = r8.before(r9)
            if (r8 != 0) goto L_0x002f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.d.i():java.util.List");
    }

    private final List<Object> j() {
        int i10;
        Date date;
        ArrayList arrayList = new ArrayList();
        try {
            String str = this.f17481n;
            m.c(str);
            i10 = Integer.parseInt(str);
        } catch (Exception unused) {
            i10 = 1;
        }
        String str2 = this.f17482o;
        m.c(str2);
        Date h10 = !(str2.length() == 0) ? b.f15915a.h(this.f17482o) : null;
        int i11 = 0;
        int i12 = 0;
        do {
            Date date2 = this.f17488u;
            Date b10 = date2 != null ? b(date2, i11 * i10) : null;
            Calendar instance = Calendar.getInstance();
            instance.setTime(b10);
            Calendar instance2 = Calendar.getInstance();
            instance2.set(1, instance.get(1));
            String str3 = this.f17483p;
            m.c(str3);
            instance2.set(2, Integer.parseInt(str3) - 1);
            String str4 = this.f17484q;
            m.c(str4);
            instance2.set(5, Integer.parseInt(str4));
            instance2.set(10, instance.get(10));
            instance2.set(12, instance.get(12));
            Date time = instance2.getTime();
            m.e(time, "dateCalendar.time");
            if (h10 != null) {
                b bVar = b.f15915a;
                Date date3 = this.f17492y;
                m.c(date3);
                if (bVar.k(date3, h10) != 0 && time.after(this.f17490w)) {
                    return arrayList;
                }
            }
            String str5 = this.f17480m;
            m.c(str5);
            if (!(str5.length() == 0)) {
                String str6 = this.f17480m;
                m.c(str6);
                if (i12 >= Integer.parseInt(str6)) {
                    return arrayList;
                }
            } else if (h10 != null) {
                b bVar2 = b.f15915a;
                Date date4 = this.f17492y;
                m.c(date4);
                if (bVar2.k(date4, h10) != 0) {
                    Date date5 = this.f17492y;
                    m.c(date5);
                    if (!date5.before(h10)) {
                        return arrayList;
                    }
                }
            }
            Date date6 = this.f17489v;
            if (date6 != null && m(time, date6, h10, true)) {
                arrayList.add(time);
                i12++;
            }
            this.f17492y = time;
            i11++;
            StringBuilder sb = new StringBuilder();
            sb.append("_getYearlyRepetition: ");
            sb.append(i11);
            date = this.f17492y;
            m.c(date);
        } while (date.before(this.f17490w));
        return arrayList;
    }

    private final void k() {
        Calendar instance = Calendar.getInstance();
        instance.setTime(this.f17487t);
        Calendar instance2 = Calendar.getInstance();
        instance2.set(1, instance.get(1));
        instance2.set(2, instance.get(2));
        instance2.set(5, instance.get(5));
        instance2.set(10, instance.get(10));
        instance2.set(12, instance.get(12));
        this.f17488u = instance2.getTime();
        Calendar instance3 = Calendar.getInstance();
        instance3.setTime(this.f17489v);
        if (m.a(this.f17481n, AppEventsConstants.EVENT_PARAM_VALUE_YES)) {
            String str = this.f17480m;
            m.c(str);
            if (str.length() == 0) {
                instance2.set(1, instance3.get(1) - 1);
                instance2.set(2, instance3.get(2));
                instance2.set(5, instance3.get(5));
                this.f17488u = instance2.getTime();
            }
        }
        this.f17492y = this.f17488u;
    }

    private final void l() {
        for (String c02 : (String[]) q.c0(this.f17486s, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0])) {
            String[] strArr = (String[]) q.c0(c02, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
            String str = strArr[0] != null ? strArr[0] : "";
            if (!(str.length() == 0)) {
                if (m.a(str, this.f17468a)) {
                    this.f17479l = strArr[1];
                } else if (m.a(str, this.f17470c)) {
                    this.f17480m = strArr[1];
                } else if (m.a(str, this.f17472e)) {
                    String[] strArr2 = (String[]) q.c0(strArr[1], new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                    this.f17485r = new int[strArr2.length];
                    for (int i10 = 0; i10 < strArr2.length; i10++) {
                        int l10 = b.f15915a.l(strArr2[i10]);
                        int[] iArr = this.f17485r;
                        m.c(iArr);
                        iArr[i10] = l10;
                    }
                } else if (m.a(str, this.f17471d)) {
                    this.f17483p = strArr[1];
                } else if (m.a(str, this.f17473f)) {
                    this.f17484q = strArr[1];
                } else if (m.a(str, this.f17469b)) {
                    this.f17481n = strArr[1];
                } else if (m.a(str, this.f17474g)) {
                    this.f17482o = strArr[1];
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0102, code lost:
        if (r8.before(r2.getTime()) == false) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m(java.util.Date r8, java.util.Date r9, java.util.Date r10, boolean r11) {
        /*
            r7 = this;
            r0 = 0
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x012b }
            r1.setTime(r8)     // Catch:{ Exception -> 0x012b }
            r2 = 10
            r1.set(r2, r0)     // Catch:{ Exception -> 0x012b }
            r3 = 12
            r1.set(r3, r0)     // Catch:{ Exception -> 0x012b }
            r4 = 13
            r1.set(r4, r0)     // Catch:{ Exception -> 0x012b }
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x012b }
            java.util.Date r6 = r7.f17487t     // Catch:{ Exception -> 0x012b }
            r5.setTime(r6)     // Catch:{ Exception -> 0x012b }
            r5.set(r2, r0)     // Catch:{ Exception -> 0x012b }
            r5.set(r3, r0)     // Catch:{ Exception -> 0x012b }
            r5.set(r4, r0)     // Catch:{ Exception -> 0x012b }
            r2 = 0
            if (r10 == 0) goto L_0x003e
            java.util.Calendar r2 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x012b }
            r2.setTime(r10)     // Catch:{ Exception -> 0x012b }
            java.util.Date r3 = r1.getTime()     // Catch:{ Exception -> 0x012b }
            boolean r3 = r3.after(r10)     // Catch:{ Exception -> 0x012b }
            if (r3 == 0) goto L_0x003e
            return r0
        L_0x003e:
            np.com.nepalipatro.helpers.b r3 = np.com.nepalipatro.helpers.b.f15915a     // Catch:{ Exception -> 0x012b }
            java.lang.String r4 = "tempCalendar"
            kotlin.jvm.internal.m.e(r1, r4)     // Catch:{ Exception -> 0x012b }
            java.lang.String r4 = "tempCalendar2"
            kotlin.jvm.internal.m.e(r5, r4)     // Catch:{ Exception -> 0x012b }
            r4 = 1
            int r3 = r3.j(r1, r5, r4)     // Catch:{ Exception -> 0x012b }
            if (r3 == 0) goto L_0x005a
            java.util.Date r3 = r7.f17487t     // Catch:{ Exception -> 0x012b }
            boolean r8 = r8.before(r3)     // Catch:{ Exception -> 0x012b }
            if (r8 == 0) goto L_0x005a
            return r0
        L_0x005a:
            r8 = 5
            if (r11 == 0) goto L_0x00bc
            java.lang.String r11 = r7.f17484q     // Catch:{ Exception -> 0x012b }
            kotlin.jvm.internal.m.c(r11)     // Catch:{ Exception -> 0x012b }
            int r11 = r11.length()     // Catch:{ Exception -> 0x012b }
            if (r11 != 0) goto L_0x006a
            r11 = 1
            goto L_0x006b
        L_0x006a:
            r11 = 0
        L_0x006b:
            if (r11 != 0) goto L_0x00bc
            y9.a r11 = r7.f17491x     // Catch:{ Exception -> 0x012b }
            y9.a r3 = y9.a.BS     // Catch:{ Exception -> 0x012b }
            if (r11 != r3) goto L_0x009a
            y9.b r11 = r7.A     // Catch:{ Exception -> 0x012b }
            kotlin.jvm.internal.m.c(r11)     // Catch:{ Exception -> 0x012b }
            np.com.nepalipatro.models.BsDate r11 = r11.d(r1)     // Catch:{ Exception -> 0x012b }
            np.com.nepalipatro.helpers.l$a r3 = np.com.nepalipatro.helpers.l.f16129a     // Catch:{ Exception -> 0x012b }
            int r11 = r11.getDay()     // Catch:{ Exception -> 0x012b }
            java.lang.String r11 = r3.t(r11)     // Catch:{ Exception -> 0x012b }
            java.lang.String r6 = r7.f17484q     // Catch:{ Exception -> 0x012b }
            kotlin.jvm.internal.m.c(r6)     // Catch:{ Exception -> 0x012b }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x012b }
            java.lang.String r3 = r3.t(r6)     // Catch:{ Exception -> 0x012b }
            boolean r11 = kotlin.jvm.internal.m.a(r11, r3)     // Catch:{ Exception -> 0x012b }
            if (r11 != 0) goto L_0x00bc
            return r0
        L_0x009a:
            y9.a r3 = y9.a.AD     // Catch:{ Exception -> 0x012b }
            if (r11 != r3) goto L_0x00bc
            np.com.nepalipatro.helpers.l$a r11 = np.com.nepalipatro.helpers.l.f16129a     // Catch:{ Exception -> 0x012b }
            int r3 = r1.get(r8)     // Catch:{ Exception -> 0x012b }
            java.lang.String r3 = r11.t(r3)     // Catch:{ Exception -> 0x012b }
            java.lang.String r6 = r7.f17484q     // Catch:{ Exception -> 0x012b }
            kotlin.jvm.internal.m.c(r6)     // Catch:{ Exception -> 0x012b }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x012b }
            java.lang.String r11 = r11.t(r6)     // Catch:{ Exception -> 0x012b }
            boolean r11 = kotlin.jvm.internal.m.a(r3, r11)     // Catch:{ Exception -> 0x012b }
            if (r11 != 0) goto L_0x00bc
            return r0
        L_0x00bc:
            java.util.Calendar r11 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x012b }
            r11.setTime(r9)     // Catch:{ Exception -> 0x012b }
            int r9 = r1.get(r8)     // Catch:{ Exception -> 0x012b }
            int r8 = r11.get(r8)     // Catch:{ Exception -> 0x012b }
            if (r9 != r8) goto L_0x00e3
            int r8 = r1.get(r4)     // Catch:{ Exception -> 0x012b }
            int r9 = r11.get(r4)     // Catch:{ Exception -> 0x012b }
            if (r8 != r9) goto L_0x00e3
            r8 = 2
            int r9 = r1.get(r8)     // Catch:{ Exception -> 0x012b }
            int r8 = r11.get(r8)     // Catch:{ Exception -> 0x012b }
            if (r9 != r8) goto L_0x00e3
            goto L_0x012a
        L_0x00e3:
            if (r10 == 0) goto L_0x0112
            java.util.Date r8 = r1.getTime()     // Catch:{ Exception -> 0x012b }
            java.util.Date r9 = r11.getTime()     // Catch:{ Exception -> 0x012b }
            boolean r8 = r8.after(r9)     // Catch:{ Exception -> 0x012b }
            if (r8 == 0) goto L_0x0104
            java.util.Date r8 = r1.getTime()     // Catch:{ Exception -> 0x012b }
            kotlin.jvm.internal.m.c(r2)     // Catch:{ Exception -> 0x012b }
            java.util.Date r9 = r2.getTime()     // Catch:{ Exception -> 0x012b }
            boolean r8 = r8.before(r9)     // Catch:{ Exception -> 0x012b }
            if (r8 != 0) goto L_0x012a
        L_0x0104:
            java.util.Date r8 = r1.getTime()     // Catch:{ Exception -> 0x012b }
            kotlin.jvm.internal.m.c(r2)     // Catch:{ Exception -> 0x012b }
            java.util.Date r9 = r2.getTime()     // Catch:{ Exception -> 0x012b }
            if (r8 != r9) goto L_0x012b
            goto L_0x012a
        L_0x0112:
            java.util.Date r8 = r1.getTime()     // Catch:{ Exception -> 0x012b }
            java.util.Date r9 = r5.getTime()     // Catch:{ Exception -> 0x012b }
            boolean r8 = r8.after(r9)     // Catch:{ Exception -> 0x012b }
            if (r8 != 0) goto L_0x012a
            java.util.Date r8 = r1.getTime()     // Catch:{ Exception -> 0x012b }
            java.util.Date r9 = r5.getTime()     // Catch:{ Exception -> 0x012b }
            if (r8 != r9) goto L_0x012b
        L_0x012a:
            r0 = 1
        L_0x012b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.d.m(java.util.Date, java.util.Date, java.util.Date, boolean):boolean");
    }

    public final List<Object> n() {
        new ArrayList();
        if (this.f17479l.length() == 0) {
            return new ArrayList();
        }
        if (m.a(this.f17479l, this.f17475h)) {
            return c(1);
        }
        if (m.a(this.f17479l, this.f17476i)) {
            return h(7);
        }
        if (m.a(this.f17479l, this.f17477j)) {
            a aVar = this.f17491x;
            if (aVar == a.NS) {
                return f();
            }
            if (aVar == a.AD) {
                return e();
            }
            return d();
        }
        a aVar2 = this.f17491x;
        if (aVar2 == a.NS) {
            return g();
        }
        if (aVar2 == a.AD) {
            return j();
        }
        return i();
    }
}
