package io.flutter.plugins.googlemobileads;

import android.view.View;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.c;

class FlutterPlatformView implements PlatformView {
    private View view;

    FlutterPlatformView(View view2) {
        this.view = view2;
    }

    public void dispose() {
        this.view = null;
    }

    public View getView() {
        return this.view;
    }

    public /* synthetic */ void onFlutterViewAttached(View view2) {
        c.a(this, view2);
    }

    public /* synthetic */ void onFlutterViewDetached() {
        c.b(this);
    }

    public /* synthetic */ void onInputConnectionLocked() {
        c.c(this);
    }

    public /* synthetic */ void onInputConnectionUnlocked() {
        c.d(this);
    }
}
