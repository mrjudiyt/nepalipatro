package io.flutter.plugins.firebase.dynamiclinks;

import android.net.Uri;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import java.util.HashMap;
import java.util.Map;

public class Utils {
    static Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        if (exc != null) {
            hashMap.put("message", exc.getMessage());
        } else {
            hashMap.put("message", "An unknown error has occurred.");
        }
        return hashMap;
    }

    static Map<String, Object> getMapFromPendingDynamicLinkData(PendingDynamicLinkData pendingDynamicLinkData) {
        String str = null;
        if (pendingDynamicLinkData == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Uri link = pendingDynamicLinkData.getLink();
        if (link != null) {
            str = link.toString();
        }
        hashMap.put("link", str);
        HashMap hashMap2 = new HashMap();
        for (String str2 : pendingDynamicLinkData.getUtmParameters().keySet()) {
            hashMap2.put(str2, pendingDynamicLinkData.getUtmParameters().get(str2).toString());
        }
        hashMap.put("utmParameters", hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("clickTimestamp", Long.valueOf(pendingDynamicLinkData.getClickTimestamp()));
        hashMap3.put("minimumVersion", Integer.valueOf(pendingDynamicLinkData.getMinimumAppVersion()));
        hashMap.put("android", hashMap3);
        return hashMap;
    }
}
