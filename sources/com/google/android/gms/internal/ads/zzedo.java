package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzedo extends SQLiteOpenHelper {
    private final Context zza;
    private final zzgad zzb;

    public zzedo(Context context, zzgad zzgad) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) zzba.zzc().zzb(zzbci.zzif)).intValue());
        this.zza = context;
        this.zzb = zzgad;
    }

    static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzcay zzcay) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzcay);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* access modifiers changed from: private */
    public static void zzj(SQLiteDatabase sQLiteDatabase, zzcay zzcay) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = " + 1, (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i10] = query.getString(columnIndex);
                }
                i10++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i11 = 0; i11 < count; i11++) {
                zzcay.zza(strArr[i11]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(zzedq zzedq, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.TIMESTAMP, Long.valueOf(zzedq.zza));
        contentValues.put("gws_query_id", zzedq.zzb);
        contentValues.put("url", zzedq.zzc);
        contentValues.put("event_state", Integer.valueOf(zzedq.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", (String) null, contentValues);
        zzt.zzp();
        zzbt zzy = com.google.android.gms.ads.internal.util.zzt.zzy(this.zza);
        if (zzy != null) {
            try {
                zzy.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e10) {
                zze.zzb("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }

    public final void zzc(String str) {
        zze(new zzedm(this, str));
    }

    public final void zzd(zzedq zzedq) {
        zze(new zzedi(this, zzedq));
    }

    /* access modifiers changed from: package-private */
    public final void zze(zzfgu zzfgu) {
        zzfzt.zzr(this.zzb.zzb(new zzedk(this)), new zzedn(this, zzfgu), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final void zzg(SQLiteDatabase sQLiteDatabase, zzcay zzcay, String str) {
        this.zzb.execute(new zzedl(sQLiteDatabase, str, zzcay));
    }

    public final void zzh(zzcay zzcay, String str) {
        zze(new zzedj(this, zzcay, str));
    }
}
