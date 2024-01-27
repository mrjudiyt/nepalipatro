package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzexh implements zzhbc {
    public static zzetz zza(Context context, zzbzq zzbzq, zzbzr zzbzr, Object obj, zzeux zzeux, zzewn zzewn, zzhaw zzhaw, zzhaw zzhaw2, zzhaw zzhaw3, zzhaw zzhaw4, zzhaw zzhaw5, zzhaw zzhaw6, zzhaw zzhaw7, zzhaw zzhaw8, zzhaw zzhaw9, Executor executor, zzfje zzfje, zzdso zzdso) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzewg) obj);
        zzeux zzeux2 = zzeux;
        hashSet.add(zzeux);
        zzewn zzewn2 = zzewn;
        hashSet.add(zzewn);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfG)).booleanValue()) {
            hashSet.add((zzetw) zzhaw.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfH)).booleanValue()) {
            hashSet.add((zzetw) zzhaw2.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfI)).booleanValue()) {
            hashSet.add((zzetw) zzhaw3.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfJ)).booleanValue()) {
            hashSet.add((zzetw) zzhaw4.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfN)).booleanValue()) {
            hashSet.add((zzetw) zzhaw6.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfO)).booleanValue()) {
            hashSet.add((zzetw) zzhaw7.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcF)).booleanValue()) {
            hashSet.add((zzetw) zzhaw9.zzb());
        }
        return new zzetz(context, executor, hashSet, zzfje, zzdso);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
