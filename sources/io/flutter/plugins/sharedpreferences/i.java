package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.sharedpreferences.Messages;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Messages */
public final /* synthetic */ class i {
    public static MessageCodec<Object> i() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void j(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, sharedPreferencesApi.remove((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void k(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setBool((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void l(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setString((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void m(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        String str = (String) arrayList2.get(0);
        Number number = (Number) arrayList2.get(1);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
        }
        arrayList.add(0, sharedPreferencesApi.setInt(str, l10));
        reply.reply(arrayList);
    }

    public static /* synthetic */ void n(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setDouble((String) arrayList2.get(0), (Double) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void o(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setStringList((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void p(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, sharedPreferencesApi.clearWithPrefix((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void q(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, sharedPreferencesApi.getAllWithPrefix((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static void r(BinaryMessenger binaryMessenger, Messages.SharedPreferencesApi sharedPreferencesApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.remove", i(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel.setMessageHandler(new h(sharedPreferencesApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setBool", i(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel2.setMessageHandler(new a(sharedPreferencesApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setString", i(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel3.setMessageHandler(new b(sharedPreferencesApi));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setInt", i(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel4.setMessageHandler(new g(sharedPreferencesApi));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setDouble", i(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel5.setMessageHandler(new f(sharedPreferencesApi));
        } else {
            basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setStringList", i(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel6.setMessageHandler(new c(sharedPreferencesApi));
        } else {
            basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.clearWithPrefix", i(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel7.setMessageHandler(new e(sharedPreferencesApi));
        } else {
            basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.getAllWithPrefix", i(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel8.setMessageHandler(new d(sharedPreferencesApi));
        } else {
            basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
