package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzfpb implements Closeable {
    public static zzfpn zza() {
        return new zzfpn();
    }

    public static zzfpn zzb(int i10, zzfpm zzfpm) {
        return new zzfpn(new zzfoz(i10), zzfpa.zza, zzfpm);
    }

    public static zzfpn zzc(zzftm<Integer> zzftm, zzftm<Integer> zzftm2, zzfpm zzfpm) {
        return new zzfpn(zzftm, zzftm2, zzfpm);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
