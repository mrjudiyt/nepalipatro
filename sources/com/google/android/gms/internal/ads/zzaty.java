package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaty extends zzaud {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaty(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11) {
        super(zzasp, "pfTqFlR1an7kDUBzP8CmJZynZFAzKap0OWhefexY5E+9LoDEPq/g9ouqCw4/+GOX", "y+BEEb1lYOUGwTehZ9VIg/2gibmtEOjDZzKXHhs5BV0=", zzaom, i10, 33);
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
            this.zze.zzV(zzi.longValue());
        }
    }
}
