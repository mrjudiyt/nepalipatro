package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzftc extends zzfth {
    final /* synthetic */ zzftd zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzftc(zzftd zzftd, zzftj zzftj, CharSequence charSequence) {
        super(zzftj, charSequence);
        this.zza = zzftd;
    }

    /* access modifiers changed from: package-private */
    public final int zzc(int i10) {
        return i10 + 1;
    }

    /* access modifiers changed from: package-private */
    public final int zzd(int i10) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfsw.zzb(i10, length, FirebaseAnalytics.Param.INDEX);
        while (i10 < length) {
            zzftd zzftd = this.zza;
            if (zzftd.zza.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
