package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeco implements zzfgu {
    public final /* synthetic */ zzecp zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzeco(zzecp zzecp, long j10) {
        this.zza = zzecp;
        this.zzb = j10;
    }

    public final Object zza(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.zza.zzf()) {
            return null;
        }
        long j10 = this.zzb;
        zzbad zzg = zzbae.zzg();
        zzg.zzh(j10);
        byte[] zzax = ((zzbae) zzg.zzal()).zzax();
        zzecw.zzg(sQLiteDatabase, false, false);
        zzecw.zzd(sQLiteDatabase, j10, zzax);
        return null;
    }
}
