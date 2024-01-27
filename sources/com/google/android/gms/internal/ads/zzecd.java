package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzecd extends SQLiteOpenHelper {
    public zzecd(Context context) {
        super(context, "OfflineUpload.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_signal_contents (timestamp INTEGER PRIMARY_KEY, serialized_proto_data BLOB)");
        sQLiteDatabase.execSQL("CREATE TABLE offline_signal_statistics (statistic_name TEXT PRIMARY_KEY, value INTEGER)");
        zzecw.zze(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_contents");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_statistics");
    }
}
