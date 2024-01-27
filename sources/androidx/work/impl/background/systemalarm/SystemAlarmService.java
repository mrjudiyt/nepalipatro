package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.p;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.m;
import w1.j;

public class SystemAlarmService extends p implements e.c {

    /* renamed from: k  reason: collision with root package name */
    private static final String f4790k = m.f("SystemAlarmService");

    /* renamed from: i  reason: collision with root package name */
    private e f4791i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4792j;

    private void e() {
        e eVar = new e(this);
        this.f4791i = eVar;
        eVar.m(this);
    }

    public void a() {
        this.f4792j = true;
        m.c().a(f4790k, "All commands completed in dispatcher", new Throwable[0]);
        j.a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        e();
        this.f4792j = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4792j = true;
        this.f4791i.j();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4792j) {
            m.c().d(f4790k, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f4791i.j();
            e();
            this.f4792j = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4791i.a(intent, i11);
        return 3;
    }
}
