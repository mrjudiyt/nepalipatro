package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcob implements zzcnl {
    private final Context zza;
    private final zzg zzb = zzt.zzo().zzh();

    public zzcob(Context context) {
        this.zza = context;
    }

    public final void zza(Map map) {
        if (!map.isEmpty()) {
            String str = (String) map.get("gad_idless");
            if (str != null) {
                zzg zzg = this.zzb;
                boolean parseBoolean = Boolean.parseBoolean(str);
                zzg.zzH(parseBoolean);
                if (parseBoolean) {
                    Context context = this.zza;
                    if (((Boolean) zzba.zzc().zzb(zzbci.zzgf)).booleanValue()) {
                        context.deleteDatabase("OfflineUpload.db");
                    }
                    try {
                        zzfpw zzj = zzfpw.zzj(context);
                        zzfpx zzi = zzfpx.zzi(context);
                        zzj.zzk();
                        zzj.zzl();
                        zzi.zzj();
                        if (((Boolean) zzba.zzc().zzb(zzbci.zzcM)).booleanValue()) {
                            zzi.zzk();
                        }
                        if (((Boolean) zzba.zzc().zzb(zzbci.zzcN)).booleanValue()) {
                            zzi.zzl();
                        }
                    } catch (IOException e10) {
                        zzt.zzo().zzu(e10, "clearStorageOnIdlessMode");
                    }
                }
            }
            map.remove("gad_idless");
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            zzt.zzn().zzr(bundle);
        }
    }
}
