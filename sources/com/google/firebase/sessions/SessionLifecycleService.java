package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.firebase.sessions.SessionGenerator;
import com.google.firebase.sessions.settings.SessionsSettings;
import h9.a;
import java.util.ArrayList;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: SessionLifecycleService.kt */
public final class SessionLifecycleService extends Service {
    public static final int BACKGROUNDED = 2;
    private static final int CLIENT_BOUND = 4;
    public static final String CLIENT_CALLBACK_MESSENGER = "ClientCallbackMessenger";
    public static final Companion Companion = new Companion((g) null);
    public static final int FOREGROUNDED = 1;
    public static final int SESSION_UPDATED = 3;
    public static final String SESSION_UPDATE_EXTRA = "SessionUpdateExtra";
    public static final String TAG = "SessionLifecycleService";
    private final HandlerThread handlerThread = new HandlerThread("FirebaseSessions_HandlerThread");
    private MessageHandler messageHandler;
    private Messenger messenger;

    /* compiled from: SessionLifecycleService.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: SessionLifecycleService.kt */
    public static final class MessageHandler extends Handler {
        private final ArrayList<Messenger> boundClients = new ArrayList<>();
        private boolean hasForegrounded;
        private long lastMsgTimeMs;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MessageHandler(Looper looper) {
            super(looper);
            m.f(looper, "looper");
        }

        private final void broadcastSession() {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcasting new session: ");
            SessionGenerator.Companion companion = SessionGenerator.Companion;
            sb.append(companion.getInstance().getCurrentSession());
            SessionFirelogPublisher.Companion.getInstance().logSession(companion.getInstance().getCurrentSession());
            for (Messenger messenger : new ArrayList(this.boundClients)) {
                m.e(messenger, "it");
                maybeSendSessionToClient(messenger);
            }
        }

        private final void handleBackgrounding(Message message) {
            StringBuilder sb = new StringBuilder();
            sb.append("Activity backgrounding at ");
            sb.append(message.getWhen());
            this.lastMsgTimeMs = message.getWhen();
        }

        private final void handleClientBound(Message message) {
            this.boundClients.add(message.replyTo);
            Messenger messenger = message.replyTo;
            m.e(messenger, "msg.replyTo");
            maybeSendSessionToClient(messenger);
            StringBuilder sb = new StringBuilder();
            sb.append("Client ");
            sb.append(message.replyTo);
            sb.append(" bound at ");
            sb.append(message.getWhen());
            sb.append(". Clients: ");
            sb.append(this.boundClients.size());
        }

        private final void handleForegrounding(Message message) {
            StringBuilder sb = new StringBuilder();
            sb.append("Activity foregrounding at ");
            sb.append(message.getWhen());
            sb.append('.');
            if (!this.hasForegrounded) {
                this.hasForegrounded = true;
                newSession();
            } else if (isSessionRestart(message.getWhen())) {
                newSession();
            }
            this.lastMsgTimeMs = message.getWhen();
        }

        private final boolean isSessionRestart(long j10) {
            return j10 - this.lastMsgTimeMs > a.p(SessionsSettings.Companion.getInstance().m171getSessionRestartTimeoutUwyO8pc());
        }

        private final void maybeSendSessionToClient(Messenger messenger) {
            if (this.hasForegrounded) {
                sendSessionToClient(messenger, SessionGenerator.Companion.getInstance().getCurrentSession().getSessionId());
                return;
            }
            String currentSessionId = SessionDatastore.Companion.getInstance().getCurrentSessionId();
            StringBuilder sb = new StringBuilder();
            sb.append("App has not yet foregrounded. Using previously stored session: ");
            sb.append(currentSessionId);
            if (currentSessionId != null) {
                sendSessionToClient(messenger, currentSessionId);
            }
        }

        private final void newSession() {
            SessionGenerator.Companion companion = SessionGenerator.Companion;
            companion.getInstance().generateNewSession();
            StringBuilder sb = new StringBuilder();
            sb.append("Generated new session ");
            sb.append(companion.getInstance().getCurrentSession().getSessionId());
            broadcastSession();
            SessionDatastore.Companion.getInstance().updateSessionId(companion.getInstance().getCurrentSession().getSessionId());
        }

        private final void sendSessionToClient(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString(SessionLifecycleService.SESSION_UPDATE_EXTRA, str);
                Message obtain = Message.obtain((Handler) null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Removing dead client from list: ");
                sb.append(messenger);
                this.boundClients.remove(messenger);
            } catch (Exception unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to push new session to ");
                sb2.append(messenger);
                sb2.append('.');
            }
        }

        public void handleMessage(Message message) {
            m.f(message, "msg");
            if (this.lastMsgTimeMs > message.getWhen()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring old message from ");
                sb.append(message.getWhen());
                sb.append(" which is older than ");
                sb.append(this.lastMsgTimeMs);
                sb.append('.');
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                handleForegrounding(message);
            } else if (i10 == 2) {
                handleBackgrounding(message);
            } else if (i10 != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Received unexpected event from the SessionLifecycleClient: ");
                sb2.append(message);
                super.handleMessage(message);
            } else {
                handleClientBound(message);
            }
        }
    }

    private final Messenger getClientCallback(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (Messenger) intent.getParcelableExtra(CLIENT_CALLBACK_MESSENGER, Messenger.class);
        }
        return (Messenger) intent.getParcelableExtra(CLIENT_CALLBACK_MESSENGER);
    }

    public final HandlerThread getHandlerThread$com_google_firebase_firebase_sessions() {
        return this.handlerThread;
    }

    public IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Service bound to new client on process ");
        sb.append(intent.getAction());
        Messenger clientCallback = getClientCallback(intent);
        if (clientCallback != null) {
            Message obtain = Message.obtain((Handler) null, 4, 0, 0);
            obtain.replyTo = clientCallback;
            MessageHandler messageHandler2 = this.messageHandler;
            if (messageHandler2 != null) {
                messageHandler2.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.messenger;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        m.e(looper, "handlerThread.looper");
        this.messageHandler = new MessageHandler(looper);
        this.messenger = new Messenger(this.messageHandler);
    }

    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }
}
