package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzesf implements zzetw, zzetv {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    zzesf(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    public final int zza() {
        return 29;
    }

    public final e zzb() {
        return zzfzt.zzh(this);
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num;
        Bundle bundle = (Bundle) obj;
        String str = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str2 = null;
        if (packageInfo == null) {
            num = null;
        } else {
            num = Integer.valueOf(packageInfo.versionCode);
        }
        bundle.putString("pn", str);
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        PackageInfo packageInfo2 = this.zzb;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
        try {
            Context context = this.zzc;
            String str3 = this.zza.packageName;
            zzfps zzfps = zzt.zza;
            bundle.putString("dl", String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str3)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
