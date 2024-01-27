package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatl extends zzaud {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzatl(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11) {
        super(zzasp, "1eWk7vHD3Ee+FybzKEoWLH07Pvdxo5flYR768ntLvpJZNSFjE7xgNzi+al9tiZC4", "w5tjCRfZfXWJzckDvIkXwf5aGJEVejLzfxhnwyqJH5E=", zzaom, i10, 22);
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
            this.zze.zzy(zzi.longValue());
        }
    }
}
