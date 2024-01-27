package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfqu extends zzfrm {
    final /* synthetic */ zzfra zza;
    final /* synthetic */ zzfrd zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfqy zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfqu(zzfqy zzfqy, TaskCompletionSource taskCompletionSource, zzfra zzfra, zzfrd zzfrd, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfqy;
        this.zza = zzfra;
        this.zzb = zzfrd;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfri] */
    /* access modifiers changed from: protected */
    public final void zza() {
        try {
            ? zze = this.zzd.zza.zze();
            zzfqy zzfqy = this.zzd;
            String zzb2 = zzfqy.zzd;
            zzfra zzfra = this.zza;
            String zzb3 = zzfqy.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfra.zze());
            bundle.putString("adFieldEnifd", zzfra.zzf());
            bundle.putInt("layoutGravity", zzfra.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfra.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzfra.zzd());
            bundle.putString("deeplinkUrl", (String) null);
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", zzb3);
            if (zzfra.zzg() != null) {
                bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, zzfra.zzg());
            }
            zze.zzf(zzb2, bundle, new zzfqx(this.zzd, this.zzb));
        } catch (RemoteException e10) {
            zzfqy zzfqy2 = this.zzd;
            zzfqy.zzb.zzb(e10, "show overlay display from: %s", zzfqy2.zzd);
            this.zzc.trySetException(new RuntimeException(e10));
        }
    }
}
