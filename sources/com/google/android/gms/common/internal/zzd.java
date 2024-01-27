package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public final class zzd extends zzac {
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(BaseGmsClient baseGmsClient, int i10) {
        this.zza = baseGmsClient;
        this.zzb = i10;
    }

    public final void onPostInitComplete(int i10, IBinder iBinder, Bundle bundle) {
        Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(i10, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    public final void zzb(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void zzc(int i10, IBinder iBinder, zzk zzk) {
        BaseGmsClient baseGmsClient = this.zza;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzk);
        BaseGmsClient.zzj(baseGmsClient, zzk);
        onPostInitComplete(i10, iBinder, zzk.zza);
    }
}
