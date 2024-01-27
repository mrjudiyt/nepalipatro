package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zztn {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzgn zza;
    public final Uri zzb;
    public final Map zzc;

    public zztn(long j10, zzgn zzgn, Uri uri, Map map, long j11, long j12, long j13) {
        this.zza = zzgn;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
