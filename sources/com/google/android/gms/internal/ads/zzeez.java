package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeez {
    private final List zza = Collections.synchronizedList(new ArrayList());
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final String zzc;
    private zzfcv zzd = null;
    private zzfcr zze = null;
    private zzu zzf = null;

    public zzeez(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfcr zzfcr) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdp)).booleanValue()) {
            return zzfcr.zzar;
        }
        return zzfcr.zzy;
    }

    private final synchronized void zzk(zzfcr zzfcr, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.zzb;
        String zzj = zzj(zzfcr);
        if (!map.containsKey(zzj)) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = zzfcr.zzx.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, zzfcr.zzx.getString(next));
                } catch (JSONException unused) {
                }
            }
            if (((Boolean) zzba.zzc().zzb(zzbci.zzgK)).booleanValue()) {
                str4 = zzfcr.zzH;
                str3 = zzfcr.zzI;
                str2 = zzfcr.zzJ;
                str = zzfcr.zzK;
            } else {
                str4 = "";
                str3 = "";
                str2 = "";
                str = "";
            }
            zzu zzu = new zzu(zzfcr.zzG, 0, (zze) null, bundle, str4, str3, str2, str);
            try {
                this.zza.add(i10, zzu);
            } catch (IndexOutOfBoundsException e10) {
                zzt.zzo().zzu(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
            }
            this.zzb.put(zzj, zzu);
        }
    }

    private final void zzl(zzfcr zzfcr, long j10, zze zze2, boolean z10) {
        Map map = this.zzb;
        String zzj = zzj(zzfcr);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzfcr;
            }
            zzu zzu = (zzu) this.zzb.get(zzj);
            zzu.zzb = j10;
            zzu.zzc = zze2;
            if (((Boolean) zzba.zzc().zzb(zzbci.zzgL)).booleanValue() && z10) {
                this.zzf = zzu;
            }
        }
    }

    public final zzu zza() {
        return this.zzf;
    }

    public final zzcxe zzb() {
        return new zzcxe(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfcr zzfcr) {
        zzk(zzfcr, this.zza.size());
    }

    public final void zze(zzfcr zzfcr) {
        int indexOf = this.zza.indexOf(this.zzb.get(zzj(zzfcr)));
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            indexOf = this.zza.indexOf(this.zzf);
        }
        if (indexOf >= 0 && indexOf < this.zzb.size()) {
            this.zzf = (zzu) this.zza.get(indexOf);
            while (true) {
                indexOf++;
                if (indexOf < this.zza.size()) {
                    zzu zzu = (zzu) this.zza.get(indexOf);
                    zzu.zzb = 0;
                    zzu.zzc = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzf(zzfcr zzfcr, long j10, zze zze2) {
        zzl(zzfcr, j10, zze2, false);
    }

    public final void zzg(zzfcr zzfcr, long j10, zze zze2) {
        zzl(zzfcr, j10, (zze) null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int indexOf = this.zza.indexOf((zzu) this.zzb.get(str));
            try {
                this.zza.remove(indexOf);
            } catch (IndexOutOfBoundsException e10) {
                zzt.zzo().zzu(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfcr) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzi(zzfcv zzfcv) {
        this.zzd = zzfcv;
    }
}
