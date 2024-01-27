package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzey extends zzcn {
    private zzbln zza;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        zzbln zzbln = this.zza;
        if (zzbln != null) {
            try {
                zzbln.zzb(Collections.emptyList());
            } catch (RemoteException e10) {
                zzcat.zzk("Could not notify onComplete event.", e10);
            }
        }
    }

    public final float zze() {
        return 1.0f;
    }

    public final String zzf() {
        return "";
    }

    public final List zzg() {
        return Collections.emptyList();
    }

    public final void zzh(String str) {
    }

    public final void zzi() {
    }

    public final void zzj(boolean z10) {
    }

    public final void zzk() {
        zzcat.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzcam.zza.post(new zzex(this));
    }

    public final void zzl(String str, IObjectWrapper iObjectWrapper) {
    }

    public final void zzm(zzda zzda) {
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
    }

    public final void zzo(zzbox zzbox) {
    }

    public final void zzp(boolean z10) {
    }

    public final void zzq(float f10) {
    }

    public final void zzr(String str) {
    }

    public final void zzs(zzbln zzbln) {
        this.zza = zzbln;
    }

    public final void zzt(String str) {
    }

    public final void zzu(zzff zzff) {
    }

    public final boolean zzv() {
        return false;
    }
}
