package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdyb extends zzdxz {
    zzdyb(Context context) {
        this.zzf = new zzbug(context, zzt.zzt().zzb(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzdxy(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyo(1));
                } catch (Throwable th) {
                    zzt.zzo().zzu(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzdyo(1));
                }
            }
        }
    }

    public final e zzb(zzbvg zzbvg) {
        synchronized (this.zzb) {
            if (this.zzc) {
                zzcbl zzcbl = this.zza;
                return zzcbl;
            }
            this.zzc = true;
            this.zze = zzbvg;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new zzdya(this), zzcbg.zzf);
            zzcbl zzcbl2 = this.zza;
            return zzcbl2;
        }
    }
}
