package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzedd {
    private final zzaxv zza;
    private final Context zzb;
    private final zzech zzc;
    private final zzcaz zzd;
    private final String zze;
    private final zzfib zzf;
    private final zzg zzg = zzt.zzo().zzh();

    public zzedd(Context context, zzcaz zzcaz, zzaxv zzaxv, zzech zzech, String str, zzfib zzfib) {
        this.zzb = context;
        this.zzd = zzcaz;
        this.zza = zzaxv;
        this.zzc = zzech;
        this.zze = str;
        this.zzf = zzfib;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zzbae zzbae = (zzbae) arrayList.get(i10);
            if (zzbae.zzw() == 2 && zzbae.zze() > j10) {
                j10 = zzbae.zze();
            }
        }
        if (j10 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j10));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(boolean z10, SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        if (z10) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i10 = 2;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
            zzfia zzb2 = zzfia.zzb("oa_upload");
            zzb2.zza("oa_failed_reqs", String.valueOf(zzecw.zza(sQLiteDatabase, 0)));
            zzb2.zza("oa_total_reqs", String.valueOf(zzecw.zza(sQLiteDatabase, 1)));
            zzb2.zza("oa_upload_time", String.valueOf(zzt.zzB().currentTimeMillis()));
            zzb2.zza("oa_last_successful_time", String.valueOf(zzecw.zzb(sQLiteDatabase, 2)));
            if (this.zzg.zzQ()) {
                str = "";
            } else {
                str = this.zze;
            }
            zzb2.zza("oa_session_id", str);
            this.zzf.zzb(zzb2);
            ArrayList zzc2 = zzecw.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc2);
            int size = zzc2.size();
            for (int i11 = 0; i11 < size; i11++) {
                zzbae zzbae = (zzbae) zzc2.get(i11);
                zzg zzg2 = this.zzg;
                zzfia zzb3 = zzfia.zzb("oa_signals");
                if (zzg2.zzQ()) {
                    str2 = "";
                } else {
                    str2 = this.zze;
                }
                zzb3.zza("oa_session_id", str2);
                zzazz zzf2 = zzbae.zzf();
                String valueOf = zzf2.zzf() ? String.valueOf(zzf2.zzh() - 1) : "-1";
                String obj = zzfwg.zzb(zzbae.zzk(), zzedc.zza).toString();
                zzb3.zza("oa_sig_ts", String.valueOf(zzbae.zze()));
                zzb3.zza("oa_sig_status", String.valueOf(zzbae.zzw() - 1));
                zzb3.zza("oa_sig_resp_lat", String.valueOf(zzbae.zzd()));
                zzb3.zza("oa_sig_render_lat", String.valueOf(zzbae.zzc()));
                zzb3.zza("oa_sig_formats", obj);
                zzb3.zza("oa_sig_nw_type", valueOf);
                zzb3.zza("oa_sig_wifi", String.valueOf(zzbae.zzx() - 1));
                zzb3.zza("oa_sig_airplane", String.valueOf(zzbae.zzt() - 1));
                zzb3.zza("oa_sig_data", String.valueOf(zzbae.zzu() - 1));
                zzb3.zza("oa_sig_nw_resp", String.valueOf(zzbae.zza()));
                zzb3.zza("oa_sig_offline", String.valueOf(zzbae.zzv() - 1));
                zzb3.zza("oa_sig_nw_state", String.valueOf(zzbae.zzj().zza()));
                if (zzf2.zze() && zzf2.zzf() && zzf2.zzh() == 2) {
                    zzb3.zza("oa_sig_cell_type", String.valueOf(zzf2.zzg() - 1));
                }
                this.zzf.zzb(zzb3);
            }
        } else {
            ArrayList zzc3 = zzecw.zzc(sQLiteDatabase);
            Context context = this.zzb;
            zzbaf zza2 = zzbaj.zza();
            zza2.zzb(context.getPackageName());
            zza2.zzd(Build.MODEL);
            zza2.zze(zzecw.zza(sQLiteDatabase, 0));
            zza2.zza(zzc3);
            zza2.zzg(zzecw.zza(sQLiteDatabase, 1));
            zza2.zzc(zzecw.zza(sQLiteDatabase, 3));
            zza2.zzh(zzt.zzB().currentTimeMillis());
            zza2.zzf(zzecw.zzb(sQLiteDatabase, 2));
            zzc(sQLiteDatabase, zzc3);
            this.zza.zzb(new zzeda((zzbaj) zza2.zzal()));
            zzcaz zzcaz = this.zzd;
            zzbau zza3 = zzbav.zza();
            zza3.zza(zzcaz.zzb);
            zza3.zzc(this.zzd.zzc);
            if (true == this.zzd.zzd) {
                i10 = 0;
            }
            zza3.zzb(i10);
            this.zza.zzb(new zzedb((zzbav) zza3.zzal()));
            this.zza.zzc(10004);
        }
        zzecw.zzf(sQLiteDatabase);
        return null;
    }

    public final void zzb(boolean z10) {
        try {
            this.zzc.zza(new zzecz(this, z10));
        } catch (Exception e10) {
            zzcat.zzg("Error in offline signals database startup: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
