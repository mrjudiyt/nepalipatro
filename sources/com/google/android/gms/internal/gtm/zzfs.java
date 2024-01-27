package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzfs {
    public static long zza(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static zzaw zzb(zzfb zzfb, String str) {
        String str2;
        Preconditions.checkNotNull(zzfb);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "?".concat(valueOf);
            } else {
                str2 = new String("?");
            }
            Map<String, String> parse = HttpUtils.parse(new URI(str2), "UTF-8");
            zzaw zzaw = new zzaw();
            zzaw.zzp(parse.get(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT));
            zzaw.zzu(parse.get("utm_medium"));
            zzaw.zzv(parse.get("utm_campaign"));
            zzaw.zzw(parse.get("utm_source"));
            zzaw.zzt(parse.get(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM));
            zzaw.zzs(parse.get("utm_id"));
            zzaw.zzo(parse.get("anid"));
            zzaw.zzr(parse.get("gclid"));
            zzaw.zzq(parse.get("dclid"));
            zzaw.zzn(parse.get(FirebaseAnalytics.Param.ACLID));
            return zzaw;
        } catch (URISyntaxException e10) {
            zzfb.zzS("No valid campaign data found", e10);
            return null;
        }
    }

    public static String zzc(boolean z10) {
        return true != z10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES;
    }

    public static String zzd(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    public static MessageDigest zze(String str) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static Map<String, String> zzf(String str) {
        HashMap hashMap = new HashMap();
        for (String split : str.split("&")) {
            String[] split2 = split.split("=", 3);
            int length = split2.length;
            String str2 = null;
            if (length > 1) {
                hashMap.put(split2[0], TextUtils.isEmpty(split2[1]) ? null : split2[1]);
                if (length == 3 && !TextUtils.isEmpty(split2[1]) && !hashMap.containsKey(split2[1])) {
                    String str3 = split2[1];
                    if (!TextUtils.isEmpty(split2[2])) {
                        str2 = split2[2];
                    }
                    hashMap.put(str3, str2);
                }
            } else if (length == 1 && split2[0].length() != 0) {
                hashMap.put(split2[0], (Object) null);
            }
        }
        return hashMap;
    }

    public static void zzg(Map<String, String> map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static void zzh(Map<String, String> map, String str, Map<String, String> map2) {
        zzg(map, str, map2.get(str));
    }

    public static boolean zzi(Context context, String str, boolean z10) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo == null || !receiverInfo.enabled || (z10 && !receiverInfo.exported)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean zzj(double d10, String str) {
        int i10;
        if (d10 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d10 < 100.0d) {
            if (!TextUtils.isEmpty(str)) {
                i10 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i10 = ((i10 << 6) & 65535) + charAt + (charAt << 14);
                    int i11 = i10 >> 21;
                    if ((266338304 & i10) != 0) {
                        i10 ^= i11 & 127;
                    }
                }
            } else {
                i10 = 1;
            }
            if (((double) (i10 % 10000)) >= d10 * 100.0d) {
                return true;
            }
        }
        return false;
    }
}
