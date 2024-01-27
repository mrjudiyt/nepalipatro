package io.flutter.embedding.engine.systemchannels;

import com.facebook.share.internal.ShareConstants;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.JSONMessageCodec;
import java.util.HashMap;

public class SystemChannel {
    private static final String TAG = "SystemChannel";
    public final BasicMessageChannel<Object> channel;

    public SystemChannel(DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<>(dartExecutor, "flutter/system", JSONMessageCodec.INSTANCE);
    }

    public void sendMemoryPressureWarning() {
        Log.v(TAG, "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put(ShareConstants.MEDIA_TYPE, "memoryPressure");
        this.channel.send(hashMap);
    }
}
