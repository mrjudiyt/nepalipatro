package np.com.nepalipatro;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.flutter.app.FlutterApplication;
import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.AlarmHelper;
import np.com.nepalipatro.helpers.d;
import np.com.nepalipatro.helpers.l;
import z9.b;

/* compiled from: App.kt */
public final class App extends FlutterApplication implements PluginRegistry.PluginRegistrantCallback {

    /* renamed from: k  reason: collision with root package name */
    public static final a f15871k = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static boolean f15872l;

    /* renamed from: h  reason: collision with root package name */
    private AlarmHelper.AlarmBroadcastReceiver f15873h;

    /* renamed from: i  reason: collision with root package name */
    private FirebaseRemoteConfig f15874i;

    /* renamed from: j  reason: collision with root package name */
    private b f15875j;

    /* compiled from: App.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final boolean a() {
            return App.f15872l;
        }
    }

    private final void d() {
        Context applicationContext = getApplicationContext();
        m.e(applicationContext, "applicationContext");
        this.f15875j = new b(applicationContext);
    }

    private final void e() {
        if (this.f15874i == null) {
            this.f15874i = FirebaseRemoteConfig.getInstance();
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        s0.a.k(this);
    }

    public final b b() {
        return this.f15875j;
    }

    public final FirebaseRemoteConfig c() {
        return this.f15874i;
    }

    public void onCreate() {
        super.onCreate();
        s0.a.k(this);
        AlarmHelper.AlarmBroadcastReceiver alarmBroadcastReceiver = new AlarmHelper.AlarmBroadcastReceiver();
        this.f15873h = alarmBroadcastReceiver;
        registerReceiver(alarmBroadcastReceiver, d.f15947a.k());
        f15872l = true;
        l.a aVar = l.f16129a;
        Context applicationContext = getApplicationContext();
        m.e(applicationContext, "applicationContext");
        aVar.w(applicationContext);
        d();
        e();
        try {
            aVar.y(this);
            Context applicationContext2 = getApplicationContext();
            m.e(applicationContext2, "applicationContext");
            aVar.z(applicationContext2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void onTerminate() {
        try {
            unregisterReceiver(this.f15873h);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onTerminate();
    }

    public void registerWith(PluginRegistry pluginRegistry) {
        m.f(pluginRegistry, "registry");
    }
}
