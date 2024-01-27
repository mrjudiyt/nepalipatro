package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdyf extends zzdxz {
    private String zzg;
    private int zzh = 1;

    zzdyf(Context context) {
        this.zzf = new zzbug(context, zzt.zzt().zzb(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i10 = this.zzh;
                    if (i10 == 2) {
                        this.zzf.zzp().zze(this.zze, new zzdxy(this));
                    } else if (i10 == 3) {
                        this.zzf.zzp().zzh(this.zzg, new zzdxy(this));
                    } else {
                        this.zza.zzd(new zzdyo(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyo(1));
                } catch (Throwable th) {
                    zzt.zzo().zzu(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new zzdyo(1));
                }
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzcat.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyo(1));
    }

    public final e zzb(zzbvg zzbvg) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 2) {
                e zzg2 = zzfzt.zzg(new zzdyo(2));
                return zzg2;
            } else if (this.zzc) {
                zzcbl zzcbl = this.zza;
                return zzcbl;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbvg;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new zzdyd(this), zzcbg.zzf);
                zzcbl zzcbl2 = this.zza;
                return zzcbl2;
            }
        }
    }

    public final e zzc(String str) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 3) {
                e zzg2 = zzfzt.zzg(new zzdyo(2));
                return zzg2;
            } else if (this.zzc) {
                zzcbl zzcbl = this.zza;
                return zzcbl;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new zzdye(this), zzcbg.zzf);
                zzcbl zzcbl2 = this.zza;
                return zzcbl2;
            }
        }
    }
}
