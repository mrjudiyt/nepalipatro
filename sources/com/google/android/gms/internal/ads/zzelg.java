package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzelg {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    zzelg(Executor executor) {
        this.zzf = executor;
    }

    private final synchronized zzfvv zzh(String str) {
        HashMap hashMap;
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(zzt.zzo().zzh().zzh().zzc())) {
                boolean matches = Pattern.matches((String) zzba.zzc().zzb(zzbci.zzcT), str);
                boolean matches2 = Pattern.matches((String) zzba.zzc().zzb(zzbci.zzcU), str);
                if (matches) {
                    hashMap = new HashMap(this.zze);
                } else if (matches2) {
                    hashMap = new HashMap(this.zzd);
                } else {
                    return zzfvv.zzd();
                }
                return zzfvv.zzc(hashMap);
            }
        }
        return zzfvv.zzd();
    }

    private final synchronized List zzi(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle zzo = zzo(jSONObject.optJSONObject("data"));
        JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (optJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            String optString = optJSONArray.optString(i10, "");
            if (!TextUtils.isEmpty(optString)) {
                arrayList2.add(optString);
            }
        }
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = (String) arrayList2.get(i11);
            zzg(str2);
            if (((zzeli) this.zza.get(str2)) != null) {
                arrayList.add(new zzeli(str2, str, zzo));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final synchronized void zzj() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzm();
        zzn();
        zzk();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzk() {
        /*
            r14 = this;
            monitor-enter(r14)
            com.google.android.gms.internal.ads.zzbdn r0 = com.google.android.gms.internal.ads.zzbeh.zzb     // Catch:{ all -> 0x00b7 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x00b7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00b7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x00b5
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzbK     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00b7 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00b7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x0023
            goto L_0x00b5
        L_0x0023:
            com.google.android.gms.internal.ads.zzcac r0 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzh()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzbzw r0 = r0.zzh()     // Catch:{ all -> 0x00b7 }
            org.json.JSONObject r0 = r0.zzf()     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x0037
            monitor-exit(r14)
            return
        L_0x0037:
            java.lang.String r1 = "adapter_settings"
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch:{ JSONException -> 0x00ad }
            r1 = 0
            r2 = 0
        L_0x003f:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x00ad }
            if (r2 >= r3) goto L_0x00ab
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r4 = "adapter_class_name"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r5 = "permission_set"
            org.json.JSONArray r3 = r3.optJSONArray(r5)     // Catch:{ JSONException -> 0x00ad }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x00ad }
            if (r5 != 0) goto L_0x00a8
            r11 = 0
        L_0x005c:
            int r5 = r3.length()     // Catch:{ JSONException -> 0x00ad }
            if (r11 >= r5) goto L_0x00a8
            org.json.JSONObject r5 = r3.getJSONObject(r11)     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r6 = "enable_rendering"
            boolean r8 = r5.optBoolean(r6, r1)     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r6 = "collect_secure_signals"
            boolean r7 = r5.optBoolean(r6, r1)     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r6 = "collect_secure_signals_on_full_app"
            boolean r9 = r5.optBoolean(r6, r1)     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r6 = "platform"
            java.lang.String r12 = r5.optString(r6)     // Catch:{ JSONException -> 0x00ad }
            com.google.android.gms.internal.ads.zzelk r13 = new com.google.android.gms.internal.ads.zzelk     // Catch:{ JSONException -> 0x00ad }
            android.os.Bundle r10 = new android.os.Bundle     // Catch:{ JSONException -> 0x00ad }
            r10.<init>()     // Catch:{ JSONException -> 0x00ad }
            r5 = r13
            r6 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r5 = "ADMOB"
            boolean r5 = r12.equals(r5)     // Catch:{ JSONException -> 0x00ad }
            if (r5 == 0) goto L_0x0098
            java.util.Map r5 = r14.zzd     // Catch:{ JSONException -> 0x00ad }
            r5.put(r4, r13)     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00a5
        L_0x0098:
            java.lang.String r5 = "AD_MANAGER"
            boolean r5 = r12.equals(r5)     // Catch:{ JSONException -> 0x00ad }
            if (r5 == 0) goto L_0x00a5
            java.util.Map r5 = r14.zze     // Catch:{ JSONException -> 0x00ad }
            r5.put(r4, r13)     // Catch:{ JSONException -> 0x00ad }
        L_0x00a5:
            int r11 = r11 + 1
            goto L_0x005c
        L_0x00a8:
            int r2 = r2 + 1
            goto L_0x003f
        L_0x00ab:
            monitor-exit(r14)
            return
        L_0x00ad:
            r0 = move-exception
            java.lang.String r1 = "Malformed config loading JSON."
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r14)
            return
        L_0x00b5:
            monitor-exit(r14)
            return
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelg.zzk():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzl(java.lang.String r3, java.lang.String r4, java.util.List r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            java.util.Map r0 = r2.zzc     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0038 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x001c
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0038 }
            r0.<init>()     // Catch:{ all -> 0x0038 }
        L_0x001c:
            java.util.Map r1 = r2.zzc     // Catch:{ all -> 0x0038 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0038 }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x0038 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0038 }
            if (r3 != 0) goto L_0x002e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0038 }
            r3.<init>()     // Catch:{ all -> 0x0038 }
        L_0x002e:
            r3.addAll(r5)     // Catch:{ all -> 0x0038 }
            r0.put(r4, r3)     // Catch:{ all -> 0x0038 }
            monitor-exit(r2)
            return
        L_0x0036:
            monitor-exit(r2)
            return
        L_0x0038:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelg.zzl(java.lang.String, java.lang.String, java.util.List):void");
    }

    private final synchronized void zzm() {
        String str;
        JSONObject zzf2 = zzt.zzo().zzh().zzh().zzf();
        if (zzf2 != null) {
            try {
                JSONArray optJSONArray = zzf2.optJSONArray("ad_unit_id_settings");
                this.zzg = zzf2.optJSONObject("ad_unit_patterns");
                if (optJSONArray != null) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i10);
                        if (((Boolean) zzba.zzc().zzb(zzbci.zzjX)).booleanValue()) {
                            str = jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT);
                        } else {
                            str = jSONObject.optString("ad_unit_id", "");
                        }
                        String optString = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("ad_networks");
                            if (optJSONArray2 != null) {
                                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                                    arrayList.addAll(zzi(optJSONArray2.getJSONObject(i11), optString));
                                }
                            }
                        }
                        zzl(optString, str, arrayList);
                    }
                }
            } catch (JSONException e10) {
                zze.zzb("Malformed config loading JSON.", e10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzn() {
        /*
            r12 = this;
            monitor-enter(r12)
            com.google.android.gms.internal.ads.zzbdn r0 = com.google.android.gms.internal.ads.zzbeh.zzg     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x0086 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0086 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x0084
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzbJ     // Catch:{ all -> 0x0086 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0086 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0086 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x0022
            goto L_0x0084
        L_0x0022:
            com.google.android.gms.internal.ads.zzcac r0 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x0086 }
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzh()     // Catch:{ all -> 0x0086 }
            com.google.android.gms.internal.ads.zzbzw r0 = r0.zzh()     // Catch:{ all -> 0x0086 }
            org.json.JSONObject r0 = r0.zzf()     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x0036
            monitor-exit(r12)
            return
        L_0x0036:
            java.lang.String r1 = "signal_adapters"
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch:{ JSONException -> 0x007c }
            r1 = 0
            r2 = 0
        L_0x003e:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x007c }
            if (r2 >= r3) goto L_0x007a
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r4 = "data"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch:{ JSONException -> 0x007c }
            android.os.Bundle r10 = zzo(r4)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r4 = "adapter_class_name"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r5 = "render"
            boolean r8 = r3.optBoolean(r5, r1)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r5 = "collect_signals"
            boolean r7 = r3.optBoolean(r5, r1)     // Catch:{ JSONException -> 0x007c }
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x007c }
            if (r3 != 0) goto L_0x0077
            java.util.Map r3 = r12.zzb     // Catch:{ JSONException -> 0x007c }
            com.google.android.gms.internal.ads.zzelk r11 = new com.google.android.gms.internal.ads.zzelk     // Catch:{ JSONException -> 0x007c }
            r9 = 1
            r5 = r11
            r6 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ JSONException -> 0x007c }
            r3.put(r4, r11)     // Catch:{ JSONException -> 0x007c }
        L_0x0077:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x007a:
            monitor-exit(r12)
            return
        L_0x007c:
            r0 = move-exception
            java.lang.String r1 = "Malformed config loading JSON."
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)     // Catch:{ all -> 0x0086 }
            monitor-exit(r12)
            return
        L_0x0084:
            monitor-exit(r12)
            return
        L_0x0086:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelg.zzn():void");
    }

    private static final Bundle zzo(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map zza(String str, String str2) {
        HashMap hashMap;
        Bundle bundle;
        Map zzb2 = zzb(str, str2);
        zzfvv zzh = zzh(str2);
        hashMap = new HashMap();
        for (Map.Entry entry : ((zzfvv) zzb2).entrySet()) {
            String str3 = (String) entry.getKey();
            if (zzh.containsKey(str3)) {
                zzelk zzelk = (zzelk) zzh.get(str3);
                List list = (List) entry.getValue();
                boolean z10 = zzelk.zzb;
                boolean z11 = zzelk.zzc;
                boolean z12 = zzelk.zzd;
                if (list == null || list.isEmpty()) {
                    bundle = new Bundle();
                } else {
                    bundle = (Bundle) list.get(0);
                }
                hashMap.put(str3, new zzelk(str3, z10, z11, z12, bundle));
            }
        }
        zzfxs zze2 = zzh.entrySet().iterator();
        while (zze2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) zze2.next();
            String str4 = (String) entry2.getKey();
            if (!hashMap.containsKey(str4) && ((zzelk) entry2.getValue()).zzd) {
                hashMap.put(str4, (zzelk) entry2.getValue());
            }
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.Map zzb(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x00a1
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x00a1
            com.google.android.gms.internal.ads.zzcac r0 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzh()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.internal.ads.zzbzw r0 = r0.zzh()     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r0.zzc()     // Catch:{ all -> 0x00a7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0025
            goto L_0x00a1
        L_0x0025:
            java.util.Map r0 = r3.zzc     // Catch:{ all -> 0x00a7 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x00a7 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzfvv r4 = com.google.android.gms.internal.ads.zzfvv.zzd()     // Catch:{ all -> 0x00a7 }
            monitor-exit(r3)
            return r4
        L_0x0035:
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x00a7 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x0062
            org.json.JSONObject r1 = r3.zzg     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = com.google.android.gms.internal.ads.zzdqq.zza(r1, r5, r4)     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.internal.ads.zzbca r5 = com.google.android.gms.internal.ads.zzbci.zzjX     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00a7 }
            java.lang.Object r5 = r1.zzb(r5)     // Catch:{ all -> 0x00a7 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x00a7 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x00a7 }
            if (r5 == 0) goto L_0x005b
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch:{ all -> 0x00a7 }
        L_0x005b:
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x00a7 }
            r1 = r4
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00a7 }
        L_0x0062:
            if (r1 != 0) goto L_0x006a
            com.google.android.gms.internal.ads.zzfvv r4 = com.google.android.gms.internal.ads.zzfvv.zzd()     // Catch:{ all -> 0x00a7 }
            monitor-exit(r3)
            return r4
        L_0x006a:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x00a7 }
            r4.<init>()     // Catch:{ all -> 0x00a7 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x00a7 }
        L_0x0073:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.internal.ads.zzeli r0 = (com.google.android.gms.internal.ads.zzeli) r0     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = r0.zza     // Catch:{ all -> 0x00a7 }
            boolean r2 = r4.containsKey(r1)     // Catch:{ all -> 0x00a7 }
            if (r2 != 0) goto L_0x008f
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00a7 }
            r2.<init>()     // Catch:{ all -> 0x00a7 }
            r4.put(r1, r2)     // Catch:{ all -> 0x00a7 }
        L_0x008f:
            java.lang.Object r1 = r4.get(r1)     // Catch:{ all -> 0x00a7 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00a7 }
            android.os.Bundle r0 = r0.zzc     // Catch:{ all -> 0x00a7 }
            r1.add(r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0073
        L_0x009b:
            com.google.android.gms.internal.ads.zzfvv r4 = com.google.android.gms.internal.ads.zzfvv.zzc(r4)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r3)
            return r4
        L_0x00a1:
            com.google.android.gms.internal.ads.zzfvv r4 = com.google.android.gms.internal.ads.zzfvv.zzd()     // Catch:{ all -> 0x00a7 }
            monitor-exit(r3)
            return r4
        L_0x00a7:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelg.zzb(java.lang.String, java.lang.String):java.util.Map");
    }

    public final synchronized Map zzc() {
        if (TextUtils.isEmpty(zzt.zzo().zzh().zzh().zzc())) {
            return zzfvv.zzd();
        }
        return zzfvv.zzc(this.zzb);
    }

    public final void zze() {
        zzt.zzo().zzh().zzq(new zzelf(this));
        this.zzf.execute(new zzele(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zzf.execute(new zzele(this));
    }

    public final synchronized void zzg(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!this.zza.containsKey(str)) {
                this.zza.put(str, new zzeli(str, "", new Bundle()));
            }
        }
    }
}
