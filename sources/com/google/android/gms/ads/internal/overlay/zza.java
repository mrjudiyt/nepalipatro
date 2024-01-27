package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcat;
import com.google.firebase.sessions.settings.RemoteSettings;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzz zzz, zzx zzx, boolean z10) {
        if (z10) {
            return zzc(context, intent.getData(), zzz, zzx);
        }
        try {
            String uri = intent.toURI();
            zze.zza("Launching an intent: " + uri);
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzS(context, intent);
            if (zzz != null) {
                zzz.zzg();
            }
            if (zzx != null) {
                zzx.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            zzcat.zzj(e10.getMessage());
            if (zzx != null) {
                zzx.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzc, zzz zzz, zzx zzx) {
        int i10 = 0;
        if (zzc == null) {
            zzcat.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbci.zza(context);
        Intent intent = zzc.zzh;
        if (intent != null) {
            return zza(context, intent, zzz, zzx, zzc.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzc.zzb)) {
            zzcat.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzc.zzc)) {
            String str = zzc.zzb;
            intent2.setDataAndType(Uri.parse(str), zzc.zzc);
        } else {
            intent2.setData(Uri.parse(zzc.zzb));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzc.zzd)) {
            intent2.setPackage(zzc.zzd);
        }
        if (!TextUtils.isEmpty(zzc.zze)) {
            String[] split = zzc.zze.split(RemoteSettings.FORWARD_SLASH_STRING, 2);
            if (split.length < 2) {
                zzcat.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(zzc.zze)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str2 = zzc.zzf;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i10 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                zzcat.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzer)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzeq)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzo(context, intent2);
            }
        }
        return zza(context, intent2, zzz, zzx, zzc.zzj);
    }

    private static final boolean zzc(Context context, Uri uri, zzz zzz, zzx zzx) {
        int i10;
        try {
            i10 = zzt.zzp().zzm(context, uri);
            if (zzz != null) {
                zzz.zzg();
            }
        } catch (ActivityNotFoundException e10) {
            zzcat.zzj(e10.getMessage());
            i10 = 6;
        }
        if (zzx != null) {
            zzx.zzb(i10);
        }
        return i10 == 5;
    }
}
