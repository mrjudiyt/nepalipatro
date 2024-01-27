package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzcai;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public class QueryInfo {
    private final zzem zza;

    public QueryInfo(zzem zzem) {
        this.zza = zzem;
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zza(context, adFormat, adRequest, (String) null, queryInfoGenerationCallback);
    }

    private static void zza(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzdx zzdx;
        zzbci.zza(context);
        if (((Boolean) zzbdz.zzk.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                zzcai.zzb.execute(new zza(context, adFormat, adRequest, str, queryInfoGenerationCallback));
                return;
            }
        }
        if (adRequest == null) {
            zzdx = null;
        } else {
            zzdx = adRequest.zza();
        }
        new zzbtm(context, adFormat, zzdx, str).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    @KeepForSdk
    public String getRequestId() {
        return this.zza.zzc();
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        zza(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}
