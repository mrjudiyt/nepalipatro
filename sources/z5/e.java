package z5;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: BandwidthMeter */
public interface e {

    /* compiled from: BandwidthMeter */
    public interface a {

        /* renamed from: z5.e$a$a  reason: collision with other inner class name */
        /* compiled from: BandwidthMeter */
        public static final class C0222a {

            /* renamed from: a  reason: collision with root package name */
            private final CopyOnWriteArrayList<C0223a> f13198a = new CopyOnWriteArrayList<>();

            /* renamed from: z5.e$a$a$a  reason: collision with other inner class name */
            /* compiled from: BandwidthMeter */
            private static final class C0223a {
                /* access modifiers changed from: private */

                /* renamed from: a  reason: collision with root package name */
                public final Handler f13199a;
                /* access modifiers changed from: private */

                /* renamed from: b  reason: collision with root package name */
                public final a f13200b;
                /* access modifiers changed from: private */

                /* renamed from: c  reason: collision with root package name */
                public boolean f13201c;

                public C0223a(Handler handler, a aVar) {
                    this.f13199a = handler;
                    this.f13200b = aVar;
                }

                public void d() {
                    this.f13201c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                a6.a.e(handler);
                a6.a.e(aVar);
                e(aVar);
                this.f13198a.add(new C0223a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                Iterator<C0223a> it = this.f13198a.iterator();
                while (it.hasNext()) {
                    C0223a next = it.next();
                    if (!next.f13201c) {
                        next.f13199a.post(new d(next, i10, j10, j11));
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C0223a> it = this.f13198a.iterator();
                while (it.hasNext()) {
                    C0223a next = it.next();
                    if (next.f13200b == aVar) {
                        next.d();
                        this.f13198a.remove(next);
                    }
                }
            }
        }

        void A(int i10, long j10, long j11);
    }

    long a();

    void d(Handler handler, a aVar);

    r e();

    long f();

    void g(a aVar);
}
