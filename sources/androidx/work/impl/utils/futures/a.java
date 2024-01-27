package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture */
public abstract class a<V> implements com.google.common.util.concurrent.e<V> {

    /* renamed from: k  reason: collision with root package name */
    static final boolean f4870k = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: l  reason: collision with root package name */
    private static final Logger f4871l = Logger.getLogger(a.class.getName());

    /* renamed from: m  reason: collision with root package name */
    static final b f4872m;

    /* renamed from: n  reason: collision with root package name */
    private static final Object f4873n = new Object();

    /* renamed from: h  reason: collision with root package name */
    volatile Object f4874h;

    /* renamed from: i  reason: collision with root package name */
    volatile e f4875i;

    /* renamed from: j  reason: collision with root package name */
    volatile i f4876j;

    /* compiled from: AbstractFuture */
    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(i iVar, Thread thread);
    }

    /* compiled from: AbstractFuture */
    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f4877c;

        /* renamed from: d  reason: collision with root package name */
        static final c f4878d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f4879a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f4880b;

        static {
            if (a.f4870k) {
                f4878d = null;
                f4877c = null;
                return;
            }
            f4878d = new c(false, (Throwable) null);
            f4877c = new c(true, (Throwable) null);
        }

        c(boolean z10, Throwable th) {
            this.f4879a = z10;
            this.f4880b = th;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f4881b = new d(new C0087a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f4882a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a  reason: collision with other inner class name */
        /* compiled from: AbstractFuture */
        class C0087a extends Throwable {
            C0087a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f4882a = (Throwable) a.d(th);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f4883d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f4884a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f4885b;

        /* renamed from: c  reason: collision with root package name */
        e f4886c;

        e(Runnable runnable, Executor executor) {
            this.f4884a = runnable;
            this.f4885b = executor;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f4887a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f4888b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f4889c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f4890d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f4891e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f4887a = atomicReferenceFieldUpdater;
            this.f4888b = atomicReferenceFieldUpdater2;
            this.f4889c = atomicReferenceFieldUpdater3;
            this.f4890d = atomicReferenceFieldUpdater4;
            this.f4891e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f4890d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f4891e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f4889c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            this.f4888b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            this.f4887a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class g<V> implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final a<V> f4892h;

        /* renamed from: i  reason: collision with root package name */
        final com.google.common.util.concurrent.e<? extends V> f4893i;

        g(a<V> aVar, com.google.common.util.concurrent.e<? extends V> eVar) {
            this.f4892h = aVar;
            this.f4893i = eVar;
        }

        public void run() {
            if (this.f4892h.f4874h == this) {
                if (a.f4872m.b(this.f4892h, this, a.i(this.f4893i))) {
                    a.f(this.f4892h);
                }
            }
        }
    }

    /* compiled from: AbstractFuture */
    private static final class h extends b {
        h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f4875i != eVar) {
                    return false;
                }
                aVar.f4875i = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f4874h != obj) {
                    return false;
                }
                aVar.f4874h = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f4876j != iVar) {
                    return false;
                }
                aVar.f4876j = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            iVar.f4896b = iVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            iVar.f4895a = thread;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f4894c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f4895a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f4896b;

        i(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar) {
            a.f4872m.d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f4895a;
            if (thread != null) {
                this.f4895a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f4872m.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.a$i> r0 = androidx.work.impl.utils.futures.a.i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f4870k = r1
            java.lang.Class<androidx.work.impl.utils.futures.a> r1 = androidx.work.impl.utils.futures.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f4871l = r1
            androidx.work.impl.utils.futures.a$f r1 = new androidx.work.impl.utils.futures.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r2 = androidx.work.impl.utils.futures.a.class
            java.lang.String r5 = "j"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.a.class
            java.lang.Class<androidx.work.impl.utils.futures.a$e> r2 = androidx.work.impl.utils.futures.a.e.class
            java.lang.String r6 = "i"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "h"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.futures.a$h r1 = new androidx.work.impl.utils.futures.a$h
            r1.<init>()
        L_0x0054:
            f4872m = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f4871l
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f4873n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.<clinit>():void");
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        try {
            Object j10 = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(r(j10));
            sb.append("]");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e11.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T d(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f4875i;
        } while (!f4872m.a(this, eVar2, e.f4883d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f4886c;
            eVar5.f4886c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void f(a<?> aVar) {
        e eVar = null;
        a<V> aVar2 = aVar;
        while (true) {
            aVar2.m();
            aVar2.b();
            e e10 = aVar2.e(eVar);
            while (true) {
                if (e10 != null) {
                    eVar = e10.f4886c;
                    Runnable runnable = e10.f4884a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        a<V> aVar3 = gVar.f4892h;
                        if (aVar3.f4874h == gVar) {
                            if (f4872m.b(aVar3, gVar, i(gVar.f4893i))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        g(runnable, e10.f4885b);
                    }
                    e10 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f4871l;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    private V h(Object obj) {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f4880b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f4882a);
        } else if (obj == f4873n) {
            return null;
        } else {
            return obj;
        }
    }

    static Object i(com.google.common.util.concurrent.e<?> eVar) {
        if (eVar instanceof a) {
            Object obj = ((a) eVar).f4874h;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.f4879a) {
                return obj;
            }
            if (cVar.f4880b != null) {
                return new c(false, cVar.f4880b);
            }
            return c.f4878d;
        }
        boolean isCancelled = eVar.isCancelled();
        if ((!f4870k) && isCancelled) {
            return c.f4878d;
        }
        try {
            Object j10 = j(eVar);
            return j10 == null ? f4873n : j10;
        } catch (ExecutionException e10) {
            return new d(e10.getCause());
        } catch (CancellationException e11) {
            if (isCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + eVar, e11));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V j(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void m() {
        i iVar;
        do {
            iVar = this.f4876j;
        } while (!f4872m.c(this, iVar, i.f4894c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f4896b;
        }
    }

    private void n(i iVar) {
        iVar.f4895a = null;
        while (true) {
            i iVar2 = this.f4876j;
            if (iVar2 != i.f4894c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f4896b;
                    if (iVar2.f4895a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f4896b = iVar4;
                        if (iVar3.f4895a == null) {
                        }
                    } else if (!f4872m.c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    private String r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f4875i;
        if (eVar != e.f4883d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f4886c = eVar;
                if (!f4872m.a(this, eVar, eVar2)) {
                    eVar = this.f4875i;
                } else {
                    return;
                }
            } while (eVar != e.f4883d);
        }
        g(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.e<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f4874h
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f4870k
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.a$c r3 = new androidx.work.impl.utils.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.a.c.f4877c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.a.c.f4878d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.work.impl.utils.futures.a$b r6 = f4872m
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.k()
        L_0x0035:
            f(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a.g
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.a$g r0 = (androidx.work.impl.utils.futures.a.g) r0
            com.google.common.util.concurrent.e<? extends V> r0 = r0.f4893i
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.a r4 = (androidx.work.impl.utils.futures.a) r4
            java.lang.Object r0 = r4.f4874h
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f4874h
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.cancel(boolean):boolean");
    }

    public final V get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f4874h;
            if ((obj != null) && (!(obj instanceof g))) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.f4876j;
                if (iVar != i.f4894c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f4872m.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4874h;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    n(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            n(iVar2);
                        } else {
                            iVar = this.f4876j;
                        }
                    } while (iVar != i.f4894c);
                }
                return h(this.f4874h);
            }
            while (nanos > 0) {
                Object obj3 = this.f4874h;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z10) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z10) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f4874h instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.f4874h;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public String l() {
        Object obj = this.f4874h;
        if (obj instanceof g) {
            return "setFuture=[" + r(((g) obj).f4893i) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean o(V v10) {
        if (v10 == null) {
            v10 = f4873n;
        }
        if (!f4872m.b(this, (Object) null, v10)) {
            return false;
        }
        f(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean p(Throwable th) {
        if (!f4872m.b(this, (Object) null, new d((Throwable) d(th)))) {
            return false;
        }
        f(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean q(com.google.common.util.concurrent.e<? extends V> eVar) {
        g gVar;
        d dVar;
        d(eVar);
        Object obj = this.f4874h;
        if (obj == null) {
            if (eVar.isDone()) {
                if (!f4872m.b(this, (Object) null, i(eVar))) {
                    return false;
                }
                f(this);
                return true;
            }
            gVar = new g(this, eVar);
            if (f4872m.b(this, (Object) null, gVar)) {
                try {
                    eVar.addListener(gVar, b.INSTANCE);
                } catch (Throwable unused) {
                    dVar = d.f4881b;
                }
                return true;
            }
            obj = this.f4874h;
        }
        if (obj instanceof c) {
            eVar.cancel(((c) obj).f4879a);
        }
        return false;
        f4872m.b(this, gVar, dVar);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = l();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4874h;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f4876j;
            if (iVar != i.f4894c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f4872m.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4874h;
                            } else {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f4876j;
                } while (iVar != i.f4894c);
            }
            return h(this.f4874h);
        }
        throw new InterruptedException();
    }
}
