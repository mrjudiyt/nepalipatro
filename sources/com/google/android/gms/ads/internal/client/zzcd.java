package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbzk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzcd extends zzaun implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                zzbox zzf = zzbow.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzauo.zzc(parcel);
                zzbu zzd = zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzauo.zza(parcel, zzq.CREATOR), readString, zzf, readInt);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzd);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbox zzf2 = zzbow.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbu zze = zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzauo.zza(parcel, zzq.CREATOR), readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbox zzf3 = zzbow.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbq zzb = zzb(asInterface, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, (IInterface) null);
                return true;
            case 5:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzbfs zzi = zzi(asInterface2, asInterface3);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzi);
                return true;
            case 6:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf4 = zzbow.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbvz zzn = zzn(asInterface4, zzf4, readInt4);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, (IInterface) null);
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzbsv zzm = zzm(asInterface5);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzm);
                return true;
            case 9:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzauo.zzc(parcel);
                zzco zzg = zzg(asInterface6, readInt5);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzg);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbu zzf5 = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzauo.zza(parcel, zzq.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzbfy zzj = zzj(asInterface7, asInterface8, asInterface9);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzj);
                return true;
            case 12:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbox zzf6 = zzbow.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbwp zzo = zzo(asInterface10, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzo);
                return true;
            case 13:
                String readString6 = parcel.readString();
                zzbox zzf7 = zzbow.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbu zzc = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzauo.zza(parcel, zzq.CREATOR), readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf8 = zzbow.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbzk zzp = zzp(asInterface11, zzf8, readInt9);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzp);
                return true;
            case 15:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf9 = zzbow.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbso zzl = zzl(asInterface12, zzf9, readInt10);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzl);
                return true;
            case 16:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf10 = zzbow.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbkh zzc2 = zzbkg.zzc(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzbkk zzk = zzk(asInterface13, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzk);
                return true;
            case 17:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf11 = zzbow.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzauo.zzc(parcel);
                zzdj zzh = zzh(asInterface14, zzf11, readInt12);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}
