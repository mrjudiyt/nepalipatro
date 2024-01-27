package io.flutter.plugins.googlemobileads.usermessagingplatform;

import android.app.Activity;
import android.content.Context;
import com.facebook.internal.NativeProtocol;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import k6.b;
import k6.c;
import k6.d;
import k6.e;
import k6.f;

public class UserMessagingPlatformManager implements MethodChannel.MethodCallHandler {
    private static final String INTERNAL_ERROR_CODE = "0";
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/google_mobile_ads/ump";
    private Activity activity;
    private c consentInformation;
    private final Context context;
    private final MethodChannel methodChannel;
    /* access modifiers changed from: private */
    public final UserMessagingCodec userMessagingCodec;

    public UserMessagingPlatformManager(BinaryMessenger binaryMessenger, Context context2) {
        UserMessagingCodec userMessagingCodec2 = new UserMessagingCodec();
        this.userMessagingCodec = userMessagingCodec2;
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME, new StandardMethodCodec(userMessagingCodec2));
        this.methodChannel = methodChannel2;
        methodChannel2.setMethodCallHandler(this);
        this.context = context2;
    }

    private c getConsentInformation() {
        c cVar = this.consentInformation;
        if (cVar != null) {
            return cVar;
        }
        c a10 = f.a(this.context);
        this.consentInformation = a10;
        return a10;
    }

    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        d dVar;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2068759970:
                if (str.equals("ConsentInformation#reset")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1310145901:
                if (str.equals("ConsentInformation#requestConsentInfoUpdate")) {
                    c10 = 1;
                    break;
                }
                break;
            case -971145086:
                if (str.equals("ConsentForm#show")) {
                    c10 = 2;
                    break;
                }
                break;
            case -878979462:
                if (str.equals("ConsentForm#dispose")) {
                    c10 = 3;
                    break;
                }
                break;
            case -585732218:
                if (str.equals("ConsentInformation#isConsentFormAvailable")) {
                    c10 = 4;
                    break;
                }
                break;
            case -497439839:
                if (str.equals("UserMessagingPlatform#loadConsentForm")) {
                    c10 = 5;
                    break;
                }
                break;
            case 665104519:
                if (str.equals("ConsentInformation#getConsentStatus")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                getConsentInformation().reset();
                result.success((Object) null);
                return;
            case 1:
                if (this.activity == null) {
                    result.error("0", "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", (Object) null);
                    return;
                }
                ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) methodCall.argument(NativeProtocol.WEB_DIALOG_PARAMS);
                if (consentRequestParametersWrapper == null) {
                    dVar = new d.a().a();
                } else {
                    dVar = consentRequestParametersWrapper.getAsConsentRequestParameters(this.activity);
                }
                getConsentInformation().requestConsentInfoUpdate(this.activity, dVar, new c.b() {
                    public void onConsentInfoUpdateSuccess() {
                        result.success((Object) null);
                    }
                }, new c.a() {
                    public void onConsentInfoUpdateFailure(e eVar) {
                        result.error(Integer.toString(eVar.a()), eVar.b(), (Object) null);
                    }
                });
                return;
            case 2:
                b bVar = (b) methodCall.argument("consentForm");
                if (bVar == null) {
                    result.error("0", "ConsentForm#show", (Object) null);
                    return;
                } else {
                    bVar.show(this.activity, new b.a() {
                        public void onConsentFormDismissed(e eVar) {
                            if (eVar != null) {
                                result.error(Integer.toString(eVar.a()), eVar.b(), (Object) null);
                            } else {
                                result.success((Object) null);
                            }
                        }
                    });
                    return;
                }
            case 3:
                b bVar2 = (b) methodCall.argument("consentForm");
                if (bVar2 != null) {
                    this.userMessagingCodec.disposeConsentForm(bVar2);
                }
                result.success((Object) null);
                return;
            case 4:
                result.success(Boolean.valueOf(getConsentInformation().isConsentFormAvailable()));
                return;
            case 5:
                f.b(this.context, new f.b() {
                    public void onConsentFormLoadSuccess(b bVar) {
                        UserMessagingPlatformManager.this.userMessagingCodec.trackConsentForm(bVar);
                        result.success(bVar);
                    }
                }, new f.a() {
                    public void onConsentFormLoadFailure(e eVar) {
                        result.error(Integer.toString(eVar.a()), eVar.b(), (Object) null);
                    }
                });
                return;
            case 6:
                result.success(Integer.valueOf(getConsentInformation().getConsentStatus()));
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    UserMessagingPlatformManager(BinaryMessenger binaryMessenger, Context context2, UserMessagingCodec userMessagingCodec2) {
        this.userMessagingCodec = userMessagingCodec2;
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME, new StandardMethodCodec(userMessagingCodec2));
        this.methodChannel = methodChannel2;
        methodChannel2.setMethodCallHandler(this);
        this.context = context2;
    }
}
