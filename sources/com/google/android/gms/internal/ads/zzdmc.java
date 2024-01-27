package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdmc implements zzfsk {
    public final /* synthetic */ String zza;
    public final /* synthetic */ double zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzdmc(String str, double d10, int i10, int i11) {
        this.zza = str;
        this.zzb = d10;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final Object apply(Object obj) {
        return new zzbfa(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(this.zza), this.zzb, this.zzc, this.zzd);
    }
}
