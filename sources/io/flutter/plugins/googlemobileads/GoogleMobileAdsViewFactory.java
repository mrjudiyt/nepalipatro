package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import io.flutter.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugin.platform.c;
import java.util.Locale;

final class GoogleMobileAdsViewFactory extends PlatformViewFactory {
    private final AdInstanceManager manager;

    private static class ErrorTextView implements PlatformView {
        private final TextView textView;

        private ErrorTextView(Context context, String str) {
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setText(str);
            textView2.setBackgroundColor(-65536);
            textView2.setTextColor(-256);
        }

        public void dispose() {
        }

        public View getView() {
            return this.textView;
        }

        public /* synthetic */ void onFlutterViewAttached(View view) {
            c.a(this, view);
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

    public GoogleMobileAdsViewFactory(AdInstanceManager adInstanceManager) {
        super(StandardMessageCodec.INSTANCE);
        this.manager = adInstanceManager;
    }

    private static PlatformView getErrorView(final Context context, int i10) {
        Log.e(GoogleMobileAdsViewFactory.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", new Object[]{Integer.valueOf(i10)}));
        return new PlatformView() {
            public void dispose() {
            }

            public View getView() {
                return new View(context);
            }

            public /* synthetic */ void onFlutterViewAttached(View view) {
                c.a(this, view);
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
        };
    }

    public PlatformView create(Context context, int i10, Object obj) {
        if (obj == null) {
            return getErrorView(context, 0);
        }
        Integer num = (Integer) obj;
        FlutterAd adForId = this.manager.adForId(num.intValue());
        if (adForId == null || adForId.getPlatformView() == null) {
            return getErrorView(context, num.intValue());
        }
        return adForId.getPlatformView();
    }
}
