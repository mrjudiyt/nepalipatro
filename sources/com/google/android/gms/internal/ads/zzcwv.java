package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcwv {
    private final Context zza;
    private final zzfdn zzb;
    private final Bundle zzc;
    private final zzfdf zzd;
    private final zzcwn zze;
    private final zzeez zzf;

    /* synthetic */ zzcwv(zzcwt zzcwt, zzcwu zzcwu) {
        this.zza = zzcwt.zza;
        this.zzb = zzcwt.zzb;
        this.zzc = zzcwt.zzc;
        this.zzd = zzcwt.zzd;
        this.zze = zzcwt.zze;
        this.zzf = zzcwt.zzf;
    }

    /* access modifiers changed from: package-private */
    public final Context zza(Context context) {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzb() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final zzcwn zzc() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final zzcwt zzd() {
        zzcwt zzcwt = new zzcwt();
        zzcwt.zze(this.zza);
        zzcwt.zzi(this.zzb);
        zzcwt.zzf(this.zzc);
        zzcwt.zzg(this.zze);
        zzcwt.zzd(this.zzf);
        return zzcwt;
    }

    /* access modifiers changed from: package-private */
    public final zzeez zze(String str) {
        zzeez zzeez = this.zzf;
        return zzeez != null ? zzeez : new zzeez(str);
    }

    /* access modifiers changed from: package-private */
    public final zzfdf zzf() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final zzfdn zzg() {
        return this.zzb;
    }
}
