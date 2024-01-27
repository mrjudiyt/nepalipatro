package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class m1 {
    public static MessageCodec<Object> c() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void d(GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webViewClientHostApi.create(l10);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Boolean bool = (Boolean) arrayList2.get(1);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = GeneratedAndroidWebView.wrapError(th);
            }
        }
        webViewClientHostApi.setSynchronousReturnValueForShouldOverrideUrlLoading(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static void f(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewClientHostApi.create", c());
        if (webViewClientHostApi != null) {
            basicMessageChannel.setMessageHandler(new k1(webViewClientHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewClientHostApi.setSynchronousReturnValueForShouldOverrideUrlLoading", c());
        if (webViewClientHostApi != null) {
            basicMessageChannel2.setMessageHandler(new l1(webViewClientHostApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
