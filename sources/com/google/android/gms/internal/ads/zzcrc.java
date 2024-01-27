package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzcrc {
    private final zzcsv zza;
    private final View zzb;
    private final zzfcs zzc;
    private final zzcgb zzd;

    public zzcrc(View view, zzcgb zzcgb, zzcsv zzcsv, zzfcs zzfcs) {
        this.zzb = view;
        this.zzd = zzcgb;
        this.zza = zzcsv;
        this.zzc = zzfcs;
    }

    public static final zzdev zzf(Context context, zzcaz zzcaz, zzfcr zzfcr, zzfdn zzfdn) {
        return new zzdev(new zzcra(context, zzcaz, zzfcr, zzfdn), zzcbg.zzf);
    }

    public static final Set zzg(zzcsm zzcsm) {
        return Collections.singleton(new zzdev(zzcsm, zzcbg.zzf));
    }

    public static final zzdev zzh(zzcsk zzcsk) {
        return new zzdev(zzcsk, zzcbg.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcgb zzb() {
        return this.zzd;
    }

    public final zzcsv zzc() {
        return this.zza;
    }

    public zzcyx zzd(Set set) {
        return new zzcyx(set);
    }

    public final zzfcs zze() {
        return this.zzc;
    }
}
