package q7;

import android.content.Context;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.FlutterRunArguments;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* compiled from: FlutterIsolatePlugin */
public class a implements FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler {

    /* renamed from: k  reason: collision with root package name */
    private static Class<?> f16277k;

    /* renamed from: h  reason: collision with root package name */
    private Queue<b> f16278h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, b> f16279i;

    /* renamed from: j  reason: collision with root package name */
    private Context f16280j;

    private static void a(FlutterEngine flutterEngine) {
        Class<?> cls = f16277k;
        if (cls != null) {
            try {
                cls.getMethod("registerWith", new Class[]{FlutterEngine.class}).invoke((Object) null, new Object[]{flutterEngine});
                StringBuilder sb = new StringBuilder();
                sb.append("Using custom Flutter plugin registrant ");
                sb.append(f16277k.getCanonicalName());
            } catch (NoSuchMethodException e10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e10.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(e10.getMessage());
                sb2.append("\nThe plugin registrant must provide a static registerWith(FlutterEngine) method");
            } catch (InvocationTargetException e11) {
                Throwable targetException = e11.getTargetException();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(targetException.getClass().getSimpleName());
                sb3.append(": ");
                sb3.append(targetException.getMessage());
                sb3.append("\nIt is possible the default GeneratedPluginRegistrant is attempting to register\na plugin that uses registrar.activity() or a similar method. Flutter Isolates have no\naccess to the activity() from the registrant. If the activity is being use to register\na method or event channel, have the plugin use registrar.context() instead. Alternatively\nuse a custom registrant for isolates, that only registers plugins that the isolate needs\nto use.");
            } catch (Exception e12) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(e12.getClass().getSimpleName());
                sb4.append(" ");
                sb4.append(((InvocationTargetException) e12).getTargetException().getMessage());
            }
        }
    }

    private void b(BinaryMessenger binaryMessenger, Context context) {
        this.f16280j = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.rmawatson.flutterisolate/control");
        this.f16278h = new LinkedList();
        this.f16279i = new HashMap();
        methodChannel.setMethodCallHandler(this);
    }

    private void c() {
        b peek = this.f16278h.peek();
        FlutterInjector.instance().flutterLoader().ensureInitializationComplete(this.f16280j, (String[]) null);
        peek.f16281a = new FlutterEngine(this.f16280j);
        FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(peek.f16285e.longValue());
        FlutterRunArguments flutterRunArguments = new FlutterRunArguments();
        flutterRunArguments.bundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
        flutterRunArguments.libraryPath = lookupCallbackInformation.callbackLibraryPath;
        flutterRunArguments.entrypoint = lookupCallbackInformation.callbackName;
        peek.f16284d = new MethodChannel(peek.f16281a.getDartExecutor().getBinaryMessenger(), "com.rmawatson.flutterisolate/control");
        EventChannel eventChannel = new EventChannel(peek.f16281a.getDartExecutor().getBinaryMessenger(), "com.rmawatson.flutterisolate/event");
        peek.f16283c = eventChannel;
        eventChannel.setStreamHandler(this);
        peek.f16284d.setMethodCallHandler(this);
        if (f16277k != null) {
            a(peek.f16281a);
        }
        peek.f16281a.getDartExecutor().executeDartCallback(new DartExecutor.DartCallback(this.f16280j.getAssets(), flutterRunArguments.bundlePath, lookupCallbackInformation));
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        b(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onCancel(Object obj) {
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        if (this.f16278h.size() != 0) {
            b remove = this.f16278h.remove();
            eventSink.success(remove.f16282b);
            eventSink.endOfStream();
            this.f16279i.put(remove.f16282b, remove);
            remove.f16286f.success((Object) null);
            remove.f16283c = null;
            remove.f16286f = null;
        }
        if (this.f16278h.size() != 0) {
            c();
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("spawn_isolate")) {
            b bVar = new b();
            Object argument = methodCall.argument("entry_point");
            if (argument instanceof Long) {
                bVar.f16285e = (Long) argument;
            }
            if (argument instanceof Integer) {
                bVar.f16285e = Long.valueOf((long) ((Integer) argument).intValue());
            }
            bVar.f16282b = (String) methodCall.argument("isolate_id");
            bVar.f16286f = result;
            this.f16278h.add(bVar);
            if (this.f16278h.size() == 1) {
                c();
            }
        } else if (methodCall.method.equals("kill_isolate")) {
            String str = (String) methodCall.argument("isolate_id");
            this.f16279i.get(str).f16281a.destroy();
            this.f16279i.remove(str);
        } else if (methodCall.method.equals("get_isolate_list")) {
            result.success(new ArrayList(this.f16279i.keySet()));
        } else if (methodCall.method.equals("kill_all_isolates")) {
            for (b bVar2 : this.f16279i.values()) {
                bVar2.f16281a.destroy();
            }
            this.f16278h.clear();
            this.f16279i.clear();
        } else {
            result.notImplemented();
        }
    }
}
