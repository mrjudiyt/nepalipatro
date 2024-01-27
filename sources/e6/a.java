package e6;

import android.app.PendingIntent;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f14229a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14230b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14231c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14232d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f14233e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14234f;

    /* renamed from: g  reason: collision with root package name */
    private final long f14235g;

    /* renamed from: h  reason: collision with root package name */
    private final long f14236h;

    /* renamed from: i  reason: collision with root package name */
    private final long f14237i;

    /* renamed from: j  reason: collision with root package name */
    private final long f14238j;

    /* renamed from: k  reason: collision with root package name */
    private final PendingIntent f14239k;

    /* renamed from: l  reason: collision with root package name */
    private final PendingIntent f14240l;

    /* renamed from: m  reason: collision with root package name */
    private final PendingIntent f14241m;

    /* renamed from: n  reason: collision with root package name */
    private final PendingIntent f14242n;

    /* renamed from: o  reason: collision with root package name */
    private final Map f14243o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f14244p = false;

    private a(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f14229a = str;
        this.f14230b = i10;
        this.f14231c = i11;
        this.f14232d = i12;
        this.f14233e = num;
        this.f14234f = i13;
        this.f14235g = j10;
        this.f14236h = j11;
        this.f14237i = j12;
        this.f14238j = j13;
        this.f14239k = pendingIntent;
        this.f14240l = pendingIntent2;
        this.f14241m = pendingIntent3;
        this.f14242n = pendingIntent4;
        this.f14243o = map;
    }

    public static a k(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new a(str, i10, i11, i12, num, i13, j10, j11, j12, j13, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private static Set n(Set set) {
        return set == null ? new HashSet() : set;
    }

    private final boolean o(d dVar) {
        return dVar.a() && this.f14237i <= this.f14238j;
    }

    public int a() {
        return this.f14230b;
    }

    public Integer b() {
        return this.f14233e;
    }

    public Set<Integer> c(d dVar) {
        if (dVar.a()) {
            if (dVar.b() == 0) {
                return n((Set) this.f14243o.get("nonblocking.destructive.intent"));
            }
            return n((Set) this.f14243o.get("blocking.destructive.intent"));
        } else if (dVar.b() == 0) {
            return n((Set) this.f14243o.get("nonblocking.intent"));
        } else {
            return n((Set) this.f14243o.get("blocking.intent"));
        }
    }

    public int d() {
        return this.f14232d;
    }

    public boolean e(int i10) {
        return j(d.c(i10)) != null;
    }

    public boolean f(d dVar) {
        return j(dVar) != null;
    }

    public String g() {
        return this.f14229a;
    }

    public int h() {
        return this.f14231c;
    }

    public int i() {
        return this.f14234f;
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent j(d dVar) {
        if (dVar.b() == 0) {
            PendingIntent pendingIntent = this.f14240l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (o(dVar)) {
                return this.f14242n;
            }
            return null;
        }
        if (dVar.b() == 1) {
            PendingIntent pendingIntent2 = this.f14239k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (o(dVar)) {
                return this.f14241m;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        this.f14244p = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean m() {
        return this.f14244p;
    }
}
