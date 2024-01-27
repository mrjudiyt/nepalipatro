package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdxx extends zzdxz {
    public zzdxx(Context context) {
        this.zzf = new zzbug(context, zzt.zzt().zzb(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzg(this.zze, new zzdxy(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyo(1));
                } catch (Throwable th) {
                    zzt.zzo().zzu(th, "RemoteAdRequestClientTask.onConnected");
                    this.zza.zzd(new zzdyo(1));
                }
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzcat.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyo(1));
    }
}
