package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzauf implements PackageManager.OnChecksumsReadyListener {
    public final /* synthetic */ zzgal zza;

    public /* synthetic */ zzauf(zzgal zzgal) {
        this.zza = zzgal;
    }

    public final void onChecksumsReady(List list) {
        zzgal zzgal = this.zza;
        if (list == null) {
            zzgal.zzc((Object) null);
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i10);
                if (apkChecksum.getType() == 8) {
                    zzgal.zzc(zzass.zzb(apkChecksum.getValue()));
                    return;
                }
            }
            zzgal.zzc((Object) null);
        } catch (Throwable unused) {
            zzgal.zzc((Object) null);
        }
    }
}
