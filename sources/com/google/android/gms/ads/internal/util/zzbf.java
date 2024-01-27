package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbf {
    /* access modifiers changed from: private */
    public final List zza = new ArrayList();
    /* access modifiers changed from: private */
    public final List zzb = new ArrayList();
    /* access modifiers changed from: private */
    public final List zzc = new ArrayList();

    public final zzbf zza(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < this.zza.size()) {
            double doubleValue = ((Double) this.zzc.get(i10)).doubleValue();
            double doubleValue2 = ((Double) this.zzb.get(i10)).doubleValue();
            if (d10 < doubleValue || (doubleValue == d10 && d11 < doubleValue2)) {
                break;
            }
            i10++;
        }
        this.zza.add(i10, str);
        this.zzc.add(i10, Double.valueOf(d10));
        this.zzb.add(i10, Double.valueOf(d11));
        return this;
    }

    public final zzbh zzb() {
        return new zzbh(this, (zzbg) null);
    }
}
