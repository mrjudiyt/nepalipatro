package f6;

import com.facebook.internal.AnalyticsEvents;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f14573a = new HashSet(Arrays.asList(new String[]{"app_update", "review"}));

    /* renamed from: b  reason: collision with root package name */
    private static final Set f14574b = new HashSet(Arrays.asList(new String[]{AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE, "unity"}));

    /* renamed from: c  reason: collision with root package name */
    private static final Map f14575c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final s f14576d = new s("PlayCoreVersion");

    public static synchronized Map a(String str) {
        Map map;
        synchronized (o.class) {
            Map map2 = f14575c;
            if (!map2.containsKey("app_update")) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11004);
                map2.put("app_update", hashMap);
            }
            map = (Map) map2.get("app_update");
        }
        return map;
    }
}
