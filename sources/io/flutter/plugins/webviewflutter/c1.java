package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class c1 {
    public static MessageCodec<Object> c() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void d(GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webStorageHostApi.create(l10);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webStorageHostApi.deleteAllData(l10);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static void f(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebStorageHostApi.create", c());
        if (webStorageHostApi != null) {
            basicMessageChannel.setMessageHandler(new b1(webStorageHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebStorageHostApi.deleteAllData", c());
        if (webStorageHostApi != null) {
            basicMessageChannel2.setMessageHandler(new a1(webStorageHostApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
