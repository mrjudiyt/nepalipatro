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
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzx implements zzfzp {
    final /* synthetic */ zzbtk zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    zzx(zzaa zzaa, zzbtk zzbtk, boolean z10) {
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
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            if (this.zzc.zzt || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzO(uri)) {
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
