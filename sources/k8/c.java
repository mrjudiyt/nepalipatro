package k8;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: SharePlusPlugin.kt */
public final class c implements FlutterPlugin, ActivityAware {

    /* renamed from: k  reason: collision with root package name */
    public static final a f15475k = new a((g) null);

    /* renamed from: h  reason: collision with root package name */
    private b f15476h;

    /* renamed from: i  reason: collision with root package name */
    private dev.fluttercommunity.plus.share.a f15477i;

    /* renamed from: j  reason: collision with root package name */
    private MethodChannel f15478j;

    /* compiled from: SharePlusPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        m.f(activityPluginBinding, "binding");
        dev.fluttercommunity.plus.share.a aVar = this.f15477i;
        b bVar = null;
        if (aVar == null) {
            m.x("manager");
            aVar = null;
        }
        activityPluginBinding.addActivityResultListener(aVar);
        b bVar2 = this.f15476h;
        if (bVar2 == null) {
            m.x("share");
        } else {
            bVar = bVar2;
        }
        bVar.l(activityPluginBinding.getActivity());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "binding");
        this.f15478j = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.fluttercommunity.plus/share");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        m.e(applicationContext, "binding.applicationContext");
        this.f15477i = new dev.fluttercommunity.plus.share.a(applicationContext);
        Context applicationContext2 = flutterPluginBinding.getApplicationContext();
        m.e(applicationContext2, "binding.applicationContext");
        dev.fluttercommunity.plus.share.a aVar = this.f15477i;
        MethodChannel methodChannel = null;
        if (aVar == null) {
            m.x("manager");
            aVar = null;
        }
        b bVar = new b(applicationContext2, (Activity) null, aVar);
        this.f15476h = bVar;
        dev.fluttercommunity.plus.share.a aVar2 = this.f15477i;
        if (aVar2 == null) {
            m.x("manager");
            aVar2 = null;
        }
        a aVar3 = new a(bVar, aVar2);
        MethodChannel methodChannel2 = this.f15478j;
        if (methodChannel2 == null) {
            m.x("methodChannel");
        } else {
            methodChannel = methodChannel2;
        }
        methodChannel.setMethodCallHandler(aVar3);
    }

    public void onDetachedFromActivity() {
        b bVar = this.f15476h;
        if (bVar == null) {
            m.x("share");
            bVar = null;
        }
        bVar.l((Activity) null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f15478j;
        if (methodChannel == null) {
            m.x("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        m.f(activityPluginBinding, "binding");
        onAttachedToActivity(activityPluginBinding);
    }
}
