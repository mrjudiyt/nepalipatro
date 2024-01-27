package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbca {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    /* synthetic */ zzbca(int i10, String str, Object obj, zzbbz zzbbz) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        zzba.zza().zzd(this);
    }

    public static zzbca zzf(int i10, String str, float f10) {
        return new zzbbx(1, str, Float.valueOf(f10));
    }

    public static zzbca zzg(int i10, String str, int i11) {
        return new zzbbv(1, str, Integer.valueOf(i11));
    }

    public static zzbca zzh(int i10, String str, long j10) {
        return new zzbbw(1, str, Long.valueOf(j10));
    }

    public static zzbca zzi(int i10, String str, Boolean bool) {
        return new zzbbu(i10, str, bool);
    }

    public static zzbca zzj(int i10, String str, String str2) {
        return new zzbby(1, str, str2);
    }

    public static zzbca zzk(int i10, String str) {
        zzbca zzj = zzj(1, "gads:sdk_core_constants:experiment_id", (String) null);
        zzba.zza().zzc(zzj);
        return zzj;
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return zzba.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
