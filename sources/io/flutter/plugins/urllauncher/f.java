package io.flutter.plugins.urllauncher;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.urllauncher.Messages;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Messages */
public final /* synthetic */ class f {
    public static MessageCodec<Object> f() {
        return Messages.UrlLauncherApiCodec.INSTANCE;
    }

    public static /* synthetic */ void g(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, urlLauncherApi.canLaunchUrl((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void h(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, urlLauncherApi.launchUrl((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void i(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, urlLauncherApi.openUrlInApp((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (Messages.WebViewOptions) arrayList2.get(2)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void j(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, urlLauncherApi.supportsCustomTabs());
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void k(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            urlLauncherApi.closeWebView();
            arrayList.add(0, (Object) null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static void l(BinaryMessenger binaryMessenger, Messages.UrlLauncherApi urlLauncherApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", f());
        if (urlLauncherApi != null) {
            basicMessageChannel.setMessageHandler(new e(urlLauncherApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", f());
        if (urlLauncherApi != null) {
            basicMessageChannel2.setMessageHandler(new b(urlLauncherApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", f());
        if (urlLauncherApi != null) {
            basicMessageChannel3.setMessageHandler(new c(urlLauncherApi));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", f());
        if (urlLauncherApi != null) {
            basicMessageChannel4.setMessageHandler(new d(urlLauncherApi));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", f());
        if (urlLauncherApi != null) {
            basicMessageChannel5.setMessageHandler(new a(urlLauncherApi));
        } else {
            basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
