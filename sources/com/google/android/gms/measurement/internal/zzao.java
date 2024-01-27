package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class zzao extends zzmo {
    /* access modifiers changed from: private */
    public static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */
    public static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */
    public static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zzj = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] zzk = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final zzau zzl = new zzau(this, zza(), "google_app_measurement.db");
    /* access modifiers changed from: private */
    public final zzmi zzm = new zzmi(zzb());

    zzao(zzmp zzmp) {
        super(zzmp);
    }

    private final boolean zzan() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final long b_() {
        Cursor cursor = null;
        try {
            cursor = e_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1;
            }
            long j10 = cursor.getLong(0);
            cursor.close();
            return j10;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error querying raw events", e10);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long c_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long d_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzj().zzu().zza("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f_() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.e_()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0025, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0027
        L_0x0020:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003b
        L_0x0025:
            r2 = move-exception
            r0 = r1
        L_0x0027:
            com.google.android.gms.measurement.internal.zzfr r3 = r6.zzj()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zza(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()
        L_0x0040:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.f_():java.lang.String");
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        try {
            return e_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error deleting conditional property", zzfr.zza(str), zzi().zzc(str2), e10);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final long zzb(String str, String str2) {
        long zza2;
        String str3 = str;
        String str4 = str2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        long j10 = 0;
        try {
            try {
                zza2 = zza("select " + str4 + " from app2 where app_id=?", new String[]{str3}, -1);
                if (zza2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (e_.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        zzj().zzg().zza("Failed to insert column (got -1). appId", zzfr.zza(str), str4);
                        e_.endTransaction();
                        return -1;
                    }
                    zza2 = 0;
                }
            } catch (SQLiteException e10) {
                e = e10;
                try {
                    zzj().zzg().zza("Error inserting column. appId", zzfr.zza(str), str4, e);
                    e_.endTransaction();
                    return j10;
                } catch (Throwable th) {
                    th = th;
                    e_.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put(str4, Long.valueOf(1 + zza2));
                if (((long) e_.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    zzj().zzg().zza("Failed to update column (got 0). appId", zzfr.zza(str), str4);
                    e_.endTransaction();
                    return -1;
                }
                e_.setTransactionSuccessful();
                e_.endTransaction();
                return zza2;
            } catch (SQLiteException e11) {
                e = e11;
                j10 = zza2;
                zzj().zzg().zza("Error inserting column. appId", zzfr.zza(str), str4, e);
                e_.endTransaction();
                return j10;
            }
        } catch (SQLiteException e12) {
            e = e12;
            zzj().zzg().zza("Error inserting column. appId", zzfr.zza(str), str4, e);
            e_.endTransaction();
            return j10;
        } catch (Throwable th2) {
            th = th2;
            e_.endTransaction();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle zzc(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzt()
            r7.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.e_()     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r2 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.zzfr r8 = r7.zzj()     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzp()     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r2 = "Default event parameters not found"
            r8.zza(r2)     // Catch:{ SQLiteException -> 0x00b6 }
            r1.close()
            return r0
        L_0x002e:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r3 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzkm r2 = com.google.android.gms.measurement.internal.zzmz.zza(r3, (byte[]) r2)     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzkj r2 = r2.zzab()     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch:{ IOException -> 0x00a0 }
            r7.g_()     // Catch:{ SQLiteException -> 0x00b6 }
            java.util.List r8 = r2.zzh()     // Catch:{ SQLiteException -> 0x00b6 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00b6 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00b6 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00b6 }
        L_0x0054:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r3 == 0) goto L_0x009c
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r3 = (com.google.android.gms.internal.measurement.zzfi.zzg) r3     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r4 = r3.zzg()     // Catch:{ SQLiteException -> 0x00b6 }
            boolean r5 = r3.zzj()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x0072
            double r5 = r3.zza()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x0072:
            boolean r5 = r3.zzk()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x0080
            float r3 = r3.zzb()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x0080:
            boolean r5 = r3.zzn()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x008e
            java.lang.String r3 = r3.zzh()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x008e:
            boolean r5 = r3.zzl()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x0054
            long r5 = r3.zzd()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x009c:
            r1.close()
            return r2
        L_0x00a0:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfr r3 = r7.zzj()     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x00b6 }
            r3.zza(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00b6 }
            r1.close()
            return r0
        L_0x00b6:
            r8 = move-exception
            goto L_0x00bc
        L_0x00b8:
            r8 = move-exception
            goto L_0x00d1
        L_0x00ba:
            r8 = move-exception
            r1 = r0
        L_0x00bc:
            com.google.android.gms.measurement.internal.zzfr r2 = r7.zzj()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zza(r3, r8)     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00ce
            r1.close()
        L_0x00ce:
            return r0
        L_0x00cf:
            r8 = move-exception
            r0 = r1
        L_0x00d1:
            if (r0 == 0) goto L_0x00d6
            r0.close()
        L_0x00d6:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzc(java.lang.String):android.os.Bundle");
    }

    /* access modifiers changed from: protected */
    public final boolean zzc() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0127 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x012b A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x015f A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x017d A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0180 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018f A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e8 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ea A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0244 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0246 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0264 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0266 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x027e A[Catch:{ SQLiteException -> 0x0293 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzh zzd(java.lang.String r42) {
        /*
            r41 = this;
            r1 = r42
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r42)
            r41.zzt()
            r41.zzak()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r41.e_()     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String r33 = "session_stitching_token"
            java.lang.String r34 = "sgtm_upload_enabled"
            java.lang.String r35 = "target_os_version"
            java.lang.String r36 = "session_stitching_token_hash"
            java.lang.String r37 = "ad_services_version"
            java.lang.String r38 = "unmatched_first_open_without_ad_id"
            java.lang.String r39 = "npa_metadata_value"
            java.lang.String r40 = "attribution_eligibility_status"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40}     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0299, all -> 0x0295 }
            if (r4 != 0) goto L_0x0077
            r3.close()
            return r2
        L_0x0077:
            com.google.android.gms.measurement.internal.zzh r4 = new com.google.android.gms.measurement.internal.zzh     // Catch:{ SQLiteException -> 0x0299, all -> 0x0295 }
            r5 = r41
            com.google.android.gms.measurement.internal.zzmp r6 = r5.zzf     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.zzhf r6 = r6.zzk()     // Catch:{ SQLiteException -> 0x0293 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzb((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzf((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzh((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzo(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzp(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzn(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzd((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzc((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzm(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzj(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x00e5
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r6 = 0
            goto L_0x00e6
        L_0x00e5:
            r6 = 1
        L_0x00e6:
            r4.zzb((boolean) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzi((long) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzg((long) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzf((long) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzd((long) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzc((long) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzl(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 == 0) goto L_0x012b
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0130
        L_0x012b:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0130:
            r4.zza((long) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zze((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zze((long) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzh((long) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzg((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 23
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x0168
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            r6 = 0
            goto L_0x0169
        L_0x0168:
            r6 = 1
        L_0x0169:
            r4.zza((boolean) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 24
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zza((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 25
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 == 0) goto L_0x0180
            r6 = 0
            goto L_0x0184
        L_0x0180:
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0184:
            r4.zzk(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 26
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x01a1
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r7 = ","
            r8 = -1
            java.lang.String[] r6 = r6.split(r7, r8)     // Catch:{ SQLiteException -> 0x0293 }
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zza((java.util.List<java.lang.String>) r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x01a1:
            boolean r6 = com.google.android.gms.internal.measurement.zzps.zza()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01c8
            com.google.android.gms.measurement.internal.zzaf r6 = r41.zze()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzbi.zzbt     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.zze(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 != 0) goto L_0x01bf
            com.google.android.gms.measurement.internal.zzaf r6 = r41.zze()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzbi.zzbr     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01c8
        L_0x01bf:
            r6 = 28
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzi((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x01c8:
            boolean r6 = com.google.android.gms.internal.measurement.zzqd.zza()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01ee
            com.google.android.gms.measurement.internal.zzaf r6 = r41.zze()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzbi.zzbu     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01ee
            r6 = 29
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x01ea
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01ea
            r6 = 1
            goto L_0x01eb
        L_0x01ea:
            r6 = 0
        L_0x01eb:
            r4.zzc((boolean) r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x01ee:
            r6 = 30
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzr(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 31
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzq(r6)     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0224
            com.google.android.gms.measurement.internal.zzaf r6 = r41.zze()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzbi.zzcf     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.zze(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0224
            r6 = 32
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zza((int) r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 35
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.zzb((long) r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0224:
            boolean r6 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x024a
            com.google.android.gms.measurement.internal.zzaf r6 = r41.zze()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.zze(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x024a
            r6 = 33
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x0246
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0246
            r6 = 1
            goto L_0x0247
        L_0x0246:
            r6 = 0
        L_0x0247:
            r4.zzd((boolean) r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x024a:
            boolean r6 = com.google.android.gms.internal.measurement.zznp.zza()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0275
            com.google.android.gms.measurement.internal.zzaf r6 = r41.zze()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzbi.zzcm     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.zze(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0275
            r6 = 34
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 == 0) goto L_0x0266
            r0 = r2
            goto L_0x0272
        L_0x0266:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x026d
            goto L_0x026e
        L_0x026d:
            r0 = 0
        L_0x026e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0272:
            r4.zza((java.lang.Boolean) r0)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0275:
            r4.zzah()     // Catch:{ SQLiteException -> 0x0293 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0293 }
            if (r0 == 0) goto L_0x028f
            com.google.android.gms.measurement.internal.zzfr r0 = r41.zzj()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r42)     // Catch:{ SQLiteException -> 0x0293 }
            r0.zza(r6, r7)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x028f:
            r3.close()
            return r4
        L_0x0293:
            r0 = move-exception
            goto L_0x02a5
        L_0x0295:
            r0 = move-exception
            r5 = r41
            goto L_0x02bd
        L_0x0299:
            r0 = move-exception
            r5 = r41
            goto L_0x02a5
        L_0x029d:
            r0 = move-exception
            r5 = r41
            goto L_0x02be
        L_0x02a1:
            r0 = move-exception
            r5 = r41
            r3 = r2
        L_0x02a5:
            com.google.android.gms.measurement.internal.zzfr r4 = r41.zzj()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzg()     // Catch:{ all -> 0x02bc }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r42)     // Catch:{ all -> 0x02bc }
            r4.zza(r6, r1, r0)     // Catch:{ all -> 0x02bc }
            if (r3 == 0) goto L_0x02bb
            r3.close()
        L_0x02bb:
            return r2
        L_0x02bc:
            r0 = move-exception
        L_0x02bd:
            r2 = r3
        L_0x02be:
            if (r2 == 0) goto L_0x02c3
            r2.close()
        L_0x02c3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzd(java.lang.String):com.google.android.gms.measurement.internal.zzh");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzaq zze(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            r11.zzt()
            r11.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.e_()     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            java.lang.String r4 = "app_id=?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            r10 = 0
            r5[r10] = r12     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0066 }
            if (r2 != 0) goto L_0x0033
            r1.close()
            return r0
        L_0x0033:
            byte[] r2 = r1.getBlob(r10)     // Catch:{ SQLiteException -> 0x0066 }
            java.lang.String r3 = r1.getString(r9)     // Catch:{ SQLiteException -> 0x0066 }
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch:{ SQLiteException -> 0x0066 }
            boolean r5 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0066 }
            if (r5 == 0) goto L_0x0057
            com.google.android.gms.measurement.internal.zzfr r5 = r11.zzj()     // Catch:{ SQLiteException -> 0x0066 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzg()     // Catch:{ SQLiteException -> 0x0066 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x0066 }
            r5.zza(r6, r7)     // Catch:{ SQLiteException -> 0x0066 }
        L_0x0057:
            if (r2 != 0) goto L_0x005d
            r1.close()
            return r0
        L_0x005d:
            com.google.android.gms.measurement.internal.zzaq r5 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ SQLiteException -> 0x0066 }
            r5.<init>(r2, r3, r4)     // Catch:{ SQLiteException -> 0x0066 }
            r1.close()
            return r5
        L_0x0066:
            r2 = move-exception
            goto L_0x006c
        L_0x0068:
            r12 = move-exception
            goto L_0x0085
        L_0x006a:
            r2 = move-exception
            r1 = r0
        L_0x006c:
            com.google.android.gms.measurement.internal.zzfr r3 = r11.zzj()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r12)     // Catch:{ all -> 0x0083 }
            r3.zza(r4, r12, r2)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0082
            r1.close()
        L_0x0082:
            return r0
        L_0x0083:
            r12 = move-exception
            r0 = r1
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r0.close()
        L_0x008a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zze(java.lang.String):com.google.android.gms.measurement.internal.zzaq");
    }

    public final zzay zzf(String str) {
        if (!zznp.zza() || !zze().zza(zzbi.zzcm)) {
            return zzay.zza;
        }
        Preconditions.checkNotNull(str);
        zzt();
        zzak();
        return zzay.zza(zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzih zzg(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzak();
        if (!zznp.zza() || !zze().zza(zzbi.zzcm)) {
            return zzih.zza(zza("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
        }
        zzih zzih = (zzih) zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, zzan.zza);
        return zzih == null ? zzih.zza : zzih;
    }

    public final List<zzmh> zzh(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = e_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", (String) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            do {
                String string = cursor.getString(0);
                if (string == null) {
                    string = "";
                }
                arrayList.add(new zzmh(string, cursor.getLong(1), cursor.getInt(2)));
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error querying trigger uris. appId", zzfr.zza(str), e10);
            List<zzmh> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<zzne> zzi(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = e_().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            do {
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                String str2 = string2;
                long j10 = cursor.getLong(2);
                Object zza2 = zza(cursor, 3);
                if (zza2 == null) {
                    zzj().zzg().zza("Read invalid user property value, ignoring it. appId", zzfr.zza(str));
                } else {
                    arrayList.add(new zzne(str, str2, string, j10, zza2));
                }
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error querying user properties. appId", zzfr.zza(str), e10);
            List<zzne> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, zzfi.zzl> zzj(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            cursor = e_().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, zzfi.zzl> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            a aVar = new a();
            do {
                int i10 = cursor.getInt(0);
                try {
                    aVar.put(Integer.valueOf(i10), (zzfi.zzl) ((zzix) ((zzfi.zzl.zza) zzmz.zza(zzfi.zzl.zze(), cursor.getBlob(1))).zzab()));
                } catch (IOException e10) {
                    zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzfr.zza(str), Integer.valueOf(i10), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            zzj().zzg().zza("Database error querying filter results. appId", zzfr.zza(str), e11);
            Map<Integer, zzfi.zzl> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<zzew.zzb>> zzk(String str) {
        Preconditions.checkNotEmpty(str);
        a aVar = new a();
        Cursor cursor = null;
        try {
            cursor = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<zzew.zzb>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    zzew.zzb zzb2 = (zzew.zzb) ((zzix) ((zzew.zzb.zza) zzmz.zza(zzew.zzb.zzc(), cursor.getBlob(1))).zzab());
                    if (zzb2.zzk()) {
                        int i10 = cursor.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i10));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i10), list);
                        }
                        list.add(zzb2);
                    }
                } catch (IOException e10) {
                    zzj().zzg().zza("Failed to merge filter. appId", zzfr.zza(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(str), e11);
            Map<Integer, List<zzew.zzb>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<Integer>> zzl(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        a aVar = new a();
        Cursor cursor = null;
        try {
            cursor = e_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
            if (!cursor.moveToFirst()) {
                Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                int i10 = cursor.getInt(0);
                List list = (List) aVar.get(Integer.valueOf(i10));
                if (list == null) {
                    list = new ArrayList();
                    aVar.put(Integer.valueOf(i10), list);
                }
                list.add(Integer.valueOf(cursor.getInt(1)));
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Database error querying scoped filters. appId", zzfr.zza(str), e10);
            Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzp() {
        zzak();
        e_().beginTransaction();
    }

    public final void zzu() {
        zzak();
        e_().endTransaction();
    }

    /* access modifiers changed from: package-private */
    public final void zzv() {
        int delete;
        zzt();
        zzak();
        if (zzan()) {
            long zza2 = zzn().zza.zza();
            long elapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > zzbi.zzy.zza(null).longValue()) {
                zzn().zza.zza(elapsedRealtime);
                zzt();
                zzak();
                if (zzan() && (delete = e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzaf.zzm())})) > 0) {
                    zzj().zzp().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    public final void zzw() {
        zzak();
        e_().setTransactionSuccessful();
    }

    public final boolean zzx() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<zzew.zzb>> zzf(String str, String str2) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        a aVar = new a();
        Cursor cursor = null;
        try {
            cursor = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<zzew.zzb>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    zzew.zzb zzb2 = (zzew.zzb) ((zzix) ((zzew.zzb.zza) zzmz.zza(zzew.zzb.zzc(), cursor.getBlob(1))).zzab());
                    int i10 = cursor.getInt(0);
                    List list = (List) aVar.get(Integer.valueOf(i10));
                    if (list == null) {
                        list = new ArrayList();
                        aVar.put(Integer.valueOf(i10), list);
                    }
                    list.add(zzb2);
                } catch (IOException e10) {
                    zzj().zzg().zza("Failed to merge filter. appId", zzfr.zza(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(str), e11);
            Map<Integer, List<zzew.zzb>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<zzew.zze>> zzg(String str, String str2) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        a aVar = new a();
        Cursor cursor = null;
        try {
            cursor = e_().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<zzew.zze>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    zzew.zze zze2 = (zzew.zze) ((zzix) ((zzew.zze.zza) zzmz.zza(zzew.zze.zzc(), cursor.getBlob(1))).zzab());
                    int i10 = cursor.getInt(0);
                    List list = (List) aVar.get(Integer.valueOf(i10));
                    if (list == null) {
                        list = new ArrayList();
                        aVar.put(Integer.valueOf(i10), list);
                    }
                    list.add(zze2);
                } catch (IOException e10) {
                    zzj().zzg().zza("Failed to merge filter", zzfr.zza(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(str), e11);
            Map<Integer, List<zzew.zze>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        try {
            return (long) e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zze().zzb(str, zzbi.zzp))))});
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error deleting over the limit events. appId", zzfr.zza(str), e10);
            return 0;
        }
    }

    public final void zzh(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        try {
            e_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error deleting user property. appId", zzfr.zza(str), zzi().zzc(str2), e10);
        }
    }

    public final long zza(zzfi.zzj zzj2) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzj2);
        Preconditions.checkNotEmpty(zzj2.zzx());
        byte[] zzbv = zzj2.zzbv();
        long zza2 = g_().zza(zzbv);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzj2.zzx());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza2));
        contentValues.put("metadata", zzbv);
        try {
            e_().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return zza2;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzfr.zza(zzj2.zzx()), e10);
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzne zze(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r19)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            r18.zzt()
            r18.zzak()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.e_()     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            if (r3 != 0) goto L_0x003d
            r10.close()
            return r9
        L_0x003d:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            r11 = r18
            java.lang.Object r7 = r11.zza((android.database.Cursor) r10, (int) r2)     // Catch:{ SQLiteException -> 0x0076 }
            if (r7 != 0) goto L_0x004d
            r10.close()
            return r9
        L_0x004d:
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.zzne r0 = new com.google.android.gms.measurement.internal.zzne     // Catch:{ SQLiteException -> 0x0076 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0076 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0072
            com.google.android.gms.measurement.internal.zzfr r1 = r18.zzj()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r19)     // Catch:{ SQLiteException -> 0x0076 }
            r1.zza(r2, r3)     // Catch:{ SQLiteException -> 0x0076 }
        L_0x0072:
            r10.close()
            return r0
        L_0x0076:
            r0 = move-exception
            goto L_0x0088
        L_0x0078:
            r0 = move-exception
            r11 = r18
            goto L_0x00a8
        L_0x007c:
            r0 = move-exception
            r11 = r18
            goto L_0x0088
        L_0x0080:
            r0 = move-exception
            r11 = r18
            goto L_0x00a9
        L_0x0084:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0088:
            com.google.android.gms.measurement.internal.zzfr r1 = r18.zzj()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r19)     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.zzfq r4 = r18.zzi()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.zzc(r8)     // Catch:{ all -> 0x00a7 }
            r1.zza(r2, r3, r4, r0)     // Catch:{ all -> 0x00a7 }
            if (r10 == 0) goto L_0x00a6
            r10.close()
        L_0x00a6:
            return r9
        L_0x00a7:
            r0 = move-exception
        L_0x00a8:
            r9 = r10
        L_0x00a9:
            if (r9 == 0) goto L_0x00ae
            r9.close()
        L_0x00ae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zze(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzne");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzad zzc(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r30)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r31)
            r29.zzt()
            r29.zzak()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.e_()     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            if (r3 != 0) goto L_0x004c
            r9.close()
            return r8
        L_0x004c:
            java.lang.String r3 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = ""
        L_0x0054:
            r10 = r29
            r16 = r3
            java.lang.Object r5 = r10.zza((android.database.Cursor) r9, (int) r2)     // Catch:{ SQLiteException -> 0x00ee }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00ee }
            if (r0 == 0) goto L_0x0065
            r20 = 1
            goto L_0x0067
        L_0x0065:
            r20 = 0
        L_0x0067:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.zzmz r0 = r29.g_()     // Catch:{ SQLiteException -> 0x00ee }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbg> r2 = com.google.android.gms.measurement.internal.zzbg.CREATOR     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.zza((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00ee }
            r22 = r0
            com.google.android.gms.measurement.internal.zzbg r22 = (com.google.android.gms.measurement.internal.zzbg) r22     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.zzmz r0 = r29.g_()     // Catch:{ SQLiteException -> 0x00ee }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.zza((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00ee }
            r25 = r0
            com.google.android.gms.measurement.internal.zzbg r25 = (com.google.android.gms.measurement.internal.zzbg) r25     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.zzmz r0 = r29.g_()     // Catch:{ SQLiteException -> 0x00ee }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.zza((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00ee }
            r28 = r0
            com.google.android.gms.measurement.internal.zzbg r28 = (com.google.android.gms.measurement.internal.zzbg) r28     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.zznc r17 = new com.google.android.gms.measurement.internal.zznc     // Catch:{ SQLiteException -> 0x00ee }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.zzad r0 = new com.google.android.gms.measurement.internal.zzad     // Catch:{ SQLiteException -> 0x00ee }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00ee }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00ee }
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.zzfr r1 = r29.zzj()     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r30)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.zzfq r4 = r29.zzi()     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r4 = r4.zzc(r7)     // Catch:{ SQLiteException -> 0x00ee }
            r1.zza(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00ee }
        L_0x00ea:
            r9.close()
            return r0
        L_0x00ee:
            r0 = move-exception
            goto L_0x0100
        L_0x00f0:
            r0 = move-exception
            r10 = r29
            goto L_0x0120
        L_0x00f4:
            r0 = move-exception
            r10 = r29
            goto L_0x0100
        L_0x00f8:
            r0 = move-exception
            r10 = r29
            goto L_0x0121
        L_0x00fc:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x0100:
            com.google.android.gms.measurement.internal.zzfr r1 = r29.zzj()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ all -> 0x011f }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r30)     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.zzfq r4 = r29.zzi()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = r4.zzc(r7)     // Catch:{ all -> 0x011f }
            r1.zza(r2, r3, r4, r0)     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x011e
            r9.close()
        L_0x011e:
            return r8
        L_0x011f:
            r0 = move-exception
        L_0x0120:
            r8 = r9
        L_0x0121:
            if (r8 == 0) goto L_0x0126
            r8.close()
        L_0x0126:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzad");
    }

    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = e_().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zza(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = e_().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            }
            rawQuery.close();
            return j10;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f2, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fa, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fe, code lost:
        r13 = r22;
        r12 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0122, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9 A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v3 android.database.Cursor) = (r2v0 android.database.Cursor), (r2v0 android.database.Cursor), (r2v0 android.database.Cursor), (r2v5 android.database.Cursor), (r2v0 android.database.Cursor) binds: [B:1:0x0011, B:2:?, B:4:0x0019, B:18:0x008f, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.zzne> zzb(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            r22 = this;
            r0 = r25
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23)
            r22.zzt()
            r22.zzak()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00f9 }
            r4 = 3
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00f9 }
            r12 = r23
            r3.add(r12)     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            java.lang.String r6 = "app_id=?"
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            if (r6 != 0) goto L_0x0034
            r6 = r24
            r3.add(r6)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r7 = " and origin=?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            goto L_0x0036
        L_0x0034:
            r6 = r24
        L_0x0036:
            boolean r7 = android.text.TextUtils.isEmpty(r25)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            if (r7 != 0) goto L_0x0055
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r7.append(r0)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r8 = "*"
            r7.append(r8)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r3.add(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r7 = " and name glob ?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
        L_0x0055:
            int r7 = r3.size()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.Object[] r3 = r3.toArray(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r17 = r3
            java.lang.String[] r17 = (java.lang.String[]) r17     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            android.database.sqlite.SQLiteDatabase r13 = r22.e_()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r14 = "user_attributes"
            java.lang.String r3 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r15 = new java.lang.String[]{r3, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r16 = r5.toString()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "1001"
            android.database.Cursor r2 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            if (r3 != 0) goto L_0x008f
            r2.close()
            return r1
        L_0x008f:
            int r3 = r1.size()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r5) goto L_0x00ab
            com.google.android.gms.measurement.internal.zzfr r0 = r22.zzj()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r0.zza(r3, r4)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r13 = r22
            goto L_0x00e6
        L_0x00ab:
            r3 = 0
            java.lang.String r8 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r3 = 1
            long r9 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r3 = 2
            r13 = r22
            java.lang.Object r11 = r13.zza((android.database.Cursor) r2, (int) r3)     // Catch:{ SQLiteException -> 0x00ef }
            java.lang.String r3 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00ef }
            if (r11 != 0) goto L_0x00d4
            com.google.android.gms.measurement.internal.zzfr r5 = r22.zzj()     // Catch:{ SQLiteException -> 0x00ec }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzg()     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r6 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r23)     // Catch:{ SQLiteException -> 0x00ec }
            r5.zza(r6, r7, r3, r0)     // Catch:{ SQLiteException -> 0x00ec }
            goto L_0x00e0
        L_0x00d4:
            com.google.android.gms.measurement.internal.zzne r14 = new com.google.android.gms.measurement.internal.zzne     // Catch:{ SQLiteException -> 0x00ec }
            r5 = r14
            r6 = r23
            r7 = r3
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ SQLiteException -> 0x00ec }
            r1.add(r14)     // Catch:{ SQLiteException -> 0x00ec }
        L_0x00e0:
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00ec }
            if (r5 != 0) goto L_0x00ea
        L_0x00e6:
            r2.close()
            return r1
        L_0x00ea:
            r6 = r3
            goto L_0x008f
        L_0x00ec:
            r0 = move-exception
            r6 = r3
            goto L_0x0104
        L_0x00ef:
            r0 = move-exception
            goto L_0x0104
        L_0x00f1:
            r0 = move-exception
            r13 = r22
            goto L_0x0104
        L_0x00f5:
            r0 = move-exception
            r13 = r22
            goto L_0x0102
        L_0x00f9:
            r0 = move-exception
            r13 = r22
            goto L_0x0120
        L_0x00fd:
            r0 = move-exception
            r13 = r22
            r12 = r23
        L_0x0102:
            r6 = r24
        L_0x0104:
            com.google.android.gms.measurement.internal.zzfr r1 = r22.zzj()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r23)     // Catch:{ all -> 0x011f }
            r1.zza(r3, r4, r6, r0)     // Catch:{ all -> 0x011f }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x011e
            r2.close()
        L_0x011e:
            return r0
        L_0x011f:
            r0 = move-exception
        L_0x0120:
            if (r2 == 0) goto L_0x0125
            r2.close()
        L_0x0125:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzfi.zze, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.zzt()
            r7.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.e_()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0071 }
            if (r2 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.zzfr r8 = r7.zzj()     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzp()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r9 = "Main event not found"
            r8.zza(r9)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r0
        L_0x0035:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0071 }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r4 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.zzkm r2 = com.google.android.gms.measurement.internal.zzmz.zza(r4, (byte[]) r2)     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.zzkj r2 = r2.zzab()     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch:{ IOException -> 0x005b }
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r8
        L_0x005b:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfr r3 = r7.zzj()     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x0071 }
            r3.zza(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r0
        L_0x0071:
            r8 = move-exception
            goto L_0x0077
        L_0x0073:
            r8 = move-exception
            goto L_0x008c
        L_0x0075:
            r8 = move-exception
            r1 = r0
        L_0x0077:
            com.google.android.gms.measurement.internal.zzfr r9 = r7.zzj()     // Catch:{ all -> 0x008a }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzg()     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "Error selecting main event"
            r9.zza(r2, r8)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0089
            r1.close()
        L_0x0089:
            return r0
        L_0x008a:
            r8 = move-exception
            r0 = r1
        L_0x008c:
            if (r0 == 0) goto L_0x0091
            r0.close()
        L_0x0091:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzbc zzd(java.lang.String r26, java.lang.String r27) {
        /*
            r25 = this;
            r15 = r27
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r26)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r27)
            r25.zzt()
            r25.zzak()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "lifetime_count"
            java.lang.String r2 = "current_bundle_count"
            java.lang.String r3 = "last_fire_timestamp"
            java.lang.String r4 = "last_bundled_timestamp"
            java.lang.String r5 = "last_bundled_day"
            java.lang.String r6 = "last_sampled_complex_event_id"
            java.lang.String r7 = "last_sampling_rate"
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "current_session_count"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r18 = 0
            android.database.sqlite.SQLiteDatabase r1 = r25.e_()     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            java.lang.String r2 = "events"
            r9 = 0
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            java.lang.String r4 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r5[r9] = r26     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r10 = 1
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r1 != 0) goto L_0x005a
            r14.close()
            return r18
        L_0x005a:
            long r4 = r14.getLong(r9)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            long r6 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            long r11 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r0 = 3
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r2 = 0
            if (r1 == 0) goto L_0x0072
            r16 = r2
            goto L_0x0078
        L_0x0072:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r16 = r0
        L_0x0078:
            r0 = 4
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r1 == 0) goto L_0x0082
            r0 = r18
            goto L_0x008a
        L_0x0082:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
        L_0x008a:
            r1 = 5
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 == 0) goto L_0x0094
            r19 = r18
            goto L_0x009e
        L_0x0094:
            long r19 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            java.lang.Long r1 = java.lang.Long.valueOf(r19)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r19 = r1
        L_0x009e:
            r1 = 6
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 == 0) goto L_0x00a8
            r20 = r18
            goto L_0x00b2
        L_0x00a8:
            long r20 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r20 = r1
        L_0x00b2:
            r1 = 7
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 != 0) goto L_0x00cd
            long r21 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00cb }
            r23 = 1
            int r1 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x00c4
            r9 = 1
        L_0x00c4:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x00cb }
            r21 = r1
            goto L_0x00cf
        L_0x00cb:
            r0 = move-exception
            goto L_0x0125
        L_0x00cd:
            r21 = r18
        L_0x00cf:
            r1 = 8
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 == 0) goto L_0x00d9
            r8 = r2
            goto L_0x00de
        L_0x00d9:
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r8 = r1
        L_0x00de:
            com.google.android.gms.measurement.internal.zzbc r22 = new com.google.android.gms.measurement.internal.zzbc     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r1 = r22
            r2 = r26
            r3 = r27
            r10 = r11
            r12 = r16
            r23 = r14
            r14 = r0
            r15 = r19
            r16 = r20
            r17 = r21
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            boolean r0 = r23.moveToNext()     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            if (r0 == 0) goto L_0x010c
            com.google.android.gms.measurement.internal.zzfr r0 = r25.zzj()     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r26)     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            r0.zza(r1, r2)     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
        L_0x010c:
            r23.close()
            return r22
        L_0x0110:
            r0 = move-exception
            goto L_0x0119
        L_0x0112:
            r0 = move-exception
            r14 = r23
            goto L_0x0125
        L_0x0116:
            r0 = move-exception
            r23 = r14
        L_0x0119:
            r18 = r23
            goto L_0x0149
        L_0x011c:
            r0 = move-exception
            r23 = r14
            goto L_0x0125
        L_0x0120:
            r0 = move-exception
            goto L_0x0149
        L_0x0122:
            r0 = move-exception
            r14 = r18
        L_0x0125:
            com.google.android.gms.measurement.internal.zzfr r1 = r25.zzj()     // Catch:{ all -> 0x0146 }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r26)     // Catch:{ all -> 0x0146 }
            com.google.android.gms.measurement.internal.zzfq r4 = r25.zzi()     // Catch:{ all -> 0x0146 }
            r5 = r27
            java.lang.String r4 = r4.zza((java.lang.String) r5)     // Catch:{ all -> 0x0146 }
            r1.zza(r2, r3, r4, r0)     // Catch:{ all -> 0x0146 }
            if (r14 == 0) goto L_0x0145
            r14.close()
        L_0x0145:
            return r18
        L_0x0146:
            r0 = move-exception
            r18 = r14
        L_0x0149:
            if (r18 == 0) goto L_0x014e
            r18.close()
        L_0x014e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzd(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzbc");
    }

    public final zzap zza(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return zza(j10, str, 1, false, false, z12, false, z14);
    }

    public final zzap zza(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        String[] strArr = {str};
        zzap zzap = new zzap();
        Cursor cursor = null;
        try {
            SQLiteDatabase e_ = e_();
            cursor = e_.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                zzj().zzu().zza("Not updating daily counts, app is not known. appId", zzfr.zza(str));
                cursor.close();
                return zzap;
            }
            if (cursor.getLong(0) == j10) {
                zzap.zzb = cursor.getLong(1);
                zzap.zza = cursor.getLong(2);
                zzap.zzc = cursor.getLong(3);
                zzap.zzd = cursor.getLong(4);
                zzap.zze = cursor.getLong(5);
            }
            if (z10) {
                zzap.zzb += j11;
            }
            if (z11) {
                zzap.zza += j11;
            }
            if (z12) {
                zzap.zzc += j11;
            }
            if (z13) {
                zzap.zzd += j11;
            }
            if (z14) {
                zzap.zze += j11;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j10));
            contentValues.put("daily_public_events_count", Long.valueOf(zzap.zza));
            contentValues.put("daily_events_count", Long.valueOf(zzap.zzb));
            contentValues.put("daily_conversions_count", Long.valueOf(zzap.zzc));
            contentValues.put("daily_error_events_count", Long.valueOf(zzap.zzd));
            contentValues.put("daily_realtime_events_count", Long.valueOf(zzap.zze));
            e_.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return zzap;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error updating daily counts. appId", zzfr.zza(str), e10);
            if (cursor != null) {
                cursor.close();
            }
            return zzap;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzak();
        zzt();
        SQLiteDatabase e_ = e_();
        try {
            long zzb2 = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, zze().zzb(str, zzbi.zzaf)));
            if (zzb2 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                Integer num = list.get(i10);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append("(" + TextUtils.join(",", arrayList) + ")");
            sb.append(" order by rowid desc limit -1 offset ?)");
            return e_.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(str), e10);
            return false;
        }
    }

    private final Object zza(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i10));
            }
            if (type == 3) {
                return cursor.getString(i10);
            }
            if (type != 4) {
                zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T zza(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.zzar<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.e_()     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0028 }
            if (r4 != 0) goto L_0x0020
            com.google.android.gms.measurement.internal.zzfr r4 = r2.zzj()     // Catch:{ SQLiteException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzp()     // Catch:{ SQLiteException -> 0x0028 }
            java.lang.String r5 = "No data found"
            r4.zza(r5)     // Catch:{ SQLiteException -> 0x0028 }
            r3.close()
            return r0
        L_0x0020:
            java.lang.Object r4 = r5.zza(r3)     // Catch:{ SQLiteException -> 0x0028 }
            r3.close()
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x002e
        L_0x002a:
            r4 = move-exception
            goto L_0x0043
        L_0x002c:
            r4 = move-exception
            r3 = r0
        L_0x002e:
            com.google.android.gms.measurement.internal.zzfr r5 = r2.zzj()     // Catch:{ all -> 0x0041 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzg()     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "Error querying database."
            r5.zza(r1, r4)     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0040
            r3.close()
        L_0x0040:
            return r0
        L_0x0041:
            r4 = move-exception
            r0 = r3
        L_0x0043:
            if (r0 == 0) goto L_0x0048
            r0.close()
        L_0x0048:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zza(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.zzar):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza(long r5) {
        /*
            r4 = this;
            r4.zzt()
            r4.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.e_()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003a }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.zzfr r6 = r4.zzj()     // Catch:{ SQLiteException -> 0x003a }
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzp()     // Catch:{ SQLiteException -> 0x003a }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.zza(r1)     // Catch:{ SQLiteException -> 0x003a }
            r5.close()
            return r0
        L_0x0032:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003a }
            r5.close()
            return r6
        L_0x003a:
            r6 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x0055
        L_0x003e:
            r6 = move-exception
            r5 = r0
        L_0x0040:
            com.google.android.gms.measurement.internal.zzfr r1 = r4.zzj()     // Catch:{ all -> 0x0053 }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.zza(r2, r6)     // Catch:{ all -> 0x0053 }
            if (r5 == 0) goto L_0x0052
            r5.close()
        L_0x0052:
            return r0
        L_0x0053:
            r6 = move-exception
            r0 = r5
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.close()
        L_0x005a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zza(long):java.lang.String");
    }

    private final String zza(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = e_().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(0);
                rawQuery.close();
                return string;
            }
            rawQuery.close();
            return str2;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x0181 A[EDGE_INSN: B:88:0x0181->B:76:0x0181 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzfi.zzj, java.lang.Long>> zza(java.lang.String r19, int r20, int r21) {
        /*
            r18 = this;
            r1 = r21
            r18.zzt()
            r18.zzak()
            r2 = 1
            r3 = 0
            if (r20 <= 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            if (r1 <= 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r19)
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r18.e_()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r6 = "queue"
            java.lang.String r0 = "rowid"
            java.lang.String r7 = "data"
            java.lang.String r8 = "retry_count"
            java.lang.String[] r7 = new java.lang.String[]{r0, r7, r8}     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r8 = "app_id=?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0187 }
            r9[r3] = r19     // Catch:{ SQLiteException -> 0x0187 }
            r10 = 0
            r11 = 0
            java.lang.String r12 = "rowid"
            java.lang.String r13 = java.lang.String.valueOf(r20)     // Catch:{ SQLiteException -> 0x0187 }
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x0187 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0187 }
            if (r0 != 0) goto L_0x004e
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0187 }
            r4.close()
            return r0
        L_0x004e:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0187 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0187 }
            r6 = 0
        L_0x0054:
            long r7 = r4.getLong(r3)     // Catch:{ SQLiteException -> 0x0187 }
            byte[] r0 = r4.getBlob(r2)     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.measurement.internal.zzmz r9 = r18.g_()     // Catch:{ IOException -> 0x0163 }
            byte[] r0 = r9.zzc((byte[]) r0)     // Catch:{ IOException -> 0x0163 }
            boolean r9 = r5.isEmpty()     // Catch:{ SQLiteException -> 0x0187 }
            if (r9 != 0) goto L_0x006e
            int r9 = r0.length     // Catch:{ SQLiteException -> 0x0187 }
            int r9 = r9 + r6
            if (r9 > r1) goto L_0x0181
        L_0x006e:
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r9 = com.google.android.gms.internal.measurement.zzfi.zzj.zzu()     // Catch:{ IOException -> 0x0150 }
            com.google.android.gms.internal.measurement.zzkm r9 = com.google.android.gms.measurement.internal.zzmz.zza(r9, (byte[]) r0)     // Catch:{ IOException -> 0x0150 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r9 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9     // Catch:{ IOException -> 0x0150 }
            boolean r10 = com.google.android.gms.internal.measurement.zznp.zza()     // Catch:{ SQLiteException -> 0x0187 }
            if (r10 == 0) goto L_0x012c
            com.google.android.gms.measurement.internal.zzaf r10 = r18.zze()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzbi.zzcq     // Catch:{ SQLiteException -> 0x0187 }
            boolean r10 = r10.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r11)     // Catch:{ SQLiteException -> 0x0187 }
            if (r10 == 0) goto L_0x012c
            boolean r10 = r5.isEmpty()     // Catch:{ SQLiteException -> 0x0187 }
            if (r10 != 0) goto L_0x012c
            java.lang.Object r10 = r5.get(r3)     // Catch:{ SQLiteException -> 0x0187 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.Object r10 = r10.first     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = (com.google.android.gms.internal.measurement.zzfi.zzj) r10     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzkj r11 = r9.zzab()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzix r11 = (com.google.android.gms.internal.measurement.zzix) r11     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = (com.google.android.gms.internal.measurement.zzfi.zzj) r11     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r12 = r10.zzac()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r13 = r11.zzac()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r12 = r12.equals(r13)     // Catch:{ SQLiteException -> 0x0187 }
            if (r12 == 0) goto L_0x0129
            java.lang.String r12 = r10.zzab()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r13 = r11.zzab()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r12 = r12.equals(r13)     // Catch:{ SQLiteException -> 0x0187 }
            if (r12 == 0) goto L_0x0129
            boolean r12 = r10.zzas()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r13 = r11.zzas()     // Catch:{ SQLiteException -> 0x0187 }
            if (r12 != r13) goto L_0x0129
            java.lang.String r12 = r10.zzad()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r13 = r11.zzad()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r12 = r12.equals(r13)     // Catch:{ SQLiteException -> 0x0187 }
            if (r12 == 0) goto L_0x0129
            java.util.List r10 = r10.zzaq()     // Catch:{ SQLiteException -> 0x0187 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ SQLiteException -> 0x0187 }
        L_0x00de:
            boolean r12 = r10.hasNext()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r13 = "_npa"
            r14 = -1
            if (r12 == 0) goto L_0x00ff
            java.lang.Object r12 = r10.next()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzfi$zzn r12 = (com.google.android.gms.internal.measurement.zzfi.zzn) r12     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r2 = r12.zzg()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r2 = r13.equals(r2)     // Catch:{ SQLiteException -> 0x0187 }
            if (r2 == 0) goto L_0x00fd
            long r16 = r12.zzc()     // Catch:{ SQLiteException -> 0x0187 }
            goto L_0x0101
        L_0x00fd:
            r2 = 1
            goto L_0x00de
        L_0x00ff:
            r16 = r14
        L_0x0101:
            java.util.List r2 = r11.zzaq()     // Catch:{ SQLiteException -> 0x0187 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SQLiteException -> 0x0187 }
        L_0x0109:
            boolean r10 = r2.hasNext()     // Catch:{ SQLiteException -> 0x0187 }
            if (r10 == 0) goto L_0x0123
            java.lang.Object r10 = r2.next()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzfi$zzn r10 = (com.google.android.gms.internal.measurement.zzfi.zzn) r10     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r11 = r10.zzg()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r11 = r13.equals(r11)     // Catch:{ SQLiteException -> 0x0187 }
            if (r11 == 0) goto L_0x0109
            long r14 = r10.zzc()     // Catch:{ SQLiteException -> 0x0187 }
        L_0x0123:
            int r2 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0129
            r2 = 1
            goto L_0x012a
        L_0x0129:
            r2 = 0
        L_0x012a:
            if (r2 == 0) goto L_0x0181
        L_0x012c:
            r2 = 2
            boolean r10 = r4.isNull(r2)     // Catch:{ SQLiteException -> 0x0187 }
            if (r10 != 0) goto L_0x013a
            int r2 = r4.getInt(r2)     // Catch:{ SQLiteException -> 0x0187 }
            r9.zzh((int) r2)     // Catch:{ SQLiteException -> 0x0187 }
        L_0x013a:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x0187 }
            int r6 = r6 + r0
            com.google.android.gms.internal.measurement.zzkj r0 = r9.zzab()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzix r0 = (com.google.android.gms.internal.measurement.zzix) r0     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzfi$zzj r0 = (com.google.android.gms.internal.measurement.zzfi.zzj) r0     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0187 }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x0187 }
            r5.add(r0)     // Catch:{ SQLiteException -> 0x0187 }
            goto L_0x0175
        L_0x0150:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r2 = r18.zzj()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r7 = "Failed to merge queued bundle. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r19)     // Catch:{ SQLiteException -> 0x0187 }
            r2.zza(r7, r8, r0)     // Catch:{ SQLiteException -> 0x0187 }
            goto L_0x0175
        L_0x0163:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r2 = r18.zzj()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r7 = "Failed to unzip queued bundle. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r19)     // Catch:{ SQLiteException -> 0x0187 }
            r2.zza(r7, r8, r0)     // Catch:{ SQLiteException -> 0x0187 }
        L_0x0175:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0187 }
            if (r0 == 0) goto L_0x0181
            if (r6 <= r1) goto L_0x017e
            goto L_0x0181
        L_0x017e:
            r2 = 1
            goto L_0x0054
        L_0x0181:
            r4.close()
            return r5
        L_0x0185:
            r0 = move-exception
            goto L_0x01a3
        L_0x0187:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r1 = r18.zzj()     // Catch:{ all -> 0x0185 }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = "Error querying bundles. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r19)     // Catch:{ all -> 0x0185 }
            r1.zza(r2, r3, r0)     // Catch:{ all -> 0x0185 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0185 }
            if (r4 == 0) goto L_0x01a2
            r4.close()
        L_0x01a2:
            return r0
        L_0x01a3:
            if (r4 == 0) goto L_0x01a8
            r4.close()
        L_0x01a8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zza(java.lang.String, int, int):java.util.List");
    }

    public final List<zzad> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List<zzad> zza(String str, String[] strArr) {
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = e_().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z10 = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object zza2 = zza(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z10 = true;
                    }
                    String string4 = cursor.getString(5);
                    long j10 = cursor.getLong(6);
                    zzmz g_ = g_();
                    byte[] blob = cursor.getBlob(7);
                    Parcelable.Creator creator = zzbg.CREATOR;
                    long j11 = cursor.getLong(8);
                    long j12 = cursor.getLong(10);
                    boolean z11 = z10;
                    zzad zzad = r3;
                    zzad zzad2 = new zzad(string, string2, new zznc(string3, j12, zza2, string2), j11, z11, string4, (zzbg) g_.zza(blob, creator), j10, (zzbg) g_().zza(cursor.getBlob(9), creator), cursor.getLong(11), (zzbg) g_().zza(cursor.getBlob(12), creator));
                    arrayList.add(zzad);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error querying conditional user property value", e10);
            List<zzad> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(List<Long> list) {
        zzt();
        zzak();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzan()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzb("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                zzj().zzg().zza("Error incrementing retry count. error", e10);
            }
        }
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, List<zzew.zza> list) {
        boolean z10;
        boolean z11;
        String str2 = str;
        List<zzew.zza> list2 = list;
        Preconditions.checkNotNull(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzew.zza.C0225zza zza2 = (zzew.zza.C0225zza) list2.get(i10).zzby();
            if (zza2.zza() != 0) {
                for (int i11 = 0; i11 < zza2.zza(); i11++) {
                    zzew.zzb.zza zza3 = (zzew.zzb.zza) zza2.zza(i11).zzby();
                    zzew.zzb.zza zza4 = (zzew.zzb.zza) ((zzix.zzb) zza3.clone());
                    String zzb2 = zzii.zzb(zza3.zzb());
                    if (zzb2 != null) {
                        zza4.zza(zzb2);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    for (int i12 = 0; i12 < zza3.zza(); i12++) {
                        zzew.zzc zza5 = zza3.zza(i12);
                        String zza6 = zzik.zza(zza5.zze());
                        if (zza6 != null) {
                            zza4.zza(i12, (zzew.zzc) ((zzix) ((zzew.zzc.zza) zza5.zzby()).zza(zza6).zzab()));
                            z11 = true;
                        }
                    }
                    if (z11) {
                        zza2 = zza2.zza(i11, zza4);
                        list2.set(i10, (zzew.zza) ((zzix) zza2.zzab()));
                    }
                }
            }
            if (zza2.zzb() != 0) {
                for (int i13 = 0; i13 < zza2.zzb(); i13++) {
                    zzew.zze zzb3 = zza2.zzb(i13);
                    String zza7 = zzij.zza(zzb3.zze());
                    if (zza7 != null) {
                        zza2 = zza2.zza(i13, ((zzew.zze.zza) zzb3.zzby()).zza(zza7));
                        list2.set(i10, (zzew.zza) ((zzix) zza2.zzab()));
                    }
                }
            }
        }
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        try {
            zzak();
            zzt();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase e_2 = e_();
            e_2.delete("property_filters", "app_id=?", new String[]{str2});
            e_2.delete("event_filters", "app_id=?", new String[]{str2});
            for (zzew.zza next : list) {
                zzak();
                zzt();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(next);
                if (!next.zzg()) {
                    zzj().zzu().zza("Audience with no ID. appId", zzfr.zza(str));
                } else {
                    int zza8 = next.zza();
                    Iterator<zzew.zzb> it = next.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().zzu().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzfr.zza(str), Integer.valueOf(zza8));
                                break;
                            }
                        } else {
                            Iterator<zzew.zze> it2 = next.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().zzu().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzfr.zza(str), Integer.valueOf(zza8));
                                        break;
                                    }
                                } else {
                                    Iterator<zzew.zzb> it3 = next.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str2, zza8, it3.next())) {
                                                z10 = false;
                                                break;
                                            }
                                        } else {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                    if (z10) {
                                        Iterator<zzew.zze> it4 = next.zzf().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str2, zza8, it4.next())) {
                                                    z10 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z10) {
                                        zzak();
                                        zzt();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase e_3 = e_();
                                        e_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(zza8)});
                                        e_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(zza8)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzew.zza next2 : list) {
                arrayList.add(next2.zzg() ? Integer.valueOf(next2.zza()) : null);
            }
            zzb(str2, (List<Integer>) arrayList);
            e_.setTransactionSuccessful();
        } finally {
            e_.endTransaction();
        }
    }

    public final void zza(zzh zzh2) {
        Preconditions.checkNotNull(zzh2);
        zzt();
        zzak();
        String zzx = zzh2.zzx();
        Preconditions.checkNotNull(zzx);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzx);
        contentValues.put("app_instance_id", zzh2.zzy());
        contentValues.put("gmp_app_id", zzh2.zzac());
        contentValues.put("resettable_device_id_hash", zzh2.zzae());
        contentValues.put("last_bundle_index", Long.valueOf(zzh2.zzq()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzh2.zzr()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzh2.zzp()));
        contentValues.put("app_version", zzh2.zzaa());
        contentValues.put("app_store", zzh2.zzz());
        contentValues.put("gmp_version", Long.valueOf(zzh2.zzo()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzh2.zzl()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzh2.zzak()));
        contentValues.put("day", Long.valueOf(zzh2.zzk()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzh2.zzi()));
        contentValues.put("daily_events_count", Long.valueOf(zzh2.zzh()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzh2.zzf()));
        contentValues.put("config_fetched_time", Long.valueOf(zzh2.zze()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzh2.zzn()));
        contentValues.put("app_version_int", Long.valueOf(zzh2.zzc()));
        contentValues.put("firebase_instance_id", zzh2.zzab());
        contentValues.put("daily_error_events_count", Long.valueOf(zzh2.zzg()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzh2.zzj()));
        contentValues.put("health_monitor_sample", zzh2.zzad());
        contentValues.put("android_id", Long.valueOf(zzh2.zzb()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzh2.zzaj()));
        contentValues.put("admob_app_id", zzh2.zzv());
        contentValues.put("dynamite_version", Long.valueOf(zzh2.zzm()));
        contentValues.put("session_stitching_token", zzh2.zzaf());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzh2.zzam()));
        contentValues.put("target_os_version", Long.valueOf(zzh2.zzt()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzh2.zzs()));
        if (zzpg.zza() && zze().zze(zzx, zzbi.zzcf)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzh2.zza()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzh2.zzd()));
        }
        if (zznk.zza() && zze().zze(zzx, zzbi.zzcr)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzh2.zzan()));
        }
        List<String> zzag = zzh2.zzag();
        if (zzag != null) {
            if (zzag.isEmpty()) {
                zzj().zzu().zza("Safelisted events should not be an empty list. appId", zzx);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzag));
            }
        }
        if (zznq.zza() && zze().zza(zzbi.zzbp) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (zznp.zza() && zze().zze(zzx, zzbi.zzcm)) {
            contentValues.put("npa_metadata_value", zzh2.zzu());
        }
        try {
            SQLiteDatabase e_ = e_();
            if (((long) e_.update("apps", contentValues, "app_id = ?", new String[]{zzx})) == 0 && e_.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update app (got -1). appId", zzfr.zza(zzx));
            }
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing app. appId", zzfr.zza(zzx), e10);
        }
    }

    public final void zza(String str, zzih zzih) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzih);
        zzt();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzih.zze());
        if (!zznp.zza() || !zze().zza(zzbi.zzcm)) {
            try {
                if (e_().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                    zzj().zzg().zza("Failed to insert/update consent setting (got -1). appId", zzfr.zza(str));
                }
            } catch (SQLiteException e10) {
                zzj().zzg().zza("Error storing consent setting. appId, error", zzfr.zza(str), e10);
            }
        } else {
            contentValues.put("consent_source", Integer.valueOf(zzih.zza()));
            zza("consent_settings", "app_id", contentValues);
        }
    }

    public final void zza(String str, zzay zzay) {
        if (zznp.zza() && zze().zza(zzbi.zzcm)) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(zzay);
            zzt();
            zzak();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("dma_consent_settings", zzay.zzf());
            zza("consent_settings", "app_id", contentValues);
        }
    }

    public final void zza(zzbc zzbc) {
        Preconditions.checkNotNull(zzbc);
        zzt();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbc.zza);
        contentValues.put("name", zzbc.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbc.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbc.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbc.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbc.zzg));
        contentValues.put("last_bundled_day", zzbc.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbc.zzi);
        contentValues.put("last_sampling_rate", zzbc.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbc.zze));
        Boolean bool = zzbc.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (e_().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzfr.zza(zzbc.zza));
            }
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzfr.zza(zzbc.zza), e10);
        }
    }

    private final void zza(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase e_ = e_();
            String asString = contentValues.getAsString(str2);
            if (asString == null) {
                zzj().zzh().zza("Value of the primary key is not set.", zzfr.zza(str2));
                return;
            }
            if (((long) e_.update(str, contentValues, str2 + " = ?", new String[]{asString})) == 0 && e_.insertWithOnConflict(str, (String) null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update table (got -1). key", zzfr.zza(str), zzfr.zza(str2));
            }
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing into table. key", zzfr.zza(str), zzfr.zza(str2), e10);
        }
    }

    public final boolean zza(zzfi.zzj zzj2, boolean z10) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzj2);
        Preconditions.checkNotEmpty(zzj2.zzx());
        Preconditions.checkState(zzj2.zzbe());
        zzv();
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzj2.zzl() < currentTimeMillis - zzaf.zzm() || zzj2.zzl() > zzaf.zzm() + currentTimeMillis) {
            zzj().zzu().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfr.zza(zzj2.zzx()), Long.valueOf(currentTimeMillis), Long.valueOf(zzj2.zzl()));
        }
        try {
            byte[] zzb2 = g_().zzb(zzj2.zzbv());
            zzj().zzp().zza("Saving bundle, size", Integer.valueOf(zzb2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzj2.zzx());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzj2.zzl()));
            contentValues.put("data", zzb2);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (zzj2.zzbl()) {
                contentValues.put("retry_count", Integer.valueOf(zzj2.zzf()));
            }
            try {
                if (e_().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzfr.zza(zzj2.zzx()));
                return false;
            } catch (SQLiteException e10) {
                zzj().zzg().zza("Error storing bundle. appId", zzfr.zza(zzj2.zzx()), e10);
                return false;
            }
        } catch (IOException e11) {
            zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzfr.zza(zzj2.zzx()), e11);
            return false;
        }
    }

    private final boolean zza(String str, int i10, zzew.zzb zzb2) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzb2);
        Integer num = null;
        if (zzb2.zzf().isEmpty()) {
            zzft zzu = zzj().zzu();
            Object zza2 = zzfr.zza(str);
            Integer valueOf = Integer.valueOf(i10);
            if (zzb2.zzl()) {
                num = Integer.valueOf(zzb2.zzb());
            }
            zzu.zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zza2, valueOf, String.valueOf(num));
            return false;
        }
        byte[] zzbv = zzb2.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzb2.zzl() ? Integer.valueOf(zzb2.zzb()) : null);
        contentValues.put("event_name", zzb2.zzf());
        contentValues.put("session_scoped", zzb2.zzm() ? Boolean.valueOf(zzb2.zzj()) : null);
        contentValues.put("data", zzbv);
        try {
            if (e_().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert event filter (got -1). appId", zzfr.zza(str));
            return true;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing event filter. appId", zzfr.zza(str), e10);
            return false;
        }
    }

    private final boolean zza(String str, int i10, zzew.zze zze2) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zze2);
        Integer num = null;
        if (zze2.zze().isEmpty()) {
            zzft zzu = zzj().zzu();
            Object zza2 = zzfr.zza(str);
            Integer valueOf = Integer.valueOf(i10);
            if (zze2.zzi()) {
                num = Integer.valueOf(zze2.zza());
            }
            zzu.zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zza2, valueOf, String.valueOf(num));
            return false;
        }
        byte[] zzbv = zze2.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zze2.zzi() ? Integer.valueOf(zze2.zza()) : null);
        contentValues.put("property_name", zze2.zze());
        contentValues.put("session_scoped", zze2.zzj() ? Boolean.valueOf(zze2.zzh()) : null);
        contentValues.put("data", zzbv);
        try {
            if (e_().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert property filter (got -1). appId", zzfr.zza(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing property filter. appId", zzfr.zza(str), e10);
            return false;
        }
    }

    public final boolean zza(zzaz zzaz, long j10, boolean z10) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzaz);
        Preconditions.checkNotEmpty(zzaz.zza);
        byte[] zzbv = g_().zza(zzaz).zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzaz.zza);
        contentValues.put("name", zzaz.zzb);
        contentValues.put(Constants.TIMESTAMP, Long.valueOf(zzaz.zzc));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put("data", zzbv);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            if (e_().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzfr.zza(zzaz.zza));
            return false;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing raw event. appId", zzfr.zza(zzaz.zza), e10);
            return false;
        }
    }

    public final boolean zza(String str, zzmh zzmh) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzmh);
        Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzmh.zzb < currentTimeMillis - zzaf.zzm() || zzmh.zzb > zzaf.zzm() + currentTimeMillis) {
            zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzfr.zza(str), Long.valueOf(currentTimeMillis), Long.valueOf(zzmh.zzb));
        }
        zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzmh.zza);
        contentValues.put("source", Integer.valueOf(zzmh.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zzmh.zzb));
        try {
            if (e_().insert("trigger_uris", (String) null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzfr.zza(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing trigger URI. appId", zzfr.zza(str), e10);
            return false;
        }
    }

    public final boolean zza(String str, Long l10, long j10, zzfi.zze zze2) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zze2);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l10);
        byte[] zzbv = zze2.zzbv();
        zzj().zzp().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzbv);
        try {
            if (e_().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzfr.zza(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing complex main event. appId", zzfr.zza(str), e10);
            return false;
        }
    }

    public final boolean zza(zzad zzad) {
        Preconditions.checkNotNull(zzad);
        zzt();
        zzak();
        String str = zzad.zza;
        Preconditions.checkNotNull(str);
        if (zze(str, zzad.zzc.zza) == null) {
            if (zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzad.zzb);
        contentValues.put("name", zzad.zzc.zza);
        zza(contentValues, "value", Preconditions.checkNotNull(zzad.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzad.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzad.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzad.zzh));
        zzq();
        contentValues.put("timed_out_event", zznd.zza((Parcelable) zzad.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzad.zzd));
        zzq();
        contentValues.put("triggered_event", zznd.zza((Parcelable) zzad.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzad.zzc.zzb));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzad.zzj));
        zzq();
        contentValues.put("expired_event", zznd.zza((Parcelable) zzad.zzk));
        try {
            if (e_().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzfr.zza(str));
            }
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing conditional user property", zzfr.zza(str), e10);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(String str, Bundle bundle) {
        zzt();
        zzak();
        byte[] zzbv = g_().zza(new zzaz(this.zzu, "", str, "dep", 0, 0, bundle)).zzbv();
        zzj().zzp().zza("Saving default event parameters, appId, data size", zzi().zza(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbv);
        try {
            if (e_().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzfr.zza(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing default event parameters. appId", zzfr.zza(str), e10);
            return false;
        }
    }

    public final boolean zza(zzne zzne) {
        Preconditions.checkNotNull(zzne);
        zzt();
        zzak();
        if (zze(zzne.zza, zzne.zzc) == null) {
            if (zznd.zzh(zzne.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzne.zza}) >= ((long) zze().zza(zzne.zza, zzbi.zzag, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(zzne.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzne.zza, zzne.zzb}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzne.zza);
        contentValues.put("origin", zzne.zzb);
        contentValues.put("name", zzne.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzne.zzd));
        zza(contentValues, "value", zzne.zze);
        try {
            if (e_().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzfr.zza(zzne.zza));
            }
        } catch (SQLiteException e10) {
            zzj().zzg().zza("Error storing user property. appId", zzfr.zza(zzne.zza), e10);
        }
        return true;
    }
}
