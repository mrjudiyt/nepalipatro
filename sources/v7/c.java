package v7;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;

/* compiled from: CacheControl */
public final class c {

    /* renamed from: m  reason: collision with root package name */
    public static final c f16756m = new b().c().a();

    /* renamed from: n  reason: collision with root package name */
    public static final c f16757n = new b().d().b(Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS).a();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16758a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16759b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16760c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16761d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f16762e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f16763f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f16764g;

    /* renamed from: h  reason: collision with root package name */
    private final int f16765h;

    /* renamed from: i  reason: collision with root package name */
    private final int f16766i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f16767j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f16768k;

    /* renamed from: l  reason: collision with root package name */
    String f16769l;

    /* compiled from: CacheControl */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        boolean f16770a;

        /* renamed from: b  reason: collision with root package name */
        boolean f16771b;

        /* renamed from: c  reason: collision with root package name */
        int f16772c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f16773d = -1;

        /* renamed from: e  reason: collision with root package name */
        int f16774e = -1;

        /* renamed from: f  reason: collision with root package name */
        boolean f16775f;

        /* renamed from: g  reason: collision with root package name */
        boolean f16776g;

        public c a() {
            return new c(this);
        }

        public b b(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds((long) i10);
                this.f16773d = seconds > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        public b c() {
            this.f16770a = true;
            return this;
        }

        public b d() {
            this.f16775f = true;
            return this;
        }
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.f16758a) {
            sb.append("no-cache, ");
        }
        if (this.f16759b) {
            sb.append("no-store, ");
        }
        if (this.f16760c != -1) {
            sb.append("max-age=");
            sb.append(this.f16760c);
            sb.append(", ");
        }
        if (this.f16761d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f16761d);
            sb.append(", ");
        }
        if (this.f16762e) {
            sb.append("private, ");
        }
        if (this.f16763f) {
            sb.append("public, ");
        }
        if (this.f16764g) {
            sb.append("must-revalidate, ");
        }
        if (this.f16765h != -1) {
            sb.append("max-stale=");
            sb.append(this.f16765h);
            sb.append(", ");
        }
        if (this.f16766i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f16766i);
            sb.append(", ");
        }
        if (this.f16767j) {
            sb.append("only-if-cached, ");
        }
        if (this.f16768k) {
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static v7.c k(v7.p r21) {
        /*
            r0 = r21
            int r1 = r21.f()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
        L_0x0018:
            if (r6 >= r1) goto L_0x0131
            java.lang.String r2 = r0.d(r6)
            java.lang.String r4 = r0.g(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            r8 = r4
            goto L_0x0038
        L_0x002f:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x012a
        L_0x0037:
            r7 = 0
        L_0x0038:
            r2 = 0
        L_0x0039:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x012a
            java.lang.String r3 = "=,;"
            int r3 = y7.d.b(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0097
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0097
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0064
            goto L_0x0097
        L_0x0064:
            int r3 = r3 + 1
            int r0 = y7.d.c(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0087
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0087
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = y7.d.b(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009b
        L_0x0087:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = y7.d.b(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009b
        L_0x0097:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009b:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a7
            r5 = -1
            r9 = 1
            goto L_0x0125
        L_0x00a7:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b3
            r5 = -1
            r10 = 1
            goto L_0x0125
        L_0x00b3:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c1
            r5 = -1
            int r11 = y7.d.a(r0, r5)
            goto L_0x0125
        L_0x00c1:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00cf
            r5 = -1
            int r12 = y7.d.a(r0, r5)
            goto L_0x0125
        L_0x00cf:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00da
            r5 = -1
            r13 = 1
            goto L_0x0125
        L_0x00da:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e5
            r5 = -1
            r14 = 1
            goto L_0x0125
        L_0x00e5:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f0
            r5 = -1
            r15 = 1
            goto L_0x0125
        L_0x00f0:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0101
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = y7.d.a(r0, r2)
            r5 = -1
            goto L_0x0125
        L_0x0101:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x010f
            r5 = -1
            int r17 = y7.d.a(r0, r5)
            goto L_0x0125
        L_0x010f:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011b
            r18 = 1
            goto L_0x0125
        L_0x011b:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0125
            r19 = 1
        L_0x0125:
            r0 = r21
            r2 = r3
            goto L_0x0039
        L_0x012a:
            r5 = -1
            int r6 = r6 + 1
            r0 = r21
            goto L_0x0018
        L_0x0131:
            if (r7 != 0) goto L_0x0136
            r20 = 0
            goto L_0x0138
        L_0x0136:
            r20 = r8
        L_0x0138:
            v7.c r0 = new v7.c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.c.k(v7.p):v7.c");
    }

    public boolean b() {
        return this.f16762e;
    }

    public boolean c() {
        return this.f16763f;
    }

    public int d() {
        return this.f16760c;
    }

    public int e() {
        return this.f16765h;
    }

    public int f() {
        return this.f16766i;
    }

    public boolean g() {
        return this.f16764g;
    }

    public boolean h() {
        return this.f16758a;
    }

    public boolean i() {
        return this.f16759b;
    }

    public boolean j() {
        return this.f16767j;
    }

    public String toString() {
        String str = this.f16769l;
        if (str != null) {
            return str;
        }
        String a10 = a();
        this.f16769l = a10;
        return a10;
    }

    private c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, String str) {
        this.f16758a = z10;
        this.f16759b = z11;
        this.f16760c = i10;
        this.f16761d = i11;
        this.f16762e = z12;
        this.f16763f = z13;
        this.f16764g = z14;
        this.f16765h = i12;
        this.f16766i = i13;
        this.f16767j = z15;
        this.f16768k = z16;
        this.f16769l = str;
    }

    private c(b bVar) {
        this.f16758a = bVar.f16770a;
        this.f16759b = bVar.f16771b;
        this.f16760c = bVar.f16772c;
        this.f16761d = -1;
        this.f16762e = false;
        this.f16763f = false;
        this.f16764g = false;
        this.f16765h = bVar.f16773d;
        this.f16766i = bVar.f16774e;
        this.f16767j = bVar.f16775f;
        this.f16768k = bVar.f16776g;
    }
}
