package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzeke implements zzcyu {
    boolean zza = false;
    final /* synthetic */ zzeex zzb;
    final /* synthetic */ zzcbl zzc;
    final /* synthetic */ zzekf zzd;

    zzeke(zzekf zzekf, zzeex zzeex, zzcbl zzcbl) {
        this.zzd = zzekf;
        this.zzb = zzeex;
        this.zzc = zzcbl;
    }

    private final synchronized void zze(zze zze) {
        int i10 = 1;
        if (true == ((Boolean) zzba.zzc().zzb(zzbci.zzfp)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zzd(new zzeey(i10, zze));
    }

    public final synchronized void zza(int i10) {
        if (!this.zza) {
            this.zza = true;
            zze(new zze(i10, zzekf.zze(this.zzb.zza, i10), AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzb(zze zze) {
        if (!this.zza) {
            this.zza = true;
            zze(zze);
        }
    }

    public final synchronized void zzc(int i10, String str) {
        if (!this.zza) {
            this.zza = true;
            if (str == null) {
                str = zzekf.zze(this.zzb.zza, i10);
            }
            zze(new zze(i10, str, AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzd() {
        this.zzc.zzc((Object) null);
    }
}
