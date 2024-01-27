package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            boolean zzf = zzc.zzf(parcel);
            zzc.zzc(parcel);
            zzb(zzf);
        } else if (i10 != 2) {
            return false;
        } else {
            zzc.zzc(parcel);
            zzc((Status) zzc.zza(parcel, Status.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
