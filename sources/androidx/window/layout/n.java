package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import m1.h;
import o8.q;

/* compiled from: SidecarWindowBackend.kt */
public final class n implements p {

    /* renamed from: c  reason: collision with root package name */
    public static final a f4642c = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static volatile n f4643d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final ReentrantLock f4644e = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    private g f4645a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<c> f4646b = new CopyOnWriteArrayList<>();

    /* compiled from: SidecarWindowBackend.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final n a(Context context) {
            m.f(context, "context");
            if (n.f4643d == null) {
                ReentrantLock d10 = n.f4644e;
                d10.lock();
                try {
                    if (n.f4643d == null) {
                        n.f4643d = new n(n.f4642c.b(context));
                    }
                    q qVar = q.f16189a;
                } finally {
                    d10.unlock();
                }
            }
            n c10 = n.f4643d;
            m.c(c10);
            return c10;
        }

        public final g b(Context context) {
            m.f(context, "context");
            try {
                if (!c(SidecarCompat.f4579f.c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (!sidecarCompat.l()) {
                    return null;
                }
                return sidecarCompat;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean c(h hVar) {
            return hVar != null && hVar.compareTo(h.f10179m.a()) >= 0;
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    public final class b implements g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f4647a;

        public b(n nVar) {
            m.f(nVar, "this$0");
            this.f4647a = nVar;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void a(Activity activity, u uVar) {
            m.f(activity, "activity");
            m.f(uVar, "newLayout");
            Iterator<c> it = this.f4647a.h().iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (m.a(next.d(), activity)) {
                    next.b(uVar);
                }
            }
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f4648a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f4649b;

        /* renamed from: c  reason: collision with root package name */
        private final androidx.core.util.a<u> f4650c;

        /* renamed from: d  reason: collision with root package name */
        private u f4651d;

        public c(Activity activity, Executor executor, androidx.core.util.a<u> aVar) {
            m.f(activity, "activity");
            m.f(executor, "executor");
            m.f(aVar, "callback");
            this.f4648a = activity;
            this.f4649b = executor;
            this.f4650c = aVar;
        }

        /* access modifiers changed from: private */
        public static final void c(c cVar, u uVar) {
            m.f(cVar, "this$0");
            m.f(uVar, "$newLayoutInfo");
            cVar.f4650c.accept(uVar);
        }

        public final void b(u uVar) {
            m.f(uVar, "newLayoutInfo");
            this.f4651d = uVar;
            this.f4649b.execute(new o(this, uVar));
        }

        public final Activity d() {
            return this.f4648a;
        }

        public final androidx.core.util.a<u> e() {
            return this.f4650c;
        }

        public final u f() {
            return this.f4651d;
        }
    }

    public n(g gVar) {
        this.f4645a = gVar;
        g gVar2 = this.f4645a;
        if (gVar2 != null) {
            gVar2.b(new b(this));
        }
    }

    private final void f(Activity activity) {
        g gVar;
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f4646b;
        boolean z10 = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (m.a(((c) it.next()).d(), activity)) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z10 && (gVar = this.f4645a) != null) {
            gVar.c(activity);
        }
    }

    private final boolean i(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f4646b;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (c d10 : copyOnWriteArrayList) {
            if (m.a(d10.d(), activity)) {
                return true;
            }
        }
        return false;
    }

    public void a(androidx.core.util.a<u> aVar) {
        m.f(aVar, "callback");
        synchronized (f4644e) {
            if (g() != null) {
                ArrayList<c> arrayList = new ArrayList<>();
                Iterator<c> it = h().iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.e() == aVar) {
                        m.e(next, "callbackWrapper");
                        arrayList.add(next);
                    }
                }
                h().removeAll(arrayList);
                for (c d10 : arrayList) {
                    f(d10.d());
                }
                q qVar = q.f16189a;
            }
        }
    }

    public void b(Activity activity, Executor executor, androidx.core.util.a<u> aVar) {
        u uVar;
        T t10;
        m.f(activity, "activity");
        m.f(executor, "executor");
        m.f(aVar, "callback");
        ReentrantLock reentrantLock = f4644e;
        reentrantLock.lock();
        try {
            g g10 = g();
            if (g10 == null) {
                aVar.accept(new u(p.e()));
                return;
            }
            boolean i10 = i(activity);
            c cVar = new c(activity, executor, aVar);
            h().add(cVar);
            if (!i10) {
                g10.a(activity);
            } else {
                Iterator<T> it = h().iterator();
                while (true) {
                    uVar = null;
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (m.a(activity, ((c) t10).d())) {
                        break;
                    }
                }
                c cVar2 = (c) t10;
                if (cVar2 != null) {
                    uVar = cVar2.f();
                }
                if (uVar != null) {
                    cVar.b(uVar);
                }
            }
            q qVar = q.f16189a;
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final g g() {
        return this.f4645a;
    }

    public final CopyOnWriteArrayList<c> h() {
        return this.f4646b;
    }
}
