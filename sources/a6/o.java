package a6;

import a6.i;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ListenerSet */
public final class o<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b f223a;

    /* renamed from: b  reason: collision with root package name */
    private final k f224b;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f225c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f226d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<Runnable> f227e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<Runnable> f228f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f229g;

    /* compiled from: ListenerSet */
    public interface a<T> {
        void invoke(T t10);
    }

    /* compiled from: ListenerSet */
    public interface b<T> {
        void a(T t10, i iVar);
    }

    /* compiled from: ListenerSet */
    private static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f230a;

        /* renamed from: b  reason: collision with root package name */
        private i.b f231b = new i.b();

        /* renamed from: c  reason: collision with root package name */
        private boolean f232c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f233d;

        public c(T t10) {
            this.f230a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (!this.f233d) {
                if (i10 != -1) {
                    this.f231b.a(i10);
                }
                this.f232c = true;
                aVar.invoke(this.f230a);
            }
        }

        public void b(b<T> bVar) {
            if (!this.f233d && this.f232c) {
                i e10 = this.f231b.e();
                this.f231b = new i.b();
                this.f232c = false;
                bVar.a(this.f230a, e10);
            }
        }

        public void c(b<T> bVar) {
            this.f233d = true;
            if (this.f232c) {
                bVar.a(this.f230a, this.f231b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f230a.equals(((c) obj).f230a);
        }

        public int hashCode() {
            return this.f230a.hashCode();
        }
    }

    public o(Looper looper, b bVar, b<T> bVar2) {
        this(new CopyOnWriteArraySet(), looper, bVar, bVar2);
    }

    /* access modifiers changed from: private */
    public boolean f(Message message) {
        Iterator<c<T>> it = this.f226d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f225c);
            if (this.f224b.e(0)) {
                return true;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(T t10) {
        if (!this.f229g) {
            a.e(t10);
            this.f226d.add(new c(t10));
        }
    }

    public o<T> d(Looper looper, b<T> bVar) {
        return new o<>(this.f226d, looper, this.f223a, bVar);
    }

    public void e() {
        if (!this.f228f.isEmpty()) {
            if (!this.f224b.e(0)) {
                k kVar = this.f224b;
                kVar.b(kVar.d(0));
            }
            boolean z10 = !this.f227e.isEmpty();
            this.f227e.addAll(this.f228f);
            this.f228f.clear();
            if (!z10) {
                while (!this.f227e.isEmpty()) {
                    this.f227e.peekFirst().run();
                    this.f227e.removeFirst();
                }
            }
        }
    }

    public void h(int i10, a<T> aVar) {
        this.f228f.add(new n(new CopyOnWriteArraySet(this.f226d), i10, aVar));
    }

    public void i() {
        Iterator<c<T>> it = this.f226d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f225c);
        }
        this.f226d.clear();
        this.f229g = true;
    }

    public void j(int i10, a<T> aVar) {
        h(i10, aVar);
        e();
    }

    private o(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, b bVar, b<T> bVar2) {
        this.f223a = bVar;
        this.f226d = copyOnWriteArraySet;
        this.f225c = bVar2;
        this.f227e = new ArrayDeque<>();
        this.f228f = new ArrayDeque<>();
        this.f224b = bVar.b(looper, new m(this));
    }
}
