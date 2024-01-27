package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzamc;
import com.google.android.gms.internal.ads.zzamg;
import com.google.android.gms.internal.ads.zzamj;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzamv;
import com.google.android.gms.internal.ads.zzanc;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzcam;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaz extends zzamv {
    private final Context zzc;

    private zzaz(Context context, zzamu zzamu) {
        super(zzamu);
        this.zzc = context;
    }

    public static zzamj zzb(Context context) {
        zzamj zzamj = new zzamj(new zzanc(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzaz(context, new zzang()), 4);
        zzamj.zzd();
        return zzamj;
    }

    public final zzamc zza(zzamg zzamg) {
        if (zzamg.zza() == 0) {
            if (Pattern.matches((String) zzba.zzc().zzb(zzbci.zzeo), zzamg.zzk())) {
                Context context = this.zzc;
                zzay.zzb();
                if (zzcam.zzs(context, 13400000)) {
                    zzamc zza = new zzblf(this.zzc).zza(zzamg);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzamg.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzamg.zzk())));
                }
            }
        }
        return super.zza(zzamg);
    }
}
