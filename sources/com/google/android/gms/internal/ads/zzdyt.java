package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdyt implements zzfza {
    public final /* synthetic */ zzbvg zza;

    public /* synthetic */ zzdyt(zzbvg zzbvg) {
        this.zza = zzbvg;
    }

    public final e zza(Object obj) {
        String str = new String(zzfxv.zza((InputStream) obj), zzfsi.zzc);
        zzbvg zzbvg = this.zza;
        zzbvg.zzj = str;
        return zzfzt.zzh(zzbvg);
    }
}
