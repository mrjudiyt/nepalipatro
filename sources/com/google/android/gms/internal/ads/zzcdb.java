package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcdb {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final boolean zzm;
    public final long zzn;
    public final long zzo;

    public zzcdb(String str) {
        String str2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbci.zzJ);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbci.zzl);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbci.zzw);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbci.zzh);
        zzbca zzbca = zzbci.zzg;
        if (jSONObject != null) {
            try {
                str2 = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.zze = str2;
            this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbci.zzi);
            this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbci.zzj);
            this.zzh = zzb(jSONObject, "player_precache_limit", zzbci.zzk);
            this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbci.zzm);
            this.zzj = zza(jSONObject, "use_cache_data_source", zzbci.zzee);
            zzb(jSONObject, "min_retry_count", zzbci.zzn);
            this.zzk = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbci.zzq);
            this.zzl = zza(jSONObject, "enable_multiple_video_playback", zzbci.zzbP);
            this.zzm = zza(jSONObject, "use_range_http_data_source", zzbci.zzbR);
            this.zzn = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbci.zzbS);
            this.zzo = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbci.zzbT);
        }
        str2 = (String) zzba.zzc().zzb(zzbca);
        this.zze = str2;
        this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbci.zzi);
        this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbci.zzj);
        this.zzh = zzb(jSONObject, "player_precache_limit", zzbci.zzk);
        this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbci.zzm);
        this.zzj = zza(jSONObject, "use_cache_data_source", zzbci.zzee);
        zzb(jSONObject, "min_retry_count", zzbci.zzn);
        this.zzk = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbci.zzq);
        this.zzl = zza(jSONObject, "enable_multiple_video_playback", zzbci.zzbP);
        this.zzm = zza(jSONObject, "use_range_http_data_source", zzbci.zzbR);
        this.zzn = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbci.zzbS);
        this.zzo = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbci.zzbT);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbca zzbca) {
        boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbca)).booleanValue();
        if (jSONObject == null) {
            return booleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return booleanValue;
        }
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbca zzbca) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzba.zzc().zzb(zzbca)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbca zzbca) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) zzba.zzc().zzb(zzbca)).longValue();
    }
}
