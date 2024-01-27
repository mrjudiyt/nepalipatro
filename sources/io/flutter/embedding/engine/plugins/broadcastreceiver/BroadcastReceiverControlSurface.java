package io.flutter.embedding.engine.plugins.broadcastreceiver;

import android.content.BroadcastReceiver;
import androidx.lifecycle.h;

public interface BroadcastReceiverControlSurface {
    void attachToBroadcastReceiver(BroadcastReceiver broadcastReceiver, h hVar);

    void detachFromBroadcastReceiver();
}
