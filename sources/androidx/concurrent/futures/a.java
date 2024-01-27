package androidx.concurrent.futures;

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

/* compiled from: AbstractResolvableFuture */
public abstract class a<V> implements com.google.common.util.concurrent.e<V> {
    static final b ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Object NULL = new Object();
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final Logger log = Logger.getLogger(a.class.getName());
    volatile e listeners;
    volatile Object value;
    volatile i waiters;

    /* compiled from: AbstractResolvableFuture */
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

    /* compiled from: AbstractResolvableFuture */
    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f1469c;

        /* renamed from: d  reason: collision with root package name */
        static final c f1470d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f1471a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f1472b;

        static {
            if (a.GENERATE_CANCELLATION_CAUSES) {
                f1470d = null;
                f1469c = null;
                return;
            }
            f1470d = new c(false, (Throwable) null);
            f1469c = new c(true, (Throwable) null);
        }

        c(boolean z10, Throwable th) {
            this.f1471a = z10;
            this.f1472b = th;
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f1473b = new d(new C0018a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f1474a;

        /* renamed from: androidx.concurrent.futures.a$d$a  reason: collision with other inner class name */
        /* compiled from: AbstractResolvableFuture */
        class C0018a extends Throwable {
            C0018a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1474a = (Throwable) a.checkNotNull(th);
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f1475d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f1476a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f1477b;

        /* renamed from: c  reason: collision with root package name */
        e f1478c;

        e(Runnable runnable, Executor executor) {
            this.f1476a = runnable;
            this.f1477b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f1479a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f1480b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f1481c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f1482d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f1483e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1479a = atomicReferenceFieldUpdater;
            this.f1480b = atomicReferenceFieldUpdater2;
            this.f1481c = atomicReferenceFieldUpdater3;
            this.f1482d = atomicReferenceFieldUpdater4;
            this.f1483e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return b.a(this.f1482d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return b.a(this.f1483e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return b.a(this.f1481c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            this.f1480b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            this.f1479a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class g<V> implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final a<V> f1484h;

        /* renamed from: i  reason: collision with root package name */
        final com.google.common.util.concurrent.e<? extends V> f1485i;

        g(a<V> aVar, com.google.common.util.concurrent.e<? extends V> eVar) {
            this.f1484h = aVar;
            this.f1485i = eVar;
        }

        public void run() {
            if (this.f1484h.value == this) {
                if (a.ATOMIC_HELPER.b(this.f1484h, this, a.getFutureValue(this.f1485i))) {
                    a.complete(this.f1484h);
                }
            }
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class h extends b {
        h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.listeners != eVar) {
                    return false;
                }
                aVar.listeners = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.value != obj) {
                    return false;
                }
                aVar.value = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.waiters != iVar) {
                    return false;
                }
                aVar.waiters = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            iVar.f1488b = iVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            iVar.f1487a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f1486c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f1487a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f1488b;

        i(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar) {
            a.ATOMIC_HELPER.d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f1487a;
            if (thread != null) {
                this.f1487a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.ATOMIC_HELPER.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.concurrent.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.concurrent.futures.a$i> r0 = androidx.concurrent.futures.a.i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            GENERATE_CANCELLATION_CAUSES = r1
            java.lang.Class<androidx.concurrent.futures.a> r1 = androidx.concurrent.futures.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            log = r1
            androidx.concurrent.futures.a$f r1 = new androidx.concurrent.futures.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r2 = androidx.concurrent.futures.a.class
            java.lang.String r5 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r0 = androidx.concurrent.futures.a.class
            java.lang.Class<androidx.concurrent.futures.a$e> r2 = androidx.concurrent.futures.a.e.class
            java.lang.String r6 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r0 = androidx.concurrent.futures.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.concurrent.futures.a$h r1 = new androidx.concurrent.futures.a$h
            r1.<init>()
        L_0x0054:
            ATOMIC_HELPER = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            NULL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.<clinit>():void");
    }

    protected a() {
    }

    private void addDoneString(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(uninterruptibly));
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

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T checkNotNull(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private e clearListeners(e eVar) {
        e eVar2;
        do {
            eVar2 = this.listeners;
        } while (!ATOMIC_HELPER.a(this, eVar2, e.f1475d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f1478c;
            eVar5.f1478c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void complete(a<?> aVar) {
        e eVar = null;
        a<V> aVar2 = aVar;
        while (true) {
            aVar2.releaseWaiters();
            aVar2.afterDone();
            e clearListeners = aVar2.clearListeners(eVar);
            while (true) {
                if (clearListeners != null) {
                    eVar = clearListeners.f1478c;
                    Runnable runnable = clearListeners.f1476a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        a<V> aVar3 = gVar.f1484h;
                        if (aVar3.value == gVar) {
                            if (ATOMIC_HELPER.b(aVar3, gVar, getFutureValue(gVar.f1485i))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        executeListener(runnable, clearListeners.f1477b);
                    }
                    clearListeners = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = log;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    private V getDoneValue(Object obj) {
        if (obj instanceof c) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((c) obj).f1472b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1474a);
        } else if (obj == NULL) {
            return null;
        } else {
            return obj;
        }
    }

    static Object getFutureValue(com.google.common.util.concurrent.e<?> eVar) {
        if (eVar instanceof a) {
            Object obj = ((a) eVar).value;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.f1471a) {
                return obj;
            }
            if (cVar.f1472b != null) {
                return new c(false, cVar.f1472b);
            }
            return c.f1470d;
        }
        boolean isCancelled = eVar.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            return c.f1470d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(eVar);
            return uninterruptibly == null ? NULL : uninterruptibly;
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

    static <V> V getUninterruptibly(Future<V> future) {
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

    private void releaseWaiters() {
        i iVar;
        do {
            iVar = this.waiters;
        } while (!ATOMIC_HELPER.c(this, iVar, i.f1486c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f1488b;
        }
    }

    private void removeWaiter(i iVar) {
        iVar.f1487a = null;
        while (true) {
            i iVar2 = this.waiters;
            if (iVar2 != i.f1486c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f1488b;
                    if (iVar2.f1487a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f1488b = iVar4;
                        if (iVar3.f1487a == null) {
                        }
                    } else if (!ATOMIC_HELPER.c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        e eVar = this.listeners;
        if (eVar != e.f1475d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1478c = eVar;
                if (!ATOMIC_HELPER.a(this, eVar, eVar2)) {
                    eVar = this.listeners;
                } else {
                    return;
                }
            } while (eVar != e.f1475d);
        }
        executeListener(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void afterDone() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.e<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.concurrent.futures.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = GENERATE_CANCELLATION_CAUSES
            if (r3 == 0) goto L_0x001f
            androidx.concurrent.futures.a$c r3 = new androidx.concurrent.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.concurrent.futures.a$c r3 = androidx.concurrent.futures.a.c.f1469c
            goto L_0x0026
        L_0x0024:
            androidx.concurrent.futures.a$c r3 = androidx.concurrent.futures.a.c.f1470d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.concurrent.futures.a$b r6 = ATOMIC_HELPER
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.interruptTask()
        L_0x0035:
            complete(r4)
            boolean r4 = r0 instanceof androidx.concurrent.futures.a.g
            if (r4 == 0) goto L_0x0062
            androidx.concurrent.futures.a$g r0 = (androidx.concurrent.futures.a.g) r0
            com.google.common.util.concurrent.e<? extends V> r0 = r0.f1485i
            boolean r4 = r0 instanceof androidx.concurrent.futures.a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.concurrent.futures.a r4 = (androidx.concurrent.futures.a) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.concurrent.futures.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof androidx.concurrent.futures.a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.cancel(boolean):boolean");
    }

    public final V get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if ((obj != null) && (!(obj instanceof g))) {
                return getDoneValue(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= SPIN_THRESHOLD_NANOS) {
                i iVar = this.waiters;
                if (iVar != i.f1486c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (ATOMIC_HELPER.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return getDoneValue(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    removeWaiter(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= SPIN_THRESHOLD_NANOS);
                            removeWaiter(iVar2);
                        } else {
                            iVar = this.waiters;
                        }
                    } while (iVar != i.f1486c);
                }
                return getDoneValue(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return getDoneValue(obj3);
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
            if (nanos + SPIN_THRESHOLD_NANOS < 0) {
                String str2 = str + " (plus ";
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > SPIN_THRESHOLD_NANOS;
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

    /* access modifiers changed from: protected */
    public void interruptTask() {
    }

    public final boolean isCancelled() {
        return this.value instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* access modifiers changed from: package-private */
    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* access modifiers changed from: protected */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof g) {
            return "setFuture=[" + userObjectToString(((g) obj).f1485i) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean set(V v10) {
        if (v10 == null) {
            v10 = NULL;
        }
        if (!ATOMIC_HELPER.b(this, (Object) null, v10)) {
            return false;
        }
        complete(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.b(this, (Object) null, new d((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean setFuture(com.google.common.util.concurrent.e<? extends V> eVar) {
        g gVar;
        d dVar;
        checkNotNull(eVar);
        Object obj = this.value;
        if (obj == null) {
            if (eVar.isDone()) {
                if (!ATOMIC_HELPER.b(this, (Object) null, getFutureValue(eVar))) {
                    return false;
                }
                complete(this);
                return true;
            }
            gVar = new g(this, eVar);
            if (ATOMIC_HELPER.b(this, (Object) null, gVar)) {
                try {
                    eVar.addListener(gVar, d.INSTANCE);
                } catch (Throwable unused) {
                    dVar = d.f1473b;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof c) {
            eVar.cancel(((c) obj).f1471a);
        }
        return false;
        ATOMIC_HELPER.b(this, gVar, dVar);
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
            addDoneString(sb);
        } else {
            try {
                str = pendingToString();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                addDoneString(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof c) && ((c) obj).f1471a;
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return getDoneValue(obj2);
            }
            i iVar = this.waiters;
            if (iVar != i.f1486c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (ATOMIC_HELPER.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                removeWaiter(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return getDoneValue(obj);
                    }
                    iVar = this.waiters;
                } while (iVar != i.f1486c);
            }
            return getDoneValue(this.value);
        }
        throw new InterruptedException();
    }
}
