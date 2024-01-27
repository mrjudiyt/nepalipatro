package com.google.android.gms.fido.sourcedevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "SourceStartDirectTransferOptionsCreator")
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public class SourceStartDirectTransferOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final int CALLER_TYPE_BROWSER = 2;
    public static final int CALLER_TYPE_UNKNOWN = 0;
    public static final Parcelable.Creator<SourceStartDirectTransferOptions> CREATOR = new zzb();
    @SafeParcelable.Field(defaultValueUnchecked = "SourceStartDirectTransferOptions.CALLER_TYPE_UNKNOWN", getter = "getCallerType", id = 1)
    private int zza;
    @SafeParcelable.Field(defaultValueUnchecked = "false", getter = "getIsUserPresenceVerified", id = 2)
    private boolean zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getAccountListForAuthentication", id = 3)
    private List zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "false", getter = "getIsUserVerified", id = 4)
    private boolean zzd;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getUserVerificationOrigin", id = 5)
    private String zze;

    public SourceStartDirectTransferOptions(int i10) {
        this.zza = i10;
        this.zzb = false;
        this.zzd = false;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public SourceStartDirectTransferOptions(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) boolean z10, @SafeParcelable.Param(id = 3) List list, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) String str) {
        this.zza = i10;
        this.zzb = z10;
        this.zzc = list;
        this.zzd = z11;
        this.zze = str;
    }
}
