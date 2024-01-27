package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzafx implements zzbx {
    public static final Parcelable.Creator<zzafx> CREATOR = new zzafv();
    public final float zza;
    public final int zzb;

    public zzafx(float f10, int i10) {
        this.zza = f10;
        this.zzb = i10;
    }

    /* synthetic */ zzafx(Parcel parcel, zzafw zzafw) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafx.class == obj.getClass()) {
            zzafx zzafx = (zzafx) obj;
            return this.zza == zzafx.zza && this.zzb == zzafx.zzb;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    public final /* synthetic */ void zza(zzbt zzbt) {
    }
}
