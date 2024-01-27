package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzamj;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzanm;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcbl;
import com.google.common.util.concurrent.e;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbq {
    @Deprecated
    public static final zzbl zza = new zzbi();
    private static zzamj zzb;
    private static final Object zzc = new Object();

    public zzbq(Context context) {
        zzamj zzamj;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbci.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) zzba.zzc().zzb(zzbci.zzen)).booleanValue()) {
                        zzamj = zzaz.zzb(context);
                        zzb = zzamj;
                    }
                }
                zzamj = zzanm.zza(context, (zzamu) null);
                zzb = zzamj;
            }
        }
    }

    public final e zza(String str) {
        zzcbl zzcbl = new zzcbl();
        zzb.zza(new zzbp(str, (Map) null, zzcbl));
        return zzcbl;
    }

    public final e zzb(int i10, String str, Map map, byte[] bArr) {
        String str2 = str;
        zzbn zzbn = new zzbn((zzbm) null);
        zzbj zzbj = new zzbj(this, str2, zzbn);
        zzcas zzcas = new zzcas((String) null);
        zzbk zzbk = new zzbk(this, i10, str, zzbn, zzbj, bArr, map, zzcas);
        if (zzcas.zzk()) {
            try {
                zzcas.zzd(str2, "GET", zzbk.zzl(), zzbk.zzx());
            } catch (zzalo e10) {
                zzcat.zzj(e10.getMessage());
            }
        }
        zzb.zza(zzbk);
        return zzbn;
    }
}
