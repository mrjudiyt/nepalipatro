package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class s {
    public static MessageCodec<Object> b() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void c(GeneratedAndroidWebView.InstanceManagerHostApi instanceManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            instanceManagerHostApi.clear();
            arrayList.add(0, (Object) null);
        } catch (Throwable th) {
            arrayList = GeneratedAndroidWebView.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static void d(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.InstanceManagerHostApi instanceManagerHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.InstanceManagerHostApi.clear", b());
        if (instanceManagerHostApi != null) {
            basicMessageChannel.setMessageHandler(new q(instanceManagerHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
