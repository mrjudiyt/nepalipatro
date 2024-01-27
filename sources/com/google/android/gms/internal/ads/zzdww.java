package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdww implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzdww(zzhbp zzhbp, zzhbp zzhbp2) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        CookieManager zzb2 = zzt.zzq().zzb((Context) this.zzb.zzb());
        zzfhl zzfhl = zzfhl.WEBVIEW_COOKIE;
        return zzfhb.zza(new zzdwt(zzb2), zzfhl, (zzfhr) this.zza.zzb()).zzi(1, TimeUnit.SECONDS).zzc(Exception.class, new zzfhc(zzdwu.zza)).zza();
    }
}
