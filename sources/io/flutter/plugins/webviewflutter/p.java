package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class p {
    public static MessageCodec<Object> b() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void c(GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi geolocationPermissionsCallbackHostApi, Object obj, BasicMessageChannel.Reply reply) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        Boolean bool = (Boolean) arrayList2.get(2);
        Boolean bool2 = (Boolean) arrayList2.get(3);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = GeneratedAndroidWebView.wrapError(th);
            }
        }
        geolocationPermissionsCallbackHostApi.invoke(l10, str, bool, bool2);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static void d(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi geolocationPermissionsCallbackHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GeolocationPermissionsCallbackHostApi.invoke", b());
        if (geolocationPermissionsCallbackHostApi != null) {
            basicMessageChannel.setMessageHandler(new o(geolocationPermissionsCallbackHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
