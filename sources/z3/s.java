package z3;

import a4.c;
import a4.d;
import a4.k;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b4.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import q3.b;
import s3.h;
import s3.i;
import s3.p;
import t3.e;
import t3.f;
import t3.g;
import t3.m;
import v3.c;

/* compiled from: Uploader */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13160a;

    /* renamed from: b  reason: collision with root package name */
    private final e f13161b;

    /* renamed from: c  reason: collision with root package name */
    private final d f13162c;

    /* renamed from: d  reason: collision with root package name */
    private final y f13163d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f13164e;

    /* renamed from: f  reason: collision with root package name */
    private final a f13165f;

    /* renamed from: g  reason: collision with root package name */
    private final c4.a f13166g;

    /* renamed from: h  reason: collision with root package name */
    private final c4.a f13167h;

    /* renamed from: i  reason: collision with root package name */
    private final c f13168i;

    public s(Context context, e eVar, d dVar, y yVar, Executor executor, a aVar, c4.a aVar2, c4.a aVar3, c cVar) {
        this.f13160a = context;
        this.f13161b = eVar;
        this.f13162c = dVar;
        this.f13163d = yVar;
        this.f13164e = executor;
        this.f13165f = aVar;
        this.f13166g = aVar2;
        this.f13167h = aVar3;
        this.f13168i = cVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean l(p pVar) {
        return Boolean.valueOf(this.f13162c.J0(pVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Iterable m(p pVar) {
        return this.f13162c.m(pVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, p pVar, long j10) {
        this.f13162c.z0(iterable);
        this.f13162c.e0(pVar, this.f13166g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f13162c.n(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f13168i.h();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f13168i.q((long) ((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r(p pVar, long j10) {
        this.f13162c.e0(pVar, this.f13166g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object s(p pVar, int i10) {
        this.f13163d.b(pVar, i10 + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f13163d.b(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void t(s3.p r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            b4.a r0 = r3.f13165f     // Catch:{ SynchronizationException -> 0x0026 }
            a4.d r1 = r3.f13162c     // Catch:{ SynchronizationException -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            z3.j r2 = new z3.j     // Catch:{ SynchronizationException -> 0x0026 }
            r2.<init>(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.a(r2)     // Catch:{ SynchronizationException -> 0x0026 }
            boolean r0 = r3.k()     // Catch:{ SynchronizationException -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            b4.a r0 = r3.f13165f     // Catch:{ SynchronizationException -> 0x0026 }
            z3.q r1 = new z3.q     // Catch:{ SynchronizationException -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.a(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.u(r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            z3.y r0 = r3.f13163d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.b(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.s.t(s3.p, int, java.lang.Runnable):void");
    }

    public i j(m mVar) {
        a aVar = this.f13165f;
        a4.c cVar = this.f13168i;
        Objects.requireNonNull(cVar);
        return mVar.b(i.a().i(this.f13166g.a()).k(this.f13167h.a()).j("GDT_CLIENT_METRICS").h(new h(b.b("proto"), ((v3.a) aVar.a(new h(cVar))).f())).d());
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f13160a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public g u(p pVar, int i10) {
        g a10;
        m a11 = this.f13161b.a(pVar.b());
        long j10 = 0;
        g e10 = g.e(0);
        while (true) {
            long j11 = j10;
            while (((Boolean) this.f13165f.a(new o(this, pVar))).booleanValue()) {
                Iterable<k> iterable = (Iterable) this.f13165f.a(new p(this, pVar));
                if (!iterable.iterator().hasNext()) {
                    return e10;
                }
                if (a11 == null) {
                    w3.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    a10 = g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (k b10 : iterable) {
                        arrayList.add(b10.b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(a11));
                    }
                    a10 = a11.a(f.a().b(arrayList).c(pVar.c()).a());
                }
                e10 = a10;
                if (e10.c() == g.a.TRANSIENT_ERROR) {
                    this.f13165f.a(new m(this, iterable, pVar, j11));
                    this.f13163d.a(pVar, i10 + 1, true);
                    return e10;
                }
                this.f13165f.a(new l(this, iterable));
                if (e10.c() == g.a.OK) {
                    j10 = Math.max(j11, e10.b());
                    if (pVar.e()) {
                        this.f13165f.a(new k(this));
                    }
                } else if (e10.c() == g.a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (k b11 : iterable) {
                        String j12 = b11.b().j();
                        if (!hashMap.containsKey(j12)) {
                            hashMap.put(j12, 1);
                        } else {
                            hashMap.put(j12, Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                        }
                    }
                    this.f13165f.a(new n(this, hashMap));
                }
            }
            this.f13165f.a(new r(this, pVar, j11));
            return e10;
        }
    }

    public void v(p pVar, int i10, Runnable runnable) {
        this.f13164e.execute(new i(this, pVar, i10, runnable));
    }
}
