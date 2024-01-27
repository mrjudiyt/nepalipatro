package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzaq implements zzf {
    private final Application zza;
    private final zzas zzb;
    private final Executor zzc;

    public zzaq(Application application, zzas zzas, Executor executor) {
        this.zza = application;
        this.zzb = zzas;
        this.zzc = executor;
    }

    public final Executor zza() {
        return this.zzc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(java.lang.String r8, org.json.JSONObject r9) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = 94746189(0x5a5b64d, float:1.5583492E-35)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 113399775(0x6c257df, float:7.3103804E-35)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "write"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0025
            r8 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "clear"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0025
            r8 = 1
            goto L_0x0026
        L_0x0025:
            r8 = -1
        L_0x0026:
            if (r8 == 0) goto L_0x0077
            if (r8 == r3) goto L_0x002b
            return r2
        L_0x002b:
            java.lang.String r8 = "keys"
            org.json.JSONArray r8 = r9.optJSONArray(r8)
            if (r8 == 0) goto L_0x0069
            int r0 = r8.length()
            if (r0 != 0) goto L_0x003a
            goto L_0x0069
        L_0x003a:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            int r0 = r8.length()
        L_0x0043:
            if (r2 >= r0) goto L_0x0063
            java.lang.String r1 = r8.optString(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x005d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Action[clear]: empty key at index: "
            r1.append(r4)
            r1.append(r2)
            goto L_0x0060
        L_0x005d:
            r9.add(r1)
        L_0x0060:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x0063:
            android.app.Application r8 = r7.zza
            com.google.android.gms.internal.consent_sdk.zzcq.zzb(r8, r9)
            goto L_0x0076
        L_0x0069:
            java.lang.String r8 = r9.toString()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "Action[clear]: wrong args."
            r9.concat(r8)
        L_0x0076:
            return r3
        L_0x0077:
            com.google.android.gms.internal.consent_sdk.zzcp r8 = new com.google.android.gms.internal.consent_sdk.zzcp
            android.app.Application r0 = r7.zza
            r8.<init>(r0)
            java.util.Iterator r0 = r9.keys()
        L_0x0082:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c5
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.opt(r1)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Writing to storage: ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = "] "
            r5.append(r6)
            r5.append(r4)
            boolean r2 = r8.zzc(r1, r2)
            if (r2 == 0) goto L_0x00bb
            com.google.android.gms.internal.consent_sdk.zzas r2 = r7.zzb
            java.util.Set r2 = r2.zzd()
            r2.add(r1)
            goto L_0x0082
        L_0x00bb:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Failed writing key: "
            r2.concat(r1)
            goto L_0x0082
        L_0x00c5:
            com.google.android.gms.internal.consent_sdk.zzas r9 = r7.zzb
            r9.zzf()
            r8.zzb()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzaq.zzb(java.lang.String, org.json.JSONObject):boolean");
    }
}
