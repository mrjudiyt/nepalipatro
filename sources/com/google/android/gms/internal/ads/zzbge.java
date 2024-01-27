package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbge extends zzaun implements zzbgf {
    public zzbge() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                IObjectWrapper zzg = zzg();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzg);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(zzm);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                zzbfo zze = zze();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zze);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzauo.zze(parcel2, zzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                zzdq zzc = zzc();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzc);
                return true;
            case 12:
                zzauo.zzc(parcel);
                zzo((Bundle) zzauo.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzauo.zzc(parcel);
                boolean zzq = zzq((Bundle) zzauo.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 14:
                zzauo.zzc(parcel);
                zzp((Bundle) zzauo.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzbfg zzd = zzd();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzd);
                return true;
            case 16:
                IObjectWrapper zzf = zzf();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzf);
                return true;
            case 17:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
