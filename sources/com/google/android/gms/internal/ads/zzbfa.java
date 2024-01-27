package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbfa extends zzbfn {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    public zzbfa(Drawable drawable, Uri uri, double d10, int i10, int i11) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d10;
        this.zzd = i10;
        this.zze = i11;
    }

    public final double zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final Uri zze() {
        return this.zzb;
    }

    public final IObjectWrapper zzf() {
        return ObjectWrapper.wrap(this.zza);
    }
}
