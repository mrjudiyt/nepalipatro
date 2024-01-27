package io.flutter.embedding.android;

import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements KeyEventChannel.EventResponseHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KeyboardManager.Responder.OnKeyEventHandledCallback f15010a;

    public /* synthetic */ b(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.f15010a = onKeyEventHandledCallback;
    }

    public final void onFrameworkResponse(boolean z10) {
        this.f15010a.onKeyEventHandled(z10);
    }
}
