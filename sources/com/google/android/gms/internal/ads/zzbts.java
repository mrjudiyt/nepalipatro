package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbts {
    private final View zza;
    private final Map zzb;
    private final zzbzk zzc;

    public zzbts(zzbtr zzbtr) {
        View zza2 = zzbtr.zza;
        this.zza = zza2;
        Map zzd = zzbtr.zzb;
        this.zzb = zzd;
        zzbzk zza3 = zzbtm.zza(zzbtr.zza.getContext());
        this.zzc = zza3;
        if (zza3 != null && !zzd.isEmpty()) {
            try {
                zza3.zzf(new zzbtt(ObjectWrapper.wrap(zza2).asBinder(), ObjectWrapper.wrap(zzd).asBinder()));
            } catch (RemoteException unused) {
                zzcat.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            zzcat.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            zzcat.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzbtq(this, list));
        } catch (RemoteException e10) {
            zzcat.zzg("RemoteException recording click: ".concat(e10.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            zzcat.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzbzk zzbzk = this.zzc;
        if (zzbzk != null) {
            try {
                zzbzk.zzh(list, ObjectWrapper.wrap(this.zza), new zzbtp(this, list));
            } catch (RemoteException e10) {
                zzcat.zzg("RemoteException recording impression urls: ".concat(e10.toString()));
            }
        } else {
            zzcat.zzj("Failed to get internal reporting info generator from recordImpression.");
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbzk zzbzk = this.zzc;
        if (zzbzk != null) {
            try {
                zzbzk.zzj(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException unused) {
                zzcat.zzg("Failed to call remote method.");
            }
        } else {
            zzcat.zze("Failed to get internal reporting info generator.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzk(new ArrayList(Arrays.asList(new Uri[]{uri})), ObjectWrapper.wrap(this.zza), new zzbto(this, updateClickUrlCallback));
        } catch (RemoteException e10) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e10.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(list, ObjectWrapper.wrap(this.zza), new zzbtn(this, updateImpressionUrlsCallback));
        } catch (RemoteException e10) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e10.toString()));
        }
    }
}
