package com.google.android.gms.auth;

import android.os.IBinder;
import com.google.android.gms.internal.auth.zze;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
final class zzi implements zzk {
    final /* synthetic */ AccountChangeEventsRequest zza;

    zzi(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = accountChangeEventsRequest;
    }

    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) {
        AccountChangeEventsResponse zzh = zze.zzb(iBinder).zzh(this.zza);
        Object unused = zzl.zzj(zzh);
        return zzh.getEvents();
    }
}
