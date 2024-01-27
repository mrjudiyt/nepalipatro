package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbnl extends zzcbs {
    private final Object zza = new Object();
    private final zzbd zzb;
    private boolean zzc;
    private int zzd;

    public zzbnl(zzbd zzbd) {
        this.zzb = zzbd;
        this.zzc = false;
        this.zzd = 0;
    }

    public final zzbng zza() {
        zzbng zzbng = new zzbng(this);
        synchronized (this.zza) {
            zzi(new zzbnh(this, zzbng), new zzbni(this, zzbng));
            Preconditions.checkState(this.zzd >= 0);
            this.zzd++;
        }
        return zzbng;
    }

    public final void zzb() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzc() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            if (!this.zzc || this.zzd != 0) {
                zze.zza("There are still references to the engine. Not destroying.");
            } else {
                zze.zza("No reference is left (including root). Cleaning up engine.");
                zzi(new zzbnk(this), new zzcbo());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzd() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd > 0);
            zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
    }
}
