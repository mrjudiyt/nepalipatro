package u7;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.m;

/* compiled from: FlutterStatusbarcolorPlugin.kt */
public final class c implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* renamed from: h  reason: collision with root package name */
    private MethodChannel f16712h;

    /* renamed from: i  reason: collision with root package name */
    private Activity f16713i;

    /* access modifiers changed from: private */
    public static final void c(c cVar, ValueAnimator valueAnimator) {
        m.f(cVar, "this$0");
        Activity activity = cVar.f16713i;
        m.c(activity);
        Window window = activity.getWindow();
        Object animatedValue = valueAnimator.getAnimatedValue();
        m.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        window.setStatusBarColor(((Integer) animatedValue).intValue());
    }

    /* access modifiers changed from: private */
    public static final void d(c cVar, ValueAnimator valueAnimator) {
        m.f(cVar, "this$0");
        Activity activity = cVar.f16713i;
        m.c(activity);
        Window window = activity.getWindow();
        Object animatedValue = valueAnimator.getAnimatedValue();
        m.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        window.setNavigationBarColor(((Integer) animatedValue).intValue());
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        m.f(activityPluginBinding, "binding");
        this.f16713i = activityPluginBinding.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.sameer.com/statusbar");
        this.f16712h = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromActivity() {
        this.f16713i = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f16713i = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f16712h;
        if (methodChannel == null) {
            m.x("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        m.f(methodCall, "call");
        m.f(result, "result");
        if (this.f16713i == null) {
            result.success((Object) null);
            return;
        }
        String str = methodCall.method;
        if (str != null) {
            int i10 = 0;
            switch (str.hashCode()) {
                case -2014534886:
                    if (str.equals("getnavigationbarcolor")) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            Activity activity = this.f16713i;
                            m.c(activity);
                            i10 = activity.getWindow().getNavigationBarColor();
                        }
                        result.success(Integer.valueOf(i10));
                        return;
                    }
                    break;
                case -1238995452:
                    if (str.equals("setstatusbarcolor")) {
                        Object argument = methodCall.argument("color");
                        m.c(argument);
                        int intValue = ((Number) argument).intValue();
                        Object argument2 = methodCall.argument("animate");
                        m.c(argument2);
                        boolean booleanValue = ((Boolean) argument2).booleanValue();
                        if (Build.VERSION.SDK_INT >= 21) {
                            if (booleanValue) {
                                Activity activity2 = this.f16713i;
                                m.c(activity2);
                                ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{activity2.getWindow().getStatusBarColor(), intValue});
                                ofArgb.addUpdateListener(new b(this));
                                ofArgb.setDuration(300);
                                ofArgb.start();
                            } else {
                                Activity activity3 = this.f16713i;
                                m.c(activity3);
                                activity3.getWindow().setStatusBarColor(intValue);
                            }
                        }
                        result.success((Object) null);
                        return;
                    }
                    break;
                case -298842632:
                    if (str.equals("getstatusbarcolor")) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            Activity activity4 = this.f16713i;
                            m.c(activity4);
                            i10 = activity4.getWindow().getStatusBarColor();
                        }
                        result.success(Integer.valueOf(i10));
                        return;
                    }
                    break;
                case 521676070:
                    if (str.equals("setnavigationbarcolor")) {
                        Object argument3 = methodCall.argument("color");
                        m.c(argument3);
                        int intValue2 = ((Number) argument3).intValue();
                        Object argument4 = methodCall.argument("animate");
                        m.c(argument4);
                        boolean booleanValue2 = ((Boolean) argument4).booleanValue();
                        if (Build.VERSION.SDK_INT >= 21) {
                            if (booleanValue2) {
                                Activity activity5 = this.f16713i;
                                m.c(activity5);
                                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(new int[]{activity5.getWindow().getNavigationBarColor(), intValue2});
                                ofArgb2.addUpdateListener(new a(this));
                                ofArgb2.setDuration(300);
                                ofArgb2.start();
                            } else {
                                Activity activity6 = this.f16713i;
                                m.c(activity6);
                                activity6.getWindow().setNavigationBarColor(intValue2);
                            }
                        }
                        result.success((Object) null);
                        return;
                    }
                    break;
                case 1653519407:
                    if (str.equals("setnavigationbarwhiteforeground")) {
                        Object argument5 = methodCall.argument("whiteForeground");
                        m.c(argument5);
                        boolean booleanValue3 = ((Boolean) argument5).booleanValue();
                        if (Build.VERSION.SDK_INT >= 26) {
                            if (booleanValue3) {
                                Activity activity7 = this.f16713i;
                                m.c(activity7);
                                View decorView = activity7.getWindow().getDecorView();
                                Activity activity8 = this.f16713i;
                                m.c(activity8);
                                decorView.setSystemUiVisibility(activity8.getWindow().getDecorView().getSystemUiVisibility() & -17);
                            } else {
                                Activity activity9 = this.f16713i;
                                m.c(activity9);
                                View decorView2 = activity9.getWindow().getDecorView();
                                Activity activity10 = this.f16713i;
                                m.c(activity10);
                                decorView2.setSystemUiVisibility(activity10.getWindow().getDecorView().getSystemUiVisibility() | 16);
                            }
                        }
                        result.success((Object) null);
                        return;
                    }
                    break;
                case 1890975629:
                    if (str.equals("setstatusbarwhiteforeground")) {
                        Object argument6 = methodCall.argument("whiteForeground");
                        m.c(argument6);
                        boolean booleanValue4 = ((Boolean) argument6).booleanValue();
                        if (Build.VERSION.SDK_INT >= 23) {
                            if (booleanValue4) {
                                Activity activity11 = this.f16713i;
                                m.c(activity11);
                                View decorView3 = activity11.getWindow().getDecorView();
                                Activity activity12 = this.f16713i;
                                m.c(activity12);
                                decorView3.setSystemUiVisibility(activity12.getWindow().getDecorView().getSystemUiVisibility() & -8193);
                            } else {
                                Activity activity13 = this.f16713i;
                                m.c(activity13);
                                View decorView4 = activity13.getWindow().getDecorView();
                                Activity activity14 = this.f16713i;
                                m.c(activity14);
                                decorView4.setSystemUiVisibility(activity14.getWindow().getDecorView().getSystemUiVisibility() | 8192);
                            }
                        }
                        result.success((Object) null);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        m.f(activityPluginBinding, "binding");
        this.f16713i = activityPluginBinding.getActivity();
    }
}
