package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdxb implements zzhbc {
    private final zzhbp zza;

    public zzdxb(zzhbp zzhbp) {
        this.zza = zzhbp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzhbp r0 = r4.zza
            com.google.android.gms.internal.ads.zzcxc r0 = (com.google.android.gms.internal.ads.zzcxc) r0
            com.google.android.gms.internal.ads.zzfdn r0 = r0.zza()
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzhj
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0052
            com.google.android.gms.ads.internal.client.zzl r1 = r0.zzd
            java.lang.String r1 = r1.zzx
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "request_id"
            if (r2 != 0) goto L_0x0037
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0036 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x0036 }
            java.lang.String r1 = r2.getString(r3)     // Catch:{ JSONException -> 0x0036 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0036 }
            if (r2 != 0) goto L_0x0037
            goto L_0x0062
        L_0x0036:
        L_0x0037:
            com.google.android.gms.ads.internal.client.zzl r1 = r0.zzd
            com.google.android.gms.ads.internal.client.zzc r1 = r1.zzs
            if (r1 == 0) goto L_0x0052
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0052 }
            com.google.android.gms.ads.internal.client.zzl r0 = r0.zzd     // Catch:{ JSONException -> 0x0052 }
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs     // Catch:{ JSONException -> 0x0052 }
            java.lang.String r0 = r0.zza     // Catch:{ JSONException -> 0x0052 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0052 }
            java.lang.String r1 = r1.getString(r3)     // Catch:{ JSONException -> 0x0052 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0052 }
            if (r0 == 0) goto L_0x0062
        L_0x0052:
            java.util.Random r0 = com.google.android.gms.ads.internal.client.zzay.zze()
            int r0 = r0.nextInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L_0x0062:
            com.google.android.gms.internal.ads.zzhbk.zzb(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxb.zzb():java.lang.Object");
    }
}
