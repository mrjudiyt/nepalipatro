package com.google.common.util.concurrent;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
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
import l6.p;
import l6.t;
import sun.misc.Unsafe;

/* compiled from: AbstractFuture */
public abstract class a<V> extends o6.a implements e<V> {

    /* renamed from: k  reason: collision with root package name */
    static final boolean f13750k;

    /* renamed from: l  reason: collision with root package name */
    private static final Logger f13751l = Logger.getLogger(a.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final b f13752m;

    /* renamed from: n  reason: collision with root package name */
    private static final Object f13753n = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile Object f13754h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public volatile e f13755i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public volatile l f13756j;

    /* compiled from: AbstractFuture */
    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a<?> aVar, l lVar, l lVar2);

        /* access modifiers changed from: package-private */
        public abstract e d(a<?> aVar, e eVar);

        /* access modifiers changed from: package-private */
        public abstract l e(a<?> aVar, l lVar);

        /* access modifiers changed from: package-private */
        public abstract void f(l lVar, l lVar2);

        /* access modifiers changed from: package-private */
        public abstract void g(l lVar, Thread thread);
    }

    /* compiled from: AbstractFuture */
    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f13757c;

        /* renamed from: d  reason: collision with root package name */
        static final c f13758d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f13759a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f13760b;

        static {
            if (a.f13750k) {
                f13758d = null;
                f13757c = null;
                return;
            }
            f13758d = new c(false, (Throwable) null);
            f13757c = new c(true, (Throwable) null);
        }

        c(boolean z10, Throwable th) {
            this.f13759a = z10;
            this.f13760b = th;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f13761b = new d(new C0240a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f13762a;

        /* renamed from: com.google.common.util.concurrent.a$d$a  reason: collision with other inner class name */
        /* compiled from: AbstractFuture */
        class C0240a extends Throwable {
            C0240a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f13762a = (Throwable) p.j(th);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f13767a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f13768b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, l> f13769c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f13770d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f13771e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f13767a = atomicReferenceFieldUpdater;
            this.f13768b = atomicReferenceFieldUpdater2;
            this.f13769c = atomicReferenceFieldUpdater3;
            this.f13770d = atomicReferenceFieldUpdater4;
            this.f13771e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f13770d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f13771e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f13769c, aVar, lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        public e d(a<?> aVar, e eVar) {
            return this.f13770d.getAndSet(aVar, eVar);
        }

        /* access modifiers changed from: package-private */
        public l e(a<?> aVar, l lVar) {
            return this.f13769c.getAndSet(aVar, lVar);
        }

        /* access modifiers changed from: package-private */
        public void f(l lVar, l lVar2) {
            this.f13768b.lazySet(lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        public void g(l lVar, Thread thread) {
            this.f13767a.lazySet(lVar, thread);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class g<V> implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final a<V> f13772h;

        /* renamed from: i  reason: collision with root package name */
        final e<? extends V> f13773i;

        public void run() {
            if (this.f13772h.f13754h == this) {
                if (a.f13752m.b(this.f13772h, this, a.u(this.f13773i))) {
                    a.r(this.f13772h);
                }
            }
        }
    }

    /* compiled from: AbstractFuture */
    private static final class h extends b {
        private h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f13755i != eVar) {
                    return false;
                }
                e unused = aVar.f13755i = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f13754h != obj) {
                    return false;
                }
                Object unused = aVar.f13754h = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                if (aVar.f13756j != lVar) {
                    return false;
                }
                l unused = aVar.f13756j = lVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public e d(a<?> aVar, e eVar) {
            e g10;
            synchronized (aVar) {
                g10 = aVar.f13755i;
                if (g10 != eVar) {
                    e unused = aVar.f13755i = eVar;
                }
            }
            return g10;
        }

        /* access modifiers changed from: package-private */
        public l e(a<?> aVar, l lVar) {
            l i10;
            synchronized (aVar) {
                i10 = aVar.f13756j;
                if (i10 != lVar) {
                    l unused = aVar.f13756j = lVar;
                }
            }
            return i10;
        }

        /* access modifiers changed from: package-private */
        public void f(l lVar, l lVar2) {
            lVar.f13782b = lVar2;
        }

        /* access modifiers changed from: package-private */
        public void g(l lVar, Thread thread) {
            lVar.f13781a = thread;
        }
    }

    /* compiled from: AbstractFuture */
    interface i<V> extends e<V> {
    }

    /* compiled from: AbstractFuture */
    static abstract class j<V> extends a<V> implements i<V> {
        j() {
        }

        public final void addListener(Runnable runnable, Executor executor) {
            a.super.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z10) {
            return a.super.cancel(z10);
        }

        public final V get() {
            return a.super.get();
        }

        public boolean isCancelled() {
            return a.super.isCancelled();
        }

        public final boolean isDone() {
            return a.super.isDone();
        }

        public final V get(long j10, TimeUnit timeUnit) {
            return a.super.get(j10, timeUnit);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class k extends b {

        /* renamed from: a  reason: collision with root package name */
        static final Unsafe f13774a;

        /* renamed from: b  reason: collision with root package name */
        static final long f13775b;

        /* renamed from: c  reason: collision with root package name */
        static final long f13776c;

        /* renamed from: d  reason: collision with root package name */
        static final long f13777d;

        /* renamed from: e  reason: collision with root package name */
        static final long f13778e;

        /* renamed from: f  reason: collision with root package name */
        static final long f13779f;

        /* renamed from: com.google.common.util.concurrent.a$k$a  reason: collision with other inner class name */
        /* compiled from: AbstractFuture */
        class C0241a implements PrivilegedExceptionAction<Unsafe> {
            C0241a() {
            }

            /* renamed from: a */
            public Unsafe run() {
                Class<Unsafe> cls = Unsafe.class;
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get((Object) null);
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.util.concurrent.a.k.C0241a());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.common.util.concurrent.a$l> r0 = com.google.common.util.concurrent.a.l.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.common.util.concurrent.a$k$a r1 = new com.google.common.util.concurrent.a$k$a     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<com.google.common.util.concurrent.a> r2 = com.google.common.util.concurrent.a.class
                java.lang.String r3 = "j"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f13776c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "i"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f13775b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "h"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f13777d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f13778e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f13779f = r2     // Catch:{ Exception -> 0x0053 }
                f13774a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                l6.w.e(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.k.<clinit>():void");
        }

        private k() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return com.google.android.gms.internal.ads.a.a(f13774a, aVar, f13775b, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return com.google.android.gms.internal.ads.a.a(f13774a, aVar, f13777d, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, l lVar, l lVar2) {
            return com.google.android.gms.internal.ads.a.a(f13774a, aVar, f13776c, lVar, lVar2);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        com.google.common.util.concurrent.a.e d(com.google.common.util.concurrent.a<?> r3, com.google.common.util.concurrent.a.e r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.common.util.concurrent.a$e r0 = r3.f13755i
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.a(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.k.d(com.google.common.util.concurrent.a, com.google.common.util.concurrent.a$e):com.google.common.util.concurrent.a$e");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        com.google.common.util.concurrent.a.l e(com.google.common.util.concurrent.a<?> r3, com.google.common.util.concurrent.a.l r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.common.util.concurrent.a$l r0 = r3.f13756j
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.c(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.k.e(com.google.common.util.concurrent.a, com.google.common.util.concurrent.a$l):com.google.common.util.concurrent.a$l");
        }

        /* access modifiers changed from: package-private */
        public void f(l lVar, l lVar2) {
            f13774a.putObject(lVar, f13779f, lVar2);
        }

        /* access modifiers changed from: package-private */
        public void g(l lVar, Thread thread) {
            f13774a.putObject(lVar, f13778e, thread);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class l {

        /* renamed from: c  reason: collision with root package name */
        static final l f13780c = new l(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f13781a;

        /* renamed from: b  reason: collision with root package name */
        volatile l f13782b;

        l(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void a(l lVar) {
            a.f13752m.f(this, lVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f13781a;
            if (thread != null) {
                this.f13781a = null;
                LockSupport.unpark(thread);
            }
        }

        l() {
            a.f13752m.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        b bVar;
        Class<l> cls = l.class;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f13750k = z10;
        Throwable th = null;
        try {
            bVar = new k();
            th = null;
        } catch (Throwable th2) {
            bVar = new h();
            th = th2;
        }
        f13752m = bVar;
        Class<LockSupport> cls2 = LockSupport.class;
        if (th != null) {
            Logger logger = f13751l;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    protected a() {
    }

    private void k(StringBuilder sb) {
        try {
            Object v10 = v(this);
            sb.append("SUCCESS, result=[");
            n(sb, v10);
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

    private void l(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f13754h;
        if (obj instanceof g) {
            sb.append(", setFuture=[");
            o(sb, ((g) obj).f13773i);
            sb.append("]");
        } else {
            try {
                str = t.a(x());
            } catch (RuntimeException | StackOverflowError e10) {
                String valueOf = String.valueOf(e10.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(valueOf);
                str = sb2.toString();
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            k(sb);
        }
    }

    private void n(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void o(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e10) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e10.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    private static CancellationException p(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e q(e eVar) {
        e eVar2 = eVar;
        e d10 = f13752m.d(this, e.f13763d);
        while (d10 != null) {
            e eVar3 = d10.f13766c;
            d10.f13766c = eVar2;
            eVar2 = d10;
            d10 = eVar3;
        }
        return eVar2;
    }

    /* access modifiers changed from: private */
    public static void r(a<?> aVar) {
        e eVar = null;
        a<V> aVar2 = aVar;
        while (true) {
            aVar2.y();
            aVar2.m();
            e q10 = aVar2.q(eVar);
            while (true) {
                if (q10 != null) {
                    eVar = q10.f13766c;
                    Runnable runnable = q10.f13764a;
                    Objects.requireNonNull(runnable);
                    Runnable runnable2 = runnable;
                    if (runnable2 instanceof g) {
                        g gVar = (g) runnable2;
                        a<V> aVar3 = gVar.f13772h;
                        if (aVar3.f13754h == gVar) {
                            if (f13752m.b(aVar3, gVar, u(gVar.f13773i))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = q10.f13765b;
                        Objects.requireNonNull(executor);
                        s(runnable2, executor);
                    }
                    q10 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f13751l;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), e10);
        }
    }

    private V t(Object obj) {
        if (obj instanceof c) {
            throw p("Task was cancelled.", ((c) obj).f13760b);
        } else if (!(obj instanceof d)) {
            return obj == f13753n ? f.a() : obj;
        } else {
            throw new ExecutionException(((d) obj).f13762a);
        }
    }

    /* access modifiers changed from: private */
    public static Object u(e<?> eVar) {
        Throwable a10;
        if (eVar instanceof i) {
            Object obj = ((a) eVar).f13754h;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f13759a) {
                    obj = cVar.f13760b != null ? new c(false, cVar.f13760b) : c.f13758d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((eVar instanceof o6.a) && (a10 = o6.b.a((o6.a) eVar)) != null) {
            return new d(a10);
        } else {
            boolean isCancelled = eVar.isCancelled();
            if ((!f13750k) && isCancelled) {
                c cVar2 = c.f13758d;
                Objects.requireNonNull(cVar2);
                return cVar2;
            }
            try {
                Object v10 = v(eVar);
                if (!isCancelled) {
                    return v10 == null ? f13753n : v10;
                }
                String valueOf = String.valueOf(eVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new c(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e10) {
                if (!isCancelled) {
                    return new d(e10.getCause());
                }
                String valueOf2 = String.valueOf(eVar);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new c(false, new IllegalArgumentException(sb2.toString(), e10));
            } catch (CancellationException e11) {
                if (isCancelled) {
                    return new c(false, e11);
                }
                String valueOf3 = String.valueOf(eVar);
                StringBuilder sb3 = new StringBuilder(valueOf3.length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new d(new IllegalArgumentException(sb3.toString(), e11));
            } catch (Throwable th) {
                return new d(th);
            }
        }
    }

    private static <V> V v(Future<V> future) {
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

    private void y() {
        for (l e10 = f13752m.e(this, l.f13780c); e10 != null; e10 = e10.f13782b) {
            e10.b();
        }
    }

    private void z(l lVar) {
        lVar.f13781a = null;
        while (true) {
            l lVar2 = this.f13756j;
            if (lVar2 != l.f13780c) {
                l lVar3 = null;
                while (lVar2 != null) {
                    l lVar4 = lVar2.f13782b;
                    if (lVar2.f13781a != null) {
                        lVar3 = lVar2;
                    } else if (lVar3 != null) {
                        lVar3.f13782b = lVar4;
                        if (lVar3.f13781a == null) {
                        }
                    } else if (!f13752m.c(this, lVar2, lVar4)) {
                    }
                    lVar2 = lVar4;
                }
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: protected */
    public boolean A(V v10) {
        if (v10 == null) {
            v10 = f13753n;
        }
        if (!f13752m.b(this, (Object) null, v10)) {
            return false;
        }
        r(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean B(Throwable th) {
        if (!f13752m.b(this, (Object) null, new d((Throwable) p.j(th)))) {
            return false;
        }
        r(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f13754h;
        if (obj instanceof d) {
            return ((d) obj).f13762a;
        }
        return null;
    }

    public void addListener(Runnable runnable, Executor executor) {
        e eVar;
        p.k(runnable, "Runnable was null.");
        p.k(executor, "Executor was null.");
        if (isDone() || (eVar = this.f13755i) == e.f13763d) {
            s(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f13766c = eVar;
            if (!f13752m.a(this, eVar, eVar2)) {
                eVar = this.f13755i;
            } else {
                return;
            }
        } while (eVar != e.f13763d);
        s(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.e<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f13754h
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.common.util.concurrent.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0064
            boolean r3 = f13750k
            if (r3 == 0) goto L_0x001f
            com.google.common.util.concurrent.a$c r3 = new com.google.common.util.concurrent.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.common.util.concurrent.a$c r3 = com.google.common.util.concurrent.a.c.f13757c
            goto L_0x0026
        L_0x0024:
            com.google.common.util.concurrent.a$c r3 = com.google.common.util.concurrent.a.c.f13758d
        L_0x0026:
            java.util.Objects.requireNonNull(r3)
        L_0x0029:
            r5 = 0
            r4 = r7
        L_0x002b:
            com.google.common.util.concurrent.a$b r6 = f13752m
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x005c
            if (r8 == 0) goto L_0x0038
            r4.w()
        L_0x0038:
            r(r4)
            boolean r4 = r0 instanceof com.google.common.util.concurrent.a.g
            if (r4 == 0) goto L_0x0065
            com.google.common.util.concurrent.a$g r0 = (com.google.common.util.concurrent.a.g) r0
            com.google.common.util.concurrent.e<? extends V> r0 = r0.f13773i
            boolean r4 = r0 instanceof com.google.common.util.concurrent.a.i
            if (r4 == 0) goto L_0x0058
            r4 = r0
            com.google.common.util.concurrent.a r4 = (com.google.common.util.concurrent.a) r4
            java.lang.Object r0 = r4.f13754h
            if (r0 != 0) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            boolean r6 = r0 instanceof com.google.common.util.concurrent.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0065
            r5 = 1
            goto L_0x002b
        L_0x0058:
            r0.cancel(r8)
            goto L_0x0065
        L_0x005c:
            java.lang.Object r0 = r4.f13754h
            boolean r6 = r0 instanceof com.google.common.util.concurrent.a.g
            if (r6 != 0) goto L_0x002b
            r1 = r5
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.cancel(boolean):boolean");
    }

    public V get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f13754h;
            if ((obj != null) && (!(obj instanceof g))) {
                return t(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                l lVar = this.f13756j;
                if (lVar != l.f13780c) {
                    l lVar2 = new l();
                    do {
                        lVar2.a(lVar);
                        if (f13752m.c(this, lVar, lVar2)) {
                            do {
                                g.a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f13754h;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return t(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    z(lVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            z(lVar2);
                        } else {
                            lVar = this.f13756j;
                        }
                    } while (lVar != l.f13780c);
                }
                Object obj3 = this.f13754h;
                Objects.requireNonNull(obj3);
                return t(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f13754h;
                if ((obj4 != null) && (!(obj4 instanceof g))) {
                    return t(obj4);
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
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j11);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z10) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z10) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(aVar).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(aVar);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f13754h instanceof c;
    }

    public boolean isDone() {
        Object obj = this.f13754h;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            l(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void w() {
    }

    /* access modifiers changed from: protected */
    public String x() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    /* compiled from: AbstractFuture */
    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f13763d = new e();

        /* renamed from: a  reason: collision with root package name */
        final Runnable f13764a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f13765b;

        /* renamed from: c  reason: collision with root package name */
        e f13766c;

        e(Runnable runnable, Executor executor) {
            this.f13764a = runnable;
            this.f13765b = executor;
        }

        e() {
            this.f13764a = null;
            this.f13765b = null;
        }
    }

    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f13754h;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return t(obj2);
            }
            l lVar = this.f13756j;
            if (lVar != l.f13780c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f13752m.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f13754h;
                            } else {
                                z(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return t(obj);
                    }
                    lVar = this.f13756j;
                } while (lVar != l.f13780c);
            }
            Object obj3 = this.f13754h;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        throw new InterruptedException();
    }
}
