package com.facebook.internal;

import android.content.Intent;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: CallbackManagerImpl.kt */
public final class CallbackManagerImpl implements CallbackManager {
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public static final Map<Integer, Callback> staticCallbacks = new HashMap();
    private final Map<Integer, Callback> callbacks = new HashMap();

    /* compiled from: CallbackManagerImpl.kt */
    public interface Callback {
        boolean onActivityResult(int i10, Intent intent);
    }

    /* compiled from: CallbackManagerImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final synchronized Callback getStaticCallback(int i10) {
            return (Callback) CallbackManagerImpl.staticCallbacks.get(Integer.valueOf(i10));
        }

        /* access modifiers changed from: private */
        public final boolean runStaticCallback(int i10, int i11, Intent intent) {
            Callback staticCallback = getStaticCallback(i10);
            if (staticCallback == null) {
                return false;
            }
            return staticCallback.onActivityResult(i11, intent);
        }

        public final synchronized void registerStaticCallback(int i10, Callback callback) {
            m.f(callback, "callback");
            if (!CallbackManagerImpl.staticCallbacks.containsKey(Integer.valueOf(i10))) {
                CallbackManagerImpl.staticCallbacks.put(Integer.valueOf(i10), callback);
            }
        }
    }

    /* compiled from: CallbackManagerImpl.kt */
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);
        
        private final int offset;

        private RequestCodeOffset(int i10) {
            this.offset = i10;
        }

        public final int toRequestCode() {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            return FacebookSdk.getCallbackRequestCodeOffset() + this.offset;
        }
    }

    public static final synchronized void registerStaticCallback(int i10, Callback callback) {
        synchronized (CallbackManagerImpl.class) {
            Companion.registerStaticCallback(i10, callback);
        }
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        Callback callback = this.callbacks.get(Integer.valueOf(i10));
        if (callback == null) {
            return Companion.runStaticCallback(i10, i11, intent);
        }
        return callback.onActivityResult(i11, intent);
    }

    public final void registerCallback(int i10, Callback callback) {
        m.f(callback, "callback");
        this.callbacks.put(Integer.valueOf(i10), callback);
    }

    public final void unregisterCallback(int i10) {
        this.callbacks.remove(Integer.valueOf(i10));
    }
}
