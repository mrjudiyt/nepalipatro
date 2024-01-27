package e3;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.HashMap;

/* compiled from: FacebookNativeAdPlugin */
class e extends PlatformViewFactory {

    /* renamed from: a  reason: collision with root package name */
    private final BinaryMessenger f8020a;

    e(BinaryMessenger binaryMessenger) {
        super(StandardMessageCodec.INSTANCE);
        this.f8020a = binaryMessenger;
    }

    public PlatformView create(Context context, int i10, Object obj) {
        return new f(context, i10, (HashMap) obj, this.f8020a);
    }
}
