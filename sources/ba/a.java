package ba;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.m;

/* compiled from: NotificationChannels.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13335a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f13336b = "channel_id_calendar";

    /* renamed from: c  reason: collision with root package name */
    private static final String f13337c = "channel_id_rashifal";

    /* renamed from: d  reason: collision with root package name */
    private static final String f13338d = "channel_id_push";

    /* renamed from: e  reason: collision with root package name */
    private static final String f13339e = "channel_id_push";

    /* renamed from: f  reason: collision with root package name */
    private static final String f13340f = "channel_id_news";

    /* renamed from: g  reason: collision with root package name */
    private static final String f13341g = "bundled_id";

    /* renamed from: h  reason: collision with root package name */
    private static final String f13342h = "Calendar Notifications";

    /* renamed from: i  reason: collision with root package name */
    private static final String f13343i = "Rashifal Notifications";

    /* renamed from: j  reason: collision with root package name */
    private static final String f13344j = "My Events Notifications";

    /* renamed from: k  reason: collision with root package name */
    private static final String f13345k = "Load Shedding Notifications";

    /* renamed from: l  reason: collision with root package name */
    private static final String f13346l = "News Notifications";

    /* renamed from: m  reason: collision with root package name */
    private static final String f13347m = "Miscellaneous";

    private a() {
    }

    private final void b(Context context, int i10, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i10);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(1);
            Object systemService = context.getSystemService("notification");
            m.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            try {
                notificationManager.deleteNotificationChannel("channel_id_new");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public final void a(Context context) {
        m.f(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            b(context, 4, f13336b, f13342h);
        }
    }

    public final void c(Context context) {
        m.f(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            b(context, 3, f13336b, f13342h);
        }
    }

    public final void d(Context context) {
        m.f(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            b(context, 2, f13341g, f13347m);
        }
    }

    public final void e(Context context) {
        m.f(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            b(context, 3, f13338d, f13344j);
        }
    }

    public final void f(Context context) {
        m.f(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            b(context, 3, f13337c, f13343i);
        }
    }

    public final String g() {
        return f13341g;
    }

    public final String h() {
        return f13336b;
    }

    public final String i() {
        return f13338d;
    }

    public final String j() {
        return f13337c;
    }
}
