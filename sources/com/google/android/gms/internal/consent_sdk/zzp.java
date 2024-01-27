package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import k6.a;
import k6.d;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final a zzc;
    private final d zzd;

    /* synthetic */ zzp(zzn zzn, Activity activity, a aVar, d dVar, zzo zzo) {
        this.zza = zzn;
        this.zzb = activity;
        this.zzc = aVar;
        this.zzd = dVar;
    }

    static /* bridge */ /* synthetic */ zzck zza(zzp zzp) {
        List list;
        String str;
        List list2;
        PackageInfo packageInfo;
        long j10;
        Window window;
        View view;
        WindowInsets windowInsets;
        DisplayCutout displayCutout;
        String zza2;
        Bundle bundle;
        zzck zzck = new zzck();
        String c10 = zzp.zzd.c();
        String str2 = null;
        if (TextUtils.isEmpty(c10)) {
            try {
                bundle = zzp.zza.zza.getPackageManager().getApplicationInfo(zzp.zza.zza.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                c10 = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(c10)) {
                throw new zzi(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzck.zza = c10;
        if (!zzp.zzd.b() && (zza2 = zzp.zza.zzb.zza()) != null) {
            zzck.zzb = zza2;
        }
        if (!zzp.zzc.b()) {
            list = Collections.emptyList();
        } else {
            list = new ArrayList();
            int a10 = zzp.zzc.a();
            if (a10 == 1) {
                list.add(zzcf.GEO_OVERRIDE_EEA);
            } else if (a10 == 2) {
                list.add(zzcf.GEO_OVERRIDE_NON_EEA);
            }
            list.add(zzcf.PREVIEWING_DEBUG_MESSAGES);
        }
        zzck.zzj = list;
        zzck.zzf = zzp.zza.zzc.zzc();
        zzck.zze = Boolean.valueOf(zzp.zzd.b());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            str = Locale.getDefault().toLanguageTag();
        } else {
            str = Locale.getDefault().toString();
        }
        zzck.zzd = str;
        zzcg zzcg = new zzcg();
        zzcg.zzb = Integer.valueOf(i10);
        zzcg.zza = Build.MODEL;
        zzcg.zzc = 2;
        zzck.zzc = zzcg;
        Configuration configuration = zzp.zza.zza.getResources().getConfiguration();
        zzp.zza.zza.getResources().getConfiguration();
        zzci zzci = new zzci();
        zzci.zza = Integer.valueOf(configuration.screenWidthDp);
        zzci.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzci.zzc = Double.valueOf((double) zzp.zza.zza.getResources().getDisplayMetrics().density);
        if (i10 < 28) {
            list2 = Collections.emptyList();
        } else {
            Activity activity = zzp.zzb;
            if (activity == null) {
                window = null;
            } else {
                window = activity.getWindow();
            }
            if (window == null) {
                view = null;
            } else {
                view = window.getDecorView();
            }
            if (view == null) {
                windowInsets = null;
            } else {
                windowInsets = view.getRootWindowInsets();
            }
            if (windowInsets == null) {
                displayCutout = null;
            } else {
                displayCutout = windowInsets.getDisplayCutout();
            }
            if (displayCutout == null) {
                list2 = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList = new ArrayList();
                for (Rect next : displayCutout.getBoundingRects()) {
                    if (next != null) {
                        zzch zzch = new zzch();
                        zzch.zzb = Integer.valueOf(next.left);
                        zzch.zzc = Integer.valueOf(next.right);
                        zzch.zza = Integer.valueOf(next.top);
                        zzch.zzd = Integer.valueOf(next.bottom);
                        arrayList.add(zzch);
                    }
                }
                list2 = arrayList;
            }
        }
        zzci.zzd = list2;
        zzck.zzg = zzci;
        zzn zzn = zzp.zza;
        Application zza3 = zzn.zza;
        try {
            packageInfo = zzn.zza.getPackageManager().getPackageInfo(zza3.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzce zzce = new zzce();
        zzce.zza = zza3.getPackageName();
        CharSequence applicationLabel = zzp.zza.zza.getPackageManager().getApplicationLabel(zzp.zza.zza.getApplicationInfo());
        if (applicationLabel != null) {
            str2 = applicationLabel.toString();
        }
        zzce.zzb = str2;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j10 = packageInfo.getLongVersionCode();
            } else {
                j10 = (long) packageInfo.versionCode;
            }
            zzce.zzc = Long.toString(j10);
        }
        zzck.zzh = zzce;
        zzcj zzcj = new zzcj();
        zzcj.zza = "2.1.0";
        zzck.zzi = zzcj;
        return zzck;
    }
}
