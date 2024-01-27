package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzao implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ int zze;
    public final /* synthetic */ int zzf;

    public /* synthetic */ zzao(zzau zzau, int i10, int i11, int i12, int i13, int i14) {
        this.zza = zzau;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dialogInterface, i10);
    }
}
