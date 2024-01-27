package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public class DownloadListenerHostApiImpl implements GeneratedAndroidWebView.DownloadListenerHostApi {
    private final DownloadListenerCreator downloadListenerCreator;
    private final DownloadListenerFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;

    public static class DownloadListenerCreator {
        public DownloadListenerImpl createDownloadListener(DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
            return new DownloadListenerImpl(downloadListenerFlutterApiImpl);
        }
    }

    public static class DownloadListenerImpl implements DownloadListener {
        private final DownloadListenerFlutterApiImpl flutterApi;

        public DownloadListenerImpl(DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
            this.flutterApi = downloadListenerFlutterApiImpl;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onDownloadStart$0(Void voidR) {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
            this.flutterApi.onDownloadStart(this, str, str2, str3, str4, j10, b.f15247a);
        }
    }

    public DownloadListenerHostApiImpl(InstanceManager instanceManager2, DownloadListenerCreator downloadListenerCreator2, DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
        this.instanceManager = instanceManager2;
        this.downloadListenerCreator = downloadListenerCreator2;
        this.flutterApi = downloadListenerFlutterApiImpl;
    }

    public void create(Long l10) {
        this.instanceManager.addDartCreatedInstance(this.downloadListenerCreator.createDownloadListener(this.flutterApi), l10.longValue());
    }
}
