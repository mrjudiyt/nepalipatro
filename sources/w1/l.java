package w1;

import android.content.Context;
import androidx.work.g;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.c;
import androidx.work.m;
import androidx.work.v;
import com.google.common.util.concurrent.e;
import java.util.UUID;
import v1.q;

/* compiled from: WorkForegroundUpdater */
public class l implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final String f12638d = m.f("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    private final x1.a f12639a;

    /* renamed from: b  reason: collision with root package name */
    final u1.a f12640b;

    /* renamed from: c  reason: collision with root package name */
    final q f12641c;

    /* compiled from: WorkForegroundUpdater */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f12642h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ UUID f12643i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g f12644j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Context f12645k;

        a(c cVar, UUID uuid, g gVar, Context context) {
            this.f12642h = cVar;
            this.f12643i = uuid;
            this.f12644j = gVar;
            this.f12645k = context;
        }

        public void run() {
            try {
                if (!this.f12642h.isCancelled()) {
                    String uuid = this.f12643i.toString();
                    v.a m10 = l.this.f12641c.m(uuid);
                    if (m10 == null || m10.a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    l.this.f12640b.a(uuid, this.f12644j);
                    this.f12645k.startService(androidx.work.impl.foreground.a.a(this.f12645k, uuid, this.f12644j));
                }
                this.f12642h.o(null);
            } catch (Throwable th) {
                this.f12642h.p(th);
            }
        }
    }

    public l(WorkDatabase workDatabase, u1.a aVar, x1.a aVar2) {
        this.f12640b = aVar;
        this.f12639a = aVar2;
        this.f12641c = workDatabase.B();
    }

    public e<Void> a(Context context, UUID uuid, g gVar) {
        c s10 = c.s();
        this.f12639a.b(new a(s10, uuid, gVar, context));
        return s10;
    }
}
