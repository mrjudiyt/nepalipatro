package v1;

import androidx.work.e;
import androidx.work.m;
import androidx.work.q;
import androidx.work.v;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkSpec */
public final class p {

    /* renamed from: s  reason: collision with root package name */
    private static final String f12253s = m.f("WorkSpec");

    /* renamed from: t  reason: collision with root package name */
    public static final p.a<List<c>, List<v>> f12254t = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f12255a;

    /* renamed from: b  reason: collision with root package name */
    public v.a f12256b = v.a.ENQUEUED;

    /* renamed from: c  reason: collision with root package name */
    public String f12257c;

    /* renamed from: d  reason: collision with root package name */
    public String f12258d;

    /* renamed from: e  reason: collision with root package name */
    public e f12259e;

    /* renamed from: f  reason: collision with root package name */
    public e f12260f;

    /* renamed from: g  reason: collision with root package name */
    public long f12261g;

    /* renamed from: h  reason: collision with root package name */
    public long f12262h;

    /* renamed from: i  reason: collision with root package name */
    public long f12263i;

    /* renamed from: j  reason: collision with root package name */
    public androidx.work.c f12264j;

    /* renamed from: k  reason: collision with root package name */
    public int f12265k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.work.a f12266l;

    /* renamed from: m  reason: collision with root package name */
    public long f12267m;

    /* renamed from: n  reason: collision with root package name */
    public long f12268n;

    /* renamed from: o  reason: collision with root package name */
    public long f12269o;

    /* renamed from: p  reason: collision with root package name */
    public long f12270p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12271q;

    /* renamed from: r  reason: collision with root package name */
    public q f12272r;

    /* compiled from: WorkSpec */
    class a implements p.a<List<c>, List<v>> {
        a() {
        }

        /* renamed from: a */
        public List<v> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (c a10 : list) {
                arrayList.add(a10.a());
            }
            return arrayList;
        }
    }

    /* compiled from: WorkSpec */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f12273a;

        /* renamed from: b  reason: collision with root package name */
        public v.a f12274b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f12274b != bVar.f12274b) {
                return false;
            }
            return this.f12273a.equals(bVar.f12273a);
        }

        public int hashCode() {
            return (this.f12273a.hashCode() * 31) + this.f12274b.hashCode();
        }
    }

    /* compiled from: WorkSpec */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f12275a;

        /* renamed from: b  reason: collision with root package name */
        public v.a f12276b;

        /* renamed from: c  reason: collision with root package name */
        public e f12277c;

        /* renamed from: d  reason: collision with root package name */
        public int f12278d;

        /* renamed from: e  reason: collision with root package name */
        public List<String> f12279e;

        /* renamed from: f  reason: collision with root package name */
        public List<e> f12280f;

        public v a() {
            e eVar;
            List<e> list = this.f12280f;
            if (list == null || list.isEmpty()) {
                eVar = e.f4753c;
            } else {
                eVar = this.f12280f.get(0);
            }
            return new v(UUID.fromString(this.f12275a), this.f12276b, this.f12277c, this.f12279e, eVar, this.f12278d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f12278d != cVar.f12278d) {
                return false;
            }
            String str = this.f12275a;
            if (str == null ? cVar.f12275a != null : !str.equals(cVar.f12275a)) {
                return false;
            }
            if (this.f12276b != cVar.f12276b) {
                return false;
            }
            e eVar = this.f12277c;
            if (eVar == null ? cVar.f12277c != null : !eVar.equals(cVar.f12277c)) {
                return false;
            }
            List<String> list = this.f12279e;
            if (list == null ? cVar.f12279e != null : !list.equals(cVar.f12279e)) {
                return false;
            }
            List<e> list2 = this.f12280f;
            List<e> list3 = cVar.f12280f;
            if (list2 != null) {
                return list2.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f12275a;
            int i10 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            v.a aVar = this.f12276b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            e eVar = this.f12277c;
            int hashCode3 = (((hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f12278d) * 31;
            List<String> list = this.f12279e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<e> list2 = this.f12280f;
            if (list2 != null) {
                i10 = list2.hashCode();
            }
            return hashCode4 + i10;
        }
    }

    public p(String str, String str2) {
        e eVar = e.f4753c;
        this.f12259e = eVar;
        this.f12260f = eVar;
        this.f12264j = androidx.work.c.f4732i;
        this.f12266l = androidx.work.a.EXPONENTIAL;
        this.f12267m = 30000;
        this.f12270p = -1;
        this.f12272r = q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f12255a = str;
        this.f12257c = str2;
    }

    public long a() {
        long j10;
        boolean z10 = false;
        if (c()) {
            if (this.f12266l == androidx.work.a.LINEAR) {
                z10 = true;
            }
            if (z10) {
                j10 = this.f12267m * ((long) this.f12265k);
            } else {
                j10 = (long) Math.scalb((float) this.f12267m, this.f12265k - 1);
            }
            return this.f12268n + Math.min(18000000, j10);
        }
        long j11 = 0;
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j12 = this.f12268n;
            long j13 = j12 == 0 ? currentTimeMillis + this.f12261g : j12;
            long j14 = this.f12263i;
            long j15 = this.f12262h;
            if (j14 != j15) {
                z10 = true;
            }
            if (z10) {
                if (j12 == 0) {
                    j11 = j14 * -1;
                }
                return j13 + j15 + j11;
            }
            if (j12 != 0) {
                j11 = j15;
            }
            return j13 + j11;
        }
        long j16 = this.f12268n;
        if (j16 == 0) {
            j16 = System.currentTimeMillis();
        }
        return j16 + this.f12261g;
    }

    public boolean b() {
        return !androidx.work.c.f4732i.equals(this.f12264j);
    }

    public boolean c() {
        return this.f12256b == v.a.ENQUEUED && this.f12265k > 0;
    }

    public boolean d() {
        return this.f12262h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f12261g != pVar.f12261g || this.f12262h != pVar.f12262h || this.f12263i != pVar.f12263i || this.f12265k != pVar.f12265k || this.f12267m != pVar.f12267m || this.f12268n != pVar.f12268n || this.f12269o != pVar.f12269o || this.f12270p != pVar.f12270p || this.f12271q != pVar.f12271q || !this.f12255a.equals(pVar.f12255a) || this.f12256b != pVar.f12256b || !this.f12257c.equals(pVar.f12257c)) {
            return false;
        }
        String str = this.f12258d;
        if (str == null ? pVar.f12258d != null : !str.equals(pVar.f12258d)) {
            return false;
        }
        if (this.f12259e.equals(pVar.f12259e) && this.f12260f.equals(pVar.f12260f) && this.f12264j.equals(pVar.f12264j) && this.f12266l == pVar.f12266l && this.f12272r == pVar.f12272r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f12255a.hashCode() * 31) + this.f12256b.hashCode()) * 31) + this.f12257c.hashCode()) * 31;
        String str = this.f12258d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j10 = this.f12261g;
        long j11 = this.f12262h;
        long j12 = this.f12263i;
        long j13 = this.f12267m;
        long j14 = this.f12268n;
        long j15 = this.f12269o;
        long j16 = this.f12270p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f12259e.hashCode()) * 31) + this.f12260f.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f12264j.hashCode()) * 31) + this.f12265k) * 31) + this.f12266l.hashCode()) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f12271q ? 1 : 0)) * 31) + this.f12272r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f12255a + "}";
    }

    public p(p pVar) {
        e eVar = e.f4753c;
        this.f12259e = eVar;
        this.f12260f = eVar;
        this.f12264j = androidx.work.c.f4732i;
        this.f12266l = androidx.work.a.EXPONENTIAL;
        this.f12267m = 30000;
        this.f12270p = -1;
        this.f12272r = q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f12255a = pVar.f12255a;
        this.f12257c = pVar.f12257c;
        this.f12256b = pVar.f12256b;
        this.f12258d = pVar.f12258d;
        this.f12259e = new e(pVar.f12259e);
        this.f12260f = new e(pVar.f12260f);
        this.f12261g = pVar.f12261g;
        this.f12262h = pVar.f12262h;
        this.f12263i = pVar.f12263i;
        this.f12264j = new androidx.work.c(pVar.f12264j);
        this.f12265k = pVar.f12265k;
        this.f12266l = pVar.f12266l;
        this.f12267m = pVar.f12267m;
        this.f12268n = pVar.f12268n;
        this.f12269o = pVar.f12269o;
        this.f12270p = pVar.f12270p;
        this.f12271q = pVar.f12271q;
        this.f12272r = pVar.f12272r;
    }
}
