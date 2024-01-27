package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.lifecycle.h;

public interface ServiceControlSurface {
    void attachToService(Service service, h hVar, boolean z10);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
