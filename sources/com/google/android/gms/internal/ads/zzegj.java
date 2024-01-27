package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzegj implements zzeeu {
    private final Context zza;
    private final zzdgx zzb;
    private final Executor zzc;
    private final zzfcq zzd;

    public zzegj(Context context, Executor executor, zzdgx zzdgx, zzfcq zzfcq) {
        this.zza = context;
        this.zzb = zzdgx;
        this.zzc = executor;
        this.zzd = zzfcq;
    }

    private static String zzd(zzfcr zzfcr) {
        try {
            return zzfcr.zzx.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    public final e zza(zzfde zzfde, zzfcr zzfcr) {
        String zzd2 = zzd(zzfcr);
        return zzfzt.zzn(zzfzt.zzh((Object) null), new zzegh(this, zzd2 != null ? Uri.parse(zzd2) : null, zzfde, zzfcr), this.zzc);
    }

    public final boolean zzb(zzfde zzfde, zzfcr zzfcr) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbdj.zzg(context) && !TextUtils.isEmpty(zzd(zzfcr));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(Uri uri, zzfde zzfde, zzfcr zzfcr, Object obj) {
        try {
            d b10 = new d.b().b();
            b10.f1357a.setData(uri);
            zzc zzc2 = new zzc(b10.f1357a, (zzx) null);
            zzcbl zzcbl = new zzcbl();
            zzdfx zze = this.zzb.zze(new zzctm(zzfde, zzfcr, (String) null), new zzdga(new zzegi(zzcbl), (zzcgb) null));
            zzcbl.zzc(new AdOverlayInfoParcel(zzc2, (zza) null, zze.zza(), (zzz) null, new zzcaz(0, 0, false, false, false), (zzcgb) null, (zzdfd) null));
            this.zzd.zza();
            return zzfzt.zzh(zze.zzg());
        } catch (Throwable th) {
            zzcat.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
