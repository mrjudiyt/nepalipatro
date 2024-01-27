package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class z0 {
    public static /* synthetic */ void A(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webSettingsHostApi.setSupportZoom(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void B(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webSettingsHostApi.setLoadWithOverviewMode(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void C(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webSettingsHostApi.setUseWideViewPort(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static void D(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.create", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel.setMessageHandler(new q0(webSettingsHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setDomStorageEnabled", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel2.setMessageHandler(new w0(webSettingsHostApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel3.setMessageHandler(new o0(webSettingsHostApi));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setSupportMultipleWindows", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel4.setMessageHandler(new u0(webSettingsHostApi));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setJavaScriptEnabled", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel5.setMessageHandler(new y0(webSettingsHostApi));
        } else {
            basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setUserAgentString", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel6.setMessageHandler(new m0(webSettingsHostApi));
        } else {
            basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setMediaPlaybackRequiresUserGesture", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel7.setMessageHandler(new s0(webSettingsHostApi));
        } else {
            basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setSupportZoom", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel8.setMessageHandler(new t0(webSettingsHostApi));
        } else {
            basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setLoadWithOverviewMode", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel9.setMessageHandler(new l0(webSettingsHostApi));
        } else {
            basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setUseWideViewPort", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel10.setMessageHandler(new r0(webSettingsHostApi));
        } else {
            basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setDisplayZoomControls", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel11.setMessageHandler(new p0(webSettingsHostApi));
        } else {
            basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setBuiltInZoomControls", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel12.setMessageHandler(new x0(webSettingsHostApi));
        } else {
            basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setAllowFileAccess", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel13.setMessageHandler(new v0(webSettingsHostApi));
        } else {
            basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setTextZoom", o());
        if (webSettingsHostApi != null) {
            basicMessageChannel14.setMessageHandler(new n0(webSettingsHostApi));
        } else {
            basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }

    public static MessageCodec<Object> o() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void p(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        Long l10;
        Long l11;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = GeneratedAndroidWebView.wrapError(th);
            }
        }
        if (number2 == null) {
            l11 = null;
        } else {
            l11 = Long.valueOf(number2.longValue());
        }
        webSettingsHostApi.create(l10, l11);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void q(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webSettingsHostApi.setDomStorageEnabled(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void r(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webSettingsHostApi.setDisplayZoomControls(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void s(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webSettingsHostApi.setBuiltInZoomControls(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void t(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webSettingsHostApi.setAllowFileAccess(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void u(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        Long l10;
        Long l11;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = GeneratedAndroidWebView.wrapError(th);
            }
        }
        if (number2 == null) {
            l11 = null;
        } else {
            l11 = Long.valueOf(number2.longValue());
        }
        webSettingsHostApi.setTextZoom(l10, l11);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void v(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void w(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webSettingsHostApi.setSupportMultipleWindows(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void x(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webSettingsHostApi.setJavaScriptEnabled(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void y(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = GeneratedAndroidWebView.wrapError(th);
            }
        }
        webSettingsHostApi.setUserAgentString(l10, str);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }

    public static /* synthetic */ void z(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
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
        webSettingsHostApi.setMediaPlaybackRequiresUserGesture(l10, bool);
        arrayList.add(0, (Object) null);
        reply.reply(arrayList);
    }
}
