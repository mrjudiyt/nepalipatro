package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;
import com.facebook.internal.NativeProtocol;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbdj {
    private f zza;
    private c zzb;
    private e zzc;
    private zzbdh zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzhbq.zza(context));
                }
            }
        }
        return false;
    }

    public final f zza() {
        c cVar = this.zzb;
        if (cVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = cVar.f((b) null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza2;
        if (this.zzb == null && (zza2 = zzhbq.zza(activity)) != null) {
            zzhbr zzhbr = new zzhbr(this);
            this.zzc = zzhbr;
            c.a(activity, zza2, zzhbr);
        }
    }

    public final void zzc(c cVar) {
        this.zzb = cVar;
        cVar.h(0);
        zzbdh zzbdh = this.zzd;
        if (zzbdh != null) {
            zzbdh.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbdh zzbdh) {
        this.zzd = zzbdh;
    }

    public final void zzf(Activity activity) {
        e eVar = this.zzc;
        if (eVar != null) {
            activity.unbindService(eVar);
            this.zzb = null;
            this.zza = null;
            this.zzc = null;
        }
    }
}
