package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class c0 {
    public static MessageCodec<Object> c() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void d(GeneratedAndroidWebView.PermissionRequestHostApi permissionRequestHostApi, Object obj, BasicMessageChannel.Reply reply) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        List list = (List) arrayList2.get(1);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = GeneratedAndroidWebView.wrapError(th);
            }
        }
        permissionRequestHostApi.grant(l10, list);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(GeneratedAndroidWebView.PermissionRequestHostApi permissionRequestHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        permissionRequestHostApi.deny(l10);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static void f(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.PermissionRequestHostApi permissionRequestHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PermissionRequestHostApi.grant", c());
        if (permissionRequestHostApi != null) {
            basicMessageChannel.setMessageHandler(new a0(permissionRequestHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PermissionRequestHostApi.deny", c());
        if (permissionRequestHostApi != null) {
            basicMessageChannel2.setMessageHandler(new b0(permissionRequestHostApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
