package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzhbq;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzo implements zzbdh {
    final /* synthetic */ zzbdj zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    zzo(zzt zzt, zzbdj zzbdj, Context context, Uri uri) {
        this.zza = zzbdj;
        this.zzb = context;
        this.zzc = uri;
    }

    public final void zza() {
        d b10 = new d.b(this.zza.zza()).b();
        b10.f1357a.setPackage(zzhbq.zza(this.zzb));
        b10.a(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
