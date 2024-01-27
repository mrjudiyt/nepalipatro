package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfoa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoa> CREATOR = new zzfob();
    @SafeParcelable.VersionField(id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzapj zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    zzfoa(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzapj zzapj = this.zzb;
        if (zzapj == null && this.zzc != null) {
            return;
        }
        if (zzapj != null && this.zzc == null) {
            return;
        }
        if (zzapj != null && this.zzc != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (zzapj == null && this.zzc == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzax();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzapj zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzapj.zze(this.zzc, zzgtl.zza());
                this.zzc = null;
            } catch (zzgul | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.zzb;
    }
}
