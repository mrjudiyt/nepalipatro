package com.google.android.gms.internal.gtm;

import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzfb extends zzbs {
    private static zzfb zza;

    public zzfb(zzbv zzbv) {
        super(zzbv);
    }

    public static zzfb zza() {
        return zza;
    }

    @VisibleForTesting
    protected static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            return str + Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))) + "..." + str + Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : str;
        }
    }

    public final void zzb(zzex zzex, String str) {
        zzS(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), zzex != null ? zzex.toString() : "no hit data");
    }

    public final void zzc(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) next.getKey());
            sb.append('=');
            sb.append((String) next.getValue());
        }
        zzS(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void zzd() {
        synchronized (zzfb.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i10, String str, Object obj, Object obj2, Object obj3) {
        char c10;
        Preconditions.checkNotNull(str);
        if (zzw().zzb()) {
            zzw();
            c10 = 'C';
        } else {
            zzw();
            c10 = 'c';
        }
        char charAt = "01VDIWEA?".charAt(i10);
        String str2 = zzbt.zza;
        String zzD = zzbr.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(zzD).length());
        sb.append("3");
        sb.append(charAt);
        sb.append(c10);
        sb.append(str2);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(zzD);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = sb2.substring(0, 1024);
        }
        zzfh zzp = zzt().zzp();
        if (zzp != null) {
            zzp.zze().zzc(sb2);
        }
    }
}
