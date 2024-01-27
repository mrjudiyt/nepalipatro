package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzedj implements zzfgu {
    public final /* synthetic */ zzedo zza;
    public final /* synthetic */ zzcay zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzedj(zzedo zzedo, zzcay zzcay, String str) {
        this.zza = zzedo;
        this.zzb = zzcay;
        this.zzc = str;
    }

    public final Object zza(Object obj) {
        this.zza.zzg((SQLiteDatabase) obj, this.zzb, this.zzc);
        return null;
    }
}
