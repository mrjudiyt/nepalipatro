package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import i9.u1;

/* compiled from: SessionLifecycleClient.kt */
public final class SessionLifecycleClient$serviceConnection$1 implements ServiceConnection {
    final /* synthetic */ SessionLifecycleClient this$0;

    SessionLifecycleClient$serviceConnection$1(SessionLifecycleClient sessionLifecycleClient) {
        this.this$0 = sessionLifecycleClient;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        StringBuilder sb = new StringBuilder();
        sb.append("Connected to SessionLifecycleService. Queue size ");
        sb.append(this.this$0.queuedMessages.size());
        this.this$0.service = new Messenger(iBinder);
        this.this$0.serviceBound = true;
        SessionLifecycleClient sessionLifecycleClient = this.this$0;
        u1 unused = sessionLifecycleClient.sendLifecycleEvents(sessionLifecycleClient.drainQueue());
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.this$0.service = null;
        this.this$0.serviceBound = false;
    }
}
