package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public abstract class zzj<T extends zzj> {
    public static String zza(Object obj) {
        return zzd(obj, 0);
    }

    public static String zzb(Map map) {
        return zzd(map, 1);
    }

    private static String zzd(Object obj, int i10) {
        if (i10 > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (TextUtils.isEmpty((String) obj)) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            if (!((Boolean) obj).booleanValue()) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i10 > 0) {
                sb.append("[");
            }
            int length = sb.length();
            for (Object next : (List) obj) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(zzd(next, i10 + 1));
            }
            if (i10 > 0) {
                sb.append("]");
            }
            return sb.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = false;
            int i11 = 0;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String zzd = zzd(entry.getValue(), i10 + 1);
                if (!TextUtils.isEmpty(zzd)) {
                    if (i10 > 0 && !z10) {
                        sb2.append("{");
                        i11 = sb2.length();
                        z10 = true;
                    }
                    if (sb2.length() > i11) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append('=');
                    sb2.append(zzd);
                }
            }
            if (z10) {
                sb2.append("}");
            }
            return sb2.toString();
        }
    }

    public abstract void zzc(T t10);
}
