package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class m {
    public static MessageCodec<Object> c() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void d(GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, flutterAssetManagerHostApi.list((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = GeneratedAndroidWebView.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, flutterAssetManagerHostApi.getAssetFilePathByName((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = GeneratedAndroidWebView.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static void f(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterAssetManagerHostApi.list", c());
        if (flutterAssetManagerHostApi != null) {
            basicMessageChannel.setMessageHandler(new l(flutterAssetManagerHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterAssetManagerHostApi.getAssetFilePathByName", c());
        if (flutterAssetManagerHostApi != null) {
            basicMessageChannel2.setMessageHandler(new k(flutterAssetManagerHostApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
