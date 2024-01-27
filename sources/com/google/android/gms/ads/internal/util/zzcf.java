package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbci;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcf {
    private final Map zza = new HashMap();
    /* access modifiers changed from: private */
    public final List zzb = new ArrayList();
    private final Context zzc;

    zzcf(Context context) {
        this.zzc = context;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzb(String str) {
        SharedPreferences sharedPreferences;
        if (!this.zza.containsKey(str)) {
            if (str != "__default__") {
                if (str == null || !str.equals("__default__")) {
                    sharedPreferences = this.zzc.getSharedPreferences(str, 0);
                    zzce zzce = new zzce(this, str);
                    this.zza.put(str, zzce);
                    sharedPreferences.registerOnSharedPreferenceChangeListener(zzce);
                }
            }
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
            zzce zzce2 = new zzce(this, str);
            this.zza.put(str, zzce2);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzce2);
        }
    }

    public final void zzc() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjC)).booleanValue()) {
            zzt.zzp();
            Map zzu = zzt.zzu((String) zzba.zzc().zzb(zzbci.zzjG));
            for (String zzb2 : zzu.keySet()) {
                zzb(zzb2);
            }
            zzd(new zzcd(zzu));
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd(zzcd zzcd) {
        this.zzb.add(zzcd);
    }
}
