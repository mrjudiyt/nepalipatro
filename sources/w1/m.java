package w1;

import android.content.Context;
import androidx.work.e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.c;
import androidx.work.r;
import androidx.work.v;
import java.util.UUID;
import v1.p;

/* compiled from: WorkProgressUpdater */
public class m implements r {

    /* renamed from: c  reason: collision with root package name */
    static final String f12647c = androidx.work.m.f("WorkProgressUpdater");

    /* renamed from: a  reason: collision with root package name */
    final WorkDatabase f12648a;

    /* renamed from: b  reason: collision with root package name */
    final x1.a f12649b;

    /* compiled from: WorkProgressUpdater */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ UUID f12650h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f12651i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c f12652j;

        a(UUID uuid, e eVar, c cVar) {
            this.f12650h = uuid;
            this.f12651i = eVar;
            this.f12652j = cVar;
        }

        public void run() {
            String uuid = this.f12650h.toString();
            androidx.work.m c10 = androidx.work.m.c();
            String str = m.f12647c;
            c10.a(str, String.format("Updating progress for %s (%s)", new Object[]{this.f12650h, this.f12651i}), new Throwable[0]);
            m.this.f12648a.c();
            try {
                p n10 = m.this.f12648a.B().n(uuid);
                if (n10 != null) {
                    if (n10.f12256b == v.a.RUNNING) {
                        m.this.f12648a.A().b(new v1.m(uuid, this.f12651i));
                    } else {
                        androidx.work.m.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", new Object[]{uuid}), new Throwable[0]);
                    }
                    this.f12652j.o(null);
                    m.this.f12648a.r();
                    m.this.f12648a.g();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            } catch (Throwable th) {
                m.this.f12648a.g();
                throw th;
            }
        }
    }

    public m(WorkDatabase workDatabase, x1.a aVar) {
        this.f12648a = workDatabase;
        this.f12649b = aVar;
    }

    public com.google.common.util.concurrent.e<Void> a(Context context, UUID uuid, e eVar) {
        c s10 = c.s();
        this.f12649b.b(new a(uuid, eVar, s10));
        return s10;
    }
}
