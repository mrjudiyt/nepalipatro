package w1;

import androidx.work.impl.WorkDatabase;
import androidx.work.m;
import androidx.work.v;
import o1.d;
import v1.q;

/* compiled from: StopWorkRunnable */
public class i implements Runnable {

    /* renamed from: k  reason: collision with root package name */
    private static final String f12621k = m.f("StopWorkRunnable");

    /* renamed from: h  reason: collision with root package name */
    private final o1.i f12622h;

    /* renamed from: i  reason: collision with root package name */
    private final String f12623i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f12624j;

    public i(o1.i iVar, String str, boolean z10) {
        this.f12622h = iVar;
        this.f12623i = str;
        this.f12624j = z10;
    }

    public void run() {
        boolean z10;
        WorkDatabase q10 = this.f12622h.q();
        d o10 = this.f12622h.o();
        q B = q10.B();
        q10.c();
        try {
            boolean h10 = o10.h(this.f12623i);
            if (this.f12624j) {
                z10 = this.f12622h.o().n(this.f12623i);
            } else {
                if (!h10 && B.m(this.f12623i) == v.a.RUNNING) {
                    B.b(v.a.ENQUEUED, this.f12623i);
                }
                z10 = this.f12622h.o().o(this.f12623i);
            }
            m.c().a(f12621k, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f12623i, Boolean.valueOf(z10)}), new Throwable[0]);
            q10.r();
        } finally {
            q10.g();
        }
    }
}
