package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public final class zzt extends zza {
    zzt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
    }

    public final void zzc(zzv zzv, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        Parcel zza = zza();
        zzc.zze(zza, zzv);
        zzc.zzd(zza, sourceStartDirectTransferOptions);
        zzc.zzd(zza, parcelFileDescriptor);
        zzc.zzd(zza, parcelFileDescriptor2);
        zzb(1, zza);
    }
}
