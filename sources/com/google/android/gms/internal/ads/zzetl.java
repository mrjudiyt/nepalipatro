package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzetl implements zzetw {
    private final zzgad zza;
    private final Context zzb;
    private final zzcaz zzc;
    private final String zzd;

    zzetl(zzgad zzgad, Context context, zzcaz zzcaz, String str) {
        this.zza = zzgad;
        this.zzb = context;
        this.zzc = zzcaz;
        this.zzd = str;
    }

    public final int zza() {
        return 35;
    }

    public final e zzb() {
        return this.zza.zzb(new zzetk(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetm zzc() {
        int i10;
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        zzt.zzp();
        boolean zzD = com.google.android.gms.ads.internal.util.zzt.zzD(this.zzb);
        String str = this.zzc.zza;
        zzt.zzp();
        boolean zzE = com.google.android.gms.ads.internal.util.zzt.zzE();
        zzt.zzp();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        if (applicationInfo == null) {
            i10 = 0;
        } else {
            i10 = applicationInfo.targetSdkVersion;
        }
        Context context = this.zzb;
        String str2 = this.zzd;
        return new zzetm(isCallerInstantApp, zzD, str, zzE, i10, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), str2);
    }
}
