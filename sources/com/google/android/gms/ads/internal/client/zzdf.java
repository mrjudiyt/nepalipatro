package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzdf extends zzaun implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzdg ? (zzdg) queryLocalInterface : new zzde(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzauo.zzc(parcel);
            zze((zzs) zzauo.zza(parcel, zzs.CREATOR));
            parcel2.writeNoException();
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
