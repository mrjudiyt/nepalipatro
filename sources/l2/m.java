package l2;

import a3.g;
import a3.k;
import java.util.Queue;

/* compiled from: ModelCache */
public class m<A, B> {

    /* renamed from: a  reason: collision with root package name */
    private final g<b<A>, B> f9912a;

    /* compiled from: ModelCache */
    class a extends g<b<A>, B> {
        a(long j10) {
            super(j10);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void j(b<A> bVar, B b10) {
            bVar.c();
        }
    }

    /* compiled from: ModelCache */
    static final class b<A> {

        /* renamed from: d  reason: collision with root package name */
        private static final Queue<b<?>> f9914d = k.f(0);

        /* renamed from: a  reason: collision with root package name */
        private int f9915a;

        /* renamed from: b  reason: collision with root package name */
        private int f9916b;

        /* renamed from: c  reason: collision with root package name */
        private A f9917c;

        private b() {
        }

        static <A> b<A> a(A a10, int i10, int i11) {
            b<A> poll;
            Queue<b<?>> queue = f9914d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new b<>();
            }
            poll.b(a10, i10, i11);
            return poll;
        }

        private void b(A a10, int i10, int i11) {
            this.f9917c = a10;
            this.f9916b = i10;
            this.f9915a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f9914d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f9916b == bVar.f9916b && this.f9915a == bVar.f9915a && this.f9917c.equals(bVar.f9917c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f9915a * 31) + this.f9916b) * 31) + this.f9917c.hashCode();
        }
    }

    public m(long j10) {
        this.f9912a = new a(j10);
    }

    public B a(A a10, int i10, int i11) {
        b a11 = b.a(a10, i10, i11);
        B g10 = this.f9912a.g(a11);
        a11.c();
        return g10;
    }

    public void b(A a10, int i10, int i11, B b10) {
        this.f9912a.k(b.a(a10, i10, i11), b10);
    }
}
