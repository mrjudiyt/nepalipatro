package androidx.work.impl;

import android.content.Context;
import androidx.room.g;
import androidx.room.h;
import androidx.work.impl.a;
import e1.c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import v1.e;
import v1.k;
import v1.n;
import v1.q;
import v1.t;

public abstract class WorkDatabase extends h {

    /* renamed from: l  reason: collision with root package name */
    private static final long f4764l = TimeUnit.DAYS.toMillis(1);

    class a implements c.C0129c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f4765a;

        a(Context context) {
            this.f4765a = context;
        }

        public c a(c.b bVar) {
            c.b.a a10 = c.b.a(this.f4765a);
            a10.c(bVar.f7976b).b(bVar.f7977c).d(true);
            return new f1.c().a(a10.a());
        }
    }

    class b extends h.b {
        b() {
        }

        public void c(e1.b bVar) {
            super.c(bVar);
            bVar.k();
            try {
                bVar.t(WorkDatabase.w());
                bVar.O();
            } finally {
                bVar.a0();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z10) {
        h.a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z10) {
            aVar = g.c(context, cls).c();
        } else {
            aVar = g.a(context, cls, o1.h.d());
            aVar.f(new a(context));
        }
        return aVar.g(executor).a(u()).b(a.f4774a).b(new a.h(context, 2, 3)).b(a.f4775b).b(a.f4776c).b(new a.h(context, 5, 6)).b(a.f4777d).b(a.f4778e).b(a.f4779f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(a.f4780g).e().d();
    }

    static h.b u() {
        return new b();
    }

    static long v() {
        return System.currentTimeMillis() - f4764l;
    }

    static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract v1.b t();

    public abstract e x();

    public abstract v1.h y();

    public abstract k z();
}
