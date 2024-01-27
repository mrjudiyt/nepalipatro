package b2;

import android.app.Activity;
import android.content.Context;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Objects;

/* compiled from: MethodCallHandlerImpl */
final class l implements MethodChannel.MethodCallHandler {

    /* renamed from: h  reason: collision with root package name */
    private final Context f4977h;

    /* renamed from: i  reason: collision with root package name */
    private final a f4978i;

    /* renamed from: j  reason: collision with root package name */
    private final n f4979j;

    /* renamed from: k  reason: collision with root package name */
    private final p f4980k;

    /* renamed from: l  reason: collision with root package name */
    private Activity f4981l;

    l(Context context, a aVar, n nVar, p pVar) {
        this.f4977h = context;
        this.f4978i = aVar;
        this.f4979j = nVar;
        this.f4980k = pVar;
    }

    public void i(Activity activity) {
        this.f4981l = activity;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c10 = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c10 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                int parseInt = Integer.parseInt(methodCall.arguments.toString());
                p pVar = this.f4980k;
                Context context = this.f4977h;
                Objects.requireNonNull(result);
                pVar.a(parseInt, context, new k(result), new e(result));
                return;
            case 1:
                int parseInt2 = Integer.parseInt(methodCall.arguments.toString());
                n nVar = this.f4979j;
                Activity activity = this.f4981l;
                Objects.requireNonNull(result);
                nVar.h(parseInt2, activity, new j(result), new g(result));
                return;
            case 2:
                int parseInt3 = Integer.parseInt(methodCall.arguments.toString());
                n nVar2 = this.f4979j;
                Context context2 = this.f4977h;
                Objects.requireNonNull(result);
                nVar2.c(parseInt3, context2, new h(result));
                return;
            case 3:
                a aVar = this.f4978i;
                Context context3 = this.f4977h;
                Objects.requireNonNull(result);
                aVar.a(context3, new c(result), new f(result));
                return;
            case 4:
                n nVar3 = this.f4979j;
                Activity activity2 = this.f4981l;
                Objects.requireNonNull(result);
                nVar3.g((List) methodCall.arguments(), activity2, new i(result), new d(result));
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
