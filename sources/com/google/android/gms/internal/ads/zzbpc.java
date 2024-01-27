package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbpc extends zzaun implements zzbpd {
    public zzbpc() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbpd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbpd ? (zzbpd) queryLocalInterface : new zzbpb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzauo.zzc(parcel);
                zzg(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbph) {
                        zzbph zzbph = (zzbph) queryLocalInterface;
                    }
                }
                zzauo.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzauo.zzc(parcel);
                zzq(readString, readString2);
                break;
            case 10:
                zzbgh.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzauo.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzauo.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzauo.zzc(parcel);
                zzs((zzbwi) zzauo.zza(parcel, zzbwi.CREATOR));
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzbwm zzb = zzbwl.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzt(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzauo.zzc(parcel);
                zzj(readInt2);
                break;
            case 18:
                zzu();
                break;
            case 19:
                Bundle bundle = (Bundle) zzauo.zza(parcel, Bundle.CREATOR);
                zzauo.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzauo.zzc(parcel);
                zzl(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzauo.zzc(parcel);
                zzi(readInt3, readString4);
                break;
            case 23:
                zzauo.zzc(parcel);
                zzh((zze) zzauo.zza(parcel, zze.CREATOR));
                break;
            case 24:
                zzauo.zzc(parcel);
                zzk((zze) zzauo.zza(parcel, zze.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
