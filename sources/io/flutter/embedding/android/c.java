package io.flutter.embedding.android;

import io.flutter.embedding.android.KeyboardManager;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements BinaryMessenger.BinaryReply {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KeyboardManager.Responder.OnKeyEventHandledCallback f15011a;

    public /* synthetic */ c(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.f15011a = onKeyEventHandledCallback;
    }

    public final void reply(ByteBuffer byteBuffer) {
        KeyEmbedderResponder.lambda$sendKeyEvent$2(this.f15011a, byteBuffer);
    }
}
