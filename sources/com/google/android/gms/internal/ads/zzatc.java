package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatc extends zzaud {
    private static final zzaue zzi = new zzaue();
    private final Context zzj;

    public zzatc(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11, Context context) {
        super(zzasp, "gL88T2vBvJS+jBemUvhPpVS5IeaU7cU4wFVgyT6PJl7pFldWXOd3mZxVZlQUSll5", "bObXLZFRWAdU6+me08AeNX2ciqxi45ddv3QSqAplzos=", zzaom, i10, 29);
        this.zzj = context;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        this.zze.zzn("E");
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zzf.invoke((Object) null, new Object[]{this.zzj}));
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzn(zzapz.zza(str.getBytes(), true));
        }
    }
}
