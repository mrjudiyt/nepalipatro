package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzedl implements Runnable {
    public final /* synthetic */ SQLiteDatabase zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzcay zzc;

    public /* synthetic */ zzedl(SQLiteDatabase sQLiteDatabase, String str, zzcay zzcay) {
        this.zza = sQLiteDatabase;
        this.zzb = str;
        this.zzc = zzcay;
    }

    public final void run() {
        zzedo.zzf(this.zza, this.zzb, this.zzc);
    }
}
