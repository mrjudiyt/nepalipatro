package b8;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.m;
import t0.b;

/* compiled from: AsyncPreferencesPlugin.kt */
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: h  reason: collision with root package name */
    private MethodChannel f13326h;

    /* renamed from: i  reason: collision with root package name */
    private Context f13327i;

    /* renamed from: j  reason: collision with root package name */
    private HashMap<String, b> f13328j = new HashMap<>();

    private final void a(MethodCall methodCall, MethodChannel.Result result) {
        try {
            Object obj = methodCall.arguments;
            m.d(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>");
            ArrayList arrayList = (ArrayList) obj;
            b d10 = d((String) arrayList.get(0));
            Object obj2 = arrayList.get(1);
            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
            result.success(d10.a((String) obj2));
        } catch (Exception e10) {
            result.error("get_boolean_error", e10.getMessage(), (Object) null);
        }
    }

    private final void b(MethodCall methodCall, MethodChannel.Result result) {
        try {
            Object obj = methodCall.arguments;
            m.d(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>");
            ArrayList arrayList = (ArrayList) obj;
            b d10 = d((String) arrayList.get(0));
            Object obj2 = arrayList.get(1);
            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
            result.success(d10.b((String) obj2));
        } catch (Exception e10) {
            result.error("get_int_error", e10.getMessage(), (Object) null);
        }
    }

    private final void c(MethodCall methodCall, MethodChannel.Result result) {
        try {
            Object obj = methodCall.arguments;
            m.d(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>");
            ArrayList arrayList = (ArrayList) obj;
            b d10 = d((String) arrayList.get(0));
            Object obj2 = arrayList.get(1);
            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
            result.success(d10.c((String) obj2));
        } catch (Exception e10) {
            result.error("get_long_error", e10.getMessage(), (Object) null);
        }
    }

    private final b d(String str) {
        SharedPreferences sharedPreferences;
        if (this.f13328j.containsKey(str)) {
            b bVar = this.f13328j.get(str);
            m.c(bVar);
            return bVar;
        }
        Context context = null;
        if (str == null) {
            Context context2 = this.f13327i;
            if (context2 == null) {
                m.x("context");
            } else {
                context = context2;
            }
            sharedPreferences = b.a(context);
        } else {
            Context context3 = this.f13327i;
            if (context3 == null) {
                m.x("context");
            } else {
                context = context3;
            }
            sharedPreferences = context.getSharedPreferences(str, 0);
        }
        HashMap<String, b> hashMap = this.f13328j;
        m.e(sharedPreferences, "newPreference");
        hashMap.put(str, new b(sharedPreferences));
        b bVar2 = this.f13328j.get(str);
        m.c(bVar2);
        return bVar2;
    }

    private final void e(MethodCall methodCall, MethodChannel.Result result) {
        try {
            Object obj = methodCall.arguments;
            m.d(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>");
            ArrayList arrayList = (ArrayList) obj;
            b d10 = d((String) arrayList.get(0));
            Object obj2 = arrayList.get(1);
            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
            result.success(d10.d((String) obj2));
        } catch (Exception e10) {
            result.error("get_string_error", e10.getMessage(), (Object) null);
        }
    }

    private final void f(MethodCall methodCall, MethodChannel.Result result) {
        try {
            Object obj = methodCall.arguments;
            m.d(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>");
            ArrayList arrayList = (ArrayList) obj;
            b d10 = d((String) arrayList.get(0));
            Object obj2 = arrayList.get(1);
            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
            result.success(Boolean.valueOf(d10.e((String) obj2)));
        } catch (Exception e10) {
            result.error("remove_error", e10.getMessage(), (Object) null);
        }
    }

    private final void g(MethodCall methodCall, MethodChannel.Result result) {
        try {
            Object obj = methodCall.arguments;
            m.d(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>");
            ArrayList arrayList = (ArrayList) obj;
            b d10 = d((String) arrayList.get(0));
            Object obj2 = arrayList.get(1);
            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = arrayList.get(2);
            m.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            result.success(Boolean.valueOf(d10.f((String) obj2, ((Boolean) obj3).booleanValue())));
        } catch (Exception e10) {
            result.error("set_boolean_error", e10.getMessage(), (Object) null);
        }
    }

    private final void h(MethodCall methodCall, MethodChannel.Result result) {
        try {
            Object obj = methodCall.arguments;
            m.d(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>");
            ArrayList arrayList = (ArrayList) obj;
            b d10 = d((String) arrayList.get(0));
            Object obj2 = arrayList.get(1);
            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = arrayList.get(2);
            m.d(obj3, "null cannot be cast to non-null type kotlin.Int");
            result.success(Boolean.valueOf(d10.g((String) obj2, ((Integer) obj3).intValue())));
        } catch (Exception e10) {
            result.error("set_int_error", e10.getMessage(), (Object) null);
        }
    }

    private final void i(MethodCall methodCall, MethodChannel.Result result) {
        try {
            Object obj = methodCall.arguments;
            m.d(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>");
            ArrayList arrayList = (ArrayList) obj;
            b d10 = d((String) arrayList.get(0));
            Object obj2 = arrayList.get(1);
            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = arrayList.get(2);
            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
            result.success(Boolean.valueOf(d10.h((String) obj2, Long.parseLong((String) obj3))));
        } catch (Exception e10) {
            result.error("set_long_error", e10.getMessage(), (Object) null);
        }
    }

    private final void j(MethodCall methodCall, MethodChannel.Result result) {
        try {
            Object obj = methodCall.arguments;
            m.d(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>");
            ArrayList arrayList = (ArrayList) obj;
            b d10 = d((String) arrayList.get(0));
            Object obj2 = arrayList.get(1);
            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = arrayList.get(2);
            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
            result.success(Boolean.valueOf(d10.i((String) obj2, (String) obj3)));
        } catch (Exception e10) {
            result.error("set_string_error", e10.getMessage(), (Object) null);
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "async_preferences");
        this.f13326h = methodChannel;
        methodChannel.setMethodCallHandler(this);
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        m.e(applicationContext, "flutterPluginBinding.getApplicationContext()");
        this.f13327i = applicationContext;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f13326h;
        if (methodChannel == null) {
            m.x("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        m.f(methodCall, "call");
        m.f(result, "result");
        String str = methodCall.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1169469810:
                    if (str.equals("set_string")) {
                        j(methodCall, result);
                        return;
                    }
                    break;
                case -934610812:
                    if (str.equals(ProductAction.ACTION_REMOVE)) {
                        f(methodCall, result);
                        return;
                    }
                    break;
                case -74794106:
                    if (str.equals("get_int")) {
                        b(methodCall, result);
                        return;
                    }
                    break;
                case 1188692250:
                    if (str.equals("get_string")) {
                        e(methodCall, result);
                        return;
                    }
                    break;
                case 1415029927:
                    if (str.equals("set_bool")) {
                        g(methodCall, result);
                        return;
                    }
                    break;
                case 1415327801:
                    if (str.equals("set_long")) {
                        i(methodCall, result);
                        return;
                    }
                    break;
                case 1976142387:
                    if (str.equals("get_bool")) {
                        a(methodCall, result);
                        return;
                    }
                    break;
                case 1976440261:
                    if (str.equals("get_long")) {
                        c(methodCall, result);
                        return;
                    }
                    break;
                case 1985315474:
                    if (str.equals("set_int")) {
                        h(methodCall, result);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
