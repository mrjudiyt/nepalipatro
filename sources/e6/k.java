package e6;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import g6.a;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class k implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f14260a;

    k(l lVar, Activity activity) {
        this.f14260a = activity;
    }

    public final void a(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        this.f14260a.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
