package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzar implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ AtomicInteger zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ int zze;

    public /* synthetic */ zzar(zzau zzau, AtomicInteger atomicInteger, int i10, int i11, int i12) {
        this.zza = zzau;
        this.zzb = atomicInteger;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzh(this.zzb, this.zzc, this.zzd, this.zze, dialogInterface, i10);
    }
}
