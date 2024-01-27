package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.m;
import java.util.HashMap;
import java.util.Map;
import v1.p;

/* compiled from: CommandHandler */
public class b implements o1.b {

    /* renamed from: k  reason: collision with root package name */
    private static final String f4794k = m.f("CommandHandler");

    /* renamed from: h  reason: collision with root package name */
    private final Context f4795h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, o1.b> f4796i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private final Object f4797j = new Object();

    b(Context context) {
        this.f4795h = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent d(Context context, String str, boolean z10) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return intent;
    }

    static Intent e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void h(Intent intent, int i10, e eVar) {
        m.c().a(f4794k, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new c(this.f4795h, i10, eVar).a();
    }

    private void i(Intent intent, int i10, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f4797j) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            m c10 = m.c();
            String str = f4794k;
            c10.a(str, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f4796i.containsKey(string)) {
                d dVar = new d(this.f4795h, i10, string, eVar);
                this.f4796i.put(string, dVar);
                dVar.f();
            } else {
                m.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    private void j(Intent intent, int i10) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        m.c().a(f4794k, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i10)}), new Throwable[0]);
        c(string, z10);
    }

    private void k(Intent intent, int i10, e eVar) {
        m.c().a(f4794k, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i10)}), new Throwable[0]);
        eVar.g().u();
    }

    private void l(Intent intent, int i10, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        m c10 = m.c();
        String str = f4794k;
        c10.a(str, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase q10 = eVar.g().q();
        q10.c();
        try {
            p n10 = q10.B().n(string);
            if (n10 == null) {
                m c11 = m.c();
                c11.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (n10.f12256b.a()) {
                m c12 = m.c();
                c12.h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                q10.g();
            } else {
                long a10 = n10.a();
                if (!n10.b()) {
                    m.c().a(str, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a10)}), new Throwable[0]);
                    a.c(this.f4795h, eVar.g(), string, a10);
                } else {
                    m.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a10)}), new Throwable[0]);
                    a.c(this.f4795h, eVar.g(), string, a10);
                    eVar.k(new e.b(eVar, a(this.f4795h), i10));
                }
                q10.r();
                q10.g();
            }
        } finally {
            q10.g();
        }
    }

    private void m(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        m.c().a(f4794k, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        eVar.g().z(string);
        a.a(this.f4795h, eVar.g(), string);
        eVar.c(string, false);
    }

    private static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public void c(String str, boolean z10) {
        synchronized (this.f4797j) {
            o1.b remove = this.f4796i.remove(str);
            if (remove != null) {
                remove.c(str, z10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        boolean z10;
        synchronized (this.f4797j) {
            z10 = !this.f4796i.isEmpty();
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void p(Intent intent, int i10, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i10, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i10, eVar);
        } else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            m.c().b(f4794k, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i10, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i10, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i10);
        } else {
            m.c().h(f4794k, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }
}
