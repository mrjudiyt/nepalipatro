package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public final class zzn extends zza {
    zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    public final void zzc(zzg zzg, String str) {
        Parcel zza = zza();
        zzc.zze(zza, zzg);
        zza.writeString(str);
        zzb(4, zza);
    }

    public final void zzd(zzm zzm, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        Parcel zza = zza();
        zzc.zze(zza, zzm);
        zzc.zzd(zza, browserPublicKeyCredentialCreationOptions);
        zzb(1, zza);
    }

    public final void zze(zzm zzm, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        Parcel zza = zza();
        zzc.zze(zza, zzm);
        zzc.zzd(zza, browserPublicKeyCredentialRequestOptions);
        zzb(2, zza);
    }

    public final void zzf(zze zze) {
        Parcel zza = zza();
        zzc.zze(zza, zze);
        zzb(3, zza);
    }
}
