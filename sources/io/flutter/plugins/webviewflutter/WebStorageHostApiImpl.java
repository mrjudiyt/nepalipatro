package io.flutter.plugins.webviewflutter;

import android.webkit.WebStorage;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Objects;

public class WebStorageHostApiImpl implements GeneratedAndroidWebView.WebStorageHostApi {
    private final InstanceManager instanceManager;
    private final WebStorageCreator webStorageCreator;

    public static class WebStorageCreator {
        public WebStorage createWebStorage() {
            return WebStorage.getInstance();
        }
    }

    public WebStorageHostApiImpl(InstanceManager instanceManager2, WebStorageCreator webStorageCreator2) {
        this.instanceManager = instanceManager2;
        this.webStorageCreator = webStorageCreator2;
    }

    public void create(Long l10) {
        this.instanceManager.addDartCreatedInstance(this.webStorageCreator.createWebStorage(), l10.longValue());
    }

    public void deleteAllData(Long l10) {
        WebStorage webStorage = (WebStorage) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webStorage);
        WebStorage webStorage2 = webStorage;
        webStorage.deleteAllData();
    }
}
