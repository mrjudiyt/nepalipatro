package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.m;
import o1.e;
import v1.p;

/* compiled from: SystemAlarmScheduler */
public class f implements e {

    /* renamed from: i  reason: collision with root package name */
    private static final String f4829i = m.f("SystemAlarmScheduler");

    /* renamed from: h  reason: collision with root package name */
    private final Context f4830h;

    public f(Context context) {
        this.f4830h = context.getApplicationContext();
    }

    private void b(p pVar) {
        m.c().a(f4829i, String.format("Scheduling work with workSpecId %s", new Object[]{pVar.f12255a}), new Throwable[0]);
        this.f4830h.startService(b.f(this.f4830h, pVar.f12255a));
    }

    public boolean a() {
        return true;
    }

    public void d(String str) {
        this.f4830h.startService(b.g(this.f4830h, str));
    }

    public void f(p... pVarArr) {
        for (p b10 : pVarArr) {
            b(b10);
        }
    }
}
