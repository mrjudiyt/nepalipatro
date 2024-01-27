package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

class FlutterRequestAgentProvider {
    static final String GAME_VERSION_KEY = "io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION";
    static final String NEWS_VERSION_KEY = "io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION";
    private String gameTemplateVersion;
    private String newsTemplateVersion;

    FlutterRequestAgentProvider(Context context) {
        processGameAndNewsTemplateVersions(context);
    }

    private void processGameAndNewsTemplateVersions(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.gameTemplateVersion = bundle.getString(GAME_VERSION_KEY);
                this.newsTemplateVersion = applicationInfo.metaData.getString(NEWS_VERSION_KEY);
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public String getRequestAgent() {
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.REQUEST_AGENT_PREFIX_VERSIONED);
        if (this.newsTemplateVersion != null) {
            sb.append("_");
            sb.append(Constants.REQUEST_AGENT_NEWS_TEMPLATE_PREFIX);
            sb.append("-");
            sb.append(this.newsTemplateVersion);
        }
        if (this.gameTemplateVersion != null) {
            sb.append("_");
            sb.append(Constants.REQUEST_AGENT_GAME_TEMPLATE_PREFIX);
            sb.append("-");
            sb.append(this.gameTemplateVersion);
        }
        return sb.toString();
    }
}
