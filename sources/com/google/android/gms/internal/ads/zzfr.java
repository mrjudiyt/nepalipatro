package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfr implements zzbx {
    public static final Parcelable.Creator<zzfr> CREATOR = new zzfp();
    public final float zza;
    public final float zzb;

    public zzfr(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        zzdx.zze(z10, "Invalid latitude or longitude");
        this.zza = f10;
        this.zzb = f11;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfr.class == obj.getClass()) {
            zzfr zzfr = (zzfr) obj;
            return this.zza == zzfr.zza && this.zzb == zzfr.zzb;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + Float.valueOf(this.zzb).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    public final /* synthetic */ void zza(zzbt zzbt) {
    }

    /* synthetic */ zzfr(Parcel parcel, zzfq zzfq) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }
}
