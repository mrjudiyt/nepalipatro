package t7;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;

/* compiled from: BetterEventChannel */
public class e implements EventChannel.EventSink {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public EventChannel.EventSink f16588a;

    /* compiled from: BetterEventChannel */
    class a implements EventChannel.StreamHandler {
        a() {
        }

        public void onCancel(Object obj) {
            EventChannel.EventSink unused = e.this.f16588a = null;
        }

        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            EventChannel.EventSink unused = e.this.f16588a = eventSink;
        }
    }

    public e(BinaryMessenger binaryMessenger, String str) {
        new EventChannel(binaryMessenger, str).setStreamHandler(new a());
    }

    public void endOfStream() {
        EventChannel.EventSink eventSink = this.f16588a;
        if (eventSink != null) {
            eventSink.endOfStream();
        }
    }

    public void error(String str, String str2, Object obj) {
        EventChannel.EventSink eventSink = this.f16588a;
        if (eventSink != null) {
            eventSink.error(str, str2, obj);
        }
    }

    public void success(Object obj) {
        EventChannel.EventSink eventSink = this.f16588a;
        if (eventSink != null) {
            eventSink.success(obj);
        }
    }
}
