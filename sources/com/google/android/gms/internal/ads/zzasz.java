package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzasz extends zzaud {
    private final Activity zzi;
    private final View zzj;

    public zzasz(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11, View view, Activity activity) {
        super(zzasp, "XCj6cS5OVeEeObzd394PGDbjTuQh+vSye2UT6221ugsKtO2/oznWOSes2cnebrVR", "/UZ99NhZDGBVc8wZVXmC2wC/MG54XdFcRWhDAwHbwWE=", zzaom, i10, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        if (this.zzj != null) {
            boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbci.zzcr)).booleanValue();
            Object[] objArr = (Object[]) this.zzf.invoke((Object) null, new Object[]{this.zzj, this.zzi, Boolean.valueOf(booleanValue)});
            synchronized (this.zze) {
                this.zze.zzc(((Long) objArr[0]).longValue());
                this.zze.zze(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.zze.zzd((String) objArr[2]);
                }
            }
        }
    }
}
