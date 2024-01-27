package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzffh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzffh> CREATOR = new zzffi();
    public final Context zza;
    public final zzffe zzb;
    @SafeParcelable.Field(id = 2)
    public final int zzc;
    @SafeParcelable.Field(id = 3)
    public final int zzd;
    @SafeParcelable.Field(id = 4)
    public final int zze;
    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzffe[] zzh;
    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;
    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;
    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzffh(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i14, @SafeParcelable.Param(id = 7) int i15) {
        zzffe[] values = zzffe.values();
        this.zzh = values;
        int[] zza2 = zzfff.zza();
        this.zzl = zza2;
        int[] zza3 = zzffg.zza();
        this.zzm = zza3;
        this.zza = null;
        this.zzi = i10;
        this.zzb = values[i10];
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = str;
        this.zzj = i14;
        this.zzg = zza2[i14];
        this.zzk = i15;
        int i16 = zza3[i15];
    }

    public static zzffh zza(zzffe zzffe, Context context) {
        if (zzffe == zzffe.Rewarded) {
            return new zzffh(context, zzffe, ((Integer) zzba.zzc().zzb(zzbci.zzgp)).intValue(), ((Integer) zzba.zzc().zzb(zzbci.zzgv)).intValue(), ((Integer) zzba.zzc().zzb(zzbci.zzgx)).intValue(), (String) zzba.zzc().zzb(zzbci.zzgz), (String) zzba.zzc().zzb(zzbci.zzgr), (String) zzba.zzc().zzb(zzbci.zzgt));
        } else if (zzffe == zzffe.Interstitial) {
            return new zzffh(context, zzffe, ((Integer) zzba.zzc().zzb(zzbci.zzgq)).intValue(), ((Integer) zzba.zzc().zzb(zzbci.zzgw)).intValue(), ((Integer) zzba.zzc().zzb(zzbci.zzgy)).intValue(), (String) zzba.zzc().zzb(zzbci.zzgA), (String) zzba.zzc().zzb(zzbci.zzgs), (String) zzba.zzc().zzb(zzbci.zzgu));
        } else if (zzffe != zzffe.AppOpen) {
            return null;
        } else {
            return new zzffh(context, zzffe, ((Integer) zzba.zzc().zzb(zzbci.zzgD)).intValue(), ((Integer) zzba.zzc().zzb(zzbci.zzgF)).intValue(), ((Integer) zzba.zzc().zzb(zzbci.zzgG)).intValue(), (String) zzba.zzc().zzb(zzbci.zzgB), (String) zzba.zzc().zzb(zzbci.zzgC), (String) zzba.zzc().zzb(zzbci.zzgE));
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzffh(Context context, zzffe zzffe, int i10, int i11, int i12, String str, String str2, String str3) {
        this.zzh = zzffe.values();
        this.zzl = zzfff.zza();
        this.zzm = zzffg.zza();
        this.zza = context;
        this.zzi = zzffe.ordinal();
        this.zzb = zzffe;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        int i13 = 2;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i13 = 3;
        }
        this.zzg = i13;
        this.zzj = i13 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
