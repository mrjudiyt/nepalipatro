package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzdxz implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzcbl zza = new zzcbl();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbvg zze;
    protected zzbug zzf;

    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzcat.zze("Disconnected from remote ad request service.");
        this.zza.zzd(new zzdyo(1));
    }

    public final void onConnectionSuspended(int i10) {
        zzcat.zze("Cannot connect to remote service, fallback to local instance.");
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
