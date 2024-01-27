package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbtk;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfzp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzy implements zzfzp {
    final /* synthetic */ zzbtk zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    zzy(zzaa zzaa, zzbtk zzbtk, boolean z10) {
        this.zzc = zzaa;
        this.zza = zzbtk;
        this.zzb = z10;
    }

    public final void zza(Throwable th) {
        try {
            zzbtk zzbtk = this.zza;
            String message = th.getMessage();
            zzbtk.zze("Internal error: " + message);
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<Uri> list = (List) obj;
        try {
            zzaa.zzF(this.zzc, list);
            this.zza.zzf(list);
            if (this.zzc.zzu || this.zzb) {
                for (Uri uri : list) {
                    if (this.zzc.zzN(uri)) {
                        zzaa zzaa = this.zzc;
                        this.zzc.zzs.zzc(zzaa.zzX(uri, zzaa.zzC, AppEventsConstants.EVENT_PARAM_VALUE_YES).toString(), (zzfje) null);
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbci.zzhu)).booleanValue()) {
                            this.zzc.zzs.zzc(uri.toString(), (zzfje) null);
                        }
                    }
                }
            }
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }
}
