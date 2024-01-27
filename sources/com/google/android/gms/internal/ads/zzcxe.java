package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcxe extends zzdm {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzeez zzh;
    private final Bundle zzi;

    public zzcxe(zzfcr zzfcr, String str, zzeez zzeez, zzfcv zzfcv, String str2) {
        String str3;
        String str4;
        String str5 = null;
        if (zzfcr == null) {
            str3 = null;
        } else {
            str3 = zzfcr.zzad;
        }
        this.zzb = str3;
        this.zzc = str2;
        if (zzfcv == null) {
            str4 = null;
        } else {
            str4 = zzfcv.zzb;
        }
        this.zzd = str4;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str5 = zzfcr.zzx.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str5 != null ? str5 : str;
        this.zze = zzeez.zzc();
        this.zzh = zzeez;
        this.zzf = zzt.zzB().currentTimeMillis() / 1000;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzgM)).booleanValue() || zzfcv == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfcv.zzj;
        }
        this.zzg = (!((Boolean) zzba.zzc().zzb(zzbci.zziW)).booleanValue() || zzfcv == null || TextUtils.isEmpty(zzfcv.zzh)) ? "" : zzfcv.zzh;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final Bundle zze() {
        return this.zzi;
    }

    public final zzu zzf() {
        zzeez zzeez = this.zzh;
        if (zzeez != null) {
            return zzeez.zza();
        }
        return null;
    }

    public final String zzg() {
        return this.zza;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        return this.zzb;
    }

    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
