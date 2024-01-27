package np.com.nepalipatro.helpers;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: Debug.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16048a = new a((kotlin.jvm.internal.g) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static boolean f16049b = true;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, Boolean> f16050c = new HashMap();

    /* compiled from: Debug.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final boolean a() {
            return g.f16049b;
        }

        public final void b(String str) {
            if (a()) {
                Map b10 = g.f16050c;
                Boolean bool = Boolean.TRUE;
                b10.put("np.com.nepalipatro.firebase.MessagingService", bool);
                g.f16050c.put("np.com.nepalipatro.notification.AppNotification", bool);
                g.f16050c.put("np.com.nepalipatro.notification.NotificationActionReceiver", bool);
                g.f16050c.put("np.com.nepalipatro.notification.AppNotifications", bool);
                g.f16050c.put("np.com.nepalipatro.notification.NotificationIntentService", bool);
                g.f16050c.put("np.com.nepalipatro.widget.Widget1x1", bool);
                g.f16050c.put("np.com.nepalipatro.widget.Widget1x4", bool);
                g.f16050c.put("np.com.nepalipatro.widget.Widget2x4", bool);
                g.f16050c.put("np.com.nepalipatro.AppService", bool);
                g.f16050c.put("np.com.nepalipatro.widget.LSWidget1x4", bool);
                g.f16050c.put("np.com.nepalipatro.fragment.CalendarTodayFragment", bool);
                g.f16050c.put("np.com.nepalipatro.fragment.CalendarMonthFragment$FCLoader", bool);
                g.f16050c.put("np.com.nepalipatro.adapters.CalendarGridAdapterForDashBoard", bool);
                g.f16050c.put("np.com.nepalipatro.fragment.CalendarTodayFragment", bool);
                g.f16050c.put("np.com.nepalipatro.fragment.CalendarFragment$ViewPagerAdapte", bool);
                g.f16050c.put("np.com.nepalipatro.fragment.CalendarTodayFragment", bool);
                g.f16050c.put("np.com.nepalipatro.utils.GTracker", bool);
                g.f16050c.put("np.com.nepalipatro.fragment.CalendarFragment$ViewPagerAdapter", bool);
                g.f16050c.put("np.com.nepalipatro.fragment.CalendarMonthFragment", bool);
                g.f16050c.put("np.com.nepalipatro.news.RefreshService", bool);
                g.f16050c.put("np.com.nepalipatro.am", bool);
                g.f16050c.put("np.com.nepalipatro.news.NewsFragment", bool);
                String className = new Exception().getStackTrace()[1].getClassName();
                String methodName = new Exception().getStackTrace()[1].getMethodName();
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(className);
                    sb.append(" : ");
                    sb.append(methodName);
                } else if (g.f16050c.containsKey(className)) {
                    Object obj = g.f16050c.get(className);
                    m.c(obj);
                    if (((Boolean) obj).booleanValue()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(className);
                        sb2.append(" : ");
                        sb2.append(methodName);
                        sb2.append(" : ");
                        sb2.append(str);
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(className);
                    sb3.append(" : ");
                    sb3.append(methodName);
                    sb3.append(" : ");
                    sb3.append(str);
                }
            }
        }
    }
}
