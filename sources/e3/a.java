package e3;

import android.app.Activity;
import android.content.Context;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* compiled from: FacebookAudienceNetworkPlugin */
public class a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* renamed from: h  reason: collision with root package name */
    private MethodChannel f8007h;

    /* renamed from: i  reason: collision with root package name */
    private MethodChannel f8008i;

    /* renamed from: j  reason: collision with root package name */
    private MethodChannel f8009j;

    /* renamed from: k  reason: collision with root package name */
    private Activity f8010k;

    /* renamed from: l  reason: collision with root package name */
    private Context f8011l;

    private boolean a(HashMap hashMap) {
        String str = (String) hashMap.get("testingId");
        AudienceNetworkAds.initialize(this.f8010k.getApplicationContext());
        if (str == null) {
            return true;
        }
        AdSettings.addTestDevice(str);
        return true;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f8010k = activityPluginBinding.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "fb.audience.network.io");
        this.f8007h = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f8011l = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel2 = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "fb.audience.network.io/interstitialAd");
        this.f8008i = methodChannel2;
        methodChannel2.setMethodCallHandler(new d(this.f8011l, methodChannel2));
        MethodChannel methodChannel3 = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "fb.audience.network.io/rewardedAd");
        this.f8009j = methodChannel3;
        methodChannel3.setMethodCallHandler(new g(this.f8011l, methodChannel3));
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("fb.audience.network.io/bannerAd", new b(flutterPluginBinding.getBinaryMessenger()));
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("fb.audience.network.io/nativeAd", new e(flutterPluginBinding.getBinaryMessenger()));
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f8007h.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f8008i.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f8009j.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("init")) {
            result.success(Boolean.valueOf(a((HashMap) methodCall.arguments)));
        } else {
            result.notImplemented();
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
