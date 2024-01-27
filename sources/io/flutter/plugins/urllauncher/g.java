package io.flutter.plugins.urllauncher;

import android.content.Context;
import android.content.Intent;
import io.flutter.plugins.urllauncher.UrlLauncher;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements UrlLauncher.IntentResolver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f15236a;

    public /* synthetic */ g(Context context) {
        this.f15236a = context;
    }

    public final String getHandlerComponentName(Intent intent) {
        return UrlLauncher.lambda$new$0(this.f15236a, intent);
    }
}
