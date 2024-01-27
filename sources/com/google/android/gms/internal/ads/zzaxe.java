package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;

@SafeParcelable.Class(creator = "CacheEntryParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaxe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaxe> CREATOR = new zzaxf();
    @SafeParcelable.Field(getter = "getContentFileDescriptor", id = 2)
    private ParcelFileDescriptor zza;
    @SafeParcelable.Field(getter = "hasAdditionalMetadataFromReadV2", id = 3)
    private final boolean zzb;
    @SafeParcelable.Field(getter = "isDownloaded", id = 4)
    private final boolean zzc;
    @SafeParcelable.Field(getter = "getCachedBytes", id = 5)
    private final long zzd;
    @SafeParcelable.Field(getter = "isGcacheHit", id = 6)
    private final boolean zze;

    public zzaxe() {
        this((ParcelFileDescriptor) null, false, false, 0, false);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzb(), i10, false);
        SafeParcelWriter.writeBoolean(parcel, 3, zzd());
        SafeParcelWriter.writeBoolean(parcel, 4, zzf());
        SafeParcelWriter.writeLong(parcel, 5, zza());
        SafeParcelWriter.writeBoolean(parcel, 6, zzg());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final synchronized long zza() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final synchronized ParcelFileDescriptor zzb() {
        return this.zza;
    }

    public final synchronized InputStream zzc() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zza != null;
    }

    public final synchronized boolean zzf() {
        return this.zzc;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }

    @SafeParcelable.Constructor
    public zzaxe(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 3) boolean z10, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) long j10, @SafeParcelable.Param(id = 6) boolean z12) {
        this.zza = parcelFileDescriptor;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = j10;
        this.zze = z12;
    }
}
