package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.m;
import com.google.common.util.concurrent.e;
import java.util.Collections;
import java.util.List;
import o1.i;
import r1.c;
import r1.d;
import v1.p;

public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: m  reason: collision with root package name */
    private static final String f4899m = m.f("ConstraintTrkngWrkr");

    /* renamed from: h  reason: collision with root package name */
    private WorkerParameters f4900h;

    /* renamed from: i  reason: collision with root package name */
    final Object f4901i = new Object();

    /* renamed from: j  reason: collision with root package name */
    volatile boolean f4902j = false;

    /* renamed from: k  reason: collision with root package name */
    androidx.work.impl.utils.futures.c<ListenableWorker.a> f4903k = androidx.work.impl.utils.futures.c.s();

    /* renamed from: l  reason: collision with root package name */
    private ListenableWorker f4904l;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.f();
        }
    }

    class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f4906h;

        b(e eVar) {
            this.f4906h = eVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f4901i) {
                if (ConstraintTrackingWorker.this.f4902j) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.f4903k.q(this.f4906h);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4900h = workerParameters;
    }

    public WorkDatabase a() {
        return i.m(getApplicationContext()).q();
    }

    public void b(List<String> list) {
        m.c().a(f4899m, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f4901i) {
            this.f4902j = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f4903k.o(ListenableWorker.a.a());
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f4903k.o(ListenableWorker.a.b());
    }

    public void e(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String j10 = getInputData().j("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(j10)) {
            m.c().b(f4899m, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker b10 = getWorkerFactory().b(getApplicationContext(), j10, this.f4900h);
        this.f4904l = b10;
        if (b10 == null) {
            m.c().a(f4899m, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        p n10 = a().B().n(getId().toString());
        if (n10 == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(n10));
        if (dVar.c(getId().toString())) {
            m.c().a(f4899m, String.format("Constraints met for delegate %s", new Object[]{j10}), new Throwable[0]);
            try {
                e<ListenableWorker.a> startWork = this.f4904l.startWork();
                startWork.addListener(new b(startWork), getBackgroundExecutor());
            } catch (Throwable th) {
                m c10 = m.c();
                String str = f4899m;
                c10.a(str, String.format("Delegated worker %s threw exception in startWork.", new Object[]{j10}), th);
                synchronized (this.f4901i) {
                    if (this.f4902j) {
                        m.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                }
            }
        } else {
            m.c().a(f4899m, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{j10}), new Throwable[0]);
            d();
        }
    }

    public x1.a getTaskExecutor() {
        return i.m(getApplicationContext()).r();
    }

    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f4904l;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f4904l;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f4904l.stop();
        }
    }

    public e<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f4903k;
    }
}
