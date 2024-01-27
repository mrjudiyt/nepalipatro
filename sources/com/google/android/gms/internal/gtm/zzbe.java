package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.HashMap;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzbe extends zzj<zzbe> {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private boolean zze;
    private boolean zzf;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.zza);
        hashMap.put("clientId", this.zzb);
        hashMap.put(Constants.USER_ID, this.zzc);
        hashMap.put("androidAdId", this.zzd);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.zze));
        hashMap.put("sessionControl", (Object) null);
        hashMap.put("nonInteraction", Boolean.valueOf(this.zzf));
        hashMap.put("sampleRate", Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        zzbe zzbe = (zzbe) zzj;
        if (!TextUtils.isEmpty(this.zza)) {
            zzbe.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzbe.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzbe.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzbe.zzd = this.zzd;
        }
        if (this.zze) {
            zzbe.zze = true;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (this.zzf) {
            zzbe.zzf = true;
        }
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzc;
    }

    public final void zzh(boolean z10) {
        this.zze = z10;
    }

    public final void zzi(String str) {
        this.zzd = str;
    }

    public final void zzj(String str) {
        this.zzb = str;
    }

    public final void zzk(String str) {
        this.zza = "data";
    }

    public final void zzl(boolean z10) {
        this.zzf = true;
    }

    public final void zzm(String str) {
        this.zzc = str;
    }

    public final boolean zzn() {
        return this.zze;
    }

    public final boolean zzo() {
        return this.zzf;
    }
}
