package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzedm implements zzfgu {
    public final /* synthetic */ zzedo zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzedm(zzedo zzedo, String str) {
        this.zza = zzedo;
        this.zzb = str;
    }

    public final Object zza(Object obj) {
        zzedo.zzi((SQLiteDatabase) obj, this.zzb);
        return null;
    }
}
