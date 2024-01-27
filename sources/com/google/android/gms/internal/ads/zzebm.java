package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzebm implements zzfgu {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfit zzc;
    private final zzfje zzd;

    public zzebm(String str, zzfje zzfje, zzfit zzfit) {
        this.zzb = str;
        this.zzd = zzfje;
        this.zzc = zzfit;
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzdwm zzdwm;
        String str;
        zzebl zzebl = (zzebl) obj;
        int optInt = zzebl.zza.optInt("http_timeout_millis", 60000);
        zzbvj zza2 = zzebl.zzb;
        String str2 = "";
        if (zza2.zza() == -2) {
            HashMap hashMap = new HashMap();
            if (zzebl.zzb.zzh() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) zzba.zzc().zzb(zzbci.zzaN)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = str2;
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = str2;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", this.zzb);
                }
            }
            if (zzebl.zzb.zzi()) {
                zzebn.zza(hashMap, zzebl.zza);
            }
            if (zzebl.zzb != null && !TextUtils.isEmpty(zzebl.zzb.zzd())) {
                str2 = zzebl.zzb.zzd();
            }
            zzfje zzfje = this.zzd;
            zzfit zzfit = this.zzc;
            zzfit.zzf(true);
            zzfje.zza(zzfit);
            return new zzebh(zzebl.zzb.zze(), optInt, hashMap, str2.getBytes(zzfsi.zzc), "", zzebl.zzb.zzi());
        }
        if (zza2.zza() == 1) {
            if (zza2.zzf() != null) {
                str2 = TextUtils.join(", ", zza2.zzf());
                zzcat.zzg(str2);
            }
            zzdwm = new zzdwm(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzdwm = new zzdwm(1);
        }
        zzfje zzfje2 = this.zzd;
        zzfit zzfit2 = this.zzc;
        zzfit2.zzg(zzdwm);
        zzfit2.zzf(false);
        zzfje2.zza(zzfit2);
        throw zzdwm;
    }
}
