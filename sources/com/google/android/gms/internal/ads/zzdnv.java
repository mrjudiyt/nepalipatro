package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzdnv implements zza, zzbhz, zzo, zzbib, zzz {
    private zza zza;
    private zzbhz zzb;
    private zzo zzc;
    private zzbib zzd;
    private zzz zze;

    public final synchronized void onAdClicked() {
        zza zza2 = this.zza;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final synchronized void zza(String str, Bundle bundle) {
        zzbhz zzbhz = this.zzb;
        if (zzbhz != null) {
            zzbhz.zza(str, bundle);
        }
    }

    public final synchronized void zzb(String str, String str2) {
        zzbib zzbib = this.zzd;
        if (zzbib != null) {
            zzbib.zzb(str, str2);
        }
    }

    public final synchronized void zzbL() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbL();
        }
    }

    public final synchronized void zzbo() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbo();
        }
    }

    public final synchronized void zzbu() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbu();
        }
    }

    public final synchronized void zzbv() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbv();
        }
    }

    public final synchronized void zzbx() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbx();
        }
    }

    public final synchronized void zzby(int i10) {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzby(i10);
        }
    }

    public final synchronized void zzg() {
        zzz zzz = this.zze;
        if (zzz != null) {
            zzz.zzg();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzh(zza zza2, zzbhz zzbhz, zzo zzo, zzbib zzbib, zzz zzz) {
        this.zza = zza2;
        this.zzb = zzbhz;
        this.zzc = zzo;
        this.zzd = zzbib;
        this.zze = zzz;
    }
}
