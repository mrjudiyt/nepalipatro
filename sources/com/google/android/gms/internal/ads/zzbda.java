package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbda {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbda(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put(NativeProtocol.WEB_DIALOG_ACTION, "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public static final zzbcx zzf() {
        return new zzbcx(zzt.zzB().elapsedRealtime(), (String) null, (zzbcx) null);
    }

    public final zzbcz zza() {
        zzbcz zzbcz;
        boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbci.zzbO)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbcx zzbcx : this.zza) {
                long zza2 = zzbcx.zza();
                String zzc2 = zzbcx.zzc();
                zzbcx zzb2 = zzbcx.zzb();
                if (zzb2 != null && zza2 > 0) {
                    sb.append(zzc2);
                    sb.append('.');
                    sb.append(zza2 - zzb2.zza());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb2.zza()))) {
                            hashMap.put(Long.valueOf(zzb2.zza()), new StringBuilder(zzc2));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb2.zza()));
                            sb2.append('+');
                            sb2.append(zzc2);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(zzt.zzB().currentTimeMillis() + (((Long) entry.getKey()).longValue() - zzt.zzB().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbcz = new zzbcz(sb.toString(), str);
        }
        return zzbcz;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            zzt.zzo().zzf();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbda zzbda) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbcq zzf;
        if (!TextUtils.isEmpty(str2) && (zzf = zzt.zzo().zzf()) != null) {
            synchronized (this.zzc) {
                zzbcw zza2 = zzf.zza(str);
                Map map = this.zzb;
                map.put(str, zza2.zza((String) map.get(str), str2));
            }
        }
    }

    public final boolean zze(zzbcx zzbcx, long j10, String... strArr) {
        synchronized (this.zzc) {
            for (int i10 = 0; i10 <= 0; i10++) {
                this.zza.add(new zzbcx(j10, strArr[i10], zzbcx));
            }
        }
        return true;
    }
}
