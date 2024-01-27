package e3;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.HashMap;

/* compiled from: FacebookBannerAdPlugin */
public class b extends PlatformViewFactory {

    /* renamed from: a  reason: collision with root package name */
    private final BinaryMessenger f8012a;

    b(BinaryMessenger binaryMessenger) {
        super(StandardMessageCodec.INSTANCE);
        this.f8012a = binaryMessenger;
    }

    public PlatformView create(Context context, int i10, Object obj) {
        return new c(context, i10, (HashMap) obj, this.f8012a);
    }
}
