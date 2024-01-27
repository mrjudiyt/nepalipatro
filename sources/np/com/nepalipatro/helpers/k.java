package np.com.nepalipatro.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: PrefsUtils.kt */
public final class k {
    private static final String A = "RMI";
    /* access modifiers changed from: private */
    public static final String A0 = "fcm_token_sent";
    private static String B = "LPRT";
    private static final String B0 = "PREF_DAYDETAIL_DATA";
    private static final String C = "RPC";
    /* access modifiers changed from: private */
    public static final String C0 = "PREFS_AUTH_TOKEN";
    private static final String D = "prefs_isfristrun_splash";
    /* access modifiers changed from: private */
    public static final String D0 = "PREFS_JWT_TOKEN";
    private static final String E = "modules_order";
    private static final String E0 = "LAST_SCHEDULED_REFRESH";
    private static String F = "listPrefCalendarDayClickOption";
    private static String G = "bookmarkingdemo";
    private static final String H = "ls_group";
    private static final String I = "ls_locatino";
    private static final String J = "ls_time_format";
    private static final String K = "ls_notification";
    private static final String L = "ls_on_notification";
    private static final String M = "ls_off_notification";
    private static final String N = "ls_sticky";
    private static final String O = "ls_notification_isvisible";
    private static final String P = "ls_notif_interval";
    private static final String Q = "isscreenon";
    private static final String R = "isnotificationvisible";
    private static final String S = "lsstatus";
    private static final String T = "lsfirstopen";
    private static final String U = "LULT";
    private static final String V = "LAST_UPDATE_FEED_TIMESTAMP";
    private static final String W = "LAST_UPDATE_SOURCE_TIMESTAMP";
    private static final String X = "notifications.enabled";
    private static final String Y = "news_enable_refresh";
    private static final String Z = "news_refresh_interval";

    /* renamed from: a  reason: collision with root package name */
    public static final a f16077a = new a((g) null);

    /* renamed from: a0  reason: collision with root package name */
    private static final String f16078a0 = "news_entry_keep_time";
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f16079b = "background_manager_callbackhandler";

    /* renamed from: b0  reason: collision with root package name */
    private static final String f16080b0 = "news_text_size";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f16081c = "background_manager_callback";

    /* renamed from: c0  reason: collision with root package name */
    private static final String f16082c0 = "news_image_fetch_mode";
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String f16083d = "PREFS_USER_ID";

    /* renamed from: d0  reason: collision with root package name */
    private static final String f16084d0 = "news_entry_default_read_mode";
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f16085e = "PREF_EVENTSYNC_TIMESTAMP";

    /* renamed from: e0  reason: collision with root package name */
    private static final String f16086e0 = "news_notification_special_news";

    /* renamed from: f  reason: collision with root package name */
    private static final String f16087f = "BOOT_RECEIVER_ENABLED";

    /* renamed from: f0  reason: collision with root package name */
    private static final String f16088f0 = "news_notification_standard_news";

    /* renamed from: g  reason: collision with root package name */
    private static final String f16089g = "day_detail_tip_show";

    /* renamed from: g0  reason: collision with root package name */
    private static final String f16090g0 = "news_notification_standard_ringtone";

    /* renamed from: h  reason: collision with root package name */
    private static final String f16091h = "calendar_today_tip_show";

    /* renamed from: h0  reason: collision with root package name */
    private static final String f16092h0 = "news_notification_standard_vibrate";

    /* renamed from: i  reason: collision with root package name */
    private static final String f16093i = "news_pager_tip_show";

    /* renamed from: i0  reason: collision with root package name */
    private static final String f16094i0 = "news_notification_standard_light";

    /* renamed from: j  reason: collision with root package name */
    private static final String f16095j = "forex_tip_show";

    /* renamed from: j0  reason: collision with root package name */
    private static final String f16096j0 = "nvc";

    /* renamed from: k  reason: collision with root package name */
    private static final String f16097k = "suva_sait_tip_show";

    /* renamed from: k0  reason: collision with root package name */
    private static final String f16098k0 = "news_interstitial_counter";

    /* renamed from: l  reason: collision with root package name */
    private static final String f16099l = "rashifal_tip_show";

    /* renamed from: l0  reason: collision with root package name */
    private static final String f16100l0 = "pref_news_show_read";

    /* renamed from: m  reason: collision with root package name */
    private static final String f16101m = "tip_bookmark";

    /* renamed from: m0  reason: collision with root package name */
    private static final String f16102m0 = "pref_news_show_all_list";

    /* renamed from: n  reason: collision with root package name */
    private static final String f16103n = "tip_newsbrowser";

    /* renamed from: n0  reason: collision with root package name */
    private static final String f16104n0 = "prefs_news_filter_source_id";

    /* renamed from: o  reason: collision with root package name */
    private static final String f16105o = "app_tour";
    /* access modifiers changed from: private */

    /* renamed from: o0  reason: collision with root package name */
    public static final String f16106o0 = "customPrefNotificationTime";

    /* renamed from: p  reason: collision with root package name */
    private static final String f16107p = "lastUpdateTime";
    /* access modifiers changed from: private */

    /* renamed from: p0  reason: collision with root package name */
    public static final String f16108p0 = "listPrefNotificationTimeZone";

    /* renamed from: q  reason: collision with root package name */
    private static final String f16109q = "checkPrefAutoUpdateAppData";
    /* access modifiers changed from: private */

    /* renamed from: q0  reason: collision with root package name */
    public static String f16110q0 = "checkPrefStickyNotification";
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final String f16111r = "PREFERRED_LANGUAGE";
    /* access modifiers changed from: private */

    /* renamed from: r0  reason: collision with root package name */
    public static final String f16112r0 = "checkPrefNormalNotification";
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final String f16113s = "PREFS_NEWS_WIDGET_REFRESH_TIME";

    /* renamed from: s0  reason: collision with root package name */
    private static final String f16114s0 = "listPrefStickyNotificationColor";

    /* renamed from: t  reason: collision with root package name */
    private static String f16115t = "reloadmessage";
    /* access modifiers changed from: private */

    /* renamed from: t0  reason: collision with root package name */
    public static final String f16116t0 = "checkPrefSendNotification";

    /* renamed from: u  reason: collision with root package name */
    private static final String f16117u = "listPrefDayImage";
    /* access modifiers changed from: private */

    /* renamed from: u0  reason: collision with root package name */
    public static final String f16118u0 = "PREF_DEFAULT_RASHIFAL";

    /* renamed from: v  reason: collision with root package name */
    private static final String f16119v = "dayImageFailedInterval";
    /* access modifiers changed from: private */

    /* renamed from: v0  reason: collision with root package name */
    public static final String f16120v0 = "PREFS_SELECTED_LANGUAGE";
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static final String f16121w = "LUMTV2";

    /* renamed from: w0  reason: collision with root package name */
    private static final String f16122w0 = "PREFERRED_THEME";

    /* renamed from: x  reason: collision with root package name */
    private static final String f16123x = "LUCT";
    /* access modifiers changed from: private */

    /* renamed from: x0  reason: collision with root package name */
    public static final String f16124x0 = "checkPrefHoroscopeNotifiy";
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public static final String f16125y = "LUPT";
    /* access modifiers changed from: private */

    /* renamed from: y0  reason: collision with root package name */
    public static final String f16126y0 = "checkPrefHoroscopeNotifiyPrefechTime";

    /* renamed from: z  reason: collision with root package name */
    private static final String f16127z = "RMT";

    /* renamed from: z0  reason: collision with root package name */
    private static final String f16128z0 = "checkPrefMyEventsToday";

    /* compiled from: PrefsUtils.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public static /* synthetic */ void z(a aVar, Context context, String str, long j10, String str2, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                str2 = "";
            }
            aVar.y(context, str, j10, str2);
        }

        public final void A(Context context, String str, String str2) {
            m.f(context, "context");
            m.f(str, Constants.KEY);
            m.f(str2, "value");
            SharedPreferences.Editor edit = context.getSharedPreferences("FlutterSharedPreferences", 0).edit();
            edit.putString("flutter." + str, str2);
            edit.apply();
        }

        public final String a() {
            return k.f16081c;
        }

        public final String b() {
            return k.f16079b;
        }

        public final boolean c(Context context, String str, boolean z10) {
            m.f(context, "context");
            m.f(str, Constants.KEY);
            SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSharedPreferences", 0);
            return sharedPreferences.getBoolean("flutter." + str, z10);
        }

        public final String d() {
            return k.A0;
        }

        public final String e() {
            return k.f16121w;
        }

        public final String f() {
            return k.f16125y;
        }

        public final long g(Context context, String str, long j10) {
            m.f(context, "context");
            m.f(str, Constants.KEY);
            SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSharedPreferences", 0);
            String str2 = "flutter." + str;
            try {
                return sharedPreferences.getLong(str2, j10);
            } catch (Exception unused) {
                String string = sharedPreferences.getString(str2, "-1");
                if (m.a(string, "-1")) {
                    return j10;
                }
                m.c(string);
                return Long.parseLong(string);
            }
        }

        public final String h() {
            return k.f16111r;
        }

        public final String i() {
            return k.D0;
        }

        public final String j() {
            return k.f16113s;
        }

        public final String k() {
            return k.f16120v0;
        }

        public final String l() {
            return k.C0;
        }

        public final String m() {
            return k.f16116t0;
        }

        public final String n() {
            return k.f16085e;
        }

        public final String o() {
            return k.f16112r0;
        }

        public final String p() {
            return k.f16106o0;
        }

        public final String q() {
            return k.f16108p0;
        }

        public final String r() {
            return k.f16118u0;
        }

        public final String s() {
            return k.f16124x0;
        }

        public final String t() {
            return k.f16126y0;
        }

        public final String u() {
            return k.f16110q0;
        }

        public final String v() {
            return k.f16083d;
        }

        public final String w(Context context, String str, String str2) {
            m.f(context, "context");
            m.f(str, Constants.KEY);
            m.f(str2, "defValue");
            SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSharedPreferences", 0);
            return sharedPreferences.getString("flutter." + str, str2);
        }

        public final void x(Context context, String str, boolean z10) {
            m.f(context, "context");
            m.f(str, Constants.KEY);
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            edit.putBoolean(str, z10);
            edit.apply();
        }

        public final void y(Context context, String str, long j10, String str2) {
            m.f(context, "context");
            m.f(str, Constants.KEY);
            m.f(str2, "flutterKey");
            if (str2.length() == 0) {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                edit.putLong(str, j10);
                edit.apply();
                return;
            }
            SharedPreferences.Editor edit2 = context.getSharedPreferences(str2, 0).edit();
            try {
                edit2.putLong("flutter." + str, j10).apply();
            } catch (Exception unused) {
            }
        }
    }
}
