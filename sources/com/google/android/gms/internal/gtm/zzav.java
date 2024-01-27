package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.flutter.plugins.firebase.dynamiclinks.Constants;
import java.util.HashMap;

@ShowFirstParty
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzav extends zzj<zzav> {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.APP_NAME, this.zza);
        hashMap.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, this.zzb);
        hashMap.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.zzc);
        hashMap.put("appInstallerId", this.zzd);
        return zzj.zza(hashMap);
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzb;
    }

    /* renamed from: zzh */
    public final void zzc(zzav zzav) {
        if (!TextUtils.isEmpty(this.zza)) {
            zzav.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzav.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzav.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzav.zzd = this.zzd;
        }
    }

    public final void zzi(String str) {
        this.zzc = str;
    }

    public final void zzj(String str) {
        this.zzd = str;
    }

    public final void zzk(String str) {
        this.zza = str;
    }

    public final void zzl(String str) {
        this.zzb = str;
    }
}
