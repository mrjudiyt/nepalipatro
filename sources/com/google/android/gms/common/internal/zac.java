package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.collection.h;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zac {
    private static final h<String, String> zaa = new h<>();
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    public static String zac(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i10 == 2) {
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        if (i10 != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(R.string.common_google_play_services_enable_button);
    }

    public static String zad(Context context, int i10) {
        Resources resources = context.getResources();
        String zaa2 = zaa(context);
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{zaa2});
        } else if (i10 != 2) {
            if (i10 == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{zaa2});
            } else if (i10 == 5) {
                return zah(context, "common_google_play_services_invalid_account_text", zaa2);
            } else {
                if (i10 == 7) {
                    return zah(context, "common_google_play_services_network_error_text", zaa2);
                }
                if (i10 == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{zaa2});
                } else if (i10 == 20) {
                    return zah(context, "common_google_play_services_restricted_profile_text", zaa2);
                } else {
                    switch (i10) {
                        case 16:
                            return zah(context, "common_google_play_services_api_unavailable_text", zaa2);
                        case 17:
                            return zah(context, "common_google_play_services_sign_in_failed_text", zaa2);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{zaa2});
                        default:
                            return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, new Object[]{zaa2});
                    }
                }
            }
        } else if (DeviceProperties.isWearableWithoutPlayStore(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{zaa2});
        }
    }

    public static String zae(Context context, int i10) {
        if (i10 == 6 || i10 == 19) {
            return zah(context, "common_google_play_services_resolution_required_text", zaa(context));
        }
        return zad(context, i10);
    }

    public static String zaf(Context context, int i10) {
        String str;
        if (i10 == 6) {
            str = zai(context, "common_google_play_services_resolution_required_title");
        } else {
            str = zag(context, i10);
        }
        return str == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : str;
    }

    public static String zag(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return zai(context, "common_google_play_services_invalid_account_title");
            case 7:
                return zai(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return zai(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return zai(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i10);
                return null;
        }
    }

    private static String zah(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zai = zai(context, str);
        if (zai == null) {
            zai = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zai, new Object[]{str2});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zai(android.content.Context r4, java.lang.String r5) {
        /*
            androidx.collection.h<java.lang.String, java.lang.String> r0 = zaa
            monitor-enter(r0)
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ all -> 0x0067 }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x0067 }
            androidx.core.os.k r1 = androidx.core.os.g.a(r1)     // Catch:{ all -> 0x0067 }
            r2 = 0
            java.util.Locale r1 = r1.c(r2)     // Catch:{ all -> 0x0067 }
            java.util.Locale r2 = zab     // Catch:{ all -> 0x0067 }
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x0021
            r0.clear()     // Catch:{ all -> 0x0067 }
            zab = r1     // Catch:{ all -> 0x0067 }
        L_0x0021:
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return r1
        L_0x002b:
            android.content.res.Resources r4 = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(r4)     // Catch:{ all -> 0x0067 }
            r1 = 0
            if (r4 != 0) goto L_0x0034
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return r1
        L_0x0034:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r4.getIdentifier(r5, r2, r3)     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x004b
            java.lang.String r4 = "Missing resource: "
            int r2 = r5.length()     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0049
            r4.concat(r5)     // Catch:{ all -> 0x0067 }
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return r1
        L_0x004b:
            java.lang.String r4 = r4.getString(r2)     // Catch:{ all -> 0x0067 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0062
            java.lang.String r4 = "Got empty resource: "
            int r2 = r5.length()     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0060
            r4.concat(r5)     // Catch:{ all -> 0x0067 }
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return r1
        L_0x0062:
            r0.put(r5, r4)     // Catch:{ all -> 0x0067 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return r4
        L_0x0067:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zac.zai(android.content.Context, java.lang.String):java.lang.String");
    }
}
