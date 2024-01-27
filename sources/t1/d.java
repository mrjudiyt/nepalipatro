package t1;

import android.content.Context;
import androidx.work.m;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f11577f = m.f("ConstraintTracker");

    /* renamed from: a  reason: collision with root package name */
    protected final x1.a f11578a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f11579b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f11580c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Set<r1.a<T>> f11581d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    T f11582e;

    /* compiled from: ConstraintTracker */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List f11583h;

        a(List list) {
            this.f11583h = list;
        }

        public void run() {
            for (r1.a a10 : this.f11583h) {
                a10.a(d.this.f11582e);
            }
        }
    }

    d(Context context, x1.a aVar) {
        this.f11579b = context.getApplicationContext();
        this.f11578a = aVar;
    }

    public void a(r1.a<T> aVar) {
        synchronized (this.f11580c) {
            if (this.f11581d.add(aVar)) {
                if (this.f11581d.size() == 1) {
                    this.f11582e = b();
                    m.c().a(f11577f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f11582e}), new Throwable[0]);
                    e();
                }
                aVar.a(this.f11582e);
            }
        }
    }

    public abstract T b();

    public void c(r1.a<T> aVar) {
        synchronized (this.f11580c) {
            if (this.f11581d.remove(aVar) && this.f11581d.isEmpty()) {
                f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f11580c
            monitor-enter(r0)
            T r1 = r3.f11582e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f11582e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.Set<r1.a<T>> r1 = r3.f11581d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            x1.a r1 = r3.f11578a     // Catch:{ all -> 0x002b }
            java.util.concurrent.Executor r1 = r1.a()     // Catch:{ all -> 0x002b }
            t1.d$a r2 = new t1.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.d.d(java.lang.Object):void");
    }

    public abstract void e();

    public abstract void f();
}
