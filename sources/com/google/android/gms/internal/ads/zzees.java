package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.b;
import com.google.android.gms.ads.MobileAds;
import com.google.common.util.concurrent.e;
import x0.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzees {
    private final Context zza;

    zzees(Context context) {
        this.zza = context;
    }

    public final e zza(boolean z10) {
        b a10 = new b.a().b(MobileAds.ERROR_DOMAIN).c(z10).a();
        a a11 = a.a(this.zza);
        if (a11 != null) {
            return a11.b(a10);
        }
        return zzfzt.zzg(new IllegalStateException());
    }
}
