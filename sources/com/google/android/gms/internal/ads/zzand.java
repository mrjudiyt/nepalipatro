package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzand {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str) || "-1".equals(str)) {
                zzams.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            zzams.zzc(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static zzalp zzb(zzamc zzamc) {
        long j10;
        long j11;
        boolean z10;
        long j12;
        long j13;
        long j14;
        zzamc zzamc2 = zzamc;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzamc2.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long zza = str != null ? zza(str) : 0;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i11 = 0;
            j11 = 0;
            j10 = 0;
            while (i10 < split.length) {
                String trim = split[i10].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j10 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
            z10 = true;
        } else {
            z10 = false;
            j11 = 0;
            j10 = 0;
        }
        String str3 = (String) map.get("Expires");
        long zza2 = str3 != null ? zza(str3) : 0;
        String str4 = (String) map.get("Last-Modified");
        long zza3 = str4 != null ? zza(str4) : 0;
        String str5 = (String) map.get("ETag");
        if (z10) {
            j13 = currentTimeMillis + (j10 * 1000);
            if (i10 != 0) {
                j14 = j13;
            } else {
                Long.signum(j11);
                j14 = (j11 * 1000) + j13;
            }
            j12 = j14;
        } else {
            j12 = 0;
            if (zza <= 0 || zza2 < zza) {
                j13 = 0;
            } else {
                j13 = currentTimeMillis + (zza2 - zza);
                j12 = j13;
            }
        }
        zzalp zzalp = new zzalp();
        zzalp.zza = zzamc2.zzb;
        zzalp.zzb = str5;
        zzalp.zzf = j13;
        zzalp.zze = j12;
        zzalp.zzc = zza;
        zzalp.zzd = zza3;
        zzalp.zzg = map;
        zzalp.zzh = zzamc2.zzd;
        return zzalp;
    }

    static String zzc(long j10) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
