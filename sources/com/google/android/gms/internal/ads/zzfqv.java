package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfqv extends zzfrm {
    final /* synthetic */ zzfqp zza;
    final /* synthetic */ zzfrd zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfqy zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfqv(zzfqy zzfqy, TaskCompletionSource taskCompletionSource, zzfqp zzfqp, zzfrd zzfrd, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfqy;
        this.zza = zzfqp;
        this.zzb = zzfrd;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfri] */
    /* access modifiers changed from: protected */
    public final void zza() {
        try {
            ? zze = this.zzd.zza.zze();
            zzfqp zzfqp = this.zza;
            String zzb2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfqp.zzb());
            bundle.putString("callerPackage", zzb2);
            bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, zzfqp.zza());
            zze.zze(bundle, new zzfqx(this.zzd, this.zzb));
        } catch (RemoteException e10) {
            zzfqy zzfqy = this.zzd;
            zzfqy.zzb.zzb(e10, "dismiss overlay display from: %s", zzfqy.zzd);
            this.zzc.trySetException(new RuntimeException(e10));
        }
    }
}
