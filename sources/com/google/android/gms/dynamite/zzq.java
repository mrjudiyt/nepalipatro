package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public final class zzq extends zza {
    zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzg(IObjectWrapper iObjectWrapper, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, iObjectWrapper2);
        Parcel zzB = zzB(8, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(4, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, boolean z10, long j10) {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        Parcel zzB = zzB(7, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }
}
