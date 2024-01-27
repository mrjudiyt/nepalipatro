package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatf extends zzaud {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzatf(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11) {
        super(zzasp, "ttuIHg/yfWDxJlotLoMLf9WBnVTbWFFKY03C8KHR8FAhIQHccw4LaDLJatYkpo23", "xLOAO7msIR4UFUyldUn5stL2wwbLdISu2CSlTLg4f6Q=", zzaom, i10, 44);
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzo(zzi.longValue());
        }
    }
}
