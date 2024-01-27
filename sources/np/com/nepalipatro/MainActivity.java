package np.com.nepalipatro;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import android.view.LayoutInflater;
import androidx.core.app.o;
import com.facebook.AccessToken;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.AlarmHelper;
import np.com.nepalipatro.helpers.c;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.j;
import np.com.nepalipatro.helpers.k;
import np.com.nepalipatro.helpers.l;
import np.com.nepalipatro.notification.AppNotifications;
import w9.b;
import w9.d;
import w9.f;
import w9.g;
import w9.v;

/* compiled from: MainActivity.kt */
public final class MainActivity extends FlutterActivity implements v.c {

    /* renamed from: h  reason: collision with root package name */
    private v f15876h;

    /* renamed from: i  reason: collision with root package name */
    private EventChannel.EventSink f15877i;

    /* renamed from: j  reason: collision with root package name */
    private IntentFilter f15878j;

    /* renamed from: k  reason: collision with root package name */
    private x9.a f15879k;

    /* renamed from: l  reason: collision with root package name */
    private MethodChannel.Result f15880l;

    /* renamed from: m  reason: collision with root package name */
    private final int f15881m = 201;

    /* compiled from: MainActivity.kt */
    public static final class a implements EventChannel.StreamHandler {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ MainActivity f15882h;

        a(MainActivity mainActivity) {
            this.f15882h = mainActivity;
        }

        public void onCancel(Object obj) {
        }

        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            m.f(eventSink, "events");
            this.f15882h.C(eventSink);
            this.f15882h.L(String.valueOf(obj), eventSink);
        }
    }

    /* compiled from: MainActivity.kt */
    public static final class b implements EventChannel.StreamHandler {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ MainActivity f15883h;

        b(MainActivity mainActivity) {
            this.f15883h = mainActivity;
        }

        public void onCancel(Object obj) {
        }

        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            String stringExtra = this.f15883h.getIntent().getStringExtra("app_widget_provider_news");
            if (stringExtra == null || stringExtra.length() == 0) {
                if (eventSink != null) {
                    eventSink.success("");
                }
            } else if (eventSink != null) {
                eventSink.success(stringExtra);
            }
        }
    }

    /* compiled from: MainActivity.kt */
    public static final class c implements v.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f15884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MainActivity f15885b;

        c(String str, MainActivity mainActivity) {
            this.f15884a = str;
            this.f15885b = mainActivity;
        }

        public void a() {
        }

        public void b(TextToSpeech textToSpeech) {
            if (this.f15884a.length() > 0) {
                this.f15885b.G(this.f15884a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("market://details?id=com.cinemagharhd.YoutubeVideoPlayerProject")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://play.google.com/store/apps/details?id=com.cinemagharhd.YoutubeVideoPlayerProject")));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            r3 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0032 }
            java.lang.String r2 = "com.cinemaghar.NEPALIPATRO"
            r1.<init>(r2)     // Catch:{ ActivityNotFoundException -> 0x0032 }
            java.lang.String r2 = "text/plain"
            r1.setType(r2)     // Catch:{ ActivityNotFoundException -> 0x0032 }
            java.lang.String r2 = "user-login-token"
            r1.putExtra(r2, r4)     // Catch:{ ActivityNotFoundException -> 0x0032 }
            java.lang.String r4 = "content-id"
            r1.putExtra(r4, r5)     // Catch:{ ActivityNotFoundException -> 0x0032 }
            java.lang.String r4 = "uniqueId"
            r1.putExtra(r4, r6)     // Catch:{ ActivityNotFoundException -> 0x0032 }
            java.lang.String r4 = "id"
            r1.putExtra(r4, r7)     // Catch:{ ActivityNotFoundException -> 0x0032 }
            java.lang.String r4 = "device-id"
            r1.putExtra(r4, r8)     // Catch:{ ActivityNotFoundException -> 0x0032 }
            if (r9 == 0) goto L_0x002e
            java.lang.String r4 = "encryption_enable"
            r1.putExtra(r4, r9)     // Catch:{ ActivityNotFoundException -> 0x0032 }
        L_0x002e:
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x0032 }
            goto L_0x004f
        L_0x0032:
            android.content.Intent r4 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0041 }
            java.lang.String r5 = "market://details?id=com.cinemagharhd.YoutubeVideoPlayerProject"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ ActivityNotFoundException -> 0x0041 }
            r4.<init>(r0, r5)     // Catch:{ ActivityNotFoundException -> 0x0041 }
            r3.startActivity(r4)     // Catch:{ ActivityNotFoundException -> 0x0041 }
            goto L_0x004f
        L_0x0041:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "https://play.google.com/store/apps/details?id=com.cinemagharhd.YoutubeVideoPlayerProject"
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r4.<init>(r0, r5)
            r3.startActivity(r4)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.MainActivity.A(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    private final void B() {
        l.f16129a.A(this, aa.a.class);
    }

    private final void D(String str, Object obj) {
        m.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj;
        if (p.m(str, AccessToken.DEFAULT_GRAPH_DOMAIN, true)) {
            E(str2);
        } else if (p.m(str, "tweet", true)) {
            F(str2, "", "", "Nepali Patro");
        } else {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.TEXT", str2);
            startActivity(intent);
        }
    }

    private final void E(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        boolean z10 = false;
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
        m.e(queryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            String str2 = next.activityInfo.packageName;
            m.e(str2, "info.activityInfo.packageName");
            Locale locale = Locale.ROOT;
            m.e(locale, "ROOT");
            String lowerCase = str2.toLowerCase(locale);
            m.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (p.v(lowerCase, "com.facebook.katana", false, 2, (Object) null)) {
                intent.setPackage(next.activityInfo.packageName);
                z10 = true;
                break;
            }
        }
        if (!z10) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/sharer/sharer.php?u=" + str));
        }
        startActivity(intent);
    }

    private final void F(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("https://twitter.com/intent/tweet?");
        if (!TextUtils.isEmpty(str3)) {
            sb.append("&via=");
            sb.append(O(str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("hashtags=");
            sb.append(O(str4));
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("&url=");
            sb.append(O(str));
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
        m.e(queryIntentActivities, "getPackageManager().quer…tentActivities(intent, 0)");
        for (ResolveInfo next : queryIntentActivities) {
            String str5 = next.activityInfo.packageName;
            m.e(str5, "info.activityInfo.packageName");
            Locale locale = Locale.ROOT;
            m.e(locale, "ROOT");
            String lowerCase = str5.toLowerCase(locale);
            m.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (p.v(lowerCase, "com.twitter", false, 2, (Object) null)) {
                intent.setPackage(next.activityInfo.packageName);
            }
        }
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    public final void G(String str) {
        try {
            v vVar = this.f15876h;
            if (vVar != null) {
                vVar.E(str, new Locale("ne"), "Blog", "Label", this);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void H() {
        getWindow().setFlags(8192, 8192);
    }

    private final void I() {
        getWindow().clearFlags(8192);
    }

    private final void J() {
        v vVar = this.f15876h;
        if (vVar != null) {
            vVar.R();
        }
    }

    private final void K() {
        AlarmHelper alarmHelper = AlarmHelper.f15890a;
        Context applicationContext = getApplicationContext();
        m.e(applicationContext, "applicationContext");
        alarmHelper.v(applicationContext);
    }

    /* access modifiers changed from: private */
    public final void L(String str, EventChannel.EventSink eventSink) {
        v vVar = this.f15876h;
        if (vVar != null) {
            vVar.o(new c(str, this));
        }
    }

    private final void M() {
        l.f16129a.z(this);
    }

    private final void N() {
    }

    private final String O(String str) {
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            m.e(encode, "encode(s, \"UTF-8\")");
            return encode;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("URLEncoder.encode() failed for " + str);
        }
    }

    private final void d(MethodChannel.Result result) {
        if (l.f16129a.n(this, e.f15961a.R())) {
            if (d.f17050a.a(this)) {
                if (result != null) {
                    result.success(2);
                }
            } else if (result != null) {
                result.success(1);
            }
        } else if (result != null) {
            result.success(0);
        }
    }

    private final void e(MethodChannel.Result result) {
        if (d.f17050a.a(this)) {
            if (result != null) {
                result.success(Boolean.TRUE);
            }
        } else if (result != null) {
            result.success(Boolean.FALSE);
        }
    }

    private final void f() {
        k.a aVar = k.f16077a;
        if (aVar.c(this, aVar.u(), true)) {
            Object systemService = getSystemService("notification");
            m.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(AppNotifications.f16131h.m());
            l.a aVar2 = l.f16129a;
            Context applicationContext = getApplicationContext();
            m.e(applicationContext, "applicationContext");
            aVar2.y(applicationContext);
            return;
        }
        l.a aVar3 = l.f16129a;
        Context applicationContext2 = getApplicationContext();
        m.e(applicationContext2, "applicationContext");
        aVar3.y(applicationContext2);
        Object systemService2 = getSystemService("notification");
        m.d(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        AppNotifications.a aVar4 = AppNotifications.f16131h;
        ((NotificationManager) systemService2).cancel(aVar4.m());
        aVar4.p(Boolean.FALSE);
    }

    private final void g(Object obj, Object obj2) {
        if (obj.equals(np.com.nepalipatro.helpers.c.f15921a.i())) {
            g.f17059a.a(obj2.toString(), this);
        }
    }

    private final void h(MethodChannel.Result result) {
        l.a aVar = l.f16129a;
        if (aVar.n(this, "np.com.nepalipatro.keyboard")) {
            aVar.s(this, "np.com.nepalipatro.keyboard");
        } else {
            aVar.r(this, "np.com.nepalipatro.keyboard");
        }
    }

    private final void i() {
        AlarmHelper alarmHelper = AlarmHelper.f15890a;
        Context applicationContext = getApplicationContext();
        m.e(applicationContext, "applicationContext");
        alarmHelper.v(applicationContext);
    }

    private final void l(MethodChannel.Result result, Object obj) {
        try {
            m.d(obj, "null cannot be cast to non-null type kotlin.String");
            getPackageManager().getPackageInfo((String) obj, 0);
            result.success(Boolean.TRUE);
        } catch (Exception unused) {
            result.success(Boolean.FALSE);
        }
    }

    private final void m(MethodChannel.Result result) {
        new f(result, this).c();
    }

    private final void n(MethodChannel.Result result) {
        result.success(Boolean.valueOf(o.b(getContext()).a()));
    }

    private final void q(MainActivity mainActivity, Object obj, Object obj2, MethodChannel.Result result) {
        String obj3 = obj.toString();
        c.a aVar = np.com.nepalipatro.helpers.c.f15921a;
        if (p.m(obj3, aVar.d(), true)) {
            boolean m10 = l.f16129a.m(mainActivity, obj2.toString());
            if (result != null) {
                result.success(Boolean.valueOf(m10));
            }
        } else if (p.m(obj.toString(), aVar.g(), true)) {
            String l10 = l.f16129a.l();
            if (result != null) {
                result.success(l10);
            }
        } else if (p.m(obj.toString(), aVar.e(), true)) {
            l.f16129a.p(this, obj2.toString());
        } else if (p.m(obj.toString(), aVar.j(), true)) {
            l.f16129a.q(this, obj2.toString());
        } else if (p.m(obj.toString(), aVar.f(), true)) {
            int c10 = l.f16129a.c();
            if (result != null) {
                result.success(Integer.valueOf(c10));
            }
        } else {
            obj.toString().equals(aVar.h());
        }
    }

    private final void r(FlutterEngine flutterEngine) {
        BinaryMessenger binaryMessenger = flutterEngine.getDartExecutor().getBinaryMessenger();
        c.a aVar = np.com.nepalipatro.helpers.c.f15921a;
        new MethodChannel(binaryMessenger, aVar.J()).setMethodCallHandler(new t9.a(this));
        new EventChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), aVar.I()).setStreamHandler(new a(this));
        new EventChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), aVar.K()).setStreamHandler(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void s(MainActivity mainActivity, MethodCall methodCall, MethodChannel.Result result) {
        m.f(mainActivity, "this$0");
        m.f(methodCall, "methodCall");
        m.f(result, "result");
        Object obj = methodCall.arguments;
        m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        mainActivity.f15880l = result;
        int i10 = 0;
        Object obj2 = list.get(0);
        String str = "";
        String str2 = obj2 == null ? str : obj2;
        boolean z10 = true;
        Object obj3 = list.get(1);
        if (obj3 == null) {
            obj3 = str;
        }
        Object obj4 = list.get(2);
        Object obj5 = obj4 == null ? str : obj4;
        if (list.size() == 5) {
            Object obj6 = list.get(3);
            m.d(obj6, "null cannot be cast to non-null type kotlin.Int");
            i10 = ((Integer) obj6).intValue();
            Object obj7 = list.get(4);
            m.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
            z10 = ((Boolean) obj7).booleanValue();
        }
        g.a aVar = np.com.nepalipatro.helpers.g.f16048a;
        aVar.b("MAINACTIVITYMETHODCALL->>" + methodCall.method);
        String str3 = methodCall.method;
        c.a aVar2 = np.com.nepalipatro.helpers.c.f15921a;
        if (m.a(str3, aVar2.C())) {
            mainActivity.J();
        } else if (m.a(str3, aVar2.o())) {
            j.f16076a.a(mainActivity, obj3, obj5);
        } else if (m.a(str3, aVar2.G())) {
            mainActivity.q(mainActivity, obj3, obj5, result);
        } else if (m.a(str3, aVar2.p())) {
            mainActivity.f();
        } else if (m.a(str3, aVar2.q())) {
            mainActivity.u();
        } else if (m.a(str3, aVar2.m())) {
            mainActivity.g(obj3, obj5);
        } else if (m.a(str3, aVar2.a())) {
            x9.a aVar3 = mainActivity.f15879k;
            if (aVar3 != null) {
                aVar3.a(list, result);
            }
        } else if (m.a(str3, aVar2.b())) {
            x9.a aVar4 = mainActivity.f15879k;
            if (aVar4 != null) {
                aVar4.b(list, result);
            }
        } else if (m.a(str3, aVar2.D())) {
            mainActivity.K();
        } else if (m.a(str3, aVar2.c())) {
            mainActivity.o();
        } else if (m.a(str3, aVar2.y())) {
            mainActivity.i();
        } else if (m.a(str3, aVar2.E())) {
            mainActivity.M();
        } else if (m.a(str3, aVar2.t())) {
            mainActivity.y(str2, obj3.toString(), obj5, Integer.valueOf(i10), Boolean.valueOf(z10));
        } else if (m.a(str3, aVar2.z())) {
            mainActivity.D(obj3.toString(), obj5);
        } else if (m.a(str3, aVar2.F())) {
            mainActivity.N();
        } else if (m.a(str3, aVar2.u())) {
            String obj8 = obj5.toString();
            if (obj8 != null) {
                str = obj8;
            }
            mainActivity.z(str);
        } else if (m.a(str3, aVar2.l())) {
            mainActivity.d(result);
        } else if (m.a(str3, aVar2.n())) {
            mainActivity.e(result);
        } else if (m.a(str3, aVar2.s())) {
            mainActivity.h(result);
        } else if (m.a(str3, aVar2.x())) {
            mainActivity.B();
        } else if (m.a(str3, aVar2.A())) {
            mainActivity.H();
        } else if (m.a(str3, aVar2.B())) {
            mainActivity.I();
        } else if (m.a(str3, aVar2.w())) {
            mainActivity.m(result);
        } else if (m.a(str3, aVar2.k())) {
            mainActivity.l(result, obj5);
        } else if (m.a(str3, aVar2.r())) {
            mainActivity.x(obj3.toString(), obj5, list.get(3));
        } else if (m.a(str3, aVar2.H())) {
            mainActivity.n(result);
        }
    }

    private final void t() {
        IntentFilter intentFilter = new IntentFilter();
        this.f15878j = intentFilter;
        intentFilter.addAction("android.intent.action.TIME_TICK");
        IntentFilter intentFilter2 = this.f15878j;
        if (intentFilter2 != null) {
            intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
        }
        IntentFilter intentFilter3 = this.f15878j;
        if (intentFilter3 != null) {
            intentFilter3.addAction("android.intent.action.TIME_SET");
        }
        IntentFilter intentFilter4 = this.f15878j;
        if (intentFilter4 != null) {
            intentFilter4.addAction("android.intent.action.DATE_CHANGED");
        }
        IntentFilter intentFilter5 = this.f15878j;
        if (intentFilter5 != null) {
            intentFilter5.addAction("android.intent.action.SCREEN_OFF");
        }
        IntentFilter intentFilter6 = this.f15878j;
        if (intentFilter6 != null) {
            intentFilter6.addAction("android.intent.action.SCREEN_ON");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        if (r4 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r4 != null) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void v(java.lang.String r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.String r0 = "SEARCH_EXT_BROWSER"
            boolean r0 = r4.equals(r0)
            java.lang.String r1 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>"
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0040
            r6.g r4 = new r6.g
            r4.<init>()
            r6.f r4 = r4.b()
            kotlin.jvm.internal.m.d(r5, r1)
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.String r4 = r4.q(r5)
            r6.f r5 = new r6.f
            r5.<init>()
            java.lang.String r4 = r4.toString()
            java.lang.Class<np.com.nepalipatro.models.SearchResponseModel$Hit> r0 = np.com.nepalipatro.models.SearchResponseModel.Hit.class
            java.lang.Object r4 = r5.h(r4, r0)
            np.com.nepalipatro.models.SearchResponseModel$Hit r4 = (np.com.nepalipatro.models.SearchResponseModel.Hit) r4
            if (r4 == 0) goto L_0x0066
            np.com.nepalipatro.models.SearchResponseModel$Source r4 = r4.getSource()
            if (r4 == 0) goto L_0x0066
            java.lang.String r4 = r4.getLink()
            if (r4 != 0) goto L_0x003e
            goto L_0x0066
        L_0x003e:
            r2 = r4
            goto L_0x0066
        L_0x0040:
            java.lang.String r0 = "FCM_NEWS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0051
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.m.d(r5, r4)
            r2 = r5
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0066
        L_0x0051:
            kotlin.jvm.internal.m.d(r5, r1)
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.String r4 = "link"
            boolean r0 = r5.containsKey(r4)
            if (r0 == 0) goto L_0x0066
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x003e
        L_0x0066:
            int r4 = r2.length()
            r5 = 1
            if (r4 != 0) goto L_0x006f
            r4 = 1
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            if (r4 == 0) goto L_0x007c
            java.lang.String r4 = "Could not complete your task at the moment."
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r5)
            r4.show()
            return
        L_0x007c:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.VIEW"
            r4.<init>(r5)
            android.net.Uri r5 = android.net.Uri.parse(r2)
            r4.setData(r5)
            r3.startActivity(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.MainActivity.v(java.lang.String, java.lang.Object):void");
    }

    private final void w(String str, String str2, Object obj, int i10, boolean z10) {
    }

    private final void x(String str, Object obj, Object obj2) {
        if (m.a(str, np.com.nepalipatro.helpers.c.f15921a.v())) {
            m.d(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>");
            HashMap hashMap = (HashMap) obj;
            m.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            String.valueOf(booleanValue);
            String valueOf = String.valueOf(hashMap.get("user-login-token"));
            String valueOf2 = String.valueOf(hashMap.get("content-id"));
            String valueOf3 = String.valueOf(hashMap.get("unique-id"));
            String valueOf4 = String.valueOf(hashMap.get("id"));
            String valueOf5 = String.valueOf(hashMap.get("device-id"));
            if (booleanValue) {
                StringBuilder sb = new StringBuilder();
                sb.append("Token ");
                sb.append(valueOf);
                sb.append(" contentID ");
                sb.append(valueOf2);
                valueOf = new b.a().b(valueOf);
                new b.a().a(valueOf);
            }
            A(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, booleanValue);
        }
    }

    private final void y(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        try {
            switch (str.hashCode()) {
                case -1853007448:
                    if (str.equals(ViewHierarchyConstants.SEARCH)) {
                        m.d(obj, "null cannot be cast to non-null type kotlin.String");
                        m.c(obj2);
                        m.d(obj3, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) obj3).intValue();
                        m.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        w((String) obj, str, obj2, intValue, ((Boolean) obj4).booleanValue());
                        return;
                    }
                    return;
                case -929551742:
                    if (str.equals("FCM_NEWS")) {
                        m.d(obj, "null cannot be cast to non-null type kotlin.String");
                        m.c(obj2);
                        m.d(obj3, "null cannot be cast to non-null type kotlin.Int");
                        int intValue2 = ((Integer) obj3).intValue();
                        m.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        w((String) obj, str, obj2, intValue2, ((Boolean) obj4).booleanValue());
                        return;
                    }
                    return;
                case 2153886:
                    if (str.equals("FEED")) {
                        m.d(obj, "null cannot be cast to non-null type kotlin.String");
                        m.c(obj2);
                        m.d(obj3, "null cannot be cast to non-null type kotlin.Int");
                        int intValue3 = ((Integer) obj3).intValue();
                        m.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        w((String) obj, str, obj2, intValue3, ((Boolean) obj4).booleanValue());
                        return;
                    }
                    return;
                case 367679155:
                    if (str.equals("SEARCH_EXT_BROWSER")) {
                        v(str, obj2);
                        return;
                    }
                    return;
                case 2117704105:
                    if (str.equals("FEED_EXT_BROWSER")) {
                        v(str, obj2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        e10.printStackTrace();
    }

    private final void z(String str) {
    }

    public final void C(EventChannel.EventSink eventSink) {
        this.f15877i = eventSink;
    }

    public void a() {
        EventChannel.EventSink eventSink = this.f15877i;
        if (eventSink != null) {
            eventSink.success("stopped");
        }
    }

    public void b() {
        EventChannel.EventSink eventSink = this.f15877i;
        if (eventSink != null) {
            eventSink.success("speaking");
        }
    }

    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
        m.f(flutterEngine, "flutterEngine");
        super.cleanUpFlutterEngine(flutterEngine);
        GoogleMobileAdsPlugin.unregisterNativeAdFactory(flutterEngine, "NpNativeAd");
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        m.f(flutterEngine, "flutterEngine");
        super.configureFlutterEngine(flutterEngine);
        t();
        LayoutInflater layoutInflater = getLayoutInflater();
        m.e(layoutInflater, "layoutInflater");
        Context context = getContext();
        m.e(context, "context");
        GoogleMobileAdsPlugin.registerNativeAdFactory(flutterEngine, "NpNativeAd", (GoogleMobileAdsPlugin.NativeAdFactory) new t9.b(layoutInflater, context));
        this.f15879k = new x9.a(this);
        this.f15876h = new v(this);
        r(flutterEngine);
        new np.com.nepalipatro.helpers.a(getIntent(), flutterEngine);
    }

    public final void o() {
        File file = new File(getCacheDir().getParent());
        if (file.exists()) {
            String[] list = file.list();
            m.e(list, "children");
            for (String str : list) {
                if (!str.equals("lib")) {
                    p(new File(file, str));
                    StringBuilder sb = new StringBuilder();
                    sb.append("File /data/data/APP_PACKAGE/");
                    sb.append(str);
                    sb.append(" DELETED");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 12345) {
            try {
                v vVar = this.f15876h;
                if (vVar != null) {
                    vVar.U(i10, i11);
                }
            } catch (Exception unused) {
            }
        } else if (i11 != 0 && i10 == this.f15881m && i11 == -1) {
            try {
                MethodChannel.Result result = this.f15880l;
                if (result != null) {
                    result.success(Boolean.TRUE);
                }
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
        }
    }

    public void onCompleted() {
        EventChannel.EventSink eventSink = this.f15877i;
        if (eventSink != null) {
            eventSink.success("completed");
        }
    }

    public void onDestroy() {
        PlatformViewsController platformViewsController;
        v vVar = this.f15876h;
        if (vVar != null) {
            vVar.R();
        }
        try {
            FlutterEngine flutterEngine = getFlutterEngine();
            if (!(flutterEngine == null || (platformViewsController = flutterEngine.getPlatformViewsController()) == null)) {
                platformViewsController.destroyOverlaySurfaces();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onDestroy();
    }

    public void onError() {
        EventChannel.EventSink eventSink = this.f15877i;
        if (eventSink != null) {
            eventSink.success("error");
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        m.f(intent, "intent");
        super.onNewIntent(intent);
    }

    public void onPause() {
        super.onPause();
        v vVar = this.f15876h;
        if (vVar != null) {
            vVar.R();
        }
    }

    public final boolean p(File file) {
        if (file != null && file.isDirectory()) {
            String[] list = file.list();
            m.e(list, "children");
            for (String file2 : list) {
                if (!p(new File(file, file2))) {
                    return false;
                }
            }
        }
        m.c(file);
        return file.delete();
    }

    public final void u() {
        AlarmHelper alarmHelper = AlarmHelper.f15890a;
        Context applicationContext = getApplicationContext();
        m.e(applicationContext, "applicationContext");
        alarmHelper.q(applicationContext);
    }
}
