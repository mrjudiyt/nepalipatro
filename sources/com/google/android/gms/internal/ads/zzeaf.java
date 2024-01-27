package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzeaf implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzcbl zza = new zzcbl();
    protected boolean zzb = false;
    protected boolean zzc = false;
    protected zzbuj zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", new Object[]{Integer.valueOf(connectionResult.getErrorCode())});
        zzcat.zze(format);
        this.zza.zzd(new zzdyo(1, format));
    }

    public void onConnectionSuspended(int i10) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", new Object[]{Integer.valueOf(i10)});
        zzcat.zze(format);
        this.zza.zzd(new zzdyo(1, format));
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzb() {
        if (this.zzd == null) {
            this.zzd = new zzbuj(this.zze, this.zzf, this, this);
        }
        this.zzd.checkAvailabilityAndConnect();
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzc() {
        this.zzc = true;
        zzbuj zzbuj = this.zzd;
        if (zzbuj != null) {
            if (zzbuj.isConnected() || this.zzd.isConnecting()) {
                this.zzd.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
