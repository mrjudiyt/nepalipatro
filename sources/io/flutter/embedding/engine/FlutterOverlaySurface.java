package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
public class FlutterOverlaySurface {
    private final int id;
    private final Surface surface;

    public FlutterOverlaySurface(int i10, Surface surface2) {
        this.id = i10;
        this.surface = surface2;
    }

    public int getId() {
        return this.id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
