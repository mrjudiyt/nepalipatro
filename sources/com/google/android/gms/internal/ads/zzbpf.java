package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbpf extends zzaun implements zzbpg {
    public zzbpf() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbpg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zzbpg ? (zzbpg) queryLocalInterface : new zzbpe(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            IObjectWrapper zze = zze();
            parcel2.writeNoException();
            zzauo.zzf(parcel2, zze);
        } else if (i10 != 2) {
            return false;
        } else {
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i12 = zzauo.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
