package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdkn implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdoi zzd;
    private final Clock zze;
    private zzbhi zzf;
    private zzbjj zzg;

    public zzdkn(zzdoi zzdoi, Clock clock) {
        this.zzd = zzdoi;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.zzc = null;
        }
    }

    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.zza == null || this.zzb == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.zza);
                hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzd.zzg("sendMessageToNativeJs", hashMap);
            }
            zzd();
        }
    }

    public final zzbhi zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf != null && this.zzb != null) {
            zzd();
            try {
                this.zzf.zze();
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void zzc(zzbhi zzbhi) {
        this.zzf = zzbhi;
        zzbjj zzbjj = this.zzg;
        if (zzbjj != null) {
            this.zzd.zzk("/unconfirmedClick", zzbjj);
        }
        zzdkm zzdkm = new zzdkm(this, zzbhi);
        this.zzg = zzdkm;
        this.zzd.zzi("/unconfirmedClick", zzdkm);
    }
}
