package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzecr implements zzfgu {
    public final /* synthetic */ zzecs zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ ArrayList zzc;
    public final /* synthetic */ zzazz zzd;
    public final /* synthetic */ zzbai zze;

    public /* synthetic */ zzecr(zzecs zzecs, boolean z10, ArrayList arrayList, zzazz zzazz, zzbai zzbai) {
        this.zza = zzecs;
        this.zzb = z10;
        this.zzc = arrayList;
        this.zzd = zzazz;
        this.zze = zzbai;
    }

    public final Object zza(Object obj) {
        zzecs zzecs = this.zza;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzecs.zzb.zzf()) {
            return null;
        }
        zzbai zzbai = this.zze;
        zzazz zzazz = this.zzd;
        ArrayList arrayList = this.zzc;
        boolean z10 = this.zzb;
        byte[] zze2 = zzect.zze(zzecs.zzb, z10, arrayList, zzazz, zzbai);
        zzecw.zzg(sQLiteDatabase, z10, true);
        zzecw.zzd(sQLiteDatabase, zzecs.zzb.zzf.zzd(), zze2);
        return null;
    }
}
