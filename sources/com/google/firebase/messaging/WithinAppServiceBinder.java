package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import androidx.privacysandbox.ads.adservices.topics.i;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.concurrent.Executor;

class WithinAppServiceBinder extends Binder {
    private final IntentHandler intentHandler;

    interface IntentHandler {
        Task<Void> handle(Intent intent);
    }

    WithinAppServiceBinder(IntentHandler intentHandler2) {
        this.intentHandler = intentHandler2;
    }

    /* access modifiers changed from: package-private */
    public void send(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() == Process.myUid()) {
            this.intentHandler.handle(bindRequest.intent).addOnCompleteListener((Executor) i.f3908h, new d0(bindRequest));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
