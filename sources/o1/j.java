package o1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.m;
import androidx.work.v;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import v1.p;
import v1.q;
import v1.t;
import w1.d;
import w1.k;
import w1.l;

/* compiled from: WorkerWrapper */
public class j implements Runnable {
    static final String A = m.f("WorkerWrapper");

    /* renamed from: h  reason: collision with root package name */
    Context f10332h;

    /* renamed from: i  reason: collision with root package name */
    private String f10333i;

    /* renamed from: j  reason: collision with root package name */
    private List<e> f10334j;

    /* renamed from: k  reason: collision with root package name */
    private WorkerParameters.a f10335k;

    /* renamed from: l  reason: collision with root package name */
    p f10336l;

    /* renamed from: m  reason: collision with root package name */
    ListenableWorker f10337m;

    /* renamed from: n  reason: collision with root package name */
    x1.a f10338n;

    /* renamed from: o  reason: collision with root package name */
    ListenableWorker.a f10339o = ListenableWorker.a.a();

    /* renamed from: p  reason: collision with root package name */
    private androidx.work.b f10340p;

    /* renamed from: q  reason: collision with root package name */
    private u1.a f10341q;

    /* renamed from: r  reason: collision with root package name */
    private WorkDatabase f10342r;

    /* renamed from: s  reason: collision with root package name */
    private q f10343s;

    /* renamed from: t  reason: collision with root package name */
    private v1.b f10344t;

    /* renamed from: u  reason: collision with root package name */
    private t f10345u;

    /* renamed from: v  reason: collision with root package name */
    private List<String> f10346v;

    /* renamed from: w  reason: collision with root package name */
    private String f10347w;

    /* renamed from: x  reason: collision with root package name */
    androidx.work.impl.utils.futures.c<Boolean> f10348x = androidx.work.impl.utils.futures.c.s();

    /* renamed from: y  reason: collision with root package name */
    e<ListenableWorker.a> f10349y = null;

    /* renamed from: z  reason: collision with root package name */
    private volatile boolean f10350z;

    /* compiled from: WorkerWrapper */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f10351h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f10352i;

        a(e eVar, androidx.work.impl.utils.futures.c cVar) {
            this.f10351h = eVar;
            this.f10352i = cVar;
        }

        public void run() {
            try {
                this.f10351h.get();
                m.c().a(j.A, String.format("Starting work for %s", new Object[]{j.this.f10336l.f12257c}), new Throwable[0]);
                j jVar = j.this;
                jVar.f10349y = jVar.f10337m.startWork();
                this.f10352i.q(j.this.f10349y);
            } catch (Throwable th) {
                this.f10352i.p(th);
            }
        }
    }

    /* compiled from: WorkerWrapper */
    class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f10354h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f10355i;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f10354h = cVar;
            this.f10355i = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.f10354h.get();
                if (aVar == null) {
                    m.c().b(j.A, String.format("%s returned a null result. Treating it as a failure.", new Object[]{j.this.f10336l.f12257c}), new Throwable[0]);
                } else {
                    m.c().a(j.A, String.format("%s returned a %s result.", new Object[]{j.this.f10336l.f12257c, aVar}), new Throwable[0]);
                    j.this.f10339o = aVar;
                }
            } catch (CancellationException e10) {
                m.c().d(j.A, String.format("%s was cancelled", new Object[]{this.f10355i}), e10);
            } catch (InterruptedException | ExecutionException e11) {
                m.c().b(j.A, String.format("%s failed because it threw an exception/error", new Object[]{this.f10355i}), e11);
            } catch (Throwable th) {
                j.this.f();
                throw th;
            }
            j.this.f();
        }
    }

    /* compiled from: WorkerWrapper */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Context f10357a;

        /* renamed from: b  reason: collision with root package name */
        ListenableWorker f10358b;

        /* renamed from: c  reason: collision with root package name */
        u1.a f10359c;

        /* renamed from: d  reason: collision with root package name */
        x1.a f10360d;

        /* renamed from: e  reason: collision with root package name */
        androidx.work.b f10361e;

        /* renamed from: f  reason: collision with root package name */
        WorkDatabase f10362f;

        /* renamed from: g  reason: collision with root package name */
        String f10363g;

        /* renamed from: h  reason: collision with root package name */
        List<e> f10364h;

        /* renamed from: i  reason: collision with root package name */
        WorkerParameters.a f10365i = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, x1.a aVar, u1.a aVar2, WorkDatabase workDatabase, String str) {
            this.f10357a = context.getApplicationContext();
            this.f10360d = aVar;
            this.f10359c = aVar2;
            this.f10361e = bVar;
            this.f10362f = workDatabase;
            this.f10363g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f10365i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f10364h = list;
            return this;
        }
    }

    j(c cVar) {
        this.f10332h = cVar.f10357a;
        this.f10338n = cVar.f10360d;
        this.f10341q = cVar.f10359c;
        this.f10333i = cVar.f10363g;
        this.f10334j = cVar.f10364h;
        this.f10335k = cVar.f10365i;
        this.f10337m = cVar.f10358b;
        this.f10340p = cVar.f10361e;
        WorkDatabase workDatabase = cVar.f10362f;
        this.f10342r = workDatabase;
        this.f10343s = workDatabase.B();
        this.f10344t = this.f10342r.t();
        this.f10345u = this.f10342r.C();
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f10333i);
        sb.append(", tags={ ");
        boolean z10 = true;
        for (String next : list) {
            if (z10) {
                z10 = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            m.c().d(A, String.format("Worker result SUCCESS for %s", new Object[]{this.f10347w}), new Throwable[0]);
            if (this.f10336l.d()) {
                h();
            } else {
                m();
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            m.c().d(A, String.format("Worker result RETRY for %s", new Object[]{this.f10347w}), new Throwable[0]);
            g();
        } else {
            m.c().d(A, String.format("Worker result FAILURE for %s", new Object[]{this.f10347w}), new Throwable[0]);
            if (this.f10336l.d()) {
                h();
            } else {
                l();
            }
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f10343s.m(str2) != v.a.CANCELLED) {
                this.f10343s.b(v.a.FAILED, str2);
            }
            linkedList.addAll(this.f10344t.b(str2));
        }
    }

    private void g() {
        this.f10342r.c();
        try {
            this.f10343s.b(v.a.ENQUEUED, this.f10333i);
            this.f10343s.s(this.f10333i, System.currentTimeMillis());
            this.f10343s.c(this.f10333i, -1);
            this.f10342r.r();
        } finally {
            this.f10342r.g();
            i(true);
        }
    }

    private void h() {
        this.f10342r.c();
        try {
            this.f10343s.s(this.f10333i, System.currentTimeMillis());
            this.f10343s.b(v.a.ENQUEUED, this.f10333i);
            this.f10343s.o(this.f10333i);
            this.f10343s.c(this.f10333i, -1);
            this.f10342r.r();
        } finally {
            this.f10342r.g();
            i(false);
        }
    }

    /* JADX INFO: finally extract failed */
    private void i(boolean z10) {
        ListenableWorker listenableWorker;
        this.f10342r.c();
        try {
            if (!this.f10342r.B().j()) {
                d.a(this.f10332h, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f10343s.b(v.a.ENQUEUED, this.f10333i);
                this.f10343s.c(this.f10333i, -1);
            }
            if (!(this.f10336l == null || (listenableWorker = this.f10337m) == null || !listenableWorker.isRunInForeground())) {
                this.f10341q.b(this.f10333i);
            }
            this.f10342r.r();
            this.f10342r.g();
            this.f10348x.o(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f10342r.g();
            throw th;
        }
    }

    private void j() {
        v.a m10 = this.f10343s.m(this.f10333i);
        if (m10 == v.a.RUNNING) {
            m.c().a(A, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f10333i}), new Throwable[0]);
            i(true);
            return;
        }
        m.c().a(A, String.format("Status for %s is %s; not doing any work", new Object[]{this.f10333i, m10}), new Throwable[0]);
        i(false);
    }

    private void k() {
        androidx.work.e b10;
        if (!n()) {
            this.f10342r.c();
            try {
                p n10 = this.f10343s.n(this.f10333i);
                this.f10336l = n10;
                if (n10 == null) {
                    m.c().b(A, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f10333i}), new Throwable[0]);
                    i(false);
                    this.f10342r.r();
                } else if (n10.f12256b != v.a.ENQUEUED) {
                    j();
                    this.f10342r.r();
                    m.c().a(A, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f10336l.f12257c}), new Throwable[0]);
                    this.f10342r.g();
                } else {
                    if (n10.d() || this.f10336l.c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        p pVar = this.f10336l;
                        if (!(pVar.f12268n == 0) && currentTimeMillis < pVar.a()) {
                            m.c().a(A, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f10336l.f12257c}), new Throwable[0]);
                            i(true);
                            this.f10342r.r();
                            this.f10342r.g();
                            return;
                        }
                    }
                    this.f10342r.r();
                    this.f10342r.g();
                    if (this.f10336l.d()) {
                        b10 = this.f10336l.f12259e;
                    } else {
                        androidx.work.j b11 = this.f10340p.f().b(this.f10336l.f12258d);
                        if (b11 == null) {
                            m.c().b(A, String.format("Could not create Input Merger %s", new Object[]{this.f10336l.f12258d}), new Throwable[0]);
                            l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f10336l.f12259e);
                        arrayList.addAll(this.f10343s.q(this.f10333i));
                        b10 = b11.b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f10333i), b10, this.f10346v, this.f10335k, this.f10336l.f12265k, this.f10340p.e(), this.f10338n, this.f10340p.m(), new w1.m(this.f10342r, this.f10338n), new l(this.f10342r, this.f10341q, this.f10338n));
                    if (this.f10337m == null) {
                        this.f10337m = this.f10340p.m().b(this.f10332h, this.f10336l.f12257c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f10337m;
                    if (listenableWorker == null) {
                        m.c().b(A, String.format("Could not create Worker %s", new Object[]{this.f10336l.f12257c}), new Throwable[0]);
                        l();
                    } else if (listenableWorker.isUsed()) {
                        m.c().b(A, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f10336l.f12257c}), new Throwable[0]);
                        l();
                    } else {
                        this.f10337m.setUsed();
                        if (!o()) {
                            j();
                        } else if (!n()) {
                            androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
                            k kVar = new k(this.f10332h, this.f10336l, this.f10337m, workerParameters.b(), this.f10338n);
                            this.f10338n.a().execute(kVar);
                            e<Void> a10 = kVar.a();
                            a10.addListener(new a(a10, s10), this.f10338n.a());
                            s10.addListener(new b(s10, this.f10347w), this.f10338n.c());
                        }
                    }
                }
            } finally {
                this.f10342r.g();
            }
        }
    }

    private void m() {
        this.f10342r.c();
        try {
            this.f10343s.b(v.a.SUCCEEDED, this.f10333i);
            this.f10343s.h(this.f10333i, ((ListenableWorker.a.c) this.f10339o).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.f10344t.b(this.f10333i)) {
                if (this.f10343s.m(next) == v.a.BLOCKED && this.f10344t.c(next)) {
                    m.c().d(A, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.f10343s.b(v.a.ENQUEUED, next);
                    this.f10343s.s(next, currentTimeMillis);
                }
            }
            this.f10342r.r();
        } finally {
            this.f10342r.g();
            i(false);
        }
    }

    private boolean n() {
        if (!this.f10350z) {
            return false;
        }
        m.c().a(A, String.format("Work interrupted for %s", new Object[]{this.f10347w}), new Throwable[0]);
        v.a m10 = this.f10343s.m(this.f10333i);
        if (m10 == null) {
            i(false);
        } else {
            i(!m10.a());
        }
        return true;
    }

    private boolean o() {
        this.f10342r.c();
        try {
            boolean z10 = true;
            if (this.f10343s.m(this.f10333i) == v.a.ENQUEUED) {
                this.f10343s.b(v.a.RUNNING, this.f10333i);
                this.f10343s.r(this.f10333i);
            } else {
                z10 = false;
            }
            this.f10342r.r();
            return z10;
        } finally {
            this.f10342r.g();
        }
    }

    public e<Boolean> b() {
        return this.f10348x;
    }

    public void d() {
        boolean z10;
        this.f10350z = true;
        n();
        e<ListenableWorker.a> eVar = this.f10349y;
        if (eVar != null) {
            z10 = eVar.isDone();
            this.f10349y.cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = this.f10337m;
        if (listenableWorker == null || z10) {
            m.c().a(A, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{this.f10336l}), new Throwable[0]);
            return;
        }
        listenableWorker.stop();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (!n()) {
            this.f10342r.c();
            try {
                v.a m10 = this.f10343s.m(this.f10333i);
                this.f10342r.A().a(this.f10333i);
                if (m10 == null) {
                    i(false);
                } else if (m10 == v.a.RUNNING) {
                    c(this.f10339o);
                } else if (!m10.a()) {
                    g();
                }
                this.f10342r.r();
            } finally {
                this.f10342r.g();
            }
        }
        List<e> list = this.f10334j;
        if (list != null) {
            for (e d10 : list) {
                d10.d(this.f10333i);
            }
            f.b(this.f10340p, this.f10342r, this.f10334j);
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f10342r.c();
        try {
            e(this.f10333i);
            this.f10343s.h(this.f10333i, ((ListenableWorker.a.C0082a) this.f10339o).e());
            this.f10342r.r();
        } finally {
            this.f10342r.g();
            i(false);
        }
    }

    public void run() {
        List<String> a10 = this.f10345u.a(this.f10333i);
        this.f10346v = a10;
        this.f10347w = a(a10);
        k();
    }
}
