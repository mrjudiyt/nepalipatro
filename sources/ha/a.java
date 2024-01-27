package ha;

import android.content.Intent;
import com.facebook.CallbackManager;
import io.flutter.plugin.common.PluginRegistry;

/* compiled from: ActivityListener */
public class a implements PluginRegistry.ActivityResultListener {

    /* renamed from: h  reason: collision with root package name */
    private final CallbackManager f14856h;

    public a(CallbackManager callbackManager) {
        this.f14856h = callbackManager;
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        return this.f14856h.onActivityResult(i10, i11, intent);
    }
}
