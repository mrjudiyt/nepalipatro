package t7;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MainMethodCallHandler */
public class g implements MethodChannel.MethodCallHandler {

    /* renamed from: h  reason: collision with root package name */
    private final Context f16593h;

    /* renamed from: i  reason: collision with root package name */
    private final BinaryMessenger f16594i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, d> f16595j = new HashMap();

    public g(Context context, BinaryMessenger binaryMessenger) {
        this.f16593h = context;
        this.f16594i = binaryMessenger;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Iterator it = new ArrayList(this.f16595j.values()).iterator();
        while (it.hasNext()) {
            ((d) it.next()).W();
        }
        this.f16595j.clear();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3237136:
                if (str.equals("init")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1999985120:
                if (str.equals("disposePlayer")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2146443344:
                if (str.equals("disposeAllPlayers")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String str2 = (String) methodCall.argument("id");
                if (this.f16595j.containsKey(str2)) {
                    result.error("Platform player " + str2 + " already exists", (String) null, (Object) null);
                    return;
                }
                String str3 = str2;
                this.f16595j.put(str2, new d(this.f16593h, this.f16594i, str3, (Map) methodCall.argument("audioLoadConfiguration"), (List) methodCall.argument("androidAudioEffects")));
                result.success((Object) null);
                return;
            case 1:
                String str4 = (String) methodCall.argument("id");
                d dVar = this.f16595j.get(str4);
                if (dVar != null) {
                    dVar.W();
                    this.f16595j.remove(str4);
                }
                result.success(new HashMap());
                return;
            case 2:
                a();
                result.success(new HashMap());
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
