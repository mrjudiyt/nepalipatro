package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class v {
    public static MessageCodec<Object> b() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void c(GeneratedAndroidWebView.JavaObjectHostApi javaObjectHostApi, Object obj, BasicMessageChannel.Reply reply) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = GeneratedAndroidWebView.wrapError(th);
            }
        }
        javaObjectHostApi.dispose(l10);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static void d(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.JavaObjectHostApi javaObjectHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.JavaObjectHostApi.dispose", b());
        if (javaObjectHostApi != null) {
            basicMessageChannel.setMessageHandler(new u(javaObjectHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
