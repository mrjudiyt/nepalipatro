package com.facebook.appevents.codeless.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* compiled from: UnityReflection.kt */
public final class UnityReflection {
    private static final String CAPTURE_VIEW_HIERARCHY_METHOD = "CaptureViewHierarchy";
    private static final String EVENT_MAPPING_METHOD = "OnReceiveMapping";
    private static final String FB_UNITY_GAME_OBJECT = "UnityFacebookSDKPlugin";
    public static final UnityReflection INSTANCE = new UnityReflection();
    private static final String TAG = UnityReflection.class.getCanonicalName();
    private static final String UNITY_PLAYER_CLASS = "com.unity3d.player.UnityPlayer";
    private static final String UNITY_SEND_MESSAGE_METHOD = "UnitySendMessage";
    private static Class<?> unityPlayer;

    private UnityReflection() {
    }

    public static final void captureViewHierarchy() {
        sendMessage(FB_UNITY_GAME_OBJECT, CAPTURE_VIEW_HIERARCHY_METHOD, "");
    }

    private final Class<?> getUnityPlayerClass() {
        Class<?> cls = Class.forName(UNITY_PLAYER_CLASS);
        m.e(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void sendEventMapping(String str) {
        sendMessage(FB_UNITY_GAME_OBJECT, EVENT_MAPPING_METHOD, str);
    }

    public static final void sendMessage(String str, String str2, String str3) {
        Class<String> cls = String.class;
        try {
            if (unityPlayer == null) {
                unityPlayer = INSTANCE.getUnityPlayerClass();
            }
            Class<?> cls2 = unityPlayer;
            if (cls2 != null) {
                Method method = cls2.getMethod(UNITY_SEND_MESSAGE_METHOD, new Class[]{cls, cls, cls});
                Class<?> cls3 = unityPlayer;
                if (cls3 != null) {
                    method.invoke(cls3, new Object[]{str, str2, str3});
                    return;
                }
                m.x("unityPlayer");
                throw null;
            }
            m.x("unityPlayer");
            throw null;
        } catch (Exception unused) {
        }
    }
}
