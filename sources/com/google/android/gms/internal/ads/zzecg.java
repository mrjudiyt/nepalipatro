package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzecg implements zzfzp {
    final /* synthetic */ zzfgu zza;

    zzecg(zzech zzech, zzfgu zzfgu) {
        this.zza = zzfgu;
    }

    public final void zza(Throwable th) {
        zzcat.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            zzcat.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
