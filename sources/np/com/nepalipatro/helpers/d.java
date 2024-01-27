package np.com.nepalipatro.helpers;

import android.content.IntentFilter;
import kotlin.jvm.internal.g;

/* compiled from: ConstantAppIntents.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15947a = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f15948b = "android.appwidget.action.APPWIDGET_ENABLED";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f15949c = "android.appwidget.action.APPWIDGET_UPDATE";

    /* renamed from: d  reason: collision with root package name */
    private static final String f15950d = "np.com.nepalipatro.date.change";

    /* renamed from: e  reason: collision with root package name */
    private static final String f15951e = "np.com.nepalipatro.time.change";
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String f15952f = "np.com.nepalipatro.widget.calendarwidget.click";
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final String f15953g = "np.com.nepalipatro.widget.calendarwidget.date.click";

    /* renamed from: h  reason: collision with root package name */
    private static final String f15954h = "np.com.nepalipatro.widget.lswidget1x4.click";
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final String f15955i = "np.com.nepalipatro.widget.widget1x1.click";
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String f15956j = "np.com.nepalipatro.widget.widget1x4.click";
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final String f15957k = "np.com.nepalipatro.widget.widget2x4.click";
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final String f15958l = "np.com.nepalipatro.widget.news.icon.click";
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String f15959m = "np.com.nepalipatro.widget.news.item.click";
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final String f15960n = "np.com.nepalipatro.alarm.trigger";

    /* compiled from: ConstantAppIntents.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a() {
            return d.f15960n;
        }

        public final String b() {
            return d.f15948b;
        }

        public final String c() {
            return d.f15949c;
        }

        public final String d() {
            return d.f15955i;
        }

        public final String e() {
            return d.f15956j;
        }

        public final String f() {
            return d.f15957k;
        }

        public final String g() {
            return d.f15952f;
        }

        public final String h() {
            return d.f15953g;
        }

        public final String i() {
            return d.f15958l;
        }

        public final String j() {
            return d.f15959m;
        }

        public final IntentFilter k() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_TICK");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.DATE_CHANGED");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            return intentFilter;
        }
    }
}
