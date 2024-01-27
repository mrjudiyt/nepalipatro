package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfrv implements ServiceConnection {
    final /* synthetic */ zzfrw zza;

    /* synthetic */ zzfrv(zzfrw zzfrw, zzfru zzfru) {
        this.zza = zzfrw;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zza.zzc.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.zza.zzc().post(new zzfrs(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zzc.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.zza.zzc().post(new zzfrt(this));
    }
}
