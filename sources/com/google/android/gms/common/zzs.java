package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    private final zzj zzb;
    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    private final boolean zzd;

    @SafeParcelable.Constructor
    zzs(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z10, @SafeParcelable.Param(id = 4) boolean z11) {
        byte[] bArr;
        this.zza = str;
        zzk zzk = null;
        if (iBinder != null) {
            try {
                IObjectWrapper zzd2 = zzz.zzg(iBinder).zzd();
                if (zzd2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) ObjectWrapper.unwrap(zzd2);
                }
                if (bArr != null) {
                    zzk = new zzk(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.zzb = zzk;
        this.zzc = z10;
        this.zzd = z11;
    }

    zzs(String str, zzj zzj, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = zzj;
        this.zzc = z10;
        this.zzd = z11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        zzj zzj = this.zzb;
        if (zzj == null) {
            zzj = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
