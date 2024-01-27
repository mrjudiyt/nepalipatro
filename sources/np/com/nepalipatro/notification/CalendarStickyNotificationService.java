package np.com.nepalipatro.notification;

import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.s;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.d;
import np.com.nepalipatro.helpers.l;

/* compiled from: CalendarStickyNotificationService.kt */
public final class CalendarStickyNotificationService extends Service {

    /* renamed from: h  reason: collision with root package name */
    private a f16157h = new a();

    /* compiled from: CalendarStickyNotificationService.kt */
    public final class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            m.f(context, "context");
            m.f(intent, "intent");
            if (l.f16129a.o(context)) {
                CalendarStickyNotificationService.this.c();
            }
        }
    }

    private final void b() {
        s.a(this, AppNotifications.f16131h.n(), new AppNotifications(this, (Service) null, 2, (g) null).s(true), 1073741824);
    }

    /* access modifiers changed from: private */
    public final void c() {
        try {
            Object systemService = getSystemService("notification");
            NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
            if (notificationManager != null) {
                notificationManager.notify(AppNotifications.f16131h.n(), new AppNotifications(this, (Service) null, 2, (g) null).s(true));
            }
        } catch (Exception e10) {
            String.valueOf(e10);
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        b();
        registerReceiver(this.f16157h, d.f15947a.k());
    }

    public void onDestroy() {
        unregisterReceiver(this.f16157h);
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        c();
        return 1;
    }
}
