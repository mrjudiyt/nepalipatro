package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatq extends zzaud {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzatq(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11) {
        super(zzasp, "hMVcCX1S6+m7rVEDNdCHhVgXRFILMOQ9RgLSmTdPHeNgAU8CbmBsymKBuqLQcQaU", "3PwoDnm3HnsskB+3ZnJHoZ7BzV0InxUqaAwJBlSwKFs=", zzaom, i10, 1);
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        this.zze.zzB("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzB(zzi);
        }
    }
}
