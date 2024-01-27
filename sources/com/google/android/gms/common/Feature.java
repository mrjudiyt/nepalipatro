package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getName", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getOldVersion", id = 2)
    @Deprecated
    private final int zzb;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getVersion", id = 3)
    private final long zzc;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) long j10) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = j10;
    }

    @KeepForSdk
    public Feature(String str, long j10) {
        this.zza = str;
        this.zzc = j10;
        this.zzb = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((getName() == null || !getName().equals(feature.getName())) && (getName() != null || feature.getName() != null)) || getVersion() != feature.getVersion()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @KeepForSdk
    public String getName() {
        return this.zza;
    }

    @KeepForSdk
    public long getVersion() {
        long j10 = this.zzc;
        return j10 == -1 ? (long) this.zzb : j10;
    }

    public final int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()));
    }

    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("name", getName());
        stringHelper.add(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, Long.valueOf(getVersion()));
        return stringHelper.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
