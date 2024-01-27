package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzetm implements zzetv {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;

    zzetm(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12, String str2) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = str;
        this.zzd = z12;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
        this.zzh = str2;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzba.zzc().zzb(zzbci.zzdy));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfR)).booleanValue() && !TextUtils.isEmpty(this.zzh)) {
            bundle.putString("ev", this.zzh);
        }
        Bundle zza2 = zzfdz.zza(bundle, "sdk_env");
        zza2.putBoolean("mf", ((Boolean) zzbeb.zza.zze()).booleanValue());
        zza2.putBoolean("instant_app", this.zza);
        zza2.putBoolean("lite", this.zzb);
        zza2.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", zza2);
        Bundle zza3 = zzfdz.zza(zza2, "build_meta");
        zza3.putString("cl", "575948185");
        zza3.putString("rapid_rc", "dev");
        zza3.putString("rapid_rollup", "HEAD");
        zza2.putBundle("build_meta", zza3);
    }
}
