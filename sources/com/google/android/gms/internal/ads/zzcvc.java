package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcvc {
    private final Object zza = new Object();
    private final ConcurrentHashMap zzb = new ConcurrentHashMap();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();
    private final ConcurrentHashMap zzd = new ConcurrentHashMap();

    public final int zza(String str) {
        Integer num = (Integer) this.zzb.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzb(String str) {
        Long l10 = (Long) this.zzd.get(str);
        if (l10 == null) {
            return -1;
        }
        return l10.longValue();
    }

    public final void zzc(String str) {
        int i10;
        synchronized (this.zza) {
            Integer num = (Integer) this.zzb.get(str);
            if (num == null) {
                i10 = 1;
            } else {
                i10 = Integer.valueOf(num.intValue() + 1);
            }
            this.zzb.put(str, i10);
        }
    }

    public final void zzd(String str, String str2, long j10) {
        Long l10 = (Long) this.zzc.get(str2);
        if (l10 != null) {
            this.zzc.remove(str2);
            this.zzd.put(str, Long.valueOf(j10 - l10.longValue()));
        }
    }

    public final void zze(String str, long j10) {
        this.zzc.put(str, Long.valueOf(j10));
    }
}
