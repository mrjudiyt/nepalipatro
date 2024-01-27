package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcef extends zzb {
    final zzcdc zza;
    final zzcen zzb;
    private final String zzc;
    private final String[] zzd;

    zzcef(zzcdc zzcdc, zzcen zzcen, String str, String[] strArr) {
        this.zza = zzcdc;
        this.zzb = zzcen;
        this.zzc = str;
        this.zzd = strArr;
        zzt.zzy().zzb(this);
    }

    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcee(this));
        }
    }

    public final e zzb() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzbU)).booleanValue() || !(this.zzb instanceof zzcew)) {
            return super.zzb();
        }
        return zzcbg.zze.zzb(new zzced(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
