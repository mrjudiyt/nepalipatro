package np.com.nepalipatro.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.h;
import androidx.core.app.l;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.MainActivity;
import np.com.nepalipatro.R;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.f;
import np.com.nepalipatro.helpers.k;
import np.com.nepalipatro.helpers.l;
import org.json.JSONObject;
import y9.b;
import y9.c;

/* compiled from: AppNotifications.kt */
public final class AppNotifications {
    private static final String A = "np.com.nepalipatro.notification.sticky.enable";
    private static final String B = "np.com.nepalipatro.notification.sticky.disable";
    private static final String C = "np.com.nepalipatro.notification.gcm.clear";
    private static final String D = "np.com.nepalipatro.notification.rashifal.clear";
    private static final String E = "np.com.nepalipatro.notification.myevent.clear";
    /* access modifiers changed from: private */
    public static final String F = "np.com.nepalipatro.notification.sticky.clear";
    /* access modifiers changed from: private */
    public static final String G = "np.com.nepalipatro.notification.normal.clear";
    /* access modifiers changed from: private */
    public static final String H = "np.com.nepalipatro.notification.news.app.clear";
    private static final String I = "np.com.nepalipatro.notification.news.fcm.clear";
    /* access modifiers changed from: private */
    public static final String J = "np.com.nepalipatro.notification.sticky.click";
    /* access modifiers changed from: private */
    public static final String K = "np.com.nepalipatro.notification.normal.click";
    /* access modifiers changed from: private */
    public static final String L = "np.com.nepalipatro.notification.rashifal.click";
    private static final String M = "np.com.nepalipatro.notification.gcm.click";
    /* access modifiers changed from: private */
    public static final String N = "np.com.nepalipatro.notification.fcm.click";
    /* access modifiers changed from: private */
    public static final String O = "np.com.nepalipatro.notification.myevent.click";
    /* access modifiers changed from: private */
    public static final String P = "np.com.nepalipatro.notification.news.app.click";
    /* access modifiers changed from: private */
    public static final String Q = "np.com.nepalipatro.notification.news.fcm.click";
    private static final String R = "np.com.nepalipatro.notification.ls.sticy_on";
    private static final String S = "np.com.nepalipatro.notification.ls.sticky_off";
    private static final String T = "np.com.nepalipatro.notification.ls.group_change";
    private static final String U = "np.com.nepalipatro.notification.ls.area_change";
    /* access modifiers changed from: private */
    public static final String V = "np.com.nepalipatro.notification.ls.clear";
    /* access modifiers changed from: private */
    public static final String W = "np.com.nepalipatro.notification.ls.click";

    /* renamed from: h  reason: collision with root package name */
    public static final a f16131h = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static Boolean f16132i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static Boolean f16133j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static boolean f16134k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final int f16135l = 5001;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final int f16136m = 5001;

    /* renamed from: n  reason: collision with root package name */
    private static final int f16137n = 5002;

    /* renamed from: o  reason: collision with root package name */
    private static int f16138o = 5003;

    /* renamed from: p  reason: collision with root package name */
    private static final int f16139p = 5004;

    /* renamed from: q  reason: collision with root package name */
    private static final int f16140q = 5007;

    /* renamed from: r  reason: collision with root package name */
    private static final int f16141r = 5005;

    /* renamed from: s  reason: collision with root package name */
    private static final int f16142s = 5009;

    /* renamed from: t  reason: collision with root package name */
    private static final int f16143t = 5010;

    /* renamed from: u  reason: collision with root package name */
    private static final int f16144u = 5011;

    /* renamed from: v  reason: collision with root package name */
    private static final int f16145v = 5012;

    /* renamed from: w  reason: collision with root package name */
    private static final String f16146w = "NOTIFICATION_GROUP_NEWS";

    /* renamed from: x  reason: collision with root package name */
    private static final String f16147x = "NOTIFICATION_GROUP_RASHIFAL";

    /* renamed from: y  reason: collision with root package name */
    private static final String f16148y = "NOTIFICATION_GROUP_FCM";

    /* renamed from: z  reason: collision with root package name */
    private static final String f16149z = "NOTIFICATION_GROUP_EVENTS";

    /* renamed from: a  reason: collision with root package name */
    private final Context f16150a;

    /* renamed from: b  reason: collision with root package name */
    private final Service f16151b;

    /* renamed from: c  reason: collision with root package name */
    private final b f16152c;

    /* renamed from: d  reason: collision with root package name */
    private c f16153d;

    /* renamed from: e  reason: collision with root package name */
    private u9.a f16154e;

    /* renamed from: f  reason: collision with root package name */
    private Notification f16155f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicInteger f16156g;

    /* compiled from: AppNotifications.kt */
    public static final class NotificationBroadcastReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            m.f(context, "context");
            m.c(intent);
            h.d(context, AppNotificationsActionJobIntentservice.class, 0, intent);
        }
    }

    /* compiled from: AppNotifications.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a() {
            return AppNotifications.N;
        }

        public final String b() {
            return AppNotifications.V;
        }

        public final String c() {
            return AppNotifications.W;
        }

        public final String d() {
            return AppNotifications.O;
        }

        public final String e() {
            return AppNotifications.H;
        }

        public final String f() {
            return AppNotifications.P;
        }

        public final String g() {
            return AppNotifications.Q;
        }

        public final String h() {
            return AppNotifications.G;
        }

        public final String i() {
            return AppNotifications.K;
        }

        public final String j() {
            return AppNotifications.L;
        }

        public final String k() {
            return AppNotifications.F;
        }

        public final String l() {
            return AppNotifications.J;
        }

        public final int m() {
            return AppNotifications.f16136m;
        }

        public final int n() {
            return AppNotifications.f16135l;
        }

        public final Boolean o() {
            return AppNotifications.f16132i;
        }

        public final void p(Boolean bool) {
            AppNotifications.f16132i = bool;
        }

        public final void q(Boolean bool) {
            AppNotifications.f16133j = bool;
        }

        public final void r(boolean z10) {
            AppNotifications.f16134k = z10;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f16132i = bool;
        f16133j = bool;
    }

    public AppNotifications(Context context, Service service) {
        m.f(context, "mContext");
        this.f16150a = context;
        this.f16151b = service;
        this.f16152c = new b();
        this.f16153d = new c(context);
        this.f16154e = new u9.a(context);
        this.f16156g = new AtomicInteger(0);
    }

    private final PendingIntent t(Intent intent, String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            Intent intent2 = new Intent(this.f16150a, MainActivity.class);
            intent2.setAction(str);
            try {
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    m.c(extras);
                    intent2.putExtras(extras);
                }
            } catch (Exception e10) {
                if (np.com.nepalipatro.helpers.g.f16048a.a()) {
                    e10.printStackTrace();
                }
            }
            try {
                String action = intent2.getAction();
                if (m.a(action, O)) {
                    f.a aVar = f.f16022a;
                    if (intent2.hasExtra(aVar.c())) {
                        intent2.getStringExtra(aVar.c());
                    }
                    if (intent2.hasExtra(aVar.b())) {
                        intent2.getStringExtra(aVar.b());
                    }
                    boolean z10 = false;
                    if (intent2.hasExtra("IS_REMINDER")) {
                        z10 = intent2.getBooleanExtra("IS_REMINDER", false);
                    }
                    HashMap hashMap = new HashMap();
                    e.a aVar2 = e.f15961a;
                    hashMap.put(aVar2.u(), aVar2.y());
                    hashMap.put(aVar2.h(), aVar2.m());
                    intent2.putExtra(aVar2.c(), hashMap);
                    if (z10) {
                        try {
                            v9.a aVar3 = new v9.a(this.f16150a.getApplicationContext());
                            ca.a aVar4 = ca.a.f13428a;
                            aVar3.b(aVar4.n(), aVar4.d(), aVar4.n());
                        } catch (Exception e11) {
                            if (np.com.nepalipatro.helpers.g.f16048a.a()) {
                                e11.printStackTrace();
                            }
                        }
                    } else {
                        v9.a aVar5 = new v9.a(this.f16150a.getApplicationContext());
                        ca.a aVar6 = ca.a.f13428a;
                        aVar5.b(aVar6.j(), aVar6.d(), aVar6.j());
                    }
                    intent2.putExtra(aVar2.c(), hashMap);
                    intent2.setFlags(335577088);
                    PendingIntent activity = PendingIntent.getActivity(this.f16150a, l.f16129a.u(1, 1000000), intent2, 67108864);
                    m.e(activity, "getActivity(\n           …G_IMMUTABLE\n            )");
                    return activity;
                } else if (m.a(action, G)) {
                    Intent intent3 = new Intent(this.f16150a, NotificationBroadcastReceiver.class);
                    intent3.setAction(str);
                    try {
                        if (intent.getExtras() != null) {
                            Bundle extras2 = intent.getExtras();
                            m.c(extras2);
                            intent3.putExtras(extras2);
                        }
                    } catch (Exception e12) {
                        if (np.com.nepalipatro.helpers.g.f16048a.a()) {
                            e12.printStackTrace();
                        }
                    }
                    PendingIntent broadcast = PendingIntent.getBroadcast(this.f16150a, l.f16129a.u(1, 1000000), intent3, 67108864);
                    m.e(broadcast, "getBroadcast(\n          …                        )");
                    return broadcast;
                } else {
                    if (m.a(action, L)) {
                        HashMap hashMap2 = new HashMap();
                        e.a aVar7 = e.f15961a;
                        hashMap2.put(aVar7.u(), aVar7.y());
                        hashMap2.put(aVar7.h(), aVar7.o());
                        intent2.putExtra(aVar7.c(), hashMap2);
                        try {
                            v9.a aVar8 = new v9.a(this.f16150a.getApplicationContext());
                            ca.a aVar9 = ca.a.f13428a;
                            aVar8.b(aVar9.m(), aVar9.d(), aVar9.m());
                        } catch (Exception e13) {
                            if (np.com.nepalipatro.helpers.g.f16048a.a()) {
                                e13.printStackTrace();
                            }
                        }
                    }
                    intent2.setFlags(335577088);
                    PendingIntent activity2 = PendingIntent.getActivity(this.f16150a, l.f16129a.u(1, 1000000), intent2, 67108864);
                    m.e(activity2, "getActivity(\n           …G_IMMUTABLE\n            )");
                    return activity2;
                }
            } catch (Exception unused) {
            }
        } else {
            Intent intent4 = new Intent(this.f16150a, NotificationBroadcastReceiver.class);
            intent4.setAction(str);
            try {
                if (intent.getExtras() != null) {
                    Bundle extras3 = intent.getExtras();
                    m.c(extras3);
                    intent4.putExtras(extras3);
                }
            } catch (Exception e14) {
                if (np.com.nepalipatro.helpers.g.f16048a.a()) {
                    e14.printStackTrace();
                }
            }
            PendingIntent broadcast2 = PendingIntent.getBroadcast(this.f16150a, l.f16129a.u(1, 1000000), intent4, 67108864);
            m.e(broadcast2, "getBroadcast(\n          …G_IMMUTABLE\n            )");
            return broadcast2;
        }
    }

    public static /* synthetic */ void w(AppNotifications appNotifications, Map map, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "others";
        }
        appNotifications.v(map, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0494 A[Catch:{ Exception | NoClassDefFoundError -> 0x04ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x049f A[Catch:{ Exception | NoClassDefFoundError -> 0x04ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0336  */
    @android.annotation.SuppressLint({"PrivateApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Notification s(boolean r30) {
        /*
            r29 = this;
            r1 = r29
            java.lang.String r2 = ""
            np.com.nepalipatro.helpers.k$a r0 = np.com.nepalipatro.helpers.k.f16077a
            android.content.Context r3 = r1.f16150a
            java.lang.String r4 = r0.h()
            java.lang.String r5 = "ne"
            java.lang.String r0 = r0.w(r3, r4, r5)
            if (r0 != 0) goto L_0x0016
            r3 = r5
            goto L_0x0017
        L_0x0016:
            r3 = r0
        L_0x0017:
            android.content.Context r0 = r1.f16150a
            boolean r0 = android.text.format.DateFormat.is24HourFormat(r0)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            if (r0 == 0) goto L_0x0033
            y9.b r0 = r1.f16152c
            android.content.Context r6 = r1.f16150a
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.String r8 = "HH:mm"
            java.lang.CharSequence r0 = r0.f(r6, r8, r7)
            kotlin.jvm.internal.m.d(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0044
        L_0x0033:
            y9.b r0 = r1.f16152c
            android.content.Context r6 = r1.f16150a
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.String r8 = "h:mm"
            java.lang.CharSequence r0 = r0.f(r6, r8, r7)
            kotlin.jvm.internal.m.d(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0044:
            g9.f r6 = new g9.f
            java.lang.String r7 = " "
            r6.<init>((java.lang.String) r7)
            r7 = 0
            java.util.List r0 = r6.c(r0, r7)
            boolean r6 = r0.isEmpty()
            r8 = 1
            if (r6 != 0) goto L_0x0080
            int r6 = r0.size()
            java.util.ListIterator r6 = r0.listIterator(r6)
        L_0x005f:
            boolean r9 = r6.hasPrevious()
            if (r9 == 0) goto L_0x0080
            java.lang.Object r9 = r6.previous()
            java.lang.String r9 = (java.lang.String) r9
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0073
            r9 = 1
            goto L_0x0074
        L_0x0073:
            r9 = 0
        L_0x0074:
            if (r9 != 0) goto L_0x005f
            int r6 = r6.nextIndex()
            int r6 = r6 + r8
            java.util.List r0 = p8.x.P(r0, r6)
            goto L_0x0084
        L_0x0080:
            java.util.List r0 = p8.p.e()
        L_0x0084:
            java.lang.String[] r6 = new java.lang.String[r7]
            java.lang.Object[] r0 = r0.toArray(r6)
            java.lang.String[] r0 = (java.lang.String[]) r0
            android.widget.RemoteViews r6 = new android.widget.RemoteViews
            android.content.Context r9 = r1.f16150a
            java.lang.String r9 = r9.getPackageName()
            r10 = 2131492956(0x7f0c005c, float:1.8609379E38)
            r6.<init>(r9, r10)
            android.widget.RemoteViews r9 = new android.widget.RemoteViews
            android.content.Context r10 = r1.f16150a
            java.lang.String r10 = r10.getPackageName()
            r11 = 2131492957(0x7f0c005d, float:1.860938E38)
            r9.<init>(r10, r11)
            r10 = r0[r7]
            r11 = 2131296713(0x7f0901c9, float:1.821135E38)
            r6.setTextViewText(r11, r10)
            r10 = r0[r7]
            r9.setTextViewText(r11, r10)
            int r10 = r0.length
            r11 = 2131296712(0x7f0901c8, float:1.8211348E38)
            r12 = 2
            if (r10 != r12) goto L_0x00e7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r13 = r0[r8]
            r10.append(r13)
            java.lang.String r13 = " NPT"
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            r6.setTextViewText(r11, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r0 = r0[r8]
            r10.append(r0)
            r10.append(r13)
            java.lang.String r0 = r10.toString()
            r9.setTextViewText(r11, r0)
            goto L_0x00ef
        L_0x00e7:
            java.lang.String r0 = "NPT"
            r6.setTextViewText(r11, r0)
            r9.setTextViewText(r11, r0)
        L_0x00ef:
            r11 = 32
            if (r30 == 0) goto L_0x021e
            y9.b r0 = r1.f16152c
            android.content.Context r13 = r1.f16150a
            java.util.Locale r14 = java.util.Locale.ENGLISH
            java.lang.String r15 = "MMM d, yyyy"
            java.lang.CharSequence r0 = r0.f(r13, r15, r14)
            kotlin.jvm.internal.m.d(r0, r4)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            y9.b r0 = r1.f16152c
            android.content.Context r13 = r1.f16150a
            java.util.Calendar r13 = r0.e(r13)
            y9.c r0 = r1.f16153d     // Catch:{ Exception -> 0x0174 }
            if (r0 == 0) goto L_0x0116
            np.com.nepalipatro.models.NsDate r0 = r0.d(r13)     // Catch:{ Exception -> 0x0174 }
            goto L_0x0117
        L_0x0116:
            r0 = 0
        L_0x0117:
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = r0.getTithiLong(r3)     // Catch:{ Exception -> 0x0174 }
            if (r0 != 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            r14 = r0
            goto L_0x0123
        L_0x0122:
            r14 = r2
        L_0x0123:
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0172 }
            r15 = 5
            if (r13 == 0) goto L_0x0142
            int r16 = r13.get(r8)     // Catch:{ Exception -> 0x0172 }
            int r17 = r13.get(r12)     // Catch:{ Exception -> 0x0172 }
            int r18 = r13.get(r15)     // Catch:{ Exception -> 0x0172 }
            r19 = 0
            r20 = 0
            r21 = 0
            r10 = 5
            r15 = r0
            r15.set(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0172 }
            goto L_0x0143
        L_0x0142:
            r10 = 5
        L_0x0143:
            java.lang.String r15 = "getInstance().apply {\n  …     };\n                }"
            kotlin.jvm.internal.m.e(r0, r15)     // Catch:{ Exception -> 0x0172 }
            java.util.Calendar r15 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0172 }
            if (r13 == 0) goto L_0x0165
            int r23 = r13.get(r8)     // Catch:{ Exception -> 0x0172 }
            int r24 = r13.get(r12)     // Catch:{ Exception -> 0x0172 }
            int r25 = r13.get(r10)     // Catch:{ Exception -> 0x0172 }
            r26 = 23
            r27 = 59
            r28 = 0
            r22 = r15
            r22.set(r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0172 }
        L_0x0165:
            u9.a r10 = r1.f16154e     // Catch:{ Exception -> 0x0172 }
            if (r10 == 0) goto L_0x0181
            java.lang.String r0 = r10.s(r0, r15, r3)     // Catch:{ Exception -> 0x0172 }
            if (r0 != 0) goto L_0x0170
            goto L_0x0181
        L_0x0170:
            r2 = r0
            goto L_0x0181
        L_0x0172:
            r0 = move-exception
            goto L_0x0176
        L_0x0174:
            r0 = move-exception
            r14 = r2
        L_0x0176:
            np.com.nepalipatro.helpers.g$a r10 = np.com.nepalipatro.helpers.g.f16048a
            boolean r10 = r10.a()
            if (r10 == 0) goto L_0x0181
            r0.printStackTrace()
        L_0x0181:
            y9.b r0 = new y9.b
            r0.<init>()
            np.com.nepalipatro.models.BsDate r0 = r0.d(r13)
            boolean r10 = g9.p.m(r3, r5, r8)
            if (r10 == 0) goto L_0x0195
            java.lang.String r10 = r0.getMonthNpLong()
            goto L_0x0199
        L_0x0195:
            java.lang.String r10 = r0.getMonthLong()
        L_0x0199:
            boolean r15 = g9.p.m(r3, r5, r8)
            if (r15 == 0) goto L_0x01a4
            java.lang.String r15 = r0.getDayNp()
            goto L_0x01ac
        L_0x01a4:
            int r15 = r0.getDay()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
        L_0x01ac:
            boolean r5 = g9.p.m(r3, r5, r8)
            if (r5 == 0) goto L_0x01b7
            java.lang.String r5 = r0.getYearNp()
            goto L_0x01bf
        L_0x01b7:
            int r5 = r0.getYear()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x01bf:
            java.lang.String r3 = r0.getDow_long(r3, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r11)
            r13.append(r15)
            java.lang.String r10 = ", "
            r13.append(r10)
            r13.append(r5)
            r13.append(r11)
            r13.append(r3)
            java.lang.String r3 = r13.toString()
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x01eb
            r5 = 1
            goto L_0x01ec
        L_0x01eb:
            r5 = 0
        L_0x01ec:
            if (r5 == 0) goto L_0x0202
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            java.lang.String r10 = " - "
            r5.append(r10)
            r5.append(r2)
            java.lang.String r14 = r5.toString()
        L_0x0202:
            r2 = 2131296710(0x7f0901c6, float:1.8211344E38)
            r6.setTextViewText(r2, r3)
            r9.setTextViewText(r2, r3)
            r2 = 2131296711(0x7f0901c7, float:1.8211346E38)
            r6.setTextViewText(r2, r14)
            r9.setTextViewText(r2, r14)
            r2 = 2131296709(0x7f0901c5, float:1.8211342E38)
            r6.setTextViewText(r2, r4)
            r9.setTextViewText(r2, r4)
            goto L_0x0226
        L_0x021e:
            np.com.nepalipatro.helpers.g$a r0 = np.com.nepalipatro.helpers.g.f16048a
            java.lang.String r2 = "notification updating::partial reset"
            r0.b(r2)
            r0 = 0
        L_0x0226:
            ba.a r2 = ba.a.f13335a
            android.content.Context r3 = r1.f16150a
            r2.a(r3)
            android.content.Context r3 = r1.f16150a
            android.content.res.Resources r3 = r3.getResources()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ic_notification_"
            r4.append(r5)
            if (r0 == 0) goto L_0x0244
            int r0 = r0.getDay()
            goto L_0x0245
        L_0x0244:
            r0 = 0
        L_0x0245:
            r4.append(r0)
            java.lang.String r0 = "_white"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.content.Context r4 = r1.f16150a
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "drawable"
            int r0 = r3.getIdentifier(r0, r5, r4)
            if (r0 != 0) goto L_0x0271
            android.content.Context r0 = r1.f16150a
            android.content.res.Resources r0 = r0.getResources()
            android.content.Context r3 = r1.f16150a
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = "ic_action_calendar_selected"
            int r0 = r0.getIdentifier(r4, r5, r3)
        L_0x0271:
            np.com.nepalipatro.helpers.k$a r3 = np.com.nepalipatro.helpers.k.f16077a
            android.content.Context r4 = r1.f16150a
            java.lang.String r5 = r3.u()
            boolean r4 = r3.c(r4, r5, r8)
            r5 = 31
            if (r4 == 0) goto L_0x0336
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r10 = "Builder(mContext, Notifi…        .setOngoing(true)"
            if (r4 < r5) goto L_0x02e7
            androidx.core.app.l$e r4 = new androidx.core.app.l$e
            android.content.Context r5 = r1.f16150a
            java.lang.String r2 = r2.h()
            r4.<init>(r5, r2)
            androidx.core.app.l$e r0 = r4.J(r0)
            androidx.core.app.l$e r0 = r0.H(r8)
            androidx.core.app.l$e r0 = r0.P(r8)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = F
            android.app.PendingIntent r2 = r1.t(r2, r4)
            androidx.core.app.l$e r0 = r0.v(r2)
            androidx.core.app.l$e r0 = r0.l(r7)
            androidx.core.app.l$e r0 = r0.t(r9)
            androidx.core.app.l$e r0 = r0.s(r6)
            androidx.core.app.l$e r0 = r0.x(r8)
            androidx.core.app.l$g r2 = new androidx.core.app.l$g
            r2.<init>()
            androidx.core.app.l$e r0 = r0.L(r2)
            androidx.core.app.l$e r0 = r0.G(r8)
            androidx.core.app.l$e r0 = r0.F(r8)
            kotlin.jvm.internal.m.e(r0, r10)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = J
            android.app.PendingIntent r2 = r1.t(r2, r4)
            r0.p(r2)
            android.app.Notification r0 = r0.c()
            r1.f16155f = r0
            goto L_0x0458
        L_0x02e7:
            androidx.core.app.l$e r4 = new androidx.core.app.l$e
            android.content.Context r5 = r1.f16150a
            java.lang.String r2 = r2.h()
            r4.<init>(r5, r2)
            androidx.core.app.l$e r0 = r4.J(r0)
            androidx.core.app.l$e r0 = r0.H(r8)
            androidx.core.app.l$e r0 = r0.P(r8)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = F
            android.app.PendingIntent r2 = r1.t(r2, r4)
            androidx.core.app.l$e r0 = r0.v(r2)
            androidx.core.app.l$e r0 = r0.l(r7)
            androidx.core.app.l$e r0 = r0.o(r9)
            androidx.core.app.l$e r0 = r0.G(r8)
            androidx.core.app.l$e r0 = r0.F(r8)
            kotlin.jvm.internal.m.e(r0, r10)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = J
            android.app.PendingIntent r2 = r1.t(r2, r4)
            r0.p(r2)
            android.app.Notification r0 = r0.c()
            r1.f16155f = r0
            goto L_0x0458
        L_0x0336:
            android.net.Uri r4 = android.media.RingtoneManager.getDefaultUri(r12)
            if (r4 != 0) goto L_0x0346
            android.net.Uri r4 = android.media.RingtoneManager.getDefaultUri(r8)
            if (r4 != 0) goto L_0x0346
            android.net.Uri r4 = android.media.RingtoneManager.getDefaultUri(r12)
        L_0x0346:
            int r10 = android.os.Build.VERSION.SDK_INT
            java.lang.String r13 = "mContext.applicationContext"
            java.lang.String r14 = "Builder(mContext, Notifi…  .setOnlyAlertOnce(true)"
            if (r10 < r5) goto L_0x03ea
            androidx.core.app.l$e r5 = new androidx.core.app.l$e
            android.content.Context r10 = r1.f16150a
            java.lang.String r2 = r2.h()
            r5.<init>(r10, r2)
            androidx.core.app.l$e r0 = r5.J(r0)
            androidx.core.app.l$e r0 = r0.H(r8)
            androidx.core.app.l$e r0 = r0.P(r8)
            androidx.core.app.l$e r0 = r0.x(r8)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r5 = G
            android.app.PendingIntent r2 = r1.t(r2, r5)
            androidx.core.app.l$e r0 = r0.v(r2)
            androidx.core.app.l$e r0 = r0.l(r7)
            androidx.core.app.l$e r0 = r0.t(r9)
            androidx.core.app.l$e r0 = r0.s(r6)
            androidx.core.app.l$g r2 = new androidx.core.app.l$g
            r2.<init>()
            androidx.core.app.l$e r0 = r0.L(r2)
            androidx.core.app.l$e r0 = r0.G(r8)
            kotlin.jvm.internal.m.e(r0, r14)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r5 = K
            android.app.PendingIntent r2 = r1.t(r2, r5)
            r0.p(r2)
            java.lang.Boolean r2 = f16132i
            kotlin.jvm.internal.m.c(r2)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x03c3
            android.content.Context r2 = r1.f16150a
            android.content.Context r2 = r2.getApplicationContext()
            kotlin.jvm.internal.m.e(r2, r13)
            java.lang.String r5 = r3.o()
            boolean r2 = r3.c(r2, r5, r7)
            if (r2 != 0) goto L_0x03c3
            r0.K(r4)
        L_0x03c3:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            f16132i = r2
            android.app.Notification r0 = r0.c()
            r1.f16155f = r0
            android.content.Context r0 = r1.f16150a
            java.lang.String r2 = r3.u()
            boolean r0 = r3.c(r0, r2, r8)
            if (r0 == 0) goto L_0x0458
            android.app.Notification r0 = r1.f16155f
            kotlin.jvm.internal.m.c(r0)
            android.app.Notification r2 = r1.f16155f
            kotlin.jvm.internal.m.c(r2)
            int r2 = r2.flags
            r2 = r2 | r12
            r2 = r2 | r11
            r0.flags = r2
            goto L_0x0458
        L_0x03ea:
            androidx.core.app.l$e r5 = new androidx.core.app.l$e
            android.content.Context r6 = r1.f16150a
            java.lang.String r2 = r2.h()
            r5.<init>(r6, r2)
            androidx.core.app.l$e r0 = r5.J(r0)
            androidx.core.app.l$e r0 = r0.H(r8)
            androidx.core.app.l$e r0 = r0.P(r8)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r5 = G
            android.app.PendingIntent r2 = r1.t(r2, r5)
            androidx.core.app.l$e r0 = r0.v(r2)
            androidx.core.app.l$e r0 = r0.l(r7)
            androidx.core.app.l$e r0 = r0.o(r9)
            androidx.core.app.l$e r0 = r0.G(r8)
            kotlin.jvm.internal.m.e(r0, r14)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r5 = K
            android.app.PendingIntent r2 = r1.t(r2, r5)
            r0.p(r2)
            java.lang.Boolean r2 = f16132i
            kotlin.jvm.internal.m.c(r2)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x044e
            android.content.Context r2 = r1.f16150a
            android.content.Context r2 = r2.getApplicationContext()
            kotlin.jvm.internal.m.e(r2, r13)
            java.lang.String r5 = r3.o()
            boolean r2 = r3.c(r2, r5, r7)
            if (r2 != 0) goto L_0x044e
            r0.K(r4)
        L_0x044e:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            f16132i = r2
            android.app.Notification r0 = r0.c()
            r1.f16155f = r0
        L_0x0458:
            android.content.Context r0 = r1.f16150a
            java.lang.String r2 = r3.u()
            boolean r0 = r3.c(r0, r2, r8)
            if (r0 == 0) goto L_0x0474
            android.app.Notification r0 = r1.f16155f
            kotlin.jvm.internal.m.c(r0)
            android.app.Notification r2 = r1.f16155f
            kotlin.jvm.internal.m.c(r2)
            int r2 = r2.flags
            r2 = r2 | r12
            r2 = r2 | r11
            r0.flags = r2
        L_0x0474:
            java.lang.String r0 = "android.app.MiuiNotification"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            java.lang.Class r2 = r0.getClass()     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            java.lang.String r3 = "customizedIcon"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            r2.setAccessible(r8)     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            r2.set(r0, r3)     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            android.app.Notification r2 = r1.f16155f     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            if (r2 == 0) goto L_0x049f
            java.lang.Class r2 = r2.getClass()     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            java.lang.String r3 = "extraNotification"
            java.lang.reflect.Field r10 = r2.getField(r3)     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            goto L_0x04a0
        L_0x049f:
            r10 = 0
        L_0x04a0:
            kotlin.jvm.internal.m.c(r10)     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            r10.setAccessible(r8)     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            android.app.Notification r2 = r1.f16155f     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
            r10.set(r2, r0)     // Catch:{ Exception | NoClassDefFoundError -> 0x04ab }
        L_0x04ab:
            android.app.Notification r0 = r1.f16155f
            kotlin.jvm.internal.m.c(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.notification.AppNotifications.s(boolean):android.app.Notification");
    }

    public final void u(boolean z10) {
        Object systemService = this.f16150a.getApplicationContext().getSystemService("notification");
        m.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(f16136m, s(z10));
        k.a aVar = k.f16077a;
        Context applicationContext = this.f16150a.getApplicationContext();
        m.e(applicationContext, "mContext.applicationContext");
        aVar.x(applicationContext, aVar.o(), true);
    }

    public final void v(Map<String, String> map, String str) {
        PendingIntent pendingIntent;
        l.h hVar;
        Bitmap bitmap;
        Map<String, String> map2 = map;
        String str2 = str;
        m.f(map2, "data");
        m.f(str2, ShareConstants.MEDIA_TYPE);
        e.a aVar = e.f15961a;
        String str3 = map2.containsKey(aVar.g()) ? map2.get(aVar.g()) : AppEventsConstants.EVENT_PARAM_VALUE_NO;
        String str4 = "";
        String str5 = map2.containsKey(aVar.t()) ? map2.get(aVar.t()) : str4;
        String str6 = map2.containsKey(aVar.q()) ? map2.get(aVar.q()) : str4;
        String str7 = map2.containsKey(aVar.h()) ? map2.get(aVar.h()) : str4;
        if (map2.containsKey("image")) {
            str4 = map2.get("image");
        }
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        if (defaultUri == null && (defaultUri = RingtoneManager.getDefaultUri(1)) == null) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        if (m.a(str2, aVar.n()) || m.a(str7, aVar.p())) {
            pendingIntent = PendingIntent.getBroadcast(this.f16150a, 0, new Intent(C), 67108864);
            m.e(pendingIntent, "getBroadcast(\n          …G_IMMUTABLE\n            )");
        } else {
            pendingIntent = np.com.nepalipatro.helpers.l.f16129a.i(this.f16150a, new Intent(), C);
        }
        ba.a aVar2 = ba.a.f13335a;
        aVar2.c(this.f16150a);
        aVar2.d(this.f16150a);
        if (str4 == null || p.o(str4)) {
            hVar = new l.c().r(str6);
            m.e(hVar, "BigTextStyle().bigText(message)");
        } else {
            BitmapFactory.decodeResource(this.f16150a.getResources(), R.drawable.np_bg);
            w2.c<Bitmap> n02 = com.bumptech.glide.b.t(this.f16150a).e().k0(str4).n0();
            m.e(n02, "with(mContext)\n         …                .submit()");
            try {
                bitmap = (Bitmap) n02.get();
            } catch (Exception unused) {
                bitmap = BitmapFactory.decodeResource(this.f16150a.getResources(), R.drawable.notification_placeholder);
            }
            l.b s10 = new l.b().s(bitmap);
            m.e(s10, "BigPictureStyle().bigPicture(bitmap)");
            com.bumptech.glide.b.t(this.f16150a).k(n02);
            hVar = s10;
        }
        Object systemService = this.f16150a.getSystemService("notification");
        m.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        l.e l10 = new l.e(this.f16150a, ba.a.f13335a.h()).K(defaultUri).r(str5).v(pendingIntent).L(hVar).q(str6).l(true);
        m.e(l10, "Builder(mContext, Notifi…     .setAutoCancel(true)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            l10.J(R.drawable.ic_action_calendar_selected);
        } else {
            l10.J(R.mipmap.ic_launcher);
        }
        l10.B(BitmapFactory.decodeResource(this.f16150a.getResources(), R.mipmap.ic_launcher));
        if (i10 >= 24) {
            l10.y(f16148y);
        }
        Intent intent = new Intent();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put((String) next.getKey(), (String) next.getValue());
        }
        e.a aVar3 = e.f15961a;
        if (hashMap.containsKey(aVar3.r())) {
            if (String.valueOf(hashMap.get(aVar3.r())).length() > 0) {
                Object obj = hashMap.get(aVar3.r());
                m.c(obj);
                JSONObject jSONObject = new JSONObject((String) obj);
                if (jSONObject.has(aVar3.s())) {
                    Object obj2 = jSONObject.get(aVar3.s());
                    if (obj2 instanceof String) {
                        obj2 = Integer.valueOf(Integer.parseInt((String) obj2));
                    }
                    if ((obj2 instanceof Integer) && ((Number) obj2).intValue() > 2024010514) {
                        return;
                    }
                }
            }
        }
        intent.putExtra(aVar3.c(), hashMap);
        l10.p(t(intent, N));
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            l.e eVar = new l.e(this.f16150a, ba.a.f13335a.g());
            eVar.y(f16148y).A(true).r(str5);
            if (i11 >= 21) {
                eVar.J(R.drawable.ic_action_calendar_selected);
            } else {
                eVar.J(R.mipmap.ic_launcher);
            }
            eVar.l(true);
            notificationManager.notify(f16144u, eVar.c());
        }
        if (m.a(str3, AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            notificationManager.notify(f16139p, l10.c());
            return;
        }
        m.c(str3);
        notificationManager.notify(Integer.parseInt(str3), l10.c());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0095, code lost:
        if (r9 == null) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x031e A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0364 A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0366 A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0369 A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x036a A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0399 A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03a0 A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03fa A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03fe A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0412 A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x043e A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0476 A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0480 A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x029c A[EDGE_INSN: B:148:0x029c->B:71:0x029c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0147 A[SYNTHETIC, Splitter:B:32:0x0147] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0279 A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02af A[Catch:{ Exception -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02ec A[SYNTHETIC, Splitter:B:92:0x02ec] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            java.lang.String r3 = "Utils.getLocale(mContext).language"
            java.lang.String r4 = "ne"
            java.lang.String r5 = "0"
            java.lang.String r6 = ", "
            java.lang.String r7 = "eid"
            kotlin.jvm.internal.m.f(r0, r7)
            java.lang.String r7 = "rid"
            kotlin.jvm.internal.m.f(r2, r7)
            u9.a r7 = new u9.a     // Catch:{ Exception -> 0x048a }
            android.content.Context r8 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            r7.<init>(r8)     // Catch:{ Exception -> 0x048a }
            java.util.Date r8 = new java.util.Date     // Catch:{ Exception -> 0x048a }
            r8.<init>()     // Catch:{ Exception -> 0x048a }
            long r8 = r8.getTime()     // Catch:{ Exception -> 0x048a }
            r10 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r10     // Catch:{ Exception -> 0x048a }
            long r15 = r8 / r10
            np.com.nepalipatro.helpers.k$a r8 = np.com.nepalipatro.helpers.k.f16077a     // Catch:{ Exception -> 0x048a }
            android.content.Context r9 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            java.lang.String r10 = "last_shown_myevent_notification"
            r11 = 0
            long r9 = r8.g(r9, r10, r11)     // Catch:{ Exception -> 0x048a }
            long r9 = r15 - r9
            r11 = 60
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0042
            return
        L_0x0042:
            android.content.Context r13 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            java.lang.String r14 = "last_shown_myevent_notification"
            r17 = 0
            r18 = 8
            r19 = 0
            r12 = r8
            np.com.nepalipatro.helpers.k.a.z(r12, r13, r14, r15, r17, r18, r19)     // Catch:{ Exception -> 0x048a }
            np.com.nepalipatro.helpers.g$a r9 = np.com.nepalipatro.helpers.g.f16048a     // Catch:{ Exception -> 0x048a }
            java.lang.String r10 = "sendNotificationMyEvents"
            r9.b(r10)     // Catch:{ Exception -> 0x048a }
            android.content.Context r10 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            java.lang.String r11 = "listPrefLanguage"
            java.lang.String r10 = r8.w(r10, r11, r5)     // Catch:{ Exception -> 0x048a }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x048a }
            r11.<init>()     // Catch:{ Exception -> 0x048a }
            java.lang.String r12 = "sendNotificationMyEvents:langs"
            r11.append(r12)     // Catch:{ Exception -> 0x048a }
            r11.append(r10)     // Catch:{ Exception -> 0x048a }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x048a }
            r9.b(r10)     // Catch:{ Exception -> 0x048a }
            android.content.Context r9 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            java.lang.String r10 = r8.v()     // Catch:{ Exception -> 0x048a }
            np.com.nepalipatro.helpers.e$a r11 = np.com.nepalipatro.helpers.e.f15961a     // Catch:{ Exception -> 0x048a }
            java.lang.String r12 = r11.b()     // Catch:{ Exception -> 0x048a }
            java.lang.String r8 = r8.w(r9, r10, r12)     // Catch:{ Exception -> 0x048a }
            if (r8 != 0) goto L_0x0089
            java.lang.String r8 = r11.b()     // Catch:{ Exception -> 0x048a }
        L_0x0089:
            np.com.nepalipatro.models.EventModel r0 = r7.C(r0, r8)     // Catch:{ Exception -> 0x048a }
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0097
            java.lang.String r9 = r0.getStartDate()     // Catch:{ Exception -> 0x048a }
            if (r9 != 0) goto L_0x0098
        L_0x0097:
            r9 = r8
        L_0x0098:
            if (r0 == 0) goto L_0x00a0
            java.lang.String r10 = r0.getTitle()     // Catch:{ Exception -> 0x048a }
            if (r10 != 0) goto L_0x00a1
        L_0x00a0:
            r10 = r8
        L_0x00a1:
            np.com.nepalipatro.helpers.b r11 = np.com.nepalipatro.helpers.b.f15915a     // Catch:{ Exception -> 0x048a }
            java.lang.String r12 = r11.e()     // Catch:{ Exception -> 0x048a }
            r13 = 0
            java.util.Calendar r9 = r11.g(r9, r12, r13)     // Catch:{ Exception -> 0x048a }
            java.lang.String r11 = "[^\\d.]"
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x048a }
            if (r0 == 0) goto L_0x00cf
            g9.f r12 = new g9.f     // Catch:{ Exception -> 0x048a }
            r12.<init>((java.lang.String) r11)     // Catch:{ Exception -> 0x048a }
            java.lang.String r0 = r12.b(r0, r8)     // Catch:{ Exception -> 0x048a }
            if (r0 == 0) goto L_0x00cf
            java.math.BigInteger r12 = new java.math.BigInteger     // Catch:{ Exception -> 0x048a }
            r12.<init>(r0)     // Catch:{ Exception -> 0x048a }
            int r0 = r12.intValue()     // Catch:{ Exception -> 0x048a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x048a }
            goto L_0x00d0
        L_0x00cf:
            r0 = r13
        L_0x00d0:
            kotlin.jvm.internal.m.c(r0)     // Catch:{ Exception -> 0x048a }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x048a }
            y9.b r12 = r1.f16152c     // Catch:{ Exception -> 0x048a }
            android.content.Context r14 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            java.util.Calendar r12 = r12.e(r14)     // Catch:{ Exception -> 0x048a }
            y9.b r14 = new y9.b     // Catch:{ Exception -> 0x048a }
            r14.<init>()     // Catch:{ Exception -> 0x048a }
            np.com.nepalipatro.models.BsDate r14 = r14.d(r12)     // Catch:{ Exception -> 0x048a }
            java.lang.String r15 = r14.getDow_long(r4, r12)     // Catch:{ Exception -> 0x048a }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x048a }
            r13.<init>()     // Catch:{ Exception -> 0x048a }
            r16 = r0
            java.lang.String r0 = r14.getDayNp()     // Catch:{ Exception -> 0x048a }
            r13.append(r0)     // Catch:{ Exception -> 0x048a }
            r0 = 32
            r13.append(r0)     // Catch:{ Exception -> 0x048a }
            java.lang.String r0 = r14.getMonthNpLong()     // Catch:{ Exception -> 0x048a }
            r13.append(r0)     // Catch:{ Exception -> 0x048a }
            r13.append(r6)     // Catch:{ Exception -> 0x048a }
            java.lang.String r0 = r14.getYearNp()     // Catch:{ Exception -> 0x048a }
            r13.append(r0)     // Catch:{ Exception -> 0x048a }
            r0 = 32
            r13.append(r0)     // Catch:{ Exception -> 0x048a }
            r13.append(r15)     // Catch:{ Exception -> 0x048a }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x048a }
            y9.c r13 = new y9.c     // Catch:{ Exception -> 0x048a }
            android.content.Context r14 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            r13.<init>(r14)     // Catch:{ Exception -> 0x048a }
            np.com.nepalipatro.models.NsDate r13 = r13.d(r12)     // Catch:{ Exception -> 0x048a }
            kotlin.jvm.internal.m.c(r13)     // Catch:{ Exception -> 0x048a }
            np.com.nepalipatro.helpers.l$a r14 = np.com.nepalipatro.helpers.l.f16129a     // Catch:{ Exception -> 0x048a }
            android.content.Context r15 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            java.util.Locale r15 = r14.e(r15)     // Catch:{ Exception -> 0x048a }
            java.lang.String r15 = r15.getLanguage()     // Catch:{ Exception -> 0x048a }
            kotlin.jvm.internal.m.e(r15, r3)     // Catch:{ Exception -> 0x048a }
            java.lang.String r13 = r13.getTithiLong(r15)     // Catch:{ Exception -> 0x048a }
            boolean r5 = r2.equals(r5)     // Catch:{ Exception -> 0x048a }
            java.lang.String r15 = " - "
            r18 = r0
            if (r5 != 0) goto L_0x026a
            int r5 = r22.length()     // Catch:{ Exception -> 0x048a }
            if (r5 <= 0) goto L_0x014f
            r5 = 1
            goto L_0x0150
        L_0x014f:
            r5 = 0
        L_0x0150:
            if (r5 == 0) goto L_0x026a
            np.com.nepalipatro.models.ReminderModel r5 = r7.u(r2)     // Catch:{ Exception -> 0x048a }
            kotlin.jvm.internal.m.c(r5)     // Catch:{ Exception -> 0x048a }
            g9.f r7 = new g9.f     // Catch:{ Exception -> 0x048a }
            r7.<init>((java.lang.String) r11)     // Catch:{ Exception -> 0x048a }
            java.lang.String r2 = r7.b(r2, r8)     // Catch:{ Exception -> 0x048a }
            if (r2 == 0) goto L_0x0172
            java.math.BigInteger r7 = new java.math.BigInteger     // Catch:{ Exception -> 0x048a }
            r7.<init>(r2)     // Catch:{ Exception -> 0x048a }
            int r2 = r7.intValue()     // Catch:{ Exception -> 0x048a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x048a }
            goto L_0x0173
        L_0x0172:
            r2 = 0
        L_0x0173:
            kotlin.jvm.internal.m.c(r2)     // Catch:{ Exception -> 0x048a }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x048a }
            java.lang.Integer r7 = r5.getDays()     // Catch:{ Exception -> 0x048a }
            kotlin.jvm.internal.m.c(r7)     // Catch:{ Exception -> 0x048a }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x048a }
            if (r12 == 0) goto L_0x018b
            r11 = 5
            r12.add(r11, r7)     // Catch:{ Exception -> 0x048a }
        L_0x018b:
            y9.b r11 = new y9.b     // Catch:{ Exception -> 0x048a }
            r11.<init>()     // Catch:{ Exception -> 0x048a }
            np.com.nepalipatro.models.BsDate r11 = r11.d(r12)     // Catch:{ Exception -> 0x048a }
            java.lang.String r4 = r11.getDow_long(r4, r12)     // Catch:{ Exception -> 0x048a }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x048a }
            r13.<init>()     // Catch:{ Exception -> 0x048a }
            java.lang.String r0 = r11.getDayNp()     // Catch:{ Exception -> 0x048a }
            r13.append(r0)     // Catch:{ Exception -> 0x048a }
            r0 = 32
            r13.append(r0)     // Catch:{ Exception -> 0x048a }
            java.lang.String r0 = r11.getMonthNpLong()     // Catch:{ Exception -> 0x048a }
            r13.append(r0)     // Catch:{ Exception -> 0x048a }
            r13.append(r6)     // Catch:{ Exception -> 0x048a }
            java.lang.String r0 = r11.getYearNp()     // Catch:{ Exception -> 0x048a }
            r13.append(r0)     // Catch:{ Exception -> 0x048a }
            r0 = 32
            r13.append(r0)     // Catch:{ Exception -> 0x048a }
            r13.append(r4)     // Catch:{ Exception -> 0x048a }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x048a }
            y9.c r4 = new y9.c     // Catch:{ Exception -> 0x048a }
            android.content.Context r11 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            r4.<init>(r11)     // Catch:{ Exception -> 0x048a }
            np.com.nepalipatro.models.NsDate r4 = r4.d(r12)     // Catch:{ Exception -> 0x048a }
            kotlin.jvm.internal.m.c(r4)     // Catch:{ Exception -> 0x048a }
            android.content.Context r11 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            java.util.Locale r11 = r14.e(r11)     // Catch:{ Exception -> 0x048a }
            java.lang.String r11 = r11.getLanguage()     // Catch:{ Exception -> 0x048a }
            kotlin.jvm.internal.m.e(r11, r3)     // Catch:{ Exception -> 0x048a }
            java.lang.String r13 = r4.getTithiLong(r11)     // Catch:{ Exception -> 0x048a }
            java.lang.String r3 = r5.getNote()     // Catch:{ Exception -> 0x048a }
            if (r3 != 0) goto L_0x01ec
            r3 = r8
        L_0x01ec:
            if (r7 == 0) goto L_0x0232
            r4 = 1
            if (r7 == r4) goto L_0x0223
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x048a }
            r4.<init>()     // Catch:{ Exception -> 0x048a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x048a }
            android.content.Context r7 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            java.util.Locale r7 = r14.e(r7)     // Catch:{ Exception -> 0x048a }
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x048a }
            java.lang.String r5 = r14.h(r5, r7, r9)     // Catch:{ Exception -> 0x048a }
            r4.append(r5)     // Catch:{ Exception -> 0x048a }
            r5 = 32
            r4.append(r5)     // Catch:{ Exception -> 0x048a }
            android.content.Context r5 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            java.util.Locale r7 = r14.e(r5)     // Catch:{ Exception -> 0x048a }
            r9 = 2131820723(0x7f1100b3, float:1.927417E38)
            java.lang.String r5 = r14.k(r5, r7, r9)     // Catch:{ Exception -> 0x048a }
            r4.append(r5)     // Catch:{ Exception -> 0x048a }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x048a }
            goto L_0x026f
        L_0x0223:
            android.content.Context r4 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            r5 = 2131821145(0x7f110259, float:1.9275025E38)
            java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x048a }
            java.lang.String r5 = "mContext.getString(R.string.tomorrow)"
            kotlin.jvm.internal.m.e(r4, r5)     // Catch:{ Exception -> 0x048a }
            goto L_0x026f
        L_0x0232:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x048a }
            r4.<init>()     // Catch:{ Exception -> 0x048a }
            android.content.Context r5 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            r7 = 2131821144(0x7f110258, float:1.9275023E38)
            java.lang.String r5 = r5.getString(r7)     // Catch:{ Exception -> 0x048a }
            r4.append(r5)     // Catch:{ Exception -> 0x048a }
            r4.append(r15)     // Catch:{ Exception -> 0x048a }
            r5 = 11
            int r5 = r9.get(r5)     // Catch:{ Exception -> 0x048a }
            java.lang.String r5 = r14.t(r5)     // Catch:{ Exception -> 0x048a }
            r4.append(r5)     // Catch:{ Exception -> 0x048a }
            r5 = 58
            r4.append(r5)     // Catch:{ Exception -> 0x048a }
            r5 = 12
            int r5 = r9.get(r5)     // Catch:{ Exception -> 0x048a }
            java.lang.String r5 = r14.t(r5)     // Catch:{ Exception -> 0x048a }
            r4.append(r5)     // Catch:{ Exception -> 0x048a }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x048a }
            goto L_0x026f
        L_0x026a:
            r3 = r8
            r4 = r3
            r0 = r18
            r2 = 0
        L_0x026f:
            int r5 = r10.length()     // Catch:{ Exception -> 0x048a }
            r7 = 1
            int r5 = r5 - r7
            r7 = 0
            r9 = 0
        L_0x0277:
            if (r9 > r5) goto L_0x029c
            if (r7 != 0) goto L_0x027d
            r11 = r9
            goto L_0x027e
        L_0x027d:
            r11 = r5
        L_0x027e:
            char r11 = r10.charAt(r11)     // Catch:{ Exception -> 0x048a }
            r14 = 32
            int r11 = kotlin.jvm.internal.m.h(r11, r14)     // Catch:{ Exception -> 0x048a }
            if (r11 > 0) goto L_0x028c
            r11 = 1
            goto L_0x028d
        L_0x028c:
            r11 = 0
        L_0x028d:
            if (r7 != 0) goto L_0x0296
            if (r11 != 0) goto L_0x0293
            r7 = 1
            goto L_0x0277
        L_0x0293:
            int r9 = r9 + 1
            goto L_0x0277
        L_0x0296:
            if (r11 != 0) goto L_0x0299
            goto L_0x029c
        L_0x0299:
            int r5 = r5 + -1
            goto L_0x0277
        L_0x029c:
            r7 = 1
            int r5 = r5 + r7
            java.lang.CharSequence r5 = r10.subSequence(r9, r5)     // Catch:{ Exception -> 0x048a }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x048a }
            int r9 = r13.length()     // Catch:{ Exception -> 0x048a }
            int r9 = r9 - r7
            r7 = 0
            r11 = 0
        L_0x02ad:
            if (r11 > r9) goto L_0x02d8
            if (r7 != 0) goto L_0x02b3
            r14 = r11
            goto L_0x02b4
        L_0x02b3:
            r14 = r9
        L_0x02b4:
            char r14 = r13.charAt(r14)     // Catch:{ Exception -> 0x048a }
            r22 = r2
            r2 = 32
            int r14 = kotlin.jvm.internal.m.h(r14, r2)     // Catch:{ Exception -> 0x048a }
            if (r14 > 0) goto L_0x02c4
            r14 = 1
            goto L_0x02c5
        L_0x02c4:
            r14 = 0
        L_0x02c5:
            if (r7 != 0) goto L_0x02d0
            if (r14 != 0) goto L_0x02cd
            r2 = r22
            r7 = 1
            goto L_0x02ad
        L_0x02cd:
            int r11 = r11 + 1
            goto L_0x02d5
        L_0x02d0:
            if (r14 != 0) goto L_0x02d3
            goto L_0x02da
        L_0x02d3:
            int r9 = r9 + -1
        L_0x02d5:
            r2 = r22
            goto L_0x02ad
        L_0x02d8:
            r22 = r2
        L_0x02da:
            r2 = 1
            int r9 = r9 + r2
            java.lang.CharSequence r2 = r13.subSequence(r11, r9)     // Catch:{ Exception -> 0x048a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x048a }
            boolean r2 = kotlin.jvm.internal.m.a(r5, r2)     // Catch:{ Exception -> 0x048a }
            java.lang.String r5 = "\n\r"
            if (r2 == 0) goto L_0x031e
            int r2 = r3.length()     // Catch:{ Exception -> 0x048a }
            if (r2 <= 0) goto L_0x02f4
            r2 = 1
            goto L_0x02f5
        L_0x02f4:
            r2 = 0
        L_0x02f5:
            if (r2 == 0) goto L_0x030a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x048a }
            r2.<init>()     // Catch:{ Exception -> 0x048a }
            r2.append(r8)     // Catch:{ Exception -> 0x048a }
            r2.append(r5)     // Catch:{ Exception -> 0x048a }
            r2.append(r3)     // Catch:{ Exception -> 0x048a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x048a }
            goto L_0x030b
        L_0x030a:
            r2 = r8
        L_0x030b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x048a }
            r3.<init>()     // Catch:{ Exception -> 0x048a }
            r3.append(r0)     // Catch:{ Exception -> 0x048a }
            r3.append(r15)     // Catch:{ Exception -> 0x048a }
            r3.append(r2)     // Catch:{ Exception -> 0x048a }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x048a }
            goto L_0x035e
        L_0x031e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x048a }
            r2.<init>()     // Catch:{ Exception -> 0x048a }
            r2.append(r0)     // Catch:{ Exception -> 0x048a }
            r2.append(r15)     // Catch:{ Exception -> 0x048a }
            np.com.nepalipatro.helpers.b r0 = np.com.nepalipatro.helpers.b.f15915a     // Catch:{ Exception -> 0x048a }
            java.lang.String r7 = "dd MMMM yyyy"
            java.lang.String r0 = r0.d(r12, r7)     // Catch:{ Exception -> 0x048a }
            r2.append(r0)     // Catch:{ Exception -> 0x048a }
            java.lang.String r0 = " \n\r"
            r2.append(r0)     // Catch:{ Exception -> 0x048a }
            int r0 = r3.length()     // Catch:{ Exception -> 0x048a }
            if (r0 != 0) goto L_0x0341
            r0 = 1
            goto L_0x0342
        L_0x0341:
            r0 = 0
        L_0x0342:
            if (r0 == 0) goto L_0x0345
            goto L_0x0357
        L_0x0345:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x048a }
            r0.<init>()     // Catch:{ Exception -> 0x048a }
            r0.append(r13)     // Catch:{ Exception -> 0x048a }
            r0.append(r5)     // Catch:{ Exception -> 0x048a }
            r0.append(r3)     // Catch:{ Exception -> 0x048a }
            java.lang.String r13 = r0.toString()     // Catch:{ Exception -> 0x048a }
        L_0x0357:
            r2.append(r13)     // Catch:{ Exception -> 0x048a }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x048a }
        L_0x035e:
            int r2 = r4.length()     // Catch:{ Exception -> 0x048a }
            if (r2 != 0) goto L_0x0366
            r2 = 1
            goto L_0x0367
        L_0x0366:
            r2 = 0
        L_0x0367:
            if (r2 == 0) goto L_0x036a
            goto L_0x037c
        L_0x036a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x048a }
            r2.<init>()     // Catch:{ Exception -> 0x048a }
            r2.append(r4)     // Catch:{ Exception -> 0x048a }
            r2.append(r6)     // Catch:{ Exception -> 0x048a }
            r2.append(r10)     // Catch:{ Exception -> 0x048a }
            java.lang.String r10 = r2.toString()     // Catch:{ Exception -> 0x048a }
        L_0x037c:
            r2 = 2
            android.net.Uri r3 = android.media.RingtoneManager.getDefaultUri(r2)     // Catch:{ Exception -> 0x048a }
            if (r3 != 0) goto L_0x038e
            r4 = 1
            android.net.Uri r3 = android.media.RingtoneManager.getDefaultUri(r4)     // Catch:{ Exception -> 0x048a }
            if (r3 != 0) goto L_0x038e
            android.net.Uri r3 = android.media.RingtoneManager.getDefaultUri(r2)     // Catch:{ Exception -> 0x048a }
        L_0x038e:
            ba.a r2 = ba.a.f13335a     // Catch:{ Exception -> 0x048a }
            android.content.Context r4 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            r2.e(r4)     // Catch:{ Exception -> 0x048a }
            android.content.Context r4 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            if (r4 == 0) goto L_0x03a0
            java.lang.String r5 = "notification"
            java.lang.Object r13 = r4.getSystemService(r5)     // Catch:{ Exception -> 0x048a }
            goto L_0x03a1
        L_0x03a0:
            r13 = 0
        L_0x03a1:
            java.lang.String r4 = "null cannot be cast to non-null type android.app.NotificationManager"
            kotlin.jvm.internal.m.d(r13, r4)     // Catch:{ Exception -> 0x048a }
            android.app.NotificationManager r13 = (android.app.NotificationManager) r13     // Catch:{ Exception -> 0x048a }
            androidx.core.app.l$e r4 = new androidx.core.app.l$e     // Catch:{ Exception -> 0x048a }
            android.content.Context r5 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            java.lang.String r6 = r2.i()     // Catch:{ Exception -> 0x048a }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x048a }
            androidx.core.app.l$e r3 = r4.K(r3)     // Catch:{ Exception -> 0x048a }
            r4 = 1
            androidx.core.app.l$e r3 = r3.l(r4)     // Catch:{ Exception -> 0x048a }
            androidx.core.app.l$e r3 = r3.r(r10)     // Catch:{ Exception -> 0x048a }
            androidx.core.app.l$e r3 = r3.z(r4)     // Catch:{ Exception -> 0x048a }
            android.content.Context r4 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x048a }
            java.lang.String r6 = E     // Catch:{ Exception -> 0x048a }
            r5.<init>(r6)     // Catch:{ Exception -> 0x048a }
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            r7 = 0
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r4, r7, r5, r6)     // Catch:{ Exception -> 0x048a }
            androidx.core.app.l$e r3 = r3.v(r4)     // Catch:{ Exception -> 0x048a }
            androidx.core.app.l$c r4 = new androidx.core.app.l$c     // Catch:{ Exception -> 0x048a }
            r4.<init>()     // Catch:{ Exception -> 0x048a }
            androidx.core.app.l$c r4 = r4.r(r0)     // Catch:{ Exception -> 0x048a }
            androidx.core.app.l$e r3 = r3.L(r4)     // Catch:{ Exception -> 0x048a }
            androidx.core.app.l$e r0 = r3.q(r0)     // Catch:{ Exception -> 0x048a }
            java.lang.String r3 = "Builder(mContext, Notifi…msg)).setContentText(msg)"
            kotlin.jvm.internal.m.e(r0, r3)     // Catch:{ Exception -> 0x048a }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x048a }
            r4 = 2131230901(0x7f0800b5, float:1.8077868E38)
            r5 = 21
            r6 = 2131623937(0x7f0e0001, float:1.887504E38)
            if (r3 < r5) goto L_0x03fe
            r0.J(r4)     // Catch:{ Exception -> 0x048a }
            goto L_0x0401
        L_0x03fe:
            r0.J(r6)     // Catch:{ Exception -> 0x048a }
        L_0x0401:
            android.content.Context r7 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ Exception -> 0x048a }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeResource(r7, r6)     // Catch:{ Exception -> 0x048a }
            r0.B(r7)     // Catch:{ Exception -> 0x048a }
            r7 = 24
            if (r3 < r7) goto L_0x0417
            java.lang.String r9 = f16149z     // Catch:{ Exception -> 0x048a }
            r0.y(r9)     // Catch:{ Exception -> 0x048a }
        L_0x0417:
            android.content.Intent r9 = new android.content.Intent     // Catch:{ Exception -> 0x048a }
            r9.<init>()     // Catch:{ Exception -> 0x048a }
            np.com.nepalipatro.helpers.f$a r11 = np.com.nepalipatro.helpers.f.f16022a     // Catch:{ Exception -> 0x048a }
            java.lang.String r12 = r11.c()     // Catch:{ Exception -> 0x048a }
            r9.putExtra(r12, r10)     // Catch:{ Exception -> 0x048a }
            java.lang.String r11 = r11.b()     // Catch:{ Exception -> 0x048a }
            r9.putExtra(r11, r8)     // Catch:{ Exception -> 0x048a }
            java.lang.String r8 = "IS_REMINDER"
            r11 = r23
            r9.putExtra(r8, r11)     // Catch:{ Exception -> 0x048a }
            java.lang.String r8 = O     // Catch:{ Exception -> 0x048a }
            android.app.PendingIntent r8 = r1.t(r9, r8)     // Catch:{ Exception -> 0x048a }
            r0.p(r8)     // Catch:{ Exception -> 0x048a }
            if (r3 < r7) goto L_0x0474
            androidx.core.app.l$e r7 = new androidx.core.app.l$e     // Catch:{ Exception -> 0x048a }
            android.content.Context r8 = r1.f16150a     // Catch:{ Exception -> 0x048a }
            java.lang.String r2 = r2.i()     // Catch:{ Exception -> 0x048a }
            r7.<init>(r8, r2)     // Catch:{ Exception -> 0x048a }
            r2 = 2131231087(0x7f08016f, float:1.8078245E38)
            androidx.core.app.l$e r2 = r7.J(r2)     // Catch:{ Exception -> 0x048a }
            androidx.core.app.l$e r2 = r2.r(r10)     // Catch:{ Exception -> 0x048a }
            r8 = 1
            androidx.core.app.l$e r2 = r2.A(r8)     // Catch:{ Exception -> 0x048a }
            androidx.core.app.l$e r2 = r2.l(r8)     // Catch:{ Exception -> 0x048a }
            java.lang.String r8 = f16149z     // Catch:{ Exception -> 0x048a }
            r2.y(r8)     // Catch:{ Exception -> 0x048a }
            if (r3 < r5) goto L_0x0468
            r7.J(r4)     // Catch:{ Exception -> 0x048a }
            goto L_0x046b
        L_0x0468:
            r7.J(r6)     // Catch:{ Exception -> 0x048a }
        L_0x046b:
            int r2 = f16145v     // Catch:{ Exception -> 0x048a }
            android.app.Notification r3 = r7.c()     // Catch:{ Exception -> 0x048a }
            r13.notify(r2, r3)     // Catch:{ Exception -> 0x048a }
        L_0x0474:
            if (r22 == 0) goto L_0x0480
            android.app.Notification r0 = r0.c()     // Catch:{ Exception -> 0x048a }
            r2 = r22
            r13.notify(r2, r0)     // Catch:{ Exception -> 0x048a }
            goto L_0x0496
        L_0x0480:
            android.app.Notification r0 = r0.c()     // Catch:{ Exception -> 0x048a }
            r2 = r16
            r13.notify(r2, r0)     // Catch:{ Exception -> 0x048a }
            goto L_0x0496
        L_0x048a:
            r0 = move-exception
            np.com.nepalipatro.helpers.g$a r2 = np.com.nepalipatro.helpers.g.f16048a
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0496
            r0.printStackTrace()
        L_0x0496:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.notification.AppNotifications.x(java.lang.String, java.lang.String, boolean):void");
    }

    public final void y() {
        long time = new Date().getTime() / ((long) 1000);
        k.a aVar = k.f16077a;
        if (time - aVar.g(this.f16150a, "last_shown_rashifal_notification", 0) >= 60) {
            k.a.z(aVar, this.f16150a, "last_shown_rashifal_notification", time, (String) null, 8, (Object) null);
            int g10 = (int) aVar.g(this.f16150a, aVar.r(), 0);
            if (g10 != -1) {
                String str = e.f15961a.Y()[1][g10];
                u9.a aVar2 = this.f16154e;
                String str2 = null;
                Cursor t10 = aVar2 != null ? aVar2.t("D") : null;
                String str3 = null;
                while (true) {
                    if (!(t10 != null ? t10.moveToNext() : false)) {
                        break;
                    } else if (t10 != null) {
                        str3 = t10.getString(t10.getColumnIndex(str));
                        str2 = t10.getString(t10.getColumnIndex(ShareConstants.WEB_DIALOG_PARAM_TITLE));
                    }
                }
                if (t10 != null) {
                    t10.close();
                }
                Uri defaultUri = RingtoneManager.getDefaultUri(2);
                if (defaultUri == null && (defaultUri = RingtoneManager.getDefaultUri(1)) == null) {
                    defaultUri = RingtoneManager.getDefaultUri(2);
                }
                if (str3 != null) {
                    ba.a aVar3 = ba.a.f13335a;
                    aVar3.f(this.f16150a);
                    String t11 = p.t(str3, new g9.f("^(\\S*\\s){15}").b(str3, ""), "", false, 4, (Object) null);
                    Object systemService = this.f16150a.getSystemService("notification");
                    m.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    NotificationManager notificationManager = (NotificationManager) systemService;
                    l.e q10 = new l.e(this.f16150a, aVar3.j()).K(defaultUri).l(true).G(true).z(1).L(new l.c().r(str2 + "\r\n\r\n" + t11 + " ...")).q(str2 + "\r\n\r\n" + t11 + " ...");
                    m.e(q10, "Builder(mContext, Notifi…$title\\r\\n\\r\\n$data ...\")");
                    q10.P(1);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 24) {
                        q10.y(f16147x);
                    }
                    l.a aVar4 = np.com.nepalipatro.helpers.l.f16129a;
                    if (aVar4.d(this.f16150a) == e.a.b.f16020i) {
                        String str4 = e.f15961a.Y()[1][g10];
                        StringBuilder sb = new StringBuilder();
                        String substring = str4.substring(0, 1);
                        m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        Locale locale = Locale.ROOT;
                        m.e(locale, "ROOT");
                        String upperCase = substring.toUpperCase(locale);
                        m.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
                        sb.append(upperCase);
                        String substring2 = str4.substring(1);
                        m.e(substring2, "this as java.lang.String).substring(startIndex)");
                        sb.append(substring2);
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder();
                        Context context = this.f16150a;
                        sb3.append(aVar4.k(context, aVar4.e(context), R.string.daily_horoscope));
                        sb3.append(" - ");
                        sb3.append(sb2);
                        q10.r(sb3.toString());
                    } else {
                        q10.r("दैनिक राशिफल - " + e.f15961a.Y()[0][g10]);
                    }
                    int identifier = this.f16150a.getResources().getIdentifier("ic_action_rashifal_" + aVar4.t(g10 + 1) + "_selected", "drawable", this.f16150a.getPackageName());
                    if (i10 >= 21) {
                        q10.J(identifier);
                    } else {
                        q10.J(R.mipmap.ic_launcher);
                    }
                    q10.B(BitmapFactory.decodeResource(this.f16150a.getResources(), R.mipmap.ic_launcher));
                    q10.p(t(new Intent(), L));
                    if (i10 >= 24) {
                        l.e eVar = new l.e(this.f16150a, aVar3.j());
                        eVar.J(identifier).l(true).A(true).y(f16147x).L(new l.c().r(str2 + "\r\n\r\n" + t11 + " ...")).q(str2 + "\r\n\r\n" + t11 + " ...");
                        q10.P(1);
                        notificationManager.notify(f16143t, eVar.c());
                    }
                    notificationManager.notify(f16137n, q10.c());
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppNotifications(Context context, Service service, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : service);
    }
}
