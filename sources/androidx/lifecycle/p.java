package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.m;

/* compiled from: LifecycleService.kt */
public class p extends Service implements m {

    /* renamed from: h  reason: collision with root package name */
    private final f0 f3518h = new f0(this);

    public h getLifecycle() {
        return this.f3518h.a();
    }

    public IBinder onBind(Intent intent) {
        m.f(intent, "intent");
        this.f3518h.b();
        return null;
    }

    public void onCreate() {
        this.f3518h.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f3518h.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i10) {
        this.f3518h.e();
        super.onStart(intent, i10);
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
