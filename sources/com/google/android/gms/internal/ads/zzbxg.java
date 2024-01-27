package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbxg extends zzbwl {
    private final String zza;
    private final int zzb;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzbxg(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public final int zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zza;
    }

    public zzbxg(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }
}
