package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzfj;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbhf;

@SafeParcelable.Class(creator = "AdManagerAdViewOptionsCreator")
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean zza;
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", id = 2)
    private final IBinder zzb;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zza = false;
        /* access modifiers changed from: private */
        public ShouldDelayBannerRenderingListener zzb;

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, (zzb) null);
        }

        public Builder setManualImpressionsEnabled(boolean z10) {
            this.zza = z10;
            return this;
        }

        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zzb = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzb2) {
        this.zza = builder.zza;
        this.zzb = builder.zzb != null ? new zzfj(builder.zzb) : null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzbhf zza() {
        IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        return zzbhe.zzc(iBinder);
    }

    @SafeParcelable.Constructor
    AdManagerAdViewOptions(@SafeParcelable.Param(id = 1) boolean z10, @SafeParcelable.Param(id = 2) IBinder iBinder) {
        this.zza = z10;
        this.zzb = iBinder;
    }
}
