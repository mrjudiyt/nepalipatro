package androidx.media2.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.concurrent.futures.e;

class MediaControllerImplLegacy$2 extends ResultReceiver {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ e f3816h;

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i10, Bundle bundle) {
        this.f3816h.set(new SessionResult(i10, bundle));
    }
}
