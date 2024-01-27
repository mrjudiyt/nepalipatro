package io.flutter.plugins.pathprovider;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.pathprovider.Messages;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Messages */
public final /* synthetic */ class g {
    public static MessageCodec<Object> g() {
        return Messages.PathProviderApiCodec.INSTANCE;
    }

    public static /* synthetic */ void h(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", pathProviderApi.getTemporaryPath());
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", Messages.wrapError(e10));
        }
        reply.reply(hashMap);
    }

    public static /* synthetic */ void i(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", pathProviderApi.getApplicationSupportPath());
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", Messages.wrapError(e10));
        }
        reply.reply(hashMap);
    }

    public static /* synthetic */ void j(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", pathProviderApi.getApplicationDocumentsPath());
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", Messages.wrapError(e10));
        }
        reply.reply(hashMap);
    }

    public static /* synthetic */ void k(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", pathProviderApi.getExternalStoragePath());
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", Messages.wrapError(e10));
        }
        reply.reply(hashMap);
    }

    public static /* synthetic */ void l(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", pathProviderApi.getExternalCachePaths());
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", Messages.wrapError(e10));
        }
        reply.reply(hashMap);
    }

    public static /* synthetic */ void m(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Messages.StorageDirectory storageDirectory = arrayList.get(0) == null ? null : Messages.StorageDirectory.values()[((Integer) arrayList.get(0)).intValue()];
            if (storageDirectory != null) {
                hashMap.put("result", pathProviderApi.getExternalStoragePaths(storageDirectory));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("directoryArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", Messages.wrapError(e10));
        }
    }

    public static void n(BinaryMessenger binaryMessenger, Messages.PathProviderApi pathProviderApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", g(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel.setMessageHandler(new c(pathProviderApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", g(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel2.setMessageHandler(new f(pathProviderApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", g(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel3.setMessageHandler(new d(pathProviderApi));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", g(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel4.setMessageHandler(new a(pathProviderApi));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", g(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel5.setMessageHandler(new e(pathProviderApi));
        } else {
            basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", g(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel6.setMessageHandler(new b(pathProviderApi));
        } else {
            basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
