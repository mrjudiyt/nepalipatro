package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzcax {
    public static Context zza(Context context) {
        return zzc(context).getModuleContext();
    }

    public static Object zzb(Context context, String str, zzcav zzcav) {
        try {
            return zzcav.zza(zzc(context).instantiate(str));
        } catch (Exception e10) {
            throw new zzcaw(e10);
        }
    }

    private static DynamiteModule zzc(Context context) {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e10) {
            throw new zzcaw(e10);
        }
    }
}
