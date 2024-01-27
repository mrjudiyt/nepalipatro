package io.flutter.embedding.engine.deferredcomponents;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;

public interface DeferredComponentManager {
    void destroy();

    String getDeferredComponentInstallState(int i10, String str);

    void installDeferredComponent(int i10, String str);

    void loadAssets(int i10, String str);

    void loadDartLibrary(int i10, String str);

    void setDeferredComponentChannel(DeferredComponentChannel deferredComponentChannel);

    void setJNI(FlutterJNI flutterJNI);

    boolean uninstallDeferredComponent(int i10, String str);
}
