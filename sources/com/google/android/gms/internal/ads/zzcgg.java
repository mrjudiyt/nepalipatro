package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcgg implements zzfzp {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzcgi zzd;

    zzcgg(zzcgi zzcgi, List list, String str, Uri uri) {
        this.zzd = zzcgi;
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
    }

    public final void zza(Throwable th) {
        zzcat.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.zzc)));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.zza;
        String str = this.zzb;
        this.zzd.zzP((Map) obj, list, str);
    }
}
