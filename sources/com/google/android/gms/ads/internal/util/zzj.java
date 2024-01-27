package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzavv;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzj implements zzg {
    private boolean zzA = false;
    private String zzB = "";
    private int zzC = -1;
    private int zzD = -1;
    private long zzE = 0;
    private final Object zza = new Object();
    private boolean zzb;
    private final List zzc = new ArrayList();
    private e zzd;
    private zzavv zze = null;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private boolean zzh = true;
    private String zzi;
    private String zzj;
    private boolean zzk = true;
    private String zzl = "-1";
    private String zzm = "-1";
    private String zzn = "-1";
    private int zzo = -1;
    private zzbzw zzp = new zzbzw("", 0);
    private long zzq = 0;
    private long zzr = 0;
    private int zzs = -1;
    private int zzt = 0;
    private Set zzu = Collections.emptySet();
    private JSONObject zzv = new JSONObject();
    private boolean zzw = true;
    private boolean zzx = true;
    private String zzy = null;
    private String zzz = "";

    private final void zzT() {
        e eVar = this.zzd;
        if (eVar != null && !eVar.isDone()) {
            try {
                this.zzd.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                zzcat.zzk("Interrupted while waiting for preferences loaded.", e10);
            } catch (CancellationException | ExecutionException | TimeoutException e11) {
                zzcat.zzh("Fail to initialize AdSharedPreferenceManager.", e11);
            }
        }
    }

    private final void zzU() {
        zzcbg.zza.execute(new zzh(this));
    }

    public final void zzA(String str) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zziU)).booleanValue()) {
            zzT();
            synchronized (this.zza) {
                if (!this.zzB.equals(str)) {
                    this.zzB = str;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.zzg.apply();
                    }
                    zzU();
                }
            }
        }
    }

    public final void zzB(boolean z10) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zziU)).booleanValue()) {
            zzT();
            synchronized (this.zza) {
                if (this.zzA != z10) {
                    this.zzA = z10;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z10);
                        this.zzg.apply();
                    }
                    zzU();
                }
            }
        }
    }

    public final void zzC(String str) {
        zzT();
        synchronized (this.zza) {
            if (!TextUtils.equals(this.zzy, str)) {
                this.zzy = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }

    public final void zzD(long j10) {
        zzT();
        synchronized (this.zza) {
            if (this.zzr != j10) {
                this.zzr = j10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j10);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }

    public final void zzE(int i10) {
        zzT();
        synchronized (this.zza) {
            this.zzo = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                if (i10 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i10);
                }
                this.zzg.apply();
            }
            zzU();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzF(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r5.zzT()
            java.lang.Object r0 = r5.zza
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch:{ all -> 0x006c }
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0030
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L_0x0026
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x0026:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 0
            goto L_0x003b
        L_0x0030:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 2
            goto L_0x003b
        L_0x003a:
            r1 = -1
        L_0x003b:
            if (r1 == 0) goto L_0x0049
            if (r1 == r4) goto L_0x0046
            if (r1 == r3) goto L_0x0043
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x0043:
            r5.zzn = r7     // Catch:{ all -> 0x006c }
            goto L_0x004b
        L_0x0046:
            r5.zzm = r7     // Catch:{ all -> 0x006c }
            goto L_0x004b
        L_0x0049:
            r5.zzl = r7     // Catch:{ all -> 0x006c }
        L_0x004b:
            android.content.SharedPreferences$Editor r1 = r5.zzg     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = "-1"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x005d
            android.content.SharedPreferences$Editor r7 = r5.zzg     // Catch:{ all -> 0x006c }
            r7.remove(r6)     // Catch:{ all -> 0x006c }
            goto L_0x0062
        L_0x005d:
            android.content.SharedPreferences$Editor r1 = r5.zzg     // Catch:{ all -> 0x006c }
            r1.putString(r6, r7)     // Catch:{ all -> 0x006c }
        L_0x0062:
            android.content.SharedPreferences$Editor r6 = r5.zzg     // Catch:{ all -> 0x006c }
            r6.apply()     // Catch:{ all -> 0x006c }
        L_0x0067:
            r5.zzU()     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.zzF(java.lang.String, java.lang.String):void");
    }

    public final void zzG(String str) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zziF)).booleanValue()) {
            zzT();
            synchronized (this.zza) {
                if (!this.zzz.equals(str)) {
                    this.zzz = str;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.zzg.apply();
                    }
                    zzU();
                }
            }
        }
    }

    public final void zzH(boolean z10) {
        zzT();
        synchronized (this.zza) {
            if (z10 != this.zzk) {
                this.zzk = z10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z10);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }

    public final void zzI(boolean z10) {
        zzT();
        synchronized (this.zza) {
            long currentTimeMillis = System.currentTimeMillis() + ((Long) zzba.zzc().zzb(zzbci.zzjE)).longValue();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("is_topics_ad_personalization_allowed", z10);
                this.zzg.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                this.zzg.apply();
            }
            zzU();
        }
    }

    public final void zzJ(String str, String str2, boolean z10) {
        zzT();
        synchronized (this.zza) {
            JSONArray optJSONArray = this.zzv.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        if (str2.equals(optJSONObject.optString("template_id"))) {
                            if (z10) {
                                if (optJSONObject.optBoolean("uses_media_view", false)) {
                                    return;
                                }
                            }
                            length = i10;
                        } else {
                            i10++;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                jSONObject.put("timestamp_ms", zzt.zzB().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzv.put(str, optJSONArray);
            } catch (JSONException e10) {
                zzcat.zzk("Could not update native advanced settings", e10);
            }
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzv.toString());
                this.zzg.apply();
            }
            zzU();
        }
    }

    public final void zzK(int i10) {
        zzT();
        synchronized (this.zza) {
            if (this.zzs != i10) {
                this.zzs = i10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i10);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }

    public final void zzL(int i10) {
        zzT();
        synchronized (this.zza) {
            if (this.zzD != i10) {
                this.zzD = i10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i10);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }

    public final void zzM(long j10) {
        zzT();
        synchronized (this.zza) {
            if (this.zzE != j10) {
                this.zzE = j10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j10);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }

    public final boolean zzN() {
        boolean z10;
        zzT();
        synchronized (this.zza) {
            z10 = this.zzw;
        }
        return z10;
    }

    public final boolean zzO() {
        boolean z10;
        zzT();
        synchronized (this.zza) {
            z10 = this.zzx;
        }
        return z10;
    }

    public final boolean zzP() {
        boolean z10;
        zzT();
        synchronized (this.zza) {
            z10 = this.zzA;
        }
        return z10;
    }

    public final boolean zzQ() {
        boolean z10;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzat)).booleanValue()) {
            return false;
        }
        zzT();
        synchronized (this.zza) {
            z10 = this.zzk;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzR() {
        /*
            r7 = this;
            r7.zzT()
            java.lang.Object r0 = r7.zza
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r7.zzf     // Catch:{ all -> 0x0030 }
            r2 = 0
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return r2
        L_0x000d:
            java.lang.String r3 = "topics_consent_expiry_time_ms"
            r4 = 0
            long r3 = r1.getLong(r3, r4)     // Catch:{ all -> 0x0030 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0030 }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return r2
        L_0x001f:
            android.content.SharedPreferences r1 = r7.zzf     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = "is_topics_ad_personalization_allowed"
            boolean r1 = r1.getBoolean(r3, r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            boolean r1 = r7.zzk     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002e
            r2 = 1
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return r2
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.zzR():boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzS(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.zza) {
            this.zzf = sharedPreferences;
            this.zzg = edit;
            if (PlatformVersion.isAtLeastM()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.zzh = this.zzf.getBoolean("use_https", this.zzh);
            this.zzw = this.zzf.getBoolean("content_url_opted_out", this.zzw);
            this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
            this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
            this.zzx = this.zzf.getBoolean("content_vertical_opted_out", this.zzx);
            this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
            this.zzt = this.zzf.getInt("version_code", this.zzt);
            this.zzp = new zzbzw(this.zzf.getString("app_settings_json", this.zzp.zzc()), this.zzf.getLong("app_settings_last_update_ms", this.zzp.zza()));
            this.zzq = this.zzf.getLong("app_last_background_time_ms", this.zzq);
            this.zzs = this.zzf.getInt("request_in_session_count", this.zzs);
            this.zzr = this.zzf.getLong("first_ad_req_time_ms", this.zzr);
            this.zzu = this.zzf.getStringSet("never_pool_slots", this.zzu);
            this.zzy = this.zzf.getString("display_cutout", this.zzy);
            this.zzC = this.zzf.getInt("app_measurement_npa", this.zzC);
            this.zzD = this.zzf.getInt("sd_app_measure_npa", this.zzD);
            this.zzE = this.zzf.getLong("sd_app_measure_npa_ts", this.zzE);
            this.zzz = this.zzf.getString("inspector_info", this.zzz);
            this.zzA = this.zzf.getBoolean("linked_device", this.zzA);
            this.zzB = this.zzf.getString("linked_ad_unit", this.zzB);
            this.zzl = this.zzf.getString("IABTCF_gdprApplies", this.zzl);
            this.zzn = this.zzf.getString("IABTCF_PurposeConsents", this.zzn);
            this.zzm = this.zzf.getString("IABTCF_TCString", this.zzm);
            this.zzo = this.zzf.getInt("gad_has_consent_for_cookies", this.zzo);
            try {
                this.zzv = new JSONObject(this.zzf.getString("native_advanced_settings", "{}"));
            } catch (JSONException e10) {
                zzcat.zzk("Could not convert native advanced settings to json object", e10);
            }
            zzU();
        }
    }

    public final int zza() {
        int i10;
        zzT();
        synchronized (this.zza) {
            i10 = this.zzt;
        }
        return i10;
    }

    public final int zzb() {
        int i10;
        zzT();
        synchronized (this.zza) {
            i10 = this.zzo;
        }
        return i10;
    }

    public final int zzc() {
        int i10;
        zzT();
        synchronized (this.zza) {
            i10 = this.zzs;
        }
        return i10;
    }

    public final long zzd() {
        long j10;
        zzT();
        synchronized (this.zza) {
            j10 = this.zzq;
        }
        return j10;
    }

    public final long zze() {
        long j10;
        zzT();
        synchronized (this.zza) {
            j10 = this.zzr;
        }
        return j10;
    }

    public final long zzf() {
        long j10;
        zzT();
        synchronized (this.zza) {
            j10 = this.zzE;
        }
        return j10;
    }

    public final zzavv zzg() {
        if (!this.zzb) {
            return null;
        }
        if ((zzN() && zzO()) || !((Boolean) zzbdt.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zze == null) {
                this.zze = new zzavv();
            }
            this.zze.zze();
            zzcat.zzi("start fetching content...");
            zzavv zzavv = this.zze;
            return zzavv;
        }
    }

    public final zzbzw zzh() {
        zzbzw zzbzw;
        zzT();
        synchronized (this.zza) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkI)).booleanValue() && this.zzp.zzj()) {
                for (Runnable run : this.zzc) {
                    run.run();
                }
            }
            zzbzw = this.zzp;
        }
        return zzbzw;
    }

    public final zzbzw zzi() {
        zzbzw zzbzw;
        synchronized (this.zza) {
            zzbzw = this.zzp;
        }
        return zzbzw;
    }

    public final String zzj() {
        String str;
        zzT();
        synchronized (this.zza) {
            str = this.zzi;
        }
        return str;
    }

    public final String zzk() {
        String str;
        zzT();
        synchronized (this.zza) {
            str = this.zzj;
        }
        return str;
    }

    public final String zzl() {
        String str;
        zzT();
        synchronized (this.zza) {
            str = this.zzB;
        }
        return str;
    }

    public final String zzm() {
        String str;
        zzT();
        synchronized (this.zza) {
            str = this.zzy;
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzn(java.lang.String r6) {
        /*
            r5 = this;
            r5.zzT()
            java.lang.Object r0 = r5.zza
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch:{ all -> 0x0050 }
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0030
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L_0x0026
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 1
            goto L_0x003b
        L_0x0026:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 0
            goto L_0x003b
        L_0x0030:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 2
            goto L_0x003b
        L_0x003a:
            r6 = -1
        L_0x003b:
            if (r6 == 0) goto L_0x004c
            if (r6 == r4) goto L_0x0048
            if (r6 == r3) goto L_0x0044
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            r6 = 0
            return r6
        L_0x0044:
            java.lang.String r6 = r5.zzn     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x0048:
            java.lang.String r6 = r5.zzm     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x004c:
            java.lang.String r6 = r5.zzl     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x0050:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.zzn(java.lang.String):java.lang.String");
    }

    public final String zzo() {
        String str;
        zzT();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    public final JSONObject zzp() {
        JSONObject jSONObject;
        zzT();
        synchronized (this.zza) {
            jSONObject = this.zzv;
        }
        return jSONObject;
    }

    public final void zzq(Runnable runnable) {
        this.zzc.add(runnable);
    }

    public final void zzr(Context context) {
        synchronized (this.zza) {
            if (this.zzf == null) {
                this.zzd = zzcbg.zza.zza(new zzi(this, context, "admob"));
                this.zzb = true;
            }
        }
    }

    public final void zzs() {
        zzT();
        synchronized (this.zza) {
            this.zzv = new JSONObject();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzU();
        }
    }

    public final void zzt(long j10) {
        zzT();
        synchronized (this.zza) {
            if (this.zzq != j10) {
                this.zzq = j10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j10);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }

    public final void zzu(String str) {
        zzT();
        synchronized (this.zza) {
            long currentTimeMillis = zzt.zzB().currentTimeMillis();
            if (str != null) {
                if (!str.equals(this.zzp.zzc())) {
                    this.zzp = new zzbzw(str, currentTimeMillis);
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.zzg.putLong("app_settings_last_update_ms", currentTimeMillis);
                        this.zzg.apply();
                    }
                    zzU();
                    for (Runnable run : this.zzc) {
                        run.run();
                    }
                    return;
                }
            }
            this.zzp.zzg(currentTimeMillis);
        }
    }

    public final void zzv(int i10) {
        zzT();
        synchronized (this.zza) {
            if (this.zzt != i10) {
                this.zzt = i10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("version_code", i10);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }

    public final void zzw(String str) {
        zzT();
        synchronized (this.zza) {
            if (!str.equals(this.zzi)) {
                this.zzi = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }

    public final void zzx(boolean z10) {
        zzT();
        synchronized (this.zza) {
            if (this.zzw != z10) {
                this.zzw = z10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z10);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }

    public final void zzy(String str) {
        zzT();
        synchronized (this.zza) {
            if (!str.equals(this.zzj)) {
                this.zzj = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }

    public final void zzz(boolean z10) {
        zzT();
        synchronized (this.zza) {
            if (this.zzx != z10) {
                this.zzx = z10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z10);
                    this.zzg.apply();
                }
                zzU();
            }
        }
    }
}
