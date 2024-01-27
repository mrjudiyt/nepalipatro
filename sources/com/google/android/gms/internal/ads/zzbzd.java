package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbzd {
    private final Map zza = new HashMap();
    /* access modifiers changed from: private */
    public final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbya zzd;

    zzbzd(Context context, zzbya zzbya) {
        this.zzc = context;
        this.zzd = zzbya;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zze();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzc(String str) {
        SharedPreferences sharedPreferences;
        if (!this.zza.containsKey(str)) {
            if (str != "__default__") {
                if (str == null || !str.equals("__default__")) {
                    sharedPreferences = this.zzc.getSharedPreferences(str, 0);
                    zzbzc zzbzc = new zzbzc(this, str);
                    this.zza.put(str, zzbzc);
                    sharedPreferences.registerOnSharedPreferenceChangeListener(zzbzc);
                }
            }
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
            zzbzc zzbzc2 = new zzbzc(this, str);
            this.zza.put(str, zzbzc2);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzbzc2);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd(zzbzb zzbzb) {
        this.zzb.add(zzbzb);
    }
}
