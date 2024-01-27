package com.google.firebase.sessions;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import i9.m0;
import i9.n0;
import i9.u1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import r8.d;

/* compiled from: SessionLifecycleClient.kt */
public final class SessionLifecycleClient {
    public static final Companion Companion = new Companion((g) null);
    private static final int MAX_QUEUED_MESSAGES = 20;
    public static final String TAG = "SessionLifecycleClient";
    private final r8.g backgroundDispatcher;
    /* access modifiers changed from: private */
    public final LinkedBlockingDeque<Message> queuedMessages = new LinkedBlockingDeque<>(20);
    /* access modifiers changed from: private */
    public Messenger service;
    /* access modifiers changed from: private */
    public boolean serviceBound;
    private final SessionLifecycleClient$serviceConnection$1 serviceConnection = new SessionLifecycleClient$serviceConnection$1(this);

    /* compiled from: SessionLifecycleClient.kt */
    public static final class ClientUpdateHandler extends Handler {
        private final r8.g backgroundDispatcher;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(r8.g gVar) {
            super(Looper.getMainLooper());
            m.f(gVar, "backgroundDispatcher");
            this.backgroundDispatcher = gVar;
        }

        private final void handleSessionUpdate(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("Session update received: ");
            sb.append(str);
            u1 unused = i.d(m0.a(this.backgroundDispatcher), (r8.g) null, (n0) null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(str, (d<? super SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1>) null), 3, (Object) null);
        }

        public void handleMessage(Message message) {
            String str;
            m.f(message, "msg");
            if (message.what == 3) {
                Bundle data = message.getData();
                if (data == null || (str = data.getString(SessionLifecycleService.SESSION_UPDATE_EXTRA)) == null) {
                    str = "";
                }
                handleSessionUpdate(str);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Received unexpected event from the SessionLifecycleService: ");
            sb.append(message);
            super.handleMessage(message);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public SessionLifecycleClient(r8.g gVar) {
        m.f(gVar, "backgroundDispatcher");
        this.backgroundDispatcher = gVar;
    }

    /* access modifiers changed from: private */
    public final List<Message> drainQueue() {
        ArrayList arrayList = new ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.os.Message} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Message getLatestByCode(java.util.List<android.os.Message> r7, int r8) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0009:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0023
            java.lang.Object r1 = r7.next()
            r2 = r1
            android.os.Message r2 = (android.os.Message) r2
            int r2 = r2.what
            if (r2 != r8) goto L_0x001c
            r2 = 1
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0023:
            java.util.Iterator r7 = r0.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L_0x002f
            r7 = 0
            goto L_0x005a
        L_0x002f:
            java.lang.Object r8 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x003b
        L_0x0039:
            r7 = r8
            goto L_0x005a
        L_0x003b:
            r0 = r8
            android.os.Message r0 = (android.os.Message) r0
            long r0 = r0.getWhen()
        L_0x0042:
            java.lang.Object r2 = r7.next()
            r3 = r2
            android.os.Message r3 = (android.os.Message) r3
            long r3 = r3.getWhen()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0053
            r8 = r2
            r0 = r3
        L_0x0053:
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L_0x0042
            goto L_0x0039
        L_0x005a:
            android.os.Message r7 = (android.os.Message) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionLifecycleClient.getLatestByCode(java.util.List, int):android.os.Message");
    }

    private final void queueMessage(Message message) {
        if (this.queuedMessages.offer(message)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Queued message ");
            sb.append(message.what);
            sb.append(". Queue size ");
            sb.append(this.queuedMessages.size());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to enqueue message ");
        sb2.append(message.what);
        sb2.append(". Dropping.");
    }

    private final void sendLifecycleEvent(int i10) {
        List<Message> drainQueue = drainQueue();
        Message obtain = Message.obtain((Handler) null, i10, 0, 0);
        m.e(obtain, "obtain(null, messageCode, 0, 0)");
        drainQueue.add(obtain);
        sendLifecycleEvents(drainQueue);
    }

    /* access modifiers changed from: private */
    public final u1 sendLifecycleEvents(List<Message> list) {
        return i.d(m0.a(this.backgroundDispatcher), (r8.g) null, (n0) null, new SessionLifecycleClient$sendLifecycleEvents$1(this, list, (d<? super SessionLifecycleClient$sendLifecycleEvents$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void sendMessageToServer(Message message) {
        if (this.service != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Sending lifecycle ");
                sb.append(message.what);
                sb.append(" to service");
                Messenger messenger = this.service;
                if (messenger != null) {
                    messenger.send(message);
                }
            } catch (RemoteException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to deliver message: ");
                sb2.append(message.what);
                queueMessage(message);
            }
        } else {
            queueMessage(message);
        }
    }

    public final void backgrounded() {
        sendLifecycleEvent(2);
    }

    public final void bindToService() {
        SessionLifecycleServiceBinder.Companion.getInstance().bindToService(new Messenger(new ClientUpdateHandler(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void foregrounded() {
        sendLifecycleEvent(1);
    }
}
