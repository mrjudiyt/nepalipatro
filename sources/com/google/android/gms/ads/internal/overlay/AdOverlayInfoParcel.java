package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzcxy;
import com.google.android.gms.internal.ads.zzdfd;

@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    @SafeParcelable.Field(id = 2)
    public final zzc zza;
    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final zza zzb;
    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final zzo zzc;
    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final zzcgb zzd;
    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final zzbib zze;
    @SafeParcelable.Field(id = 7)
    public final String zzf;
    @SafeParcelable.Field(id = 8)
    public final boolean zzg;
    @SafeParcelable.Field(id = 9)
    public final String zzh;
    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzz zzi;
    @SafeParcelable.Field(id = 11)
    public final int zzj;
    @SafeParcelable.Field(id = 12)
    public final int zzk;
    @SafeParcelable.Field(id = 13)
    public final String zzl;
    @SafeParcelable.Field(id = 14)
    public final zzcaz zzm;
    @SafeParcelable.Field(id = 16)
    public final String zzn;
    @SafeParcelable.Field(id = 17)
    public final zzj zzo;
    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final zzbhz zzp;
    @SafeParcelable.Field(id = 19)
    public final String zzq;
    @SafeParcelable.Field(id = 24)
    public final String zzr;
    @SafeParcelable.Field(id = 25)
    public final String zzs;
    @SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", id = 26, type = "android.os.IBinder")
    public final zzcxy zzt;
    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", id = 27, type = "android.os.IBinder")
    public final zzdfd zzu;
    @SafeParcelable.Field(getter = "getOfflineUtilsAsBinder", id = 28, type = "android.os.IBinder")
    public final zzbso zzv;
    @SafeParcelable.Field(id = 29)
    public final boolean zzw;

    public AdOverlayInfoParcel(zza zza2, zzo zzo2, zzbhz zzbhz, zzbib zzbib, zzz zzz, zzcgb zzcgb, boolean z10, int i10, String str, zzcaz zzcaz, zzdfd zzdfd, zzbso zzbso, boolean z11) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzo2;
        this.zzd = zzcgb;
        this.zzp = zzbhz;
        this.zze = zzbib;
        this.zzf = null;
        this.zzg = z10;
        this.zzh = null;
        this.zzi = zzz;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzcaz;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdfd;
        this.zzv = zzbso;
        this.zzw = z11;
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        zzc zzc2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzc2, i10, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i10, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i10, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        SafeParcelWriter.writeIBinder(parcel, 26, ObjectWrapper.wrap(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 27, ObjectWrapper.wrap(this.zzu).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 28, ObjectWrapper.wrap(this.zzv).asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AdOverlayInfoParcel(zza zza2, zzo zzo2, zzbhz zzbhz, zzbib zzbib, zzz zzz, zzcgb zzcgb, boolean z10, int i10, String str, String str2, zzcaz zzcaz, zzdfd zzdfd, zzbso zzbso) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzo2;
        this.zzd = zzcgb;
        this.zzp = zzbhz;
        this.zze = zzbib;
        this.zzf = str2;
        this.zzg = z10;
        this.zzh = str;
        this.zzi = zzz;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzcaz;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdfd;
        this.zzv = zzbso;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zza zza2, zzo zzo2, zzz zzz, zzcgb zzcgb, int i10, zzcaz zzcaz, String str, zzj zzj2, String str2, String str3, String str4, zzcxy zzcxy, zzbso zzbso) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzo2;
        this.zzd = zzcgb;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzaH)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i10;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzcaz;
        this.zzn = str;
        this.zzo = zzj2;
        this.zzq = null;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzcxy;
        this.zzu = null;
        this.zzv = zzbso;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zza zza2, zzo zzo2, zzz zzz, zzcgb zzcgb, boolean z10, int i10, zzcaz zzcaz, zzdfd zzdfd, zzbso zzbso) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzo2;
        this.zzd = zzcgb;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z10;
        this.zzh = null;
        this.zzi = zzz;
        this.zzj = i10;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzcaz;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdfd;
        this.zzv = zzbso;
        this.zzw = false;
    }

    @SafeParcelable.Constructor
    AdOverlayInfoParcel(@SafeParcelable.Param(id = 2) zzc zzc2, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2, @SafeParcelable.Param(id = 5) IBinder iBinder3, @SafeParcelable.Param(id = 6) IBinder iBinder4, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) boolean z10, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) IBinder iBinder5, @SafeParcelable.Param(id = 11) int i10, @SafeParcelable.Param(id = 12) int i11, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) zzcaz zzcaz, @SafeParcelable.Param(id = 16) String str4, @SafeParcelable.Param(id = 17) zzj zzj2, @SafeParcelable.Param(id = 18) IBinder iBinder6, @SafeParcelable.Param(id = 19) String str5, @SafeParcelable.Param(id = 24) String str6, @SafeParcelable.Param(id = 25) String str7, @SafeParcelable.Param(id = 26) IBinder iBinder7, @SafeParcelable.Param(id = 27) IBinder iBinder8, @SafeParcelable.Param(id = 28) IBinder iBinder9, @SafeParcelable.Param(id = 29) boolean z11) {
        this.zza = zzc2;
        this.zzb = (zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzo) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcgb) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbhz) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbib) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzf = str;
        this.zzg = z10;
        this.zzh = str2;
        this.zzi = (zzz) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzj = i10;
        this.zzk = i11;
        this.zzl = str3;
        this.zzm = zzcaz;
        this.zzn = str4;
        this.zzo = zzj2;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzt = (zzcxy) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzu = (zzdfd) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzv = (zzbso) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
        this.zzw = z11;
    }

    public AdOverlayInfoParcel(zzc zzc2, zza zza2, zzo zzo2, zzz zzz, zzcaz zzcaz, zzcgb zzcgb, zzdfd zzdfd) {
        this.zza = zzc2;
        this.zzb = zza2;
        this.zzc = zzo2;
        this.zzd = zzcgb;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzz;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzcaz;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdfd;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzo zzo2, zzcgb zzcgb, int i10, zzcaz zzcaz) {
        this.zzc = zzo2;
        this.zzd = zzcgb;
        this.zzj = 1;
        this.zzm = zzcaz;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzcgb zzcgb, zzcaz zzcaz, String str, String str2, int i10, zzbso zzbso) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcgb;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzcaz;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbso;
        this.zzw = false;
    }
}
