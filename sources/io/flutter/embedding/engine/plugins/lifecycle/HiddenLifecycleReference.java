package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.h;

@Keep
public class HiddenLifecycleReference {
    private final h lifecycle;

    public HiddenLifecycleReference(h hVar) {
        this.lifecycle = hVar;
    }

    public h getLifecycle() {
        return this.lifecycle;
    }
}
