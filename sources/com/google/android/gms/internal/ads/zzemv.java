package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzemv {
    private final zzena zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public zzdn zzc;

    public zzemv(zzena zzena, String str) {
        this.zza = zzena;
        this.zzb = str;
    }

    public final synchronized String zza() {
        String str;
        str = null;
        try {
            zzdn zzdn = this.zzc;
            if (zzdn != null) {
                str = zzdn.zzg();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return str;
    }

    public final synchronized String zzb() {
        String str;
        str = null;
        try {
            zzdn zzdn = this.zzc;
            if (zzdn != null) {
                str = zzdn.zzg();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return str;
    }

    public final synchronized void zzd(zzl zzl, int i10) {
        this.zzc = null;
        zzenb zzenb = new zzenb(i10);
        zzemu zzemu = new zzemu(this);
        this.zza.zzb(zzl, this.zzb, zzenb, zzemu);
    }

    public final synchronized boolean zze() {
        return this.zza.zza();
    }
}
