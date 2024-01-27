package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfqw extends zzfrm {
    final /* synthetic */ zzfrf zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfrd zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfqy zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfqw(zzfqy zzfqy, TaskCompletionSource taskCompletionSource, zzfrf zzfrf, int i10, zzfrd zzfrd, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzfqy;
        this.zza = zzfrf;
        this.zzb = i10;
        this.zzc = zzfrd;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfri] */
    /* access modifiers changed from: protected */
    public final void zza() {
        try {
            ? zze2 = this.zze.zza.zze();
            zzfrf zzfrf = this.zza;
            String zzb2 = this.zze.zzd;
            int i10 = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfrf.zzb());
            bundle.putInt("displayMode", i10);
            bundle.putString("callerPackage", zzb2);
            bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, zzfrf.zza());
            zze2.zzg(bundle, new zzfqx(this.zze, this.zzc));
        } catch (RemoteException e10) {
            int i11 = this.zzb;
            zzfqy.zzb.zzb(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i11), this.zze.zzd);
            this.zzd.trySetException(new RuntimeException(e10));
        }
    }
}
