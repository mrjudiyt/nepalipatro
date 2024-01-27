package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zznc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznc> CREATOR = new zznb();
    @SafeParcelable.Field(id = 2)
    public final String zza;
    @SafeParcelable.Field(id = 3)
    public final long zzb;
    @SafeParcelable.Field(id = 4)
    public final Long zzc;
    @SafeParcelable.Field(id = 6)
    public final String zzd;
    @SafeParcelable.Field(id = 7)
    public final String zze;
    @SafeParcelable.Field(id = 8)
    public final Double zzf;
    @SafeParcelable.Field(id = 1)
    private final int zzg;
    @SafeParcelable.Field(id = 5)
    private final Float zzh;

    zznc(zzne zzne) {
        this(zzne.zzc, zzne.zzd, zzne.zze, zzne.zzb);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzg);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeLongObject(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, (Float) null, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 7, this.zze, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Object zza() {
        Long l10 = this.zzc;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.zzf;
        if (d10 != null) {
            return d10;
        }
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        return null;
    }

    zznc(String str, long j10, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zzg = 2;
        this.zza = str;
        this.zzb = j10;
        this.zze = str2;
        if (obj == null) {
            this.zzc = null;
            this.zzh = null;
            this.zzf = null;
            this.zzd = null;
        } else if (obj instanceof Long) {
            this.zzc = (Long) obj;
            this.zzh = null;
            this.zzf = null;
            this.zzd = null;
        } else if (obj instanceof String) {
            this.zzc = null;
            this.zzh = null;
            this.zzf = null;
            this.zzd = (String) obj;
        } else if (obj instanceof Double) {
            this.zzc = null;
            this.zzh = null;
            this.zzf = (Double) obj;
            this.zzd = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    @SafeParcelable.Constructor
    zznc(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j10, @SafeParcelable.Param(id = 4) Long l10, @SafeParcelable.Param(id = 5) Float f10, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Double d10) {
        this.zzg = i10;
        this.zza = str;
        this.zzb = j10;
        this.zzc = l10;
        Double d11 = null;
        this.zzh = null;
        if (i10 == 1) {
            this.zzf = f10 != null ? Double.valueOf(f10.doubleValue()) : d11;
        } else {
            this.zzf = d10;
        }
        this.zzd = str2;
        this.zze = str3;
    }
}
