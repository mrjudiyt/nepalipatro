package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class k0 {
    public static MessageCodec<Object> c() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void d(GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webChromeClientHostApi.create(l10);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webChromeClientHostApi.setSynchronousReturnValueForOnShowFileChooser(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static void f(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebChromeClientHostApi.create", c());
        if (webChromeClientHostApi != null) {
            basicMessageChannel.setMessageHandler(new i0(webChromeClientHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebChromeClientHostApi.setSynchronousReturnValueForOnShowFileChooser", c());
        if (webChromeClientHostApi != null) {
            basicMessageChannel2.setMessageHandler(new j0(webChromeClientHostApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
