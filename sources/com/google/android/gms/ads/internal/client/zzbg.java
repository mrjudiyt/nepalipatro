package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbg extends zzaun implements zzbh {
    public zzbg() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                zzd();
                break;
            case 2:
                int readInt = parcel.readInt();
                zzauo.zzc(parcel);
                zze(readInt);
                break;
            case 3:
                break;
            case 4:
                zzi();
                break;
            case 5:
                zzj();
                break;
            case 6:
                zzc();
                break;
            case 7:
                zzg();
                break;
            case 8:
                zzauo.zzc(parcel);
                zzf((zze) zzauo.zza(parcel, zze.CREATOR));
                break;
            case 9:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
