package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatt extends zzaud {
    private List zzi = null;
    private final Context zzj;

    public zzatt(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11, Context context) {
        super(zzasp, "y3yRmC/kyT5sblAh6MVmMMe529YDQrbaaQxNMdjlDdcJ+gZ0vSS7aY/hNYvCePEW", "Y0trGqGVEUAa7A3LYgSQFKe4N9h1BuTC7OKFYCHfLSg=", zzaom, i10, 31);
        this.zzj = context;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        this.zze.zzW(-1);
        this.zze.zzS(-1);
        Context context = this.zzj;
        if (context == null) {
            context = this.zzb.zzb();
        }
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke((Object) null, new Object[]{context});
        }
        List list = this.zzi;
        if (list != null && list.size() == 2) {
            synchronized (this.zze) {
                this.zze.zzW(((Long) this.zzi.get(0)).longValue());
                this.zze.zzS(((Long) this.zzi.get(1)).longValue());
            }
        }
    }
}
