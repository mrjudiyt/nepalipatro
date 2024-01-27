package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbng extends zzcbs {
    private final Object zza = new Object();
    /* access modifiers changed from: private */
    public final zzbnl zzb;
    private boolean zzc;

    public zzbng(zzbnl zzbnl) {
        this.zzb = zzbnl;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (!this.zzc) {
                this.zzc = true;
                zzi(new zzbnd(this), new zzcbo());
                zzi(new zzbne(this), new zzbnf(this));
            }
        }
    }
}
