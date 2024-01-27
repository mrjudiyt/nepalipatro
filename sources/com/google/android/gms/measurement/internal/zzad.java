package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzag();
    @SafeParcelable.Field(id = 2)
    public String zza;
    @SafeParcelable.Field(id = 3)
    public String zzb;
    @SafeParcelable.Field(id = 4)
    public zznc zzc;
    @SafeParcelable.Field(id = 5)
    public long zzd;
    @SafeParcelable.Field(id = 6)
    public boolean zze;
    @SafeParcelable.Field(id = 7)
    public String zzf;
    @SafeParcelable.Field(id = 8)
    public zzbg zzg;
    @SafeParcelable.Field(id = 9)
    public long zzh;
    @SafeParcelable.Field(id = 10)
    public zzbg zzi;
    @SafeParcelable.Field(id = 11)
    public long zzj;
    @SafeParcelable.Field(id = 12)
    public zzbg zzk;

    zzad(zzad zzad) {
        Preconditions.checkNotNull(zzad);
        this.zza = zzad.zza;
        this.zzb = zzad.zzb;
        this.zzc = zzad.zzc;
        this.zzd = zzad.zzd;
        this.zze = zzad.zze;
        this.zzf = zzad.zzf;
        this.zzg = zzad.zzg;
        this.zzh = zzad.zzh;
        this.zzi = zzad.zzi;
        this.zzj = zzad.zzj;
        this.zzk = zzad.zzk;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i10, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i10, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i10, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzad(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zznc zznc, @SafeParcelable.Param(id = 5) long j10, @SafeParcelable.Param(id = 6) boolean z10, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) zzbg zzbg, @SafeParcelable.Param(id = 9) long j11, @SafeParcelable.Param(id = 10) zzbg zzbg2, @SafeParcelable.Param(id = 11) long j12, @SafeParcelable.Param(id = 12) zzbg zzbg3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zznc;
        this.zzd = j10;
        this.zze = z10;
        this.zzf = str3;
        this.zzg = zzbg;
        this.zzh = j11;
        this.zzi = zzbg2;
        this.zzj = j12;
        this.zzk = zzbg3;
    }
}
