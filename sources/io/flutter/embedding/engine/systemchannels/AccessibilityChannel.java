package io.flutter.embedding.engine.systemchannels;

import com.facebook.share.internal.ShareConstants;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.view.AccessibilityBridge;
import java.util.HashMap;

public class AccessibilityChannel {
    private static final String TAG = "AccessibilityChannel";
    public final BasicMessageChannel<Object> channel;
    public final FlutterJNI flutterJNI;
    /* access modifiers changed from: private */
    public AccessibilityMessageHandler handler;
    public final BasicMessageChannel.MessageHandler<Object> parsingMessageHandler;

    public interface AccessibilityMessageHandler extends FlutterJNI.AccessibilityDelegate {
        void announce(String str);

        void onFocus(int i10);

        void onLongPress(int i10);

        void onTap(int i10);

        void onTooltip(String str);
    }

    public AccessibilityChannel(DartExecutor dartExecutor, FlutterJNI flutterJNI2) {
        AnonymousClass1 r02 = new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object obj, BasicMessageChannel.Reply<Object> reply) {
                if (AccessibilityChannel.this.handler == null) {
                    reply.reply(null);
                    return;
                }
                HashMap hashMap = (HashMap) obj;
                String str = (String) hashMap.get(ShareConstants.MEDIA_TYPE);
                HashMap hashMap2 = (HashMap) hashMap.get("data");
                Log.v(AccessibilityChannel.TAG, "Received " + str + " message.");
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1140076541:
                        if (str.equals("tooltip")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -649620375:
                        if (str.equals("announce")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 114595:
                        if (str.equals("tap")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 97604824:
                        if (str.equals("focus")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 114203431:
                        if (str.equals("longPress")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        String str2 = (String) hashMap2.get("message");
                        if (str2 != null) {
                            AccessibilityChannel.this.handler.onTooltip(str2);
                            break;
                        }
                        break;
                    case 1:
                        String str3 = (String) hashMap2.get("message");
                        if (str3 != null) {
                            AccessibilityChannel.this.handler.announce(str3);
                            break;
                        }
                        break;
                    case 2:
                        Integer num = (Integer) hashMap.get("nodeId");
                        if (num != null) {
                            AccessibilityChannel.this.handler.onTap(num.intValue());
                            break;
                        }
                        break;
                    case 3:
                        Integer num2 = (Integer) hashMap.get("nodeId");
                        if (num2 != null) {
                            AccessibilityChannel.this.handler.onFocus(num2.intValue());
                            break;
                        }
                        break;
                    case 4:
                        Integer num3 = (Integer) hashMap.get("nodeId");
                        if (num3 != null) {
                            AccessibilityChannel.this.handler.onLongPress(num3.intValue());
                            break;
                        }
                        break;
                }
                reply.reply(null);
            }
        };
        this.parsingMessageHandler = r02;
        BasicMessageChannel<Object> basicMessageChannel = new BasicMessageChannel<>(dartExecutor, "flutter/accessibility", StandardMessageCodec.INSTANCE);
        this.channel = basicMessageChannel;
        basicMessageChannel.setMessageHandler(r02);
        this.flutterJNI = flutterJNI2;
    }

    public void dispatchSemanticsAction(int i10, AccessibilityBridge.Action action) {
        this.flutterJNI.dispatchSemanticsAction(i10, action);
    }

    public void onAndroidAccessibilityDisabled() {
        this.flutterJNI.setSemanticsEnabled(false);
    }

    public void onAndroidAccessibilityEnabled() {
        this.flutterJNI.setSemanticsEnabled(true);
    }

    public void setAccessibilityFeatures(int i10) {
        this.flutterJNI.setAccessibilityFeatures(i10);
    }

    public void setAccessibilityMessageHandler(AccessibilityMessageHandler accessibilityMessageHandler) {
        this.handler = accessibilityMessageHandler;
        this.flutterJNI.setAccessibilityDelegate(accessibilityMessageHandler);
    }

    public void dispatchSemanticsAction(int i10, AccessibilityBridge.Action action, Object obj) {
        this.flutterJNI.dispatchSemanticsAction(i10, action, obj);
    }
}
