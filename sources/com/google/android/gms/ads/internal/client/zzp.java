package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzcam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzp {
    public static final zzp zza = new zzp();

    protected zzp() {
    }

    public final zzl zza(Context context, zzdx zzdx) {
        List list;
        Context context2;
        String str;
        zzdx zzdx2 = zzdx;
        Date zzn = zzdx.zzn();
        long time = zzn != null ? zzn.getTime() : -1;
        String zzk = zzdx.zzk();
        int zza2 = zzdx.zza();
        Set zzq = zzdx.zzq();
        if (!zzq.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(zzq));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean zzs = zzdx2.zzs(context2);
        Bundle zzf = zzdx2.zzf(AdMobAdapter.class);
        String zzl = zzdx.zzl();
        SearchAdRequest zzi = zzdx.zzi();
        zzfh zzfh = zzi != null ? new zzfh(zzi) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzay.zzb();
            str = zzcam.zzq(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzr = zzdx.zzr();
        RequestConfiguration zzc = zzej.zzf().zzc();
        return new zzl(8, time, zzf, zza2, list, zzs, Math.max(zzdx.zzc(), zzc.getTagForChildDirectedTreatment()), false, zzl, zzfh, (Location) null, zzk, zzdx.zzg(), zzdx.zze(), Collections.unmodifiableList(new ArrayList(zzdx.zzp())), zzdx.zzm(), str, zzr, (zzc) null, zzc.getTagForUnderAgeOfConsent(), (String) Collections.max(Arrays.asList(new String[]{null, zzc.getMaxAdContentRating()}), zzo.zza), zzdx.zzo(), zzdx.zzb(), zzdx.zzj(), zzc.getPublisherPrivacyPersonalizationState().getValue());
    }
}
