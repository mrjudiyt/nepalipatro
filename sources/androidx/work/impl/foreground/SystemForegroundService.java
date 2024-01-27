package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.p;
import androidx.work.impl.foreground.a;
import androidx.work.m;

public class SystemForegroundService extends p implements a.b {

    /* renamed from: m  reason: collision with root package name */
    private static final String f4835m = m.f("SystemFgService");

    /* renamed from: n  reason: collision with root package name */
    private static SystemForegroundService f4836n = null;

    /* renamed from: i  reason: collision with root package name */
    private Handler f4837i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4838j;

    /* renamed from: k  reason: collision with root package name */
    a f4839k;

    /* renamed from: l  reason: collision with root package name */
    NotificationManager f4840l;

    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f4841h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Notification f4842i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f4843j;

        a(int i10, Notification notification, int i11) {
            this.f4841h = i10;
            this.f4842i = notification;
            this.f4843j = i11;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f4841h, this.f4842i, this.f4843j);
            } else {
                SystemForegroundService.this.startForeground(this.f4841h, this.f4842i);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f4845h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Notification f4846i;

        b(int i10, Notification notification) {
            this.f4845h = i10;
            this.f4846i = notification;
        }

        public void run() {
            SystemForegroundService.this.f4840l.notify(this.f4845h, this.f4846i);
        }
    }

    class c implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f4848h;

        c(int i10) {
            this.f4848h = i10;
        }

        public void run() {
            SystemForegroundService.this.f4840l.cancel(this.f4848h);
        }
    }

    private void e() {
        this.f4837i = new Handler(Looper.getMainLooper());
        this.f4840l = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f4839k = aVar;
        aVar.m(this);
    }

    public void b(int i10, int i11, Notification notification) {
        this.f4837i.post(new a(i10, notification, i11));
    }

    public void c(int i10, Notification notification) {
        this.f4837i.post(new b(i10, notification));
    }

    public void d(int i10) {
        this.f4837i.post(new c(i10));
    }

    public void onCreate() {
        super.onCreate();
        f4836n = this;
        e();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4839k.k();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4838j) {
            m.c().d(f4835m, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f4839k.k();
            e();
            this.f4838j = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4839k.l(intent);
        return 3;
    }

    public void stop() {
        this.f4838j = true;
        m.c().a(f4835m, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f4836n = null;
        stopSelf();
    }
}
