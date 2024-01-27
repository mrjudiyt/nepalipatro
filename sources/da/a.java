package da;

import android.content.Context;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.l;
import np.com.nepalipatro.models.BsDate;
import y9.b;
import y9.c;

/* compiled from: CalendarGridCalculator.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f14191a;

    /* renamed from: b  reason: collision with root package name */
    private int f14192b;

    /* renamed from: c  reason: collision with root package name */
    private int f14193c;

    /* renamed from: d  reason: collision with root package name */
    private int f14194d;

    /* renamed from: e  reason: collision with root package name */
    private int f14195e;

    /* renamed from: f  reason: collision with root package name */
    private int f14196f;

    /* renamed from: g  reason: collision with root package name */
    private int f14197g;

    /* renamed from: h  reason: collision with root package name */
    private int f14198h;

    /* renamed from: i  reason: collision with root package name */
    private int f14199i;

    /* renamed from: j  reason: collision with root package name */
    private int f14200j;

    /* renamed from: k  reason: collision with root package name */
    private int f14201k;

    /* renamed from: l  reason: collision with root package name */
    private b f14202l;

    /* renamed from: m  reason: collision with root package name */
    private c f14203m;

    /* renamed from: da.a$a  reason: collision with other inner class name */
    /* compiled from: CalendarGridCalculator.kt */
    public final class C0247a {

        /* renamed from: a  reason: collision with root package name */
        private String f14204a = "";

        /* renamed from: b  reason: collision with root package name */
        private boolean f14205b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f14206c;

        /* renamed from: d  reason: collision with root package name */
        private String f14207d = "";

        public C0247a() {
        }

        public final String a() {
            return this.f14207d;
        }

        public final String b() {
            return this.f14204a;
        }

        public final boolean c() {
            return this.f14205b;
        }

        public final boolean d() {
            return this.f14206c;
        }

        public final void e(String str) {
            m.f(str, "<set-?>");
            this.f14207d = str;
        }

        public final void f(String str) {
            m.f(str, "<set-?>");
            this.f14204a = str;
        }

        public final void g(boolean z10) {
            this.f14205b = z10;
        }

        public final void h(boolean z10) {
            this.f14206c = z10;
        }
    }

    public a(Context context) {
        m.f(context, "context");
        this.f14191a = context;
    }

    public final List<C0247a> a() {
        String str;
        int i10;
        boolean z10;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 42) {
            C0247a aVar = new C0247a();
            int i12 = this.f14196f;
            i11++;
            int i13 = this.f14197g;
            if (i11 < i12) {
                i10 = (i13 - i12) + 1 + i11;
                StringBuilder sb = new StringBuilder();
                l.a aVar2 = l.f16129a;
                sb.append(aVar2.t(i10));
                sb.append(aVar2.t(this.f14198h));
                sb.append(aVar2.t(this.f14199i));
                str = sb.toString();
            } else {
                str = "";
                i10 = 0;
            }
            int i14 = this.f14195e + i12;
            if (i11 < i12 || i11 >= i14) {
                z11 = false;
                z10 = false;
            } else {
                i10 = (i11 - i12) + 1;
                z11 = i10 == this.f14192b;
                StringBuilder sb2 = new StringBuilder();
                l.a aVar3 = l.f16129a;
                sb2.append(aVar3.t(i10));
                sb2.append(aVar3.t(this.f14193c));
                sb2.append(aVar3.t(this.f14194d));
                str = sb2.toString();
                z10 = true;
            }
            if (i11 >= i14) {
                i10 = (i11 - i14) + 1;
                StringBuilder sb3 = new StringBuilder();
                l.a aVar4 = l.f16129a;
                sb3.append(aVar4.t(i10));
                sb3.append(aVar4.t(this.f14201k));
                sb3.append(aVar4.t(this.f14200j));
                str = sb3.toString();
            }
            aVar.e(str);
            StringBuilder sb4 = new StringBuilder();
            l.a aVar5 = l.f16129a;
            sb4.append(aVar5.h(Integer.valueOf(i10), aVar5.e(this.f14191a), Boolean.FALSE));
            sb4.append("");
            aVar.f(sb4.toString());
            aVar.g(z11);
            aVar.h(z10);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final void b(b bVar, c cVar) {
        m.f(bVar, "dateMapping");
        m.f(cVar, "nsMapping");
        this.f14202l = bVar;
        this.f14203m = cVar;
        BsDate d10 = bVar.d(bVar.e(this.f14191a));
        BsDate bsDate = new BsDate(d10.getYear(), d10.getMonth(), 1);
        Calendar c10 = bVar.c(bsDate);
        this.f14192b = d10.getDay();
        this.f14193c = d10.getMonth();
        int year = d10.getYear();
        this.f14194d = year;
        this.f14195e = bVar.h(year, this.f14193c);
        this.f14196f = c10 != null ? c10.get(7) - 1 : 0;
        BsDate previousMonth = bsDate.previousMonth();
        this.f14198h = previousMonth.getMonth();
        int year2 = previousMonth.getYear();
        this.f14199i = year2;
        this.f14197g = bVar.h(year2, this.f14198h);
        BsDate a10 = bVar.a(d10, 1);
        this.f14200j = a10.getYear();
        this.f14201k = a10.getMonth();
        d10.getYear();
    }
}
