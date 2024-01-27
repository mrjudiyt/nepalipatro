package o1;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.m;
import java.util.List;
import q1.b;
import v1.p;
import v1.q;
import w1.d;

/* compiled from: Schedulers */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10306a = m.f("Schedulers");

    static e a(Context context, i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            b bVar = new b(context, iVar);
            d.a(context, SystemJobService.class, true);
            m.c().a(f10306a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        e c10 = c(context);
        if (c10 != null) {
            return c10;
        }
        androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
        d.a(context, SystemAlarmService.class, true);
        m.c().a(f10306a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List<e> list) {
        if (list != null && list.size() != 0) {
            q B = workDatabase.B();
            workDatabase.c();
            try {
                List<p> f10 = B.f(bVar.h());
                List<p> t10 = B.t(200);
                if (f10 != null && f10.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (p pVar : f10) {
                        B.c(pVar.f12255a, currentTimeMillis);
                    }
                }
                workDatabase.r();
                if (f10 != null && f10.size() > 0) {
                    p[] pVarArr = (p[]) f10.toArray(new p[f10.size()]);
                    for (e next : list) {
                        if (next.a()) {
                            next.f(pVarArr);
                        }
                    }
                }
                if (t10 != null && t10.size() > 0) {
                    p[] pVarArr2 = (p[]) t10.toArray(new p[t10.size()]);
                    for (e next2 : list) {
                        if (!next2.a()) {
                            next2.f(pVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.g();
            }
        }
    }

    private static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            m.c().a(f10306a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            m.c().a(f10306a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
